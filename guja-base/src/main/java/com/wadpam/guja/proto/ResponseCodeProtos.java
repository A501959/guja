// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response_code.proto

package com.wadpam.guja.proto;

/*
 * #%L
 * guja-base
 * %%
 * Copyright (C) 2014 Wadpam
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

public final class ResponseCodeProtos {
  private ResponseCodeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResponseCodeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:feeder.ResponseCode)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 response_code = 1;</code>
     */
    boolean hasResponseCode();
    /**
     * <code>optional int32 response_code = 1;</code>
     */
    int getResponseCode();
  }
  /**
   * Protobuf type {@code feeder.ResponseCode}
   */
  public static final class ResponseCode extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:feeder.ResponseCode)
      ResponseCodeOrBuilder {
    // Use ResponseCode.newBuilder() to construct.
    private ResponseCode(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ResponseCode(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ResponseCode defaultInstance;
    public static ResponseCode getDefaultInstance() {
      return defaultInstance;
    }

    public ResponseCode getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseCode(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              responseCode_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ResponseCodeProtos.internal_static_feeder_ResponseCode_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ResponseCodeProtos.internal_static_feeder_ResponseCode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseCodeProtos.ResponseCode.class, ResponseCodeProtos.ResponseCode.Builder.class);
    }

    public static com.google.protobuf.Parser<ResponseCode> PARSER =
        new com.google.protobuf.AbstractParser<ResponseCode>() {
      public ResponseCode parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseCode(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<ResponseCode> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int RESPONSE_CODE_FIELD_NUMBER = 1;
    private int responseCode_;
    /**
     * <code>optional int32 response_code = 1;</code>
     */
    public boolean hasResponseCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 response_code = 1;</code>
     */
    public int getResponseCode() {
      return responseCode_;
    }

    private void initFields() {
      responseCode_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, responseCode_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, responseCode_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ResponseCodeProtos.ResponseCode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseCodeProtos.ResponseCode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseCodeProtos.ResponseCode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseCodeProtos.ResponseCode parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseCodeProtos.ResponseCode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ResponseCodeProtos.ResponseCode parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ResponseCodeProtos.ResponseCode parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ResponseCodeProtos.ResponseCode parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ResponseCodeProtos.ResponseCode parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ResponseCodeProtos.ResponseCode parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ResponseCodeProtos.ResponseCode prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code feeder.ResponseCode}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:feeder.ResponseCode)
        ResponseCodeProtos.ResponseCodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ResponseCodeProtos.internal_static_feeder_ResponseCode_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ResponseCodeProtos.internal_static_feeder_ResponseCode_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseCodeProtos.ResponseCode.class, ResponseCodeProtos.ResponseCode.Builder.class);
      }

      // Construct using com.wadpam.guja.proto.ResponseCodeProtos.ResponseCode.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        responseCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ResponseCodeProtos.internal_static_feeder_ResponseCode_descriptor;
      }

      public ResponseCodeProtos.ResponseCode getDefaultInstanceForType() {
        return ResponseCodeProtos.ResponseCode.getDefaultInstance();
      }

      public ResponseCodeProtos.ResponseCode build() {
        ResponseCodeProtos.ResponseCode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ResponseCodeProtos.ResponseCode buildPartial() {
        ResponseCodeProtos.ResponseCode result = new ResponseCodeProtos.ResponseCode(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.responseCode_ = responseCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseCodeProtos.ResponseCode) {
          return mergeFrom((ResponseCodeProtos.ResponseCode)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseCodeProtos.ResponseCode other) {
        if (other == ResponseCodeProtos.ResponseCode.getDefaultInstance()) return this;
        if (other.hasResponseCode()) {
          setResponseCode(other.getResponseCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseCodeProtos.ResponseCode parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseCodeProtos.ResponseCode) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int responseCode_ ;
      /**
       * <code>optional int32 response_code = 1;</code>
       */
      public boolean hasResponseCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 response_code = 1;</code>
       */
      public int getResponseCode() {
        return responseCode_;
      }
      /**
       * <code>optional int32 response_code = 1;</code>
       */
      public Builder setResponseCode(int value) {
        bitField0_ |= 0x00000001;
        responseCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 response_code = 1;</code>
       */
      public Builder clearResponseCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        responseCode_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:feeder.ResponseCode)
    }

    static {
      defaultInstance = new ResponseCode(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:feeder.ResponseCode)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_feeder_ResponseCode_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_feeder_ResponseCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\023response_code.proto\022\006feeder\"%\n\014Respons" +
      "eCode\022\025\n\rresponse_code\030\001 \001(\005B+\n\025com.wadp" +
      "am.guja.protoB\022ResponseCodeProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_feeder_ResponseCode_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_feeder_ResponseCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_feeder_ResponseCode_descriptor,
        new String[] { "ResponseCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}