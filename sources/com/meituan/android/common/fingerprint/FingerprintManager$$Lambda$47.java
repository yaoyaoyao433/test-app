package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$47 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FingerprintManager arg$1;

    public FingerprintManager$$Lambda$47(FingerprintManager fingerprintManager) {
        this.arg$1 = fingerprintManager;
    }

    public static InfoGetter lambdaFactory$(FingerprintManager fingerprintManager) {
        Object[] objArr = {fingerprintManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "48b616577ca2292f37a5b7a6cd826c18", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "48b616577ca2292f37a5b7a6cd826c18") : new FingerprintManager$$Lambda$47(fingerprintManager);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff48a6690f8b34724f87bd3c317ec3eb", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff48a6690f8b34724f87bd3c317ec3eb") : this.arg$1.lambda$setFingerprintInfo$40();
    }
}
