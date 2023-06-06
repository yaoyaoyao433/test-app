package com.meituan.android.paybase.password.verifypassword;

import com.meituan.android.paybase.widgets.password.SafePasswordView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements SafePasswordView.a {
    public static ChangeQuickRedirect a;
    private final PasswordConfirmDialogFragment b;

    public b(PasswordConfirmDialogFragment passwordConfirmDialogFragment) {
        this.b = passwordConfirmDialogFragment;
    }

    @Override // com.meituan.android.paybase.widgets.password.SafePasswordView.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5554a95e818b11ed83ac7aa4931f2dec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5554a95e818b11ed83ac7aa4931f2dec");
        } else {
            this.b.m();
        }
    }
}
