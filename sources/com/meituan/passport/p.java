package com.meituan.passport;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final IdentityVerificationFragment b;

    private p(IdentityVerificationFragment identityVerificationFragment) {
        this.b = identityVerificationFragment;
    }

    public static View.OnClickListener a(IdentityVerificationFragment identityVerificationFragment) {
        Object[] objArr = {identityVerificationFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fe540e6049981de4d51fa93ebe59708", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fe540e6049981de4d51fa93ebe59708") : new p(identityVerificationFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f42d0dd7d78a3986abc039611d65143", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f42d0dd7d78a3986abc039611d65143");
        } else {
            IdentityVerificationFragment.a(this.b, view);
        }
    }
}
