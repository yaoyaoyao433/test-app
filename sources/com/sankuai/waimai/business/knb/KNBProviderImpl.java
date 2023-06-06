package com.sankuai.waimai.business.knb;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.api.IKNBProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBProviderImpl implements IKNBProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.business.knb.api.IKNBProvider
    public void startPreload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "082f86103ccea9646d2f93fe9fdd6c24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "082f86103ccea9646d2f93fe9fdd6c24");
        } else {
            f.b();
        }
    }
}
