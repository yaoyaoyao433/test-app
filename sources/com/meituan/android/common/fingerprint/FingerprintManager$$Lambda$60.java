package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider;
import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$60 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FingerprintInfoProvider arg$1;

    public FingerprintManager$$Lambda$60(FingerprintInfoProvider fingerprintInfoProvider) {
        this.arg$1 = fingerprintInfoProvider;
    }

    public static InfoGetter lambdaFactory$(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eeab1369ccf98e96329a1f7a37680e96", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eeab1369ccf98e96329a1f7a37680e96") : new FingerprintManager$$Lambda$60(fingerprintInfoProvider);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a13e75ca8febe6755a90aca468853dfe", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a13e75ca8febe6755a90aca468853dfe") : FingerprintManager.lambda$setFingerprintInfo$52(this.arg$1);
    }
}
