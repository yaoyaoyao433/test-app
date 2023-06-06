package com.sankuai.eh.component.web.plugins.core;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.b;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.web.model.a;
import com.sankuai.eh.component.web.module.e;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends com.sankuai.eh.component.web.plugins.b {
    public static ChangeQuickRedirect a;
    public long b;
    boolean f;
    boolean g;
    int h;
    int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private long n;
    private boolean o;
    private b.a p;

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "01";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "routeFlow";
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcedb4dce7ed29a20eb758c1bc831d9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcedb4dce7ed29a20eb758c1bc831d9c");
            return;
        }
        this.f = true;
        this.g = true;
        this.n = 0L;
        this.h = 0;
        this.i = 0;
    }

    public static /* synthetic */ void a(d dVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "f3e06985e0c8c18ee086288e5bf77b1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "f3e06985e0c8c18ee086288e5bf77b1e");
        } else {
            com.sankuai.eh.component.service.tools.d.b(str, new d.b().a("isTTI", Boolean.valueOf(dVar.m)).a("isLoad", Boolean.valueOf(dVar.l)).a("firstBackground", Boolean.valueOf(dVar.f)).a("firstForeground", Boolean.valueOf(dVar.g)).a("onBackgroundTimes", Integer.valueOf(dVar.h)).a("onForegroundTimes", Integer.valueOf(dVar.i)).a("appSwitchTime", Long.valueOf(Math.max(System.currentTimeMillis() - dVar.b, 0L))).a("ttiTime", Long.valueOf(dVar.n)).a("ehcStatus", com.sankuai.eh.component.service.utils.d.a(com.sankuai.eh.component.service.a.b())).a(dVar.d.a()).b, null);
        }
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48abca2db0f9fcb70aea7220cab4dbdd", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48abca2db0f9fcb70aea7220cab4dbdd") : new String[]{"onComponentStart", "onPageStart", "onKNBJSCall", "onPageLoad", "onComponentClose"};
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.module.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28293dd000c5711a6530473f717753f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28293dd000c5711a6530473f717753f7");
            return;
        }
        super.a(cVar);
        this.j = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(d(), "timing"), 0);
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d76133ae2a70d1b9639c8d7afccce5a", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d76133ae2a70d1b9639c8d7afccce5a") : a(this.d.j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        char c;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b2aa8b94623864a01fbdf254b994fa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b2aa8b94623864a01fbdf254b994fa9");
            return;
        }
        String a2 = aVar.a();
        switch (a2.hashCode()) {
            case -1011630009:
                if (a2.equals("onKNBJSCall")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -665788652:
                if (a2.equals("onPageLoad")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 842002420:
                if (a2.equals("onPageStart")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2129465018:
                if (a2.equals("onComponentClose")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2144466212:
                if (a2.equals("onComponentStart")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.b = System.currentTimeMillis();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27637ef4cf01bed8799a6e10cc2ac996", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27637ef4cf01bed8799a6e10cc2ac996");
                } else {
                    a("ehc.page.start", (Map<String, Object>) null);
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8c174419f0650d23800e0f1ee68d718", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8c174419f0650d23800e0f1ee68d718");
                } else {
                    this.p = new b.a() { // from class: com.sankuai.eh.component.web.plugins.core.d.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.eh.component.service.tools.b.a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1344bfebda6a498059019b289025c747", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1344bfebda6a498059019b289025c747");
                                return;
                            }
                            d.this.i++;
                            d.a(d.this, "ehc.app.foreground");
                            d.this.g = false;
                        }

                        @Override // com.sankuai.eh.component.service.tools.b.a
                        public final void b() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "71b9373141f4c4b625718f73cabdd58d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "71b9373141f4c4b625718f73cabdd58d");
                                return;
                            }
                            d.this.h++;
                            d.a(d.this, "ehc.app.background");
                            d.this.f = false;
                        }
                    };
                    com.sankuai.eh.component.service.tools.b a3 = com.sankuai.eh.component.service.tools.b.a();
                    b.a aVar2 = this.p;
                    Object[] objArr4 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.component.service.tools.b.a;
                    if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "8e7a8b8423dccb28b39e027c917aa0fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "8e7a8b8423dccb28b39e027c917aa0fe");
                    } else {
                        a3.f.push(new WeakReference<>(aVar2));
                    }
                }
                a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(this.d.j, "pattern"), ""));
                JsonElement jsonElement = this.d.j;
                Object[] objArr5 = {jsonElement};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                this.o = PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2eb234b246123b388fb88219a09e8f9f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2eb234b246123b388fb88219a09e8f9f")).booleanValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(jsonElement, "data", "metricsReportToRaptor"), "enabled"), false).booleanValue();
                if (this.o) {
                    new d.c().a(e.a("ehc.moduleStart", this.d.j)).a("host", "webview").a("category", "ehc").b();
                    return;
                }
                return;
            case 1:
                if ("ehshow".equals(aVar.b())) {
                    this.m = true;
                    if (this.n == 0) {
                        this.n = System.currentTimeMillis() - this.b;
                    }
                    a(com.sankuai.eh.component.service.utils.e.b(a(aVar, "url")));
                    a(0, f.c(aVar.d()));
                    return;
                }
                return;
            case 2:
                this.l = true;
                Object[] objArr6 = {1};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4fde5735eb342ae66ed01769c8484d42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4fde5735eb342ae66ed01769c8484d42");
                    return;
                } else {
                    a(1, (Map<String, Object>) null);
                    return;
                }
            case 3:
                a(com.sankuai.eh.component.service.utils.e.b(a(aVar, "url")));
                if (this.o) {
                    new d.c().a(e.a("ehc.pageStart", this.d.j)).b();
                    return;
                }
                return;
            case 4:
                if (!this.k) {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4bcf56af7d6b9aca9c6ab83367c7d534", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4bcf56af7d6b9aca9c6ab83367c7d534");
                    } else {
                        a("ehc.page.close", new d.b().a("isTTI", Boolean.valueOf(this.m)).a("isLoad", Boolean.valueOf(this.l)).a("firstBackground", Boolean.valueOf(this.f)).a("firstForeground", Boolean.valueOf(this.g)).a("onBackgroundTimes", Integer.valueOf(this.h)).a("onForegroundTimes", Integer.valueOf(this.i)).b);
                        if (this.o) {
                            new d.c().a(e.a("ehc.moduleClose", this.d.j)).a("isTTI", String.valueOf(this.m)).a("isLoad", String.valueOf(this.l)).a("firstBackground", String.valueOf(this.f)).a("firstForeground", String.valueOf(this.g)).a("onBackgroundTimes", String.valueOf(this.h)).a("onForegroundTimes", String.valueOf(this.i)).b();
                        }
                    }
                }
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "33ffa59cbc488da6dbf54e5f4dbfad73", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "33ffa59cbc488da6dbf54e5f4dbfad73");
                    return;
                }
                com.sankuai.eh.component.service.tools.b a4 = com.sankuai.eh.component.service.tools.b.a();
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.eh.component.service.tools.b.a;
                if (PatchProxy.isSupport(objArr9, a4, changeQuickRedirect9, false, "50a6646cfb35015b93d679b6e77d331a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, a4, changeQuickRedirect9, false, "50a6646cfb35015b93d679b6e77d331a");
                    return;
                } else if (a4.f.size() > 0) {
                    a4.f.pop();
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a320b85e9d0b779ef45673297e854f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a320b85e9d0b779ef45673297e854f8");
        } else {
            this.d.a(new a.C0554a().a(System.currentTimeMillis()).a(str).b);
        }
    }

    private void a(int i, Map<String, Object> map) {
        Object[] objArr = {Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3014365fb00577d748017968195356e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3014365fb00577d748017968195356e");
        } else if (i != this.j || this.k) {
        } else {
            this.k = true;
            a("ehc.page.load", new d.b().a("loadType", i == 0 ? "tti" : "load").a("isTTI", Boolean.valueOf(this.m)).a("isLoad", Boolean.valueOf(this.l)).a("firstBackground", Boolean.valueOf(this.f)).a("firstForeground", Boolean.valueOf(this.g)).a("onBackgroundTimes", Integer.valueOf(this.h)).a("onForegroundTimes", Integer.valueOf(this.i)).a(map).b);
            if (this.o) {
                new d.c().a(e.a("ehc.pageLoad", this.d.j)).a("loadType", i == 0 ? "tti" : "load").a("isTTI", String.valueOf(this.m)).a("isLoad", String.valueOf(this.l)).a("firstBackground", String.valueOf(this.f)).a("firstForeground", String.valueOf(this.g)).a("onBackgroundTimes", String.valueOf(this.h)).a("onForegroundTimes", String.valueOf(this.i)).a(map).a().b();
            }
        }
    }

    private void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "517491bb07e2b779851bb90f7c207d85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "517491bb07e2b779851bb90f7c207d85");
            return;
        }
        JsonArray jsonArray = new JsonArray();
        for (com.sankuai.eh.component.web.model.a aVar : this.d.e) {
            jsonArray.add(com.sankuai.eh.component.service.utils.b.a(aVar.a()));
        }
        com.sankuai.eh.component.service.tools.d.b(str, new d.b().a("function", "ehc.route.flow").a("history", jsonArray.toString()).a("timing", Integer.valueOf(this.j)).a(map).a(this.d.a()).b, Long.valueOf(f.a(this.b)));
    }

    public static JsonElement a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ae9b517c4eff651b7ffd7e33d7f3d18", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ae9b517c4eff651b7ffd7e33d7f3d18") : com.sankuai.eh.component.service.utils.b.a(jsonElement, "data", "routeFlow");
    }
}
