package com.meituan.android.common.metricx.utils;

import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Logger {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean debug = false;
    private static volatile ILogger mBabelLogger;
    private static volatile ILogger mBatteryLogger;
    private static volatile ILogger mMetricsLogger;
    private static volatile ILogger mMetricxLogger;
    private static volatile ILogger mSnareLogger;

    public static void setDebug(boolean z) {
        debug = z;
    }

    public static ILogger getSnareLogger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "10c3d464c44669d2ff4f04e14e5c6dba", RobustBitConfig.DEFAULT_VALUE)) {
            return (ILogger) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "10c3d464c44669d2ff4f04e14e5c6dba");
        }
        if (mSnareLogger == null) {
            synchronized (Logger.class) {
                if (mSnareLogger == null) {
                    mSnareLogger = new LogcatLogger("snare");
                }
            }
        }
        if (debug) {
            mSnareLogger.setLogLevel(2);
        } else {
            mSnareLogger.setLogLevel(7);
        }
        return mSnareLogger;
    }

    public static ILogger getBabelLogger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "307a1c756e9058f8bc3ac99991a9b233", RobustBitConfig.DEFAULT_VALUE)) {
            return (ILogger) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "307a1c756e9058f8bc3ac99991a9b233");
        }
        if (mBabelLogger == null) {
            synchronized (Logger.class) {
                if (mBabelLogger == null) {
                    mBabelLogger = new LogcatLogger("FLY_DEBUG");
                }
            }
        }
        if (debug) {
            mBabelLogger.setLogLevel(2);
        } else {
            mBabelLogger.setLogLevel(7);
        }
        return mBabelLogger;
    }

    public static ILogger getMetricxLogger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a62dbb93d2b1b8f9f1446b0eb430dd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ILogger) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a62dbb93d2b1b8f9f1446b0eb430dd2");
        }
        if (mMetricxLogger == null) {
            synchronized (Logger.class) {
                if (mMetricxLogger == null) {
                    mMetricxLogger = new LogcatLogger("Metricx");
                }
            }
        }
        if (debug) {
            mMetricxLogger.setLogLevel(2);
        } else {
            mMetricxLogger.setLogLevel(7);
        }
        return mMetricxLogger;
    }

    public static ILogger getMetricsLogger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a6208a81e989eaf5c2972afde1dff7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ILogger) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a6208a81e989eaf5c2972afde1dff7d");
        }
        if (mMetricsLogger == null) {
            synchronized (Logger.class) {
                if (mMetricsLogger == null) {
                    mMetricsLogger = new LogcatLogger(Metrics.TAG);
                }
            }
        }
        if (debug) {
            mMetricsLogger.setLogLevel(2);
        } else {
            mMetricsLogger.setLogLevel(7);
        }
        return mMetricsLogger;
    }

    public static ILogger getBatteryMonitorLogger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db0d18d64f69f090e479fa6be7329aff", RobustBitConfig.DEFAULT_VALUE)) {
            return (ILogger) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db0d18d64f69f090e479fa6be7329aff");
        }
        if (mBatteryLogger == null) {
            synchronized (Logger.class) {
                if (mBatteryLogger == null) {
                    mBatteryLogger = new LogcatLogger("BatteryMonitor");
                }
            }
        }
        if (debug) {
            mBatteryLogger.setLogLevel(2);
        } else {
            mBatteryLogger.setLogLevel(7);
        }
        return mBatteryLogger;
    }
}
