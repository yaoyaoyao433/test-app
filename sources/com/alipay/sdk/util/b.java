package com.alipay.sdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static b a;
    public String b;

    private b(Context context) {
        try {
            try {
                String a2 = com.meituan.android.privacy.aop.e.a(com.meituan.android.privacy.aop.e.c((WifiManager) context.getApplicationContext().getSystemService("wifi")));
                this.b = a2;
                if (!TextUtils.isEmpty(a2)) {
                    return;
                }
            } catch (Exception e) {
                d.a(e);
                if (!TextUtils.isEmpty(this.b)) {
                    return;
                }
            }
            this.b = "00:00:00:00:00:00";
        } catch (Throwable th) {
            if (TextUtils.isEmpty(this.b)) {
                this.b = "00:00:00:00:00:00";
            }
            throw th;
        }
    }

    public static b a(Context context) {
        if (a == null) {
            a = new b(context);
        }
        return a;
    }

    public static String c(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static e b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0) {
                return e.a(activeNetworkInfo.getSubtype());
            }
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
                return e.WIFI;
            }
            return e.NONE;
        } catch (Exception unused) {
            return e.NONE;
        }
    }
}
