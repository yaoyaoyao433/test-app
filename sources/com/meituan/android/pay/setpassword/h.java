package com.meituan.android.pay.setpassword;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final SetPasswordFragment b;

    public h(SetPasswordFragment setPasswordFragment) {
        this.b = setPasswordFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c2f8797f0f3c924980e589fe0b48bf5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c2f8797f0f3c924980e589fe0b48bf5");
        } else {
            SetPasswordFragment.b(this.b, view);
        }
    }
}
