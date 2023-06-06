package com.xiaomi.push;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.service.XMJobService;
/* loaded from: classes6.dex */
public final class em {
    private static a a;
    private static final String b = XMJobService.class.getCanonicalName();
    private static int c = 0;

    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void a(long j);

        void a(boolean z);

        boolean b();
    }

    public static synchronized void a() {
        synchronized (em.class) {
            if (a == null) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.a("[Alarm] stop alarm.");
            a.a();
        }
    }

    public static void a(long j) {
        if (a == null) {
            return;
        }
        a.a(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (com.xiaomi.push.em.b.equals(com.xiaomi.push.jr.a(r8, r5.name).getSuperclass().getCanonicalName()) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r8) {
        /*
            android.content.Context r8 = r8.getApplicationContext()
            java.lang.String r0 = "com.xiaomi.xmsf"
            java.lang.String r1 = r8.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            com.xiaomi.push.en r0 = new com.xiaomi.push.en
            r0.<init>(r8)
        L15:
            com.xiaomi.push.em.a = r0
            return
        L18:
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            r1 = 0
            r2 = 1
            java.lang.String r3 = r8.getPackageName()     // Catch: java.lang.Exception -> L82
            r4 = 4
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch: java.lang.Exception -> L82
            android.content.pm.ServiceInfo[] r3 = r0.services     // Catch: java.lang.Exception -> L82
            if (r3 == 0) goto L80
            android.content.pm.ServiceInfo[] r0 = r0.services     // Catch: java.lang.Exception -> L82
            int r3 = r0.length     // Catch: java.lang.Exception -> L82
            r4 = 0
        L2f:
            if (r1 >= r3) goto L7e
            r5 = r0[r1]     // Catch: java.lang.Exception -> L7b
            java.lang.String r6 = "android.permission.BIND_JOB_SERVICE"
            java.lang.String r7 = r5.permission     // Catch: java.lang.Exception -> L7b
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> L7b
            if (r6 == 0) goto L63
            java.lang.String r6 = com.xiaomi.push.em.b     // Catch: java.lang.Exception -> L7b
            java.lang.String r7 = r5.name     // Catch: java.lang.Exception -> L7b
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> L7b
            if (r6 == 0) goto L49
        L47:
            r4 = 1
            goto L61
        L49:
            java.lang.String r6 = r5.name     // Catch: java.lang.Exception -> L60
            java.lang.Class r6 = com.xiaomi.push.jr.a(r8, r6)     // Catch: java.lang.Exception -> L60
            java.lang.String r7 = com.xiaomi.push.em.b     // Catch: java.lang.Exception -> L60
            java.lang.Class r6 = r6.getSuperclass()     // Catch: java.lang.Exception -> L60
            java.lang.String r6 = r6.getCanonicalName()     // Catch: java.lang.Exception -> L60
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Exception -> L60
            if (r6 == 0) goto L61
            goto L47
        L60:
        L61:
            if (r4 == r2) goto L7e
        L63:
            java.lang.String r6 = com.xiaomi.push.em.b     // Catch: java.lang.Exception -> L7b
            java.lang.String r7 = r5.name     // Catch: java.lang.Exception -> L7b
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> L7b
            if (r6 == 0) goto L78
            java.lang.String r6 = "android.permission.BIND_JOB_SERVICE"
            java.lang.String r5 = r5.permission     // Catch: java.lang.Exception -> L7b
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Exception -> L7b
            if (r5 == 0) goto L78
            goto L99
        L78:
            int r1 = r1 + 1
            goto L2f
        L7b:
            r0 = move-exception
            r2 = r4
            goto L84
        L7e:
            r2 = r4
            goto L99
        L80:
            r2 = 0
            goto L99
        L82:
            r0 = move-exception
            r2 = 0
        L84:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "check service err : "
            r1.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.xiaomi.channel.commonutils.logger.c.a(r0)
        L99:
            if (r2 != 0) goto Lc2
            boolean r0 = com.xiaomi.push.jr.b(r8)
            if (r0 != 0) goto La2
            goto Lc2
        La2:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Should export service: "
            r0.<init>(r1)
            java.lang.String r1 = com.xiaomi.push.em.b
            r0.append(r1)
            java.lang.String r1 = " with permission android.permission.BIND_JOB_SERVICE"
            r0.append(r1)
            java.lang.String r1 = " in AndroidManifest.xml file"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        Lc2:
            int r0 = android.os.Build.VERSION.SDK_INT
            com.xiaomi.push.en r0 = new com.xiaomi.push.en
            r0.<init>(r8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.em.a(android.content.Context):void");
    }

    public static synchronized void a(Context context, int i) {
        synchronized (em.class) {
            int i2 = c;
            if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
                if (i == 2) {
                    c = 2;
                } else {
                    c = 0;
                }
            }
            if (i2 != c && c == 2) {
                a();
                a = new eo(context);
            }
        }
    }

    public static synchronized void a(boolean z) {
        synchronized (em.class) {
            if (a == null) {
                com.xiaomi.channel.commonutils.logger.c.a("timer is not initialized");
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.a("[Alarm] register alarm. (" + z + CommonConstant.Symbol.BRACKET_RIGHT);
            a.a(z);
        }
    }

    public static synchronized boolean b() {
        synchronized (em.class) {
            if (a == null) {
                return false;
            }
            return a.b();
        }
    }
}
