package com.tencent.map.geolocation;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.util.Pair;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.tencent.map.geolocation.a.a.e;
import com.tencent.map.geolocation.a.a.f;
import com.tencent.map.geolocation.a.b.h;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
import dalvik.system.DexClassLoader;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class TencentLocationManager {
    public static final int COORDINATE_TYPE_GCJ02 = 1;
    public static final int COORDINATE_TYPE_WGS84 = 0;
    public static final int TYPE_OAID = 1;
    public static final int TYPE_OTHER_ID = 2;
    public static final int TYPE_QIMEI = 0;
    private static TencentLocationManager b;
    private static Class c;
    private static Object d;
    private int e;
    private Context g;
    private final byte[] a = new byte[0];
    private volatile boolean f = false;
    private ServiceConnection h = new ServiceConnection() { // from class: com.tencent.map.geolocation.TencentLocationManager.1
        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    private TencentLocationManager(Context context) {
        this.e = 0;
        if (TencentLocationManagerOptions.isLoadLibraryEnabled()) {
            try {
                System.loadLibrary("tencentloc");
            } catch (Throwable unused) {
                this.e = 3;
                return;
            }
        }
        this.g = context.getApplicationContext();
        TencentExtraKeys.setContext(this.g);
        try {
            DexClassLoader a = f.a(this.g).a();
            if (a == null) {
                e.a().a("LMI", "41");
                this.e = 4;
                return;
            }
            Class loadClass = a.loadClass("com.tencent.map.geolocation.proxy.TencentLocationManagerProxy");
            c = loadClass;
            Object newInstance = loadClass.getConstructor(Context.class, Pair.class).newInstance(this.g, null);
            d = newInstance;
            if (newInstance == null) {
                this.e = 4;
                e.a().a("LMI", "42");
                return;
            }
            e.a().a("LMI", "0");
        } catch (Throwable th) {
            this.e = 5;
            e a2 = e.a();
            a2.a("LMI", "5" + th.toString());
            h.a(context, "__bad_dex_info__", h.b);
        }
    }

    public static synchronized TencentLocationManager getInstance(Context context) throws NullPointerException, IllegalArgumentException {
        TencentLocationManager tencentLocationManager;
        synchronized (TencentLocationManager.class) {
            if (b == null) {
                if (context == null) {
                    throw new NullPointerException(MonitorManager.CONTEXT_IS_NULL_MSG);
                }
                if (context.getApplicationContext() == null) {
                    throw new NullPointerException("application context is null");
                }
                System.currentTimeMillis();
                b = new TencentLocationManager(context.getApplicationContext());
            }
            tencentLocationManager = b;
        }
        return tencentLocationManager;
    }

    public final void enableForegroundLocation(int i, Notification notification) throws IllegalArgumentException {
        if (i <= 0 || notification == null) {
            throw new IllegalArgumentException("enableForegroundLocation illegalArgument");
        }
        if (i <= 0 || notification == null) {
            throw new IllegalArgumentException("enableForegroundLocation illegalArgument");
        }
        if (this.f) {
            return;
        }
        Intent intent = new Intent(this.g, s.class);
        intent.putExtra("LocNotification", notification);
        intent.putExtra("LocNotificationId", i);
        this.g.bindService(intent, this.h, 1);
        this.f = true;
    }

    public final void disableForegroundLocation(boolean z) {
        if (this.f) {
            s.removeNotification = z;
            this.g.unbindService(this.h);
            this.f = false;
        }
    }

    public final void setCoordinateType(int i) {
        try {
            if (i == 1 || i == 0) {
                synchronized (this.a) {
                    try {
                        c.getDeclaredMethod("setCoordinateType", Integer.TYPE).invoke(d, Integer.valueOf(i));
                    } catch (Throwable unused) {
                    }
                }
                return;
            }
            throw new IllegalArgumentException("unknown coordinate type: ".concat(String.valueOf(i)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final int getCoordinateType() {
        try {
            return ((Integer) c.getDeclaredMethod("getCoordinateType", new Class[0]).invoke(d, new Object[0])).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public final int requestLocationUpdates(TencentLocationRequest tencentLocationRequest, TencentLocationListener tencentLocationListener) {
        if (this.e > 0) {
            return this.e;
        }
        try {
            return ((Integer) c.getDeclaredMethod("requestLocationUpdates", TencentLocationRequest.class, TencentLocationListener.class).invoke(d, tencentLocationRequest, tencentLocationListener)).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    public final int requestLocationUpdates(TencentLocationRequest tencentLocationRequest, TencentLocationListener tencentLocationListener, Looper looper) {
        int intValue;
        System.currentTimeMillis();
        if (tencentLocationRequest != null) {
            if (tencentLocationListener != null) {
                if (looper == null) {
                    throw new NullPointerException("looper is null");
                }
                if (this.e > 0) {
                    return this.e;
                }
                synchronized (this.a) {
                    try {
                        Integer num = (Integer) c.getDeclaredMethod("requestLocationUpdates", TencentLocationRequest.class, TencentLocationListener.class, Looper.class).invoke(d, tencentLocationRequest, tencentLocationListener, looper);
                        e.a().a("RLU", num.toString());
                        intValue = num.intValue();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return intValue;
            }
            throw new NullPointerException("listener is null");
        }
        throw new NullPointerException("request is null");
    }

    public final int requestSingleFreshLocation(TencentLocationRequest tencentLocationRequest, TencentLocationListener tencentLocationListener, Looper looper) {
        int intValue;
        if (tencentLocationListener != null) {
            if (looper == null) {
                throw new NullPointerException("looper is null");
            }
            if (this.e > 0) {
                return this.e;
            }
            synchronized (this.a) {
                try {
                    intValue = ((Integer) c.getDeclaredMethod("requestSingleFreshLocation", TencentLocationRequest.class, TencentLocationListener.class, Looper.class).invoke(d, tencentLocationRequest, tencentLocationListener, looper)).intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return intValue;
        }
        throw new NullPointerException("listener is null");
    }

    public final boolean startIndoorLocation() {
        try {
            return ((Boolean) c.getDeclaredMethod("startIndoorLocation", new Class[0]).invoke(d, new Object[0])).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final boolean stopIndoorLocation() {
        try {
            return ((Boolean) c.getDeclaredMethod("stopIndoorLocation", new Class[0]).invoke(d, new Object[0])).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final TencentLocation getLastKnownLocation() {
        try {
            return (TencentLocation) c.getDeclaredMethod("getLastKnownLocation", new Class[0]).invoke(d, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void removeUpdates(TencentLocationListener tencentLocationListener) {
        synchronized (this.a) {
            try {
                h.a(this.g, "__loc_sdk__exp_times__");
                c.getDeclaredMethod("removeUpdates", TencentLocationListener.class).invoke(d, tencentLocationListener);
                e.a().b();
            }
        }
    }

    public final String getBuild() {
        try {
            return (String) c.getDeclaredMethod("getBuild", new Class[0]).invoke(d, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return "error";
        }
    }

    public final String getVersion() {
        try {
            return (String) c.getDeclaredMethod("getVersion", new Class[0]).invoke(d, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return "error";
        }
    }

    public final void setDebuggable(boolean z) {
        try {
            c.getDeclaredMethod("setDebuggable", Boolean.TYPE).invoke(d, Boolean.valueOf(z));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void triggerCodeGuarder(boolean z) {
        try {
            c.getDeclaredMethod("triggerCodeGuarder", Boolean.TYPE).invoke(d, Boolean.valueOf(z));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
