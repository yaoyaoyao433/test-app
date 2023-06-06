package com.vivo.push.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class z {
    private static Boolean c;
    private static String[] a = {"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};
    private static String[] b = {"android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};
    private static String[] d = {"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};
    private static String[] e = {"com.vivo.push.sdk.RegistrationReceiver"};
    private static String[] f = new String[0];
    private static Map<String, Bundle> g = new ConcurrentHashMap();

    public static boolean a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (c != null) {
            return c.booleanValue();
        }
        if (context == null) {
            p.d("Utility", "isPushProcess context is null");
            return false;
        }
        String b2 = t.b(context);
        if (context != null && context.getPackageName() != null && context.getPackageName().equals(b2)) {
            Boolean bool = Boolean.TRUE;
            c = bool;
            return bool.booleanValue();
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        String str = null;
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    str = next.processName;
                    break;
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(str.contains(":pushservice"));
        c = valueOf;
        return valueOf.booleanValue();
    }

    public static long b(Context context) {
        String b2 = t.b(context);
        if (TextUtils.isEmpty(b2)) {
            p.a("Utility", "systemPushPkgName is null");
            return -1L;
        }
        return a(context, b2);
    }

    public static long a(Context context, String str) {
        Object a2 = a(context, str, "com.vivo.push.sdk_version");
        if (a2 == null) {
            a2 = a(context, str, "sdk_version");
        }
        if (a2 != null) {
            try {
                return Long.parseLong(a2.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
                p.a("Utility", "getSdkVersionCode error ", e2);
                return -1L;
            }
        }
        p.a("Utility", "getSdkVersionCode sdk version is null");
        return -1L;
    }

    public static String b(Context context, String str) {
        Object a2 = a(context, str, "com.vivo.push.app_id");
        if (a2 != null) {
            return a2.toString();
        }
        Object a3 = a(context, str, "app_id");
        return a3 != null ? a3.toString() : "";
    }

    public static String c(Context context, String str) {
        Object a2 = a(context, str, "verification_status");
        return a2 != null ? a2.toString() : "";
    }

    public static Object a(Context context, String str, String str2) {
        Object obj;
        Bundle bundle;
        if (context == null || str2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Object obj2 = (g == null || g.size() <= 0 || (bundle = g.get(str)) == null) ? null : bundle.get(str2);
            if (obj2 != null) {
                return obj2;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                r0 = applicationInfo != null ? applicationInfo.metaData : null;
                obj = r0 != null ? r0.get(str2) : obj2;
            } catch (Exception e2) {
                e = e2;
                r0 = obj2;
            }
            try {
                if (g.size() <= 300) {
                    g.put(str, r0);
                    return obj;
                }
                return obj;
            } catch (Exception e3) {
                r0 = obj;
                e = e3;
                p.a("Utility", "getMetaValue::".concat(String.valueOf(e)));
                return r0;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static Object a(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
        r8 = r8 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19) throws com.vivo.push.util.VivoPushException {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.z.c(android.content.Context):void");
    }

    private static void d(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
            if (serviceInfoArr == null) {
                throw new VivoPushException("serviceInfos is null");
            }
            for (String str2 : d) {
                a(str2, serviceInfoArr, str);
            }
        } catch (Exception e2) {
            throw new VivoPushException("error " + e2.getMessage());
        }
    }

    private static void e(Context context, String str) throws VivoPushException {
        if (f.length <= 0) {
            return;
        }
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            if (activityInfoArr == null) {
                throw new VivoPushException("activityInfos is null");
            }
            for (String str2 : f) {
                a(str2, activityInfoArr, str);
            }
        } catch (Exception e2) {
            throw new VivoPushException("error " + e2.getMessage());
        }
    }

    private static void a(String str, ComponentInfo[] componentInfoArr, String str2) throws VivoPushException {
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (str.equals(componentInfo.name)) {
                if (!componentInfo.enabled) {
                    throw new VivoPushException(componentInfo.name + " module Push-SDK need is illegitmacy !");
                }
                a(componentInfo, str2);
                return;
            }
        }
        throw new VivoPushException(str + " module Push-SDK need is not exist");
    }

    private static void a(ComponentInfo componentInfo, String str) throws VivoPushException {
        if (componentInfo.applicationInfo.packageName.equals(str)) {
            return;
        }
        for (String str2 : a) {
            if (str2.equals(componentInfo.name) && !componentInfo.processName.contains(":pushservice")) {
                throw new VivoPushException("module : " + componentInfo.name + " process :" + componentInfo.processName + "  check process fail");
            }
        }
    }

    private static void f(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 2).receivers;
            if (activityInfoArr == null) {
                throw new VivoPushException("receivers is null");
            }
            for (String str2 : e) {
                a(str2, activityInfoArr, str);
            }
        } catch (Exception e2) {
            throw new VivoPushException(e2.getMessage());
        }
    }

    private static void a(Context context, String str, String str2, boolean z) throws VivoPushException {
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            if (z) {
                List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 576);
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                    throw new VivoPushException("checkModule " + intent + " has no receivers");
                }
                for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                    if (str2.equals(resolveInfo.activityInfo.name)) {
                        return;
                    }
                }
                throw new VivoPushException(str2 + " is missing");
            }
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
            if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                throw new VivoPushException("checkModule " + intent + " has no services");
            }
            for (ResolveInfo resolveInfo2 : queryIntentServices) {
                if (str2.equals(resolveInfo2.serviceInfo.name)) {
                    if (resolveInfo2.serviceInfo.exported) {
                        return;
                    }
                    throw new VivoPushException(resolveInfo2.serviceInfo.name + " exported is false");
                }
            }
            throw new VivoPushException(str2 + " is missing");
        } catch (Exception e2) {
            p.a("Utility", "error  " + e2.getMessage());
            throw new VivoPushException("checkModule error" + e2.getMessage());
        }
    }

    public static String b(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    public static PublicKey d(Context context) {
        Cursor query = context.getContentResolver().query(com.vivo.push.p.a, null, null, null, null);
        if (query == null) {
            return null;
        }
        do {
            try {
                try {
                    if (query.moveToNext()) {
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                try {
                    query.close();
                } catch (Exception unused) {
                    return null;
                }
            } catch (Throwable th) {
                try {
                    query.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } while (!"pushkey".equals(query.getString(query.getColumnIndex("name"))));
        String string = query.getString(query.getColumnIndex("value"));
        p.d("Utility", "result key : ".concat(String.valueOf(string)));
        PublicKey a2 = u.a(string);
        try {
            query.close();
        } catch (Exception unused3) {
        }
        return a2;
    }

    public static void a(Context context, Intent intent) {
        String b2 = t.b(context);
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "client_pkgname");
        if (TextUtils.isEmpty(b2)) {
            p.a("Utility", "illegality abe adapter : push pkg is null");
        } else if (TextUtils.isEmpty(a2)) {
            p.a("Utility", "illegality abe adapter : src pkg is null");
        } else if (b2.equals(context.getPackageName())) {
            p.a("Utility", "illegality abe adapter : abe is not pushservice");
        } else if (!b2.equals(a2)) {
            p.d("Utility", "proxy to core : intent pkg : " + intent.getPackage() + " ; src pkg : " + a2 + " ; push pkg : " + b2);
            intent.setPackage(b2);
            intent.setClassName(b2, "com.vivo.push.sdk.service.PushService");
            context.startService(intent);
        } else {
            p.a("Utility", "illegality abe adapter : pushPkg = " + b2 + " ; srcPkg = " + a2);
        }
    }

    public static boolean e(Context context) {
        Cursor cursor = null;
        try {
            try {
                try {
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e3) {
            p.a("Utility", "close", e3);
        }
        if (context == null) {
            p.a("Utility", MonitorManager.CONTEXT_IS_NULL_MSG);
            return false;
        }
        String packageName = context.getPackageName();
        Cursor query = context.getContentResolver().query(com.vivo.push.p.b, null, "pushVersion = ? and appPkgName = ? and appCode = ? ", new String[]{"323", packageName, String.valueOf(context.getPackageManager().getPackageInfo(packageName, 0).versionCode)}, null);
        try {
        } catch (Exception e4) {
            e = e4;
            cursor = query;
            p.a("Utility", "isSupport", e);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            cursor = query;
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e5) {
                    p.a("Utility", "close", e5);
                }
            }
            throw th;
        }
        if (query == null) {
            p.a("Utility", "cursor is null");
            if (query != null) {
                try {
                    query.close();
                } catch (Exception e6) {
                    p.a("Utility", "close", e6);
                }
            }
            return false;
        } else if (!query.moveToFirst() || (query.getInt(query.getColumnIndex("permission")) & 1) == 0) {
            if (query != null) {
                query.close();
            }
            return false;
        } else {
            if (query != null) {
                try {
                    query.close();
                } catch (Exception e7) {
                    p.a("Utility", "close", e7);
                }
            }
            return true;
        }
    }

    public static boolean b(Context context, String str, String str2) {
        Cursor cursor = null;
        try {
            try {
                try {
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e3) {
            p.a("Utility", "close", e3);
        }
        if (context == null) {
            p.a("Utility", MonitorManager.CONTEXT_IS_NULL_MSG);
            return false;
        }
        Cursor query = context.getContentResolver().query(com.vivo.push.p.c, null, "appPkgName = ? and regId = ? sdkVersion = ? ", new String[]{str, str2, "323"}, null);
        try {
        } catch (Exception e4) {
            cursor = query;
            e = e4;
            p.a("Utility", "isOverdue", e);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th2) {
            cursor = query;
            th = th2;
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e5) {
                    p.a("Utility", "close", e5);
                }
            }
            throw th;
        }
        if (query == null) {
            p.a("Utility", "cursor is null");
            if (query != null) {
                try {
                    query.close();
                } catch (Exception e6) {
                    p.a("Utility", "close", e6);
                }
            }
            return false;
        } else if (!query.moveToFirst()) {
            if (query != null) {
                query.close();
            }
            return false;
        } else {
            boolean parseBoolean = Boolean.parseBoolean(query.getString(query.getColumnIndex("clientState")));
            if (query != null) {
                try {
                    query.close();
                } catch (Exception e7) {
                    p.a("Utility", "close", e7);
                }
            }
            return parseBoolean;
        }
    }
}
