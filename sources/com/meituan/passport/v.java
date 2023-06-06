package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass1 b;
    private final com.meituan.passport.login.c c;

    private v(LoginActivity.AnonymousClass1 anonymousClass1, com.meituan.passport.login.c cVar) {
        this.b = anonymousClass1;
        this.c = cVar;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass1 anonymousClass1, com.meituan.passport.login.c cVar) {
        Object[] objArr = {anonymousClass1, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03f27e0e556de3ff76839e5b54915acb", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03f27e0e556de3ff76839e5b54915acb") : new v(anonymousClass1, cVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a4d40f219987e8ede8feb751bbaa655", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a4d40f219987e8ede8feb751bbaa655");
            return;
        }
        LoginActivity.AnonymousClass1 anonymousClass1 = this.b;
        com.meituan.passport.login.c cVar = this.c;
        Object[] objArr2 = {anonymousClass1, cVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d9f4a79444895291c57d03dcce42cf76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d9f4a79444895291c57d03dcce42cf76");
        } else {
            com.meituan.passport.utils.h.a(LoginActivity.this, cVar);
        }
    }
}
