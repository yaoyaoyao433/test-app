package com.sankuai.waimai.business.page.home.list.future.ad;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.MidAdBanner;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements com.sankuai.waimai.pouch.model.a<MidAdBanner> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.pouch.model.a
    public final PouchDynamicAd a(MidAdBanner midAdBanner) {
        Object[] objArr = {midAdBanner};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "099587a905cbaa5ec3f2adf688958086", RobustBitConfig.DEFAULT_VALUE)) {
            return (PouchDynamicAd) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "099587a905cbaa5ec3f2adf688958086");
        }
        if (midAdBanner == null || midAdBanner.dynamicPlatinumBanner == null) {
            return null;
        }
        PouchDynamicAd pouchDynamicAd = new PouchDynamicAd();
        pouchDynamicAd.adType = midAdBanner.adType;
        pouchDynamicAd.stringData = midAdBanner.dynamicPlatinumBanner.a;
        pouchDynamicAd.adTemplateId = midAdBanner.dynamicPlatinumBanner.adTemplateId;
        pouchDynamicAd.adContainerId = midAdBanner.dynamicPlatinumBanner.adContainerId;
        pouchDynamicAd.defaultAdContainerId = PouchDynamicAd.CONTAINER_ID_WM_COMMON;
        pouchDynamicAd.index = midAdBanner.index;
        pouchDynamicAd.businessName = "homepage_platinum";
        return pouchDynamicAd;
    }
}
