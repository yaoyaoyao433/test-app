package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$41 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final FingerprintManager$$Lambda$41 instance = new FingerprintManager$$Lambda$41();

    public static InfoGetter lambdaFactory$() {
        return instance;
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e38943686ab9db6dca326c90f59a36a", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e38943686ab9db6dca326c90f59a36a") : FingerprintManager.lambda$setFingerprintInfo$35();
    }
}
