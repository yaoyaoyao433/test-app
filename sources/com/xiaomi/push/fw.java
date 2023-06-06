package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class fw extends XMPushService.j {
    final /* synthetic */ int a;
    final /* synthetic */ Exception b;
    final /* synthetic */ fu c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(fu fuVar, int i, int i2, Exception exc) {
        super(2);
        this.c = fuVar;
        this.a = i2;
        this.b = exc;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        this.c.u.a(this.a, this.b);
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "shutdown the connection. " + this.a + ", " + this.b;
    }
}
