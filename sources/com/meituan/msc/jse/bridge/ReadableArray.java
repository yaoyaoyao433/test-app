package com.meituan.msc.jse.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface ReadableArray {
    @Nullable
    ReadableArray getArray(int i);

    boolean getBoolean(int i);

    double getDouble(int i);

    @NonNull
    Dynamic getDynamic(int i);

    int getInt(int i);

    @Nullable
    ReadableMap getMap(int i);

    @Nullable
    String getString(int i);

    @NonNull
    ReadableType getType(int i);

    boolean isNull(int i);

    int size();

    @NonNull
    ArrayList<Object> toArrayList();
}
