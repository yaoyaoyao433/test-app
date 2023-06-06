package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.hf;
import com.xiaomi.push.hg;
import com.xiaomi.push.jj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes6.dex */
public final class w {
    private static Context c;
    private static Object d;
    private static boolean e;
    private static WeakHashMap<Integer, w> f = new WeakHashMap<>();
    String a;
    String b;

    private w(String str) {
        this.a = str;
    }

    public static Context a() {
        return c;
    }

    public static w a(Context context, String str) {
        b(context);
        int hashCode = str.hashCode();
        w wVar = f.get(Integer.valueOf(hashCode));
        if (wVar == null) {
            w wVar2 = new w(str);
            f.put(Integer.valueOf(hashCode), wVar2);
            return wVar2;
        }
        return wVar;
    }

    private static <T> T a(Object obj) {
        if (obj != null) {
            try {
                return (T) obj.getClass().getMethod("getList", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    private static Object a(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String a = a("mipush|%s|%s", str2, "");
        return str.startsWith(a) ? a("mipush_%s_%s", str2, str.replace(a, "")) : str;
    }

    private static String a(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) ? "" : String.format(str, str2, str3);
    }

    public static boolean a(Context context) {
        b(context);
        return e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str, String str2) {
        return e() ? str : str2;
    }

    private static void b(Context context) {
        if (c == null) {
            c = context.getApplicationContext();
            NotificationManager d2 = d();
            Boolean bool = (Boolean) com.xiaomi.push.am.a((Object) d2, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            d("fwk is support.init:" + bool);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            e = booleanValue;
            if (booleanValue) {
                d = com.xiaomi.push.am.a((Object) d2, "getService", new Object[0]);
            }
        }
    }

    private static int c(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return c.getPackageManager().getPackageUid(str, 0);
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }

    private static NotificationManager d() {
        return (NotificationManager) c.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    private static void d(String str) {
        com.xiaomi.channel.commonutils.logger.c.a("NMHelper:" + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        return a(e() ? "mipush|%s|%s" : "mipush_%s_%s", this.a, str);
    }

    public final void a(int i, Notification notification) {
        String str = this.a;
        NotificationManager d2 = d();
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (!e()) {
                d2.notify(i, notification);
                return;
            }
            if (i2 >= 19) {
                notification.extras.putString("xmsf_target_package", str);
            }
            if (i2 >= 29) {
                d2.notifyAsPackage(str, null, i, notification);
            } else {
                d2.notify(i, notification);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(26)
    public final void a(NotificationChannel notificationChannel) {
        String str = this.a;
        try {
            if (!e()) {
                d().createNotificationChannel(notificationChannel);
                return;
            }
            int c2 = c(str);
            if (c2 != -1) {
                com.xiaomi.push.am.b(d, "createNotificationChannelsForPackage", str, Integer.valueOf(c2), a(Arrays.asList(notificationChannel)));
            }
        } catch (Exception e2) {
            d("createNotificationChannel error" + e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(NotificationChannel notificationChannel, boolean z) {
        String str = this.a;
        try {
            if (!z) {
                a(notificationChannel);
                return;
            }
            int c2 = c(str);
            if (c2 != -1) {
                com.xiaomi.push.am.b(d, "updateNotificationChannelForPackage", str, Integer.valueOf(c2), notificationChannel);
            }
        } catch (Exception e2) {
            d("updateNotificationChannel error " + e2);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:17:0x0043). Please submit an issue!!! */
    @TargetApi(26)
    public final NotificationChannel b(String str) {
        try {
        } catch (Exception e2) {
            d("getNotificationChannel error" + e2);
        }
        if (e()) {
            List<NotificationChannel> b = b();
            if (b != null) {
                for (NotificationChannel notificationChannel : b) {
                    if (str.equals(notificationChannel.getId())) {
                        return notificationChannel;
                    }
                }
            }
            return null;
        }
        return d().getNotificationChannel(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:25:0x0075
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @android.annotation.TargetApi(26)
    final java.util.List<android.app.NotificationChannel> b() {
        /*
            r8 = this;
            java.lang.String r0 = r8.a
            r1 = 0
            boolean r2 = e()     // Catch: java.lang.Exception -> L78
            if (r2 == 0) goto L35
            int r2 = c(r0)     // Catch: java.lang.Exception -> L78
            r3 = -1
            if (r2 == r3) goto L33
            java.lang.Object r3 = com.xiaomi.push.service.w.d     // Catch: java.lang.Exception -> L78
            java.lang.String r4 = "getNotificationChannelsForPackage"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L78
            r6 = 0
            r5[r6] = r0     // Catch: java.lang.Exception -> L78
            r6 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L78
            r5[r6] = r2     // Catch: java.lang.Exception -> L78
            r2 = 2
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L78
            r5[r2] = r6     // Catch: java.lang.Exception -> L78
            java.lang.Object r2 = com.xiaomi.push.am.a(r3, r4, r5)     // Catch: java.lang.Exception -> L78
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Exception -> L78
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = "mipush|%s|%s"
            goto L3f
        L33:
            r2 = r1
            goto L42
        L35:
            android.app.NotificationManager r2 = d()     // Catch: java.lang.Exception -> L78
            java.util.List r2 = r2.getNotificationChannels()     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = "mipush_%s_%s"
        L3f:
            r7 = r2
            r2 = r1
            r1 = r7
        L42:
            boolean r3 = com.xiaomi.push.jj.a()     // Catch: java.lang.Exception -> L78
            if (r3 == 0) goto L8a
            if (r1 == 0) goto L8a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L78
            r3.<init>()     // Catch: java.lang.Exception -> L78
            java.lang.String r4 = ""
            java.lang.String r0 = a(r2, r0, r4)     // Catch: java.lang.Exception -> L78
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> L78
        L59:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L78
            if (r4 == 0) goto L73
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L78
            android.app.NotificationChannel r4 = (android.app.NotificationChannel) r4     // Catch: java.lang.Exception -> L78
            java.lang.String r5 = r4.getId()     // Catch: java.lang.Exception -> L78
            boolean r5 = r5.startsWith(r0)     // Catch: java.lang.Exception -> L78
            if (r5 == 0) goto L59
            r3.add(r4)     // Catch: java.lang.Exception -> L78
            goto L59
        L73:
            r1 = r3
            goto L8a
        L75:
            r0 = move-exception
            r1 = r2
            goto L79
        L78:
            r0 = move-exception
        L79:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getNotificationChannels error "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            d(r0)
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.w.b():java.util.List");
    }

    public final List<StatusBarNotification> c() {
        String str = this.a;
        NotificationManager d2 = d();
        ArrayList arrayList = null;
        try {
            if (e()) {
                int a = hf.a();
                if (a != -1) {
                    return (List) a(com.xiaomi.push.am.a(d, "getAppActiveNotifications", str, Integer.valueOf(a)));
                }
            } else {
                StatusBarNotification[] activeNotifications = Build.VERSION.SDK_INT >= 23 ? d2.getActiveNotifications() : f();
                boolean a2 = jj.a();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (StatusBarNotification statusBarNotification : activeNotifications) {
                            if (!a2 || str.equals(x.d(statusBarNotification.getNotification()))) {
                                arrayList2.add(statusBarNotification);
                            }
                        }
                        return arrayList2;
                    } catch (Throwable th) {
                        th = th;
                        arrayList = arrayList2;
                        d("getActiveNotifications error " + th);
                        return arrayList;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return arrayList;
    }

    public final String toString() {
        return "NotificationManagerHelper{" + this.a + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    private static boolean e() {
        if (jj.a() && z.a(c).a(hg.NotificationBelongToAppSwitch.by, true)) {
            return e;
        }
        return false;
    }

    public final void a(int i) {
        String str = this.a;
        try {
            if (!e()) {
                d().cancel(i);
                return;
            }
            int a = hf.a();
            String packageName = c.getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                com.xiaomi.push.am.b(d, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i), Integer.valueOf(a));
            } else {
                com.xiaomi.push.am.b(d, "cancelNotificationWithTag", str, null, Integer.valueOf(i), Integer.valueOf(a));
            }
            d("cancel succ:" + i);
        } catch (Exception e2) {
            d("cancel error" + e2);
        }
    }

    private StatusBarNotification[] f() {
        if (jj.a(c)) {
            try {
                Object a = com.xiaomi.push.am.a(d, "getActiveNotifications", c.getPackageName());
                if (a instanceof StatusBarNotification[]) {
                    return (StatusBarNotification[]) a;
                }
                return null;
            } catch (Throwable th) {
                d("getAllNotifications error " + th);
                return null;
            }
        }
        return null;
    }
}
