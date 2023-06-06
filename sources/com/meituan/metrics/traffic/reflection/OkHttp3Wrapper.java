package com.meituan.metrics.traffic.reflection;

import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class OkHttp3Wrapper {
    private static Class OkHttp3InterceptorClass;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int failedCount;

    public static void addInterceptorToBuilder(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a2ceb1178146392a7e748c4175b08dd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a2ceb1178146392a7e748c4175b08dd4");
            return;
        }
        try {
            if (!Metrics.getInstance().getAppConfig().isTrafficStatDisabled() && failedCount <= 3) {
                if (OkHttp3InterceptorClass == null) {
                    OkHttp3InterceptorClass = Class.forName("com.meituan.metrics.traffic.okhttp3.OkHttp3Interceptor");
                }
                ((ReflectWrapper) OkHttp3InterceptorClass.newInstance()).onWrapper(obj);
            }
        } catch (Exception e) {
            int i = failedCount;
            failedCount = i + 1;
            if (i >= 3) {
                Logger.getMetricsLogger().et("OkHttp3Wrapper", "Could not add an OkHttp3 profiler interceptor during OkHttpClient$Builder construction", e);
            }
        }
    }
}
