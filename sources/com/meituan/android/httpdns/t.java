package com.meituan.android.httpdns;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class t {
    public static ChangeQuickRedirect a;

    public static s a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c24cb9cf60534ba0125b6516289c8d5", 6917529027641081856L)) {
            return (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c24cb9cf60534ba0125b6516289c8d5");
        }
        if (context == null) {
            return s.NET_UNKNOWN;
        }
        try {
            connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        } catch (NullPointerException unused) {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return s.NET_UNKNOWN;
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused2) {
            networkInfo = null;
        }
        if (networkInfo == null) {
            return s.NET_UNKNOWN;
        }
        Object[] objArr2 = {networkInfo, context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "19df9f58ba02ff09fc4dd6bd34bbce7f", 6917529027641081856L)) {
            return (s) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "19df9f58ba02ff09fc4dd6bd34bbce7f");
        }
        s sVar = s.NET_UNKNOWN;
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            return sVar;
        }
        switch (networkInfo.getType()) {
            case 0:
                return c(context);
            case 1:
                return s.NET_WIFI;
            default:
                return sVar;
        }
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50c4e54e7f51b325433c3a066e199d0f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50c4e54e7f51b325433c3a066e199d0f")).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private static s c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ad5dd11d1fe12c2bf0fc284dcdd5157", 6917529027641081856L)) {
            return (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ad5dd11d1fe12c2bf0fc284dcdd5157");
        }
        if (context == null) {
            return s.NET_UNKNOWN;
        }
        try {
            MtTelephonyManager createTelephonyManager = Privacy.createTelephonyManager(context, "httpdns-base");
            if (createTelephonyManager == null) {
                return s.NET_UNKNOWN;
            }
            int networkType = createTelephonyManager.getNetworkType();
            if (networkType != 20) {
                switch (networkType) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return s.NET_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return s.NET_3G;
                    case 13:
                        return s.NET_4G;
                    default:
                        return s.NET_UNKNOWN;
                }
            }
            return s.NET_5G;
        } catch (Throwable unused) {
            return s.NET_UNKNOWN;
        }
    }
}
