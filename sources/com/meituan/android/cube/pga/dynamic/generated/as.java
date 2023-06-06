package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.detail.block.f;
import com.sankuai.waimai.store.order.detail.model.RXAreaStatusModel;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class as implements com.meituan.android.cube.pga.dynamic.d<RXAreaStatusModel> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46719c4168b2dafbc5c01f9500f110b3", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46719c4168b2dafbc5c01f9500f110b3") : new com.sankuai.waimai.store.order.detail.block.f((com.sankuai.waimai.business.order.api.detail.block.b) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(RXAreaStatusModel rXAreaStatusModel) {
        RXAreaStatusModel rXAreaStatusModel2 = rXAreaStatusModel;
        Object[] objArr = {rXAreaStatusModel2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd57b32c746268d31e1a14784f55b736", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd57b32c746268d31e1a14784f55b736");
        }
        f.a aVar = new f.a();
        aVar.a((f.a) rXAreaStatusModel2);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public RXAreaStatusModel a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de2394f4e517f10aad6c35bd5f8ab914", RobustBitConfig.DEFAULT_VALUE)) {
            return (RXAreaStatusModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de2394f4e517f10aad6c35bd5f8ab914");
        }
        try {
            return (RXAreaStatusModel) gson.fromJson(str, (Class<Object>) RXAreaStatusModel.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.store.order.detail.block.f.class;
    }
}
