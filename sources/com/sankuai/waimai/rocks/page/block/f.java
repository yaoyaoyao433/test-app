package com.sankuai.waimai.rocks.page.block;

import com.meituan.android.cube.pga.view.a;
import com.meituan.android.cube.pga.viewmodel.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.page.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class f<ViewType extends com.meituan.android.cube.pga.view.a, ViewModelType extends com.meituan.android.cube.pga.viewmodel.a, ContextType extends com.sankuai.waimai.rocks.page.a> extends com.meituan.android.cube.pga.block.a<ViewType, ViewModelType, ContextType> {
    public static ChangeQuickRedirect z;

    public f(ContextType contexttype) {
        super(contexttype);
        Object[] objArr = {contexttype};
        ChangeQuickRedirect changeQuickRedirect = z;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8933e65d45396db37fbbe98644057ffb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8933e65d45396db37fbbe98644057ffb");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    /* renamed from: S */
    public final ContextType F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = z;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d08443eb871f4f5a493ca4ce6965ad27", RobustBitConfig.DEFAULT_VALUE) ? (ContextType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d08443eb871f4f5a493ca4ce6965ad27") : (ContextType) super.F();
    }
}
