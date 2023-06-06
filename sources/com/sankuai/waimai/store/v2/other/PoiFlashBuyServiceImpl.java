package com.sankuai.waimai.store.v2.other;

import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.i.poi.PoiFlashBuyService;
import com.sankuai.waimai.store.mach.event.a;
import com.sankuai.waimai.store.orderlist.OrderListFragment;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiFlashBuyServiceImpl implements PoiFlashBuyService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.i.poi.PoiFlashBuyService
    public Fragment getOrderListFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21076d86f2aa638581d7bdcbd8f3907e", RobustBitConfig.DEFAULT_VALUE) ? (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21076d86f2aa638581d7bdcbd8f3907e") : new OrderListFragment();
    }

    @Override // com.sankuai.waimai.store.i.poi.PoiFlashBuyService
    public void dealWithAddShopCart(SCBaseActivity sCBaseActivity, a aVar, Map<String, Object> map) {
        Object[] objArr = {sCBaseActivity, aVar, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87ec5df11bc3a27c93a1c999b7e097ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87ec5df11bc3a27c93a1c999b7e097ef");
        } else {
            com.sankuai.waimai.store.goods.subscribe.a.a(sCBaseActivity, aVar, map);
        }
    }
}
