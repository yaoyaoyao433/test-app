package com.meituan.msi.util;

import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class n<R> {
    public static ChangeQuickRedirect c;
    private final Runnable a;
    final Object d;
    R e;
    public final boolean f;

    public abstract R a();

    public n() {
        this(null, false);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8efba269fa8353aeefdb511b34b8122a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8efba269fa8353aeefdb511b34b8122a");
        }
    }

    private n(R r, boolean z) {
        Object[] objArr = {null, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "473797da2f9a6640cfd6607086e51c0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "473797da2f9a6640cfd6607086e51c0e");
            return;
        }
        this.d = new Object();
        this.f = false;
        this.a = new Runnable() { // from class: com.meituan.msi.util.n.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce68620f1bcb3e1a35037ebd4ea8ae06", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce68620f1bcb3e1a35037ebd4ea8ae06");
                } else if (n.this.f) {
                    n.this.a();
                } else {
                    n nVar = n.this;
                    R r2 = (R) n.this.a();
                    Object[] objArr3 = {r2};
                    ChangeQuickRedirect changeQuickRedirect3 = n.c;
                    if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "629a88c556e06ec754732a0ccf54c814", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "629a88c556e06ec754732a0ccf54c814");
                        return;
                    }
                    nVar.e = r2;
                    synchronized (nVar.d) {
                        nVar.d.notify();
                    }
                }
            }
        };
        this.e = null;
    }

    public final R a(Handler handler) {
        Object[] objArr = {handler};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6783bd81d204a77f1b7a2f8d54c7cc89", RobustBitConfig.DEFAULT_VALUE)) {
            return (R) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6783bd81d204a77f1b7a2f8d54c7cc89");
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
