package com.meituan.android.common.unionid.oneid.appid;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.cache.OneIdStorage;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AppIdHandler {
    private static final String SEPARATOR = "$";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static synchronized String[] getAppId(Context context) {
        synchronized (AppIdHandler.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74f0b12876d21f868299b441d0820b64", RobustBitConfig.DEFAULT_VALUE)) {
                return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74f0b12876d21f868299b441d0820b64");
            }
            return getAppId(context, null);
        }
    }

    public static synchronized String[] getAppId(Context context, StatUtil statUtil) {
        synchronized (AppIdHandler.class) {
            Object[] objArr = {context, statUtil};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b49ac1be97629eb115a803e6b0d0108f", RobustBitConfig.DEFAULT_VALUE)) {
                return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b49ac1be97629eb115a803e6b0d0108f");
            }
            StringBuilder sb = new StringBuilder("start get appid thread=");
            sb.append(Thread.currentThread().getName());
            sb.append(", process=");
            sb.append(Process.myPid());
            MonitorManager.addEvent(DeviceInfo.APP_ID_LOCAL, 0, true, (JSONObject) null);
            String str = "";
            try {
                str = getSharedAppId(context, statUtil);
            } catch (Exception unused) {
            }
            String localAppId = getLocalAppId(context);
            if (statUtil != null) {
                if (!TextUtils.isEmpty(localAppId)) {
                    statUtil.markStat(DeviceInfo.APP_ID_LOCAL, 130);
                } else {
                    statUtil.markStat(DeviceInfo.APP_ID_LOCAL, 9);
                }
            }
            new StringBuilder("get appid from local (sp) ").append(localAppId);
            if (checkHardware(context, str, localAppId)) {
                String newAppId = newAppId(context);
                if (statUtil != null) {
                    statUtil.markStat(DeviceInfo.APP_ID_LOCAL, 135, MonitorManager.getAppIdMsg(newAppId, localAppId, str, true));
                }
                return new String[]{newAppId, localAppId, str};
            } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(localAppId)) {
                String newAppId2 = newAppId(context);
                if (statUtil != null) {
                    statUtil.markStat(DeviceInfo.APP_ID_LOCAL, 135, MonitorManager.getAppIdMsg(newAppId2, localAppId, str, false));
                }
                return new String[]{newAppId2, "", ""};
            } else if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(localAppId)) {
                setSharedAppId(localAppId);
                MonitorManager.addEvent(DeviceInfo.APP_ID_LOCAL, 0, false, MonitorManager.getAppIdMsg("", localAppId, ""));
                return new String[]{"", localAppId, ""};
            } else if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(localAppId)) {
                setLocalAppId(context, str);
                MonitorManager.addEvent(DeviceInfo.APP_ID_LOCAL, 0, false, MonitorManager.getAppIdMsg("", "", str));
                return new String[]{"", "", str};
            } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(localAppId)) {
                MonitorManager.addEvent(DeviceInfo.APP_ID_LOCAL, 0, false, MonitorManager.getAppIdMsg("", localAppId, str));
                return new String[]{"", localAppId, str};
            } else {
                if (statUtil != null) {
                    statUtil.markStat(DeviceInfo.APP_ID_LOCAL, 12);
                }
                return new String[]{"", "", ""};
            }
        }
    }

    private static boolean checkHardware(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40a6b7ebf1d0d7e284a4e3bc92ecbc0e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40a6b7ebf1d0d7e284a4e3bc92ecbc0e")).booleanValue();
        }
        String brand = AppUtil.getBrand(context);
        String deviceModel = AppUtil.getDeviceModel(context);
        String replaceAll = (brand + deviceModel).replaceAll("\\s*", "");
        return (replaceAll.equals(TextUtils.isEmpty(str) ? "" : str.split("\\$")[0]) || replaceAll.equals(TextUtils.isEmpty(str2) ? "" : str2.split("\\$")[0])) ? false : true;
    }

    private static String newAppId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e05cb5aac0008a8ba420e9104514c2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e05cb5aac0008a8ba420e9104514c2e");
        }
        String generateAppId = generateAppId(context);
        setLocalAppId(context, generateAppId);
        setSharedAppId(generateAppId);
        return generateAppId;
    }

    private static String generateAppId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a7a157308c6aa6adb8c65f84dda50931", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a7a157308c6aa6adb8c65f84dda50931");
        }
        String brand = AppUtil.getBrand(context);
        String deviceModel = AppUtil.getDeviceModel(context);
        String androidId = AppUtil.getAndroidId(context);
        if (TextUtils.isEmpty(androidId)) {
            androidId = generateFakeAndroidId();
        }
        return (brand + deviceModel + "$" + androidId).replaceAll("\\s*", "");
    }

    private static String getLocalAppId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "957558b0ce673c1b952758b45665d572", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "957558b0ce673c1b952758b45665d572") : OneIdSharePref.getInstance(context).getLocalAppid();
    }

    private static void setLocalAppId(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3dadf3a713e1c78cf87ee04bc24e9850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3dadf3a713e1c78cf87ee04bc24e9850");
        } else {
            OneIdSharePref.getInstance(context).setLocalAppid(str);
        }
    }

    private static String getSharedAppId(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d5756beee7b8332092fa988d8669e05c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d5756beee7b8332092fa988d8669e05c") : readSharedAppId(context, statUtil);
    }

    private static void setSharedAppId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e859988adaaef7447feae1ade6f6dea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e859988adaaef7447feae1ade6f6dea");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                OneIdStorage.saveAppIdToSdcard(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String readSharedAppId(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f366c28d04483a0ce3bfe169a98b764", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f366c28d04483a0ce3bfe169a98b764");
        }
        long currentTimeMillis = System.currentTimeMillis();
        String appIdBySdcard = OneIdStorage.getAppIdBySdcard(context, statUtil);
        new StringBuilder("get appid sdcard cost =").append(System.currentTimeMillis() - currentTimeMillis);
        new StringBuilder("get app id from sdcard").append(appIdBySdcard);
        if (!TextUtils.isEmpty(appIdBySdcard)) {
            if (statUtil != null) {
                statUtil.markStat(DeviceInfo.APP_ID_SHARE, 131);
            }
            return appIdBySdcard;
        } else if (!TextUtils.isEmpty(appIdBySdcard)) {
            if (statUtil != null) {
                statUtil.markStat(DeviceInfo.APP_ID_SHARE, 132);
            }
            return appIdBySdcard;
        } else {
            if (statUtil != null && !statUtil.hasMark(DeviceInfo.APP_ID_SHARE)) {
                statUtil.markStat(DeviceInfo.APP_ID_SHARE, 9);
            }
            return null;
        }
    }

    private static String generateFakeAndroidId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4ff9bea70af1e92788393f01e0345fb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4ff9bea70af1e92788393f01e0345fb") : UUID.randomUUID().toString();
    }
}
