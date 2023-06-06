package com.sankuai.waimai.store.im;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.init.IMSdkInitService;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMUserGroupSDKInitService implements IMSdkInitService {
    public static final String TAG = "SGIMUserGroupSDKInitService";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public void onInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2e896f5f41a1647fbf3e412103e84fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2e896f5f41a1647fbf3e412103e84fe");
            return;
        }
        com.sankuai.waimai.imbase.configuration.a.a().a((short) 1029, R.style.wm_im_theme);
        com.sankuai.xm.ui.a.a().a((short) 1029, (com.sankuai.xm.im.desensitization.c) new e());
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.a createReceiveConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb2d8e0b6db6a4d1aac41b3b5641ebb6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb2d8e0b6db6a4d1aac41b3b5641ebb6") : new com.sankuai.waimai.store.im.push.a();
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.b createSessionConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1e25e5d47f64481e2c1b39f7e14e923", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1e25e5d47f64481e2c1b39f7e14e923") : new com.sankuai.waimai.imbase.init.model.b((short) 1029, new com.sankuai.waimai.imbase.listener.b() { // from class: com.sankuai.waimai.store.im.SGIMUserGroupSDKInitService.1
            @Override // com.sankuai.waimai.imbase.listener.b
            public final com.sankuai.waimai.imbase.listener.model.b a(com.sankuai.xm.im.session.entry.a aVar) {
                return null;
            }
        });
    }
}
