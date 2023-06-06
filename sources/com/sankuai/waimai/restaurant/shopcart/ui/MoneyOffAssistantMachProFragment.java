package com.sankuai.waimai.restaurant.shopcart.ui;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.WMCustomMachProFragment;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MoneyOffAssistantMachProFragment extends WMCustomMachProFragment {
    public static ChangeQuickRedirect a;

    public static MoneyOffAssistantMachProFragment a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d55048a114d99fa303a913b5a35557e", RobustBitConfig.DEFAULT_VALUE)) {
            return (MoneyOffAssistantMachProFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d55048a114d99fa303a913b5a35557e");
        }
        MoneyOffAssistantMachProFragment moneyOffAssistantMachProFragment = new MoneyOffAssistantMachProFragment();
        Bundle bundle = new Bundle();
        bundle.putString("bundle_name", "mach_pro_waimai_restaurant_recommend_helper");
        bundle.putString("biz", "waimai");
        bundle.putString("entranceTip", str);
        moneyOffAssistantMachProFragment.setArguments(bundle);
        return moneyOffAssistantMachProFragment;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final MachMap a() {
        com.sankuai.waimai.business.restaurant.base.domain.moneyoff.a aVar;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe22e1cb6b8f9998ed20b8956346e7c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe22e1cb6b8f9998ed20b8956346e7c7");
        }
        MachMap a2 = super.a();
        if (a2 == null) {
            a2 = new MachMap();
        }
        Context context = getContext();
        if (context instanceof WMRestaurantActivity) {
            com.sankuai.waimai.business.restaurant.base.manager.order.g gVar = ((WMRestaurantActivity) context).e.u.a().b;
            String f = gVar.f();
            Object[] objArr2 = {f};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9f4cabe4fa90301252985b1e63d664d", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (com.sankuai.waimai.business.restaurant.base.domain.moneyoff.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9f4cabe4fa90301252985b1e63d664d");
            } else {
                aVar = new com.sankuai.waimai.business.restaurant.base.domain.moneyoff.a();
                aVar.a = com.sankuai.waimai.business.restaurant.poicontainer.utils.b.a(f);
            }
            String json = new Gson().toJson(aVar);
            StringBuilder sb = new StringBuilder();
            sb.append(com.sankuai.waimai.platform.domain.core.poi.b.a(f));
            a2.put("wm_poi_id", sb.toString());
            a2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, f);
            a2.put("cart_info", json);
            a2.put("btn_title", getArguments().getString("entranceTip"));
            Poi poi = gVar.g;
            Object[] objArr3 = {poi};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b60875b99b1948122bb0ebb01aaf397a", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b60875b99b1948122bb0ebb01aaf397a")).intValue();
            } else if (poi != null) {
                i = poi.getState();
            }
            a2.put("poi_status", Integer.valueOf(i));
        }
        return a2;
    }
}
