package com.sankuai.meituan.takeoutnew.util.aop;

import android.app.Activity;
import android.support.annotation.WorkerThread;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.app.config.WaimaiSP;
import com.sankuai.waimai.foundation.utils.ad;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static final Executor b = new m(com.sankuai.android.jarvis.c.a());
    private static final WeakHashMap<MetricsSpeedMeterTask, String> c = new WeakHashMap<>();
    private static Set<String> d;

    public static void a(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7db6b2c0339e5aabc30ddf58240140ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7db6b2c0339e5aabc30ddf58240140ca");
            return;
        }
        if (set == null) {
            set = Collections.emptySet();
        }
        d = set;
        WaimaiSP.a(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public static void c(MetricsSpeedMeterTask metricsSpeedMeterTask, Map<String, Object> map, String str) {
        Object[] objArr = {metricsSpeedMeterTask, map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38a4f562b7f0f8e167ea342dfba7aaad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38a4f562b7f0f8e167ea342dfba7aaad");
            return;
        }
        if (d == null) {
            d = WaimaiSP.a();
        }
        metricsSpeedMeterTask.report(map, str);
    }

    public static MetricsSpeedMeterTask a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8794c03e7bddbbe9bc598e1fcfdcb2d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8794c03e7bddbbe9bc598e1fcfdcb2d0");
        }
        long elapsedTimeMillis = TimeUtil.elapsedTimeMillis();
        Object[] objArr2 = {activity, new Long(elapsedTimeMillis)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "648d0e0e105394755367511cc7edf375", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "648d0e0e105394755367511cc7edf375");
        }
        MetricsSpeedMeterTask createPageSpeedMeterTask = MetricsSpeedMeterTask.createPageSpeedMeterTask(activity, elapsedTimeMillis);
        c.put(createPageSpeedMeterTask, activity.getClass().getName());
        return createPageSpeedMeterTask;
    }

    public static void a(MetricsSpeedMeterTask metricsSpeedMeterTask) {
        Object[] objArr = {metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f438fd5b2daf621fd76dea8b8567984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f438fd5b2daf621fd76dea8b8567984");
        } else {
            a(metricsSpeedMeterTask, null);
        }
    }

    public static void a(MetricsSpeedMeterTask metricsSpeedMeterTask, Map<String, Object> map) {
        Object[] objArr = {metricsSpeedMeterTask, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ecc6712d51a689da6782e4e1cec4e0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ecc6712d51a689da6782e4e1cec4e0a");
        } else {
            a(metricsSpeedMeterTask, map, null);
        }
    }

    public static void a(final MetricsSpeedMeterTask metricsSpeedMeterTask, final Map<String, Object> map, final String str) {
        Object[] objArr = {metricsSpeedMeterTask, map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c7f5d2d6ba113bf9a688d9c83ddfbc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c7f5d2d6ba113bf9a688d9c83ddfbc2");
        } else if (ad.b()) {
            b(metricsSpeedMeterTask);
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.aop.h.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e9b07bdb639c66b32e2248298d5d2b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e9b07bdb639c66b32e2248298d5d2b1");
                    } else {
                        h.c(MetricsSpeedMeterTask.this, map, str);
                    }
                }
            });
        } else {
            c(metricsSpeedMeterTask, map, str);
        }
    }

    private static void b(MetricsSpeedMeterTask metricsSpeedMeterTask) {
        String str;
        Object[] objArr = {metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b70592922dce7e0de746e1df3c581b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b70592922dce7e0de746e1df3c581b7");
        } else if (d == null || (str = c.get(metricsSpeedMeterTask)) == null || !d.contains(str)) {
        } else {
            new com.sankuai.waimai.business.page.home.utils.g(5, str).a();
        }
    }
}
