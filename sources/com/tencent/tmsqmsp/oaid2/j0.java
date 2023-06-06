package com.tencent.tmsqmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.tmsqmsp.oaid2.i0;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class j0 {
    public static String e = "SDI";
    public static String f = "SI";
    public b a;
    public ServiceConnection b;
    public Context c;
    public i0 d;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                j0.this.d = i0.a.a(iBinder);
                if (j0.this.a != null) {
                    j0.this.a.a(j0.this);
                }
                c.c(j0.f + " Service onServiceConnected");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            j0.this.d = null;
            c.c(j0.f + " Service onServiceDisconnected");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a(j0 j0Var);
    }

    public j0(Context context, b bVar) {
        this.a = null;
        this.c = null;
        if (context != null) {
            this.c = context;
            this.a = bVar;
            this.b = new a();
            return;
        }
        throw new NullPointerException("Context can not be null.");
    }

    public String a() {
        Context context = this.c;
        if (context != null) {
            String packageName = context.getPackageName();
            c.a(f + "apackage：" + packageName);
            if (packageName != null && !packageName.equals("")) {
                try {
                    if (this.d != null) {
                        String a2 = this.d.a(packageName);
                        c.a(f + " getAAID Package: " + packageName);
                        return a2;
                    }
                    return null;
                } catch (Exception unused) {
                    c.c(f + " geta error, RemoteException!");
                    return null;
                }
            }
            c.c(f + " input package is null!");
            return null;
        }
        c.c(f + " Context is null.");
        throw new IllegalArgumentException("Context is null, must be new SxCore first");
    }

    public String b() {
        if (this.c != null) {
            try {
                if (this.d != null) {
                    String a2 = this.d.a();
                    c.c(e + " geto call");
                    return a2;
                }
                return null;
            } catch (Exception e2) {
                c.c(f + " geto error, RemoteException!");
                e2.printStackTrace();
                return null;
            }
        }
        c.c(f + " Context is null.");
        throw new IllegalArgumentException("Context is null, must be new SxCore first");
    }

    public void c() {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (this.c.bindService(intent, this.b, 1)) {
            c.c(f + " bindService Successful!");
            return;
        }
        this.a.a(this);
        c.c(f + " bindService Failed!");
    }

    public boolean d() {
        try {
            if (this.d == null) {
                c.c(f + " Device not support opendeviceid");
                return false;
            }
            c.c(f + " Device support opendeviceid");
            return true;
        } catch (Exception unused) {
            c.c(f + " isSupport error, RemoteException!");
            return false;
        }
    }

    public void e() {
        try {
            this.c.unbindService(this.b);
            c.c(f + " unBind Service successful");
        } catch (IllegalArgumentException unused) {
            c.c(f + " unBind Service exception");
        }
        this.d = null;
    }
}
