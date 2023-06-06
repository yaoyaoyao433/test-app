package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ag;
/* loaded from: classes6.dex */
public final class et implements ag.b.a {
    XMPushService a;
    ag.b b;
    fn c;
    int e;
    boolean f = false;
    ag.c d = ag.c.binding;

    /* JADX INFO: Access modifiers changed from: package-private */
    public et(XMPushService xMPushService, ag.b bVar) {
        this.a = xMPushService;
        this.b = bVar;
    }

    @Override // com.xiaomi.push.service.ag.b.a
    public final void a(ag.c cVar, ag.c cVar2, int i) {
        if (!this.f && cVar == ag.c.binding) {
            this.d = cVar2;
            this.e = i;
            this.f = true;
        }
        this.a.a(new eu(this, 4), 0L);
    }
}
