package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.transfer.b;
import com.sankuai.waimai.router.common.IPageAnnotationInit;
import com.sankuai.waimai.router.common.e;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterPage_3cff37c5b98f7597778a85483e6396e3 implements IPageAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61539842042ff97cd0ca1f703e0993a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61539842042ff97cd0ca1f703e0993a4");
            return;
        }
        eVar.a("/confirm/order", new b(), new i[0]);
        eVar.a("/crossorder", "com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity", new i[0]);
        eVar.a("/orderconfirm", "com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity", new i[0]);
        eVar.a("/order", "com.sankuai.waimai.bussiness.order.detail.WMOrderDetailActivity", new i[0]);
    }
}
