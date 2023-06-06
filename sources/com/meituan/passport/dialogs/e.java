package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ConfirmDialog b;

    private e(ConfirmDialog confirmDialog) {
        this.b = confirmDialog;
    }

    public static View.OnClickListener a(ConfirmDialog confirmDialog) {
        Object[] objArr = {confirmDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "885219a4fc7ae5e5fd7e41c8363a3dc7", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "885219a4fc7ae5e5fd7e41c8363a3dc7") : new e(confirmDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68eb5038cf640edbe39961b988783452", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68eb5038cf640edbe39961b988783452");
        } else {
            ConfirmDialog.b(this.b, view);
        }
    }
}
