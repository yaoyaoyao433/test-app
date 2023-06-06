package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ax implements com.meituan.android.cube.pga.dynamic.d<String> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* bridge */ /* synthetic */ String a(String str, Gson gson) {
        return str;
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2070109dc0c116c945c44ff917aec0ea", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2070109dc0c116c945c44ff917aec0ea") : new com.sankuai.waimai.store.order.prescription.block.c((com.sankuai.waimai.business.order.api.confirm.block.a) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(String str) {
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d3bf68abd07609444280b87993f605d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d3bf68abd07609444280b87993f605d");
        }
        com.sankuai.waimai.store.order.prescription.model.c cVar = new com.sankuai.waimai.store.order.prescription.model.c();
        cVar.a((com.sankuai.waimai.store.order.prescription.model.c) str2);
        return cVar;
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.store.order.prescription.block.c.class;
    }
}
