package com.facebook.react.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    private static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, WritableNativeArray writableNativeArray);

    private native void putNativeMap(String str, WritableNativeMap writableNativeMap);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putBoolean(@NonNull String str, boolean z);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putDouble(@NonNull String str, double d);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putInt(@NonNull String str, int i);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putNull(@NonNull String str);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putString(@NonNull String str, @Nullable String str2);

    static {
        ReactBridge.staticInit();
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(@NonNull String str, @Nullable ReadableMap readableMap) {
        a.a(readableMap == null || (readableMap instanceof WritableNativeMap), "Illegal type provided");
        putNativeMap(str, (WritableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(@NonNull String str, @Nullable ReadableArray readableArray) {
        a.a(readableArray == null || (readableArray instanceof WritableNativeArray), "Illegal type provided");
        putNativeArray(str, (WritableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(@NonNull ReadableMap readableMap) {
        a.a(readableMap instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public WritableMap copy() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(this);
        return writableNativeMap;
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(@NonNull String str, @Nullable WritableArray writableArray) {
        putArray(str, (ReadableArray) writableArray);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(@NonNull String str, @Nullable WritableMap writableMap) {
        putMap(str, (ReadableMap) writableMap);
    }

    public WritableNativeMap() {
        super(initHybrid());
    }
}
