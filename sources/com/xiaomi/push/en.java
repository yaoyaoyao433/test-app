package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import com.xiaomi.push.em;
/* loaded from: classes6.dex */
public class en implements em.a {
    protected Context a;
    private PendingIntent b = null;
    private volatile long c = 0;

    public en(Context context) {
        this.a = null;
        this.a = context;
    }

    private static void a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        try {
            AlarmManager.class.getMethod("setExact", Integer.TYPE, Long.TYPE, PendingIntent.class).invoke(alarmManager, 2, Long.valueOf(j), pendingIntent);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.d("[Alarm] invoke setExact method meet error. " + e);
        }
    }

    private void b(long j) {
        AlarmManager alarmManager = (AlarmManager) this.a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (Build.VERSION.SDK_INT >= 23) {
            am.a((Object) alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j), this.b);
        } else {
            a(alarmManager, j, this.b);
        }
        StringBuilder sb = new StringBuilder("[Alarm] register timer ");
        sb.append((j - SystemClock.elapsedRealtime()) / 1000);
        sb.append(", ");
        sb.append(this.b != null ? Integer.valueOf(this.b.hashCode()) : "");
        com.xiaomi.channel.commonutils.logger.c.c(sb.toString());
    }

    @Override // com.xiaomi.push.em.a
    public final void a() {
        if (this.b != null) {
            try {
                ((AlarmManager) this.a.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.b);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.b = null;
                com.xiaomi.channel.commonutils.logger.c.c("[Alarm] unregister timer");
                this.c = 0L;
                throw th;
            }
            this.b = null;
            com.xiaomi.channel.commonutils.logger.c.c("[Alarm] unregister timer");
            this.c = 0L;
        }
        this.c = 0L;
    }

    @Override // com.xiaomi.push.em.a
    public final void a(long j) {
        if (this.b == null) {
            return;
        }
        b(j + SystemClock.elapsedRealtime());
    }

    @Override // com.xiaomi.push.em.a
    public final boolean b() {
        return this.c != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r8.c < r4) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    @Override // com.xiaomi.push.em.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.a
            com.xiaomi.push.dy r0 = com.xiaomi.push.dy.a(r0)
            com.xiaomi.push.dz r0 = r0.a
            long r0 = r0.a()
            r2 = 0
            if (r9 != 0) goto L17
            long r4 = r8.c
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L17
            return
        L17:
            if (r9 == 0) goto L1c
            r8.a()
        L1c:
            long r4 = android.os.SystemClock.elapsedRealtime()
            if (r9 != 0) goto L3b
            long r6 = r8.c
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 != 0) goto L29
            goto L3b
        L29:
            long r2 = r8.c
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L41
            long r2 = r8.c
            long r2 = r2 + r0
            r8.c = r2
            long r2 = r8.c
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L41
            goto L3e
        L3b:
            long r2 = r4 % r0
            long r0 = r0 - r2
        L3e:
            long r4 = r4 + r0
            r8.c = r4
        L41:
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r0 = com.xiaomi.push.service.ak.q
            r9.<init>(r0)
            android.content.Context r0 = r8.a
            java.lang.String r0 = r0.getPackageName()
            r9.setPackage(r0)
            long r0 = r8.c
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            r4 = 0
            if (r2 < r3) goto L65
            android.content.Context r2 = r8.a
            r3 = 33554432(0x2000000, float:9.403955E-38)
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r2, r4, r9, r3)
        L62:
            r8.b = r9
            goto L6c
        L65:
            android.content.Context r2 = r8.a
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r2, r4, r9, r4)
            goto L62
        L6c:
            r8.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.en.a(boolean):void");
    }
}
