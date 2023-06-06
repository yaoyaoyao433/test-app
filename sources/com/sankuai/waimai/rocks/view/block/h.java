package com.sankuai.waimai.rocks.view.block;

import android.view.ViewGroup;
import com.meituan.android.cube.pga.type.a;
import com.meituan.android.cube.pga.view.a;
import com.meituan.android.cube.pga.viewmodel.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class h<ViewType extends com.meituan.android.cube.pga.view.a, ViewModelType extends com.meituan.android.cube.pga.viewmodel.a, ContextType extends com.meituan.android.cube.pga.type.a> extends com.meituan.android.cube.pga.block.a<ViewType, ViewModelType, ContextType> {
    public static ChangeQuickRedirect s;

    public ViewGroup M() {
        return null;
    }

    public h(ContextType contexttype) {
        super(contexttype);
        Object[] objArr = {contexttype};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7425f73ee92ecba8c27f7364063704fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7425f73ee92ecba8c27f7364063704fc");
        }
    }
}
