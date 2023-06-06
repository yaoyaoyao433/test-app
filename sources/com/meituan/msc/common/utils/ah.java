package com.meituan.msc.common.utils;

import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ah<R> {
    public static ChangeQuickRedirect c;
    private Runnable a;
    Object d;
    R e;
    public boolean f;

    public abstract R a();

    public ah() {
        this(null, false);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f46191d1cf3301fda4f9a0f1b32ec59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f46191d1cf3301fda4f9a0f1b32ec59");
        }
    }

    private ah(R r, boolean z) {
        Object[] objArr = {null, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb40d213e97a39d026b755dfe6403ab1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb40d213e97a39d026b755dfe6403ab1");
            return;
        }
        this.d = new Object();
        this.f = false;
        this.a = new Runnable() { // from class: com.meituan.msc.common.utils.ah.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "844e36f02a3944466c2c1d2c2e519edf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "844e36f02a3944466c2c1d2c2e519edf");
                } else if (ah.this.f) {
                    ah.this.a();
                } else {
                    ah ahVar = ah.this;
                    R r2 = (R) ah.this.a();
                    Object[] objArr3 = {r2};
                    ChangeQuickRedirect changeQuickRedirect3 = ah.c;
                    if (PatchProxy.isSupport(objArr3, ahVar, changeQuickRedirect3, false, "60c676c8c8951ac90ef7d86d759020b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, ahVar, changeQuickRedirect3, false, "60c676c8c8951ac90ef7d86d759020b8");
                        return;
                    }
                    ahVar.e = r2;
                    synchronized (ahVar.d) {
                        ahVar.d.notify();
                    }
                }
            }
        };
        this.e = null;
    }

    public final R a(Handler handler) {
        Object[] objArr = {handler};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3095cd1cb0fd4eaed8106367efafc765", RobustBitConfig.DEFAULT_VALUE)) {
            return (R) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3095cd1cb0fd4eaed8106367efafc765");
        }
        if (Thread.currentThread().getId() == handler.getLooper().getThread().getId()) {
            return a();
        }
        try {
            synchronized (this.d) {
                handler.post(this.a);
                this.d.wait();
            }
        } catch (InterruptedException unused) {
        }
        return this.e;
    }
}
