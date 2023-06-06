package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IPageAnnotationInit;
import com.sankuai.waimai.router.common.e;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterPage_e17e433b6d12bd1b698be82976ca3720 implements IPageAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "596c3d2e358df82f314f7b130240780a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "596c3d2e358df82f314f7b130240780a");
            return;
        }
        eVar.a("/mycollect", new com.sankuai.waimai.business.page.common.mrn.a(), new i[0]);
        eVar.a("/shoppingarealist", new com.sankuai.waimai.business.page.common.mrn.a(), new i[0]);
        eVar.a("/similarpoi", new com.sankuai.waimai.business.page.common.mrn.a(), new i[0]);
        eVar.a("/recentlypoilist", new com.sankuai.waimai.business.page.common.mrn.a(), new i[0]);
        eVar.a("/mycommentlist", new com.sankuai.waimai.business.page.common.mrn.a(), new i[0]);
        eVar.a("/friendcommentlist", new com.sankuai.waimai.business.page.common.mrn.a(), new i[0]);
        eVar.a("/myaccount", "com.sankuai.waimai.business.user.api.user.account.MyAccountActivity", new i[0]);
        eVar.a("/friendcommentlistnative", "com.sankuai.waimai.business.user.comment.FriendCommentActivity", new i[0]);
        eVar.a("/mycommentlistnative", "com.sankuai.waimai.business.user.comment.MyCommentActivity", new i[0]);
    }
}
