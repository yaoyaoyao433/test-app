package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f implements com.meituan.android.cube.pga.dynamic.d<HomeNewHeadResponse> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63844cea9c50dc72920bd4b85c2938a4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63844cea9c50dc72920bd4b85c2938a4") : new com.sankuai.waimai.business.page.home.head.recommendwords.a(aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(HomeNewHeadResponse homeNewHeadResponse) {
        HomeNewHeadResponse homeNewHeadResponse2 = homeNewHeadResponse;
        Object[] objArr = {homeNewHeadResponse2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4084bfcc5675298ac6e4f35219198c88", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4084bfcc5675298ac6e4f35219198c88");
        }
        com.sankuai.waimai.business.page.home.head.recommendwords.c cVar = new com.sankuai.waimai.business.page.home.head.recommendwords.c();
        cVar.a((com.sankuai.waimai.business.page.home.head.recommendwords.c) homeNewHeadResponse2);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public HomeNewHeadResponse a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15ed8b0b203e957c3fd42d14cc4e50d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (HomeNewHeadResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15ed8b0b203e957c3fd42d14cc4e50d6");
        }
        try {
            return (HomeNewHeadResponse) gson.fromJson(str, (Class<Object>) HomeNewHeadResponse.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.business.page.home.head.recommendwords.a.class;
    }
}
