package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.xiaomi.push.jj;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes6.dex */
public final class by {
    private static List<a> a = new CopyOnWriteArrayList();

    /* loaded from: classes6.dex */
    static class a {
        public final String a;
        public final long b;
        public final int c;
        public final Notification.Action[] d;

        a(String str, long j, int i, Notification.Action[] actionArr) {
            this.a = str;
            this.b = j;
            this.c = i;
            this.d = actionArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Context context, StatusBarNotification statusBarNotification, int i) {
        if (!jj.a(context) || i <= 0 || statusBarNotification == null || Build.VERSION.SDK_INT < 20) {
            return;
        }
        a.add(new a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i, x.c(statusBarNotification.getNotification())));
        for (int size = a.size() - 1; size >= 0; size--) {
            a aVar = a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.b > MetricsAnrManager.ANR_THRESHOLD) {
                a.remove(aVar);
            }
        }
        if (a.size() > 10) {
            a.remove(0);
        }
    }
}
