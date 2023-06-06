package com.sankuai.waimai.store.shopcart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.l;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.i;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends l<NetPriceCalculatorResult> {
    public static ChangeQuickRedirect b;
    private long c;
    private String d;

    @Override // com.sankuai.waimai.store.base.net.l, com.sankuai.waimai.store.base.net.j
    public final /* synthetic */ void a(Object obj) {
        NetPriceCalculatorResult netPriceCalculatorResult = (NetPriceCalculatorResult) obj;
        Object[] objArr = {netPriceCalculatorResult};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b40fcf2ec75f6ae92da709ae01aeb228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b40fcf2ec75f6ae92da709ae01aeb228");
            return;
        }
        if (netPriceCalculatorResult != null && com.sankuai.waimai.store.order.a.e().b(this.c, this.d, netPriceCalculatorResult.b, netPriceCalculatorResult.c)) {
            com.sankuai.waimai.store.order.a.e().a(this.c, this.d, netPriceCalculatorResult.b, netPriceCalculatorResult.c);
        }
        if (netPriceCalculatorResult != null && netPriceCalculatorResult.b == 0) {
            String str = ae.b;
            ae.a(str, "CalcResultRequestCallbackWrapper appId=[" + this.c + CommonConstant.Symbol.COMMA + this.d + CommonConstant.Symbol.COMMA + netPriceCalculatorResult.b + CommonConstant.Symbol.COMMA + netPriceCalculatorResult.c + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        }
        com.sankuai.waimai.store.order.a.e().k(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.d, this.c)).x = (Map) i.a(netPriceCalculatorResult.a, Map.class);
        super.a((a) netPriceCalculatorResult);
    }

    public a(long j, String str, j<NetPriceCalculatorResult> jVar) {
        super(jVar);
        Object[] objArr = {new Long(j), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bfc76d63ccddf7de64cf03bafffc136", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bfc76d63ccddf7de64cf03bafffc136");
            return;
        }
        this.c = j;
        this.d = str;
    }
}
