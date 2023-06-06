package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.b;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_c7648c77673a761e28f967c1180c31a8 implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4425fabb8ac1df6c53e095b21a7d6f49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4425fabb8ac1df6c53e095b21a7d6f49");
            return;
        }
        hVar.a("", "", "/UGCReview/video", "com.sankuai.waimai.business.restaurant.base.WebImagePreviewActivity", false, new com.sankuai.waimai.business.restaurant.base.a());
        hVar.a("", "", "takeout/UGCReview/video", "com.sankuai.waimai.business.restaurant.base.WebImagePreviewActivity", false, new com.sankuai.waimai.business.restaurant.base.a());
        hVar.a("", "", "/orderagain", new com.sankuai.waimai.business.restaurant.orderagain.a(), false, new i[0]);
        hVar.a("", "", "/orderlist/waimai/orderagain", new com.sankuai.waimai.business.restaurant.orderagain.a(), false, new i[0]);
        hVar.a("", "", "/menu", new b(), false, new i[0]);
        hVar.a("", "", " /selfdeliveryshop", new b(), false, new i[0]);
        hVar.a("", "", "/detail", new com.sankuai.waimai.business.restaurant.a(), false, new i[0]);
    }
}
