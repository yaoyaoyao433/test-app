package com.xiaomi.push.service;
/* loaded from: classes6.dex */
public final class bo implements Runnable {
    final /* synthetic */ XMPushService a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bo(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XMPushService.a(this.a, true);
        try {
            com.xiaomi.channel.commonutils.logger.c.a("try to trigger the wifi digest broadcast.");
            Object systemService = this.a.getApplicationContext().getSystemService("MiuiWifiService");
            if (systemService != null) {
                com.xiaomi.push.am.b(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
            }
        } catch (Throwable unused) {
        }
    }
}
