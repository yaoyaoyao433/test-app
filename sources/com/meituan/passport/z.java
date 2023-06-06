package com.meituan.passport;

import android.view.View;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity.AnonymousClass2 b;
    private final com.meituan.passport.login.c c;

    private z(LoginActivity.AnonymousClass2 anonymousClass2, com.meituan.passport.login.c cVar) {
        this.b = anonymousClass2;
        this.c = cVar;
    }

    public static View.OnClickListener a(LoginActivity.AnonymousClass2 anonymousClass2, com.meituan.passport.login.c cVar) {
        Object[] objArr = {anonymousClass2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "027e72a33ec583cee8ad3e8d39ce6c69", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "027e72a33ec583cee8ad3e8d39ce6c69") : new z(anonymousClass2, cVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bded43c191fd91953c4f79134245c1de", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bded43c191fd91953c4f79134245c1de");
            return;
        }
        LoginActivity.AnonymousClass2 anonymousClass2 = this.b;
        com.meituan.passport.login.c cVar = this.c;
        Object[] objArr2 = {anonymousClass2, cVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.AnonymousClass2.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9b45b2a4d94e32593dd447d8190c57eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9b45b2a4d94e32593dd447d8190c57eb");
        } else {
            com.meituan.passport.utils.h.a(LoginActivity.this, cVar);
        }
    }
}
