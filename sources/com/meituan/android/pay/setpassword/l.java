package com.meituan.android.pay.setpassword;

import com.meituan.android.paybase.widgets.password.SafePasswordView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements SafePasswordView.a {
    public static ChangeQuickRedirect a;
    private final SetPasswordFragment b;

    public l(SetPasswordFragment setPasswordFragment) {
        this.b = setPasswordFragment;
    }

    @Override // com.meituan.android.paybase.widgets.password.SafePasswordView.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e92cd991d864a8bceb22d5debda0bbde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e92cd991d864a8bceb22d5debda0bbde");
        } else {
            this.b.b();
        }
    }
}
