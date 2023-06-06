package com.facebook.react.mrnjscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.meituan.android.soloader.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MRNJSCExecutor extends JavaScriptExecutor {
    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "MRNJSCExecutor";
    }

    static {
        k.b("mrnjscexecutor");
    }
}
