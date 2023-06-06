package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.order.confirm.model.OrderConfirmMachTemplateMap;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ae implements com.meituan.android.cube.pga.dynamic.d<OrderConfirmMachTemplateMap> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "206b31462e2dfc359d21959680e9031b", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "206b31462e2dfc359d21959680e9031b") : new com.sankuai.waimai.drug.order.confirm.block.a((com.sankuai.waimai.business.order.api.confirm.block.a) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(OrderConfirmMachTemplateMap orderConfirmMachTemplateMap) {
        OrderConfirmMachTemplateMap orderConfirmMachTemplateMap2 = orderConfirmMachTemplateMap;
        Object[] objArr = {orderConfirmMachTemplateMap2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc39a68815c05f4427b8a13d53a5fe49", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc39a68815c05f4427b8a13d53a5fe49");
        }
        com.sankuai.waimai.drug.order.confirm.model.b bVar = new com.sankuai.waimai.drug.order.confirm.model.b();
        bVar.a((com.sankuai.waimai.drug.order.confirm.model.b) orderConfirmMachTemplateMap2);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public OrderConfirmMachTemplateMap a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4453d5e46d6ff8128837c87d0c7a5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderConfirmMachTemplateMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4453d5e46d6ff8128837c87d0c7a5a");
        }
        try {
            return (OrderConfirmMachTemplateMap) gson.fromJson(str, (Class<Object>) OrderConfirmMachTemplateMap.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.drug.order.confirm.block.a.class;
    }
}
