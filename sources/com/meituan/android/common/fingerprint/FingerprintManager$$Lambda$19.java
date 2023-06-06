package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$19 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FingerprintManager arg$1;

    public FingerprintManager$$Lambda$19(FingerprintManager fingerprintManager) {
        this.arg$1 = fingerprintManager;
    }

    public static InfoGetter lambdaFactory$(FingerprintManager fingerprintManager) {
        Object[] objArr = {fingerprintManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f1493f77a8bd4fe968d1c6b08be9aa7", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f1493f77a8bd4fe968d1c6b08be9aa7") : new FingerprintManager$$Lambda$19(fingerprintManager);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f785694d64a97b6b96c45cd994c2eca", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f785694d64a97b6b96c45cd994c2eca") : this.arg$1.lambda$setFingerprintInfo$14();
    }
}
