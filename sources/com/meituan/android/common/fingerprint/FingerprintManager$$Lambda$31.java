package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$31 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final FingerprintManager$$Lambda$31 instance = new FingerprintManager$$Lambda$31();

    public static InfoGetter lambdaFactory$() {
        return instance;
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8574557dcf3fbe23912685abd73f47e", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8574557dcf3fbe23912685abd73f47e") : FingerprintManager.lambda$setFingerprintInfo$25();
    }
}
