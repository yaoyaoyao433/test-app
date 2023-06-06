package com.sankuai.waimai.business.restaurant.framework;

import com.meituan.android.cube.pga.type.a;
import com.meituan.android.cube.pga.viewmodel.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class h<ViewModelType extends com.meituan.android.cube.pga.viewmodel.a, ContextType extends com.meituan.android.cube.pga.type.a> extends com.meituan.android.cube.pga.block.b<ViewModelType, ContextType> {
    public static ChangeQuickRedirect f;

    public h(ContextType contexttype) {
        super(contexttype);
        Object[] objArr = {contexttype};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c8017c9ff7c41acbd09e6a046f9889", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c8017c9ff7c41acbd09e6a046f9889");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void b(com.meituan.android.cube.pga.block.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a65733802ddc6db674fc775500fceaec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a65733802ddc6db674fc775500fceaec");
            return;
        }
        super.b(bVar);
        b((h<ViewModelType, ContextType>) bVar);
    }
}
