package com.xiaomi.push;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes6.dex */
public final class l {
    public static boolean a(Context context) {
        try {
            return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return false;
        }
    }

    public static boolean b(Context context) {
        Intent intent;
        try {
            intent = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception unused) {
            intent = null;
        }
        if (intent == null) {
            return false;
        }
        int a = com.sankuai.waimai.platform.utils.f.a(intent, "status", -1);
        return a == 2 || a == 5;
    }
}
