package com.sankuai.waimai.platform.utils.lifecycle;

import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public Set<String> b;
    public final Map<String, b> c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae5df7d490ca0ade636bbd3be81bd2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae5df7d490ca0ade636bbd3be81bd2e");
        } else {
            this.c = new HashMap(4);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        private static c a = new c();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80d6e2ac45426cda5eaa11b789b3150a", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80d6e2ac45426cda5eaa11b789b3150a") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public final long b;
        public final MetricsSpeedMeterTask c;

        public b(long j, String str) {
            Object[] objArr = {new Long(j), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b609a0ca0d87055724c678a16077c5a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b609a0ca0d87055724c678a16077c5a");
                return;
            }
            this.b = j;
            this.c = MetricsSpeedMeterTask.createCustomSpeedMeterTask("takeout/router" + str, j);
            this.c.recordStep("init");
        }
    }
}
