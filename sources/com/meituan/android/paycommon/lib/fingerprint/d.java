package com.meituan.android.paycommon.lib.fingerprint;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final VerifyFingerprintActivity b;
    private final String c;

    private d(VerifyFingerprintActivity verifyFingerprintActivity, String str) {
        this.b = verifyFingerprintActivity;
        this.c = str;
    }

    public static View.OnClickListener a(VerifyFingerprintActivity verifyFingerprintActivity, String str) {
        Object[] objArr = {verifyFingerprintActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6a12b92bb7c941d449e2237075d5b9e", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6a12b92bb7c941d449e2237075d5b9e") : new d(verifyFingerprintActivity, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8589abcba7a4fa61361b2ddad24fa0c", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8589abcba7a4fa61361b2ddad24fa0c");
        } else {
            VerifyFingerprintActivity.a(this.b, this.c, view);
        }
    }
}
