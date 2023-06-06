package com.meituan.passport.dialogs;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements DialogInterface.OnDismissListener {
    public static ChangeQuickRedirect a;
    private final PrivicyPolicyDialog b;

    public m(PrivicyPolicyDialog privicyPolicyDialog) {
        this.b = privicyPolicyDialog;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b207cdfdd7eafd89a08c68336e4df05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b207cdfdd7eafd89a08c68336e4df05");
        } else {
            PrivicyPolicyDialog.a(this.b, dialogInterface);
        }
    }
}
