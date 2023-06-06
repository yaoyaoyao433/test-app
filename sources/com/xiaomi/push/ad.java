package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import com.alipay.sdk.app.PayTask;
import java.security.MessageDigest;
/* loaded from: classes6.dex */
public final class ad implements v {
    private static boolean e;
    Context a;
    volatile int b;
    volatile a c = null;
    final Object d = new Object();
    private ServiceConnection f = new b();

    /* loaded from: classes6.dex */
    class a {
        String a;
        String b;
        String c;
        String d;

        private a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    /* loaded from: classes6.dex */
    static class c {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static String a(IBinder iBinder, String str, String str2, String str3) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                obtain.writeString(str);
                obtain.writeString(str2);
                obtain.writeString(str3);
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static boolean a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
                e = longVersionCode >= 1;
                if (z) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.xiaomi.push.v
    public final boolean a() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        try {
            Signature[] signatureArr = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            StringBuilder sb = new StringBuilder();
            for (byte b2 : messageDigest.digest(signatureArr[0].toByteArray())) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* loaded from: classes6.dex */
    class b implements ServiceConnection {
        private b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (ad.this.c != null) {
                return;
            }
            new Thread(new af(this, iBinder)).start();
        }
    }

    public ad(Context context) {
        boolean z;
        this.b = 0;
        this.a = context;
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        try {
            z = this.a.bindService(intent, this.f, 1);
        } catch (Exception unused) {
            z = false;
        }
        this.b = z ? 1 : 2;
    }

    @Override // com.xiaomi.push.v
    public final String b() {
        if (this.b == 1 && Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (this.d) {
                try {
                    com.xiaomi.channel.commonutils.logger.c.a("oppo's getOAID wait...");
                    this.d.wait(PayTask.j);
                } catch (Exception unused) {
                }
            }
        }
        if (this.c == null) {
            return null;
        }
        return this.c.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(ad adVar) {
        if (adVar.f != null) {
            try {
                adVar.a.unbindService(adVar.f);
            } catch (Exception unused) {
            }
        }
    }
}
