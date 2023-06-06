package com.xiaomi.push.service;

import com.xiaomi.push.service.ag;
/* loaded from: classes6.dex */
public final class k implements ag.b.a {
    final /* synthetic */ XMPushService a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // com.xiaomi.push.service.ag.b.a
    public final void a(ag.c cVar, ag.c cVar2, int i) {
        if (cVar2 == ag.c.binded) {
            cq.a(this.a);
            cq.b(this.a);
        } else if (cVar2 == ag.c.unbind) {
            com.xiaomi.channel.commonutils.logger.c.a("onChange unbind");
            cq.a(this.a, 70000001, " the push is not connected.");
        }
    }
}
