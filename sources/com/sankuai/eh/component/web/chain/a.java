package com.sankuai.eh.component.web.chain;

import android.os.Build;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.component.web.chain.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.sankuai.eh.component.web.plugins.b {
    public static ChangeQuickRedirect a;
    JsonArray b;
    private String f;
    private boolean g;

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "11";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "recorder";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c471d9971c992b2c90058a2a37e295e9", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c471d9971c992b2c90058a2a37e295e9") : new String[]{"onComponentStart", "onModuleStart", "onModuleLoad", "onActivityCreated", "onOverrideLoad", "onModuleClose", "onComponentClose"};
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.module.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b87808629f854cbc0333c3760e0c52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b87808629f854cbc0333c3760e0c52");
            return;
        }
        super.a(cVar);
        this.b = new JsonArray();
        this.f = com.sankuai.eh.component.service.utils.d.a((Object) cVar.i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        char c;
        JsonElement a2;
        boolean z;
        JsonElement jsonElement;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0aa566897a53f77a8ef89882c3c005e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0aa566897a53f77a8ef89882c3c005e");
            return;
        }
        String a3 = aVar.a();
        switch (a3.hashCode()) {
            case -1824773967:
                if (a3.equals("onModuleLoad")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -741805171:
                if (a3.equals("onModuleClose")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -726803977:
                if (a3.equals("onModuleStart")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 126661882:
                if (a3.equals("onActivityCreated")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2033392209:
                if (a3.equals("onOverrideLoad")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2129465018:
                if (a3.equals("onComponentClose")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2144466212:
                if (a3.equals("onComponentStart")) {
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
                h();
                com.sankuai.eh.component.service.tools.d.c();
                a("native", "EHCreate:" + this.d.g);
                a("plugin", this.d.c());
                return;
            case 1:
                a("native", "EHWebCreate");
                return;
            case 2:
                if (this.g) {
                    return;
                }
                this.g = true;
                a("native", "EHAppear");
                return;
            case 3:
                a("native", "EHLoadPage:" + com.sankuai.eh.component.service.utils.e.b(a(aVar, "url")));
                return;
            case 4:
                a("h5", "override:" + a(aVar, "url"));
                return;
            case 5:
                a("native", "EHWebDestroy");
                f.a(this.f, f.a.VAL_LAB.i, com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(this.d.a())));
                return;
            case 6:
                a("native", "EHContainerDestroy");
                f.a(this.f, f.a.LIFECYCLE.i, this.b);
                String str = this.f;
                String str2 = f.a.ENV.i;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6b93aca4899f42ff6e1e6763fc21b2f", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (JsonElement) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6b93aca4899f42ff6e1e6763fc21b2f");
                } else {
                    d.b bVar = new d.b();
                    String str3 = (String) this.d.c("ua", "");
                    if (TextUtils.isEmpty(str3)) {
                        bVar.a(com.sankuai.eh.component.service.utils.f.g());
                    }
                    bVar.a("ua", str3).a("uuid", com.sankuai.eh.component.service.a.c().f()).a("device", Build.DEVICE).a("date", com.sankuai.eh.component.service.utils.d.a(System.currentTimeMillis()));
                    a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(bVar.b));
                }
                f.a(str, str2, a2);
                f.a(this.f, f.a.REFERENCE.i, "error_native", com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.tools.d.d()));
                f.a(this.f, f.a.REFERENCE.i, "timing_other", c.a((String) this.d.c("pageUrl", "unknown")));
                f.a(this.f, f.a.REFERENCE.i, "timing_self", c.c((String) this.d.c("pageUrl", "unknown")));
                String str4 = this.f;
                String str5 = f.a.REFERENCE.i;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "46a54f32240fc45b933526987c8718fa", RobustBitConfig.DEFAULT_VALUE)) {
                    jsonElement = (JsonElement) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "46a54f32240fc45b933526987c8718fa");
                } else {
                    b.a aVar2 = new b.a();
                    aVar2.a(PackageLoadReporter.Source.LAUNCH, com.sankuai.eh.component.service.utils.d.a(com.sankuai.eh.component.web.b.a()));
                    aVar2.a("foreground", com.sankuai.eh.component.service.utils.d.a(com.sankuai.eh.component.service.tools.b.a().c));
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.component.service.utils.d.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "22a523eef7539f118473fd93da84e1af", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "22a523eef7539f118473fd93da84e1af")).booleanValue();
                    } else {
                        String property = System.getProperty("http.proxyHost");
                        String property2 = System.getProperty("http.proxyPort");
                        if (property2 == null) {
                            property2 = "-1";
                        }
                        z = (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
                    }
                    aVar2.a(NetLogConstants.Details.PROXY, z);
                    aVar2.a("stack", com.sankuai.eh.component.service.utils.b.a(c.a()));
                    jsonElement = aVar2.b;
                }
                f.a(str4, str5, "runtime", jsonElement);
                com.sankuai.eh.component.service.tools.d.c();
                a(true);
                return;
            default:
                return;
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f68f053d9fa2549f489fa73ceffb724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f68f053d9fa2549f489fa73ceffb724");
            return;
        }
        b.a a2 = new b.a().a("t", com.sankuai.eh.component.service.utils.d.c()).a("type", str);
        a2.a("msg", str2);
        this.b.add(a2.b);
    }
}
