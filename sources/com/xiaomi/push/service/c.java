package com.xiaomi.push.service;

import com.xiaomi.push.fy;
import com.xiaomi.push.hx;
import com.xiaomi.push.service.XMPushService;
import java.util.Map;
/* loaded from: classes6.dex */
public final class c extends XMPushService.j {
    final /* synthetic */ XMPushService a;
    final /* synthetic */ hx b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, XMPushService xMPushService, hx hxVar) {
        super(4);
        this.a = xMPushService;
        this.b = hxVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "send ack message for unrecognized new miui message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        try {
            hx a = cr.a(this.a, this.b, (Map<String, String>) null);
            a.h.a("miui_message_unrecognized", "1");
            h.a(this.a, a);
        } catch (fy e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            this.a.a(10, e);
        }
    }
}
