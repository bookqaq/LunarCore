// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class HeadIconOuterClass {
  /**
   * Protobuf type {@code HeadIcon}
   */
  public static final class HeadIcon extends ProtoMessage<HeadIcon> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 id = 8;</code>
     */
    private int id;

    private HeadIcon() {
    }

    /**
     * @return a new empty instance of {@code HeadIcon}
     */
    public static HeadIcon newInstance() {
      return new HeadIcon();
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @return this
     */
    public HeadIcon clearId() {
      bitField0_ &= ~0x00000001;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @param value the id to set
     * @return this
     */
    public HeadIcon setId(final int value) {
      bitField0_ |= 0x00000001;
      id = value;
      return this;
    }

    @Override
    public HeadIcon copyFrom(final HeadIcon other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        id = other.id;
      }
      return this;
    }

    @Override
    public HeadIcon mergeFrom(final HeadIcon other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasId()) {
        setId(other.id);
      }
      return this;
    }

    @Override
    public HeadIcon clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      id = 0;
      return this;
    }

    @Override
    public HeadIcon clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof HeadIcon)) {
        return false;
      }
      HeadIcon other = (HeadIcon) o;
      return bitField0_ == other.bitField0_
        && (!hasId() || id == other.id);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(id);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public HeadIcon mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.id, id);
      }
      output.endObject();
    }

    @Override
    public HeadIcon mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public HeadIcon clone() {
      return new HeadIcon().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static HeadIcon parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new HeadIcon(), data).checkInitialized();
    }

    public static HeadIcon parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new HeadIcon(), input).checkInitialized();
    }

    public static HeadIcon parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new HeadIcon(), input).checkInitialized();
    }

    /**
     * @return factory for creating HeadIcon messages
     */
    public static MessageFactory<HeadIcon> getFactory() {
      return HeadIconFactory.INSTANCE;
    }

    private enum HeadIconFactory implements MessageFactory<HeadIcon> {
      INSTANCE;

      @Override
      public HeadIcon create() {
        return HeadIcon.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName id = FieldName.forField("id");
    }
  }
}
