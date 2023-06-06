package com.sankuai.waimai.mach.jsv8.jsexecutor;

import android.os.Handler;
import android.os.HandlerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.v8jse.JSObject;
import com.meituan.v8jse.JSRuntime;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public HandlerThread b;
    public JSRuntime c;
    public JSObject d;
    private Handler e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390f7ad679bfa4bab422021c8b8f868b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390f7ad679bfa4bab422021c8b8f868b");
            return;
        }
        this.b = new HandlerThread("mach_js_thread");
        this.b.start();
        this.e = new Handler(this.b.getLooper());
    }

    public final void a(final com.sankuai.waimai.mach.jsv8.jstask.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a0507be117c6ad56b13085ae7d1268", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a0507be117c6ad56b13085ae7d1268");
        } else {
            this.e.post(new Runnable() { // from class: com.sankuai.waimai.mach.jsv8.jsexecutor.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b25bc3a061bafbdadecb0e0d3defc95f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b25bc3a061bafbdadecb0e0d3defc95f");
                    } else if (aVar != null) {
                        aVar.run();
                    }
                }
            });
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7f7bc4d71d78726f5502e293a8367a4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7f7bc4d71d78726f5502e293a8367a4")).booleanValue() : this.b != null && this.b.isAlive();
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8d1b7ab1c77cb2eaae971ccf4649aec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8d1b7ab1c77cb2eaae971ccf4649aec");
        } else if (Thread.currentThread() != this.b) {
            throw new IllegalThreadStateException("can not call executeJS in any thread except in JsThread.");
        }
    }
}
