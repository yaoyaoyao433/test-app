package com.meituan.android.paycommon.lib.fingerprint;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final VerifyFingerprintActivity b;

    private e(VerifyFingerprintActivity verifyFingerprintActivity) {
        this.b = verifyFingerprintActivity;
    }

    public static View.OnClickListener a(VerifyFingerprintActivity verifyFingerprintActivity) {
        Object[] objArr = {verifyFingerprintActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f28c90b29334bf9c21187a2a608ad61", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f28c90b29334bf9c21187a2a608ad61") : new e(verifyFingerprintActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f45b90ae1f33fc01d10a406f2e69975", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f45b90ae1f33fc01d10a406f2e69975");
        } else {
            VerifyFingerprintActivity.a(this.b, view);
        }
    }
}
