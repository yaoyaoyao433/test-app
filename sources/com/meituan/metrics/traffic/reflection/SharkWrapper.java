package com.meituan.metrics.traffic.reflection;

import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SharkWrapper {
    private static Class SharkRxInterceptorClass;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int failedCount;

    public static void addInterceptorToBuilder(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "33ca93e54e8c4ae2b6f33d479266900d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "33ca93e54e8c4ae2b6f33d479266900d");
            return;
        }
        try {
            if (!Metrics.getInstance().getAppConfig().isTrafficStatDisabled() && failedCount <= 3) {
                if (SharkRxInterceptorClass == null) {
                    obj.getClass();
                    SharkRxInterceptorClass = Class.forName("com.meituan.metrics.traffic.shark.SharkRxInterceptor");
                }
                ((ReflectWrapper) SharkRxInterceptorClass.newInstance()).onWrapper(obj);
            }
        } catch (Exception e) {
            int i = failedCount;
            failedCount = i + 1;
            if (i >= 3) {
                Logger.getMetricsLogger().et("SharkWrapper", "Could not add an interceptor during NVDefaultNetworkService$Builder construction", e);
            }
        }
    }
}
