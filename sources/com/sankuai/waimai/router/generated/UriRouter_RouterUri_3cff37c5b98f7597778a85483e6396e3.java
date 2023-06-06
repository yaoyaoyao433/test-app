package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.request.dynamic.c;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.g;
import com.sankuai.waimai.bussiness.order.transfer.b;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_3cff37c5b98f7597778a85483e6396e3 implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a209b374f3c9a2275b8aa425574e73c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a209b374f3c9a2275b8aa425574e73c");
            return;
        }
        hVar.a("", "", "/confirm/order", new b(), false, new i[0]);
        hVar.a("", "", "/takeout/confirm/order", new b(), false, new i[0]);
        hVar.a("", "", "/machalertview", new c(), false, new i[0]);
        hVar.a("", "", "/order", "com.sankuai.waimai.bussiness.order.detail.WMOrderDetailActivity", false, new i[0]);
        hVar.a("", "", "/machpopview", new g(), false, new i[0]);
        hVar.a("", "", "/refund", new com.sankuai.waimai.bussiness.order.refund.a(), false, new i[0]);
        hVar.a("", "", "/orderlist/waimai/review", new com.sankuai.waimai.bussiness.order.comment.a(), false, new i[0]);
    }
}
