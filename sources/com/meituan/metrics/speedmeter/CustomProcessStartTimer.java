package com.meituan.metrics.speedmeter;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CustomProcessStartTimer {
    public static long PROCESS_START_ELAPSED_TIME;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void initProcessStartTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20a2aa75526b9dfd39b4851e35a163f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20a2aa75526b9dfd39b4851e35a163f3");
        } else {
            PROCESS_START_ELAPSED_TIME = SystemClock.elapsedRealtime();
        }
    }

    public static void setProcessStartTime(long j) {
        PROCESS_START_ELAPSED_TIME = j;
    }
}
