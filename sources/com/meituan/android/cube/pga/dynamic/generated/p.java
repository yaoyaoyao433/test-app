package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class p implements com.meituan.android.cube.pga.dynamic.d<com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.a> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc53fc7f72956629d0f19092390fcaed", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc53fc7f72956629d0f19092390fcaed") : new com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.b((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.a aVar) {
        com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ee1a7bdaf96e56f2344f6b938dfeeb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ee1a7bdaf96e56f2344f6b938dfeeb7");
        }
        com.meituan.android.cube.pga.viewmodel.a aVar3 = new com.meituan.android.cube.pga.viewmodel.a();
        aVar3.a((com.meituan.android.cube.pga.viewmodel.a) aVar2);
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.a a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e683ac8e7756ded2926bc04ee909d156", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e683ac8e7756ded2926bc04ee909d156");
        }
        try {
            return (com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.a) gson.fromJson(str, (Class<Object>) com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.a.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.b.class;
    }
}
