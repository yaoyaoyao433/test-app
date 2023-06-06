package com.sankuai.waimai.business.page.home.utils;

import android.view.Choreographer;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g implements Choreographer.FrameCallback {
    public static ChangeQuickRedirect a;
    private int b;
    private MetricsSpeedMeterTask c;
    private final int d;
    private final String e;
    private final Choreographer f;
    private long g;
    private long h;

    public g(int i, String str) {
        Object[] objArr = {5, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ed73cc016f174993873deddbea07ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ed73cc016f174993873deddbea07ec");
            return;
        }
        this.f = Choreographer.getInstance();
        this.d = 5;
        this.e = "FDM/" + str;
        this.b = 0;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5123d62f6f884315cdcada93d75dafe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5123d62f6f884315cdcada93d75dafe7");
        } else if (this.f != null) {
            this.f.postFrameCallback(this);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "058c4e6ed04ce26d011a8dfc82c3abb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "058c4e6ed04ce26d011a8dfc82c3abb9");
            return;
        }
        long elapsedTimeMillis = TimeUtil.elapsedTimeMillis();
        if (this.c == null) {
            this.c = MetricsSpeedMeterTask.createCustomSpeedMeterTask(this.e);
            this.g = elapsedTimeMillis;
        } else {
            MetricsSpeedMeterTask metricsSpeedMeterTask = this.c;
            metricsSpeedMeterTask.recordStepUseDefined("frame_" + this.b, (elapsedTimeMillis - this.h) + this.g);
            this.b = this.b + 1;
        }
        this.h = elapsedTimeMillis;
        if (this.b < this.d) {
            this.f.postFrameCallback(this);
            return;
        }
        MetricsSpeedMeterTask metricsSpeedMeterTask2 = this.c;
        com.sankuai.meituan.takeoutnew.util.aop.h.a(metricsSpeedMeterTask2.recordStep("sum_" + this.d));
    }
}
