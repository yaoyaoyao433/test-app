package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass2 b;

    private x(LoginActivity.AnonymousClass2 anonymousClass2) {
        this.b = anonymousClass2;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass2 anonymousClass2) {
        Object[] objArr = {anonymousClass2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aca2e1357e79a72cac427806ec01132b", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aca2e1357e79a72cac427806ec01132b") : new x(anonymousClass2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5f1b83df0fec77de7589ff97d3818e5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5f1b83df0fec77de7589ff97d3818e5");
            return;
        }
        LoginActivity.AnonymousClass2 anonymousClass2 = this.b;
        Object[] objArr2 = {anonymousClass2, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass2.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fd289ec574dd51d340db71c63a857463", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fd289ec574dd51d340db71c63a857463");
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
