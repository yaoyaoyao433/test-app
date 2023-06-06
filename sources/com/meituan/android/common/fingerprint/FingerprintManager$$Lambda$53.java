package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider;
import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$53 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FingerprintInfoProvider arg$1;

    public FingerprintManager$$Lambda$53(FingerprintInfoProvider fingerprintInfoProvider) {
        this.arg$1 = fingerprintInfoProvider;
    }

    public static InfoGetter lambdaFactory$(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a94b8c8438a8d006f415682825fd0b7", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a94b8c8438a8d006f415682825fd0b7") : new FingerprintManager$$Lambda$53(fingerprintInfoProvider);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba45e3bcafa401ff0488faf11ed882cc", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba45e3bcafa401ff0488faf11ed882cc") : FingerprintManager.lambda$setFingerprintInfo$45(this.arg$1);
    }
}
