package com.meizu.cloud.pushsdk.handler.a.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public final class a {
    Context a;
    List<Intent> b;
    private BroadcastReceiver c;

    public final void a(Intent intent, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.b != null) {
            Iterator<Intent> it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Intent next = it.next();
                MessageV3 messageV3 = (MessageV3) next.getParcelableExtra(PushConstants.EXTRA_APP_PUSH_BRIGHT_NOTIFICATION_MESSAGE);
                if (messageV3 != null && messageV3.getUploadDataPackageName() != null && str.equalsIgnoreCase(messageV3.getUploadDataPackageName())) {
                    this.b.remove(next);
                    break;
                }
            }
        } else {
            this.b = new ArrayList();
        }
        this.b.add(intent);
        DebugLogger.d("BrightNotification", "add bright notification intent, intent list: " + this.b);
    }

    public a(Context context) {
        this.a = context.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (this.c == null) {
            this.c = new BroadcastReceiver() { // from class: com.meizu.cloud.pushsdk.handler.a.f.a.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    if ("android.intent.action.USER_PRESENT".equalsIgnoreCase(intent.getAction())) {
                        a aVar = a.this;
                        if (aVar.b == null || aVar.b.size() == 0) {
                            return;
                        }
                        int size = aVar.b.size();
                        Iterator<Intent> it = aVar.b.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            Intent next = it.next();
                            if (i != size - 1) {
                                try {
                                    MessageV3 messageV3 = (MessageV3) next.getParcelableExtra(PushConstants.EXTRA_APP_PUSH_BRIGHT_NOTIFICATION_MESSAGE);
                                    if (messageV3 != null) {
                                        AdvanceSetting advanceSetting = messageV3.getAdvanceSetting();
                                        AdvanceSettingEx advanceSettingEx = messageV3.getAdvanceSettingEx();
                                        if (advanceSetting != null && advanceSettingEx != null) {
                                            advanceSettingEx.setSoundTitle(null);
                                            advanceSetting.getNotifyType().setSound(false);
                                            advanceSetting.getNotifyType().setLights(false);
                                            advanceSetting.getNotifyType().setVibrate(false);
                                        }
                                    }
                                } catch (Exception e) {
                                    DebugLogger.e("BrightNotification", "send bright notification error " + e.getMessage());
                                }
                            }
                            DebugLogger.d("BrightNotification", "start bright notification service " + next);
                            aVar.a.startService(next);
                            it.remove();
                            i++;
                        }
                    }
                }
            };
        }
        this.a.registerReceiver(this.c, intentFilter);
    }
}
