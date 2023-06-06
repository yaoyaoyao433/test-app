package com.tencent.tmsqmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.tencent.tmsqmsp.oaid2.g0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h0 {
    public static final h0 f = new h0();
    public g0 a;
    public String b;
    public String c;
    public final Object d = new Object();
    public ServiceConnection e = new a();

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            h0.this.a = g0.a.a(iBinder);
            synchronized (h0.this.d) {
                h0.this.d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            h0.this.a = null;
        }
    }

    public boolean a(Context context) {
        boolean z = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT < 28 ? !(packageInfo == null || packageInfo.versionCode <= 0) : !(packageInfo == null || packageInfo.getLongVersionCode() < 1)) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return z;
    }

    public final String b(Context context, String str) {
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
                    for (byte b : digest) {
                        sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                    }
                    str2 = sb.toString();
                    this.c = str2;
                }
            }
            str2 = null;
            this.c = str2;
        }
        String a2 = ((g0.a.C1501a) this.a).a(this.b, this.c, str);
        return TextUtils.isEmpty(a2) ? "" : a2;
    }

    public String a(Context context, String str) {
        String b;
        synchronized (this) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                if (this.a == null) {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                    intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                    if (context.bindService(intent, this.e, 1)) {
                        synchronized (this.d) {
                            try {
                                this.d.wait(PayTask.j);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    if (this.a != null) {
                        try {
                            b = b(context, str);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    b = "";
                } else {
                    try {
                        b = b(context, str);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            } else {
                throw new IllegalStateException("Cannot run on MainThread");
            }
        }
        return b;
    }
}
