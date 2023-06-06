package com.meituan.android.mrn.utils.collection;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class d {
    public static ChangeQuickRedirect h = null;
    static boolean i = false;
    static Set<d> j;
    static Application.ActivityLifecycleCallbacks k;
    static WeakReference<Application> l;
    protected boolean m;
    protected long n;
    protected int o;
    protected boolean p;

    public abstract void a();

    public abstract void b();

    private static void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d60cde04e4fc4b4645f6f728f3314780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d60cde04e4fc4b4645f6f728f3314780");
        } else if (j == null) {
        } else {
            try {
                j.remove(dVar);
                if (j.size() <= 0) {
                    l.get().unregisterActivityLifecycleCallbacks(k);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public d() {
        this(400);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f61e79fc8f16e4f630485a9015a1dea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f61e79fc8f16e4f630485a9015a1dea");
        }
    }

    private d(int i2) {
        Object[] objArr = {400};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84c715d8f73224e3b37d5241ec3dc19e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84c715d8f73224e3b37d5241ec3dc19e");
            return;
        }
        this.m = false;
        this.n = -1L;
        this.p = false;
        this.o = 400;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "832673a62f0856eaecdbedbfe6ebe575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "832673a62f0856eaecdbedbfe6ebe575");
        } else if (this.m) {
        } else {
            synchronized (this) {
                if (this.m) {
                    return;
                }
                a();
                this.m = true;
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f656ce5aab5bd86397e0b38a1804c39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f656ce5aab5bd86397e0b38a1804c39");
        } else {
            a(false);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "947824b0954fbfe5be56d579cf2db01e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "947824b0954fbfe5be56d579cf2db01e");
        } else if (this.p) {
        } else {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "384e02046f902ee1c11764a531956017", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "384e02046f902ee1c11764a531956017");
            } else if (j != null) {
                try {
                    if (j.size() <= 0) {
                        l.get().registerActivityLifecycleCallbacks(k);
                    }
                    j.add(this);
                } catch (Throwable unused) {
                }
            }
            this.p = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd74e18c30b70556e4a7cd73f48ba1ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd74e18c30b70556e4a7cd73f48ba1ea");
        } else if (!z && System.currentTimeMillis() - this.n < this.o) {
            g();
        } else {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!z && currentTimeMillis - this.n < this.o) {
                    g();
                } else {
                    b();
                    this.n = currentTimeMillis;
                    if (this.p) {
                        this.p = false;
                        if (!z) {
                            a(this);
                        }
                    }
                }
            }
        }
    }
}
