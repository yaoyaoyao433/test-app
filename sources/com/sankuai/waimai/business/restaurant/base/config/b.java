package com.sankuai.waimai.business.restaurant.base.config;

import com.meituan.android.cube.pga.type.a;
import com.meituan.android.cube.pga.view.a;
import com.meituan.android.cube.pga.viewmodel.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.restaurant.framework.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b<ViewType extends com.meituan.android.cube.pga.view.a, ViewModelType extends com.meituan.android.cube.pga.viewmodel.a, ContextType extends com.meituan.android.cube.pga.type.a> extends g<ViewType, ViewModelType, ContextType> {
    public static ChangeQuickRedirect r;
    private boolean t;

    public b(ContextType contexttype) {
        super(contexttype);
        Object[] objArr = {contexttype};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c92fb048e8aec02c1351f3c99cbe34e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c92fb048e8aec02c1351f3c99cbe34e");
        } else {
            this.t = false;
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final boolean h() {
        return this.t;
    }
}
