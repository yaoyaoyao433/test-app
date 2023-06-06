package com.sankuai.waimai.store.search.statistics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static d b = new d();

    public static d a() {
        return b;
    }

    public final void a(com.sankuai.waimai.mach.recycler.c cVar, Map<String, Object> map) {
        Object[] objArr = {cVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390c1de930827982c224449d27fda3f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390c1de930827982c224449d27fda3f1");
        } else if (cVar == null || map == null || !"supermarket-drug-search-compare-price".equals(cVar.a())) {
        } else {
            Object a2 = cVar.a("mach_extra_key_upc_index");
            map.put("UPC_card_index", Integer.valueOf(a2 instanceof Integer ? ((Integer) a2).intValue() : -999));
        }
    }

    public final void a(com.sankuai.waimai.mach.recycler.c cVar, Map<String, Object> map, BaseProductPoi baseProductPoi) {
        Object[] objArr = {cVar, map, baseProductPoi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d961f38e575f968b16d6502fa50bfa12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d961f38e575f968b16d6502fa50bfa12");
        } else if (cVar == null || map == null || baseProductPoi == null) {
        } else {
            if ("supermarket-search-product".equals(cVar.a()) || "supermarket-search-product-recommend".equals(cVar.a())) {
                map.put("shangou_incard_index", Integer.valueOf(baseProductPoi.getInCardIndex()));
                map.put("outcard_index", Integer.valueOf(baseProductPoi.outCardIndex));
                map.put("incard_index", Integer.valueOf(baseProductPoi.inCardIndex));
            }
        }
    }
}
