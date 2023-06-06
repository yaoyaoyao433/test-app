package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final WarningDialog b;

    private u(WarningDialog warningDialog) {
        this.b = warningDialog;
    }

    public static View.OnClickListener a(WarningDialog warningDialog) {
        Object[] objArr = {warningDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e3b746e61f8a180e8f6fd8b5e389981", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e3b746e61f8a180e8f6fd8b5e389981") : new u(warningDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86f195f6147f31dfa34defb5c8309f7", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86f195f6147f31dfa34defb5c8309f7");
        } else {
            WarningDialog.a(this.b, view);
        }
    }
}
