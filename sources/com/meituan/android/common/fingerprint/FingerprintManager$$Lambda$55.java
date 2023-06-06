package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider;
import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$55 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FingerprintInfoProvider arg$1;

    public FingerprintManager$$Lambda$55(FingerprintInfoProvider fingerprintInfoProvider) {
        this.arg$1 = fingerprintInfoProvider;
    }

    public static InfoGetter lambdaFactory$(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71c294c35c7aafc0a80d7f8140d87e0c", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71c294c35c7aafc0a80d7f8140d87e0c") : new FingerprintManager$$Lambda$55(fingerprintInfoProvider);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6f94b07f6ecdcaf7e67ef684992c1ad", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6f94b07f6ecdcaf7e67ef684992c1ad") : FingerprintManager.lambda$setFingerprintInfo$47(this.arg$1);
    }
}
