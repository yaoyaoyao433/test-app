package com.xiaomi.mipush.sdk.help;

import android.app.IntentService;
import android.content.Intent;
import android.text.TextUtils;
import com.sankuai.waimai.foundation.core.lifecycle.c;
import com.sankuai.waimai.platform.utils.f;
import com.xiaomi.mipush.sdk.bc;
/* loaded from: classes6.dex */
public class HelpService extends IntentService {
    public HelpService() {
        super("intentService");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        c.a(this);
        super.onCreate();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        c.b(this);
        super.onDestroy();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (TextUtils.isEmpty(f.a(intent, "awake_info"))) {
            return;
        }
        bc.a(this, intent, null);
    }
}
