package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider;
import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$8 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FingerprintInfoProvider arg$1;

    public FingerprintManager$$Lambda$8(FingerprintInfoProvider fingerprintInfoProvider) {
        this.arg$1 = fingerprintInfoProvider;
    }

    public static InfoGetter lambdaFactory$(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "02b83b7943187b143c55e709312ecd9b", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "02b83b7943187b143c55e709312ecd9b") : new FingerprintManager$$Lambda$8(fingerprintInfoProvider);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93ff0862b922a4fcc100d80d0ea47cc6", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93ff0862b922a4fcc100d80d0ea47cc6") : FingerprintManager.lambda$setFingerprintInfo$4(this.arg$1);
    }
}
