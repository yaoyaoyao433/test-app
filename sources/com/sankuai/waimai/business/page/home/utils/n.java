package com.sankuai.waimai.business.page.home.utils;

import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class n {
    public static ChangeQuickRedirect a = null;
    private static final String c = "n";
    private static final n d = new n();
    public MetricsSpeedMeterTask b;

    public static n a() {
        return d;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a40b09e3e6d746b48a74a3d1d513f4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a40b09e3e6d746b48a74a3d1d513f4f");
            return;
        }
        this.b = MetricsSpeedMeterTask.createCustomSpeedMeterTask("waimai_home_pull_to_refresh", TimeUtil.elapsedTimeMillis());
        this.b.recordStep("Refresh+");
    }
}
