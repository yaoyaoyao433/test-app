package com.meituan.msc.jse.bridge;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface Dynamic {
    ReadableArray asArray();

    boolean asBoolean();

    double asDouble();

    int asInt();

    ReadableMap asMap();

    String asString();

    ReadableType getType();

    boolean isNull();

    void recycle();
}
