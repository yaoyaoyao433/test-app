package com.meituan.android.paycommon.lib.fingerprint;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final VerifyFingerprintActivity b;

    private c(VerifyFingerprintActivity verifyFingerprintActivity) {
        this.b = verifyFingerprintActivity;
    }

    public static View.OnClickListener a(VerifyFingerprintActivity verifyFingerprintActivity) {
        Object[] objArr = {verifyFingerprintActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2038ae4a96f60af1d6b031a797ba53f5", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2038ae4a96f60af1d6b031a797ba53f5") : new c(verifyFingerprintActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b05a6afdd31ce92dab3d0cc233c1486f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b05a6afdd31ce92dab3d0cc233c1486f");
        } else {
            VerifyFingerprintActivity.b(this.b, view);
        }
    }
}
