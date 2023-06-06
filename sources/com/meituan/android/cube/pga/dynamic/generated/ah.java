package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.order.confirm.model.OrderConfirmMachTemplateMap;
import com.sankuai.waimai.drug.order.confirm.rocks.risk.a;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ah implements com.meituan.android.cube.pga.dynamic.d<OrderConfirmMachTemplateMap> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d45b00f740850aa97ae06eaa56db071", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d45b00f740850aa97ae06eaa56db071") : new com.sankuai.waimai.drug.order.confirm.rocks.risk.a((com.sankuai.waimai.business.order.api.confirm.block.a) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(OrderConfirmMachTemplateMap orderConfirmMachTemplateMap) {
        OrderConfirmMachTemplateMap orderConfirmMachTemplateMap2 = orderConfirmMachTemplateMap;
        Object[] objArr = {orderConfirmMachTemplateMap2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bbfd5baa7e430bd3db435c993a1fa7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bbfd5baa7e430bd3db435c993a1fa7a");
        }
        a.C0941a c0941a = new a.C0941a();
        c0941a.a((a.C0941a) orderConfirmMachTemplateMap2);
        return c0941a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public OrderConfirmMachTemplateMap a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a236ae10b26299c52fff24410b4b82", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderConfirmMachTemplateMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a236ae10b26299c52fff24410b4b82");
        }
        try {
            return (OrderConfirmMachTemplateMap) gson.fromJson(str, (Class<Object>) OrderConfirmMachTemplateMap.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.drug.order.confirm.rocks.risk.a.class;
    }
}
