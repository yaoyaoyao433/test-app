package com.meituan.android.aurora;

import com.meituan.android.aurora.AuroraMainLooper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class AuroraMainLooper$AuroraMainLooperRecorder$$Lambda$1 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String arg$1;

    public AuroraMainLooper$AuroraMainLooperRecorder$$Lambda$1(String str) {
        this.arg$1 = str;
    }

    public static Runnable lambdaFactory$(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0d254222476293839719b9bb4bd990f6", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0d254222476293839719b9bb4bd990f6") : new AuroraMainLooper$AuroraMainLooperRecorder$$Lambda$1(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12cd088dc402ee1c4e1316b44168a8f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12cd088dc402ee1c4e1316b44168a8f0");
        } else {
            AuroraMainLooper.AuroraMainLooperRecorder.lambda$println$0(this.arg$1);
        }
    }
}
