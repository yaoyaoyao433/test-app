package com.meituan.android.base.util;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ServiceForegroundHelper {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerService extends Service {
        public static ChangeQuickRedirect a;

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbe1bb02644ec7e4267bef5b8067a53a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbe1bb02644ec7e4267bef5b8067a53a");
                return;
            }
            com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
            super.onCreate();
            try {
                startForeground(-37201, new Notification());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            stopSelf();
        }

        @Override // android.app.Service
        public void onDestroy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6b240af869c9c316a092cb6a83ac08e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6b240af869c9c316a092cb6a83ac08e");
                return;
            }
            com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
            stopForeground(true);
            super.onDestroy();
        }
    }
}
