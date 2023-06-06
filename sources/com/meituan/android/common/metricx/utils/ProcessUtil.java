package com.meituan.android.common.metricx.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ProcessUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int getThreadCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "582177cce19e159ede6a9fd3a76a242d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "582177cce19e159ede6a9fd3a76a242d")).intValue() : getThreadCount(Process.myPid());
    }

    public static int getFdCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "59eaad300992d2c8768ccb8a5f8e5a04", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "59eaad300992d2c8768ccb8a5f8e5a04")).intValue() : getFdCount(Process.myPid());
    }

    public static int getThreadCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "773f807237d044d7881b8c713a29ec81", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "773f807237d044d7881b8c713a29ec81")).intValue() : getThreadCountFromFile(i);
    }

    public static int getFdCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "756bbe3da2684cfdfbc01f04a97ad06a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "756bbe3da2684cfdfbc01f04a97ad06a")).intValue();
        }
        try {
            File[] listFiles = new File("/proc/" + i + "/fd").listFiles(new FilenameFilter() { // from class: com.meituan.android.common.metricx.utils.ProcessUtil.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    Object[] objArr2 = {file, str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "76a6b0f05c9ca6c4793f0e781ff13ead", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "76a6b0f05c9ca6c4793f0e781ff13ead")).booleanValue() : TextUtils.isDigitsOnly(str);
                }
            });
            if (listFiles == null) {
                return 0;
            }
            return listFiles.length;
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static int getThreadCountFromFile(int i) {
        File[] listFiles;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cbd2f26be6ad70ed47a0eafb1f192eae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cbd2f26be6ad70ed47a0eafb1f192eae")).intValue();
        }
        File file = new File("/proc/" + i + "/task");
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles(new FilenameFilter() { // from class: com.meituan.android.common.metricx.utils.ProcessUtil.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                Object[] objArr2 = {file2, str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c7038451598d464860c361fdf0e6f2b2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c7038451598d464860c361fdf0e6f2b2")).booleanValue() : TextUtils.isDigitsOnly(str);
            }
        })) == null || listFiles.length == 0) {
            return 0;
        }
        return listFiles.length;
    }

    public static boolean isAllProcessBg(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db152f4f3dca7eefc30c45f16c2b22b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db152f4f3dca7eefc30c45f16c2b22b5")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 22 && context != null) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager == null) {
                return true;
            }
            try {
                list = activityManager.getRunningAppProcesses();
            } catch (Throwable th) {
                th.printStackTrace();
                list = null;
            }
            if (list == null) {
                return true;
            }
            boolean z = false;
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                Logger.getBatteryMonitorLogger().d("processName: " + runningAppProcessInfo.processName + "importance    " + runningAppProcessInfo.importance);
                if (runningAppProcessInfo.importance > 100) {
                    Logger.getBatteryMonitorLogger().d("BgCpuTimeMonitor: " + runningAppProcessInfo.processName + "   处于后台");
                    z = true;
                } else {
                    Logger.getBatteryMonitorLogger().d("BgCpuTimeMonitor: " + runningAppProcessInfo.processName + "   处于前台");
                    return false;
                }
            }
            return z;
        }
        return false;
    }
}
