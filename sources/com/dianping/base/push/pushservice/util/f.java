package com.dianping.base.push.pushservice.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(final Context context, final Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "395d6ed60462e27db09567894ee8a5b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "395d6ed60462e27db09567894ee8a5b4");
        } else if (context == null) {
        } else {
            if (a() && com.dianping.base.push.pushservice.f.b(context)) {
                new Handler().post(new Runnable() { // from class: com.dianping.base.push.pushservice.util.f.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75c8dad9fe455b04033cddc48e58d414", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75c8dad9fe455b04033cddc48e58d414");
                        } else {
                            f.b(context, intent);
                        }
                    }
                });
            } else {
                b(context, intent);
            }
        }
    }

    public static void a(Service service, Intent intent) {
        boolean z = true;
        Object[] objArr = {service, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48fb1dbc65e8068dc49fb7b61b8d6aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48fb1dbc65e8068dc49fb7b61b8d6aba");
            return;
        }
        if (intent != null) {
            try {
                z = true ^ com.sankuai.waimai.platform.utils.f.a(intent, "notRequireForeground", false);
            } catch (Throwable th) {
                com.dianping.base.push.pushservice.c.d("ServiceForegroundHelper", "startForeground error:" + th);
                return;
            }
        }
        if (Build.VERSION.SDK_INT < 26 || com.dianping.base.push.pushservice.f.d < 26) {
            return;
        }
        if (!com.dianping.base.push.pushservice.f.i || z) {
            a(service);
        }
    }

    public static void a(Service service) {
        boolean z = true;
        Object[] objArr = {service};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c51ba8dbf60467da48ce7a881e39d86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c51ba8dbf60467da48ce7a881e39d86");
            return;
        }
        if ((Build.VERSION.SDK_INT >= 27 && com.dianping.base.push.pushservice.f.d >= 27) || e.b() || e.a("SONY")) {
            a(service, "pushbg", "pushbg");
            z = false;
        }
        Notification a2 = com.dianping.base.push.pushservice.i.a(service, "pushbg", z);
        com.dianping.base.push.pushservice.h hVar = com.dianping.base.push.pushservice.f.e;
        service.startForeground(-37201, a2);
        com.dianping.base.push.pushservice.c.b("ServiceForegroundHelper", "service(" + service.getClass().getCanonicalName() + ") realStartForeground");
    }

    private static void a(Context context, String str, String str2) {
        NotificationManager notificationManager;
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a3b1ad809ef916066f91fb425e4e973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a3b1ad809ef916066f91fb425e4e973");
        } else if (Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)) == null || notificationManager.getNotificationChannel(str) != null) {
        } else {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 0);
            notificationChannel.setSound(null, null);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
            com.dianping.base.push.pushservice.c.b("ServiceForegroundHelper", "createNotificationChannel,channelId = " + str);
        }
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f40b5682d972004837ae88e8a0baa304", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f40b5682d972004837ae88e8a0baa304")).booleanValue() : e.c() && Build.VERSION.SDK_INT >= 29 && Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void b(android.content.Context r13, android.content.Intent r14) {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.base.push.pushservice.util.f.a
            java.lang.String r11 = "96fd8d46b668368732553a6883ada4c8"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r13 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r0, r13, r10, r9, r11)
            return
        L1f:
            r0 = 26
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L46
            if (r1 < r0) goto L37
            boolean r1 = com.dianping.base.push.pushservice.f.i     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L37
            int r1 = com.dianping.base.push.pushservice.f.d     // Catch: java.lang.Throwable -> L46
            if (r1 < r0) goto L37
            java.lang.String r1 = "notRequireForeground"
            r14.putExtra(r1, r8)     // Catch: java.lang.Throwable -> L34
            r1 = 1
            goto L3d
        L34:
            r1 = move-exception
            r2 = 1
            goto L48
        L37:
            java.lang.String r1 = "notRequireForeground"
            r14.putExtra(r1, r9)     // Catch: java.lang.Throwable -> L46
            r1 = 0
        L3d:
            r13.startService(r14)     // Catch: java.lang.Throwable -> L41
            return
        L41:
            r2 = move-exception
            r12 = r2
            r2 = r1
            r1 = r12
            goto L48
        L46:
            r1 = move-exception
            r2 = 0
        L48:
            java.lang.String r3 = "ServiceForegroundHelper"
            java.lang.String r1 = r1.toString()
            com.dianping.base.push.pushservice.c.d(r3, r1)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            if (r1 < r0) goto L69
            boolean r1 = com.dianping.base.push.pushservice.f.i     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            if (r1 != 0) goto L69
            int r1 = com.dianping.base.push.pushservice.f.d     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            if (r1 < r0) goto L69
            java.lang.String r0 = "notRequireForeground"
            r14.putExtra(r0, r8)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L75
            r13.startForegroundService(r14)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L75
            return
        L66:
            r13 = move-exception
            r2 = 1
            goto L78
        L69:
            java.lang.String r0 = "notRequireForeground"
            r14.putExtra(r0, r9)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L75
            r13.startService(r14)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L75
            return
        L72:
            r13 = move-exception
            r2 = 0
            goto L78
        L75:
            r13 = move-exception
            goto L9f
        L77:
            r13 = move-exception
        L78:
            java.lang.String r14 = "ServiceForegroundHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "start "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L86
            java.lang.String r1 = "foreground"
            goto L88
        L86:
            java.lang.String r1 = ""
        L88:
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = " service failure, exception: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L75
            r0.append(r13)     // Catch: java.lang.Throwable -> L75
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L75
            com.dianping.base.push.pushservice.c.d(r14, r13)     // Catch: java.lang.Throwable -> L75
            return
        L9f:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.base.push.pushservice.util.f.b(android.content.Context, android.content.Intent):void");
    }
}
