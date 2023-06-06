package com.meituan.msc.jse.bridge;

import com.meituan.msc.jse.common.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public interface ReactCallback {
    @DoNotStrip
    void callNativeModules(String str);

    @DoNotStrip
    NativeArray callSerializableNativeHook(String str, String str2, String str3);

    @DoNotStrip
    void decrementPendingJSCalls();

    @DoNotStrip
    NativeArray getModuleConfig(String str);

    @DoNotStrip
    void incrementPendingJSCalls();

    @DoNotStrip
    String invokeMSCCallback(String str, ReadableNativeArray readableNativeArray);

    @DoNotStrip
    String invokeMSCCallback(String str, String str2, ReadableNativeArray readableNativeArray);

    @DoNotStrip
    void onBatchComplete();
}
