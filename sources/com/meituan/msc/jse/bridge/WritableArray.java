package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface WritableArray extends ReadableArray {
    void pushArray(@Nullable ReadableArray readableArray);

    void pushArray(@Nullable WritableArray writableArray);

    void pushBoolean(boolean z);

    void pushDouble(double d);

    void pushInt(int i);

    void pushMap(@Nullable ReadableMap readableMap);

    void pushMap(@Nullable WritableMap writableMap);

    void pushNull();

    void pushString(@Nullable String str);
}
