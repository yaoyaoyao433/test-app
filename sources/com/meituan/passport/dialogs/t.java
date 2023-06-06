package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final WarningDialog b;

    private t(WarningDialog warningDialog) {
        this.b = warningDialog;
    }

    public static View.OnClickListener a(WarningDialog warningDialog) {
        Object[] objArr = {warningDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d82b898a43171b1c1926e38a1762dac6", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d82b898a43171b1c1926e38a1762dac6") : new t(warningDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecc96472e29b19170fc836833c4afa4b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecc96472e29b19170fc836833c4afa4b");
        } else {
            WarningDialog.b(this.b, view);
        }
    }
}
