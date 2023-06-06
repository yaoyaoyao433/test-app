package com.sankuai.meituan.location.collector.utils;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.provider.Settings;
import android.telephony.CellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* loaded from: classes4.dex */
public class l {
    public static ChangeQuickRedirect a = null;
    private static int b = 0;
    private static String[] c = null;
    private static String d = "Utils ";

    public static float a(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6d65746fd7ffafcf0b9570d243a94c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6d65746fd7ffafcf0b9570d243a94c2")).floatValue();
        }
        float[] fArr = new float[1];
        Location.distanceBetween(dArr[0], dArr[1], dArr[2], dArr[3], fArr);
        return fArr[0];
    }

    private static int a() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a534307359e55e8bc44543e02fc833e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a534307359e55e8bc44543e02fc833e2")).intValue();
        }
        if (b > 0) {
            return b;
        }
        try {
            try {
                i = Build.VERSION.SDK_INT;
            } catch (Exception unused) {
                i = Integer.valueOf(Build.VERSION.SDK).intValue();
            }
        } catch (Exception e) {
            a(e);
            i = 0;
        }
        LogUtils.a(d + "getSdk: " + i);
        return i;
    }

    public static int a(CellLocation cellLocation, Context context) {
        Object[] objArr = {cellLocation, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "390f0618662c4f8b1b1784676509bb9c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "390f0618662c4f8b1b1784676509bb9c")).intValue();
        }
        if (b(context) || cellLocation == null) {
            return 9;
        }
        if (cellLocation instanceof GsmCellLocation) {
            return 1;
        }
        try {
            Class.forName("android.telephony.cdma.CdmaCellLocation");
            return 2;
        } catch (Exception e) {
            a(e);
            return 9;
        }
    }

    public static void a(String str, boolean z, String str2) {
        Object[] objArr = {str, (byte) 1, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9a85ad899246e4cba570962f08fa0c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9a85ad899246e4cba570962f08fa0c3");
            return;
        }
        LogUtils.a(d + "writeCat: " + str);
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a14e2f1e24098746a3e9f34c826aaf4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a14e2f1e24098746a3e9f34c826aaf4b");
        } else {
            LogUtils.a(l.class, th);
        }
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87ab49d95d345ea18ce5ffe38d721d27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87ab49d95d345ea18ce5ffe38d721d27")).booleanValue();
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            LogUtils.a("CheckVpnConnected exception: " + e.getMessage());
        }
        if (connectivityManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21) {
            ArrayList arrayList = new ArrayList();
            try {
                Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                while (it.hasNext()) {
                    NetworkInterface networkInterface = (NetworkInterface) it.next();
                    if (networkInterface.isUp()) {
                        arrayList.add(networkInterface.getName());
                    }
                }
            } catch (Exception unused) {
            }
            return arrayList.contains("tun0") || arrayList.contains("pptp0");
        }
        Network[] allNetworks = connectivityManager.getAllNetworks();
        LogUtils.a("Network count: " + allNetworks.length);
        for (int i = 0; i < allNetworks.length; i++) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
            LogUtils.a("Network " + i + ": " + allNetworks[i].toString());
            StringBuilder sb = new StringBuilder("VPN transport is: ");
            sb.append(networkCapabilities.hasTransport(4));
            LogUtils.a(sb.toString());
            LogUtils.a("NOT_VPN capability is: " + networkCapabilities.hasCapability(15));
            if (networkCapabilities.hasTransport(4)) {
                return true;
            }
        }
        return false;
    }

    public static String[] a(MtTelephonyManager mtTelephonyManager) {
        int i;
        Object[] objArr = {mtTelephonyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a8bfb1f8366b17cdc8f07c23dff368d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a8bfb1f8366b17cdc8f07c23dff368d");
        }
        String networkOperator = mtTelephonyManager != null ? mtTelephonyManager.getNetworkOperator() : null;
        String[] strArr = {"0", "0"};
        if (!TextUtils.isEmpty(networkOperator) && TextUtils.isDigitsOnly(networkOperator) && networkOperator.length() > 4) {
            strArr[0] = networkOperator.substring(0, 3);
            char[] charArray = networkOperator.substring(3).toCharArray();
            int i2 = 0;
            while (i2 < charArray.length && Character.isDigit(charArray[i2])) {
                i2++;
            }
            strArr[1] = networkOperator.substring(3, i2 + 3);
        } else {
            a("mn/cc e", true, "w");
        }
        try {
            i = Integer.parseInt(strArr[0]);
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 0) {
            strArr[0] = "0";
        }
        if (!strArr[0].equals("0") && !strArr[1].equals("0")) {
            c = strArr;
            return strArr;
        } else if (strArr[0].equals("0") && strArr[1].equals("0") && c != null) {
            String[] strArr2 = c;
            a("fix mn/cc", true, "w");
            return strArr2;
        } else {
            return strArr;
        }
    }

    public static void a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "4843064f11dc122281e90d2a46a9f923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "4843064f11dc122281e90d2a46a9f923");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
        }
        String sb2 = sb.toString();
        Object[] objArr3 = {sb2, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "bc502d40f397e032a15f18baee638de0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "bc502d40f397e032a15f18baee638de0");
            return;
        }
        LogUtils.a(d + "writeCat: " + sb2);
    }

    @SuppressLint({"NewApi"})
    public static boolean b(Context context) {
        Object invoke;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "043cd9479fe4923df479f6342a297b0e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "043cd9479fe4923df479f6342a297b0e")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (a() < 17) {
            try {
                Object[] objArr2 = {contentResolver, ((String) i.a("android.provider.Settings$System", "AIRPLANE_MODE_ON")).toString()};
                Class<?>[] clsArr = {ContentResolver.class, String.class};
                Object[] objArr3 = {"android.provider.Settings$System", "getInt", objArr2, clsArr};
                ChangeQuickRedirect changeQuickRedirect2 = i.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "32edb07bb78c842e44c18c7d51b5ad54", RobustBitConfig.DEFAULT_VALUE)) {
                    invoke = PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "32edb07bb78c842e44c18c7d51b5ad54");
                } else {
                    Method declaredMethod = Class.forName("android.provider.Settings$System").getDeclaredMethod("getInt", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    invoke = declaredMethod.invoke(null, objArr2);
                }
                return ((Integer) invoke).intValue() == 1;
            } catch (Exception e) {
                a(e);
            }
        } else {
            try {
                String str = ((String) i.a("android.provider.Settings$Global", "AIRPLANE_MODE_ON")).toString();
                Object[] objArr4 = {contentResolver, str};
                Class[] clsArr2 = {ContentResolver.class, String.class};
                Integer valueOf = Integer.valueOf(Settings.Global.getInt(contentResolver, str));
                LogUtils.a(d + "airPlaneModeOn " + valueOf.intValue());
                return valueOf.intValue() == 1;
            } catch (Exception unused) {
            }
        }
        a("AIRPLANE_MODE e", true, "e");
        return false;
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    public static boolean a(Context context, MtLocation mtLocation) {
        Object[] objArr;
        boolean z;
        boolean isFromMockProvider;
        boolean z2 = false;
        boolean z3 = true;
        Object[] objArr2 = {context, mtLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "e2b3d93d59ac58d6c8df9eae786a1349", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "e2b3d93d59ac58d6c8df9eae786a1349")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if ("unknown".equalsIgnoreCase(Build.BOARD) || "generic".equalsIgnoreCase(Build.BRAND) || "generic".equalsIgnoreCase(Build.DEVICE) || "sdk".equalsIgnoreCase(Build.MODEL) || "sdk".equalsIgnoreCase(Build.PRODUCT) || "goldfish".equalsIgnoreCase(Build.HARDWARE) || "Genymotion".equalsIgnoreCase(Build.MANUFACTURER)) {
            return true;
        }
        try {
            String str = "";
            if (Build.VERSION.SDK_INT < 26) {
                str = Build.SERIAL;
            } else if (Build.VERSION.SDK_INT <= 28) {
                str = AppUtil.getSerial(context);
            }
            if ("unknown".equalsIgnoreCase(str)) {
                return true;
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
        if (a() >= 18) {
            Object[] objArr3 = {mtLocation};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "81003a7a81738c635e5a0096fdc579f8", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "81003a7a81738c635e5a0096fdc579f8")).booleanValue();
            } else if (mtLocation == null) {
                z = false;
            } else {
                double longitude = mtLocation.getLongitude();
                double latitude = mtLocation.getLatitude();
                if (longitude != 0.0d || latitude != 0.0d || mtLocation.hasAccuracy()) {
                    if (longitude > 180.0d || latitude > 90.0d) {
                        objArr = new Object[]{"strange coord:", Double.valueOf(longitude), "#", Double.valueOf(latitude)};
                    } else {
                        if (longitude < -180.0d || latitude < -90.0d) {
                            objArr = new Object[]{"strange coord:", Double.valueOf(longitude), "#", Double.valueOf(latitude)};
                        }
                        z = z3;
                    }
                    a(objArr);
                }
                z3 = false;
                z = z3;
            }
            if (z) {
                try {
                    isFromMockProvider = mtLocation.isFromMockProvider();
                } catch (Throwable unused) {
                }
                try {
                    LogUtils.a(d + " bMock： " + isFromMockProvider);
                    return isFromMockProvider;
                } catch (Throwable unused2) {
                    z2 = isFromMockProvider;
                    LogUtils.a("isMockGps isFromMockProvider error");
                    return z2;
                }
            }
            return false;
        }
        return false;
    }
}
