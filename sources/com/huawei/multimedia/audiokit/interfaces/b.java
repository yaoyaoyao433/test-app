package com.huawei.multimedia.audiokit.interfaces;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    private static final Object b = new Object();
    private static final Object c = new Object();
    private static final Object d = new Object();
    private static final Object e = new Object();
    private static b f = null;
    e a = null;

    private b() {
    }

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
        com.huawei.multimedia.audiokit.utils.a.a("createFeatureKit, type = {}", new Integer[]{Integer.valueOf(i)});
        if (context != null && i == 1) {
            c cVar = new c(context);
            cVar.a(context);
            return cVar;
        }
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
                    context.bindService(intent, serviceConnection, 1);
                } catch (SecurityException e2) {
                    com.huawei.multimedia.audiokit.utils.a.a("HwAudioKit.FeatureKitManager", "bindService, SecurityException, {}", e2.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Context context, ServiceConnection serviceConnection) {
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
                return packageManager.getPackageInfo("com.huawei.multimedia.audioengine", 0) != null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("HwAudioKit.FeatureKitManager", "isMediaKitSupport ,NameNotFoundException");
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i) {
        com.huawei.multimedia.audiokit.utils.a.a("onCallBack, result = {}", new Integer[]{Integer.valueOf(i)});
        synchronized (b) {
            if (this.a != null) {
                this.a.onResult(i);
            }
        }
    }
}
