package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.prescription.model.OrderRecipeInfo;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class bc implements com.meituan.android.cube.pga.dynamic.d<OrderRecipeInfo> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900252ec5ed68917ab22614a9b85c4c4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900252ec5ed68917ab22614a9b85c4c4") : new com.sankuai.waimai.store.order.prescription.block.h((com.sankuai.waimai.business.order.api.confirm.block.a) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(OrderRecipeInfo orderRecipeInfo) {
        OrderRecipeInfo orderRecipeInfo2 = orderRecipeInfo;
        Object[] objArr = {orderRecipeInfo2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f37d18e3457fa6af1fdc2529b6699c0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f37d18e3457fa6af1fdc2529b6699c0b");
        }
        com.sankuai.waimai.store.order.prescription.model.d dVar = new com.sankuai.waimai.store.order.prescription.model.d();
        dVar.a((com.sankuai.waimai.store.order.prescription.model.d) orderRecipeInfo2);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public OrderRecipeInfo a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c557a69fd678cead2e0839f2d79d31fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderRecipeInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c557a69fd678cead2e0839f2d79d31fa");
        }
        try {
            return (OrderRecipeInfo) gson.fromJson(str, (Class<Object>) OrderRecipeInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.store.order.prescription.block.h.class;
    }
}
