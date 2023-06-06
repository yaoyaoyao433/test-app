package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o implements com.meituan.android.cube.pga.dynamic.d<com.sankuai.waimai.business.restaurant.poicontainer.mach.a> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4124ad026f531ecabc01ed5c8e98eeb4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4124ad026f531ecabc01ed5c8e98eeb4") : new com.sankuai.waimai.business.restaurant.poicontainer.mach.c((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(com.sankuai.waimai.business.restaurant.poicontainer.mach.a aVar) {
        com.sankuai.waimai.business.restaurant.poicontainer.mach.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e655acb51f45fc631bead94846a67c0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e655acb51f45fc631bead94846a67c0e");
        }
        com.meituan.android.cube.pga.viewmodel.a aVar3 = new com.meituan.android.cube.pga.viewmodel.a();
        aVar3.a((com.meituan.android.cube.pga.viewmodel.a) aVar2);
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public com.sankuai.waimai.business.restaurant.poicontainer.mach.a a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a08bd25d05a5594bbbcb56174029176", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.poicontainer.mach.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a08bd25d05a5594bbbcb56174029176");
        }
        try {
            return (com.sankuai.waimai.business.restaurant.poicontainer.mach.a) gson.fromJson(str, (Class<Object>) com.sankuai.waimai.business.restaurant.poicontainer.mach.a.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.business.restaurant.poicontainer.mach.c.class;
    }
}
