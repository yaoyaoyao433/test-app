package com.sankuai.waimai.business.page.home.utils;

import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m {
    public static ChangeQuickRedirect a;
    private static final m f = new m();
    public MetricsSpeedMeterTask b;
    public boolean c;
    private long d;
    private boolean e;

    public static m a() {
        return f;
    }

    public final void a(String str) {
        long processStartElapsedTimeMillis;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0060ed651ddf21ba94fe1c85e4cc16ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0060ed651ddf21ba94fe1c85e4cc16ba");
        } else if (this.c) {
        } else {
            if (this.b == null) {
                if (this.e) {
                    processStartElapsedTimeMillis = TimeUtil.elapsedTimeMillis();
                } else {
                    processStartElapsedTimeMillis = TimeUtil.processStartElapsedTimeMillis();
                }
                String str2 = this.e ? "waimai_app_hot_start" : "waimai_app_cold_start";
                this.d = processStartElapsedTimeMillis;
                StringBuilder sb = new StringBuilder("create task isHotStart: ");
                sb.append(this.e);
                sb.append(" ,taskKey: ");
                sb.append(str2);
                sb.append(" ,startTime: ");
                sb.append(processStartElapsedTimeMillis);
                this.e = true;
                this.b = MetricsSpeedMeterTask.createCustomSpeedMeterTask(str2, processStartElapsedTimeMillis);
            }
            this.b.recordStep(str);
            if ("BindData-".equals(str)) {
                com.sankuai.meituan.takeoutnew.util.aop.h.a(this.b);
                this.c = true;
                this.e = true;
            }
        }
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9aba7b5a734fe1f8b75d20af693ee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9aba7b5a734fe1f8b75d20af693ee2");
            return;
        }
        if (this.b != null) {
            this.b.disable();
        }
        this.e = true;
    }
}
