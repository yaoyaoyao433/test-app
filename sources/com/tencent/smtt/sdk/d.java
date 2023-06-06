package com.tencent.smtt.sdk;

import android.content.Context;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.utils.TbsLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public class d {
    private static String a = "EmergencyManager";
    private static int b = 0;
    private static int c = 1;
    private static int d = 2;
    private static int e = 3;
    private static int f = 4;
    private static int g = 5;
    private static d h;
    private long i = LocationStrategy.LOCATION_TIMEOUT;
    private long j = 86400000;
    private boolean k = false;

    private d() {
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (h == null) {
                h = new d();
            }
            dVar = h;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Context context, int i, List<com.tencent.smtt.sdk.a.b> list) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.tencent.smtt.sdk.a.g a2 = com.tencent.smtt.sdk.a.g.a();
        List<String> a3 = a2.a(context, "emergence_ids");
        HashSet hashSet = new HashSet();
        if (a3 != null && !a3.isEmpty()) {
            for (String str3 : a3) {
                String[] a4 = com.tencent.smtt.sdk.a.g.a(str3);
                if (a4 != null && a4.length == 4) {
                    hashSet.add(Integer.valueOf(Integer.parseInt(a4[0])));
                }
            }
        }
        for (com.tencent.smtt.sdk.a.b bVar : list) {
            int b2 = bVar.b();
            int a5 = bVar.a();
            if (hashSet.contains(Integer.valueOf(a5))) {
                str = a;
                str2 = "Command has been executed: " + bVar.toString() + ", ignored";
            } else if (bVar.e()) {
                str = a;
                str2 = "Command is out of date: " + bVar.toString() + ", now: " + com.tencent.smtt.sdk.a.a.a(System.currentTimeMillis());
            } else {
                linkedHashMap.put(Integer.valueOf(b2), bVar.c());
                a2.a(context, "emergence_ids", com.tencent.smtt.sdk.a.g.a(new String[]{String.valueOf(a5), String.valueOf(bVar.b()), String.valueOf(bVar.c()), String.valueOf(bVar.d())}));
            }
            TbsLog.d(str, str2);
        }
        a(context, Integer.valueOf(i), linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[Catch: all -> 0x00e7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0025, B:13:0x003e, B:15:0x0046, B:16:0x004a, B:20:0x005d, B:21:0x008b, B:23:0x0091, B:25:0x009d, B:27:0x00a3, B:29:0x00a7, B:31:0x00bc, B:35:0x00c9, B:34:0x00c5, B:17:0x004e, B:7:0x0029, B:12:0x0039), top: B:41:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[Catch: all -> 0x00e7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0025, B:13:0x003e, B:15:0x0046, B:16:0x004a, B:20:0x005d, B:21:0x008b, B:23:0x0091, B:25:0x009d, B:27:0x00a3, B:29:0x00a7, B:31:0x00bc, B:35:0x00c9, B:34:0x00c5, B:17:0x004e, B:7:0x0029, B:12:0x0039), top: B:41:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void b(final android.content.Context r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.tencent.smtt.sdk.a.c r0 = new com.tencent.smtt.sdk.a.c     // Catch: java.lang.Throwable -> Le7
            r0.<init>()     // Catch: java.lang.Throwable -> Le7
            java.lang.String r1 = com.tencent.smtt.utils.b.a(r11)     // Catch: java.lang.Throwable -> Le7
            r0.a(r1)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r1 = com.tencent.smtt.utils.b.d(r11)     // Catch: java.lang.Throwable -> Le7
            r0.b(r1)     // Catch: java.lang.Throwable -> Le7
            com.tencent.smtt.sdk.TbsPrivacyAccess r1 = com.tencent.smtt.sdk.TbsPrivacyAccess.AndroidVersion     // Catch: java.lang.Throwable -> Le7
            boolean r1 = r1.isEnabled()     // Catch: java.lang.Throwable -> Le7
            r2 = 0
            if (r1 == 0) goto L29
            int r1 = com.tencent.smtt.utils.b.b(r11)     // Catch: java.lang.Throwable -> Le7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Le7
        L25:
            r0.a(r1)     // Catch: java.lang.Throwable -> Le7
            goto L3e
        L29:
            com.tencent.smtt.sdk.TbsPrivacyAccess$ConfigurablePrivacy r1 = com.tencent.smtt.sdk.TbsPrivacyAccess.ConfigurablePrivacy.ANDROID_VERSION     // Catch: java.lang.Throwable -> Le7
            java.lang.String r3 = "0"
            java.lang.String r1 = com.tencent.smtt.sdk.TbsPrivacyAccess.getConfigurePrivacy(r11, r1, r3)     // Catch: java.lang.Throwable -> Le7
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r1 = 0
        L37:
            if (r1 == 0) goto L3e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Le7
            goto L25
        L3e:
            com.tencent.smtt.sdk.TbsPrivacyAccess r1 = com.tencent.smtt.sdk.TbsPrivacyAccess.DeviceModel     // Catch: java.lang.Throwable -> Le7
            boolean r1 = r1.isEnabled()     // Catch: java.lang.Throwable -> Le7
            if (r1 == 0) goto L4e
            java.lang.String r1 = com.tencent.smtt.utils.b.c(r11)     // Catch: java.lang.Throwable -> Le7
        L4a:
            r0.c(r1)     // Catch: java.lang.Throwable -> Le7
            goto L5d
        L4e:
            com.tencent.smtt.sdk.TbsPrivacyAccess$ConfigurablePrivacy r1 = com.tencent.smtt.sdk.TbsPrivacyAccess.ConfigurablePrivacy.DEVICE_MODEL     // Catch: java.lang.Throwable -> Le7
            java.lang.String r3 = ""
            java.lang.String r1 = com.tencent.smtt.sdk.TbsPrivacyAccess.getConfigurePrivacy(r11, r1, r3)     // Catch: java.lang.Throwable -> Le7
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Le7
            if (r3 != 0) goto L5d
            goto L4a
        L5d:
            java.lang.String r1 = "x5webview"
            r0.d(r1)     // Catch: java.lang.Throwable -> Le7
            int r1 = com.tencent.smtt.sdk.QbSdk.getTbsSdkVersion()     // Catch: java.lang.Throwable -> Le7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Le7
            r0.b(r1)     // Catch: java.lang.Throwable -> Le7
            int r1 = com.tencent.smtt.sdk.QbSdk.getTbsVersion(r11)     // Catch: java.lang.Throwable -> Le7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Le7
            r0.c(r1)     // Catch: java.lang.Throwable -> Le7
            com.tencent.smtt.sdk.a.g r1 = com.tencent.smtt.sdk.a.g.a()     // Catch: java.lang.Throwable -> Le7
            java.lang.String r3 = "emergence_ids"
            java.util.List r1 = r1.a(r11, r3)     // Catch: java.lang.Throwable -> Le7
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Le7
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le7
            r3.<init>()     // Catch: java.lang.Throwable -> Le7
        L8b:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> Le7
            if (r4 == 0) goto Lc9
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            if (r5 != 0) goto L8b
            java.lang.String[] r4 = com.tencent.smtt.sdk.a.g.a(r4)     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            if (r4 == 0) goto L8b
            int r5 = r4.length     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            r6 = 4
            if (r5 != r6) goto L8b
            r5 = r4[r2]     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            r6 = 3
            r4 = r4[r6]     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            long r6 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 >= 0) goto L8b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            r3.add(r4)     // Catch: java.lang.Exception -> Lc4 java.lang.Throwable -> Le7
            goto L8b
        Lc4:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> Le7
            goto L8b
        Lc9:
            r0.a(r3)     // Catch: java.lang.Throwable -> Le7
            com.tencent.smtt.sdk.a.e r1 = new com.tencent.smtt.sdk.a.e     // Catch: java.lang.Throwable -> Le7
            com.tencent.smtt.utils.n r2 = com.tencent.smtt.utils.n.a(r11)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r2 = r2.j()     // Catch: java.lang.Throwable -> Le7
            java.lang.String r0 = r0.a()     // Catch: java.lang.Throwable -> Le7
            r1.<init>(r11, r2, r0)     // Catch: java.lang.Throwable -> Le7
            com.tencent.smtt.sdk.d$1 r0 = new com.tencent.smtt.sdk.d$1     // Catch: java.lang.Throwable -> Le7
            r0.<init>()     // Catch: java.lang.Throwable -> Le7
            r1.a(r0)     // Catch: java.lang.Throwable -> Le7
            monitor-exit(r10)
            return
        Le7:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.d.b(android.content.Context):void");
    }

    public synchronized void a(Context context) {
        com.tencent.smtt.sdk.a.g a2;
        if (!this.k) {
            this.k = true;
            com.tencent.smtt.sdk.a.g a3 = com.tencent.smtt.sdk.a.g.a();
            if (a3.b()) {
                a(context, f, new ArrayList());
            } else {
                a3.a(context);
                try {
                    long b2 = com.tencent.smtt.sdk.a.g.a().b(context, "emergence_timestamp");
                    long b3 = com.tencent.smtt.sdk.a.g.a().b(context, "emergence_req_interval");
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - b2;
                    long min = Math.min(Math.max(this.i, b3), this.j);
                    if (j > min) {
                        String str = a;
                        TbsLog.d(str, "Emergency configuration is out of date, attempt to query again, " + (j / 1000) + " seconds has past");
                        com.tencent.smtt.sdk.a.g.a().a(context, "emergence_timestamp", currentTimeMillis);
                        b(context);
                    } else {
                        a(context, c, new ArrayList());
                        String str2 = a;
                        TbsLog.d(str2, "Emergency configuration is up to date, " + (j / 1000) + " seconds has past, need " + (Math.abs(j - min) / 1000) + " more seconds for an another request");
                    }
                    a2 = com.tencent.smtt.sdk.a.g.a();
                } catch (Exception e2) {
                    a(context, g, new ArrayList());
                    String str3 = a;
                    TbsLog.d(str3, "Unexpected exception happened when query emergency configuration: " + e2.getMessage());
                    a2 = com.tencent.smtt.sdk.a.g.a();
                }
                a2.c();
            }
        }
    }

    public synchronized void a(Context context, Integer num, Map<Integer, String> map) {
        c.a().b(context);
        TbsLog.e(a, "Dispatch emergency commands on tbs extension");
        QbSdk.a(context, num, map);
        g a2 = g.a(true);
        if (a2 == null) {
            return;
        }
        v a3 = a2.a();
        if (a3 == null) {
            return;
        }
        DexLoader b2 = a3.b();
        if (b2 == null) {
            TbsLog.e(a, "Dex loader is null, cancel commands dispatching of tbs shell");
            return;
        }
        TbsLog.e(a, "Dispatch emergency commands on tbs shell");
        b2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "dispatchEmergencyCommand", new Class[]{Integer.class, Map.class}, num, map);
    }
}
