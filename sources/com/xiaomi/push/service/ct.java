package com.xiaomi.push.service;

import com.xiaomi.push.fy;
import com.xiaomi.push.hx;
import com.xiaomi.push.jj;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class ct extends XMPushService.j {
    final /* synthetic */ XMPushService a;
    final /* synthetic */ hx b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct(int i, XMPushService xMPushService, hx hxVar) {
        super(4);
        this.a = xMPushService;
        this.b = hxVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "send ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        try {
            if (jj.a(this.a)) {
                try {
                    XMPushService xMPushService = this.a;
                    hx hxVar = this.b;
                    r1 = (g.a == null || hxVar == null) ? null : g.a.a(xMPushService, hxVar);
                    com.xiaomi.channel.commonutils.logger.c.a("pepa listener or container is null");
                } catch (Throwable unused) {
                }
            }
            h.a(this.a, cr.a(this.a, this.b, r1));
        } catch (fy e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            this.a.a(10, e);
        }
    }
}
