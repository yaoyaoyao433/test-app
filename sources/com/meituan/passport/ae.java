package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass3 b;

    private ae(LoginActivity.AnonymousClass3 anonymousClass3) {
        this.b = anonymousClass3;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass3 anonymousClass3) {
        Object[] objArr = {anonymousClass3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18c170d94a8fd25b1245fea54c2aaf12", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18c170d94a8fd25b1245fea54c2aaf12") : new ae(anonymousClass3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8fdf3b1b109c97c5e8fd8f8de6b1d62", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8fdf3b1b109c97c5e8fd8f8de6b1d62");
            return;
        }
        LoginActivity.AnonymousClass3 anonymousClass3 = this.b;
        Object[] objArr2 = {anonymousClass3, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass3.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "27dc6b052aa4d0e99b7b2f893aa0a899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "27dc6b052aa4d0e99b7b2f893aa0a899");
        } else {
            com.meituan.passport.utils.h.a(LoginActivity.this, null);
        }
    }
}
