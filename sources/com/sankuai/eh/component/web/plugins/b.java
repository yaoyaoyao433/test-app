package com.sankuai.eh.component.web.plugins;

import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b implements e {
    public static ChangeQuickRedirect c;
    private long a;
    public com.sankuai.eh.component.web.module.c d;
    protected com.sankuai.eh.component.web.module.h e;

    public JsonElement Y_() {
        return null;
    }

    public JsonElement d() {
        return null;
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public void f() {
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public void a(com.sankuai.eh.component.web.module.c cVar) {
        this.d = cVar;
        this.e = cVar.f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.eh.component.web.plugins.e
    public boolean g() {
        char c2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da17575adc3aa547c0eaea03f0a1dd5a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da17575adc3aa547c0eaea03f0a1dd5a")).booleanValue();
        }
        String a = a();
        switch (a.hashCode()) {
            case 1536:
                if (a.equals("00")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1537:
                if (a.equals("01")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1567:
                if (a.equals("10")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1568:
                if (a.equals("11")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return this.d != null;
            case 2:
            case 3:
                return (this.d == null || this.d.f == null) ? false : true;
            default:
                return false;
        }
    }

    public final String a(com.sankuai.eh.component.web.plugins.api.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4f077463d3b6268fbecf846e95984a6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4f077463d3b6268fbecf846e95984a6") : (aVar == null || aVar.c() == null) ? "" : aVar.c().optString(str);
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366f0194537a397a6e0ab0348be18a03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366f0194537a397a6e0ab0348be18a03");
        } else {
            a(new d.b().a("plugin", b()).b);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1334938297472cc4402ab591de282492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1334938297472cc4402ab591de282492");
        } else {
            b(new d.b().a("plugin", b()).a("status", Boolean.valueOf(z)).b);
        }
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b89de1280ffe3b9c5fbc80345538dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b89de1280ffe3b9c5fbc80345538dd");
            return;
        }
        this.a = System.currentTimeMillis();
        com.sankuai.eh.component.service.tools.d.a("plugin_start", new d.b().a("name", "ehc.plugin.start").a(this.d.a()).a(map).b);
    }

    public final void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ccf5d56142f6d3b6d6913c0aa166bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ccf5d56142f6d3b6d6913c0aa166bc");
        } else {
            com.sankuai.eh.component.service.tools.d.a("plugin_finish", new d.b().a("name", "ehc.plugin.finish").a(this.d.a()).a(map).b, Long.valueOf(com.sankuai.eh.component.service.utils.f.a(this.a)));
        }
    }
}
