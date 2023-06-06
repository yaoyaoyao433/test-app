package com.meituan.android.pay.setpassword;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final SetPasswordFragment b;

    public i(SetPasswordFragment setPasswordFragment) {
        this.b = setPasswordFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fbf198d38a6a71721a0e1888668ccf7", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fbf198d38a6a71721a0e1888668ccf7");
        } else {
            SetPasswordFragment.a(this.b, view);
        }
    }
}
