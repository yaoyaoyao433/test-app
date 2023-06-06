package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import com.xiaomi.channel.commonutils.logger.c;
import com.xiaomi.push.em;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ak;
/* loaded from: classes6.dex */
public class PingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c.c(intent.getPackage() + " is the package name");
        if (XMPushService.c()) {
            return;
        }
        if (!ak.q.equals(intent.getAction())) {
            c.a("cancel the old ping timer");
            em.a();
        } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
            c.c("Ping XMChannelService on timer");
            try {
                Intent intent2 = new Intent(context, XMPushService.class);
                intent2.putExtra(AtMeInfo.TIME_STAMP, System.currentTimeMillis());
                intent2.setAction("com.xiaomi.push.timer");
                com.xiaomi.push.service.a.a(context).a(intent2);
            } catch (Exception e) {
                c.a(e);
            }
        }
    }
}
