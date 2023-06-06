package com.xiaomi.mipush.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes6.dex */
public abstract class BaseService extends Service {
    private a a;

    /* loaded from: classes6.dex */
    public static class a extends Handler {
        private WeakReference<BaseService> a;

        public a(WeakReference<BaseService> weakReference) {
            this.a = weakReference;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            BaseService baseService;
            if (message.what != 1001 || this.a == null || (baseService = this.a.get()) == null) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.c("TimeoutHandler " + baseService.toString() + " kill self");
            if (!baseService.a()) {
                baseService.stopSelf();
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.c("TimeoutHandler has job");
            sendEmptyMessageDelayed(1001, 1000L);
        }
    }

    protected abstract boolean a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        if (this.a == null) {
            this.a = new a(new WeakReference(this));
        }
        a aVar = this.a;
        if (aVar.hasMessages(1001)) {
            aVar.removeMessages(1001);
        }
        aVar.sendEmptyMessageDelayed(1001, 1000L);
    }
}
