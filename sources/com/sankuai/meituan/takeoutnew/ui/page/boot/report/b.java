package com.sankuai.meituan.takeoutnew.ui.page.boot.report;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.util.Log;
import com.dianping.monitor.impl.l;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.model.WelcomeAd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Executor g = com.sankuai.android.jarvis.c.b();
    public final MetricsSpeedMeterTask b;
    public final MetricsSpeedMeterTask c;
    public boolean d;
    public boolean e;
    private final long f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a007f8fed687a8e435e77c24e619df22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a007f8fed687a8e435e77c24e619df22");
            return;
        }
        this.e = false;
        this.b = MetricsSpeedMeterTask.createCustomSpeedMeterTask("waimai_splash_realtime_task_noshow");
        this.c = MetricsSpeedMeterTask.createCustomSpeedMeterTask("waimai_splash_ad_realtime_task_show");
        this.f = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        private static final b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fda22e8893552eb00775bce46b8ade5", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fda22e8893552eb00775bce46b8ade5") : a.a;
    }

    public final void a(int i, int i2, @NonNull String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "958bf0db6edf31ba8d1a403c8a6801ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "958bf0db6edf31ba8d1a403c8a6801ef");
        } else if (com.sankuai.meituan.takeoutnew.ui.page.boot.a.b) {
        } else {
            com.sankuai.waimai.platform.capacity.log.c.a().a(i, i2, str);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27738eed780865e81fd1713cdfc4e9bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27738eed780865e81fd1713cdfc4e9bf");
        } else if (this.e) {
        } else {
            this.b.recordStep(str);
            this.c.recordStep(str);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" , time :");
            sb.append(SystemClock.elapsedRealtime() - this.f);
        }
    }

    public final void a(String str, Exception exc, WelcomeAd welcomeAd) {
        Object[] objArr = {str, exc, welcomeAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "858ed03c40942bcba65cb81877f47943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "858ed03c40942bcba65cb81877f47943");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(GearsLocator.DETAIL, exc != null ? exc.getMessage() : "");
        hashMap.put("url", welcomeAd != null ? welcomeAd.matUrl : "");
        hashMap.put("adtype", welcomeAd != null ? String.valueOf(welcomeAd.adType) : "");
        Sniffer.smell("waimai_splash_ad", str, "", "", "", hashMap);
    }

    public final void a(final String str, Map<String, String> map) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97496c6c36542be8845c4340264d6c0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97496c6c36542be8845c4340264d6c0c");
        } else if (g == null) {
            Log.e("SAReporter", "executor is null!");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(g, new Runnable() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "150b294939273ab9002b7f26555a6c36", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "150b294939273ab9002b7f26555a6c36");
                        return;
                    }
                    l a2 = com.sankuai.waimai.report.c.a().a("hot_boot", String.valueOf(b.this.e)).a(str, Collections.singletonList(Float.valueOf(1.0f)));
                    if (r3 != null && !r3.isEmpty()) {
                        for (Map.Entry entry : r3.entrySet()) {
                            a2.a((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    a2.a();
                }
            });
        }
    }
}
