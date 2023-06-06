package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
import com.facebook.jni.HybridData;
import com.meituan.msc.jse.bridge.JavaJSExecutor;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class ProxyJavaScriptExecutor extends JavaScriptExecutor {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private JavaJSExecutor mJavaJSExecutor;

    private static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    @Override // com.meituan.msc.jse.bridge.JavaScriptExecutor
    public String getName() {
        return "ProxyJavaScriptExecutor";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Factory implements JavaScriptExecutorFactory {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final JavaJSExecutor.Factory mJavaJSExecutorFactory;

        public Factory(JavaJSExecutor.Factory factory) {
            Object[] objArr = {factory};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6ca0124be2772948e9b0edd6afd9c82", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6ca0124be2772948e9b0edd6afd9c82");
            } else {
                this.mJavaJSExecutorFactory = factory;
            }
        }

        @Override // com.meituan.msc.jse.bridge.JavaScriptExecutorFactory
        public JavaScriptExecutor create(String str) throws Exception {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccec278ceccea4056f86ce9b543af34f", RobustBitConfig.DEFAULT_VALUE) ? (JavaScriptExecutor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccec278ceccea4056f86ce9b543af34f") : new ProxyJavaScriptExecutor(this.mJavaJSExecutorFactory.create());
        }

        @Override // com.meituan.msc.jse.bridge.JavaScriptExecutorFactory
        public void startSamplingProfiler() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9f2334c14ad3102f7203f82d4fb2be7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9f2334c14ad3102f7203f82d4fb2be7");
                return;
            }
            throw new UnsupportedOperationException("Starting sampling profiler not supported on " + toString());
        }

        @Override // com.meituan.msc.jse.bridge.JavaScriptExecutorFactory
        public void stopSamplingProfiler(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b42aa43004b9c73fb83f424ad241e2eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b42aa43004b9c73fb83f424ad241e2eb");
                return;
            }
            throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + toString());
        }
    }

    static {
        ReactBridge.staticInit();
    }

    public ProxyJavaScriptExecutor(JavaJSExecutor javaJSExecutor) {
        super(initHybrid(javaJSExecutor));
        Object[] objArr = {javaJSExecutor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c58f96d3e4d096adc07cfb722417ff3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c58f96d3e4d096adc07cfb722417ff3");
        } else {
            this.mJavaJSExecutor = javaJSExecutor;
        }
    }

    @Override // com.meituan.msc.jse.bridge.JavaScriptExecutor
    public void close() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f65a3c204830b2d08336c6900d2d464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f65a3c204830b2d08336c6900d2d464");
        } else if (this.mJavaJSExecutor != null) {
            this.mJavaJSExecutor.close();
            this.mJavaJSExecutor = null;
        }
    }
}
