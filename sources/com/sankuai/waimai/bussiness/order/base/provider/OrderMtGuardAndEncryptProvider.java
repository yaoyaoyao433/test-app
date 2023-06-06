package com.sankuai.waimai.bussiness.order.base.provider;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider;
import com.sankuai.waimai.platform.provider.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderMtGuardAndEncryptProvider implements MtGuardAndEncryptProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider
    public void registerEncryptProvider(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "983946891384c2c20524b027ae9a0356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "983946891384c2c20524b027ae9a0356");
            return;
        }
        aVar.a("/order/preview");
        aVar.a("/order/update");
        aVar.a("/order/tableware-setting");
        aVar.a("/order/status");
        aVar.a("/order/refreshstatus");
        aVar.a("/order/submit");
        aVar.a("/poi/coupon/preexchange");
        aVar.a("/poi/coupon/exchange");
        aVar.a("/payment/genpay");
        aVar.a("/order/preview/riskcheck/resendcode");
        aVar.a("/order/preview/bindphone/sendcode");
        aVar.a("/order/preview/expresslogin/sendcode");
        aVar.a("/order/multi/preview");
        aVar.a("/order/tableware-setting");
        aVar.a("/order/multi/update");
        aVar.a("/order/multi/submit");
        aVar.a("/order/getuserorders");
    }
}
