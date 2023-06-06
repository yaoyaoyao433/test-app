package com.sankuai.waimai.business.im.group.init;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.init.IMSdkInitService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmImFoodSafetyInitService implements IMSdkInitService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.b createSessionConfig() {
        return null;
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public void onInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7134eb4eced9db5936612abe90c7c1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7134eb4eced9db5936612abe90c7c1b");
        } else {
            com.sankuai.waimai.imbase.configuration.a.a().a((short) 1050, R.style.wm_im_theme);
        }
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.a createReceiveConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77fa004c428de7f20b84d1c776e8245f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77fa004c428de7f20b84d1c776e8245f") : new a();
    }
}
