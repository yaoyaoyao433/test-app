package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.RemoteException;
import com.tencent.tmsqmsp.oaid2.m;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class j {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    public static a a(Context context) {
        a();
        new StringBuilder("getAdvertisingIdInfo ").append(System.currentTimeMillis());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
                k kVar = new k();
                Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
                intent.setPackage("com.huawei.hwid");
                if (context.bindService(intent, kVar, 1)) {
                    a();
                    try {
                        try {
                            if (!kVar.a) {
                                kVar.a = true;
                                m a2 = m.a.a(kVar.b.take());
                                return new a(a2.m(), a2.h());
                            }
                            throw new IllegalStateException();
                        } finally {
                            context.unbindService(kVar);
                        }
                    } catch (RemoteException unused) {
                        c.b("bind hms service RemoteException");
                        return null;
                    } catch (Throwable unused2) {
                        c.b("bind hms service InterruptedException");
                        return null;
                    }
                }
                c.b("bind failed");
                return null;
            } catch (PackageManager.NameNotFoundException unused3) {
                c.b("HMS not found");
                return null;
            }
        }
        c.b("Cannot be called from the main thread");
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    public static String a() {
        return "AdId";
    }
}
