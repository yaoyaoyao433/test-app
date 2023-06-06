package com.sankuai.waimai.store.poi.list.newp.adapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.poi.list.newp.PoiVerticalityHomeActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51eaff12c221924d523c2c9978717e56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51eaff12c221924d523c2c9978717e56");
        } else if (view != null && o.o() && (view.getContext() instanceof PoiVerticalityHomeActivity) && view.getMinimumHeight() == 0) {
            view.setMinimumHeight(1);
        }
    }
}
