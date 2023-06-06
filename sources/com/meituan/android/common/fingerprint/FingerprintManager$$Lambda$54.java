package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider;
import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$54 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FingerprintInfoProvider arg$1;

    public FingerprintManager$$Lambda$54(FingerprintInfoProvider fingerprintInfoProvider) {
        this.arg$1 = fingerprintInfoProvider;
    }

    public static InfoGetter lambdaFactory$(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8855e3a6b2fd6d3ceb5e9c7691ba55f8", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8855e3a6b2fd6d3ceb5e9c7691ba55f8") : new FingerprintManager$$Lambda$54(fingerprintInfoProvider);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35515e7daed482efead2e41a48ed7668", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35515e7daed482efead2e41a48ed7668") : FingerprintManager.lambda$setFingerprintInfo$46(this.arg$1);
    }
}
