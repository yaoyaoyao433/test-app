package com.meituan.android.paybase.password.verifypassword;

import com.meituan.android.paybase.widgets.password.SafePasswordView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements SafePasswordView.a {
    public static ChangeQuickRedirect a;
    private final PasswordConfirmPageFragment b;

    public h(PasswordConfirmPageFragment passwordConfirmPageFragment) {
        this.b = passwordConfirmPageFragment;
    }

    @Override // com.meituan.android.paybase.widgets.password.SafePasswordView.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "580fc188115b02dc01dbe2d550d48352", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "580fc188115b02dc01dbe2d550d48352");
        } else {
            this.b.b();
        }
    }
}
