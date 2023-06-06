package com.sankuai.waimai.business.page.home.utils;

import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private MetricsSpeedMeterTask b;
    private boolean c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        private static final h a = new h();
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a879a99838843770eaf5f88eb0cbae05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a879a99838843770eaf5f88eb0cbae05");
        } else if (this.b == null) {
            this.b = MetricsSpeedMeterTask.createCustomSpeedMeterTask("homepage_metrices_key", TimeUtil.processStartElapsedTimeMillis());
        }
    }

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86089f9c23f65fa87816620ac1c4145f", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86089f9c23f65fa87816620ac1c4145f") : a.a;
    }

    public final void a(String str, boolean... zArr) {
        Object[] objArr = {str, zArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5bea916a56c5376cb11b894f7a0d4e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5bea916a56c5376cb11b894f7a0d4e8");
        } else if (this.b == null || this.c || this.d) {
        } else {
            this.b.recordStep(str);
            if (zArr.length <= 0 || !zArr[0]) {
                return;
            }
            com.sankuai.meituan.takeoutnew.util.aop.h.a(this.b);
            this.d = true;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3b382275a0c9518a87bfe04efe49e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3b382275a0c9518a87bfe04efe49e54");
            return;
        }
        if (this.b != null) {
            this.b.disable();
        }
        this.c = true;
    }
}
