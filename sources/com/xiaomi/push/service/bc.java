package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.m;
import java.util.List;
/* loaded from: classes6.dex */
public final class bc {
    @TargetApi(19)
    private static Notification a(Notification notification, int i, String str, w wVar) {
        if (notification != null) {
            if (str.equals(notification.extras.getString("message_id"))) {
                return notification;
            }
            return null;
        }
        List<StatusBarNotification> c = wVar.c();
        if (c != null) {
            for (StatusBarNotification statusBarNotification : c) {
                Notification notification2 = statusBarNotification.getNotification();
                String string = notification2.extras.getString("message_id");
                if (i == statusBarNotification.getId() && str.equals(string)) {
                    return notification2;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i, String str) {
        return "n_top_update_" + i + CommonConstant.Symbol.UNDERLINE + str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(19)
    public static void a(Context context, String str, int i, String str2, Notification notification) {
        w a;
        Notification a2;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Build.VERSION.SDK_INT < 26 || (a2 = a(notification, i, str2, (a = w.a(context, str)))) == null) {
            return;
        }
        boolean z = notification != null;
        if (a2.getGroupAlertBehavior() != 1) {
            com.xiaomi.push.am.a((Object) a2, "mGroupAlertBehavior", (Object) 1);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = a2.extras.getLong("mipush_org_when", 0L);
        int i2 = a2.extras.getInt("mipush_n_top_fre", 0);
        int i3 = a2.extras.getInt("mipush_n_top_prd", 0);
        if (i3 <= 0 || i3 < i2) {
            return;
        }
        long j2 = (i3 * 1000) + j;
        int min = (j >= currentTimeMillis || currentTimeMillis >= j2) ? 0 : i2 > 0 ? (int) Math.min((j2 - currentTimeMillis) / 1000, i2) : i3;
        if (!z) {
            if (min > 0) {
                a2.when = currentTimeMillis;
                com.xiaomi.channel.commonutils.logger.c.a("update top notification: " + str2);
                a.a(i, a2);
            } else {
                Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, a2);
                recoverBuilder.setPriority(0);
                recoverBuilder.setWhen(currentTimeMillis);
                Bundle extras = recoverBuilder.getExtras();
                if (extras != null) {
                    extras.remove("mipush_n_top_flag");
                    extras.remove("mipush_org_when");
                    extras.remove("mipush_n_top_fre");
                    extras.remove("mipush_n_top_prd");
                    recoverBuilder.setExtras(extras);
                }
                com.xiaomi.channel.commonutils.logger.c.a("update top notification to common: " + str2);
                a.a(i, recoverBuilder.build());
            }
        }
        if (min > 0) {
            com.xiaomi.channel.commonutils.logger.c.a("schedule top notification next update delay: " + min);
            com.xiaomi.push.m.a(context).a(a(i, str2));
            com.xiaomi.push.m.a(context).a(b(context, str, i, str2, null), min);
        }
    }

    private static m.a b(Context context, String str, int i, String str2, Notification notification) {
        return new be(i, str2, context, str, null);
    }
}
