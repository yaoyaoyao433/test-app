package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class fv extends XMPushService.j {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ fu c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(fu fuVar, int i, long j, long j2) {
        super(13);
        this.c = fuVar;
        this.a = j;
        this.b = j2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "check the ping-pong." + this.b;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        Thread.yield();
        if (!this.c.k() || this.c.a(this.a)) {
            return;
        }
        dy.a(this.c.u).a.f();
        this.c.u.a(22, (Exception) null);
    }
}
