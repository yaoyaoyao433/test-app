package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements com.meituan.android.cube.pga.dynamic.d<HomeNewHeadResponse> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bf140fa0d7620da0d982722f19b2c6b", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bf140fa0d7620da0d982722f19b2c6b") : new com.sankuai.waimai.business.page.home.head.banner.a(aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(HomeNewHeadResponse homeNewHeadResponse) {
        HomeNewHeadResponse homeNewHeadResponse2 = homeNewHeadResponse;
        Object[] objArr = {homeNewHeadResponse2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f59fae52afcc259c6e5b109bb34cc825", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f59fae52afcc259c6e5b109bb34cc825");
        }
        com.sankuai.waimai.business.page.home.head.banner.d dVar = new com.sankuai.waimai.business.page.home.head.banner.d();
        dVar.a((com.sankuai.waimai.business.page.home.head.banner.d) homeNewHeadResponse2);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public HomeNewHeadResponse a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c306c1a029330dc1533c9b7eba7e7529", RobustBitConfig.DEFAULT_VALUE)) {
            return (HomeNewHeadResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c306c1a029330dc1533c9b7eba7e7529");
        }
        try {
            return (HomeNewHeadResponse) gson.fromJson(str, (Class<Object>) HomeNewHeadResponse.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.business.page.home.head.banner.a.class;
    }
}
