package com.sankuai.eh.component.web.plugins.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.web.module.e;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.sankuai.eh.component.web.plugins.b {
    public static ChangeQuickRedirect a;
    private boolean b;
    private long f;

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "11";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return null;
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "706833027270d8b061a6a20c19979d5c", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "706833027270d8b061a6a20c19979d5c") : new String[]{"onComponentStart", "onModuleLoad", "onComponentClose"};
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        char c;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d18c9070f78084a150a53966057c9af2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d18c9070f78084a150a53966057c9af2");
            return;
        }
        String a2 = aVar.a();
        int hashCode = a2.hashCode();
        if (hashCode == -1824773967) {
            if (a2.equals("onModuleLoad")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 2129465018) {
            if (hashCode == 2144466212 && a2.equals("onComponentStart")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (a2.equals("onComponentClose")) {
                c = 2;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                this.f = System.currentTimeMillis();
                this.d.b("route_startTime", Long.valueOf(this.f));
                this.d.a("currentUrl", this.d.h);
                d.b a3 = new d.b().a("name", "ehc.module.start");
                int i = com.sankuai.eh.component.service.tools.d.c;
                com.sankuai.eh.component.service.tools.d.c = i + 1;
                com.sankuai.eh.component.service.tools.d.a("ehc_start", a3.a("ehcIndex", Integer.valueOf(i)).a("from", com.sankuai.eh.component.service.tools.b.a().c()).a(i()).b);
                e.b(this.d.h, this.d.j);
                new d.c().a("ehc.module.start.ehc").b();
                return;
            case 1:
                if (this.b) {
                    return;
                }
                this.b = true;
                com.sankuai.eh.component.service.tools.d.a("ehc_start", new d.b().a("name", "ehc.module.load").a(i()).b, Long.valueOf(f.a(this.f)));
                com.sankuai.eh.component.service.tools.b.a().d = this.d.a();
                return;
            case 2:
                com.sankuai.eh.component.service.tools.d.a("ehc_close", new d.b().a("name", "ehc.module.close").a(i()).b, Long.valueOf(f.a(this.f)));
                if (((Boolean) this.d.c("onBackPressed", Boolean.FALSE)).booleanValue() || com.sankuai.eh.component.service.tools.b.a().b || f.a(this.f) >= 1000) {
                    return;
                }
                new d.c().a(e.a("special", this.d.j)).a("type", d.EnumC0550d.FLASH_BACK.a()).a().b();
                return;
            default:
                return;
        }
    }

    private Map<String, Object> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a1a53da4d9e79400b99e4b1fcb7fcff", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a1a53da4d9e79400b99e4b1fcb7fcff") : new d.b().a("pattern", com.sankuai.eh.component.service.utils.b.a(this.d.j, "pattern")).a("url", this.d.h).a(this.d.t).b;
    }
}
