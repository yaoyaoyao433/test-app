package com.sankuai.waimai.store.poi.list.newp.methods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ee02c1657fb9578a7884b32b32ed52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ee02c1657fb9578a7884b32b32ed52");
        } else if (!"user_coupon_refrsh".equals(str) || p.a(map)) {
        } else {
            JSONObject jSONObject = new JSONObject(map);
            if (p.a(jSONObject)) {
                return;
            }
            com.sankuai.waimai.store.manager.coupon.c.a().a((Poi.PoiCouponItem) com.sankuai.waimai.store.util.i.a(jSONObject.toString(), Poi.PoiCouponItem.class));
        }
    }
}
