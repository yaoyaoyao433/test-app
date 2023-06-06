package com.sankuai.waimai.restaurant.shopcart.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.WMCustomMachProFragment;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.restaurant.shopcart.ui.b;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DiscountDetailMachProFragment extends WMCustomMachProFragment implements com.sankuai.waimai.machpro.h {
    public static ChangeQuickRedirect a;
    private static b.a d;

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.WMCustomMachProFragment, com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public View onCreateView(@NonNull @NotNull LayoutInflater layoutInflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup viewGroup, @Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe154de4d506326b7db0693bd077c2ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe154de4d506326b7db0693bd077c2ad");
        }
        a((com.sankuai.waimai.machpro.h) this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public static DiscountDetailMachProFragment a(b.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c09fd9ee071b4e6f85be6100bfa3b62", RobustBitConfig.DEFAULT_VALUE)) {
            return (DiscountDetailMachProFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c09fd9ee071b4e6f85be6100bfa3b62");
        }
        DiscountDetailMachProFragment discountDetailMachProFragment = new DiscountDetailMachProFragment();
        Bundle bundle = new Bundle();
        bundle.putString("bundle_name", "mach_pro_waimai_restaurant_reduce_detail");
        bundle.putString("biz", "waimai");
        bundle.putLong("poi_id", com.sankuai.waimai.platform.domain.core.poi.b.a(str));
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        d = aVar;
        discountDetailMachProFragment.setArguments(bundle);
        return discountDetailMachProFragment;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final MachMap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce9737d5734f32a97729a28d64c1cc79", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce9737d5734f32a97729a28d64c1cc79");
        }
        MachMap a2 = super.a();
        if (a2 == null) {
            a2 = new MachMap();
        }
        String str = (String) getArguments().get(FoodDetailNetWorkPreLoader.URI_POI_STR);
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(str);
            a2.put("origin_total_price", Double.valueOf(n.e.mTotalAndBoxPrice));
            a2.put("total_price", Double.valueOf(n.e.mTotalDiscountedAndBoxPrice));
            a2.put("total_box_price", n.e.totalBoxPrice);
            a2.put("toast", n.i().c);
            a2.put("activity_benefits_info", n.D);
            a2.put("bottom_dock_height", 90);
        }
        return a2;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e04666802c0552071a60ff39fc2532", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e04666802c0552071a60ff39fc2532");
            return;
        }
        super.onDestroy();
        b(this);
    }

    @Override // com.sankuai.waimai.machpro.h
    public final void a(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b76cbc3cf36b5212ca6e9a5af9f8422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b76cbc3cf36b5212ca6e9a5af9f8422");
        } else if (d != null) {
            if ("close".equals(str)) {
                if (machMap != null) {
                    String str2 = (String) machMap.get("url");
                    if (!TextUtils.isEmpty(str2)) {
                        com.sankuai.waimai.foundation.router.a.a(getActivity(), str2);
                    }
                }
                d.b();
            } else if ("ready".equals(str)) {
                d.a();
            }
        }
    }
}
