package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$38 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FingerprintManager arg$1;

    public FingerprintManager$$Lambda$38(FingerprintManager fingerprintManager) {
        this.arg$1 = fingerprintManager;
    }

    public static InfoGetter lambdaFactory$(FingerprintManager fingerprintManager) {
        Object[] objArr = {fingerprintManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d5ef3bb122ae64def1e81b5ca4f66d4", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d5ef3bb122ae64def1e81b5ca4f66d4") : new FingerprintManager$$Lambda$38(fingerprintManager);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72f62e9117c36d47a9a9b7934df5e841", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72f62e9117c36d47a9a9b7934df5e841") : this.arg$1.lambda$setFingerprintInfo$32();
    }
}
