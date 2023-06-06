package com.huawei.updatesdk.b.c;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    private static c b;
    private static final Map<Integer, Class<? extends c>> a = new HashMap();
    private static int c = -1;

    static {
        a.put(3, a.class);
        a.put(1, e.class);
        a.put(2, f.class);
        a.put(0, d.class);
    }

    private static int a(Context context) {
        if (c(context)) {
            return 1;
        }
        if (d(context)) {
            return 2;
        }
        return b(context) ? 3 : 0;
    }

    public static c a() {
        c cVar = b;
        if (cVar != null) {
            return cVar;
        }
        Context a2 = com.huawei.updatesdk.a.b.a.a.c().a();
        if (c < 0) {
            c = a(a2);
        }
        com.huawei.updatesdk.a.a.a.b("DeviceImplFactory", "deviceType: " + c);
        Class<? extends c> cls = a.get(Integer.valueOf(c));
        if (cls == null) {
            d dVar = new d();
            b = dVar;
            return dVar;
        }
        try {
            b = cls.newInstance();
        } catch (Throwable unused) {
            b = new d();
            com.huawei.updatesdk.a.a.a.a("DeviceImplFactory", "createDeviceInfo error and create default phone deviceinfo");
        }
        return b;
    }

    private static boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
        }
        return false;
    }

    private static boolean c(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        com.huawei.updatesdk.a.a.a.b("DeviceImplFactory", "UI mode: " + uiModeManager.getCurrentModeType());
        return uiModeManager.getCurrentModeType() == 4;
    }

    private static boolean d(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
        }
        return false;
    }
}
