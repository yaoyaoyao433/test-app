package com.meituan.android.mtplayer.audio;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072 A[Catch: all -> 0x007a, Exception -> 0x007c, TryCatch #4 {Exception -> 0x007c, blocks: (B:11:0x006c, B:13:0x0072, B:15:0x0076), top: B:23:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076 A[Catch: all -> 0x007a, Exception -> 0x007c, TRY_LEAVE, TryCatch #4 {Exception -> 0x007c, blocks: (B:11:0x006c, B:13:0x0072, B:15:0x0076), top: B:23:0x006c }] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r11, android.content.Intent r12) {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.mtplayer.audio.c.a
            java.lang.String r10 = "f74d1a05548448f6e8cfd2175788bde4"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r11 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L1f:
            if (r11 != 0) goto L22
            return
        L22:
            r11.startService(r12)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "<Brand:"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L6c
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "><Manufacturer:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L6c
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "><Device:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L6c
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "><Model:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L6c
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "><AndroidVersion:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6c
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = ">"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "startservice_foreground"
            java.lang.String r2 = "start_service_error"
            com.meituan.android.mtplayer.video.sniffer.c.a(r1, r2, r0)     // Catch: java.lang.Throwable -> L6c
        L6c:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            r1 = 26
            if (r0 < r1) goto L76
            r11.startForegroundService(r12)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            return
        L76:
            r11.startService(r12)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            return
        L7a:
            r11 = move-exception
            throw r11
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mtplayer.audio.c.a(android.content.Context, android.content.Intent):void");
    }
}
