package com.meituan.metrics.traffic.reflection;

import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class OkHttp2Wrapper {
    private static Class OkHttp2InterceptorClass;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int failedCount;

    public static void addInterceptorToClient(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd35cf6b7178720265dec432091550ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd35cf6b7178720265dec432091550ce");
            return;
        }
        try {
            if (!Metrics.getInstance().getAppConfig().isTrafficStatDisabled() && failedCount <= 3) {
                if (OkHttp2InterceptorClass == null) {
                    OkHttp2InterceptorClass = Class.forName("com.meituan.metrics.traffic.okhttp.OkHttp2Interceptor");
                }
                ((ReflectWrapper) OkHttp2InterceptorClass.newInstance()).onWrapper(obj);
            }
        } catch (Exception e) {
            int i = failedCount;
            failedCount = i + 1;
            if (i >= 3) {
                Logger.getMetricsLogger().et("OkHttp2Wrapper", "Could not add an OkHttp2 interceptor during OkHttpClient construction", e);
            }
        }
    }
}
