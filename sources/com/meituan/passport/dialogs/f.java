package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ConfirmDialog b;

    private f(ConfirmDialog confirmDialog) {
        this.b = confirmDialog;
    }

    public static View.OnClickListener a(ConfirmDialog confirmDialog) {
        Object[] objArr = {confirmDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f8be9e6a955fb8bdef224390af32fe9", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f8be9e6a955fb8bdef224390af32fe9") : new f(confirmDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5721a7032cd54a6d81adcc7f7629ca68", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5721a7032cd54a6d81adcc7f7629ca68");
        } else {
            ConfirmDialog.a(this.b, view);
        }
    }
}
