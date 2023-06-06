package com.meituan.msc.modules.reporter;

import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect a;
    private static final Map<String, Long> b = new ConcurrentHashMap();

    private static Object[] a(Long l, long j, String str, Object... objArr) {
        Object[] objArr2;
        Object[] objArr3 = {l, new Long(j), str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect, true, "30ed959c6acc640cdd841edbcfc31967", RobustBitConfig.DEFAULT_VALUE)) {
            return (Object[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect, true, "30ed959c6acc640cdd841edbcfc31967");
        }
        Object[] objArr4 = objArr == null ? new Object[0] : objArr;
        int length = objArr4.length;
        if (l != null) {
            objArr2 = new Object[length + 3];
        } else {
            objArr2 = new Object[length + 2];
        }
        System.arraycopy(objArr4, 0, objArr2, 1, length);
        objArr2[0] = str;
        objArr2[length + 1] = "nanoTs:" + j;
        if (l != null) {
            objArr2[length + 2] = "nanoTime:" + l;
        }
        return objArr2;
    }

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "91f57e598f95643fa1c3b0bcf29b851c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "91f57e598f95643fa1c3b0bcf29b851c");
        } else {
            g.d("msc_trace", a(null, PerfTrace.currentTime(), str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "61aa6ecbab3d1a227438345581498ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "61aa6ecbab3d1a227438345581498ad0");
            return;
        }
        long currentTime = PerfTrace.currentTime();
        b.put(str, Long.valueOf(currentTime));
        g.d("msc_trace", a(null, currentTime, str + " begin", objArr));
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "66d516a443e7f73779a9a3a9a3c0bd67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "66d516a443e7f73779a9a3a9a3c0bd67");
            return;
        }
        Long remove = b.remove(str);
        long currentTime = PerfTrace.currentTime();
        Long valueOf = remove != null ? Long.valueOf(currentTime - remove.longValue()) : null;
        g.d("msc_trace", a(valueOf, currentTime, str + " end", objArr));
    }
}
