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
import us.hebi.quickbuf.RepeatedMessage;

public final class GetFriendRecommendListInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetFriendRecommendListInfoScRsp}
   */
  public static final class GetFriendRecommendListInfoScRsp extends ProtoMessage<GetFriendRecommendListInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <code>repeated .FriendRecommendInfo friend_recommend_list = 13;</code>
     */
    private final RepeatedMessage<FriendRecommendInfoOuterClass.FriendRecommendInfo> friendRecommendList = RepeatedMessage.newEmptyInstance(FriendRecommendInfoOuterClass.FriendRecommendInfo.getFactory());

    private GetFriendRecommendListInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetFriendRecommendListInfoScRsp}
     */
    public static GetFriendRecommendListInfoScRsp newInstance() {
      return new GetFriendRecommendListInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return this
     */
    public GetFriendRecommendListInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetFriendRecommendListInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .FriendRecommendInfo friend_recommend_list = 13;</code>
     * @return whether the friendRecommendList field is set
     */
    public boolean hasFriendRecommendList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .FriendRecommendInfo friend_recommend_list = 13;</code>
     * @return this
     */
    public GetFriendRecommendListInfoScRsp clearFriendRecommendList() {
      bitField0_ &= ~0x00000002;
      friendRecommendList.clear();
      return this;
    }

    /**
     * <code>repeated .FriendRecommendInfo friend_recommend_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFriendRecommendList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<FriendRecommendInfoOuterClass.FriendRecommendInfo> getFriendRecommendList(
        ) {
      return friendRecommendList;
    }

    /**
     * <code>repeated .FriendRecommendInfo friend_recommend_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<FriendRecommendInfoOuterClass.FriendRecommendInfo> getMutableFriendRecommendList(
        ) {
      bitField0_ |= 0x00000002;
      return friendRecommendList;
    }

    /**
     * <code>repeated .FriendRecommendInfo friend_recommend_list = 13;</code>
     * @param value the friendRecommendList to add
     * @return this
     */
    public GetFriendRecommendListInfoScRsp addFriendRecommendList(
        final FriendRecommendInfoOuterClass.FriendRecommendInfo value) {
      bitField0_ |= 0x00000002;
      friendRecommendList.add(value);
      return this;
    }

    /**
     * <code>repeated .FriendRecommendInfo friend_recommend_list = 13;</code>
     * @param values the friendRecommendList to add
     * @return this
     */
    public GetFriendRecommendListInfoScRsp addAllFriendRecommendList(
        final FriendRecommendInfoOuterClass.FriendRecommendInfo... values) {
      bitField0_ |= 0x00000002;
      friendRecommendList.addAll(values);
      return this;
    }

    @Override
    public GetFriendRecommendListInfoScRsp copyFrom(final GetFriendRecommendListInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        friendRecommendList.copyFrom(other.friendRecommendList);
      }
      return this;
    }

    @Override
    public GetFriendRecommendListInfoScRsp mergeFrom(final GetFriendRecommendListInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasFriendRecommendList()) {
        getMutableFriendRecommendList().addAll(other.friendRecommendList);
      }
      return this;
    }

    @Override
    public GetFriendRecommendListInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      friendRecommendList.clear();
      return this;
    }

    @Override
    public GetFriendRecommendListInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      friendRecommendList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetFriendRecommendListInfoScRsp)) {
        return false;
      }
      GetFriendRecommendListInfoScRsp other = (GetFriendRecommendListInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasFriendRecommendList() || friendRecommendList.equals(other.friendRecommendList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < friendRecommendList.length(); i++) {
          output.writeRawByte((byte) 106);
          output.writeMessageNoTag(friendRecommendList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * friendRecommendList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(friendRecommendList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetFriendRecommendListInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // friendRecommendList
            tag = input.readRepeatedMessage(friendRecommendList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.friendRecommendList, friendRecommendList);
      }
      output.endObject();
    }

    @Override
    public GetFriendRecommendListInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1367821692:
          case -194477566: {
            if (input.isAtField(FieldNames.friendRecommendList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(friendRecommendList);
                bitField0_ |= 0x00000002;
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
    public GetFriendRecommendListInfoScRsp clone() {
      return new GetFriendRecommendListInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetFriendRecommendListInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetFriendRecommendListInfoScRsp(), data).checkInitialized();
    }

    public static GetFriendRecommendListInfoScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetFriendRecommendListInfoScRsp(), input).checkInitialized();
    }

    public static GetFriendRecommendListInfoScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetFriendRecommendListInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetFriendRecommendListInfoScRsp messages
     */
    public static MessageFactory<GetFriendRecommendListInfoScRsp> getFactory() {
      return GetFriendRecommendListInfoScRspFactory.INSTANCE;
    }

    private enum GetFriendRecommendListInfoScRspFactory implements MessageFactory<GetFriendRecommendListInfoScRsp> {
      INSTANCE;

      @Override
      public GetFriendRecommendListInfoScRsp create() {
        return GetFriendRecommendListInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName friendRecommendList = FieldName.forField("friendRecommendList", "friend_recommend_list");
    }
  }
}
