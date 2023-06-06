package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.push.ds;
/* loaded from: classes6.dex */
public abstract class PushMessageReceiver extends BroadcastReceiver {
    public void onCommandResult(Context context, n nVar) {
    }

    public void onNotificationMessageArrived(Context context, o oVar) {
    }

    public void onNotificationMessageClicked(Context context, o oVar) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            com.xiaomi.channel.commonutils.logger.c.f("[CRcv] receive a msg broadcast: " + intent.getAction());
        }
        MessageHandleService.a(context.getApplicationContext(), new MessageHandleService.a(intent, this));
        try {
            int a = com.sankuai.waimai.platform.utils.f.a(intent, "eventMessageType", -1);
            if (a == 2000) {
                ds.a(context.getApplicationContext()).a(context.getPackageName(), intent, 2003, (String) null);
            } else if (a == 6000) {
                ds.a(context.getApplicationContext()).a(context.getPackageName(), intent, 6005, (String) null);
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.d("meet error in PushMessageReceiver. " + e);
        }
    }

    @Deprecated
    public void onReceiveMessage(Context context, o oVar) {
    }

    public void onReceivePassThroughMessage(Context context, o oVar) {
    }

    public void onReceiveRegisterResult(Context context, n nVar) {
    }

    public void onRequirePermissions(Context context, String[] strArr) {
    }
}
