package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.cn;
/* loaded from: classes6.dex */
public final class bx implements cn.a {
    final /* synthetic */ XMPushService.j a;
    final /* synthetic */ XMPushService b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bx(XMPushService xMPushService, XMPushService.j jVar) {
        this.b = xMPushService;
        this.a = jVar;
    }

    @Override // com.xiaomi.push.service.cn.a
    public final void a() {
        this.b.a(this.a, 0L);
    }
}
