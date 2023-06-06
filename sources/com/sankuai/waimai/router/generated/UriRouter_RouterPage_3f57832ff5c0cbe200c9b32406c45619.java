package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IPageAnnotationInit;
import com.sankuai.waimai.router.common.e;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterPage_3f57832ff5c0cbe200c9b32406c45619 implements IPageAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce94ea0841705739cc4d085db184a2c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce94ea0841705739cc4d085db184a2c3");
            return;
        }
        eVar.a("/takeout/machpro/couponpackage", "com.sankuai.waimai.business.ugc.mach.container.WMMPCouponPackageActivity", new i[0]);
        eVar.a("/machpro/couponpackage", "com.sankuai.waimai.business.ugc.mach.container.WMMPCouponPackageActivity", new i[0]);
    }
}
