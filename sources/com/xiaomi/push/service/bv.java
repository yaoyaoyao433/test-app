package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class bv extends ContentObserver {
    final /* synthetic */ XMPushService a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.a = xMPushService;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        boolean i;
        super.onChange(z);
        i = this.a.i();
        com.xiaomi.channel.commonutils.logger.c.a("SuperPowerMode:" + i);
        this.a.l();
        if (i) {
            this.a.a(new XMPushService.g(24, null), 0L);
        } else {
            this.a.b(true);
        }
    }
}
