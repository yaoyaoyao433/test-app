package com.sankuai.xm.base.util.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.i;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    public static ChangeQuickRedirect a = null;
    private static volatile int b = Integer.MIN_VALUE;
    private static volatile int c = Integer.MIN_VALUE;

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6d55e15421cba42307deaf518991482", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6d55e15421cba42307deaf518991482")).intValue();
        }
        if (b == Integer.MIN_VALUE) {
            b = c(context);
        }
        return b;
    }

    public static int a() {
        return b;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a53bdc171b6d2ab3f1816070e9139c97", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a53bdc171b6d2ab3f1816070e9139c97")).booleanValue() : e.a();
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "685206c06bb6bb9c832809828caa53e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "685206c06bb6bb9c832809828caa53e6");
        } else {
            b = c(context);
        }
    }

    public static void a(int i) {
        b = i;
    }

    public static int c(Context context) {
        NetworkInfo networkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "586de2b5f2592286e4f2dd9ef288df28", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "586de2b5f2592286e4f2dd9ef288df28")).intValue();
        }
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            com.sankuai.xm.log.c.d(d.class, "NetMonitor.detectNetwork exception:" + e.toString(), new Object[0]);
            networkInfo = null;
        }
        return a(networkInfo);
    }

    public static int a(NetworkInfo networkInfo) {
        Object[] objArr = {networkInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ced89b0c03809b2dfda533de39365cb", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ced89b0c03809b2dfda533de39365cb")).intValue();
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 0;
        }
        if (networkInfo.getType() == 1) {
            return 1;
        }
        if (networkInfo.getType() == 0) {
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
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
                    return 3;
                case 13:
                    return 4;
                default:
                    String subtypeName = networkInfo.getSubtypeName();
                    if (!subtypeName.equalsIgnoreCase(MTCellInfo.TYPE_TDSCDMA) && !subtypeName.equalsIgnoreCase(MTCellInfo.TYPE_WCDMA) && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                        if (!subtypeName.equalsIgnoreCase("LTE_CA") && !subtypeName.equalsIgnoreCase(MTCellInfo.TYPE_LTE)) {
                            if (c != subtype) {
                                com.sankuai.xm.log.c.b("NetMonitor", "device model=" + Build.MODEL + " release=" + Build.VERSION.RELEASE + " type=" + networkInfo.getType() + " typeName=" + networkInfo.getTypeName() + " subType=" + networkInfo.getSubtype() + " subTypeName=" + networkInfo.getSubtypeName(), new Object[0]);
                                c = subtype;
                                break;
                            }
                        }
                        return 4;
                    }
                    return 3;
            }
        }
        return -1;
    }

    public static String a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b5ec937c71e34c8960f2d7bde21464d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b5ec937c71e34c8960f2d7bde21464d");
        }
        int c2 = c(context);
        if (c2 == 0) {
            return null;
        }
        if (c2 != -1) {
            switch (c2) {
                case 1:
                    return "wifi";
                case 2:
                case 3:
                case 4:
                    break;
                default:
                    return null;
            }
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            return activeNetworkInfo.getExtraInfo();
        } catch (Exception e) {
            com.sankuai.xm.log.c.d(d.class, "NetMonitor.getAPNName exception:" + e.toString(), new Object[0]);
        }
    }

    public static boolean d(Context context) {
        NetworkInfo networkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93a6a2a79189469a7ec772fc1e360a3c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93a6a2a79189469a7ec772fc1e360a3c")).booleanValue();
        }
        if (context == null) {
            com.sankuai.xm.log.c.d(d.class, "NetMonitor.hasNetwork param error", new Object[0]);
            return false;
        }
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            com.sankuai.xm.log.c.d(d.class, "NetMonitor.hasNetwork exception:" + e.toString(), new Object[0]);
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "955d0d3ffdd9a5db0c410c748ab61d2c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "955d0d3ffdd9a5db0c410c748ab61d2c");
        }
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                        return inetAddress.getHostAddress();
                    }
                }
            }
        } catch (Exception | NoSuchMethodError e) {
            com.sankuai.xm.log.c.d(d.class, "NetMonitor.getLocalIP exception:" + e.toString(), new Object[0]);
        }
        return null;
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8e6acc2337d947e61063bb26fc76627", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8e6acc2337d947e61063bb26fc76627")).booleanValue();
        }
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet6Address)) {
                        return true;
                    }
                }
            }
        } catch (Exception | NoSuchMethodError e) {
            com.sankuai.xm.log.c.d(d.class, "NetMonitor.getLocalIP exception:" + e.toString(), new Object[0]);
        }
        return false;
    }

    public static void a(final i.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75cc24b5613f8adfcd3d7bcee84d0cd5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75cc24b5613f8adfcd3d7bcee84d0cd5");
        } else {
            com.sankuai.xm.threadpool.scheduler.a.b().a(31, new Runnable() { // from class: com.sankuai.xm.base.util.net.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f765a94561b4c642dc21fa1ce2b82c71", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f765a94561b4c642dc21fa1ce2b82c71");
                        return;
                    }
                    String c2 = d.c();
                    if (i.a.this != null) {
                        i.a.this.a(c2);
                    }
                }
            });
        }
    }

    public static boolean e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e31dc9af63db70935d41a3e6e44971bf", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e31dc9af63db70935d41a3e6e44971bf")).booleanValue() : c(context) == 1;
    }
}
