package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$51 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FingerprintManager arg$1;

    public FingerprintManager$$Lambda$51(FingerprintManager fingerprintManager) {
        this.arg$1 = fingerprintManager;
    }

    public static InfoGetter lambdaFactory$(FingerprintManager fingerprintManager) {
        Object[] objArr = {fingerprintManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9224cd4146d58ae8944c46159d4e5772", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9224cd4146d58ae8944c46159d4e5772") : new FingerprintManager$$Lambda$51(fingerprintManager);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0244edbf06010eaa2647411e99ef3579", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0244edbf06010eaa2647411e99ef3579") : this.arg$1.lambda$setFingerprintInfo$43();
    }
}
