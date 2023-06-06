package com.dianping.nvnetwork.monitor;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static long b = -1;

    public static void a(long j) {
        b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[Catch: Throwable -> 0x00a7, TryCatch #0 {Throwable -> 0x00a7, blocks: (B:13:0x0033, B:15:0x003b, B:17:0x0041, B:26:0x0057, B:28:0x007b, B:20:0x004c), top: B:34:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r15) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.nvnetwork.monitor.a.a
            java.lang.String r10 = "06eba2caeb240294996f0fc57363a351"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            return
        L1b:
            com.dianping.nvnetwork.h r1 = com.dianping.nvnetwork.h.h()
            boolean r1 = r1.aB
            if (r1 == 0) goto Lac
            boolean r1 = com.dianping.nvtunnelkit.utils.f.a(r15)
            if (r1 != 0) goto Lac
            long r3 = com.dianping.nvnetwork.monitor.a.b
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L33
            goto Lac
        L33:
            com.dianping.nvnetwork.h r1 = com.dianping.nvnetwork.h.h()     // Catch: java.lang.Throwable -> La7
            java.util.Set<java.lang.String> r1 = r1.p     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L53
            int r3 = r1.size()     // Catch: java.lang.Throwable -> La7
            if (r3 <= 0) goto L53
            java.lang.String r3 = "*"
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto L4c
            java.lang.String r15 = "*"
            goto L54
        L4c:
            boolean r1 = r1.contains(r15)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L53
            goto L54
        L53:
            r15 = r2
        L54:
            if (r15 != 0) goto L57
            return
        L57:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> La7
            long r3 = com.dianping.nvnetwork.monitor.a.b     // Catch: java.lang.Throwable -> La7
            r5 = 0
            long r1 = r1 - r3
            com.dianping.monitor.e r3 = com.dianping.nvnetwork.g.d()     // Catch: java.lang.Throwable -> La7
            r4 = 0
            java.lang.String r6 = "shark_back_ground_send"
            r7 = 0
            r8 = 1
            r9 = 200(0xc8, float:2.8E-43)
            r10 = 0
            r11 = 0
            int r12 = (int) r1     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            r3.pv4(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> La7
            com.dianping.monitor.impl.m r3 = com.dianping.nvnetwork.g.e()     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto La6
            java.lang.String r4 = "shark_period"
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r5
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> La7
            com.dianping.monitor.impl.l r1 = r3.a(r4, r1)     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "shark_url"
            com.dianping.monitor.impl.l r15 = r1.a(r2, r15)     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = "shark_back_ground_send"
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La7
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> La7
            java.util.List r0 = java.util.Collections.nCopies(r0, r3)     // Catch: java.lang.Throwable -> La7
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La7
            com.dianping.monitor.impl.l r15 = r15.a(r1, r2)     // Catch: java.lang.Throwable -> La7
            r15.a()     // Catch: java.lang.Throwable -> La7
        La6:
            return
        La7:
            r15 = move-exception
            r15.printStackTrace()
            return
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.monitor.a.a(java.lang.String):void");
    }
}
