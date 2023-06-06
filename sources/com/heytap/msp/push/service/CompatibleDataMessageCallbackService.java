package com.heytap.msp.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.heytap.mcssdk.a;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.DataMessage;
import com.sankuai.waimai.foundation.core.lifecycle.c;
/* loaded from: classes2.dex */
public class CompatibleDataMessageCallbackService extends Service implements IDataMessageCallBackService {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        c.a(this);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        c.b(this);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        a.a(getApplicationContext(), intent, this);
        return 2;
    }

    public void processMessage(Context context, DataMessage dataMessage) {
    }
}
