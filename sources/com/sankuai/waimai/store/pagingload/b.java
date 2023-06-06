package com.sankuai.waimai.store.pagingload;

import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static MetricsSpeedMeterTask a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cde8caa048760ccfc1acfca1a358f8f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cde8caa048760ccfc1acfca1a358f8f2");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return MetricsSpeedMeterTask.createCustomSpeedMeterTask("agile_load_" + str);
    }

    public static void a(MetricsSpeedMeterTask metricsSpeedMeterTask, int i) {
        Object[] objArr = {metricsSpeedMeterTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbd9df667f6b05d8103830a59e4537e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbd9df667f6b05d8103830a59e4537e7");
        } else if (metricsSpeedMeterTask == null) {
        } else {
            if (i == 1) {
                metricsSpeedMeterTask.recordStep("step_batch_first_start");
            }
            if (i == 2) {
                metricsSpeedMeterTask.recordStep("step_batch_second_start");
            }
        }
    }

    public static void b(MetricsSpeedMeterTask metricsSpeedMeterTask, int i) {
        Object[] objArr = {metricsSpeedMeterTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a87e971abfb6819d2ce8367b17b8dde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a87e971abfb6819d2ce8367b17b8dde");
        } else if (metricsSpeedMeterTask == null) {
        } else {
            if (i == 1) {
                metricsSpeedMeterTask.recordStep("step_batch_first_end");
            }
            if (i == 2) {
                metricsSpeedMeterTask.recordStep("step_batch_second_end");
            }
        }
    }

    public static void a(MetricsSpeedMeterTask metricsSpeedMeterTask) {
        Object[] objArr = {metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00c7a9a111080e845a10195e593dfd5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00c7a9a111080e845a10195e593dfd5e");
        } else if (metricsSpeedMeterTask == null) {
        } else {
            h.a(metricsSpeedMeterTask);
        }
    }
}
