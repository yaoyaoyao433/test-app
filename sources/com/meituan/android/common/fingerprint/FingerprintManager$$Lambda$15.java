package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$15 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String arg$1;

    public FingerprintManager$$Lambda$15(String str) {
        this.arg$1 = str;
    }

    public static InfoGetter lambdaFactory$(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2d87320bbb66cd05e171fad620634a7", 6917529027641081856L) ? (InfoGetter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2d87320bbb66cd05e171fad620634a7") : new FingerprintManager$$Lambda$15(str);
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3ce2c71f53b50aa0f3d953a4b69ca45", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3ce2c71f53b50aa0f3d953a4b69ca45") : FingerprintManager.lambda$setFingerprintInfo$10(this.arg$1);
    }
}
