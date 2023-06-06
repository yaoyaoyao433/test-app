package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ag;
/* loaded from: classes6.dex */
public final class bt implements ag.a {
    final /* synthetic */ XMPushService a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bt(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // com.xiaomi.push.service.ag.a
    public final void a() {
        this.a.l();
        if (ag.a().c() <= 0) {
            this.a.a(new XMPushService.g(12, null), 0L);
        }
    }
}
