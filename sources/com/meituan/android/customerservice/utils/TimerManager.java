package com.meituan.android.customerservice.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class TimerManager {
    public static ChangeQuickRedirect a;
    public AlarmReceiver b;
    public AtomicBoolean c;
    private AlarmManager d;

    public TimerManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8460edca9f74b7f1c4c1ceefba17b2c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8460edca9f74b7f1c4c1ceefba17b2c9");
            return;
        }
        this.c = new AtomicBoolean(false);
        this.b = new AlarmReceiver();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static TimerManager a = new TimerManager();
    }

    public static TimerManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67b90a713665e6224309e210fb8ebfcd", RobustBitConfig.DEFAULT_VALUE) ? (TimerManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67b90a713665e6224309e210fb8ebfcd") : a.a;
    }

    public final synchronized void a(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1203d6a7b825da0f0bddf64256afec70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1203d6a7b825da0f0bddf64256afec70");
            return;
        }
        if (this.d == null) {
            this.d = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        }
        cancel(context);
        long elapsedRealtime = SystemClock.elapsedRealtime() + (1000 * j);
        Intent intent = new Intent();
        intent.setAction("com.meituan.android.customerservice.REMOVE_FLOAT_ACTION");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, y.a);
        if (Build.VERSION.SDK_INT < 19) {
            this.d.set(3, elapsedRealtime, broadcast);
        } else {
            this.d.setExact(3, elapsedRealtime, broadcast);
        }
        Class<?> cls = getClass();
        c.a(cls, "schedule time:" + j + "s");
    }

    public final synchronized void cancel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c019789774c74f3e53895e8316d535a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c019789774c74f3e53895e8316d535a");
            return;
        }
        if (this.d == null) {
            this.d = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        }
        Intent intent = new Intent();
        intent.setAction("com.meituan.android.customerservice.REMOVE_FLOAT_ACTION");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 536870912);
        if (broadcast != null) {
            c.a(getClass(), "cancel");
            this.d.cancel(broadcast);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class AlarmReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public AlarmReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1303861cdeeff0f728db371b2490f493", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1303861cdeeff0f728db371b2490f493");
            } else if (intent == null || !TextUtils.equals("com.meituan.android.customerservice.REMOVE_FLOAT_ACTION", intent.getAction()) || com.meituan.android.customerservice.floating.a.b == null) {
            } else {
                c.a(getClass(), "AlarmReceiver:dismiss FloatingView");
                com.meituan.android.customerservice.floating.a.b.b(3);
                String str = com.meituan.android.customerservice.floating.a.b.m;
                com.meituan.android.customerservice.floating.a aVar = com.meituan.android.customerservice.floating.a.b;
                aVar.c(aVar.m);
                if (TextUtils.equals(str, "im")) {
                    com.meituan.android.customerservice.floating.a.b.a(false);
                }
            }
        }
    }
}
