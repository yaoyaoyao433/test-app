package com.sankuai.waimai.store.shopping.cart;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.order.d;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private Activity b;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private SCPageConfig d;
    private String e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(d.a aVar);

        void a(JSONObject jSONObject, JSONObject jSONObject2);
    }

    public c(Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, String str) {
        Object[] objArr = {activity, aVar, sCPageConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd20bc45c0dc45d751542d64a9bff24c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd20bc45c0dc45d751542d64a9bff24c");
            return;
        }
        this.b = activity;
        this.c = aVar;
        this.d = sCPageConfig;
        this.e = str;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b13942c8e9b204abb71dd458e8a233", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b13942c8e9b204abb71dd458e8a233");
            return;
        }
        d.a aVar2 = new d.a();
        aVar2.b = this.b;
        d.a a2 = aVar2.a(this.c.g());
        a2.c = this.c.h();
        a2.d = this.c.i();
        a2.f = this.e;
        a2.h = this.d.f;
        a2.k = com.sankuai.waimai.store.manager.globalcart.a.a().b();
        a2.j = false;
        a2.g = this.d.e == 9 ? "from_drug_restaurant" : "from_sc_restaurant";
        a2.m = b(aVar);
        aVar.a(aVar2);
        com.sankuai.waimai.store.manager.order.b.a(aVar2.a(), this.c.t());
    }

    private String b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19de7e2d87c07337fc40a0b444cf96e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19de7e2d87c07337fc40a0b444cf96e0");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject H = this.c.H();
            if (aVar != null) {
                aVar.a(H, jSONObject);
            }
            jSONObject.put("preview_order_callback_info", H);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        return jSONObject.toString();
    }
}
