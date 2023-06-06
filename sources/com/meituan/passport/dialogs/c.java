package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CommonDialog b;

    private c(CommonDialog commonDialog) {
        this.b = commonDialog;
    }

    public static View.OnClickListener a(CommonDialog commonDialog) {
        Object[] objArr = {commonDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11ef882ab781f33783a5e8448f5d7c9b", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11ef882ab781f33783a5e8448f5d7c9b") : new c(commonDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff40aff20dd9528ec40ac5ddbf9b00d1", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff40aff20dd9528ec40ac5ddbf9b00d1");
        } else {
            CommonDialog.a(this.b, view);
        }
    }
}
