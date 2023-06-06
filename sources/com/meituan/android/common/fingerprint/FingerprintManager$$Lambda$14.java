package com.meituan.android.common.fingerprint;

import android.net.ConnectivityManager;
import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$14 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FingerprintManager arg$1;
    private final ConnectivityManager arg$2;

    public FingerprintManager$$Lambda$14(FingerprintManager fingerprintManager, ConnectivityManager connectivityManager) {
        this.arg$1 = fingerprintManager;
        this.arg$2 = connectivityManager;
    }

    public static InfoGetter lambdaFactory$(FingerprintManager fingerprintManager, ConnectivityManager connectivityManager) {
        Object[] objArr = {fingerprintManager, connectivityManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c8dc6567ccd3d47a43c12803688db4b", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c8dc6567ccd3d47a43c12803688db4b") : new FingerprintManager$$Lambda$14(fingerprintManager, connectivityManager);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba27309ed445771be079f97f8eff97dc", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba27309ed445771be079f97f8eff97dc") : this.arg$1.lambda$setFingerprintInfo$9(this.arg$2);
    }
}
