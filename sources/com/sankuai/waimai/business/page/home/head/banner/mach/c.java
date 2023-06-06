package com.sankuai.waimai.business.page.home.head.banner.mach;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.viewmodel.a<HomeNewHeadResponse> {
    public static ChangeQuickRedirect o;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final /* synthetic */ Object f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82b1a3af064dd7302ab18c3bb341d180", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82b1a3af064dd7302ab18c3bb341d180") : e().acrossBannerMachInfo;
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a6b3a3e1602b931535ffe50d6ba110", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a6b3a3e1602b931535ffe50d6ba110");
        }
        if (e() == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!TextUtils.isEmpty(e().acrossBannerMachInfo));
    }
}
