package com.meituan.android.paybase.fingerprint;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final OnlineVerifyFingerprintActivity b;

    private c(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity) {
        this.b = onlineVerifyFingerprintActivity;
    }

    public static View.OnClickListener a(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity) {
        Object[] objArr = {onlineVerifyFingerprintActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94a3a0d7f4452fb42353be1ed4827e9b", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94a3a0d7f4452fb42353be1ed4827e9b") : new c(onlineVerifyFingerprintActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6c58a407b3d68a220a4ee522eec8547", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6c58a407b3d68a220a4ee522eec8547");
        } else {
            OnlineVerifyFingerprintActivity.a(this.b, view);
        }
    }
}
