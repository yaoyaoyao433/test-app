package com.huawei.agconnect.core;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.sankuai.waimai.foundation.core.lifecycle.c;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ServiceDiscovery extends Service {
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
}
