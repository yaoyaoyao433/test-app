package com.xiaomi.push.service;

import com.xiaomi.push.fb;
import com.xiaomi.push.fy;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class bd extends XMPushService.j {
    private XMPushService a;
    private fb[] b;

    public bd(XMPushService xMPushService, fb[] fbVarArr) {
        super(4);
        this.a = null;
        this.a = xMPushService;
        this.b = fbVarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "batch send message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        try {
            if (this.b != null) {
                XMPushService xMPushService = this.a;
                fb[] fbVarArr = this.b;
                if (xMPushService.c == null) {
                    throw new fy("try send msg while connection is null.");
                }
                xMPushService.c.a(fbVarArr);
            }
        } catch (fy e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            this.a.a(10, e);
        }
    }
}
