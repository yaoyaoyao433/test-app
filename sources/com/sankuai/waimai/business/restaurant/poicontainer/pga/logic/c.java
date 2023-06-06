package com.sankuai.waimai.business.restaurant.poicontainer.pga.logic;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.RestaurantSchemeParams;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.utils.m;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.viewmodel.a<a> {
    public static ChangeQuickRedirect o;
    g p;
    private com.sankuai.waimai.business.restaurant.poicontainer.pga.b q;

    public c(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super((Context) bVar.b());
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01a656313a2904ccbc6b8540cfca44c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01a656313a2904ccbc6b8540cfca44c2");
        } else {
            this.q = bVar;
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f4af6b23ed949f9f1d73f425315af0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f4af6b23ed949f9f1d73f425315af0");
            return;
        }
        super.d();
        if (this.c == 0) {
            return;
        }
        RestaurantSchemeParams restaurantSchemeParams = this.q.D.a().b;
        try {
            if (((a) this.c).i != null && ((a) this.c).i.a != null && this.d != null) {
                m.a(this.d.getApplicationContext(), ((a) this.c).i.a);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        boolean z = ((a) this.c).b;
        String str = ((a) this.c).c;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, "poi_food_use_dynamic_style"};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "04b156ca6efddeb1f8c7776383338dd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "04b156ca6efddeb1f8c7776383338dd3");
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("useDynamicCard", z);
                jSONObject.put("templateId", str);
                jSONObject.put("RequestParam", com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.g.c().b());
                com.sankuai.waimai.platform.capacity.log.b.a(new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.a("restaurant_dynamic_card", "poi_food_use_dynamic_style").d(jSONObject.toString()).b());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        Poi poi = ((a) this.c).h;
        if (poi != null) {
            if (poi.getState() == 4) {
                return;
            }
            poi.setIsNewUser(((a) this.c).g);
            poi.setAllowanceAllianceScenes(restaurantSchemeParams.mAllowanceAllianceScenes);
            poi.setAdActivityFlag(restaurantSchemeParams.mAdActivityFlag);
            poi.setTemplateType(((a) this.c).a.code);
        }
        this.p.a(poi, 1);
        this.p.e = ((a) this.c).f;
        this.p.a(((a) this.c).n);
        this.p.H = ((a) this.c).a.isDynamic;
        this.p.z = ((a) this.c).o;
        this.p.w = !((a) this.c).h.isInDeliveryRange;
        this.p.C = restaurantSchemeParams.soldOutFlag;
        k.a().a(this.p.f(), this.p);
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(this.p.f());
        if (n != null) {
            n.n = ((a) this.c).q;
            if (n.j()) {
                return;
            }
            this.p.a(true);
        }
    }
}
