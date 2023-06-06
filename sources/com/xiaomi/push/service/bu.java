package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class bu extends ContentObserver {
    final /* synthetic */ XMPushService a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.a = xMPushService;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        boolean h;
        super.onChange(z);
        h = this.a.h();
        com.xiaomi.channel.commonutils.logger.c.a("ExtremePowerMode:" + h);
        if (h) {
            this.a.a(new XMPushService.g(23, null), 0L);
        } else {
            this.a.b(true);
        }
    }
}
