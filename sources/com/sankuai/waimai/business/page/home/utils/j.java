package com.sankuai.waimai.business.page.home.utils;

import android.os.Build;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.util.PageSP;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.router.method.Func1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d;
    private static com.sankuai.waimai.platform.capacity.log.a e;
    private static int f;
    private static long g;
    private static long h;
    private final Map<String, Long> i;
    private final HashMap<String, Integer> j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static j a = new j();
    }

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b3c98b15db481f9b6e810a8097484f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b3c98b15db481f9b6e810a8097484f4");
            return;
        }
        this.i = new ConcurrentHashMap(20);
        this.j = new HashMap<>();
        this.j.put("request_permissions", 901);
        this.j.put("process_started_not_for_welcome", 902);
        this.j.put("redirect_to_other_page", 903);
        this.j.put("locate_failed", 904);
        this.j.put("homepage_stopped", 905);
        this.j.put("main_page_start_delayed", 906);
        this.j.put("rcmd_net_error", 907);
        this.j.put("rcmd_data_error", 908);
        this.j.put("redirect_splash_landing_page", 909);
        this.j.put("hot_boot_started", 910);
        this.j.put("not_goto_homepage", 911);
        this.j.put("takeout_already_init", 912);
        this.j.put("restored_from_history", 913);
        this.j.put("mt_not_from_homepage", 914);
        this.j.put("request_user_licence", 915);
        this.j.put("takeout_not_start_from_homepage", 916);
    }

    public static /* synthetic */ void a(ArrayMap arrayMap) {
        Object[] objArr = {arrayMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "112ea486875d9a7cd93bc869518e87fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "112ea486875d9a7cd93bc869518e87fc");
            return;
        }
        MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("takeout/launch/" + Build.MODEL, TimeUtil.processStartElapsedTimeMillis());
        for (Map.Entry<String, Long> entry : a.a.i.entrySet()) {
            createCustomSpeedMeterTask.recordStepUseDefined(entry.getKey(), entry.getValue().longValue());
        }
        com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask, arrayMap);
    }

    public static /* synthetic */ void a(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8205b6507e491a10220e7c4dea5c8ebf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8205b6507e491a10220e7c4dea5c8ebf");
            return;
        }
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "pm.dexopt.install");
            if (invoke instanceof String) {
                map.put("dexopt.install", invoke);
            }
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a(th);
        }
    }

    private static long e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0252a79d9c4858c6e8da4d861b78e124", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0252a79d9c4858c6e8da4d861b78e124")).longValue() : TimeUtil.processStartElapsedTimeMillis();
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a76b3d8b2bdc78ca358fc7deb857312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a76b3d8b2bdc78ca358fc7deb857312");
            return;
        }
        if (h == 0) {
            h = TimeUtil.elapsedTimeMillis();
        }
        if (b) {
            return;
        }
        if ("ad-->start".equals(str)) {
            d = true;
        }
        if (c) {
            return;
        }
        a.a.i.put(str, Long.valueOf(TimeUtil.elapsedTimeMillis()));
        Metrics.getInstance().recordLaunchStep(str);
    }

    public static void cancel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13a8ddfde84b3f9830472931ba205a85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13a8ddfde84b3f9830472931ba205a85");
            return;
        }
        if (!b && !c) {
            Metrics.getInstance().disableLaunchSpeedMeter();
            g = TimeUtil.elapsedTimeMillis() - e();
            a.AbstractC1040a b2 = new com.sankuai.waimai.business.page.common.log.a().a("wm_launch_cancel").b(str);
            e = b2.c(g + "ms").d(com.sankuai.waimai.foundation.utils.k.a().toJson(a.a.i)).b();
            Integer num = a.a.j.get(str);
            f = num == null ? 900 : num.intValue();
        }
        b = true;
    }

    public static void a() {
        boolean z;
        int i;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "239b7112c1ebe48183e691dac8e2e3ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "239b7112c1ebe48183e691dac8e2e3ed");
        } else if (b) {
            final com.sankuai.waimai.platform.capacity.log.a aVar = e;
            if (aVar != null) {
                e = null;
                com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.waimai.platform.utils.o.a(), new Runnable() { // from class: com.sankuai.waimai.business.page.home.utils.j.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c20786a25efba69eb1db3800fa306ee0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c20786a25efba69eb1db3800fa306ee0");
                            return;
                        }
                        try {
                            com.sankuai.waimai.platform.capacity.log.i.d(com.sankuai.waimai.platform.capacity.log.a.this);
                            com.sankuai.waimai.platform.capacity.log.c.a().a(j.f, (int) j.g, "launch_process");
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                });
            }
        } else if (c) {
        } else {
            c = true;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4f1490878dbbd4ab6dd198f1e157d8b3", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4f1490878dbbd4ab6dd198f1e157d8b3")).booleanValue();
            } else {
                Func1 func1 = (Func1) com.sankuai.waimai.router.a.a(Func1.class, "wm_startup_from_welcome");
                z = func1 != null && ((Boolean) func1.call(null)).booleanValue();
            }
            if (!z) {
                cancel("restored_from_history");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "de59a29503d50bac88f7a99db0334490", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "de59a29503d50bac88f7a99db0334490");
            } else {
                try {
                    Log.e("PerfLab", "LaunchMetricsManager.wmReport");
                    long elapsedTimeMillis = TimeUtil.elapsedTimeMillis() - TimeUtil.processStartElapsedTimeMillis();
                    final Metrics metrics = Metrics.getInstance();
                    boolean z2 = elapsedTimeMillis > 30000;
                    final ArrayMap arrayMap = new ArrayMap(8);
                    Map<String, Long> map = a.a.i;
                    if (PageSP.b()) {
                        boolean c2 = PageSP.c();
                        PageSP.d();
                        i = c2 ? 1 : 0;
                        i2 = 1;
                    } else {
                        i = 0;
                    }
                    arrayMap.put(MetricsSpeedMeterTask.STARTUP_IF_FIRST, Integer.valueOf(i2));
                    arrayMap.put("is_upgrade", Integer.valueOf(i));
                    if (z2) {
                        a.AbstractC1040a a2 = new com.sankuai.waimai.business.page.common.log.a().a("wm_launch_timeout");
                        com.sankuai.waimai.platform.capacity.log.i.d(a2.b((elapsedTimeMillis / 10000) + "*10s").c(String.valueOf(elapsedTimeMillis)).d(com.sankuai.waimai.foundation.utils.k.a().toJson(map)).b());
                    } else {
                        metrics.recordLaunchStep("BindData-");
                    }
                    ad.a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.utils.j.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bcf1ebe9980b5f8e5efabfafa6e86d8c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bcf1ebe9980b5f8e5efabfafa6e86d8c");
                                return;
                            }
                            if (j.d) {
                                ArrayMap.this.put(MetricsSpeedMeterTask.STARTUP_ADVERT, 1);
                            } else {
                                ArrayMap.this.put(MetricsSpeedMeterTask.STARTUP_ADVERT, 0);
                            }
                            com.sankuai.waimai.platform.utils.l.a(new l.a() { // from class: com.sankuai.waimai.business.page.home.utils.j.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.platform.utils.l.a
                                public final void a() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c48a57c238bd3cc8e3834bb32ee0ae82", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c48a57c238bd3cc8e3834bb32ee0ae82");
                                        return;
                                    }
                                    Log.e("PerfLab", "LaunchMetricsManager.onBackground");
                                    ArrayMap.this.put("startup_count", Integer.valueOf(com.sankuai.waimai.platform.utils.sharedpreference.a.l()));
                                    ArrayMap.this.put("order_count", Integer.valueOf(com.sankuai.waimai.platform.utils.sharedpreference.a.m()));
                                    ArrayMap.this.put("pay_count", Integer.valueOf(com.sankuai.waimai.platform.utils.sharedpreference.a.o()));
                                    ArrayMap.this.put("dexopt", Boolean.valueOf(PageSP.h()));
                                    j.a((Map) ArrayMap.this);
                                    metrics.reportLaunchSteps(ArrayMap.this);
                                    if (PageSP.i()) {
                                        j.a(ArrayMap.this);
                                    }
                                }
                            }, (String) null);
                        }
                    }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                } catch (NullPointerException e2) {
                    cancel("report_exp_" + e2.getClass().getSimpleName());
                    com.sankuai.waimai.foundation.utils.log.a.b(e2);
                }
            }
            com.sankuai.waimai.platform.capacity.log.c.a().a(200, (int) (TimeUtil.elapsedTimeMillis() - e()), "launch_process");
        }
    }
}
