package com.meituan.android.ptcommonim.wminit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.init.IMSdkInitService;
import com.sankuai.waimai.imbase.init.model.a;
import com.sankuai.waimai.imbase.init.model.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTIMInitWM implements IMSdkInitService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public a createReceiveConfig() {
        return null;
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public b createSessionConfig() {
        return null;
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public void onInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d634be2385e8a02d0ed8c2b2f82bfc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d634be2385e8a02d0ed8c2b2f82bfc4");
        } else {
            com.meituan.android.ptcommonim.a.a().a(com.meituan.android.singleton.b.a);
        }
    }
}
