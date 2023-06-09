package com.huawei.hms.availableupdate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.huawei.hms.ui.SafeIntent;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class m extends BroadcastReceiver {
    public Handler a;

    public m(Handler handler) {
        this.a = handler;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        String action = safeIntent.getAction();
        if ("com.huawei.appmarket.service.downloadservice.Receiver".equals(action)) {
            Bundle extras2 = safeIntent.getExtras();
            if (extras2 == null) {
                return;
            }
            Message message = new Message();
            message.what = 101;
            message.obj = extras2;
            this.a.sendMessage(message);
        } else if ("com.huawei.appmarket.service.downloadservice.progress.Receiver".equals(action)) {
            Bundle extras3 = safeIntent.getExtras();
            if (extras3 == null) {
                return;
            }
            Message message2 = new Message();
            message2.what = 102;
            message2.obj = extras3;
            this.a.sendMessage(message2);
        } else if (!"com.huawei.appmarket.service.installerservice.Receiver".equals(action) || (extras = safeIntent.getExtras()) == null) {
        } else {
            Message message3 = new Message();
            message3.what = 103;
            message3.obj = extras;
            this.a.sendMessage(message3);
        }
    }
}
