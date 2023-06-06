package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.alipay.sdk.app.PayTask;
/* loaded from: classes6.dex */
public final class NotificationClickedActivity extends Activity {
    private Handler a;
    private BroadcastReceiver b;

    private void a(Intent intent) {
        if (intent != null) {
            try {
                Intent intent2 = (Intent) intent.getParcelableExtra("mipush_serviceIntent");
                if (intent2 != null) {
                    intent2.setComponent(new ComponentName(getPackageName(), "com.xiaomi.mipush.sdk.PushMessageHandler"));
                    intent2.putExtra("is_clicked_activity_call", true);
                    com.xiaomi.channel.commonutils.logger.c.b("clicked activity start service.");
                    startService(intent2);
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.a(e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = 1;
        attributes.width = 1;
        attributes.gravity = 8388659;
        window.setAttributes(attributes);
        this.a = new Handler();
        this.a.postDelayed(new v(this), PayTask.j);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_clicked_activity_finish");
        this.b = new ad(this);
        try {
            registerReceiver(this.b, intentFilter, ar.a(this), null);
        } catch (Exception unused) {
        }
        a(getIntent());
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        this.a.removeCallbacksAndMessages(null);
        try {
            unregisterReceiver(this.b);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
    }
}
