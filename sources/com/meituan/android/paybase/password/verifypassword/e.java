package com.meituan.android.paybase.password.verifypassword;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PasswordConfirmPageFragment b;

    public e(PasswordConfirmPageFragment passwordConfirmPageFragment) {
        this.b = passwordConfirmPageFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac87adef74f66d46e87c2e70769a03d9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac87adef74f66d46e87c2e70769a03d9");
        } else {
            PasswordConfirmPageFragment.a(this.b, view);
        }
    }
}
