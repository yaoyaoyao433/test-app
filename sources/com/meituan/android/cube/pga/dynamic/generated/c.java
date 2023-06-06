package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.head.banner.live.LiveBannerResponse;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements com.meituan.android.cube.pga.dynamic.d<LiveBannerResponse> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d0c78815a9f98a2a599c9ffed749efe", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d0c78815a9f98a2a599c9ffed749efe") : new com.sankuai.waimai.business.page.home.head.banner.live.a(aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(LiveBannerResponse liveBannerResponse) {
        LiveBannerResponse liveBannerResponse2 = liveBannerResponse;
        Object[] objArr = {liveBannerResponse2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65b12233760f766b0c226c7975ae88f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65b12233760f766b0c226c7975ae88f9");
        }
        com.sankuai.waimai.business.page.home.head.banner.live.c cVar = new com.sankuai.waimai.business.page.home.head.banner.live.c();
        cVar.a((com.sankuai.waimai.business.page.home.head.banner.live.c) liveBannerResponse2);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public LiveBannerResponse a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a32946a992302c276b64aaf09c2665", RobustBitConfig.DEFAULT_VALUE)) {
            return (LiveBannerResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a32946a992302c276b64aaf09c2665");
        }
        try {
            return (LiveBannerResponse) gson.fromJson(str, (Class<Object>) LiveBannerResponse.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.business.page.home.head.banner.live.a.class;
    }
}
