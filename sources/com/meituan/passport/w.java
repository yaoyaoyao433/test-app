package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass2 b;

    private w(LoginActivity.AnonymousClass2 anonymousClass2) {
        this.b = anonymousClass2;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass2 anonymousClass2) {
        Object[] objArr = {anonymousClass2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "261d58312dd6a3345dc9f9bfab052c5e", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "261d58312dd6a3345dc9f9bfab052c5e") : new w(anonymousClass2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2993e49a0eb5d409fdb21346480ff3b2", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2993e49a0eb5d409fdb21346480ff3b2");
            return;
        }
        LoginActivity.AnonymousClass2 anonymousClass2 = this.b;
        Object[] objArr2 = {anonymousClass2, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass2.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "503703371c7c48241b9767046fc00a9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "503703371c7c48241b9767046fc00a9e");
            return;
        }
        com.meituan.passport.utils.aj.a(LoginActivity.this, "b_gjapgn91", "c_hvcwz3nv");
        com.meituan.passport.utils.p.a().b(LoginActivity.this, 2, "-999");
        LoginActivity.this.a();
    }
}
