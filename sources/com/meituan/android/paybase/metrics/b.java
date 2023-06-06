package com.meituan.android.paybase.metrics;

import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    MetricsSpeedMeterTask b;
    final Set<String> c;
    boolean d;

    public b(MetricsSpeedMeterTask metricsSpeedMeterTask) {
        Object[] objArr = {metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f37763326dcf019c0df239bc9c507b7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f37763326dcf019c0df239bc9c507b7d");
            return;
        }
        this.c = new HashSet();
        this.d = false;
        this.b = metricsSpeedMeterTask;
    }

    public final b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a249783605f72f16189f52f125139ed6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a249783605f72f16189f52f125139ed6");
        }
        if (!this.d && this.b != null && this.c.add(str)) {
            this.b.recordStep(str);
        }
        return this;
    }
}
