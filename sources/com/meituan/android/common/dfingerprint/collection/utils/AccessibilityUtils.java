package com.meituan.android.common.dfingerprint.collection.utils;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public class AccessibilityUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static List<String> mWhiteList;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        mWhiteList = copyOnWriteArrayList;
        copyOnWriteArrayList.add("com.google.android.marvin.talkback");
    }

    private static boolean can_interfere_me(AccessibilityServiceInfo accessibilityServiceInfo, String str) {
        if (accessibilityServiceInfo == null || str == null || str.isEmpty()) {
            return false;
        }
        if ((Build.VERSION.SDK_INT >= 24 && (accessibilityServiceInfo.getCapabilities() & 32) != 0) || accessibilityServiceInfo.packageNames == null || accessibilityServiceInfo.packageNames.length == 0) {
            return true;
        }
        for (String str2 : accessibilityServiceInfo.packageNames) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String getAccessibilityInfos(Context context) {
        List<AccessibilityServiceInfo> list;
        ResolveInfo resolveInfo;
        ServiceInfo serviceInfo;
        String str;
        int i;
        CharSequence loadSummary;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ff5b965c5ddfa50654533312490f6c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ff5b965c5ddfa50654533312490f6c3");
        }
        if (context == null) {
            return null;
        }
        try {
            List<AccessibilityServiceInfo> list2 = get_danger_service(context);
            if (list2 != null && !list2.isEmpty() && (list = get_enable_service(context)) != null && !list.isEmpty()) {
                JsonArray jsonArray = new JsonArray();
                for (AccessibilityServiceInfo accessibilityServiceInfo : list2) {
                    if (accessibilityServiceInfo != null && (resolveInfo = accessibilityServiceInfo.getResolveInfo()) != null && (serviceInfo = resolveInfo.serviceInfo) != null) {
                        JsonObject jsonObject = new JsonObject();
                        String str2 = serviceInfo.packageName;
                        String str3 = serviceInfo.name;
                        String loadDescription = accessibilityServiceInfo.loadDescription(context.getPackageManager());
                        JsonArray jsonArray2 = new JsonArray();
                        if (Build.VERSION.SDK_INT >= 18) {
                            for (int capabilities = accessibilityServiceInfo.getCapabilities(); capabilities != 0; capabilities &= ~capabilities) {
                                jsonArray2.add(AccessibilityServiceInfo.capabilityToString(1 << Integer.numberOfTrailingZeros(capabilities)));
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26 && (loadSummary = accessibilityServiceInfo.loadSummary(context.getPackageManager())) != null) {
                            jsonObject.addProperty("acc_sum", loadSummary.toString());
                        }
                        jsonObject.addProperty("acc_pkg", str2);
                        jsonObject.addProperty("acc_name", str3);
                        jsonObject.addProperty("acc_des", loadDescription);
                        jsonObject.add("acc_caps", jsonArray2);
                        if (!list.isEmpty()) {
                            if (list.contains(accessibilityServiceInfo)) {
                                str = "acc_enable";
                                i = 1;
                            } else {
                                str = "acc_enable";
                                i = 0;
                            }
                            jsonObject.addProperty(str, i);
                        }
                        jsonArray.add(jsonObject);
                    }
                }
                return jsonArray.toString();
            }
            return null;
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return DFPConfigs.JAVA_EXCEPTION;
        }
    }

    private static List<AccessibilityServiceInfo> get_danger_service(Context context) {
        AccessibilityManager accessibilityManager;
        ArrayList arrayList = null;
        if (context == null || !isEnable(context) || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null) {
            return null;
        }
        List<AccessibilityServiceInfo> installedAccessibilityServiceList = accessibilityManager.getInstalledAccessibilityServiceList();
        if (installedAccessibilityServiceList != null && !installedAccessibilityServiceList.isEmpty()) {
            arrayList = new ArrayList();
            for (AccessibilityServiceInfo accessibilityServiceInfo : installedAccessibilityServiceList) {
                if (can_interfere_me(accessibilityServiceInfo, context.getPackageName()) && have_danger_capability(accessibilityServiceInfo) && !inWhiteList(accessibilityServiceInfo)) {
                    arrayList.add(accessibilityServiceInfo);
                }
            }
        }
        return arrayList;
    }

    private static List<AccessibilityServiceInfo> get_enable_service(Context context) {
        AccessibilityManager accessibilityManager;
        if (context == null || !isEnable(context) || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null) {
            return null;
        }
        return accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private static boolean have_danger_capability(AccessibilityServiceInfo accessibilityServiceInfo) {
        if (accessibilityServiceInfo == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            int capabilities = accessibilityServiceInfo.getCapabilities();
            if (Build.VERSION.SDK_INT >= 24) {
                return ((capabilities & 32) == 0 && (capabilities & 1) == 0 && (capabilities & 2) == 0) ? false : true;
            } else if ((capabilities & 1) == 0 && (capabilities & 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean inWhiteList(AccessibilityServiceInfo accessibilityServiceInfo) {
        Object[] objArr = {accessibilityServiceInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60fe71f77198d6d8c79bf3e5cdd6a25a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60fe71f77198d6d8c79bf3e5cdd6a25a")).booleanValue();
        }
        if (accessibilityServiceInfo == null || mWhiteList == null || mWhiteList.isEmpty()) {
            return false;
        }
        return mWhiteList.contains(accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName);
    }

    public static synchronized boolean isAccessibilityEnable(Context context) {
        synchronized (AccessibilityUtils.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4b588de91c9af0894d81060cd08dd56", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4b588de91c9af0894d81060cd08dd56")).booleanValue();
            } else if (context == null) {
                return false;
            } else {
                List<AccessibilityServiceInfo> list = get_enable_service(context);
                return (list == null || list.isEmpty()) ? false : true;
            }
        }
    }

    private static boolean isEnable(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85561907aa7dc0f6d3d84c12f3a8f993", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85561907aa7dc0f6d3d84c12f3a8f993")).booleanValue() : Settings.Secure.getInt(context.getApplicationContext().getContentResolver(), "accessibility_enabled") == 1;
    }
}
