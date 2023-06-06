package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.prescription.block.a;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class aw implements com.meituan.android.cube.pga.dynamic.d<com.sankuai.waimai.store.order.prescription.model.b> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09bb958fb0683919b5374f1801e5b330", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09bb958fb0683919b5374f1801e5b330") : new com.sankuai.waimai.store.order.prescription.block.a((com.sankuai.waimai.business.order.api.confirm.block.a) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(com.sankuai.waimai.store.order.prescription.model.b bVar) {
        com.sankuai.waimai.store.order.prescription.model.b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2ab82ca3deb29fab2d56f299fa8e2fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2ab82ca3deb29fab2d56f299fa8e2fc");
        }
        a.C1253a c1253a = new a.C1253a();
        c1253a.a((a.C1253a) bVar2);
        return c1253a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public com.sankuai.waimai.store.order.prescription.model.b a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a246bb8694a9f25bc6d4ff3e326bf10", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.order.prescription.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a246bb8694a9f25bc6d4ff3e326bf10");
        }
        try {
            return (com.sankuai.waimai.store.order.prescription.model.b) gson.fromJson(str, (Class<Object>) com.sankuai.waimai.store.order.prescription.model.b.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.store.order.prescription.block.a.class;
    }
}
