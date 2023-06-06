package com.meituan.android.paybase.password.verifypassword;

import com.meituan.android.paybase.password.AbstractPasswordKeyboardDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements AbstractPasswordKeyboardDialogFragment.b {
    public static ChangeQuickRedirect a;
    private final PasswordConfirmDialogFragment b;

    public c(PasswordConfirmDialogFragment passwordConfirmDialogFragment) {
        this.b = passwordConfirmDialogFragment;
    }

    @Override // com.meituan.android.paybase.password.AbstractPasswordKeyboardDialogFragment.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac4cd775f9510752b71805c7ede940d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac4cd775f9510752b71805c7ede940d6");
        } else {
            PasswordConfirmDialogFragment.a(this.b);
        }
    }
}
