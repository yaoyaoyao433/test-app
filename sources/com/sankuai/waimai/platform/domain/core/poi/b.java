package com.sankuai.waimai.platform.domain.core.poi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Map<Long, String> b = new ConcurrentHashMap();
    private static Map<String, Long> c = new ConcurrentHashMap();

    public static void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd04cd3efd01c76ff60f6ab1b8451d3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd04cd3efd01c76ff60f6ab1b8451d3f");
        } else if (j < 0 || aa.a(str)) {
        } else {
            b.put(Long.valueOf(j), str);
            c.put(str, Long.valueOf(j));
        }
    }

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cefc516228f4acfc8a34d20ba912ea5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cefc516228f4acfc8a34d20ba912ea5");
        }
        String str = b.get(Long.valueOf(j));
        return !aa.a(str) ? str : "";
    }

    public static long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fbaecd163aacf5a4fa3a7c6049f0c2b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fbaecd163aacf5a4fa3a7c6049f0c2b")).longValue();
        }
        Long l = c.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
