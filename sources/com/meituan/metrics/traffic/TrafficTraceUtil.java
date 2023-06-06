package com.meituan.metrics.traffic;

import com.meituan.android.cipstorage.q;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TrafficTraceUtil {
    public static final String CIPS_TRACE_CONFIG_PREFIX = "metrics_trace_config_";
    private static final String TAG = "TrafficTraceUtil";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void activateTrace(ConcurrentHashMap<String, TrafficTrace> concurrentHashMap, boolean z) {
        Object[] objArr = {concurrentHashMap, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d60d99c5919bfa5edfcbe108b53a392f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d60d99c5919bfa5edfcbe108b53a392f");
            return;
        }
        for (TrafficTrace trafficTrace : concurrentHashMap.values()) {
            trafficTrace.setEnable(z);
            trafficTrace.initTraceFromStorage();
        }
        Logger.getMetricsLogger().d(TAG, "active trace");
    }

    public static void saveTrace(ConcurrentHashMap<String, TrafficTrace> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "41c87327492244fb10a5ab0c90da0bc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "41c87327492244fb10a5ab0c90da0bc1");
            return;
        }
        for (TrafficTrace trafficTrace : concurrentHashMap.values()) {
            try {
                trafficTrace.saveTraceToStorage();
            } catch (Throwable th) {
                Logger.getMetricsLogger().e(TAG, th);
            }
        }
    }

    public static void markTraceType(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9238da822f2c3df889fd993f545f8976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9238da822f2c3df889fd993f545f8976");
            return;
        }
        q.a(Metrics.getInstance().getContext(), CIPS_TRACE_CONFIG_PREFIX + str2, 2).a(str, true);
    }

    public static boolean checkTraceType(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7eddf479f5d415dea05504e7facca375", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7eddf479f5d415dea05504e7facca375")).booleanValue();
        }
        return q.a(Metrics.getInstance().getContext(), CIPS_TRACE_CONFIG_PREFIX + str2, 2).b(str, false);
    }

    public static void clearTrafficTrace(ConcurrentHashMap<String, TrafficTrace> concurrentHashMap, String str, boolean z) {
        Object[] objArr = {concurrentHashMap, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "787b85d941878c917ce329e766f6893f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "787b85d941878c917ce329e766f6893f");
            return;
        }
        Iterator<TrafficTrace> it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            TrafficTrace next = it.next();
            next.setEnable(false);
            if (z) {
                next.clearTraceStorage(str);
            }
            it.remove();
        }
    }
}
