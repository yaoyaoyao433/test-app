package com.vivo.push.sdk.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.sankuai.waimai.foundation.core.lifecycle.c;
import com.vivo.push.sdk.a;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.p;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CommandService extends Service {
    @Override // android.app.Service
    public void onCreate() {
        c.a(this);
        p.c("CommandService", getClass().getSimpleName() + " -- oncreate " + getPackageName());
        super.onCreate();
        a.a().a(ContextDelegate.getContext(getApplicationContext()));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        p.c("CommandService", getClass().getSimpleName() + " -- onStartCommand " + getPackageName());
        if (intent == null) {
            stopSelf();
            return 2;
        } else if (!a(intent.getAction())) {
            p.a("CommandService", getPackageName() + " receive invalid action " + intent.getAction());
            stopSelf();
            return 2;
        } else {
            try {
                a.a().a(getClass().getName());
                a.a().a(intent);
            } catch (Exception e) {
                p.a("CommandService", "onStartCommand -- error", e);
            }
            stopSelf();
            return 2;
        }
    }

    protected boolean a(String str) {
        return "com.vivo.pushservice.action.RECEIVE".equals(str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        c.b(this);
        super.onDestroy();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        p.c("CommandService", "onBind initSuc: ");
        return null;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
