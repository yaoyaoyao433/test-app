package com.meituan.mmp.lib.utils;

import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ag<R> {
    public static ChangeQuickRedirect c;
    private Runnable a;
    Object d;
    R e;
    public boolean f;

    public abstract R a();

    public ag() {
        this(null, false);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8df4197bbc0a3a8646d0058f9a499ed8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8df4197bbc0a3a8646d0058f9a499ed8");
        }
    }

    private ag(R r, boolean z) {
        Object[] objArr = {null, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "866231c652d66bbcffd6eb4c9059f7ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "866231c652d66bbcffd6eb4c9059f7ee");
            return;
        }
        this.d = new Object();
        this.f = false;
        this.a = new Runnable() { // from class: com.meituan.mmp.lib.utils.ag.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "554e1ae6d11171206e5b384a60495cb4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "554e1ae6d11171206e5b384a60495cb4");
                } else if (ag.this.f) {
                    ag.this.a();
                } else {
                    ag agVar = ag.this;
                    R r2 = (R) ag.this.a();
                    Object[] objArr3 = {r2};
                    ChangeQuickRedirect changeQuickRedirect3 = ag.c;
                    if (PatchProxy.isSupport(objArr3, agVar, changeQuickRedirect3, false, "a54b4efeff42d6fad9bca35c52167026", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, agVar, changeQuickRedirect3, false, "a54b4efeff42d6fad9bca35c52167026");
                        return;
                    }
                    agVar.e = r2;
                    synchronized (agVar.d) {
                        agVar.d.notify();
                    }
                }
            }
        };
        this.e = null;
    }

    public final R a(Handler handler) {
        Object[] objArr = {handler};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2247aeab16af84f253edec09066012d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (R) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2247aeab16af84f253edec09066012d7");
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
