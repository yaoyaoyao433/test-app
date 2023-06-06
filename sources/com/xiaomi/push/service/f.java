package com.xiaomi.push.service;

import com.xiaomi.push.fy;
import com.xiaomi.push.ha;
import com.xiaomi.push.hl;
import com.xiaomi.push.hs;
import com.xiaomi.push.hx;
import com.xiaomi.push.ia;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class f extends XMPushService.j {
    final /* synthetic */ ia a;
    final /* synthetic */ hx b;
    final /* synthetic */ XMPushService c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, ia iaVar, hx hxVar, XMPushService xMPushService) {
        super(4);
        this.a = iaVar;
        this.b = hxVar;
        this.c = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "send ack message for clear push message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        try {
            hs hsVar = new hs();
            hsVar.e = hl.CancelPushMessageACK.ah;
            hsVar.c = this.a.c;
            hsVar.b = this.a.b;
            hsVar.d = this.a.d;
            hsVar.i = this.a.i;
            hsVar.a(0L);
            hsVar.g = "success clear push message.";
            h.a(this.c, h.a(this.b.f, this.b.e, hsVar, ha.Notification, false));
        } catch (fy e) {
            com.xiaomi.channel.commonutils.logger.c.d("clear push message. " + e);
            this.c.a(10, e);
        }
    }
}
