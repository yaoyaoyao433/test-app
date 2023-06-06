package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PrivicyPolicyDialog b;

    private o(PrivicyPolicyDialog privicyPolicyDialog) {
        this.b = privicyPolicyDialog;
    }

    public static View.OnClickListener a(PrivicyPolicyDialog privicyPolicyDialog) {
        Object[] objArr = {privicyPolicyDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd3a70a2573d8dca97492fe415838f7c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd3a70a2573d8dca97492fe415838f7c") : new o(privicyPolicyDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30afc4939e36ba1c04473251a81684d9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30afc4939e36ba1c04473251a81684d9");
        } else {
            PrivicyPolicyDialog.a(this.b, view);
        }
    }
}
