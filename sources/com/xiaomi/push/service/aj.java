package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ag;
/* loaded from: classes6.dex */
public final class aj extends XMPushService.j {
    final /* synthetic */ ag.b.c a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ag.b.c cVar, int i) {
        super(0);
        this.a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "check peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        if (ag.a().b(this.a.a.h, this.a.a.b).r == null) {
            ag.b.this.p.a(this.a.a.h, this.a.a.b, 2, null, null);
        }
    }
}
