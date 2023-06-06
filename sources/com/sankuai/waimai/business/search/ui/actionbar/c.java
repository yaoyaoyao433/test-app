package com.sankuai.waimai.business.search.ui.actionbar;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.view.GravityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends PopupWindow {
    public static ChangeQuickRedirect a;

    public c(Context context) {
        super(LayoutInflater.from(context).inflate(R.layout.wm_nox_search_popupwindow_location, (ViewGroup) null), -2, -2);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7876351174b945d3cad5c0e44537c45d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7876351174b945d3cad5c0e44537c45d");
        } else {
            setAnimationStyle(R.style.wm_nox_search_location_tip_pop_style);
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "203fda8be6e8468271668f449b6c44d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "203fda8be6e8468271668f449b6c44d5");
            return;
        }
        try {
            super.showAsDropDown(view, 0, 0, GravityCompat.END);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
