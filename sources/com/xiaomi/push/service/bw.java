package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ag;
/* loaded from: classes6.dex */
public final class bw extends XMPushService.j {
    final /* synthetic */ XMPushService a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(XMPushService xMPushService, int i) {
        super(11);
        this.a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "prepare the mi push account.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        XMPushService xMPushService = this.a;
        cm a = cn.a(xMPushService.getApplicationContext());
        if (a != null) {
            ag.b a2 = cn.a(xMPushService.getApplicationContext()).a(xMPushService);
            com.xiaomi.channel.commonutils.logger.c.a("prepare account. " + a2.a);
            h.a(xMPushService, a2);
            ag.a().a(a2);
            ax.a(xMPushService).a(new i("GAID", 172800L, xMPushService, a));
            ax.a(xMPushService).a(new j("MSAID", 172800L, xMPushService, a));
        }
        if (com.xiaomi.push.al.a(this.a)) {
            this.a.b(true);
        }
    }
}
