package com.tencent.map.geolocation;

import android.app.PendingIntent;
import android.content.Context;
import com.tencent.map.geolocation.a.a.e;
import com.tencent.map.geolocation.a.a.f;
import dalvik.system.DexClassLoader;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class TencentGeofenceManager {
    private Class a;
    private Object b;

    public TencentGeofenceManager(Context context) {
        if (TencentLocationManagerOptions.isLoadLibraryEnabled()) {
            try {
                System.loadLibrary("tencentloc");
            } catch (Throwable unused) {
                return;
            }
        }
        try {
            DexClassLoader a = f.a(context).a();
            if (a == null) {
                e.a().a("LMI", "41");
                return;
            }
            this.a = a.loadClass("com.tencent.map.geolocation.proxy.TencentGeofenceManagerProxy");
            this.b = this.a.getConstructor(Context.class).newInstance(context);
            if (this.b == null) {
                e.a().a("LMI", "42");
            } else {
                e.a().a("LMI", "0");
            }
        } catch (Throwable th) {
            e a2 = e.a();
            a2.a("LMI", "5" + th.toString());
        }
    }

    public final void destroy() {
        try {
            this.a.getDeclaredMethod("destroy", new Class[0]).invoke(this.b, new Object[0]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public final void addFence(TencentGeofence tencentGeofence, PendingIntent pendingIntent) {
        try {
            this.a.getDeclaredMethod("addFence", TencentGeofence.class, PendingIntent.class).invoke(this.b, tencentGeofence, pendingIntent);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public final void removeFence(TencentGeofence tencentGeofence) {
        try {
            this.a.getDeclaredMethod("removeFence", TencentGeofence.class).invoke(this.b, tencentGeofence);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public final void removeAllFences() {
        try {
            this.a.getDeclaredMethod("removeAllFences", new Class[0]).invoke(this.b, new Object[0]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public final void removeFence(String str) {
        try {
            this.a.getDeclaredMethod("removeFence", String.class).invoke(this.b, str);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }
}
