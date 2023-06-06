package com.meituan.msc.jse.jscexecutor;

import com.meituan.msc.jse.bridge.JavaScriptExecutor;
import com.meituan.msc.jse.bridge.JavaScriptExecutorFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements JavaScriptExecutorFactory {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;

    public final String toString() {
        return "JSIExecutor+JSCRuntime";
    }

    public a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626cf3e4af8b4829857fd39797d43ebb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626cf3e4af8b4829857fd39797d43ebb");
            return;
        }
        this.b = str;
        this.c = str2;
    }

    @Override // com.meituan.msc.jse.bridge.JavaScriptExecutorFactory
    public final JavaScriptExecutor create(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f18a950b853d1b26c8d30f07bd3edb", RobustBitConfig.DEFAULT_VALUE) ? (JavaScriptExecutor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f18a950b853d1b26c8d30f07bd3edb") : new JSCExecutor(str);
    }

    @Override // com.meituan.msc.jse.bridge.JavaScriptExecutorFactory
    public final void startSamplingProfiler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e86c091232613fb09bd7e8e9f27f08e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e86c091232613fb09bd7e8e9f27f08e");
            return;
        }
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + toString());
    }

    @Override // com.meituan.msc.jse.bridge.JavaScriptExecutorFactory
    public final void stopSamplingProfiler(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d9d5b3a75c915ef739e7e2c7aa4379a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d9d5b3a75c915ef739e7e2c7aa4379a");
            return;
        }
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + toString());
    }
}
