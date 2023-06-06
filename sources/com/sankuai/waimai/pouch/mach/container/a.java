package com.sankuai.waimai.pouch.mach.container;

import android.app.Activity;
import android.graphics.Rect;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.component.countdown.CountDownTagProcessor;
import com.sankuai.waimai.mach.component.indicator.IndicatorTagProcessor;
import com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
import com.sankuai.waimai.mach.container.d;
import com.sankuai.waimai.mach.container.e;
import com.sankuai.waimai.mach.js.DialogJSNativeMethod;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.pouch.model.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.mach.container.a {
    public static ChangeQuickRedirect t;
    public com.sankuai.waimai.pouch.a A;
    protected c B;
    protected List<String> C;
    protected Set D;
    protected String E;
    public d F;
    private PouchDynamicAd a;
    private com.sankuai.waimai.mach.d b;
    protected Rect u;
    protected com.sankuai.waimai.pouch.plugin.a v;
    protected com.sankuai.waimai.pouch.plugin.c w;
    protected com.sankuai.waimai.pouch.plugin.b x;
    protected com.sankuai.waimai.pouch.plugin.params.a y;
    protected com.sankuai.waimai.pouch.plugin.params.c z;

    public void a() {
    }

    public void a(com.sankuai.waimai.mach.b bVar) {
    }

    public void b() {
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public void l() {
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, int i, Map map, com.sankuai.waimai.mach.node.a aVar2) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar2};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "47b63cdef3c0189b01decd13c90cf324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "47b63cdef3c0189b01decd13c90cf324");
        } else if (map == null || aVar.w == null) {
        } else {
            try {
                String optString = new JSONObject(map).optString("bid");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                com.sankuai.waimai.pouch.plugin.report.b bVar = new com.sankuai.waimai.pouch.plugin.report.b();
                bVar.b = optString;
                bVar.e = map;
                bVar.d = i;
                bVar.f = aVar2;
                bVar.c = str;
                if (aVar.v != null) {
                    bVar.g = aVar.v.a(str2, i);
                }
                if (com.sankuai.waimai.pouch.c.a() && i == 2 && aVar.A != null && !TextUtils.isEmpty(aVar.A.i)) {
                    if (bVar.g == null) {
                        bVar.g = new HashMap();
                    }
                    bVar.g.put("expose_reason", aVar.A.i);
                }
                if ("sh".equals(str2)) {
                    aVar.w.b(bVar);
                } else if ("lx".equals(str2)) {
                    aVar.w.a(bVar);
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a("WMMachMonitorReport", e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public final void a(Mach mach, String str, String str2) {
        Object[] objArr = {mach, str, str2};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f8676b4a04f05488da4a402d1c03164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f8676b4a04f05488da4a402d1c03164");
            return;
        }
        a((ViewGroup) null, str, str2);
        this.k = mach;
        a(this.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.pouch.mach.container.a.c():void");
    }

    public final void a(Rect rect) {
        this.u = rect;
    }

    public final void a(Set set, String str) {
        this.D = set;
        this.E = str;
    }

    public final boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f9a4a71ecdb758d91adfac1da399f68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f9a4a71ecdb758d91adfac1da399f68")).booleanValue();
        }
        if (this.u == null) {
            return true;
        }
        if (r() == null) {
            return false;
        }
        int[] iArr = new int[2];
        r().getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (i == 0 && i2 == 0) {
            return false;
        }
        return Rect.intersects(new Rect(i, i2, r().getWidth() + i, r().getHeight() + i2), this.u);
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ff80968d8c3c6c52076c7fe851fd78a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ff80968d8c3c6c52076c7fe851fd78a");
        } else if (q() && this.k != null) {
            List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = this.k.searchNodeWithViewReport();
            if (com.sankuai.waimai.foundation.utils.d.a(searchNodeWithViewReport)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar : searchNodeWithViewReport) {
                this.k.triggerViewReport(aVar);
            }
            l();
        }
    }

    public final void a(ViewGroup viewGroup) {
        this.l = viewGroup;
    }

    @Override // com.sankuai.waimai.mach.container.a
    @CallSuper
    public void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964e02aa989614852393dc350cfc7f60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964e02aa989614852393dc350cfc7f60");
            return;
        }
        com.sankuai.waimai.mach.d m = m();
        if (m == null) {
            m = this.b;
        }
        aVar.d = m;
        aVar.a(new SwiperTagProcessor());
        aVar.a(new ScrollerTagProcessor());
        aVar.a(new IndicatorTagProcessor());
        aVar.a(new CountDownTagProcessor());
        aVar.m = new com.sankuai.waimai.mach.component.interf.a() { // from class: com.sankuai.waimai.pouch.mach.container.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.component.interf.a
            public final long a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ad55e5c1b891f5ff3041c6fc7263a53", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ad55e5c1b891f5ff3041c6fc7263a53")).longValue() : com.meituan.android.time.c.b();
            }
        };
        aVar.a(new DialogJSNativeMethod() { // from class: com.sankuai.waimai.pouch.mach.container.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void showProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5bda60e9a8ee50aaaac4f8f60d2ea67", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5bda60e9a8ee50aaaac4f8f60d2ea67");
                } else {
                    a.this.e();
                }
            }

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void dismissProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16ec3b00205da69410a3a92d41840c95", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16ec3b00205da69410a3a92d41840c95");
                } else {
                    a.this.f();
                }
            }
        });
        Map<String, Object> map = null;
        if (this.y != null) {
            com.sankuai.waimai.pouch.plugin.params.a aVar2 = this.y;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.pouch.plugin.params.b.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "bfee81683568521458d1710f9fd09b95", RobustBitConfig.DEFAULT_VALUE)) {
                map = (Map) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "bfee81683568521458d1710f9fd09b95");
            } else if (aVar2.c != null) {
                map = aVar2.c.h;
            }
        }
        aVar.n = map;
    }

    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f22ac4584229b9c335424b55af4567a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f22ac4584229b9c335424b55af4567a9");
        } else if (this.A == null || this.A.m == null) {
        } else {
            this.A.m.a(null);
        }
    }

    public com.sankuai.waimai.mach.d m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b35d516d09800e5744db5202fffd2a8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b35d516d09800e5744db5202fffd2a8c");
        }
        if (this.A != null) {
            return this.A.j;
        }
        return null;
    }

    @Override // com.sankuai.waimai.mach.container.a, com.sankuai.waimai.mach.lifecycle.d, com.sankuai.waimai.mach.lifecycle.b
    public void onActivityDestroyed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a60cc9fef6f84edf0a60831a5c1fed8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a60cc9fef6f84edf0a60831a5c1fed8f");
            return;
        }
        super.onActivityDestroyed();
        if (this.v != null) {
            this.v.e();
        }
    }

    @Override // com.sankuai.waimai.mach.lifecycle.d, com.sankuai.waimai.mach.lifecycle.b
    public void onActivityStarted() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "400a884b8881e7d6c78bff0ea72127b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "400a884b8881e7d6c78bff0ea72127b7");
            return;
        }
        super.onActivityStarted();
        if (this.v != null) {
            this.v.c();
        }
    }

    @Override // com.sankuai.waimai.mach.lifecycle.d, com.sankuai.waimai.mach.lifecycle.b
    public void onActivityStopped() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "382c3b039b6d81ef2d75cb9488197229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "382c3b039b6d81ef2d75cb9488197229");
            return;
        }
        super.onActivityStopped();
        if (this.v != null) {
            this.v.d();
        }
    }

    @Override // com.sankuai.waimai.mach.container.a
    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccfed8eaf027b8c96bac37f1c63cd878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccfed8eaf027b8c96bac37f1c63cd878");
            return;
        }
        if (this.v != null) {
            this.v.h();
            this.v.f();
        }
        if (this.w != null) {
            this.w.h();
        }
        super.o();
    }

    @Override // com.sankuai.waimai.mach.container.a
    public void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729edf68adfa8a9b132ffed3719641d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729edf68adfa8a9b132ffed3719641d7");
            return;
        }
        super.a(str, map);
        if (this.v != null) {
            this.v.a(str, map);
        }
        if (this.w != null) {
            this.w.a(str, map);
        }
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc75ca687b215970f53d7436001ce902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc75ca687b215970f53d7436001ce902");
            return;
        }
        super.a(z);
        if (this.v != null) {
            if (z) {
                this.v.b();
            } else {
                this.v.aV_();
            }
        }
    }

    public final void a(PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d972eb19a64e1508ed9c93643d050668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d972eb19a64e1508ed9c93643d050668");
            return;
        }
        this.a = pouchDynamicAd;
        if (this.y != null) {
            this.y.d = pouchDynamicAd;
        }
        if (this.z != null) {
            this.z.d = pouchDynamicAd;
        }
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514de1ee046ba19e6269dc63bbd93a32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514de1ee046ba19e6269dc63bbd93a32");
            return;
        }
        if (this.y != null) {
            this.y.c = cVar;
        }
        if (this.z != null) {
            this.z.c = cVar;
        }
        if (this.k == null || this.k.getCustomEnvParams() == null) {
            return;
        }
        this.k.getCustomEnvParams().putAll(cVar.h);
        this.k.synchronizeEnvironment();
    }

    public final void a(com.sankuai.waimai.pouch.plugin.b bVar) {
        this.x = bVar;
    }

    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9fce2c9e570dd5c4e94f46e000cea67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9fce2c9e570dd5c4e94f46e000cea67");
            return;
        }
        if (this.v != null) {
            this.v.h();
        }
        if (this.w != null) {
            this.w.h();
        }
    }

    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f404fdc1962ff7c1bb9b59527cc5305c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f404fdc1962ff7c1bb9b59527cc5305c");
            return;
        }
        if (this.v != null) {
            this.v.j();
        }
        if (this.w != null) {
            this.w.j();
        }
    }

    public a(Activity activity, c cVar, com.sankuai.waimai.pouch.a aVar) {
        super(activity, cVar == null ? "default" : cVar.d);
        Object[] objArr = {activity, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e3ac84e6a641f2d6ba702a70b1362ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e3ac84e6a641f2d6ba702a70b1362ca");
            return;
        }
        this.b = new com.sankuai.waimai.mach.d() { // from class: com.sankuai.waimai.pouch.mach.container.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.d
            public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {str, str2, Integer.valueOf(i), map, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e7cf8d4af7ddeb569f5be897483a1ef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e7cf8d4af7ddeb569f5be897483a1ef");
                } else {
                    a.a(a.this, str, str2, i, map, aVar2);
                }
            }
        };
        this.F = new e() { // from class: com.sankuai.waimai.pouch.mach.container.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c85e8627740de44670269fc83ddc6e2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c85e8627740de44670269fc83ddc6e2b");
                    return;
                }
                a.this.b();
                a.this.u();
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "424c60693484a10b0ab9e2d09b9eaac1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "424c60693484a10b0ab9e2d09b9eaac1");
                } else {
                    a.this.a();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97b21802f2cb2f67b71435b5cce57614", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97b21802f2cb2f67b71435b5cce57614");
                } else if (a.this.r() != null) {
                    a.this.r().post(new Runnable() { // from class: com.sankuai.waimai.pouch.mach.container.a.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b3569a04509a549020f672bd641b21ea", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b3569a04509a549020f672bd641b21ea");
                                return;
                            }
                            if (a.this.v != null) {
                                a.this.v.i();
                            }
                            if (a.this.w != null) {
                                a.this.w.i();
                            }
                        }
                    });
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a00411080b54af0bdf400b4f3eaadc4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a00411080b54af0bdf400b4f3eaadc4");
                    return;
                }
                super.d();
                a.this.c();
            }
        };
        this.y = new com.sankuai.waimai.pouch.plugin.params.a();
        this.y.c = cVar;
        this.y.b = aVar;
        this.z = new com.sankuai.waimai.pouch.plugin.params.c();
        this.z.b = aVar;
        this.z.c = cVar;
        if (aVar != null) {
            this.z.e = aVar.d;
            this.z.f = aVar.e;
            this.x = aVar.h;
        }
        a(this.F);
        this.A = aVar;
        this.B = cVar;
    }
}
