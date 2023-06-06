package com.meituan.android.aurora;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class Aurora$$Lambda$1 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Aurora arg$1;
    private final AuroraConfig arg$2;

    public Aurora$$Lambda$1(Aurora aurora, AuroraConfig auroraConfig) {
        this.arg$1 = aurora;
        this.arg$2 = auroraConfig;
    }

    public static Runnable lambdaFactory$(Aurora aurora, AuroraConfig auroraConfig) {
        Object[] objArr = {aurora, auroraConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b55ef5f95eba5f844de33a8446008c39", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b55ef5f95eba5f844de33a8446008c39") : new Aurora$$Lambda$1(aurora, auroraConfig);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18968d0154291c9b1b7a2b2c3245ffe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18968d0154291c9b1b7a2b2c3245ffe2");
        } else {
            Aurora.lambda$setHornConfig$1(this.arg$1, this.arg$2);
        }
    }
}
