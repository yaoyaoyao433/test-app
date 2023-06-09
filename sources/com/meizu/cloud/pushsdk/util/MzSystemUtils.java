package com.meizu.cloud.pushsdk.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.meituan.robust.common.StringUtil;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.b.i;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.unionpay.tsmservice.mi.data.Constant;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* loaded from: classes3.dex */
public class MzSystemUtils {
    private static final String PUSH_SERVICE_PROCESS_NAME = "mzservice_v1";
    private static final String TAG = "MzSystemUtils";
    private static int flymeVersion = -1;
    private static String sBssId = null;
    private static boolean sExistAllergySystemUtils = true;
    private static String sMacAddress;
    private static String sSimOperator;
    private static List<String> sWifiList;

    public static boolean compareVersion(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i = split[i2].length() - split2[i2].length();
            if (i != 0 || (i = split[i2].compareTo(split2[i2])) != 0) {
                break;
            }
        }
        if (i == 0) {
            i = split.length - split2.length;
        }
        return i >= 0;
    }

    public static boolean compatApi(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    public static String findReceiver(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent = new Intent(str);
                intent.setPackage(str2);
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                    return queryBroadcastReceivers.get(0).activityInfo.name;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static int getAppVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getAppVersionName(Context context, String str) {
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            return str2 != null ? str2.length() <= 0 ? "" : str2 : "";
        } catch (Exception e) {
            DebugLogger.e(TAG, "Exception message " + e.getMessage());
            return "";
        }
    }

    public static String getBssId(Context context) {
        if (sBssId != null) {
            return sBssId;
        }
        if (sExistAllergySystemUtils) {
            try {
                sBssId = (String) Class.forName("com.meizu.cloud.pushsdk.util.AllergySystemUtils").getDeclaredMethod("getBssId", Context.class).invoke(null, context);
            } catch (Exception e) {
                sExistAllergySystemUtils = false;
                DebugLogger.e(TAG, "getBssId error " + e.getMessage());
            }
            return sBssId;
        }
        return null;
    }

    public static String getCurrentLanguage() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e) {
            DebugLogger.e(TAG, "getCurrentLanguage error " + e.getMessage());
            return null;
        }
    }

    public static String getDocumentsPath(Context context) {
        File externalFilesDir = context.getExternalFilesDir(Build.VERSION.SDK_INT >= 19 ? Environment.DIRECTORY_DOCUMENTS : "Documents");
        if (externalFilesDir != null) {
            return externalFilesDir.getPath();
        }
        return "/storage/emulated/0/Android/data/" + context.getPackageName() + "/files/Documents";
    }

    public static int getFlymeVersion() {
        if (flymeVersion > 0) {
            return flymeVersion;
        }
        try {
            int intValue = Integer.valueOf(i.a("ro.flyme.version.id").replace("Flyme", "").replace(StringUtil.SPACE, "").substring(0, 1)).intValue();
            flymeVersion = intValue;
            return intValue;
        } catch (Exception e) {
            DebugLogger.e(TAG, "getFlymeVersion error " + e.getMessage());
            return -1;
        }
    }

    public static String getMacAddress(Context context) {
        if (TextUtils.isEmpty(sMacAddress)) {
            if (sExistAllergySystemUtils) {
                try {
                    sMacAddress = (String) Class.forName("com.meizu.cloud.pushsdk.util.AllergySystemUtils").getDeclaredMethod("getMacAddress", Context.class).invoke(null, context);
                } catch (Exception e) {
                    sExistAllergySystemUtils = false;
                    DebugLogger.e(TAG, "getMacAddress error " + e.getMessage());
                }
                return sMacAddress;
            }
            return null;
        }
        return sMacAddress;
    }

    public static String getMzPushServicePackageName(Context context) {
        String packageName = context.getPackageName();
        try {
            String str = isWatch() ? PushConstants.WEARABLE_PUSH_PACKAGE_NAME : PushConstants.PUSH_PACKAGE_NAME;
            String servicesByPackageName = getServicesByPackageName(context, str);
            if (!TextUtils.isEmpty(servicesByPackageName)) {
                if (servicesByPackageName.contains(PUSH_SERVICE_PROCESS_NAME)) {
                    return str;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DebugLogger.i(TAG, "start service package name " + packageName);
        return packageName;
    }

    public static String getNetWorkType(Context context) {
        String str = "";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type != 7) {
                    if (type != 9) {
                        switch (type) {
                            case 0:
                                int subtype = activeNetworkInfo.getSubtype();
                                if (subtype != 18) {
                                    if (subtype != 20) {
                                        switch (subtype) {
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                                str = "OTHER";
                                                break;
                                        }
                                    } else {
                                        return "MOBILE_5G";
                                    }
                                }
                                str = "OTHER";
                                break;
                            case 1:
                                return "WIFI";
                            default:
                                str = "OTHER";
                                break;
                        }
                    } else {
                        return "ETHERNET";
                    }
                } else {
                    return "BLUETOOTH";
                }
            }
        } catch (Exception e) {
            DebugLogger.e(TAG, "Security exception checking connection: " + e.getMessage());
        }
        return str;
    }

    public static String getOperator(Context context) {
        if (sSimOperator != null) {
            return sSimOperator;
        }
        if (sExistAllergySystemUtils) {
            try {
                sSimOperator = (String) Class.forName("com.meizu.cloud.pushsdk.util.AllergySystemUtils").getDeclaredMethod("getOperator", Context.class).invoke(null, context);
            } catch (Exception e) {
                sExistAllergySystemUtils = false;
                DebugLogger.e(TAG, "getOperator error " + e.getMessage());
            }
            return sSimOperator;
        }
        return null;
    }

    public static String getProcessName(Context context) {
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager == null) {
                return null;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                DebugLogger.i(TAG, "processName " + runningAppProcessInfo.processName);
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Exception e) {
            DebugLogger.e(TAG, "getProcessName error " + e.getMessage());
            return null;
        }
    }

    private static String getServicesByPackageName(Context context, String str) {
        ServiceInfo[] serviceInfoArr;
        try {
            serviceInfoArr = context.getPackageManager().getPackageInfo(str, 4).services;
        } catch (Exception unused) {
            serviceInfoArr = null;
        }
        if (serviceInfoArr == null) {
            return null;
        }
        for (ServiceInfo serviceInfo : serviceInfoArr) {
            if (PushConstants.MZ_PUSH_SERVICE_NAME.equals(serviceInfo.name)) {
                return serviceInfo.processName;
            }
        }
        return null;
    }

    public static List<String> getWifiList(Context context) {
        if (sWifiList != null) {
            return sWifiList;
        }
        if (sExistAllergySystemUtils) {
            try {
                sWifiList = (List) Class.forName("com.meizu.cloud.pushsdk.util.AllergySystemUtils").getDeclaredMethod("getWifiList", Context.class).invoke(null, context);
            } catch (Exception e) {
                sExistAllergySystemUtils = false;
                DebugLogger.e(TAG, "getWifiList error " + e.getMessage());
            }
            return sWifiList;
        }
        return null;
    }

    public static boolean isApplicationDebug(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isBrandMeizu(Context context) {
        boolean z = !TextUtils.isEmpty(i.a("ro.meizu.product.model")) || "meizu".equalsIgnoreCase(Build.BRAND) || "22c4185e".equalsIgnoreCase(Build.BRAND);
        if (!z) {
            com.meizu.cloud.pushsdk.a.a.b(context.getApplicationContext());
        }
        return z;
    }

    public static boolean isExistReceiver(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0 || TextUtils.isEmpty(queryBroadcastReceivers.get(0).activityInfo.name)) ? false : true;
    }

    public static boolean isHuaWei() {
        String a = i.a("ro.build.version.emui");
        DebugLogger.e(TAG, "huawei eui " + a);
        return !TextUtils.isEmpty(a);
    }

    public static boolean isIndiaLocal() {
        return "india".equals(i.a("ro.meizu.locale.region"));
    }

    public static boolean isInteractive(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        try {
            return Build.VERSION.SDK_INT >= 20 ? powerManager.isInteractive() : powerManager.isScreenOn();
        } catch (Exception e) {
            DebugLogger.e(TAG, "isScreenOn error " + e.getMessage());
            return true;
        }
    }

    public static boolean isInternational() {
        if (com.meizu.cloud.pushsdk.b.a.a().a) {
            return com.meizu.cloud.pushsdk.b.a.a().b.booleanValue();
        }
        return false;
    }

    public static boolean isMeizu(Context context) {
        return isBrandMeizu(context);
    }

    public static boolean isOverseas() {
        return isInternational() || isIndiaLocal();
    }

    public static boolean isPackageInstalled(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isRunningProcess(Context context, String str) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            boolean z = false;
            if (activityManager == null) {
                return false;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
            while (it.hasNext() && !(z = it.next().processName.contains(str))) {
            }
            DebugLogger.i(TAG, str + " is running " + z);
            return z;
        } catch (Exception unused) {
            DebugLogger.e(TAG, "can not get running process info so set running true");
            return true;
        }
    }

    public static boolean isWatch() {
        String a = i.a("ro.build.characteristics");
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        return a.contains("watch");
    }

    public static boolean isXiaoMi() {
        return Constant.DEVICE_XIAOMI.equals(Build.MODEL) || Constant.DEVICE_XIAOMI.equals(Build.MANUFACTURER);
    }

    public static void sendMessageFromBroadcast(Context context, Intent intent, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            intent.setAction(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        String findReceiver = findReceiver(context, str, str2);
        if (!TextUtils.isEmpty(findReceiver)) {
            intent.setClassName(str2, findReceiver);
        }
        com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent);
    }

    public static boolean isMeizuAndFlyme() {
        com.meizu.cloud.pushsdk.b.b.d a = com.meizu.cloud.pushsdk.b.b.a.a("android.os.BuildExt").a("isFlymeRom", new Class[0]).a(new Object[0]);
        return a.a && !((Boolean) a.b).booleanValue();
    }
}
