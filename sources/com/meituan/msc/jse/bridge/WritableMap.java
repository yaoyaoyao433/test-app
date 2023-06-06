package com.meituan.msc.jse.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface WritableMap extends ReadableMap {
    WritableMap copy();

    void merge(@NonNull ReadableMap readableMap);

    void putArray(@NonNull String str, @Nullable ReadableArray readableArray);

    @Deprecated
    void putArray(@NonNull String str, @Nullable WritableArray writableArray);

    void putBoolean(@NonNull String str, boolean z);

    void putDouble(@NonNull String str, double d);

    void putInt(@NonNull String str, int i);

    void putMap(@NonNull String str, @Nullable ReadableMap readableMap);

    @Deprecated
    void putMap(@NonNull String str, @Nullable WritableMap writableMap);

    void putNull(@NonNull String str);

    void putString(@NonNull String str, @Nullable String str2);
}
