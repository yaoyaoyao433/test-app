package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginPasswordRetrieve b;

    private g(LoginPasswordRetrieve loginPasswordRetrieve) {
        this.b = loginPasswordRetrieve;
    }

    public static View.OnClickListener a(LoginPasswordRetrieve loginPasswordRetrieve) {
        Object[] objArr = {loginPasswordRetrieve};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d09d93d63d580d551d9067edfa2ab510", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d09d93d63d580d551d9067edfa2ab510") : new g(loginPasswordRetrieve);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3655f2064d6b26faa994d17027fb14be", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3655f2064d6b26faa994d17027fb14be");
        } else {
            LoginPasswordRetrieve.c(this.b, view);
        }
    }
}
