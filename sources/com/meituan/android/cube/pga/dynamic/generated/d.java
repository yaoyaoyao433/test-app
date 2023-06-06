package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements com.meituan.android.cube.pga.dynamic.d<HomeNewHeadResponse> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f8cd46ada4a717a24e3d889748a1807", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f8cd46ada4a717a24e3d889748a1807") : new com.sankuai.waimai.business.page.home.head.banner.mach.a(aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(HomeNewHeadResponse homeNewHeadResponse) {
        HomeNewHeadResponse homeNewHeadResponse2 = homeNewHeadResponse;
        Object[] objArr = {homeNewHeadResponse2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0c95936294c2333e69e41ffdb4075b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0c95936294c2333e69e41ffdb4075b");
        }
        com.sankuai.waimai.business.page.home.head.banner.mach.c cVar = new com.sankuai.waimai.business.page.home.head.banner.mach.c();
        cVar.a((com.sankuai.waimai.business.page.home.head.banner.mach.c) homeNewHeadResponse2);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public HomeNewHeadResponse a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9bd24466ebbb3215cf782d961a6db7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (HomeNewHeadResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9bd24466ebbb3215cf782d961a6db7b");
        }
        try {
            return (HomeNewHeadResponse) gson.fromJson(str, (Class<Object>) HomeNewHeadResponse.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.business.page.home.head.banner.mach.a.class;
    }
}
