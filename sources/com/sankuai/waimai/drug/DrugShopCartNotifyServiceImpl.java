package com.sankuai.waimai.drug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.IDrugShopCartNotifyService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DrugShopCartNotifyServiceImpl implements IDrugShopCartNotifyService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.business.order.api.store.IDrugShopCartNotifyService
    public void notifyDrugGoodsUpdate(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c545127b729a0a20bab08dde08f6cd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c545127b729a0a20bab08dde08f6cd8");
            return;
        }
        com.sankuai.waimai.store.order.a.e().a(str, 1);
        com.sankuai.waimai.store.order.a.e().h(str);
    }
}
