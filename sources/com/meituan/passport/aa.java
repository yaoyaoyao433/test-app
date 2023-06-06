package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class aa implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass3 b;
    private final com.meituan.passport.login.a c;

    private aa(LoginActivity.AnonymousClass3 anonymousClass3, com.meituan.passport.login.a aVar) {
        this.b = anonymousClass3;
        this.c = aVar;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass3 anonymousClass3, com.meituan.passport.login.a aVar) {
        Object[] objArr = {anonymousClass3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e0d0293567402df76f6aa2c950f0262", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e0d0293567402df76f6aa2c950f0262") : new aa(anonymousClass3, aVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d519f21e122de7c9a75e6c8c34dcec5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d519f21e122de7c9a75e6c8c34dcec5");
            return;
        }
        LoginActivity.AnonymousClass3 anonymousClass3 = this.b;
        com.meituan.passport.login.a aVar = this.c;
        Object[] objArr2 = {anonymousClass3, aVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass3.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1df7dcf6d9f73b58c161362aabb2b250", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1df7dcf6d9f73b58c161362aabb2b250");
            return;
        }
        com.meituan.passport.utils.p.a().b(LoginActivity.this, aVar != com.meituan.passport.login.a.AccountPassword ? 2 : 3, "-999");
        LoginActivity.this.a();
    }
}
