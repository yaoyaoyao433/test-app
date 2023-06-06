package com.meituan.android.cashier.base.view.revision;

import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PopupWindow b;

    private b(PopupWindow popupWindow) {
        this.b = popupWindow;
    }

    public static View.OnClickListener a(PopupWindow popupWindow) {
        Object[] objArr = {popupWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e81e63a670fbf4beb3efef7bf03ada5e", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e81e63a670fbf4beb3efef7bf03ada5e") : new b(popupWindow);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d1ff081cf07906ef01132f908e4b745", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d1ff081cf07906ef01132f908e4b745");
        } else {
            CashierOrderInfoView.a(this.b, view);
        }
    }
}
