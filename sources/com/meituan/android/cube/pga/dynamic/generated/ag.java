package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.order.confirm.rocks.medicareway.a;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ag implements com.meituan.android.cube.pga.dynamic.d<String> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* bridge */ /* synthetic */ String a(String str, Gson gson) {
        return str;
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(String str) {
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42c9203cd144df686f09a813206b1d9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42c9203cd144df686f09a813206b1d9a");
        }
        a.C0940a c0940a = new a.C0940a();
        c0940a.a((a.C0940a) str2);
        return c0940a;
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb2d5a5a38b8bd64a19a276c0b452890", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb2d5a5a38b8bd64a19a276c0b452890") : new com.sankuai.waimai.drug.order.confirm.rocks.medicareway.a((com.sankuai.waimai.business.order.api.confirm.block.a) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.drug.order.confirm.rocks.medicareway.a.class;
    }
}
