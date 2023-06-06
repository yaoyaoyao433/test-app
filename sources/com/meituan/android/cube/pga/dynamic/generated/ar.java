package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.detail.block.e;
import com.sankuai.waimai.store.order.detail.model.BizInfo;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ar implements com.meituan.android.cube.pga.dynamic.d<BizInfo> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c8fa8be813b846f989caf5817687891", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c8fa8be813b846f989caf5817687891") : new com.sankuai.waimai.store.order.detail.block.e((com.sankuai.waimai.business.order.api.detail.block.c) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(BizInfo bizInfo) {
        BizInfo bizInfo2 = bizInfo;
        Object[] objArr = {bizInfo2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b77713e2b0c613cb39da8fa41bf1fd19", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b77713e2b0c613cb39da8fa41bf1fd19");
        }
        e.a aVar = new e.a();
        aVar.a((e.a) bizInfo2);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public BizInfo a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588c4b11b8e1026a41429f8e237eac93", RobustBitConfig.DEFAULT_VALUE)) {
            return (BizInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588c4b11b8e1026a41429f8e237eac93");
        }
        try {
            return (BizInfo) gson.fromJson(str, (Class<Object>) BizInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.store.order.detail.block.e.class;
    }
}
