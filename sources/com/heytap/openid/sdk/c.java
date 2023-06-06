package com.heytap.openid.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.heytap.openid.h_a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public h_a a = null;
    public String b = null;
    public String c = null;
    public final Object d = new Object();
    public ServiceConnection e = new a();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.heytap.openid.sdk.b.a("OpenIDHelper", "onServiceConnected");
            c.this.a = h_a.AbstractBinderC0158h_a.h_a(iBinder);
            synchronized (c.this.d) {
                com.heytap.openid.sdk.b.a("OpenIDHelper", "UNLOCK");
                c.this.d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            com.heytap.openid.sdk.b.a("OpenIDHelper", "onServiceDisconnected");
            c.this.a = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public static final c a = new c(null);
    }

    public /* synthetic */ c(a aVar) {
    }

    public static boolean a(Context context) {
        com.heytap.openid.sdk.b.a("OpenIDHelper", "isSupported");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (packageInfo != null) {
                if (packageInfo.versionCode > 0) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private void b(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        com.heytap.openid.sdk.b.a("OpenIDHelper", "bindService START");
        if (context.bindService(intent, this.e, 1)) {
            com.heytap.openid.sdk.b.a("OpenIDHelper", "LOCK to wait 3000 until Service connected");
            synchronized (this.d) {
                try {
                    this.d.wait(PayTask.j);
                } catch (InterruptedException e) {
                    com.heytap.openid.sdk.b.a("OpenIDHelper", e);
                }
            }
        }
    }

    public final synchronized String a(Context context, String str) {
        com.heytap.openid.sdk.b.a("OpenIDHelper", "getOpenID:" + str);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            com.heytap.openid.sdk.b.b("HeyTapID", "Get ID Cannot run on MainThread");
            return "";
        }
        if (this.a == null) {
            com.heytap.openid.sdk.b.a("OpenIDHelper", "openIDService is NULL");
            b(context);
            if (this.a == null) {
                com.heytap.openid.sdk.b.b("OpenIDHelper", "openIDService is NULL, return NULL");
                return "";
            }
            try {
                com.heytap.openid.sdk.b.a("OpenIDHelper", "execute getResultFromService");
                return b(context, str);
            } catch (RemoteException e) {
                com.heytap.openid.sdk.b.a("OpenIDHelper", e);
                return "";
            }
        }
        try {
            com.heytap.openid.sdk.b.a("OpenIDHelper", "Service already Connected,execute getResultFromService");
            return b(context, str);
        } catch (RemoteException e2) {
            com.heytap.openid.sdk.b.a("OpenIDHelper", e2);
            return "";
        }
    }

    private String b(Context context, String str) {
        Signature[] signatureArr;
        String str2;
        MessageDigest messageDigest;
        if (TextUtils.isEmpty(this.b)) {
            this.b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.c)) {
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException e2) {
                    e2.printStackTrace();
                }
                if (messageDigest != null) {
                    byte[] digest = messageDigest.digest(byteArray);
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : digest) {
                        sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
                    }
                    str2 = sb.toString();
                    this.c = str2;
                }
            }
            str2 = null;
            this.c = str2;
        }
        com.heytap.openid.sdk.b.a("OpenIDHelper", "getOpenId Start");
        h_a h_aVar = this.a;
        if (h_aVar == null) {
            com.heytap.openid.sdk.b.b(context.getPackageName() + ":OpenIDHelper", "openIDService is NULL, return NULL");
            return "";
        }
        String h_a = ((h_a.AbstractBinderC0158h_a.C0159h_a) h_aVar).h_a(this.b, this.c, str);
        com.heytap.openid.sdk.b.a("OpenIDHelper", "getOpenId End");
        return TextUtils.isEmpty(h_a) ? "" : h_a;
    }
}
