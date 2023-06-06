package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PrivicyPolicyDialog b;

    private n(PrivicyPolicyDialog privicyPolicyDialog) {
        this.b = privicyPolicyDialog;
    }

    public static View.OnClickListener a(PrivicyPolicyDialog privicyPolicyDialog) {
        Object[] objArr = {privicyPolicyDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11df9d1c0c2d6d43ef4cb82a67975af9", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11df9d1c0c2d6d43ef4cb82a67975af9") : new n(privicyPolicyDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd894efaf627e6edfdaad80bbe7b56d8", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd894efaf627e6edfdaad80bbe7b56d8");
        } else {
            PrivicyPolicyDialog.b(this.b, view);
        }
    }
}
