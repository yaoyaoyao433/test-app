package com.xiaomi.mipush.sdk;
/* loaded from: classes6.dex */
public final class v implements Runnable {
    final /* synthetic */ NotificationClickedActivity a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(NotificationClickedActivity notificationClickedActivity) {
        this.a = notificationClickedActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.xiaomi.channel.commonutils.logger.c.a("clicked activity finish by timeout.");
        this.a.finish();
    }
}
