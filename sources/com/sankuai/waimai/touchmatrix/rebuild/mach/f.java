package com.sankuai.waimai.touchmatrix.rebuild.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew;
import com.sankuai.waimai.touchmatrix.rebuild.factory.TypeViewFactory;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements TypeViewFactory {
    public static ChangeQuickRedirect a;
    public DynamicDialogNew.e b;

    @Override // com.sankuai.waimai.touchmatrix.rebuild.factory.TypeViewFactory
    public final void a(com.sankuai.waimai.touchmatrix.data.a aVar, com.sankuai.waimai.touchmatrix.rebuild.factory.c cVar, com.sankuai.waimai.touchmatrix.rebuild.factory.e eVar) {
        Object[] objArr = {aVar, cVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8976574f322651579f0e40fac638adf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8976574f322651579f0e40fac638adf8");
            return;
        }
        d dVar = new d(cVar.a());
        dVar.a(this.b);
        dVar.setMessage(aVar);
        dVar.setControler(cVar);
        eVar.a(dVar, false);
    }
}
