package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class u implements com.meituan.android.cube.pga.dynamic.d<Map> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef13a49d58d36786ded1eb78d502f7ec", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef13a49d58d36786ded1eb78d502f7ec") : new com.sankuai.waimai.bussiness.order.confirm.pgablock.instructions.a(aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(Map map) {
        Map map2 = map;
        Object[] objArr = {map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ec8be6a91d21213f44f1345f93e267b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ec8be6a91d21213f44f1345f93e267b");
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.instructions.d dVar = new com.sankuai.waimai.bussiness.order.confirm.pgablock.instructions.d();
        dVar.a((com.sankuai.waimai.bussiness.order.confirm.pgablock.instructions.d) map2);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public Map a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e936a8c2119077843d40571a7142bc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e936a8c2119077843d40571a7142bc4");
        }
        try {
            return (Map) gson.fromJson(str, (Class<Object>) Map.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.bussiness.order.confirm.pgablock.instructions.a.class;
    }
}
