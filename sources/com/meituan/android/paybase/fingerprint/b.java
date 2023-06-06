package com.meituan.android.paybase.fingerprint;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final OnlineVerifyFingerprintActivity b;

    private b(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity) {
        this.b = onlineVerifyFingerprintActivity;
    }

    public static View.OnClickListener a(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity) {
        Object[] objArr = {onlineVerifyFingerprintActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f79e6bd85fdcb707f767ed8fd0183a73", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f79e6bd85fdcb707f767ed8fd0183a73") : new b(onlineVerifyFingerprintActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9971317bc0da1dc834d33e65563b84a3", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9971317bc0da1dc834d33e65563b84a3");
        } else {
            OnlineVerifyFingerprintActivity.b(this.b, view);
        }
    }
}
