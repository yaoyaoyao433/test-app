package com.meituan.android.common.locate.platform.logs;

import android.os.SystemClock;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.sniffer.util.GsonUtil;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class n extends e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long a;
    private long d;
    private int e;
    private String f;
    private int g;
    private boolean h;

    /* loaded from: classes2.dex */
    public static final class a {
        private static final n a = new n();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f90e0306842b0a4bafbefe50895a7204", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f90e0306842b0a4bafbefe50895a7204");
            return;
        }
        this.a = 0L;
        this.d = 0L;
        this.e = 0;
        this.g = 0;
    }

    public static n e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "292afa422757c12ce5eab4c736841e5b", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "292afa422757c12ce5eab4c736841e5b") : a.a;
    }

    public void a() {
        this.h = true;
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "714f12c535db4a0f7ce2e548731a1480", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "714f12c535db4a0f7ce2e548731a1480");
        } else if (!this.h && com.meituan.android.common.locate.controller.f.a().j() && this.d > 0 && com.meituan.android.common.locate.reporter.j.a(com.meituan.android.common.locate.provider.g.a()).g() && SystemClock.elapsedRealtime() - this.d > MetricsAnrManager.ANR_THRESHOLD) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.a;
            double d = (elapsedRealtime * 1.0d) / this.d;
            if (d == 0.0d) {
                return;
            }
            int i = (int) ((this.e * 10000) / d);
            try {
                ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                super.a(concurrentHashMap);
                concurrentHashMap.put("reboot_data", String.valueOf(i / 100.0d));
                concurrentHashMap.put("bizNames", this.f);
                concurrentHashMap.put(LoadConfig.GPS_MIN_TIME, String.valueOf(this.d));
                concurrentHashMap.put("duration", String.valueOf(elapsedRealtime));
                concurrentHashMap.put("reboot_num", String.valueOf(this.g));
                com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
                LogUtils.a("reboot_data:" + GsonUtil.getGson().toJson(concurrentHashMap));
            } catch (Exception e) {
                c.a("SystemRebootDataWrapper::exception" + e.getMessage(), 3);
            }
        }
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8be9b1fbdb668a0c7453d458c0b4676e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8be9b1fbdb668a0c7453d458c0b4676e");
        } else if (com.meituan.android.common.locate.controller.f.a().j()) {
            this.e++;
        }
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8b2d67fd02fcb8a1623ccf54a5713bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8b2d67fd02fcb8a1623ccf54a5713bd");
            return;
        }
        this.g++;
        this.h = false;
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "398da949d92851dfc99c00355af340bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "398da949d92851dfc99c00355af340bc");
        } else if (com.meituan.android.common.locate.controller.f.a().j()) {
            if (this.d > 0 && com.meituan.android.common.locate.strategy.b.a().b() != this.d) {
                c();
            } else if (com.meituan.android.common.locate.strategy.b.a().b() == this.d) {
                return;
            }
            this.g = 0;
            this.a = SystemClock.elapsedRealtime();
            this.d = com.meituan.android.common.locate.strategy.b.a().b();
            this.f = com.meituan.android.common.locate.controller.f.a().c();
            this.e = 0;
        }
    }
}
