package com.sankuai.waimai.business.page.home.againstcheating;

import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.domain.manager.home.AgainstCheatingProvider;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AgainstCheatingProviderImpl implements AgainstCheatingProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.domain.manager.home.AgainstCheatingProvider
    public void syncUpload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05efff747a0b507bd146eb19dbae1e69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05efff747a0b507bd146eb19dbae1e69");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "bb3a175ec9d85a1b2de7f5e8b5fe1d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "bb3a175ec9d85a1b2de7f5e8b5fe1d3a");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.againstcheating.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "25a240140b4833b46cccb75b72c062c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "25a240140b4833b46cccb75b72c062c7");
                    } else {
                        a.a(MarketingModel.TYPE_ENTER_DIALOG);
                    }
                }
            }, MetricsAnrManager.ANR_THRESHOLD);
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.home.AgainstCheatingProvider
    public void upload(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44cdcde6083e71bcb16a3b70b3fbd0d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44cdcde6083e71bcb16a3b70b3fbd0d9");
        } else {
            a.a(str);
        }
    }
}
