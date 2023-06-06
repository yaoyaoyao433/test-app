package com.meituan.android.common.fingerprint;

import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$50 implements InfoGetter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final FingerprintManager$$Lambda$50 instance = new FingerprintManager$$Lambda$50();

    public static InfoGetter lambdaFactory$() {
        return instance;
    }

    @Override // com.meituan.android.common.fingerprint.utils.InfoGetter
    @LambdaForm.Hidden
    public final Object get() {
        String storage;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bedad0ecd18eeb6cdbf188c5c38caaaf", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bedad0ecd18eeb6cdbf188c5c38caaaf");
        }
        storage = FingerprintManager.storage();
        return storage;
    }
}
