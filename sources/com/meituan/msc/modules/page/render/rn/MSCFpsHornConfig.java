package com.meituan.msc.modules.page.render.rn;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCFpsHornConfig extends com.meituan.msc.common.config.a<Config> {
    public static ChangeQuickRedirect c;
    private static MSCFpsHornConfig d;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class LagConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int maxReportCount = 6;
        public long threshold = MetricsAnrManager.ANR_THRESHOLD;
        public long sampleDelay = 128;
        public int maxLinePerStackEntry = 10;
        public int maxStackEntryCount = 10;
        public boolean enablePrinter = true;
    }

    private MSCFpsHornConfig(String str, Class<? extends Config> cls) {
        super(str, cls);
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0c9becf3be90ee1b8ab9f55011877d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0c9becf3be90ee1b8ab9f55011877d");
        }
    }

    public static MSCFpsHornConfig d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "674bb8d97e6b5ad487e1460ed200ba2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCFpsHornConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "674bb8d97e6b5ad487e1460ed200ba2c");
        }
        if (d == null) {
            synchronized (MSCFpsHornConfig.class) {
                if (d == null) {
                    d = new MSCFpsHornConfig("msc_fps_android_group", Config.class);
                }
            }
        }
        return d;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("enableFPSMonitor")
        public boolean enableFPSMonitor;
        @SerializedName("enableScrollVelocityReport")
        public boolean enableScrollVelocityReport;
        @SerializedName("lagConfig")
        public LagConfig lagConfig;

        public Config() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "222c848827a2841049a59d6d4a097e7a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "222c848827a2841049a59d6d4a097e7a");
                return;
            }
            this.enableFPSMonitor = false;
            this.lagConfig = new LagConfig();
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c031ab5f576722467235df6af42842fd", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c031ab5f576722467235df6af42842fd");
            }
            return "Config{enableFPSMonitor=" + this.enableFPSMonitor + ", enableScrollVelocityReport=" + this.enableScrollVelocityReport + '}';
        }
    }

    public final boolean e() {
        return ((Config) this.b).enableFPSMonitor;
    }

    public final long f() {
        return ((Config) this.b).lagConfig.threshold;
    }

    public final long g() {
        return ((Config) this.b).lagConfig.threshold * 1000000;
    }

    public final double h() {
        return ((Config) this.b).lagConfig.maxReportCount;
    }

    public final long i() {
        return ((Config) this.b).lagConfig.sampleDelay;
    }

    public final boolean j() {
        return ((Config) this.b).enableScrollVelocityReport;
    }

    public final boolean k() {
        return ((Config) this.b).lagConfig.enablePrinter;
    }

    public final int l() {
        return ((Config) this.b).lagConfig.maxStackEntryCount;
    }

    public final int m() {
        return ((Config) this.b).lagConfig.maxLinePerStackEntry;
    }
}
