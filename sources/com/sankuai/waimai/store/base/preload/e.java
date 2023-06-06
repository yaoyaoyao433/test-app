package com.sankuai.waimai.store.base.preload;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static volatile e b;
    private Map<String, MetricsSpeedMeterTask> c;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee94fc5af3682998ab54978857e0a618", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee94fc5af3682998ab54978857e0a618");
        } else {
            this.c = Collections.synchronizedMap(new HashMap());
        }
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21fe2d135e9fbc33ad9160100c5fe3f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21fe2d135e9fbc33ad9160100c5fe3f1");
        }
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    public final void a(String str, MetricsSpeedMeterTask metricsSpeedMeterTask) {
        Object[] objArr = {str, metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adaa58958226b07849ca98697479c3e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adaa58958226b07849ca98697479c3e3");
        } else if (TextUtils.isEmpty(str) || metricsSpeedMeterTask == null) {
        } else {
            this.c.put(str, metricsSpeedMeterTask);
        }
    }

    private MetricsSpeedMeterTask c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62fdac77713cdf970babd78ae5b203d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62fdac77713cdf970babd78ae5b203d");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.c.get(str);
    }

    public final MetricsSpeedMeterTask a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eaa143bd95ef2fb05608dc42d45a3ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eaa143bd95ef2fb05608dc42d45a3ee");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.c.remove(str);
    }

    public static void a(String str, String str2) {
        MetricsSpeedMeterTask c;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb4481ad695eed37e5ab321469c477ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb4481ad695eed37e5ab321469c477ff");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (c = a().c(str)) == null) {
        } else {
            c.recordStep(str2);
        }
    }

    public static void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        MetricsSpeedMeterTask metricsSpeedMeterTask = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fc22d7ccdf8f0addde885294b9da2bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fc22d7ccdf8f0addde885294b9da2bc");
            return;
        }
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "581eece5f0e98b5b027eb37a52d11270", RobustBitConfig.DEFAULT_VALUE)) {
            metricsSpeedMeterTask = (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "581eece5f0e98b5b027eb37a52d11270");
        } else if (intent != null) {
            metricsSpeedMeterTask = a().c(com.sankuai.waimai.store.router.d.a(intent, "key_pre_request_cache", "key_pre_request_cache", ""));
        }
        if (metricsSpeedMeterTask != null) {
            metricsSpeedMeterTask.recordStep("activity_create");
        }
    }

    public static void b(String str) {
        MetricsSpeedMeterTask a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "579c69527fc8633a3b88e43d655d29a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "579c69527fc8633a3b88e43d655d29a1");
        } else if (TextUtils.isEmpty(str) || (a2 = a().a(str)) == null) {
        } else {
            h.a(a2);
        }
    }
}
