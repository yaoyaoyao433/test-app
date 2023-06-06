package com.xiaomi.push.service;

import com.xiaomi.push.fy;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ag;
import java.util.Collection;
import java.util.Objects;
/* loaded from: classes6.dex */
public final class cp extends XMPushService.j {
    private XMPushService a;
    private byte[] b;
    private String c;
    private String d;
    private String e;

    public cp(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.a = xMPushService;
        this.c = str;
        this.b = bArr;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "register app";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        ag.b next;
        cm a = cn.a(this.a);
        if (a == null) {
            try {
                a = cn.a(this.a, this.c, this.d, this.e);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.d("fail to register push account. " + e);
            }
        }
        if (a == null) {
            com.xiaomi.channel.commonutils.logger.c.d("no account for registration.");
            cq.a(this.a, 70000002, "no account.");
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.a("do registration now.");
        Collection<ag.b> c = ag.a().c("5");
        if (c.isEmpty()) {
            next = a.a(this.a);
            h.a(this.a, next);
            ag.a().a(next);
        } else {
            next = c.iterator().next();
        }
        if (!this.a.b()) {
            cq.a(this.c, this.b);
            this.a.b(true);
            return;
        }
        try {
            if (next.m == ag.c.binded) {
                h.a(this.a, this.c, this.b);
            } else if (next.m == ag.c.unbind) {
                cq.a(this.c, this.b);
                XMPushService xMPushService = this.a;
                XMPushService xMPushService2 = this.a;
                Objects.requireNonNull(xMPushService2);
                xMPushService.a(new XMPushService.b(next), 0L);
            }
        } catch (fy e2) {
            com.xiaomi.channel.commonutils.logger.c.d("meet error, disconnect connection. " + e2);
            this.a.a(10, e2);
        }
    }
}
