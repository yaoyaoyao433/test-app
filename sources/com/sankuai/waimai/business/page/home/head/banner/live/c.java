package com.sankuai.waimai.business.page.home.head.banner.live;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.viewmodel.a<LiveBannerResponse> {
    public static ChangeQuickRedirect o;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "187cbc97b1ad411d780972d67d9a0ab7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "187cbc97b1ad411d780972d67d9a0ab7");
        }
        if (e() == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(f().windowCardInfo != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.viewmodel.a
    /* renamed from: n */
    public LiveBannerResponse f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65e0ad3f580409b6add7b2bc77e50b74", RobustBitConfig.DEFAULT_VALUE) ? (LiveBannerResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65e0ad3f580409b6add7b2bc77e50b74") : e();
    }
}
