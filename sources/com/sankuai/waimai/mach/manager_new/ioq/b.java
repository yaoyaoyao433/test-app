package com.sankuai.waimai.mach.manager_new.ioq;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.FutureTask;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b<T> implements Callable<T> {
    public static ChangeQuickRedirect a;
    public j b;
    d c;
    public FutureTask<T> d;
    protected T e;
    protected boolean f;

    public String a() {
        return "";
    }

    public int d() {
        return 0;
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f7794817900bd77ba8c1e3536c9ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f7794817900bd77ba8c1e3536c9ac7");
        }
    }

    public void f() throws Exception {
    }

    public b(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957e0b400d8cebab2a32f1224018dbe7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957e0b400d8cebab2a32f1224018dbe7");
            return;
        }
        this.b = jVar;
        this.d = new a(this, d());
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd6f65d09753aec79648f78e5c6194e0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd6f65d09753aec79648f78e5c6194e0") : this.b.a();
    }

    public final BundleInfo c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eac7f639552c78a39c285915dec86fb2", RobustBitConfig.DEFAULT_VALUE) ? (BundleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eac7f639552c78a39c285915dec86fb2") : this.b.b;
    }

    public final void a(T t) {
        this.e = t;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05dd921d193e98eebd2d89cbbf010d70", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05dd921d193e98eebd2d89cbbf010d70");
        }
        try {
            e();
            f();
            g();
        } catch (Exception e) {
            a(e);
        }
        return this.e;
    }

    public void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "348687bd438fb1dd50cad41fb9e55005", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "348687bd438fb1dd50cad41fb9e55005");
            return;
        }
        if (this.c != null && ((this instanceof g) || (this instanceof com.sankuai.waimai.machpro.bundle.b))) {
            com.sankuai.waimai.mach.model.data.a aVar = new com.sankuai.waimai.mach.model.data.a("mach_io_callback_failed");
            com.sankuai.waimai.mach.manager_new.common.c.i("onEnd Exception | " + a() + " | " + com.sankuai.waimai.mach.manager_new.common.a.b(c()) + " | " + exc.getMessage());
            this.c.a(this, exc);
            aVar.a("callback_failed");
            com.sankuai.waimai.mach.common.i.a().e().a(aVar);
        }
        com.sankuai.waimai.mach.manager_new.monitor.a.a(exc.getMessage());
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27dcef93d5342b2d1e193d09834e3642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27dcef93d5342b2d1e193d09834e3642");
        } else if (this.c != null) {
            if ((this instanceof g) || (this instanceof com.sankuai.waimai.machpro.bundle.b)) {
                com.sankuai.waimai.mach.model.data.a aVar = new com.sankuai.waimai.mach.model.data.a("mach_io_callback_success");
                com.sankuai.waimai.mach.manager_new.common.c.k("onEnd Success | " + a() + " | " + com.sankuai.waimai.mach.manager_new.common.a.b(c()));
                this.c.a(this);
                aVar.a("callback_success");
                com.sankuai.waimai.mach.common.i.a().e().a(aVar);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends FutureTask<T> implements Comparable<b<T>.a> {
        public static ChangeQuickRedirect a;
        private int c;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            a aVar = (a) obj;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e22b2c1bfee424cf2a42447aada22083", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e22b2c1bfee424cf2a42447aada22083")).intValue();
            }
            if (aVar == null) {
                return 1;
            }
            return Integer.compare(this.c, aVar.c);
        }

        public a(Callable<T> callable, int i) {
            super(callable);
            Object[] objArr = {b.this, callable, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bed66b5d60ab23c40870a5e76be38e33", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bed66b5d60ab23c40870a5e76be38e33");
            } else {
                this.c = i;
            }
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c59568ef5be593cc0744021c6eac424", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c59568ef5be593cc0744021c6eac424")).booleanValue();
            }
            if (b.this.c() != null) {
                com.sankuai.waimai.mach.manager_new.common.c.b("task is cancelling | taskName = " + b.this.a() + " bundleName = " + com.sankuai.waimai.mach.manager_new.common.a.b(b.this.c()));
            }
            b.this.a((Exception) new CancellationException());
            return super.cancel(z);
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
        public final boolean isCancelled() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8fbf44d49f993bfbfa049a742d3be2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8fbf44d49f993bfbfa049a742d3be2")).booleanValue();
            }
            com.sankuai.waimai.mach.manager_new.common.c.b("task is cancelled | taskName = " + b.this.a() + " bundleName = " + com.sankuai.waimai.mach.manager_new.common.a.b(b.this.c()));
            return super.isCancelled();
        }
    }
}
