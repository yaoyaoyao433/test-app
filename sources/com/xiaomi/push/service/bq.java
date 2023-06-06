package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.pm.PackageManager;
/* loaded from: classes6.dex */
public final class bq implements Runnable {
    final /* synthetic */ XMPushService a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bq(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            PackageManager packageManager = this.a.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(this.a.getApplicationContext(), "com.xiaomi.push.service.receivers.PingReceiver");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a("[Alarm] disable ping receiver may be failure. " + th);
        }
    }
}
