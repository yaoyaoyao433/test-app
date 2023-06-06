package com.facebook.react.jscexecutor;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements JavaScriptExecutorFactory {
    private final String a;
    private final String b;

    public final String toString() {
        return "JSIExecutor+JSCRuntime";
    }

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final JavaScriptExecutor create() throws Exception {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.a);
        writableNativeMap.putString("DeviceIdentity", this.b);
        return new JSCExecutor(writableNativeMap);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + toString());
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final void stopSamplingProfiler(String str) {
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + toString());
    }
}
