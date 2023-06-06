package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IPageAnnotationInit;
import com.sankuai.waimai.router.common.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterPage_b5733d0194399271725699b6f6f98481 implements IPageAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dd9dc0ab080f5eca95a356c5251ffb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dd9dc0ab080f5eca95a356c5251ffb2");
            return;
        }
        eVar.a("/pickme", "com.sankuai.waimai.business.page.home.list.feed.UgcFeedActivity", new com.sankuai.waimai.business.ugc.pickme.a());
        eVar.a("/common/machpro", "com.sankuai.waimai.business.page.home.list.feed.UgcFeedActivity", new com.sankuai.waimai.business.ugc.pickme.a());
    }
}
