package com.meituan.android.paycommon.lib.fingerprint;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final VerifyFingerprintActivity b;

    private b(VerifyFingerprintActivity verifyFingerprintActivity) {
        this.b = verifyFingerprintActivity;
    }

    public static Runnable a(VerifyFingerprintActivity verifyFingerprintActivity) {
        Object[] objArr = {verifyFingerprintActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d342326a01e20cf1671026a825d15df", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d342326a01e20cf1671026a825d15df") : new b(verifyFingerprintActivity);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217c893e05ff12bbc782b7e6db7bb6b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217c893e05ff12bbc782b7e6db7bb6b6");
        } else {
            VerifyFingerprintActivity.a(this.b);
        }
    }
}
