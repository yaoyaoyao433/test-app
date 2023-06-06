package com.meituan.msc.modules.page.render;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.meituan.msc.common.utils.ay;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.container.r;
import com.meituan.msc.modules.container.u;
import com.meituan.msc.modules.engine.n;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.page.render.f;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class d implements f {
    public static ChangeQuickRedirect a;
    public final String b;
    protected Context c;
    public com.meituan.msc.modules.engine.h d;
    public com.meituan.msc.modules.update.f e;
    protected p f;
    public PerfEventRecorder g;
    protected com.meituan.msc.modules.service.i h;
    public int i;
    public int j;
    public b k;
    public n l;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(@Nullable String str);

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public String a;
        public com.meituan.msc.common.framework.interfaces.b b;
        public a c;
        public com.meituan.msc.modules.container.n d;
        public c i;
        public com.meituan.msc.modules.page.render.a j;
        public boolean l;
        public boolean m;
        public long n;
        public String o;
        public boolean e = false;
        public boolean f = false;
        public boolean g = false;
        public C0466d h = new C0466d();
        public String k = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public String a;
        public Map<String, Object> b;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.page.render.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0466d {
        public long a;
    }

    public abstract b a();

    public abstract boolean a(boolean z, View view, boolean z2);

    @Override // com.meituan.msc.modules.page.render.g
    @CallSuper
    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70eb5042f7b46d848f7383d09d403d86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70eb5042f7b46d848f7383d09d403d86");
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public void l() {
    }

    public void m() {
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1803d97566fc2b3242cf367d3cb8bd58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1803d97566fc2b3242cf367d3cb8bd58");
            return;
        }
        this.b = "BaseRenderer@" + hashCode();
        this.i = -1;
        this.j = -1;
        this.k = a();
        this.l = n.NONE;
    }

    public PerfEventRecorder getPerfEventRecorder() {
        return this.g;
    }

    @Override // com.meituan.msc.modules.page.render.f
    @CallSuper
    public void a(Context context, com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a8cdcdead66cae0b9643ffce7f2d9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a8cdcdead66cae0b9643ffce7f2d9e");
            return;
        }
        this.c = context.getApplicationContext();
        this.d = hVar;
        this.h = ((com.meituan.msc.modules.engine.a) this.d.c(com.meituan.msc.modules.engine.a.class)).f();
        this.g = this.d.o;
        this.e = hVar.r;
    }

    public Set<k> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f600ac285ffc541a05f006a872868a82", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f600ac285ffc541a05f006a872868a82") : Collections.emptySet();
    }

    public final d a(p pVar) {
        this.f = pVar;
        return this;
    }

    public final p c() {
        return this.f;
    }

    public final Window d() {
        r G;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91e8cf13215435a75f2f68c2fbe19cc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Window) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91e8cf13215435a75f2f68c2fbe19cc8");
        }
        if (this.f == null || (G = this.f.G()) == null) {
            return null;
        }
        return G.getWindow();
    }

    @CallSuper
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75a2db246f297c5d90441daf3258d218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75a2db246f297c5d90441daf3258d218");
            return;
        }
        this.k.a = str;
        g();
        if (this.k.c != null) {
            this.k.c.a();
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d71b7d0a1da4cd60df6061744f741b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d71b7d0a1da4cd60df6061744f741b25");
            return;
        }
        h();
        com.meituan.msc.modules.engine.c cVar = (com.meituan.msc.modules.engine.c) this.d.c(com.meituan.msc.modules.engine.c.class);
        this.k.j.c();
        if (cVar != null) {
            cVar.a(this);
        }
    }

    public final com.meituan.msc.modules.reporter.f f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2280dc056d3b080e35fc7b7c69d02cf5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.reporter.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2280dc056d3b080e35fc7b7c69d02cf5");
        }
        com.meituan.msc.modules.page.render.a aVar = (this.k == null || this.k.j == null) ? null : this.k.j;
        return aVar == null ? new com.meituan.msc.modules.reporter.f(com.meituan.msc.modules.reporter.a.a(this.d, this, (Boolean) null)) : aVar;
    }

    public final d a(com.meituan.msc.common.framework.interfaces.b bVar) {
        this.k.b = bVar;
        return this;
    }

    public final d a(com.meituan.msc.modules.page.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c201e99e91ff01bbff05355d207ae0", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c201e99e91ff01bbff05355d207ae0");
        }
        this.k.j = aVar;
        this.k.j.a("rendererPreloadType", n.a(this.l));
        return this;
    }

    public void g() {
        String packageName;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b950e7506e2c5ed135acb8dff7d417f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b950e7506e2c5ed135acb8dff7d417f1");
        } else if (this.k.e) {
        } else {
            this.k.e = true;
            try {
                if (this.e.v()) {
                    com.meituan.msc.common.report.a a2 = this.k.j.a("foundationVersion", this.e.n()).a("mscVersion", this.e.w());
                    com.meituan.msc.modules.update.f fVar = this.e;
                    String str = this.k.a;
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.update.f.a;
                    if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "b692a86942eb387e0ce2e122801af410", RobustBitConfig.DEFAULT_VALUE)) {
                        packageName = (String) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "b692a86942eb387e0ce2e122801af410");
                    } else {
                        AppMetaInfoWrapper appMetaInfoWrapper = fVar.h;
                        packageName = appMetaInfoWrapper != null ? appMetaInfoWrapper.getLoadedPackageInfoDefaultReturnMain(str).getPackageName() : "";
                    }
                    a2.a("packageName", packageName);
                }
                this.k.j.a("page.path", this.k.a).a("msc.page.load.start").c();
            } catch (Exception unused) {
            }
        }
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e7afcd8ca1bd6d1ea92370a03eb16a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e7afcd8ca1bd6d1ea92370a03eb16a");
            return;
        }
        Object[] objArr2 = {"cancel", null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e1617cd9d4c5be5302d5ea1cc413886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e1617cd9d4c5be5302d5ea1cc413886");
        } else if (this.k.i == null) {
            a("cancel", (HashMap<String, Object>) null);
            i();
        }
    }

    public final void a(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "297387658f4c6c866cf5ecc62f999e8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "297387658f4c6c866cf5ecc62f999e8f");
        } else if (this.k.i == null) {
            c cVar = new c();
            cVar.a = str;
            cVar.b = hashMap;
            this.k.i = cVar;
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2151bc6f11a8735ae3a653d8dab09260", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2151bc6f11a8735ae3a653d8dab09260");
        } else if (this.k.i == null || this.k.g || !this.k.e) {
        } else {
            this.k.g = true;
        }
    }

    public void a(HashMap<String, Object> hashMap) {
        long j;
        JSONObject jSONObject;
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "532f10bb979d14ecc3fd4e6cbe72be93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "532f10bb979d14ecc3fd4e6cbe72be93");
            return;
        }
        if (this.k.c != null) {
            this.k.c.b();
        }
        if (this.k.m) {
            return;
        }
        this.k.m = true;
        this.k.b.a(this.k.a, hashMap);
        f.a aVar = new f.a();
        aVar.a = this.k.a;
        this.d.a(new com.meituan.msc.modules.manager.f("pageFirstRender", aVar));
        if (this.g != null) {
            this.g.b("render");
            this.g.b(PackageLoadReporter.Source.LAUNCH);
            this.k.j.a(Message.SID, this.g.b);
        }
        this.k.j.b();
        com.meituan.msc.modules.reporter.preformance.c cVar = this.d.G;
        b bVar = this.k;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.reporter.preformance.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "93c26cafa4fc356adc0bbfdd98e2158e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "93c26cafa4fc356adc0bbfdd98e2158e");
        } else if (ay.a(cVar.b.r.n(), "1.8.0") >= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONArray jSONArray = new JSONArray();
            Object[] objArr3 = {bVar, new Long(currentTimeMillis)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.reporter.preformance.c.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "68f4188f45b2933b625218614ff4d4ab", RobustBitConfig.DEFAULT_VALUE)) {
                jSONObject = (JSONObject) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "68f4188f45b2933b625218614ff4d4ab");
            } else {
                if (bVar.d == null) {
                    j = bVar.h.a;
                } else {
                    j = bVar.d.e;
                }
                com.meituan.msc.modules.reporter.preformance.b b2 = new com.meituan.msc.modules.reporter.preformance.b().a("navigation").b(bVar.d != null ? "appLaunch" : TencentExtraKeys.LOCATION_KEY_ROUTE).c(bVar.o).d(bVar.a).a(j).b(currentTimeMillis);
                jSONObject = b2;
                if (bVar.d == null) {
                    b2.c(bVar.n);
                    jSONObject = b2;
                }
            }
            jSONArray.put(jSONObject);
            Object[] objArr4 = {bVar, new Long(currentTimeMillis)};
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.reporter.preformance.c.a;
            jSONArray.put(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "8db9cac2707a64ffbc117e2a53fe10b9", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "8db9cac2707a64ffbc117e2a53fe10b9") : new com.meituan.msc.modules.reporter.preformance.b().a("render").b("firstRender").d(bVar.a).a(bVar.n).b(currentTimeMillis));
            jSONArray.put(cVar.b.D);
            for (com.meituan.msc.modules.reporter.preformance.b bVar2 : cVar.c) {
                jSONArray.put(bVar2);
            }
            cVar.c.clear();
            cVar.a(jSONArray);
        }
    }

    public int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc47b4ed34c7799c806c805ae040d37c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc47b4ed34c7799c806c805ae040d37c")).intValue();
        }
        if (this.i != -1) {
            return this.i;
        }
        return hashCode();
    }

    public void a(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ff3f45356a3ae6d3b80d111fe2e1f2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ff3f45356a3ae6d3b80d111fe2e1f2a");
            return;
        }
        this.k.o = uVar.b;
        com.meituan.msc.modules.reporter.g.d(this.b, String.format("onAppRoute, openType=%s pagePath=%s viewId=%s reloadViewId=%s hasRenderCache=%s", uVar.b, this.k.a, Integer.valueOf(j()), Integer.valueOf(this.j), Boolean.valueOf(true ^ TextUtils.isEmpty(this.k.k))));
        this.k.b.a(uVar, j(), this.j, this.k.k);
        if (this.j != -1 && !uVar.b.equals("reload")) {
            this.k.b.a(new u(uVar.a, "reload", uVar.c), j(), this.j, this.k.k);
        }
        this.j = -1;
        this.k.j.a("routeType", uVar.b);
        this.k.n = System.currentTimeMillis();
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fa6856e1f81ae18b39bbf1cda609d9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fa6856e1f81ae18b39bbf1cda609d9c");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.k.k = str;
        }
    }

    public void b(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65bc45d899f8a554b9f188cbd8700c42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65bc45d899f8a554b9f188cbd8700c42");
            return;
        }
        a(uVar.a);
        a(uVar);
    }

    public void a(com.meituan.msc.common.report.d dVar, boolean z, int i, String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f9a069ce8c8928dd8a558b86648930", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f9a069ce8c8928dd8a558b86648930");
        } else {
            dVar.a("hasFirstRender", Integer.valueOf(z ? 1 : 0)).a("isWhiteScreen", Integer.valueOf(i)).a("pageStack", this.d.n.a()).a("pageNavigation", this.d.n.b()).a("jsErrors", this.d.n.c()).a("innerUrl", str).a("isRendererGoneReload", Boolean.valueOf(hashMap != null)).a("renderProcessGoneInfo", hashMap).a(hashMap).c();
        }
    }

    public View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca86f3476c311391c54495e01442e0cb", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca86f3476c311391c54495e01442e0cb") : o().b().findViewById(i);
    }
}
