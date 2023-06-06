package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ConfirmDialog b;

    private d(ConfirmDialog confirmDialog) {
        this.b = confirmDialog;
    }

    public static View.OnClickListener a(ConfirmDialog confirmDialog) {
        Object[] objArr = {confirmDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d177d61be794e0cbd363ba5914a78811", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d177d61be794e0cbd363ba5914a78811") : new d(confirmDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32cb4e38b6780f93edf7e16589d73c2a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32cb4e38b6780f93edf7e16589d73c2a");
        } else {
            ConfirmDialog.c(this.b, view);
        }
    }
}
