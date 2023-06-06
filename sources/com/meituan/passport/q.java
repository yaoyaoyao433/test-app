package com.meituan.passport;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LoginActivity b;

    private q(LoginActivity loginActivity) {
        this.b = loginActivity;
    }

    public static View.OnClickListener a(LoginActivity loginActivity) {
        Object[] objArr = {loginActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "826d336c44af1f9a3217766abae1e7ab", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "826d336c44af1f9a3217766abae1e7ab") : new q(loginActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5256e8bf212a08eb0b417b2375f85219", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5256e8bf212a08eb0b417b2375f85219");
        } else {
            LoginActivity.a(this.b, view);
        }
    }
}
