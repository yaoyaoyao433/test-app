package com.sankuai.eh.plugins.dynamic;

import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.database.b;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.f;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static long b;
    public JsonElement c;
    com.sankuai.eh.plugins.a d;

    public static /* synthetic */ void a(a aVar, String str, b.a aVar2) {
        Object[] objArr = {str, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "dee7fda0318f85eaa00ab74f32f7c917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "dee7fda0318f85eaa00ab74f32f7c917");
        } else {
            com.sankuai.eh.component.service.network.a.a(false).callDynamic(str, aVar.a()).a(aVar2);
        }
    }

    public a(JsonElement jsonElement, com.sankuai.eh.plugins.a aVar) {
        Object[] objArr = {jsonElement, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ec0bbf223d02b75ddfa6f32515c7688", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ec0bbf223d02b75ddfa6f32515c7688");
            return;
        }
        this.c = jsonElement;
        this.d = aVar;
    }

    public Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd88c6c8a6a5ea2ab252af3fb7082dc", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd88c6c8a6a5ea2ab252af3fb7082dc") : new d.b().a("id", com.sankuai.eh.component.service.a.c().f()).a(f.h()).b;
    }
}
