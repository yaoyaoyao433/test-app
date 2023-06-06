package com.xiaomi.push;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.xiaomi.push.service.receivers.BatteryReceiver;
/* loaded from: classes6.dex */
public final class eh extends dz {
    private boolean i;
    private a j;
    private volatile boolean k;
    private String l;
    private long m;

    /* loaded from: classes6.dex */
    public static class a {
        String a = "";
        String b = null;
        int c = -1;
        long d = 210000;
        int e = 0;
        int f = 0;
        boolean g = false;
        long h = 0;
        boolean i = false;
        long j = 0;

        final void a(a aVar) {
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.d = this.d;
            aVar.e = this.e;
            aVar.f = this.f;
            aVar.g = this.g;
            aVar.h = this.h;
            aVar.i = this.i;
            aVar.j = this.j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public eh(Context context) {
        super(context);
        this.i = false;
        this.k = true;
        this.l = null;
        this.m = 0L;
        this.j = new a();
        com.xiaomi.channel.commonutils.logger.c.a("[Policy] Intelligent policy");
    }

    private void a(int i, String str) {
        this.j.c = i;
        if (!"WIFI-ID-UNKNOWN".equals(str)) {
            this.j.a = str;
        } else if (this.j.a == null || !this.j.a.startsWith("W-")) {
            this.j.a = null;
        }
        this.g = str;
        this.k = (TextUtils.isEmpty(this.j.a) || this.j.c == 0) ? false : true;
    }

    private void a(long j, boolean z) {
        this.j.f++;
        this.j.e = 0;
        this.j.d = j;
        this.j.i = !z;
    }

    private void a(boolean z) {
        if (z) {
            this.j.e = 1;
        } else if (this.j.e >= 0) {
            this.j.e = -1;
        } else {
            this.j.e--;
        }
    }

    private void b(boolean z) {
        com.xiaomi.channel.commonutils.logger.c.a("[HB] adjustHeartbeat isTimeOut = " + z);
        if (!this.j.g) {
            this.j.j += this.j.d;
            com.xiaomi.channel.commonutils.logger.c.a("[HB] adjustHeartbeat duration = " + this.j.j);
        }
        if (this.j.g) {
            a(z, this.j.j);
            if ((this.j.h + 2592000000L) - System.currentTimeMillis() > 0) {
                return;
            }
            long j = this.j.d % LocationStrategy.LOCATION_TIMEOUT;
            long j2 = this.j.d;
            if (this.j.d > 235000) {
                j2 = j == 0 ? this.j.d - LocationStrategy.LOCATION_TIMEOUT : this.j.d - 30000;
            }
            long max = Math.max(j2, 210000L);
            c(max);
            em.a(max - 15000);
            com.xiaomi.channel.commonutils.logger.c.a("[HB] update Alarm interval = " + max);
            return;
        }
        long c = c(z);
        boolean b = b(c);
        if (b) {
            if (this.j.e <= -4 && c > 235000) {
                this.j.d -= 30000;
            }
            this.j.g = true;
            this.j.h = System.currentTimeMillis();
        }
        com.xiaomi.channel.commonutils.logger.c.a("[HB] adjustHeartbeat fixed = " + b + ", continuousCount = " + this.j.e + ", interval = " + this.j.d);
        ea a2 = ea.a(this.d);
        a aVar = this.j;
        a2.a(aVar, b, aVar.d);
        if (b) {
            ea.a(this.d).d(this.j.a);
        } else if (z && ea.a(this.d).a(this.j.a, c)) {
        } else {
            a(c, z);
            if (c > 210000) {
                em.a(c - 15000);
                com.xiaomi.channel.commonutils.logger.c.a("[HB] update Alarm interval = " + c);
            }
        }
    }

    private boolean b(long j) {
        if (j > 600000) {
            return true;
        }
        return (j < 235000 && this.j.e <= -4) || this.j.e <= -4;
    }

    private long c(boolean z) {
        long j = this.j.d % LocationStrategy.LOCATION_TIMEOUT;
        long j2 = this.j.d;
        if (z) {
            return j2 <= 210000 ? j2 : j2 - 30000;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        long j3 = (i == 0 || j2 < 210000) ? j2 + 30000 : j2 + LocationStrategy.LOCATION_TIMEOUT;
        if (i == 0 || j3 <= 600000) {
            return j3;
        }
        return 600000L;
    }

    private void c(long j) {
        this.j.d = j;
        this.j.e = 0;
        this.j.f = 0;
        this.j.g = false;
        this.j.h = 0L;
        this.j.i = false;
        this.j.j = 0L;
    }

    @Override // com.xiaomi.push.dz
    public final long a() {
        if (BatteryReceiver.a) {
            com.xiaomi.channel.commonutils.logger.c.a("[HB] interval battery");
            return 240000L;
        } else if (this.c && this.k) {
            this.h = this.j.d;
            com.xiaomi.channel.commonutils.logger.c.a("[HB] compute interval = " + this.j.d);
            if (this.j.d <= 210000) {
                return 195000L;
            }
            return this.j.d - 15000;
        } else {
            return c();
        }
    }

    @Override // com.xiaomi.push.dt
    public final void a(long j) {
        if (this.c && this.k && !this.j.g) {
            com.xiaomi.channel.commonutils.logger.c.a("[HB] onReadOrWrite = ");
            this.m = j;
            if (SystemClock.elapsedRealtime() - this.m <= MetricsAnrManager.ANR_THRESHOLD || this.m <= 0) {
                return;
            }
            this.i = true;
        }
    }

    @Override // com.xiaomi.push.ec
    public final void a(NetworkInfo networkInfo) {
        String str = null;
        if (networkInfo == null) {
            a(-1, (String) null);
        } else if (networkInfo.getType() != 0) {
            if (networkInfo.getType() == 1 || networkInfo.getType() == 6) {
                a(1, "WIFI-ID-UNKNOWN");
            } else {
                a(-1, (String) null);
            }
        } else {
            String subtypeName = networkInfo.getSubtypeName();
            if (!TextUtils.isEmpty(subtypeName) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equalsIgnoreCase(subtypeName)) {
                str = "M-" + subtypeName;
            }
            a(0, str);
        }
    }

    @Override // com.xiaomi.push.dz
    public final void b() {
        if (this.j.g) {
            super.b();
        }
    }

    @Override // com.xiaomi.push.ed
    public final void d() {
        if (this.c && this.k) {
            this.l = this.j.a;
        }
    }

    @Override // com.xiaomi.push.ed
    public final void e() {
        if (this.c && this.k && this.j.a.equals(this.l)) {
            com.xiaomi.channel.commonutils.logger.c.a("[HB] onPong isWifiChanged =" + this.b);
            if (this.b) {
                this.b = false;
                this.i = false;
                return;
            }
            if (!this.i) {
                a(true);
                b(false);
            } else if (!this.j.g) {
                this.j.j += this.j.d;
            }
            this.i = false;
            this.m = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.xiaomi.push.ed
    public final void f() {
        if (this.c && this.k && this.j.a.equals(this.l)) {
            com.xiaomi.channel.commonutils.logger.c.a("[HB] onPingTimeout");
            a(false);
            b(true);
            this.i = false;
            this.m = 0L;
        }
    }

    @Override // com.xiaomi.push.ec
    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = true;
        this.m = SystemClock.elapsedRealtime();
        a(1, "W-" + str);
        if (TextUtils.isEmpty(this.j.a)) {
            if (this.j != null) {
                new a().a(this.j);
                return;
            }
            return;
        }
        a a2 = ea.a(this.d).a(this.j.a);
        if (a2 == null) {
            c(210000L);
            com.xiaomi.channel.commonutils.logger.c.a("[HB] reload no cache");
            return;
        }
        a2.a(this.j);
        com.xiaomi.channel.commonutils.logger.c.a("[HB] reload interval = " + this.j.d);
    }
}
