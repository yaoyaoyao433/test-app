package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass1 b;

    private t(LoginActivity.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass1 anonymousClass1) {
        Object[] objArr = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5882bc4461cbcbabae3aee4083d52c96", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5882bc4461cbcbabae3aee4083d52c96") : new t(anonymousClass1);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dfc684608242cc4eaa690b040532533", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dfc684608242cc4eaa690b040532533");
            return;
        }
        LoginActivity.AnonymousClass1 anonymousClass1 = this.b;
        Object[] objArr2 = {anonymousClass1, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4d4d790a3873075bc849949e5347449c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4d4d790a3873075bc849949e5347449c");
            return;
        }
        com.meituan.passport.utils.aj.a(LoginActivity.this, "b_g1h1dkf9", "c_ph4yzc83");
        view2 = LoginActivity.this.e;
        com.sankuai.meituan.navigation.d.a(view2).a();
    }
}
