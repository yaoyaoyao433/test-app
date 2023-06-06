package com.xiaomi.push.service;

import com.xiaomi.push.fb;
import com.xiaomi.push.fs;
import com.xiaomi.push.gf;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class bj implements fs {
    final /* synthetic */ XMPushService a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bj(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // com.xiaomi.push.fs
    public final void a(gf gfVar) {
        this.a.a(new XMPushService.m(gfVar), 0L);
    }

    @Override // com.xiaomi.push.fs
    public final void a(fb fbVar) {
        this.a.a(new XMPushService.d(fbVar), 0L);
    }
}
