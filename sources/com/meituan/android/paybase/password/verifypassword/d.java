package com.meituan.android.paybase.password.verifypassword;

import com.meituan.android.paybase.password.AbstractPasswordKeyboardDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements AbstractPasswordKeyboardDialogFragment.b {
    public static ChangeQuickRedirect a;
    private final PasswordConfirmDialogFragment b;
    private final String c;

    public d(PasswordConfirmDialogFragment passwordConfirmDialogFragment, String str) {
        this.b = passwordConfirmDialogFragment;
        this.c = str;
    }

    @Override // com.meituan.android.paybase.password.AbstractPasswordKeyboardDialogFragment.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c992caf3968376b607c33ff878339c70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c992caf3968376b607c33ff878339c70");
        } else {
            PasswordConfirmDialogFragment.a(this.b, this.c);
        }
    }
}
