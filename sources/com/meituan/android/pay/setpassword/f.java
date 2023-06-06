package com.meituan.android.pay.setpassword;

import com.meituan.android.paybase.widgets.password.SafePasswordView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements SafePasswordView.a {
    public static ChangeQuickRedirect a;
    private final SetPasswordFragment b;
    private final Exception c;

    public f(SetPasswordFragment setPasswordFragment, Exception exc) {
        this.b = setPasswordFragment;
        this.c = exc;
    }

    @Override // com.meituan.android.paybase.widgets.password.SafePasswordView.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d85952789f9aaadcfbb868d283647f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d85952789f9aaadcfbb868d283647f2");
        } else {
            SetPasswordFragment.a(this.b, this.c);
        }
    }
}
