package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ad implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass3 b;

    private ad(LoginActivity.AnonymousClass3 anonymousClass3) {
        this.b = anonymousClass3;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass3 anonymousClass3) {
        Object[] objArr = {anonymousClass3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41b4f66a2b3fc802759cf3ae7c70b68f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41b4f66a2b3fc802759cf3ae7c70b68f") : new ad(anonymousClass3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42f3a40e08c099436788ca81e40e2ae6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42f3a40e08c099436788ca81e40e2ae6");
            return;
        }
        LoginActivity.AnonymousClass3 anonymousClass3 = this.b;
        Object[] objArr2 = {anonymousClass3, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass3.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e8bc4f97bc5c8788011ce57917da7481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e8bc4f97bc5c8788011ce57917da7481");
            return;
        }
        com.meituan.passport.utils.p.a().b(LoginActivity.this, 0, "-999");
        LoginActivity.this.a();
    }
}
