package com.xiaomi.push.service;

import com.xiaomi.push.ey;
import com.xiaomi.push.service.XMPushService;
import java.util.Objects;
/* loaded from: classes6.dex */
public final class aq {
    private static int f = 300000;
    XMPushService a;
    int c = 0;
    private int e = 0;
    private int d = 500;
    long b = 0;

    public aq(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    private int a() {
        if (this.c > 8) {
            return 300000;
        }
        double random = (Math.random() * 2.0d) + 1.0d;
        if (this.c > 4) {
            return (int) (random * 60000.0d);
        }
        if (this.c > 1) {
            return (int) (random * 10000.0d);
        }
        if (this.b == 0) {
            return 0;
        }
        if (System.currentTimeMillis() - this.b >= 310000) {
            this.d = 1000;
            this.e = 0;
            return 0;
        } else if (this.d >= f) {
            return this.d;
        } else {
            int i = this.d;
            this.e++;
            if (this.e >= 4) {
                return f;
            }
            this.d = (int) (this.d * 1.5d);
            return i;
        }
    }

    public final void a(boolean z) {
        if (!this.a.a()) {
            com.xiaomi.channel.commonutils.logger.c.c("should not reconnect as no client or network.");
        } else if (z) {
            if (!this.a.b(1)) {
                this.c++;
            }
            this.a.a(1);
            XMPushService xMPushService = this.a;
            XMPushService xMPushService2 = this.a;
            Objects.requireNonNull(xMPushService2);
            xMPushService.a(new XMPushService.e(), 0L);
        } else if (this.a.b(1)) {
        } else {
            int a = a();
            this.c++;
            com.xiaomi.channel.commonutils.logger.c.a("schedule reconnect in " + a + "ms");
            XMPushService xMPushService3 = this.a;
            XMPushService xMPushService4 = this.a;
            Objects.requireNonNull(xMPushService4);
            xMPushService3.a(new XMPushService.e(), a);
            if (this.c == 2 && ey.a.a.a) {
                o.b();
            }
            if (this.c == 3) {
                o.a();
            }
        }
    }
}
