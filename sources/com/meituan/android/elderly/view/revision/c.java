package com.meituan.android.elderly.view.revision;

import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PopupWindow b;

    private c(PopupWindow popupWindow) {
        this.b = popupWindow;
    }

    public static View.OnClickListener a(PopupWindow popupWindow) {
        Object[] objArr = {popupWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bdf8ab451dfb6436c552070973768e9", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bdf8ab451dfb6436c552070973768e9") : new c(popupWindow);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74684c6dabc31f10ca5491bec3dc4e73", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74684c6dabc31f10ca5491bec3dc4e73");
        } else {
            a.a(this.b, view);
        }
    }
}
