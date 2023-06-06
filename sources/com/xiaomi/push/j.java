package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public final class j {

    /* loaded from: classes6.dex */
    public static final class a {
        final String a;
        private final boolean b = false;

        a(String str, boolean z) {
            this.a = str;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements ServiceConnection {
        boolean a;
        final LinkedBlockingQueue<IBinder> b;

        private b() {
            this.a = false;
            this.b = new LinkedBlockingQueue<>(1);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: classes6.dex */
    public static final class c implements IInterface {
        private IBinder a;

        public c(IBinder iBinder) {
            this.a = iBinder;
        }

        public final String a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.a;
        }
    }

    public static a a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                b bVar = new b();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, bVar, 1)) {
                        try {
                            if (bVar.a) {
                                throw new IllegalStateException();
                            }
                            bVar.a = true;
                            IBinder poll = bVar.b.poll(30000L, TimeUnit.MILLISECONDS);
                            if (poll != null) {
                                return new a(new c(poll).a(), false);
                            }
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    throw new IOException("Google Play connection failed");
                } finally {
                    context.unbindService(bVar);
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }
}
