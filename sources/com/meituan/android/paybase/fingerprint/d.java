package com.meituan.android.paybase.fingerprint;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final OnlineVerifyFingerprintActivity b;

    private d(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity) {
        this.b = onlineVerifyFingerprintActivity;
    }

    public static Runnable a(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity) {
        Object[] objArr = {onlineVerifyFingerprintActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4cd039e046fc5870c79df81283f2893b", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4cd039e046fc5870c79df81283f2893b") : new d(onlineVerifyFingerprintActivity);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3e6c5274ea616a3717426833a6e8327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3e6c5274ea616a3717426833a6e8327");
        } else {
            this.b.j();
        }
    }
}
