package com.meituan.android.common.locate.fusionlocation;

import com.meituan.android.common.locate.platform.logs.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class c extends e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes2.dex */
    static final class a {
        private static final c a = new c();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public c() {
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb44852d4da50cfe532eb40ebebb5a3f", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb44852d4da50cfe532eb40ebebb5a3f") : a.a;
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ebef0e339a8216625524d3f0bf50c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ebef0e339a8216625524d3f0bf50c57");
            return;
        }
        try {
            ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
            super.a(concurrentHashMap);
            concurrentHashMap.put("fusion_data", str);
            com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("LogFusionReporter::exception" + e.getMessage(), 3);
        }
    }
}
