package com.xiaomi.push.service;

import com.xiaomi.push.fy;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class bl extends XMPushService.j {
    final /* synthetic */ String a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ XMPushService c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(XMPushService xMPushService, int i, String str, byte[] bArr) {
        super(4);
        this.c = xMPushService;
        this.a = str;
        this.b = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        try {
            h.a(this.c, this.a, this.b);
        } catch (fy e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            this.c.a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "send mi push message";
    }
}
