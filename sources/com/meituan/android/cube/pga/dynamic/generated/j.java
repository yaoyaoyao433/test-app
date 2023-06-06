package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j implements com.meituan.android.cube.pga.dynamic.d<com.sankuai.waimai.business.page.home.list.future.ad.a> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e96c456eb51f18d2426cbac5c8fe067f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e96c456eb51f18d2426cbac5c8fe067f") : new com.sankuai.waimai.business.page.kingkong.future.platinum.a(aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(com.sankuai.waimai.business.page.home.list.future.ad.a aVar) {
        com.sankuai.waimai.business.page.home.list.future.ad.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f7980d3849e7caa83b38d451948bc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f7980d3849e7caa83b38d451948bc4");
        }
        com.sankuai.waimai.business.page.kingkong.view.platinum.a aVar3 = new com.sankuai.waimai.business.page.kingkong.view.platinum.a();
        aVar3.a((com.sankuai.waimai.business.page.kingkong.view.platinum.a) aVar2);
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public com.sankuai.waimai.business.page.home.list.future.ad.a a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e29a5a65a0678431d8f93f87bc0498", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.home.list.future.ad.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e29a5a65a0678431d8f93f87bc0498");
        }
        try {
            return (com.sankuai.waimai.business.page.home.list.future.ad.a) gson.fromJson(str, (Class<Object>) com.sankuai.waimai.business.page.home.list.future.ad.a.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.business.page.kingkong.future.platinum.a.class;
    }
}
