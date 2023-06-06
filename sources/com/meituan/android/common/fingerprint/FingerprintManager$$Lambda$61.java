package com.meituan.android.common.fingerprint;

import android.net.wifi.ScanResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.invoke.LambdaForm;
import java.util.Comparator;
/* loaded from: classes2.dex */
public final /* synthetic */ class FingerprintManager$$Lambda$61 implements Comparator {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final FingerprintManager$$Lambda$61 instance = new FingerprintManager$$Lambda$61();

    @Override // java.util.Comparator
    @LambdaForm.Hidden
    public final int compare(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3b48ab79ed40b17f7899b5a0b072638", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3b48ab79ed40b17f7899b5a0b072638")).intValue() : FingerprintManager.lambda$scanResultToWifiMacInfo$53((ScanResult) obj, (ScanResult) obj2);
    }
}
