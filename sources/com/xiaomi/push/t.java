package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import com.alipay.sdk.app.PayTask;
/* loaded from: classes6.dex */
public final class t implements v {
    private static boolean e;
    volatile int a;
    private Context f;
    volatile String b = null;
    volatile boolean c = false;
    private volatile String h = null;
    final Object d = new Object();
    private ServiceConnection g = new a();

    /* loaded from: classes6.dex */
    static class b {
        static String a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        static boolean b(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static boolean a(Context context) {
        boolean z;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            z = (packageInfo.applicationInfo.flags & 1) != 0;
            e = packageInfo.versionCode >= 20602000;
        } catch (Exception unused) {
        }
        return z;
    }

    @Override // com.xiaomi.push.v
    public final boolean a() {
        return e;
    }

    /* loaded from: classes6.dex */
    class a implements ServiceConnection {
        private a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                t.this.b = b.a(iBinder);
                t.this.c = b.b(iBinder);
                t.a(t.this);
                t.this.a = 2;
                synchronized (t.this.d) {
                    try {
                        t.this.d.notifyAll();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                t.a(t.this);
                t.this.a = 2;
                synchronized (t.this.d) {
                    try {
                        t.this.d.notifyAll();
                    } catch (Exception unused3) {
                    }
                }
            } catch (Throwable th) {
                t.a(t.this);
                t.this.a = 2;
                synchronized (t.this.d) {
                    try {
                        t.this.d.notifyAll();
                    } catch (Exception unused4) {
                    }
                    throw th;
                }
            }
        }
    }

    public t(Context context) {
        boolean z;
        this.a = 0;
        this.f = context;
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            z = this.f.bindService(intent, this.g, 1);
        } catch (Exception unused) {
            z = false;
        }
        this.a = z ? 1 : 2;
    }

    @Override // com.xiaomi.push.v
    public final String b() {
        if (this.a == 1 && Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (this.d) {
                try {
                    com.xiaomi.channel.commonutils.logger.c.a("huawei's getOAID wait...");
                    this.d.wait(PayTask.j);
                } catch (Exception unused) {
                }
            }
        }
        return this.b;
    }

    static /* synthetic */ void a(t tVar) {
        if (tVar.g != null) {
            try {
                tVar.f.unbindService(tVar.g);
            } catch (Exception unused) {
            }
        }
    }
}
