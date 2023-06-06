package com.meituan.msc.modules.page.render;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCHornPerfConfig extends com.meituan.msc.common.config.a<Config> {
    public static ChangeQuickRedirect c;
    private static volatile MSCHornPerfConfig d;

    public static MSCHornPerfConfig d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07c047e0f4511068fb0000412c590336", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCHornPerfConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07c047e0f4511068fb0000412c590336");
        }
        if (d == null) {
            synchronized (MSCHornPerfConfig.class) {
                if (d == null) {
                    d = new MSCHornPerfConfig();
                }
            }
        }
        return d;
    }

    public MSCHornPerfConfig() {
        super("msc_perf_android_group", Config.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "290299d3cd994a5d5234c67c164f1a6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "290299d3cd994a5d5234c67c164f1a6d");
        }
    }

    public final boolean e() {
        return ((Config) this.b).disableAbnormalFPDetailReport;
    }

    public final int f() {
        return ((Config) this.b).abnormalFPThreshold;
    }

    public final boolean g() {
        return ((Config) this.b).useMSCExecutors;
    }

    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4c2ce8adf64bd1789ba1ffc3990c5f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4c2ce8adf64bd1789ba1ffc3990c5f")).booleanValue() : str != null && ((Config) this.b).instrumentPrefetchAppIds.contains(str);
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean disableAbnormalFPDetailReport = false;
        public int abnormalFPThreshold = 5000;
        public boolean useMSCExecutors = false;
        public ArrayList<String> instrumentPrefetchAppIds = new ArrayList<>();

        public Config() {
            this.instrumentPrefetchAppIds.add("7122f6e193de47c1");
        }
    }
}
