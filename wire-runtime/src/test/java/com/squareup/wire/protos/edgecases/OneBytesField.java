// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/edge_cases.proto
package com.squareup.wire.protos.edgecases;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

public final class OneBytesField extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_OPT_BYTES = ByteString.EMPTY;

  @ProtoField(
      tag = 1,
      type = Message.Datatype.BYTES
  )
  public final ByteString opt_bytes;

  public OneBytesField(ByteString opt_bytes) {
    this.opt_bytes = opt_bytes;
  }

  private OneBytesField(Builder builder) {
    this(builder.opt_bytes);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OneBytesField)) return false;
    return equals(opt_bytes, ((OneBytesField) other).opt_bytes);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = opt_bytes != null ? opt_bytes.hashCode() : 0);
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<OneBytesField> {
    public ByteString opt_bytes;

    public Builder() {
    }

    public Builder(OneBytesField message) {
      super(message);
      if (message == null) return;
      this.opt_bytes = message.opt_bytes;
    }

    public Builder opt_bytes(ByteString opt_bytes) {
      this.opt_bytes = opt_bytes;
      return this;
    }

    @Override
    public OneBytesField build() {
      return new OneBytesField(this);
    }
  }
}
