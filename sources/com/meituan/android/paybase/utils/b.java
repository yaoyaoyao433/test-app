package com.meituan.android.paybase.utils;

import android.content.Context;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static long b = 0;
    private static boolean c = true;
    private static volatile Boolean d = null;
    private static String e = "unknown";

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4439c2c87b8333ab124d301c4d819b56", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4439c2c87b8333ab124d301c4d819b56")).booleanValue() : !ah.a(context) || c;
    }

    public static void a(boolean z) {
        c = z;
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96d7a15bde70ea4333907d14a67af33e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96d7a15bde70ea4333907d14a67af33e");
        }
        if (com.meituan.android.paybase.config.a.d().a() == null) {
            return "unknown";
        }
        Context a2 = com.meituan.android.paybase.config.a.d().a();
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8c2c2315201379443d9c9627d4effbc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8c2c2315201379443d9c9627d4effbc7");
        }
        Object[] objArr3 = {a2, Long.valueOf((long) PayTask.j)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "17774c391414d5d944f005d72adfc6ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "17774c391414d5d944f005d72adfc6ca");
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > PayTask.j) {
            e = b(a2);
            b = currentTimeMillis;
        }
        return e;
    }

    private static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18badf3c5e31f8b1d6bc3c2c869954bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18badf3c5e31f8b1d6bc3c2c869954bf");
        }
        if (context == null) {
            return "unknown";
        }
        try {
            return AppUtil.getNetWorkType(context);
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
        if (r2 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b() {
        /*
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.paybase.utils.b.a
            java.lang.String r10 = "8c233696414608a7a297f9b11a16d024"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            r3 = 1
            if (r1 == 0) goto L20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r3, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L20:
            com.meituan.android.paybase.config.b r1 = com.meituan.android.paybase.config.a.d()
            android.content.Context r1 = r1.a()
            if (r1 != 0) goto L2b
            return r0
        L2b:
            java.lang.Boolean r1 = com.meituan.android.paybase.utils.b.d
            if (r1 != 0) goto Lb7
            java.lang.Class<com.meituan.android.paybase.utils.b> r1 = com.meituan.android.paybase.utils.b.class
            monitor-enter(r1)
            java.lang.Boolean r4 = com.meituan.android.paybase.utils.b.d     // Catch: java.lang.Throwable -> Lb4
            if (r4 != 0) goto Lb2
            com.meituan.android.paybase.config.b r4 = com.meituan.android.paybase.config.a.d()     // Catch: java.lang.Throwable -> Lb4
            android.content.Context r4 = r4.a()     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lb4
            r12[r0] = r4     // Catch: java.lang.Throwable -> Lb4
            com.meituan.robust.ChangeQuickRedirect r13 = com.meituan.android.paybase.utils.b.a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r14 = "2a43580f65c1ea740fbdddbe3110eef4"
            r6 = 0
            r8 = 1
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = r12
            r7 = r13
            r9 = r14
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb4
            if (r5 == 0) goto L5e
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r2, r13, r3, r14)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb4
            goto Lac
        L5e:
            if (r4 == 0) goto Lac
            boolean r4 = com.meituan.android.paybase.utils.ah.a(r4)     // Catch: java.lang.Throwable -> Lb4
            if (r4 != 0) goto Lab
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb4
            com.meituan.robust.ChangeQuickRedirect r12 = com.meituan.android.paybase.utils.b.a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r13 = "48f01ed430a1305acba75777f2e6e770"
            r6 = 0
            r8 = 1
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = r4
            r7 = r12
            r9 = r13
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb4
            if (r5 == 0) goto L84
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r4, r2, r12, r3, r13)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lb4
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lb4
            goto La9
        L84:
            java.lang.String r2 = "meituaninternaltest"
            com.meituan.android.paybase.config.b r4 = com.meituan.android.paybase.config.a.d()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = r4.c()     // Catch: java.lang.Throwable -> Lb4
            boolean r2 = android.text.TextUtils.equals(r2, r4)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto La8
            java.lang.String r2 = "group"
            com.meituan.android.paybase.config.b r4 = com.meituan.android.paybase.config.a.d()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = r4.k()     // Catch: java.lang.Throwable -> Lb4
            boolean r2 = android.text.TextUtils.equals(r2, r4)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto La8
            r2 = 1
            goto La9
        La8:
            r2 = 0
        La9:
            if (r2 == 0) goto Lac
        Lab:
            r0 = 1
        Lac:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lb4
            com.meituan.android.paybase.utils.b.d = r0     // Catch: java.lang.Throwable -> Lb4
        Lb2:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb4
            goto Lb7
        Lb4:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb4
            throw r0
        Lb7:
            java.lang.Boolean r0 = com.meituan.android.paybase.utils.b.d
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.paybase.utils.b.b():boolean");
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f7ca10e41df1b52a01b6a115095d944", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f7ca10e41df1b52a01b6a115095d944");
        }
        try {
            String a2 = s.a(UUID.randomUUID().toString());
            return a2.substring(a2.length() / 2);
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10beac67a852f7a4ab5f0eb6fffd1c55", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10beac67a852f7a4ab5f0eb6fffd1c55");
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(currentTimeMillis);
        return com.meituan.android.paybase.config.a.d().j() + simpleDateFormat.format(date);
    }
}
