package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.template;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.e;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public final void a(com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a aVar, ViewGroup viewGroup) {
        Object[] objArr = {aVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "710e7bc4fe59da6d23101e7c88ba4dde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "710e7bc4fe59da6d23101e7c88ba4dde");
        } else if (a(aVar)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.addRule(6, aVar.c());
            layoutParams.topMargin = g.a(com.meituan.android.singleton.b.a, -10.0f);
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public final boolean a(com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462a5cf69887c5c2c83f3b5da2191ecd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462a5cf69887c5c2c83f3b5da2191ecd")).booleanValue();
        }
        if (aVar instanceof e) {
            return true;
        }
        if (!com.sankuai.waimai.modular.utils.a.a(aVar.b())) {
            for (com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a aVar2 : aVar.b()) {
                if (aVar2 instanceof e) {
                    return true;
                }
            }
        }
        return false;
    }
}
