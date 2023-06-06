package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class aa implements com.meituan.android.cube.pga.dynamic.d<com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.d> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "883b368f40443544bf86e2287bd28473", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "883b368f40443544bf86e2287bd28473") : new com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.c((com.sankuai.waimai.bussiness.order.detailnew.a) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.d dVar) {
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.d dVar2 = dVar;
        Object[] objArr = {dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d25c8c4df1a2cf56d16c957f24a024d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d25c8c4df1a2cf56d16c957f24a024d");
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.f fVar = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.f();
        fVar.a((com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.f) dVar2);
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.d a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7918d295c69d73834932d9519b1d2dc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7918d295c69d73834932d9519b1d2dc4");
        }
        try {
            return (com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.d) gson.fromJson(str, (Class<Object>) com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.d.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.c.class;
    }
}
