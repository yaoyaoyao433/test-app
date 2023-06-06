package com.meituan.android.pay.setpassword;

import com.meituan.android.paybase.widgets.password.SafePasswordView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements SafePasswordView.a {
    public static ChangeQuickRedirect a;
    private final SetPasswordFragment b;

    public k(SetPasswordFragment setPasswordFragment) {
        this.b = setPasswordFragment;
    }

    @Override // com.meituan.android.paybase.widgets.password.SafePasswordView.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4e1ae9c4eb5bbfe497933f3e9296dce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4e1ae9c4eb5bbfe497933f3e9296dce");
        } else {
            this.b.b();
        }
    }
}
