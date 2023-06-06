package com.xiaomi.push.service;

import com.xiaomi.push.fy;
import com.xiaomi.push.hx;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class cs extends XMPushService.j {
    final /* synthetic */ XMPushService a;
    final /* synthetic */ hx b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(int i, XMPushService xMPushService, hx hxVar) {
        super(4);
        this.a = xMPushService;
        this.b = hxVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "send app absent message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        try {
            h.a(this.a, h.a(this.b.f, this.b.e));
        } catch (fy e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            this.a.a(10, e);
        }
    }
}
