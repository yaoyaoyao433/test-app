package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ac implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass3 b;

    private ac(LoginActivity.AnonymousClass3 anonymousClass3) {
        this.b = anonymousClass3;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass3 anonymousClass3) {
        Object[] objArr = {anonymousClass3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca0f6814f36dbd76eab56e633652dafa", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca0f6814f36dbd76eab56e633652dafa") : new ac(anonymousClass3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d18b4ab88585ffd7d8c39935f01aded", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d18b4ab88585ffd7d8c39935f01aded");
            return;
        }
        LoginActivity.AnonymousClass3 anonymousClass3 = this.b;
        Object[] objArr2 = {anonymousClass3, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass3.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "05e25ef35fea5d3d081364f496ebbbed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "05e25ef35fea5d3d081364f496ebbbed");
            return;
        }
        view2 = LoginActivity.this.e;
        com.sankuai.meituan.navigation.d.a(view2).a();
    }
}
