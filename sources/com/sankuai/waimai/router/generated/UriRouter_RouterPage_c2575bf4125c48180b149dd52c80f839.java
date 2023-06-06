package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IPageAnnotationInit;
import com.sankuai.waimai.router.common.e;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.store.goods.list.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterPage_c2575bf4125c48180b149dd52c80f839 implements IPageAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7580c9dcbaf537e392e8d80265f08c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7580c9dcbaf537e392e8d80265f08c8");
            return;
        }
        eVar.a("/sc_goods_detail", new com.sankuai.waimai.store.goods.detail.preload.a(), new i[0]);
        eVar.a("/sc_sub_goods_list", "com.sankuai.waimai.store.goods.list.SCSuperMarketSubActivity", new i[0]);
        eVar.a("/sc_goods_list", new d(), new i[0]);
    }
}
