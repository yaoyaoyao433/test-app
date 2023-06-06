package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class am implements com.meituan.android.cube.pga.dynamic.d<RocksServerModel> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceb146a948566668f3be54a7dfd1f412", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceb146a948566668f3be54a7dfd1f412") : new com.sankuai.waimai.rocks.page.tablist.tab.b(aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(RocksServerModel rocksServerModel) {
        RocksServerModel rocksServerModel2 = rocksServerModel;
        Object[] objArr = {rocksServerModel2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "218d9da4ae96180d509eb46e7e4d548f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "218d9da4ae96180d509eb46e7e4d548f");
        }
        com.meituan.android.cube.pga.viewmodel.a aVar = new com.meituan.android.cube.pga.viewmodel.a();
        aVar.a((com.meituan.android.cube.pga.viewmodel.a) rocksServerModel2);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public RocksServerModel a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fc220a0a9328f2395009aeaa66ddfd", RobustBitConfig.DEFAULT_VALUE)) {
            return (RocksServerModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fc220a0a9328f2395009aeaa66ddfd");
        }
        try {
            return (RocksServerModel) gson.fromJson(str, (Class<Object>) RocksServerModel.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.rocks.page.tablist.tab.b.class;
    }
}
