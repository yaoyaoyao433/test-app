package com.sankuai.waimai.irmo.render.engine.factory;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.i;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.irmo.render.engine.factory.a
    public final com.sankuai.waimai.irmo.render.engine.a a(com.sankuai.waimai.irmo.render.a aVar, i iVar, com.sankuai.waimai.irmo.render.f fVar) {
        Object[] objArr = {aVar, iVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7867b7d8235aa0156539c9d98e966245", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.irmo.render.engine.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7867b7d8235aa0156539c9d98e966245") : new com.sankuai.waimai.irmo.render.engine.e(aVar, iVar, fVar);
    }
}
