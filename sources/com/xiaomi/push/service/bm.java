package com.xiaomi.push.service;

import com.xiaomi.push.fn;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class bm extends XMPushService.j {
    final /* synthetic */ XMPushService a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(XMPushService xMPushService, int i) {
        super(2);
        this.a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        if (this.a.c != null) {
            this.a.c.b(15, (Exception) null);
            XMPushService.a(this.a, (fn) null);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "disconnect for service destroy.";
    }
}
