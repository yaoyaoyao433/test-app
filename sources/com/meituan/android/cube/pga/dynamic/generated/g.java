package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.MidAdBanner;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g implements com.meituan.android.cube.pga.dynamic.d<MidAdBanner> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f352ce9926e750b1b42712feb47ffe", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f352ce9926e750b1b42712feb47ffe") : new com.sankuai.waimai.business.page.home.list.future.ad.b(aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(MidAdBanner midAdBanner) {
        MidAdBanner midAdBanner2 = midAdBanner;
        Object[] objArr = {midAdBanner2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7653fefc58b2e301483fd9de38c3a1f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7653fefc58b2e301483fd9de38c3a1f6");
        }
        com.sankuai.waimai.business.page.home.list.future.ad.c cVar = new com.sankuai.waimai.business.page.home.list.future.ad.c();
        cVar.a((com.sankuai.waimai.business.page.home.list.future.ad.c) midAdBanner2);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public MidAdBanner a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3a6aa73177e8a943dc69e87abb4a7e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (MidAdBanner) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3a6aa73177e8a943dc69e87abb4a7e2");
        }
        try {
            return (MidAdBanner) gson.fromJson(str, (Class<Object>) MidAdBanner.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.business.page.home.list.future.ad.b.class;
    }
}
