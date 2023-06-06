package com.meituan.msc.common.utils.collection;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b {
    public static ChangeQuickRedirect c = null;
    static boolean d = false;
    static Set<b> e;
    static Application.ActivityLifecycleCallbacks f;
    static WeakReference<Application> g;
    protected boolean h;
    protected long i;
    protected int j;
    protected boolean k;

    public abstract void a();

    public abstract void b();

    private static void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3aefc03db02f6d9b10b5f9b1f3b6a936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3aefc03db02f6d9b10b5f9b1f3b6a936");
        } else if (e == null) {
        } else {
            try {
                e.remove(bVar);
                if (e.size() <= 0) {
                    g.get().unregisterActivityLifecycleCallbacks(f);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public b() {
        this(1000);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4826d1f688dc6efa7e94cbd54c640788", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4826d1f688dc6efa7e94cbd54c640788");
        }
    }

    private b(int i) {
        Object[] objArr = {1000};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0dad53bfe3f10ca0341d9f0dff2b1bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0dad53bfe3f10ca0341d9f0dff2b1bc");
            return;
        }
        this.h = false;
        this.i = -1L;
        this.k = false;
        this.j = 1000;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c084cfabf6ebd80b1cf56327d8755ffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c084cfabf6ebd80b1cf56327d8755ffb");
        } else if (this.h) {
        } else {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                a();
                this.h = true;
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c30631e7c092753a6c308a68f195ef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c30631e7c092753a6c308a68f195ef7");
        } else {
            a(false);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe47e9a509b1a7f9cf74966b1459b59c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe47e9a509b1a7f9cf74966b1459b59c");
        } else if (this.k) {
        } else {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d90f821b9cee8ad12addce0cce1224d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d90f821b9cee8ad12addce0cce1224d8");
            } else if (e != null) {
                try {
                    if (e.size() <= 0) {
                        g.get().registerActivityLifecycleCallbacks(f);
                    }
                    e.add(this);
                } catch (Throwable unused) {
                }
            }
            this.k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87c71fb83be30f08b0859e66725c8c58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87c71fb83be30f08b0859e66725c8c58");
        } else if (!z && System.currentTimeMillis() - this.i < this.j) {
            g();
        } else {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!z && currentTimeMillis - this.i < this.j) {
                    g();
                } else {
                    b();
                    this.i = currentTimeMillis;
                    if (this.k) {
                        this.k = false;
                        if (!z) {
                            a(this);
                        }
                    }
                }
            }
        }
    }
}
