package com.sankuai.eh.component.web.plugins;

import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class h extends b {
    public static ChangeQuickRedirect a;
    private JsonElement b;
    private boolean f;

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "00";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "res_fetch";
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "369dae60efaec6e05fbbe7b47ecf3034", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "369dae60efaec6e05fbbe7b47ecf3034");
        } else {
            this.f = false;
        }
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5b8499b116d1e2f3cc9d7301b2db95", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5b8499b116d1e2f3cc9d7301b2db95") : com.sankuai.eh.component.service.database.d.b("res_fetch", com.sankuai.eh.component.service.utils.b.c(this.e.e, "data"));
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement Y_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7af322c524743f955f1ab3c34bc1b4b", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7af322c524743f955f1ab3c34bc1b4b") : com.sankuai.eh.component.service.database.d.a("res_fetch", com.sankuai.eh.component.service.utils.b.c(this.e.e, "data"));
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae7e1d176e070e99cca0da7b594dfd1", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae7e1d176e070e99cca0da7b594dfd1") : new String[]{"onPageLoad", "onKNBJSCall"};
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.module.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d5484d028f550798d6c3aa68a63aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d5484d028f550798d6c3aa68a63aba");
            return;
        }
        super.a(cVar);
        this.b = d();
        com.sankuai.eh.plugins.preload.a.a().d = Y_();
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beff6091d3a8865747d9ab4bdee34895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beff6091d3a8865747d9ab4bdee34895");
        } else if (this.f) {
        } else {
            int a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.b, "timing"), 1);
            String a3 = aVar.a();
            char c = 65535;
            int hashCode = a3.hashCode();
            if (hashCode != -1011630009) {
                if (hashCode == -665788652 && a3.equals("onPageLoad")) {
                    c = 0;
                }
            } else if (a3.equals("onKNBJSCall")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    if (a2 == 2) {
                        com.sankuai.eh.plugins.preload.a.a().a((String) this.e.b("pattern", this.e.b), this.b, 2);
                        this.f = true;
                        return;
                    }
                    return;
                case 1:
                    if ("ehshow".equals(aVar.b()) && a2 == 1) {
                        com.sankuai.eh.plugins.preload.a.a().a((String) this.e.b("pattern", this.e.b), this.b, 1);
                        this.f = true;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
