package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_b5733d0194399271725699b6f6f98481 implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08a61c40f9eeb24bab114414988b193d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08a61c40f9eeb24bab114414988b193d");
            return;
        }
        hVar.a("", "", "/pickme", "com.sankuai.waimai.business.page.home.list.feed.UgcFeedActivity", false, new com.sankuai.waimai.business.ugc.pickme.a());
        hVar.a("", "", "/takeout/pickme", "com.sankuai.waimai.business.page.home.list.feed.UgcFeedActivity", false, new com.sankuai.waimai.business.ugc.pickme.a());
        hVar.a("", "", "/common/machpro", "com.sankuai.waimai.business.page.home.list.feed.UgcFeedActivity", false, new com.sankuai.waimai.business.ugc.pickme.a());
        hVar.a("", "", "/takeout/common/machpro", "com.sankuai.waimai.business.page.home.list.feed.UgcFeedActivity", false, new com.sankuai.waimai.business.ugc.pickme.a());
    }
}
