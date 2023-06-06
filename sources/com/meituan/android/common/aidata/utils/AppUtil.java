package com.meituan.android.common.aidata.utils;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AppUtil {
    public static final int APP_ID_DP = 1;
    public static final int APP_ID_MT = 10;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String mAppName;
    private static Boolean sDevToolIntegrated;
    private static volatile String sVersionName;
    private static String systemModel;
    private static String systemVersion;
    private static final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    public static int curAppId = -1;
    private static String curEnv = "";
    private static String oldEnv = "";

    public static String getIPAddress() {
        return null;
    }

    @NonNull
    public static String getVersionName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee2c45b55222bf1e2f5c676deb6528e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee2c45b55222bf1e2f5c676deb6528e8");
        }
        if (TextUtils.isEmpty(sVersionName)) {
            sVersionName = getVersionName(AIData.getContext());
        }
        return sVersionName != null ? sVersionName : "";
    }

    @NonNull
    public static String getVersionName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "52751fdf423099d8209d7bed89568b34", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "52751fdf423099d8209d7bed89568b34");
        }
        if (TextUtils.isEmpty(sVersionName)) {
            if (context == null) {
                return "";
            }
            try {
                sVersionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
            } catch (Throwable th) {
                new StringBuilder("AppUtil - getVersionName:").append(th.getMessage());
            }
            return sVersionName == null ? "" : sVersionName;
        }
        return sVersionName;
    }

    public static String getVersionCode(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a85c94041fa0e7b60db26866a9ce34f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a85c94041fa0e7b60db26866a9ce34f5");
        }
        if (context == null) {
            return "";
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
        } catch (Exception e) {
            new StringBuilder("AppUtil - getVersionCode:").append(e.getMessage());
            return "0";
        }
    }

    public static String getApplicationName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4cb785e1afcfcf8abbe064b4e95f0cfa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4cb785e1afcfcf8abbe064b4e95f0cfa");
        }
        if (TextUtils.isEmpty(mAppName)) {
            if (context == null) {
                return "";
            }
            try {
                mAppName = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("APP_NAME");
                return mAppName == null ? "" : mAppName;
            } catch (Exception e) {
                new StringBuilder("AppUtil - getApplicationName:").append(e.getMessage());
                return "";
            }
        }
        return mAppName;
    }

    public static String getSystemVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa84d17f4537d40da851e0b006e8f3b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa84d17f4537d40da851e0b006e8f3b2");
        }
        if (!TextUtils.isEmpty(systemVersion)) {
            return systemVersion;
        }
        String str = Build.VERSION.RELEASE;
        systemVersion = str;
        return str;
    }

    public static String getSystemModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b96cb67aacd382ffff88290e531feae7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b96cb67aacd382ffff88290e531feae7");
        }
        if (!TextUtils.isEmpty(systemModel)) {
            return systemModel;
        }
        String str = Build.MODEL;
        systemModel = str;
        return str;
    }

    public static String getTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d2c25bed98ab6cdc59d1b601a388386", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d2c25bed98ab6cdc59d1b601a388386") : j > 0 ? sf.format(new Date(j)) : "";
    }

    public static long getTodayZero() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ebee924e04b5fd7361a9fdd8e2cedb77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ebee924e04b5fd7361a9fdd8e2cedb77")).longValue();
        }
        Date date = new Date();
        return (date.getTime() - (date.getTime() % 86400000)) - 28800000;
    }

    public static Map<String, Object> jsonStrToMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6450f43fefd8abf1fd344430d3d44b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6450f43fefd8abf1fd344430d3d44b9");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return jsonObjectToMap(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map<String, Object> jsonObjectToMap(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2797c4a5375842a3b5a53c867d9c7cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2797c4a5375842a3b5a53c867d9c7cb");
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
        }
        return hashMap;
    }

    public static String generatePageInfoKey(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f442f19a1fd1d4d4335de19fb95be287", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f442f19a1fd1d4d4335de19fb95be287");
        }
        if (obj == null) {
            return "";
        }
        return obj.getClass().getName() + obj.hashCode();
    }

    public static boolean checkOverdue(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4140f358cfab7d819e6f1cb8daafdf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4140f358cfab7d819e6f1cb8daafdf2")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        Date date = new Date(j);
        Date date2 = new Date(currentTimeMillis);
        calendar.setTime(date);
        int year = date.getYear();
        int month = date.getMonth();
        int i = calendar.get(6);
        calendar.setTime(date2);
        int year2 = date2.getYear();
        int month2 = date2.getMonth();
        int i2 = calendar.get(6);
        if (year2 > year) {
            return true;
        }
        if (year2 == year) {
            if (month2 > month) {
                return true;
            }
            if (month2 == month && i2 > i) {
                return true;
            }
        }
        return false;
    }

    public static boolean is30EventType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8d47bf6f43ea30107465220a0336eb8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8d47bf6f43ea30107465220a0336eb8")).booleanValue() : !TextUtils.isEmpty(str) && (EventName.MGE.toString().equalsIgnoreCase(str) || EventName.MPT.toString().equalsIgnoreCase(str) || EventName.REPORT.toString().equals(str) || Constants.EventType.PAY.equalsIgnoreCase(str) || "order".equalsIgnoreCase(str));
    }

    public static String getUniqueId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c7f03082dfbaabd6015381321781f2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c7f03082dfbaabd6015381321781f2b");
        }
        String uuid = UUID.randomUUID().toString();
        Random random = new Random();
        return uuid + System.currentTimeMillis() + random.nextInt(1000);
    }

    public static void setDebugEnv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc9981b5912d70df9df70b2183c3825a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc9981b5912d70df9df70b2183c3825a");
            return;
        }
        oldEnv = getEnv();
        curEnv = "debug";
    }

    public static void setEnv(String str) {
        curEnv = str;
    }

    public static String getEnv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4645bd3cf67be01b71fb1d2c9f4077d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4645bd3cf67be01b71fb1d2c9f4077d");
        }
        if (!TextUtils.isEmpty(curEnv)) {
            return curEnv;
        }
        if ("debug".equals("release")) {
            curEnv = "test";
            return "test";
        }
        return "prod";
    }

    public static void resetDebugEnv() {
        curEnv = oldEnv;
        oldEnv = "";
    }

    public static boolean isDPApp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8500ac3cf433df90a1b669f1444687dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8500ac3cf433df90a1b669f1444687dd")).booleanValue();
        }
        if (curAppId == -1 || curAppId == 1) {
            if (curAppId == 1) {
                return true;
            }
            int appID = NVLinker.getAppID();
            curAppId = appID;
            if (appID == 1) {
                return true;
            }
            String applicationName = getApplicationName(AIData.getContext());
            if (!TextUtils.isEmpty(applicationName) && applicationName.equalsIgnoreCase("dianping_nova")) {
                curAppId = 1;
                return true;
            }
            return false;
        }
        return false;
    }

    public static String getErrorContent(List<Exception> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea429a6f87a7aa587e9276a1dc582de9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea429a6f87a7aa587e9276a1dc582de9");
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Exception exc : list) {
            if (exc != null) {
                sb.append(exc.getMessage());
                sb.append(";\n");
            }
        }
        return sb.toString();
    }

    public static boolean isDevToolIntegrated() {
        Class<?> cls;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9dba74300bdf0b7e3ef3d90eb231ae4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9dba74300bdf0b7e3ef3d90eb231ae4")).booleanValue();
        }
        if (sDevToolIntegrated != null) {
            return sDevToolIntegrated.booleanValue();
        }
        try {
            cls = Class.forName("com.meituan.android.common.aidata.devtool.AIDataDebugger");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        Boolean valueOf = Boolean.valueOf(cls != null);
        sDevToolIntegrated = valueOf;
        return valueOf.booleanValue();
    }

    public static String getDeviceLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d6c2ae166f15a379456d01f1352b3af", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d6c2ae166f15a379456d01f1352b3af");
        }
        switch (DeviceUtil.getDeviceLevel(AIData.getContext())) {
            case BEST:
                return "BEST";
            case HIGH:
                return "HIGH";
            case MIDDLE:
                return "MIDDLE";
            case LOW:
                return "LOW";
            case BAD:
                return "BAD";
            case UN_KNOW:
                return "UN_KNOW";
            default:
                return "BLUE_UN_KNOW";
        }
    }
}
