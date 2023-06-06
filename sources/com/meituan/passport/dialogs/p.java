package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final UserPhoneBindedErrorFragment b;

    private p(UserPhoneBindedErrorFragment userPhoneBindedErrorFragment) {
        this.b = userPhoneBindedErrorFragment;
    }

    public static View.OnClickListener a(UserPhoneBindedErrorFragment userPhoneBindedErrorFragment) {
        Object[] objArr = {userPhoneBindedErrorFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88b6e98e7a5a787af5c353368868686a", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88b6e98e7a5a787af5c353368868686a") : new p(userPhoneBindedErrorFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a911f30c9e3dc57c4e19c8c772787f1", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a911f30c9e3dc57c4e19c8c772787f1");
        } else {
            UserPhoneBindedErrorFragment.c(this.b, view);
        }
    }
}
