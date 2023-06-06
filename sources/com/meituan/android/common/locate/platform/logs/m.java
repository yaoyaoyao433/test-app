package com.meituan.android.common.locate.platform.logs;

import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class m extends e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes2.dex */
    static final class a {
        private static final m a = new m();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public m() {
    }

    public static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95116ad9d6bfe5368c96e8e7c5b3a0ab", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95116ad9d6bfe5368c96e8e7c5b3a0ab") : a.a;
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68e06671e58446184ce2cf122ee1c466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68e06671e58446184ce2cf122ee1c466");
            return;
        }
        try {
            ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
            super.a(concurrentHashMap);
            concurrentHashMap.put("air_pressure_sensor", str);
            com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
            LogUtils.a("SensorDataReport" + concurrentHashMap.toString());
        } catch (Exception e) {
            c.a("SensorDataReport::exception" + e.getMessage(), 3);
        }
    }
}
