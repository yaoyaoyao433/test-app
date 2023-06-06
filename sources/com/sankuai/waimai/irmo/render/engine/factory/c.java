package com.sankuai.waimai.irmo.render.engine.factory;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.i;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.irmo.render.engine.factory.a
    public final com.sankuai.waimai.irmo.render.engine.a a(com.sankuai.waimai.irmo.render.a aVar, i iVar, com.sankuai.waimai.irmo.render.f fVar) {
        Object[] objArr = {aVar, iVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a29754c65581728b83283e8b8c44e0a", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.irmo.render.engine.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a29754c65581728b83283e8b8c44e0a") : new com.sankuai.waimai.irmo.render.engine.b(aVar, iVar, fVar);
    }
}
