package com.sankuai.xm.base.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.graphics.Point;
import android.os.Build;
import android.os.PowerManager;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Base64;
import android.view.WindowManager;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class w {
    public static ChangeQuickRedirect a;

    public static String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe2c185a39c80f2b6beb60b9fef11383", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe2c185a39c80f2b6beb60b9fef11383");
        }
        try {
            return context.getPackageManager().getApplicationLabel(context.getPackageManager().getPackageInfo(str, 16384).applicationInfo).toString();
        } catch (Exception e) {
            com.sankuai.xm.log.c.a(w.class, e);
            return "";
        }
    }

    public static String a(Context context, short s) {
        Object[] objArr = {context, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff3863bef1dc8ebe2d18de21fbe9b0d5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff3863bef1dc8ebe2d18de21fbe9b0d5");
        }
        String a2 = a(context, "NEW_DX_SDK_DEVICE_ID_3", true);
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        return a2 + "_1" + CommonConstant.Symbol.UNDERLINE + ((int) s);
    }

    public static String a(Context context) {
        String string;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1251fe44e5022544caa2a5f94ec9088", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1251fe44e5022544caa2a5f94ec9088");
        }
        String str = "";
        try {
            string = com.sankuai.xm.base.e.a(context).getString("XM_UNCHANGED_ID", null);
        } catch (Exception e) {
            e = e;
        }
        try {
            if (TextUtils.isEmpty(string)) {
                String string2 = com.sankuai.xm.base.e.a(context).getString("NEW_DX_SDK_DEVICE_ID_3", null);
                if (!TextUtils.isEmpty(string2)) {
                    a(string2, "XM_UNCHANGED_ID", (short) 0);
                    return string2;
                }
                return b(context, "XM_UNCHANGED_ID");
            }
            return new String(Base64.decode(string, 2));
        } catch (Exception e2) {
            e = e2;
            str = string;
            com.sankuai.xm.log.c.d(w.class, "obtainUnchangedIdentifier:" + e.toString(), new Object[0]);
            return str;
        }
    }

    public static String a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b56e9632cd8b7ffd343580c15d084f4", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b56e9632cd8b7ffd343580c15d084f4");
        }
        if (z) {
            return b(context, str);
        }
        return c(context, str);
    }

    private static String b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08e670b64458448f0173e97a6a71406a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08e670b64458448f0173e97a6a71406a");
        }
        String string = com.sankuai.xm.base.e.a(context).getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                return new String(Base64.decode(string, 2));
            } catch (Throwable th) {
                com.sankuai.xm.log.c.a(w.class, th, "getDeviceIdWithCache", new Object[0]);
            }
        }
        String c = c(context, str);
        a(c, str, (short) -1);
        if (TextUtils.equals(str, "NEW_DX_SDK_DEVICE_ID_3")) {
            a(h(context), "REAL_DEVICE_ID", (short) -1);
        }
        com.sankuai.xm.log.c.b(w.class, "getDeviceIdWithCache deviceid=%s", c);
        return c;
    }

    private static String c(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9891fb35325bd05c66cb7b5c48565c7", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9891fb35325bd05c66cb7b5c48565c7");
        }
        String h = TextUtils.equals(str, "NEW_DX_SDK_DEVICE_ID_3") ? "" : h(context);
        if (TextUtils.isEmpty(h) && !TextUtils.equals(str, "REAL_DEVICE_ID")) {
            h = UUID.randomUUID().toString();
        }
        com.sankuai.xm.log.c.b(w.class, "getDeviceIdWithoutCache deviceId=%s,key=%s", h, str);
        return h;
    }

    private static String h(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8526ea82366b6437dfcba59532624598", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8526ea82366b6437dfcba59532624598");
        }
        String str2 = "";
        try {
            MtTelephonyManager createTelephonyManager = Privacy.createTelephonyManager(context, "jcyf-86a3a5e80a648863");
            if (createTelephonyManager != null) {
                if (Build.VERSION.SDK_INT <= 28) {
                    Object[] objArr2 = {context};
                    ChangeQuickRedirect changeQuickRedirect2 = v.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ae7bc32d389a74296ad49278a873afd4", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ae7bc32d389a74296ad49278a873afd4")).booleanValue() : v.a(context, PermissionGuard.PERMISSION_PHONE_READ, "jcyf-86a3a5e80a648863", false)) {
                        String imei = createTelephonyManager.getImei();
                        try {
                            com.sankuai.xm.log.c.b(w.class, "imei getDeviceIdWithoutCache=" + imei, new Object[0]);
                            str2 = imei;
                        } catch (Throwable th) {
                            th = th;
                            str2 = str;
                            com.sankuai.xm.log.c.d(w.class, "getDeviceIdWithoutCache:" + th.toString(), new Object[0]);
                            return str2;
                        }
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    String androidId = createTelephonyManager.getAndroidId();
                    com.sankuai.xm.log.c.b(w.class, "android id deviceId=" + androidId, new Object[0]);
                    return androidId;
                }
                return str2;
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(String str, String str2, short s) {
        Object[] objArr = {str, str2, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f0b10178e50c0c812e81d4fa906938c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f0b10178e50c0c812e81d4fa906938c");
        } else if (TextUtils.isEmpty(str)) {
            com.sankuai.xm.log.c.c(w.class, "saveDeviceId deviceId is null,key=%s", str2);
        } else {
            try {
                SharedPreferences.Editor edit = com.sankuai.xm.base.e.a().edit();
                if (edit == null) {
                    return;
                }
                String str3 = "_1_" + ((int) s);
                if (s > 0 && str.endsWith(str3)) {
                    String substring = str.substring(0, str.lastIndexOf(str3));
                    com.sankuai.xm.log.c.b(w.class, "saveDeviceId readDid=" + substring + ", deviceid=" + str, new Object[0]);
                    str = substring;
                }
                String encodeToString = Base64.encodeToString(str.getBytes(), 2);
                if (TextUtils.equals(str2, "NEW_DX_SDK_DEVICE_ID_3")) {
                    if (TextUtils.isEmpty(com.sankuai.xm.base.e.a().getString("REAL_DEVICE_ID", ""))) {
                        edit.putString("REAL_DEVICE_ID", com.sankuai.xm.base.e.a().getString("NEW_DX_SDK_DEVICE_ID_2", ""));
                    }
                    edit.remove("NEW_DX_SDK_DEVICE_ID_2");
                }
                edit.putString(str2, encodeToString);
                com.sankuai.xm.base.e.a(edit);
            } catch (Exception e) {
                com.sankuai.xm.log.c.a(w.class, e);
            }
        }
    }

    public static String b(Context context) {
        Exception e;
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f10de289e40b13d486523237b287dd43", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f10de289e40b13d486523237b287dd43");
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            try {
                com.sankuai.xm.log.c.b(w.class, "getAppVersionName, version = " + str, new Object[0]);
            } catch (Exception e2) {
                e = e2;
                com.sankuai.xm.log.c.d(w.class, "VersionInfo, Exception:" + e, new Object[0]);
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
        }
        return str != null ? str.length() <= 0 ? "" : str : "";
    }

    public static Point c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8bb52d25440e2dce287c4d703b9e043", 6917529027641081856L)) {
            return (Point) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8bb52d25440e2dce287c4d703b9e043");
        }
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        return point;
    }

    public static String a() {
        return Build.MODEL;
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public static boolean d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5eef7ca93a4835436ad5fd45e415fc1d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5eef7ca93a4835436ad5fd45e415fc1d")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null) {
                if (!powerManager.isScreenOn()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.sankuai.xm.log.c.d("PhoneHelper", th.toString(), new Object[0]);
            return false;
        }
    }

    public static String e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f540253ba8219da80109876d0ec887d3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f540253ba8219da80109876d0ec887d3");
        }
        try {
            switch (f(context)) {
                case 1:
                    return context.getString(R.string.xm_sdk_ctcc);
                case 2:
                    return context.getString(R.string.xm_sdk_cucc);
                case 3:
                    return context.getString(R.string.xm_sdk_cmcc);
                default:
                    return "";
            }
        } catch (Exception e) {
            com.sankuai.xm.log.c.d(w.class, "PhoneHelper.getOperators, ex=" + e, new Object[0]);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.w.f(android.content.Context):int");
    }

    public static boolean g(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0771350ffc71f0ce78faaaaa8c05509", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0771350ffc71f0ce78faaaaa8c05509")).booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                if ((applicationInfo.flags & 2) != 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Map<String, String> a(Context context, String... strArr) {
        Object[] objArr = {context, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adeda6f58fe7f390c070eef16f433963", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adeda6f58fe7f390c070eef16f433963");
        }
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                HashMap hashMap = new HashMap();
                for (String str : applicationInfo.metaData.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        for (int i = 0; i < 2; i++) {
                            if (str.startsWith(strArr[i])) {
                                hashMap.put(str, applicationInfo.metaData.getString(str));
                            }
                        }
                    }
                }
                return hashMap;
            }
        } catch (Throwable th) {
            com.sankuai.xm.log.a.a(th);
        }
        return null;
    }

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(90.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b55081f920de9e87ed42f0bb9ecae7f", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b55081f920de9e87ed42f0bb9ecae7f")).intValue() : (int) ((context.getResources().getDisplayMetrics().density * 90.0f) + 0.5f);
    }
}
