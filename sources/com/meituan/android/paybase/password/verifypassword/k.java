package com.meituan.android.paybase.password.verifypassword;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PasswordVerifyActivity b;

    private k(PasswordVerifyActivity passwordVerifyActivity) {
        this.b = passwordVerifyActivity;
    }

    public static View.OnClickListener a(PasswordVerifyActivity passwordVerifyActivity) {
        Object[] objArr = {passwordVerifyActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6073006b2eab5ca605e5a2704dc5b52b", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6073006b2eab5ca605e5a2704dc5b52b") : new k(passwordVerifyActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d30c134adb42621b9260f3aad61711b1", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d30c134adb42621b9260f3aad61711b1");
        } else {
            PasswordVerifyActivity.a(this.b, view);
        }
    }
}
