package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_e17e433b6d12bd1b698be82976ca3720 implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e90367d887aff38de55553efd91375a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e90367d887aff38de55553efd91375a");
            return;
        }
        hVar.a("", "", "/likedpoi", new com.sankuai.waimai.business.page.common.mrn.a(), false, new i[0]);
        hVar.a("", "", "/page/citydeliversubpage", new com.sankuai.waimai.business.page.common.mrn.a(), false, new i[0]);
        hVar.a("", "", "/footprint", new com.sankuai.waimai.business.page.common.mrn.a(), false, new i[0]);
        hVar.a("", "", "/mycommentlist", new com.sankuai.waimai.business.page.common.mrn.a(), false, new i[0]);
        hVar.a("", "", "/friendcommentlist", new com.sankuai.waimai.business.page.common.mrn.a(), false, new i[0]);
        hVar.a("", "", "/poifilter", new com.sankuai.waimai.business.page.common.a(), false, new i[0]);
        hVar.a("", "", "/takeout/secondpage", new com.sankuai.waimai.business.page.common.a(), false, new i[0]);
        hVar.a("", "", "/pois", "com.sankuai.waimai.business.page.homepage.MainActivity", false, new com.sankuai.waimai.business.page.homepage.routerinterceptor.a());
        hVar.a("", "", "/content", "com.sankuai.waimai.business.page.homepage.MainActivity", false, new com.sankuai.waimai.business.page.homepage.routerinterceptor.a());
        hVar.a("", "", "/orders", "com.sankuai.waimai.business.page.homepage.MainActivity", false, new com.sankuai.waimai.business.page.homepage.routerinterceptor.a());
        hVar.a("", "", "/mine", "com.sankuai.waimai.business.page.homepage.MainActivity", false, new com.sankuai.waimai.business.page.homepage.routerinterceptor.a());
        hVar.a("", "", "/account", "com.sankuai.waimai.business.user.api.user.account.MyAccountActivity", false, new i[0]);
        hVar.a("", "", "/friendcommentlistnative", "com.sankuai.waimai.business.user.comment.FriendCommentActivity", false, new i[0]);
        hVar.a("", "", "/mycommentlistnative", "com.sankuai.waimai.business.user.comment.MyCommentActivity", false, new i[0]);
    }
}
