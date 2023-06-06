package com.meituan.android.ptcommonim.video.record.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c<R> implements Runnable {
    public static ChangeQuickRedirect d;
    private final AtomicBoolean a;
    private final AtomicReference<Thread> b;

    public abstract R a() throws Exception;

    public abstract void a(R r);

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "484ad4c930577ff77be6993856376a88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "484ad4c930577ff77be6993856376a88");
            return;
        }
        this.a = new AtomicBoolean(false);
        this.b = new AtomicReference<>();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c37216a2881b8ee6a00169ce7b30dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c37216a2881b8ee6a00169ce7b30dd")).booleanValue() : this.a.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edd6b690686f6498c30a825667501228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edd6b690686f6498c30a825667501228");
            return;
        }
        try {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            g.b(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e3f176b943f1bb3132ef68ee532f2891", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e3f176b943f1bb3132ef68ee532f2891") : new d(this));
            this.b.compareAndSet(null, Thread.currentThread());
            this.a.set(false);
            R a = a();
            Object[] objArr3 = {this, a};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            g.b(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "262df33645a32e848f228141f5a673b6", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "262df33645a32e848f228141f5a673b6") : new e(this, a));
        } catch (Throwable th) {
            Object[] objArr4 = {this, th};
            ChangeQuickRedirect changeQuickRedirect4 = f.a;
            g.b(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "faf9091e8d7790fbc0d6710c1fdf9a4c", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "faf9091e8d7790fbc0d6710c1fdf9a4c") : new f(this, th));
        }
    }
}
