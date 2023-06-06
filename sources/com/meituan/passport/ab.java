package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass3 b;

    private ab(LoginActivity.AnonymousClass3 anonymousClass3) {
        this.b = anonymousClass3;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass3 anonymousClass3) {
        Object[] objArr = {anonymousClass3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0448fc04c011ee2de71b69d0178c10e", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0448fc04c011ee2de71b69d0178c10e") : new ab(anonymousClass3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74fe14be2a7ea8d4ebad1e17032a7c87", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74fe14be2a7ea8d4ebad1e17032a7c87");
            return;
        }
        LoginActivity.AnonymousClass3 anonymousClass3 = this.b;
        Object[] objArr2 = {anonymousClass3, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass3.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "81b0371f0120ba0850e65921dd4bd0a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "81b0371f0120ba0850e65921dd4bd0a8");
            return;
        }
        com.meituan.passport.utils.p.a().b(LoginActivity.this, 1, com.meituan.passport.plugins.q.a().j.a());
        LoginActivity.this.a();
    }
}
