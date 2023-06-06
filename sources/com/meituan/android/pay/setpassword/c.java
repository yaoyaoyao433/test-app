package com.meituan.android.pay.setpassword;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final SetPasswordFragment b;

    public c(SetPasswordFragment setPasswordFragment) {
        this.b = setPasswordFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "316ac774dfd7ccc3883e93aeabb1a892", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "316ac774dfd7ccc3883e93aeabb1a892");
        } else {
            SetPasswordFragment.c(this.b, view);
        }
    }
}
