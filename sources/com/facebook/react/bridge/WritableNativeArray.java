package com.facebook.react.bridge;

import android.support.annotation.Nullable;
import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    private static native HybridData initHybrid();

    private native void pushNativeArray(WritableNativeArray writableNativeArray);

    private native void pushNativeMap(WritableNativeMap writableNativeMap);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushBoolean(boolean z);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushDouble(double d);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushInt(int i);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushNull();

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushString(@Nullable String str);

    static {
        ReactBridge.staticInit();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(@Nullable ReadableArray readableArray) {
        a.a(readableArray == null || (readableArray instanceof WritableNativeArray), "Illegal type provided");
        pushNativeArray((WritableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(@Nullable ReadableMap readableMap) {
        a.a(readableMap == null || (readableMap instanceof WritableNativeMap), "Illegal type provided");
        pushNativeMap((WritableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(@Nullable WritableArray writableArray) {
        pushArray((ReadableArray) writableArray);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(@Nullable WritableMap writableMap) {
        pushMap((ReadableMap) writableMap);
    }
}
