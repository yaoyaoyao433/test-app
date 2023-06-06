package com.meituan.mmp.lib.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ak {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    public static Map<String, Long> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d212fd6947cf3ed9d35c98dcc916ed0d", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d212fd6947cf3ed9d35c98dcc916ed0d") : a("/proc/self/maps");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0178, code lost:
        r1 = (java.lang.Long) r5.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017e, code lost:
        if (r1 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0180, code lost:
        r1 = 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0192, code lost:
        r5.put(r13, java.lang.Long.valueOf(r1.longValue() + (java.lang.Long.parseLong(r7[1], 16) - java.lang.Long.parseLong(r7[0], 16))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a4, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01bb, code lost:
        r0.printStackTrace();
        r0 = java.lang.System.out;
        r0.println("skiped line " + r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Map<java.lang.String, java.lang.Long> a(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.utils.ak.a(java.lang.String):java.util.Map");
    }
}
