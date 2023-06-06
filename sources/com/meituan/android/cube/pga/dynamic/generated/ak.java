package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ak implements com.meituan.android.cube.pga.dynamic.d<String> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* bridge */ /* synthetic */ String a(String str, Gson gson) {
        return str;
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec3d345a51392ea9799ff807d8e707bf", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec3d345a51392ea9799ff807d8e707bf") : new com.sankuai.waimai.restaurant.shopcart.ui.o((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(String str) {
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afd5f2ceecab0eb3868e1f0a4ef5e283", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afd5f2ceecab0eb3868e1f0a4ef5e283");
        }
        com.meituan.android.cube.pga.viewmodel.a aVar = new com.meituan.android.cube.pga.viewmodel.a();
        aVar.a((com.meituan.android.cube.pga.viewmodel.a) str2);
        return aVar;
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.restaurant.shopcart.ui.o.class;
    }
}
