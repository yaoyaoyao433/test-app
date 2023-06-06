package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ad implements com.meituan.android.cube.pga.dynamic.d<String> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* bridge */ /* synthetic */ String a(String str, Gson gson) {
        return str;
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66717876f950b2efa008228c5b1f2594", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66717876f950b2efa008228c5b1f2594") : new com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.f((com.sankuai.waimai.bussiness.order.detailnew.a) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(String str) {
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9858ce84ead1fc9ba966d74d1b9818d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9858ce84ead1fc9ba966d74d1b9818d");
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.h hVar = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.h();
        hVar.a((com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.h) str2);
        return hVar;
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.f.class;
    }
}
