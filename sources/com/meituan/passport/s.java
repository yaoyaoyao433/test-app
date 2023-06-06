package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass1 b;

    private s(LoginActivity.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass1 anonymousClass1) {
        Object[] objArr = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29bb5325a7237c86fc362d1aaf757894", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29bb5325a7237c86fc362d1aaf757894") : new s(anonymousClass1);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfb7d0f583f051ffadbaede830af0b30", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfb7d0f583f051ffadbaede830af0b30");
            return;
        }
        LoginActivity.AnonymousClass1 anonymousClass1 = this.b;
        Object[] objArr2 = {anonymousClass1, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4fd2eed87aa32e1fffc85743e1d0043e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4fd2eed87aa32e1fffc85743e1d0043e");
            return;
        }
        HashMap hashMap = new HashMap();
        if (com.meituan.passport.plugins.q.a().j != null) {
            hashMap.put("operator_type", com.meituan.passport.plugins.q.a().j.a());
            com.meituan.passport.utils.p.a().b(LoginActivity.this, 1, com.meituan.passport.plugins.q.a().j.a());
        } else {
            hashMap.put("operator_type", "");
        }
        com.meituan.passport.utils.aj.a(LoginActivity.this, "b_gjapgn91", "c_lfb1eao8", hashMap);
        LoginActivity.this.a();
    }
}
