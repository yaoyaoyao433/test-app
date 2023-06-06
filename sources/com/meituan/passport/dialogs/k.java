package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final OtherLoginDialogFragment b;

    public k(OtherLoginDialogFragment otherLoginDialogFragment) {
        this.b = otherLoginDialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa53f752236741d1d439bcabba39b058", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa53f752236741d1d439bcabba39b058");
        } else {
            OtherLoginDialogFragment.a(this.b, view);
        }
    }
}
