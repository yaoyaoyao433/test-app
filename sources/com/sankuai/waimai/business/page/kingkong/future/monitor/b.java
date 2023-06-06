package com.sankuai.waimai.business.page.kingkong.future.monitor;

import android.os.SystemClock;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private MetricsSpeedMeterTask b;
    private boolean c;
    private boolean d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a {
        private static final b a = new b();
    }

    public b() {
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0490a081f4ac5c5183fb4ac81acf54b2", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0490a081f4ac5c5183fb4ac81acf54b2") : a.a;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a46ca6a67672db6e5d46fe88746afb70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a46ca6a67672db6e5d46fe88746afb70");
        } else {
            this.b = MetricsSpeedMeterTask.createCustomSpeedMeterTask("fkk_metrices", SystemClock.elapsedRealtime());
        }
    }

    public final void a(String str, boolean... zArr) {
        Object[] objArr = {str, zArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93c3dbf07c8fe221a00a34fe4d5195a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93c3dbf07c8fe221a00a34fe4d5195a7");
        } else if (this.b == null || this.c || this.d) {
        } else {
            this.b.recordStep(str);
            if (zArr.length <= 0 || !zArr[0]) {
                return;
            }
            h.a(this.b);
            this.d = true;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17199b5bf6fb5836ec1242915f259922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17199b5bf6fb5836ec1242915f259922");
            return;
        }
        if (this.b != null) {
            this.b.disable();
        }
        this.c = true;
    }
}
