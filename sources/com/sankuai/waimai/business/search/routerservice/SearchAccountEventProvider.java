package com.sankuai.waimai.business.search.routerservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.db.logic.PoiSearchHistoryLogic;
import com.sankuai.waimai.platform.provider.AccountEventProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SearchAccountEventProvider implements AccountEventProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.provider.AccountEventProvider
    public void logOff() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d0337fb8b283a68861160c8c3762ca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d0337fb8b283a68861160c8c3762ca4");
        } else {
            PoiSearchHistoryLogic.clearHistory();
        }
    }
}
