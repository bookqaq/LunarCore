package main

import (
	"crypto/tls"
	"log"
	"net/http"
	"net/http/httputil"
	"net/url"
)

var addr = ":23300"

var remote, _ = url.Parse("http://127.0.0.1:23302")

func main() {
	cert, key, err := LoadOrCreateCA("./rail_key.pem", "./rail_ca.pem")
	if err != nil {
		panic(err)
	}

	tlsConfig, err := NewCertConfig(cert, key)
	if err != nil {
		panic(err)
	}

	proxy := &httputil.ReverseProxy{
		Director:       modifyRequest,
		ModifyResponse: modifyResponse,
	}

	tlsConn, err := tls.Listen("tcp", addr, tlsConfig.TLSConfig())
	if err != nil {
		panic(err)
	}

	log.Println("starting proxy on", addr)
	err = http.Serve(tlsConn, proxy)
	if err != nil {
		panic(err)
	}
}

func modifyRequest(r *http.Request) {
	// Setting `X-Forwarded-For` to `nil` ensures that http.ReverseProxy doesn't
	// set this header.
	// r.Header["X-Forwarded-For"] = nil

	// Strip unsupported encodings.
	// if acceptEncs := r.Header.Get("Accept-Encoding"); acceptEncs != "" {
	// 	directives := strings.Split(acceptEncs, ",")
	// 	updated := make([]string, 0, len(directives))

	// 	for _, directive := range directives {
	// 		stripped := strings.TrimSpace(directive)
	// 		if strings.HasPrefix(stripped, "*") || strings.HasPrefix(stripped, "gzip") {
	// 			updated = append(updated, stripped)
	// 		}
	// 	}

	// 	if len(updated) == 0 {
	// 		r.Header.Del("Accept-Encoding")
	// 	} else {
	// 		r.Header.Set("Accept-Encoding", strings.Join(updated, ", "))
	// 	}
	// }

	log.Println("[request]", r.Proto, r.Method, r.Host, r.URL.String())

	// redirect Host
	r.URL.Scheme = "http"
	r.Host = remote.Host
	r.URL.Host = remote.Host
}

func modifyResponse(r *http.Response) error {
	// log.Println("[response]", r.StatusCode, r.Proto, r.Request.Method, r.Request.Host, r.Request.URL.String())
	return nil
}
