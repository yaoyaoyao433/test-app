package com.sankuai.waimai.restaurant.shopcart.ui;

import android.content.Context;
import android.os.Bundle;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.container.MPBaseFragment;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiDetailMachProFragment extends MPBaseFragment {
    public static ChangeQuickRedirect a;

    public static PoiDetailMachProFragment e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf7110429352f1db50b96ed46ae0423b", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiDetailMachProFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf7110429352f1db50b96ed46ae0423b");
        }
        PoiDetailMachProFragment poiDetailMachProFragment = new PoiDetailMachProFragment();
        Bundle bundle = new Bundle();
        bundle.putString("bundle_name", "mach_pro_waimai_restaurant_poi_detail");
        bundle.putString("biz", "waimai");
        poiDetailMachProFragment.setArguments(bundle);
        return poiDetailMachProFragment;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final MachMap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dae8b984f1af63973d94812b7c5a80c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dae8b984f1af63973d94812b7c5a80c9");
        }
        MachMap a2 = super.a();
        if (a2 == null) {
            a2 = new MachMap();
        }
        Context context = getContext();
        if (context instanceof WMRestaurantActivity) {
            com.sankuai.waimai.business.restaurant.base.manager.order.g gVar = ((WMRestaurantActivity) context).e.u.a().b;
            int i = 1;
            Object[] objArr2 = {gVar, a2};
            ChangeQuickRedirect changeQuickRedirect2 = u.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9c669d117828a78ac6e9267308405865", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9c669d117828a78ac6e9267308405865");
            } else if (gVar != null) {
                String f = gVar.f();
                i = (gVar.o == 1 || gVar.o == 2) ? 2 : 2;
                String str = "";
                String str2 = "";
                if (gVar != null && !com.sankuai.waimai.foundation.utils.aa.a(gVar.b())) {
                    str = gVar.b();
                }
                if (gVar != null && !com.sankuai.waimai.foundation.utils.aa.a(gVar.c())) {
                    str2 = gVar.c();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(com.sankuai.waimai.platform.domain.core.poi.b.a(f));
                a2.put("wm_poi_id", sb.toString());
                a2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, f);
                a2.put("business_type", Integer.valueOf(gVar.o));
                a2.put(FoodDetailNetWorkPreLoader.INTENT_REFERER_SOURCE, Integer.valueOf(i));
                a2.put("allowance_alliance_scenes", str);
                a2.put("ad_activity_flag", str2);
                WMLocation p = com.sankuai.waimai.foundation.location.v2.g.a().p();
                if (p != null) {
                    a2.put("user_latitude", Double.valueOf(p.getLatitude()));
                    a2.put("user_longitude", Double.valueOf(p.getLongitude()));
                }
                a2.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(gVar.s()));
            }
        }
        return a2;
    }
}
