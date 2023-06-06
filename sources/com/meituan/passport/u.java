package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass1 b;

    private u(LoginActivity.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass1 anonymousClass1) {
        Object[] objArr = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94e59e0d91b0e7ceaf37cf930a4e0240", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94e59e0d91b0e7ceaf37cf930a4e0240") : new u(anonymousClass1);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dd91e407557ca3619b91b5d6647026b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dd91e407557ca3619b91b5d6647026b");
            return;
        }
        LoginActivity.AnonymousClass1 anonymousClass1 = this.b;
        Object[] objArr2 = {anonymousClass1, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "868ce73e39bcd5b180b94092fbdb7e1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "868ce73e39bcd5b180b94092fbdb7e1b");
            return;
        }
        com.meituan.passport.utils.aj.a(LoginActivity.this, "b_gjapgn91", "c_group_up164w3j");
        com.meituan.passport.utils.p.a().b(LoginActivity.this, 0, "-999");
        LoginActivity.this.a();
    }
}
