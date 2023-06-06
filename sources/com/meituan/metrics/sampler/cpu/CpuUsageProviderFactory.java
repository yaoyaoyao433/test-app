package com.meituan.metrics.sampler.cpu;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CpuUsageProviderFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static ICpuUsageProvider create() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a5686e50042852e3c5e5fc76be677558", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICpuUsageProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a5686e50042852e3c5e5fc76be677558");
        }
        if (Build.VERSION.SDK_INT < 26) {
            return new CpuUsageProviderV25();
        }
        return new CpuUsageProviderV26Plus();
    }
}
