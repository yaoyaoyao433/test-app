package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass1 b;
    private final com.meituan.passport.login.c c;

    private r(LoginActivity.AnonymousClass1 anonymousClass1, com.meituan.passport.login.c cVar) {
        this.b = anonymousClass1;
        this.c = cVar;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass1 anonymousClass1, com.meituan.passport.login.c cVar) {
        Object[] objArr = {anonymousClass1, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4e55f86c02397b85bdd12010811bbdc", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4e55f86c02397b85bdd12010811bbdc") : new r(anonymousClass1, cVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "808641551037bf66408f58ad109d9854", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "808641551037bf66408f58ad109d9854");
            return;
        }
        LoginActivity.AnonymousClass1 anonymousClass1 = this.b;
        com.meituan.passport.login.c cVar = this.c;
        Object[] objArr2 = {anonymousClass1, cVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "197fb45561efc775aa4b3a1a9de21d8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "197fb45561efc775aa4b3a1a9de21d8c");
            return;
        }
        com.meituan.passport.utils.p.a().b(LoginActivity.this, cVar != com.meituan.passport.login.c.AccountPassword ? 2 : 3, "-999");
        com.meituan.passport.utils.aj.a(LoginActivity.this, "b_gjapgn91", "c_hvcwz3nv");
        LoginActivity.this.a();
    }
}
