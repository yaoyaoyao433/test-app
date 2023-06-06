package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_7c19cc82a85f01892fe78ea5e6993e8c implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee4ec5bb6a1ae507de7c99bfe9e2aee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee4ec5bb6a1ae507de7c99bfe9e2aee2");
            return;
        }
        hVar.a("", "", "secondfloor", "com.sankuai.waimai.secondfloor.WMSecondFloorActivity", false, new i[0]);
        hVar.a("", "", "takeout/secondfloor", "com.sankuai.waimai.secondfloor.WMSecondFloorActivity", false, new i[0]);
        hVar.a("", "", "/takeout/machpro/couponpackage", "com.sankuai.waimai.business.ugc.mach.container.WMMPCouponPackageActivity", false, new i[0]);
        hVar.a("", "", "/machpro/couponpackage", "com.sankuai.waimai.business.ugc.mach.container.WMMPCouponPackageActivity", false, new i[0]);
    }
}
