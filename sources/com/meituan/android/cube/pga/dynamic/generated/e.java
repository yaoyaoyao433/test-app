package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.head.majorcategory.MajorCategoryBlock;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e implements com.meituan.android.cube.pga.dynamic.d<HomeNewHeadResponse> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99013c892d35201d0c69b2a54d663977", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99013c892d35201d0c69b2a54d663977") : new MajorCategoryBlock(aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(HomeNewHeadResponse homeNewHeadResponse) {
        HomeNewHeadResponse homeNewHeadResponse2 = homeNewHeadResponse;
        Object[] objArr = {homeNewHeadResponse2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2dd9076698b31c687fb5d351d5cff7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2dd9076698b31c687fb5d351d5cff7e");
        }
        com.sankuai.waimai.business.page.home.head.majorcategory.c cVar = new com.sankuai.waimai.business.page.home.head.majorcategory.c();
        cVar.a((com.sankuai.waimai.business.page.home.head.majorcategory.c) homeNewHeadResponse2);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public HomeNewHeadResponse a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "211c5aabf3b894ac914db7d479512b5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (HomeNewHeadResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "211c5aabf3b894ac914db7d479512b5f");
        }
        try {
            return (HomeNewHeadResponse) gson.fromJson(str, (Class<Object>) HomeNewHeadResponse.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return MajorCategoryBlock.class;
    }
}
