package com.huawei.hms.push;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class o {
    public static int a;

    public static synchronized void a(Context context, k kVar) {
        int hashCode;
        int i;
        int i2;
        int hashCode2;
        synchronized (o.class) {
            if (context == null || kVar == null) {
                return;
            }
            HMSLog.d("PushSelfShowLog", "showNotification, the msg id = " + kVar.p());
            if (a == 0) {
                a = (context.getPackageName() + System.currentTimeMillis()).hashCode();
            }
            if (TextUtils.isEmpty(kVar.l())) {
                String q = kVar.q();
                if (!TextUtils.isEmpty(q)) {
                    int hashCode3 = q.hashCode();
                    kVar.a(hashCode3);
                    HMSLog.d("PushSelfShowLog", "notification msgTag = " + hashCode3);
                }
                if (kVar.s() != -1) {
                    hashCode = kVar.s();
                    i = (kVar.k() + System.currentTimeMillis()).hashCode();
                    i2 = i + 1;
                    hashCode2 = (kVar.s() + kVar.k() + context.getPackageName()).hashCode();
                } else {
                    hashCode = a + 1;
                    a = hashCode;
                    i = hashCode + 1;
                    a = i;
                    i2 = i + 1;
                    a = i2;
                    hashCode2 = i2 + 1;
                    a = hashCode2;
                }
            } else {
                hashCode = (kVar.l() + kVar.k()).hashCode();
                i = a + 1;
                a = i;
                i2 = i + 1;
                a = i2;
                hashCode2 = (kVar.l() + kVar.k() + context.getPackageName()).hashCode();
            }
            HMSLog.d("PushSelfShowLog", "notifyId:" + hashCode + ",openNotifyId:" + i + ",delNotifyId:" + i2 + ",alarmNotifyId:" + hashCode2);
            int[] iArr = new int[4];
            iArr[0] = hashCode;
            iArr[1] = i;
            iArr[2] = i2;
            if (kVar.f() <= 0) {
                hashCode2 = 0;
            }
            iArr[3] = hashCode2;
            Notification a2 = q.a() ? a(context, kVar, iArr) : null;
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (notificationManager != null && a2 != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    notificationManager.createNotificationChannel(new NotificationChannel("HwPushChannelID", context.getString(ResourceLoaderUtil.getStringId("hms_push_channel")), 3));
                }
                notificationManager.notify(hashCode, a2);
                d(context, kVar, iArr);
                e.a(context, kVar.p(), kVar.b(), "100");
            }
        }
    }

    public static PendingIntent b(Context context, k kVar, int[] iArr) {
        return PendingIntent.getBroadcast(context, iArr[2], a(context, kVar, iArr, "2", y.a), 134217728);
    }

    public static PendingIntent c(Context context, k kVar, int[] iArr) {
        return PendingIntent.getBroadcast(context, iArr[1], a(context, kVar, iArr, "1", y.a), 134217728);
    }

    public static void d(Context context, k kVar, int[] iArr) {
        HMSLog.i("PushSelfShowLog", "setAutoClear time is: " + kVar.f());
        if (kVar.f() <= 0) {
            return;
        }
        a(context, a(context, kVar, iArr, "-1", 32), kVar.f(), iArr[3]);
    }

    @SuppressLint({"NewApi"})
    public static void b(Context context, Notification.Builder builder, k kVar) {
        if ("com.huawei.android.pushagent".equals(context.getPackageName())) {
            Bundle bundle = new Bundle();
            String k = kVar.k();
            if (TextUtils.isEmpty(k)) {
                return;
            }
            bundle.putString("hw_origin_sender_package_name", k);
            builder.setExtras(bundle);
        }
    }

    public static void c(k kVar, Notification.Builder builder) {
        builder.setTicker(kVar.x());
    }

    public static void b(k kVar, Notification.Builder builder) {
        String t = kVar.t();
        if (TextUtils.isEmpty(t)) {
            return;
        }
        builder.setSubText(t);
    }

    public static void b(Context context, k kVar, Notification.Builder builder) {
        String u;
        if (TextUtils.isEmpty(kVar.u())) {
            u = context.getResources().getString(context.getApplicationInfo().labelRes);
        } else {
            u = kVar.u();
        }
        String j = kVar.j();
        builder.setContentTitle(u);
        builder.setContentText(j);
    }

    public static Intent a(Context context, k kVar, int[] iArr, String str, int i) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        intent.putExtra("selfshow_info", kVar.o()).putExtra("selfshow_token", kVar.y()).putExtra("selfshow_event_id", str).putExtra("selfshow_notify_id", iArr[0]).putExtra("selfshow_auto_clear_id", iArr[3]).setPackage(context.getPackageName()).setFlags(i);
        return intent;
    }

    public static Notification a(Context context, k kVar, int[] iArr) {
        Notification.Builder builder = new Notification.Builder(context);
        if (m.a(kVar) == n.STYLE_BIGTEXT) {
            m.a(builder, kVar.g(), kVar);
        }
        l.a(context, builder, kVar);
        b(kVar, builder);
        b(context, kVar, builder);
        a(context, kVar, builder);
        a(builder);
        a(kVar, builder);
        c(kVar, builder);
        builder.setContentIntent(c(context, kVar, iArr));
        builder.setDeleteIntent(b(context, kVar, iArr));
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("HwPushChannelID");
        }
        b(context, builder, kVar);
        a(context, builder, kVar);
        return builder.build();
    }

    @SuppressLint({"NewApi"})
    public static void a(Context context, Notification.Builder builder, k kVar) {
        if (HwBuildEx.VERSION.EMUI_SDK_INT < 11 || !q.a(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        String k = kVar.k();
        HMSLog.i("PushSelfShowLog", "the package name of notification is:" + k);
        if (!TextUtils.isEmpty(k)) {
            String a2 = q.a(context, k);
            HMSLog.i("PushSelfShowLog", "the app name is:" + a2);
            if (a2 != null) {
                bundle.putCharSequence("android.extraAppName", a2);
            }
        }
        builder.setExtras(bundle);
    }

    public static void a(Context context, Intent intent, long j, int i) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("enter setDelayAlarm(intent:");
            sb.append(intent.toURI());
            sb.append(" interval:");
            sb.append(j);
            sb.append("ms, context:");
            sb.append(context);
            HMSLog.d("PushSelfShowLog", sb.toString());
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (alarmManager != null) {
                alarmManager.set(0, System.currentTimeMillis() + j, PendingIntent.getBroadcast(context, i, intent, 134217728));
            }
        } catch (Exception e) {
            HMSLog.w("PushSelfShowLog", "set DelayAlarm error." + e.toString());
        }
    }

    public static void a(Context context, k kVar, Notification.Builder builder) {
        Bitmap a2 = l.a(context, kVar);
        if (a2 != null) {
            builder.setLargeIcon(a2);
        }
    }

    public static void a(Notification.Builder builder) {
        builder.setShowWhen(true);
        builder.setWhen(System.currentTimeMillis());
    }

    public static void a(k kVar, Notification.Builder builder) {
        builder.setAutoCancel(kVar.e() == 1);
        builder.setOngoing(false);
    }
}
