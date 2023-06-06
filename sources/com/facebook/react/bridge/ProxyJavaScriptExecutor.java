package com.facebook.react.bridge;

import android.support.annotation.Nullable;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.JavaJSExecutor;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class ProxyJavaScriptExecutor extends JavaScriptExecutor {
    @Nullable
    private JavaJSExecutor mJavaJSExecutor;

    private static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "ProxyJavaScriptExecutor";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class Factory implements JavaScriptExecutorFactory {
        private final JavaJSExecutor.Factory mJavaJSExecutorFactory;

        public Factory(JavaJSExecutor.Factory factory) {
            this.mJavaJSExecutorFactory = factory;
        }

        @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
        public JavaScriptExecutor create() throws Exception {
            return new ProxyJavaScriptExecutor(this.mJavaJSExecutorFactory.create());
        }

        @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
        public void startSamplingProfiler() {
            throw new UnsupportedOperationException("Starting sampling profiler not supported on " + toString());
        }

        @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
        public void stopSamplingProfiler(String str) {
            throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + toString());
        }
    }

    static {
        ReactBridge.staticInit();
    }

    public ProxyJavaScriptExecutor(JavaJSExecutor javaJSExecutor) {
        super(initHybrid(javaJSExecutor));
        this.mJavaJSExecutor = javaJSExecutor;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public void close() {
        if (this.mJavaJSExecutor != null) {
            this.mJavaJSExecutor.close();
            this.mJavaJSExecutor = null;
        }
    }
}
