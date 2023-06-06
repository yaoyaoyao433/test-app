package com.huawei.multimedia.liteav.audiokit.interfaces;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    private static final Object b = new Object();
    private static final Object c = new Object();
    private static final Object d = new Object();
    private static final Object e = new Object();
    private static b f = null;
    e a = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public static b a() {
        b bVar;
        synchronized (c) {
            if (f == null) {
                f = new b();
            }
            bVar = f;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends a> T a(int i, Context context) {
        TXCLog.i("HwAudioKit.FeatureKitManager", "createFeatureKit, type = %d", Integer.valueOf(i));
        if (context == null) {
            return null;
        }
        if (i == 1) {
            c cVar = new c(context);
            cVar.a(context);
            return cVar;
        }
        TXCLog.i("HwAudioKit.FeatureKitManager", "createFeatureKit, type error");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Context context, ServiceConnection serviceConnection, String str) {
        synchronized (d) {
            try {
                if (context == null) {
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName("com.huawei.multimedia.audioengine", str);
                try {
                    TXCLog.i("HwAudioKit.FeatureKitManager", "bindService");
                    context.bindService(intent, serviceConnection, 1);
                } catch (SecurityException e2) {
                    TXCLog.e("HwAudioKit.FeatureKitManager", "bindService, SecurityException, %s", e2.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Context context, ServiceConnection serviceConnection) {
        TXCLog.i("HwAudioKit.FeatureKitManager", "unbindService");
        synchronized (e) {
            if (context != null) {
                try {
                    context.unbindService(serviceConnection);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                if (packageManager.getPackageInfo("com.huawei.multimedia.audioengine", 0) == null) {
                    TXCLog.i("HwAudioKit.FeatureKitManager", "packageInfo is null");
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                TXCLog.e("HwAudioKit.FeatureKitManager", "isAudioKitSupport ,NameNotFoundException");
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i) {
        TXCLog.i("HwAudioKit.FeatureKitManager", "onCallBack, result = %d", Integer.valueOf(i));
        synchronized (b) {
            if (this.a != null) {
                this.a.onResult(i);
            }
        }
    }
}
