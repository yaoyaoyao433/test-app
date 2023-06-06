package com.sankuai.common.utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.c;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ServiceForegroundHelper {
    private static final int FOREGROUND_SERVICE_NOTIFICATION_ID = -37201;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void startService(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b8bf946606b4445450000f1404091da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b8bf946606b4445450000f1404091da");
        } else if (context == null || intent == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        }
    }

    public static void startForeground(Service service) {
        NotificationChannel notificationChannel;
        Object[] objArr = {service};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2ed458b1982495d8e8ef970e5aff0f18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2ed458b1982495d8e8ef970e5aff0f18");
        } else if (service == null) {
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationManager notificationManager = (NotificationManager) service.getSystemService(RemoteMessageConst.NOTIFICATION);
                    try {
                        notificationChannel = notificationManager.getNotificationChannel("default");
                    } catch (Throwable unused) {
                        notificationChannel = null;
                    }
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("default", "Apps running in background", 2));
                    }
                    service.startForeground(FOREGROUND_SERVICE_NOTIFICATION_ID, new Notification.Builder(service, "default").setContentTitle("").setContentText("").build());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class InnerService extends Service {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1791cb785e8e9fd773ad4fac939ac29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1791cb785e8e9fd773ad4fac939ac29");
                return;
            }
            c.a(this);
            super.onCreate();
            try {
                startForeground(ServiceForegroundHelper.FOREGROUND_SERVICE_NOTIFICATION_ID, new Notification());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            stopSelf();
        }

        @Override // android.app.Service
        public void onDestroy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a4f69185e65aff5332090f5ff9fe589", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a4f69185e65aff5332090f5ff9fe589");
                return;
            }
            c.b(this);
            stopForeground(true);
            super.onDestroy();
        }
    }
}
