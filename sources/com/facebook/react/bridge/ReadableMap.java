package com.facebook.react.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ReadableMap {
    @Nullable
    ReadableArray getArray(@NonNull String str);

    boolean getBoolean(@NonNull String str);

    double getDouble(@NonNull String str);

    @NonNull
    Dynamic getDynamic(@NonNull String str);

    @NonNull
    Iterator<Map.Entry<String, Object>> getEntryIterator();

    int getInt(@NonNull String str);

    @Nullable
    ReadableMap getMap(@NonNull String str);

    @Nullable
    String getString(@NonNull String str);

    @NonNull
    ReadableType getType(@NonNull String str);

    boolean hasKey(@NonNull String str);

    boolean isNull(@NonNull String str);

    @NonNull
    ReadableMapKeySetIterator keySetIterator();

    @NonNull
    HashMap<String, Object> toHashMap();
}
