package com.dianping.base.push.pushservice.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @SuppressLint({"MissingPermission"})
    public static int a(Context context) {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ca0417b392ef60f6d1a91a182861641", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ca0417b392ef60f6d1a91a182861641")).intValue();
        }
        if (context == null) {
            return -2;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.getType() == 1) {
                    return 1;
                }
                if (activeNetworkInfo.getType() == 0) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                        switch (telephonyManager.getNetworkType()) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                return 2;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                return 3;
                            case 13:
                            case 18:
                            case 19:
                                return 4;
                            default:
                                return 0;
                        }
                    }
                    return 0;
                }
                return -1;
            }
            return -2;
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("NetworkUtils", e.toString());
            return -2;
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7842cf42e357a721a5847a7d733a7c7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7842cf42e357a721a5847a7d733a7c7c");
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if ((nextElement instanceof Inet4Address) && !nextElement.isLoopbackAddress()) {
                        return nextElement.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Throwable th) {
            com.dianping.base.push.pushservice.c.d("NetworkUtils", th.toString());
            return "";
        }
    }
}
