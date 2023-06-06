package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass2 b;

    private y(LoginActivity.AnonymousClass2 anonymousClass2) {
        this.b = anonymousClass2;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass2 anonymousClass2) {
        Object[] objArr = {anonymousClass2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70b62bfcff281237c50f68b07007453b", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70b62bfcff281237c50f68b07007453b") : new y(anonymousClass2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50f21f5552931db43489bfe64abcac81", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50f21f5552931db43489bfe64abcac81");
            return;
        }
        LoginActivity.AnonymousClass2 anonymousClass2 = this.b;
        Object[] objArr2 = {anonymousClass2, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass2.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2bb0ce50bb5211de31c2f87b0b65faeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2bb0ce50bb5211de31c2f87b0b65faeb");
            return;
        }
        com.meituan.passport.utils.aj.a(LoginActivity.this, "b_g1h1dkf9", "c_ph4yzc83");
        view2 = LoginActivity.this.e;
        com.sankuai.meituan.navigation.d.a(view2).a();
    }
}
