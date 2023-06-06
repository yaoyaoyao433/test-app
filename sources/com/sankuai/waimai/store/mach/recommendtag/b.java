package com.sankuai.waimai.store.mach.recommendtag;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a<PoiRecommendTagInfoListItem, d> {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.store.mach.recommendtag.a
    public final boolean a() {
        return true;
    }

    public b(d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64b129af72ce7868a97aefcc758acd04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64b129af72ce7868a97aefcc758acd04");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.c
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "008d3ab0bf517edcc826474663c759f4", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "008d3ab0bf517edcc826474663c759f4") : new e();
    }
}
