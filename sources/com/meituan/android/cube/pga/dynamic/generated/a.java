package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements com.meituan.android.cube.pga.dynamic.d<PouchDynamicAd> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad09660881a66d0d3e3f994eeb8b64b4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad09660881a66d0d3e3f994eeb8b64b4") : new com.sankuai.waimai.ad.c(aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(PouchDynamicAd pouchDynamicAd) {
        PouchDynamicAd pouchDynamicAd2 = pouchDynamicAd;
        Object[] objArr = {pouchDynamicAd2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf597340b543f2e6ac1052552d56acb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf597340b543f2e6ac1052552d56acb");
        }
        com.sankuai.waimai.ad.a aVar = new com.sankuai.waimai.ad.a();
        aVar.a((com.sankuai.waimai.ad.a) pouchDynamicAd2);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public PouchDynamicAd a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5478f16da21084efbe27b6c0950161", RobustBitConfig.DEFAULT_VALUE)) {
            return (PouchDynamicAd) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5478f16da21084efbe27b6c0950161");
        }
        try {
            return (PouchDynamicAd) gson.fromJson(str, (Class<Object>) PouchDynamicAd.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.ad.c.class;
    }
}
