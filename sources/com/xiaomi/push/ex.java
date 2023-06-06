package com.xiaomi.push;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.ey;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class ex implements fq {
    XMPushService a;
    fn b;
    Exception c;
    private int d;
    private long j;
    private long k;
    private long f = 0;
    private long g = 0;
    private long h = 0;
    private long i = 0;
    private String e = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    public ex(XMPushService xMPushService) {
        this.j = 0L;
        this.k = 0L;
        this.a = xMPushService;
        b();
        int myUid = Process.myUid();
        try {
            this.k = TrafficStats.getUidRxBytes(myUid);
            this.j = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("Failed to obtain traffic data during initialization: " + e);
            this.k = -1L;
            this.j = -1L;
        }
    }

    private void b() {
        this.g = 0L;
        this.i = 0L;
        this.f = 0L;
        this.h = 0L;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (al.a(this.a)) {
            this.f = elapsedRealtime;
        }
        if (this.a.b()) {
            this.h = elapsedRealtime;
        }
    }

    public final synchronized void a() {
        if (this.a == null) {
            return;
        }
        String i = al.i(this.a);
        boolean b = al.b(this.a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f > 0) {
            this.g += elapsedRealtime - this.f;
            this.f = 0L;
        }
        if (this.h != 0) {
            this.i += elapsedRealtime - this.h;
            this.h = 0L;
        }
        if (b) {
            if ((!TextUtils.equals(this.e, i) && this.g > 30000) || this.g > 5400000) {
                c();
            }
            this.e = i;
            if (this.f == 0) {
                this.f = elapsedRealtime;
            }
            if (this.a.b()) {
                this.h = elapsedRealtime;
            }
        }
    }

    @Override // com.xiaomi.push.fq
    public final void a(fn fnVar, int i, Exception exc) {
        long j;
        if (this.d == 0 && this.c == null) {
            this.d = i;
            this.c = exc;
            fa.b(fnVar.f(), exc);
        }
        if (i == 22 && this.h != 0) {
            long h = fnVar.h() - this.h;
            if (h < 0) {
                h = 0;
            }
            this.i += h + (ft.c() / 2);
            this.h = 0L;
        }
        a();
        int myUid = Process.myUid();
        long j2 = -1;
        try {
            long uidRxBytes = TrafficStats.getUidRxBytes(myUid);
            j = TrafficStats.getUidTxBytes(myUid);
            j2 = uidRxBytes;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("Failed to obtain traffic data: " + e);
            j = -1L;
        }
        com.xiaomi.channel.commonutils.logger.c.c("Stats rx=" + (j2 - this.k) + ", tx=" + (j - this.j));
        this.k = j2;
        this.j = j;
    }

    private synchronized void c() {
        com.xiaomi.channel.commonutils.logger.c.c("stat connpt = " + this.e + " netDuration = " + this.g + " ChannelDuration = " + this.i + " channelConnectedTime = " + this.h);
        er erVar = new er();
        erVar.a = (byte) 0;
        erVar.a(eq.CHANNEL_ONLINE_RATE.af);
        erVar.d = this.e;
        erVar.d((int) (System.currentTimeMillis() / 1000));
        erVar.b((int) (this.g / 1000));
        erVar.c((int) (this.i / 1000));
        ey.a.a.a(erVar);
        b();
    }

    @Override // com.xiaomi.push.fq
    public final void a(fn fnVar) {
        this.d = 0;
        this.c = null;
        this.b = fnVar;
        this.e = al.i(this.a);
        fa.a(0, eq.CONN_SUCCESS.af);
    }

    @Override // com.xiaomi.push.fq
    public final void b(fn fnVar) {
        a();
        this.h = SystemClock.elapsedRealtime();
        fa.a(0, eq.CONN_SUCCESS.af, fnVar.f(), fnVar.l());
    }

    @Override // com.xiaomi.push.fq
    public final void a(fn fnVar, Exception exc) {
        fa.a(0, eq.CHANNEL_CON_FAIL.af, 1, fnVar.f(), al.b(this.a) ? 1 : 0);
        a();
    }
}
