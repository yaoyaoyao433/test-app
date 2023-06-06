package com.meituan.msc.jse.jscexecutor;

import com.facebook.jni.HybridData;
import com.meituan.android.soloader.k;
import com.meituan.msc.jse.bridge.JavaScriptExecutor;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class JSCExecutor extends JavaScriptExecutor {
    public static ChangeQuickRedirect a;
    private String b;

    private static native HybridData initHybrid();

    static {
        k.b("mscexecutor");
    }

    public JSCExecutor() {
        super(initHybrid());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8f0f2cc4d1d6fdfd56518a73845663b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8f0f2cc4d1d6fdfd56518a73845663b");
        }
    }

    public JSCExecutor(String str) {
        super(initHybrid());
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5307df7fa22df6c47febc37ea13017fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5307df7fa22df6c47febc37ea13017fc");
        } else {
            this.b = str;
        }
    }

    @Override // com.meituan.msc.jse.bridge.JavaScriptExecutor
    public String getName() {
        return this.b;
    }
}
