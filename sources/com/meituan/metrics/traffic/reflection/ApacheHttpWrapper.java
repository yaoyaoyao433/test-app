package com.meituan.metrics.traffic.reflection;

import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ApacheHttpWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int failedCount;
    private static Class wrapperClass;

    public static void addRequestAndResponseInterceptor(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "840290008e7316177e8ed0258189a049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "840290008e7316177e8ed0258189a049");
            return;
        }
        try {
            if (!Metrics.getInstance().getAppConfig().isTrafficStatDisabled() && failedCount <= 3) {
                if (wrapperClass == null) {
                    wrapperClass = Class.forName("com.meituan.metrics.traffic.apache.ApacheNetworkInterceptor");
                }
                ((ReflectWrapper) wrapperClass.newInstance()).onWrapper(obj);
            }
        } catch (Exception e) {
            int i = failedCount;
            failedCount = i + 1;
            if (i >= 3) {
                Logger.getMetricsLogger().et("ApacheHttpWrapper", "Could not add an interceptor during DefaultHttpClient construction", e);
            }
        }
    }
}
