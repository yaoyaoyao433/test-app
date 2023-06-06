package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ag;
/* loaded from: classes6.dex */
public final class ai extends XMPushService.j {
    final /* synthetic */ ag.b.c a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(ag.b.c cVar, int i) {
        super(0);
        this.a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        if (this.a.b == this.a.a.r) {
            com.xiaomi.channel.commonutils.logger.c.b("clean peer, chid = " + this.a.a.h);
            this.a.a.r = null;
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "clear peer job";
    }
}
