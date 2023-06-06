package com.meituan.android.paybase.fingerprint;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final OnlineVerifyFingerprintActivity b;

    private a(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity) {
        this.b = onlineVerifyFingerprintActivity;
    }

    public static View.OnClickListener a(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity) {
        Object[] objArr = {onlineVerifyFingerprintActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be82424e96ceaea8ebe08d1b6cce209f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be82424e96ceaea8ebe08d1b6cce209f") : new a(onlineVerifyFingerprintActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cf0243a8e71549ddaf19264d529aa5f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cf0243a8e71549ddaf19264d529aa5f");
        } else {
            OnlineVerifyFingerprintActivity.c(this.b, view);
        }
    }
}
