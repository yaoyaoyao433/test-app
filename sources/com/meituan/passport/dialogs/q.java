package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final UserPhoneBindedErrorFragment b;

    private q(UserPhoneBindedErrorFragment userPhoneBindedErrorFragment) {
        this.b = userPhoneBindedErrorFragment;
    }

    public static View.OnClickListener a(UserPhoneBindedErrorFragment userPhoneBindedErrorFragment) {
        Object[] objArr = {userPhoneBindedErrorFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfce81687d57a38d60bbe95ccdc54f2f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfce81687d57a38d60bbe95ccdc54f2f") : new q(userPhoneBindedErrorFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "875e7c175d6dc04a9517ad8e2898fc1d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "875e7c175d6dc04a9517ad8e2898fc1d");
        } else {
            UserPhoneBindedErrorFragment.b(this.b, view);
        }
    }
}
