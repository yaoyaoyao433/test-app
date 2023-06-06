package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class aj implements com.meituan.android.cube.pga.dynamic.d<com.sankuai.waimai.restaurant.shopcart.ui.aa> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c1332f75506481392d5d2bbb5fd92e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c1332f75506481392d5d2bbb5fd92e") : new com.sankuai.waimai.restaurant.shopcart.ui.n((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(com.sankuai.waimai.restaurant.shopcart.ui.aa aaVar) {
        com.sankuai.waimai.restaurant.shopcart.ui.aa aaVar2 = aaVar;
        Object[] objArr = {aaVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad18bf894227defa910e0011703fc66c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad18bf894227defa910e0011703fc66c");
        }
        com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a aVar = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a();
        aVar.a((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a) aaVar2);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public com.sankuai.waimai.restaurant.shopcart.ui.aa a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2364e5391bbe3b089b237444201a306a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.restaurant.shopcart.ui.aa) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2364e5391bbe3b089b237444201a306a");
        }
        try {
            return (com.sankuai.waimai.restaurant.shopcart.ui.aa) gson.fromJson(str, (Class<Object>) com.sankuai.waimai.restaurant.shopcart.ui.aa.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.restaurant.shopcart.ui.n.class;
    }
}
