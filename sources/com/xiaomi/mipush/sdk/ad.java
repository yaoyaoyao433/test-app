package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes6.dex */
public class ad extends BroadcastReceiver {
    final /* synthetic */ NotificationClickedActivity a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ad(NotificationClickedActivity notificationClickedActivity) {
        this.a = notificationClickedActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.xiaomi.channel.commonutils.logger.c.b("clicked activity finish by normal.");
        this.a.finish();
    }
}
