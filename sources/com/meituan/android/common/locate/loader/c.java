package com.meituan.android.common.locate.loader;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.meituan.android.common.locate.MasterLocator;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.loader.strategy.Instant;
import com.meituan.android.common.locate.platform.logs.i;
import com.meituan.android.common.locate.platform.logs.k;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class c extends a<MtLocation> implements com.meituan.android.common.locate.loader.tencent.proxy.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.meituan.android.common.locate.loader.tencent.b e;
    private Looper f;
    private Handler g;
    private boolean h;
    private boolean i;
    private com.meituan.android.common.locate.loader.tencent.c j;
    private long k;
    private boolean l;
    private boolean m;
    private k n;
    private boolean o;
    private long p;
    private int q;
    private i r;

    public c(Context context, MasterLocator masterLocator, LocationStrategy locationStrategy, Looper looper) {
        super(context);
        Object[] objArr = {context, masterLocator, locationStrategy, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6899b9151d326bd037372d4440130323", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6899b9151d326bd037372d4440130323");
            return;
        }
        this.h = false;
        this.l = false;
        this.m = true;
        this.n = new k();
        this.r = new i();
        this.f = looper;
        this.b = locationStrategy;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23770f23621c4558a52ac328f4f0a679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23770f23621c4558a52ac328f4f0a679");
            return;
        }
        this.e = com.meituan.android.common.locate.loader.tencent.b.a(context);
        this.e.a(1);
        boolean a = LocationUtils.a(context);
        this.e.a(!a);
        this.e.c(a);
        this.g = new Handler(e());
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "069da1798ddbdf8b37a1e8dd150fb2fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "069da1798ddbdf8b37a1e8dd150fb2fb");
        } else if (this.b instanceof BaseLocationStrategy) {
            this.h = ((BaseLocationStrategy) this.b).l;
            this.l = ((BaseLocationStrategy) this.b).n;
            this.i = ((BaseLocationStrategy) this.b).j;
            this.k = this.b.getDeliverInterval();
            this.a = ((BaseLocationStrategy) this.b).getBusinessId();
        }
    }

    private void d(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a32ce9f903b9ee1828da5395f03dbe48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a32ce9f903b9ee1828da5395f03dbe48");
        } else if (mtLocation == null) {
            com.meituan.android.common.locate.platform.logs.c.a("locatesdk: mttencentlocationloader, location is null", 3);
        } else if (this.b == null) {
            com.meituan.android.common.locate.platform.logs.c.a("locatesdk: mttencentlocationloader, adopter is null", 3);
        } else {
            com.meituan.android.common.locate.platform.logs.c.a(mtLocation, "MTTencentLocationLoader:bizName:" + this.a + ":StatusCode:" + mtLocation.getStatusCode(), this.b.getName(), 1);
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bbe830e46dfa6b922339b24d830e585", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bbe830e46dfa6b922339b24d830e585")).booleanValue() : com.meituan.android.common.locate.util.c.b(getContext()) == 0;
    }

    private Looper e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6af70d93300e4c6ee7a4e41c4129457", RobustBitConfig.DEFAULT_VALUE) ? (Looper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6af70d93300e4c6ee7a4e41c4129457") : this.f != null ? this.f : Looper.getMainLooper();
    }

    @Override // com.meituan.android.common.locate.loader.a
    public void a() {
        int b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14d800c486c5843bb5180347451ed224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14d800c486c5843bb5180347451ed224");
            return;
        }
        super.a();
        this.r.b();
        this.r.a(System.currentTimeMillis(), this.a);
        this.o = true;
        this.m = d();
        if (this.j == null) {
            this.j = new com.meituan.android.common.locate.loader.tencent.c();
            this.j.a(4);
            this.j.a(this.i);
            if (this.h) {
                this.j.b(true);
            }
            if (this.l) {
                this.j.c(true);
            }
        }
        this.p = System.currentTimeMillis();
        if (this.b instanceof Instant) {
            this.j.a(this.k);
            b = this.e.a(this.j, this, e());
        } else {
            b = this.e.b(this.j, this, e());
        }
        com.meituan.android.common.locate.platform.logs.c.a("MTTencentLocationLoader::onStartLoading" + this.a + " errorCode=" + b, 3);
    }

    @Override // com.meituan.android.common.locate.loader.tencent.proxy.a
    public void a(com.meituan.android.common.locate.loader.tencent.bean.a aVar, int i, String str) {
        Object[] objArr = {aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07c18086f3cff8b8eed5de2c9b15d895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07c18086f3cff8b8eed5de2c9b15d895");
            return;
        }
        final MtLocation a = com.meituan.android.common.locate.loader.tencent.a.a(aVar, i, str);
        this.m = i != 2;
        this.n.a(this.m);
        if (this.o) {
            this.n.a(a, System.currentTimeMillis() - this.p);
            this.o = false;
        } else {
            this.n.a(a, -1L);
        }
        int i2 = this.q;
        this.q = i2 + 1;
        if (i2 > 60) {
            this.n.a();
            this.q = 0;
        }
        if (aVar != null) {
            if ("gps".equals(aVar.a())) {
                this.r.a(System.currentTimeMillis());
            } else if (aVar.d() <= 20.0f) {
                this.r.c(System.currentTimeMillis());
            } else {
                this.r.b(System.currentTimeMillis());
            }
            this.r.a(aVar.a(), this.a, a);
            this.r.a(a);
            if (this.d != null) {
                this.d.a(this.a, this, a);
            }
        }
        d(a);
        this.g.post(new Runnable() { // from class: com.meituan.android.common.locate.loader.c.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a2905ce400009ca0fedd4d241799e447", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a2905ce400009ca0fedd4d241799e447");
                } else {
                    c.this.deliverResult(new MtLocation(a));
                }
            }
        });
    }

    @Override // com.meituan.android.common.locate.loader.tencent.proxy.a
    public void a(String str, int i, String str2) {
    }

    @Override // com.meituan.android.common.locate.loader.a
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e69b17684a67dd681ebb61d3e8adb5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e69b17684a67dd681ebb61d3e8adb5e");
            return;
        }
        super.b();
        if (this.e == null) {
            return;
        }
        com.meituan.android.common.locate.platform.logs.c.a("MTTencentLocationLoader::onStopLoading" + this.a, 3);
        this.e.a(this);
        this.e.b(true);
        this.q = 0;
        this.n.a();
        this.r.c();
    }
}
