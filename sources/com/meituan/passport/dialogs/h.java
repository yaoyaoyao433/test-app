package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginPasswordRetrieve b;

    private h(LoginPasswordRetrieve loginPasswordRetrieve) {
        this.b = loginPasswordRetrieve;
    }

    public static View.OnClickListener a(LoginPasswordRetrieve loginPasswordRetrieve) {
        Object[] objArr = {loginPasswordRetrieve};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bb5f8846bc6959174c34c006424ff97", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bb5f8846bc6959174c34c006424ff97") : new h(loginPasswordRetrieve);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d658e58f8fa8ff69aa25fa50503656", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d658e58f8fa8ff69aa25fa50503656");
        } else {
            LoginPasswordRetrieve.b(this.b, view);
        }
    }
}
