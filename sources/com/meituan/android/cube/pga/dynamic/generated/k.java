package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k implements com.meituan.android.cube.pga.dynamic.d<String> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* bridge */ /* synthetic */ String a(String str, Gson gson) {
        return str;
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff527ca8191b466d7087ff82339e75ec", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff527ca8191b466d7087ff82339e75ec") : new com.sankuai.waimai.business.page.kingkong.future.tabfeed.b((com.sankuai.waimai.business.page.kingkong.a) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(String str) {
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "014e4b258d0f27c149423e7ff38c5097", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "014e4b258d0f27c149423e7ff38c5097");
        }
        com.sankuai.waimai.business.page.kingkong.future.tabfeed.e eVar = new com.sankuai.waimai.business.page.kingkong.future.tabfeed.e();
        eVar.a((com.sankuai.waimai.business.page.kingkong.future.tabfeed.e) str2);
        return eVar;
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.business.page.kingkong.future.tabfeed.b.class;
    }
}
