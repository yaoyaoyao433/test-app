package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginPasswordRetrieve b;

    private i(LoginPasswordRetrieve loginPasswordRetrieve) {
        this.b = loginPasswordRetrieve;
    }

    public static View.OnClickListener a(LoginPasswordRetrieve loginPasswordRetrieve) {
        Object[] objArr = {loginPasswordRetrieve};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48d0847ff095023f8110b6f02c83945c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48d0847ff095023f8110b6f02c83945c") : new i(loginPasswordRetrieve);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b91b6502e27d055401bf41a75498c462", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b91b6502e27d055401bf41a75498c462");
        } else {
            LoginPasswordRetrieve.a(this.b, view);
        }
    }
}
