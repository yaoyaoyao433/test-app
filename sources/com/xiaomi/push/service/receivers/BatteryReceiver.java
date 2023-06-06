package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes6.dex */
public class BatteryReceiver extends BroadcastReceiver {
    public static volatile boolean a = false;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
            a = true;
        } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            a = false;
        }
    }
}
