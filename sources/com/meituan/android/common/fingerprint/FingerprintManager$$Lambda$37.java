package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$37 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FingerprintManager arg$1;

    public FingerprintManager$$Lambda$37(FingerprintManager fingerprintManager) {
        this.arg$1 = fingerprintManager;
    }

    public static InfoGetter lambdaFactory$(FingerprintManager fingerprintManager) {
        Object[] objArr = {fingerprintManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "003773574d46eac7cb01429b68cf54b7", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "003773574d46eac7cb01429b68cf54b7") : new FingerprintManager$$Lambda$37(fingerprintManager);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3303b77ed8539ef949d7440cacdf864", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3303b77ed8539ef949d7440cacdf864") : this.arg$1.lambda$setFingerprintInfo$31();
    }
}
