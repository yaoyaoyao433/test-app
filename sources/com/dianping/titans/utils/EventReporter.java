package com.dianping.titans.utils;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class EventReporter {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void reportException(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b04583ed6108c8f9c527f533b19d2f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b04583ed6108c8f9c527f533b19d2f7");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str2)) {
                str2 = "页面未知";
            }
            hashMap.put("page", str2);
            hashMap.put("type", str);
            hashMap.put(LogMonitor.EXCEPTION_TAG, Log.getStackTraceString(th));
            reportBabel(hashMap, "titans-exception");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void reportBabel(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea62f09543d086f31da54fffba88bf97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea62f09543d086f31da54fffba88bf97");
            return;
        }
        Log.Builder optional = new Log.Builder("").reportChannel("prism-report-knb").tag(str).optional(map);
        optional.value(1L);
        Babel.logRT(optional.build());
    }
}
