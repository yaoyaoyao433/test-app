package com.sankuai.common.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.takeoutnew.util.aop.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ProcessUtils {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static String currentProcessName = null;
    private static int is64 = -1;
    private static int isMainProcess = -1;

    public static String getCurrentProcessName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "adce6468efa18abce256abb7f1475763", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "adce6468efa18abce256abb7f1475763") : getCurrentProcessName(null);
    }

    public static String getCurrentProcessName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ebb277a914935512d9799b4167ddff79", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ebb277a914935512d9799b4167ddff79");
        }
        if (!TextUtils.isEmpty(currentProcessName)) {
            return currentProcessName;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            currentProcessName = Application.getProcessName();
        }
        if (TextUtils.isEmpty(currentProcessName)) {
            currentProcessName = getCurrentProcessNameByReflect();
            if (context != null) {
                if (TextUtils.isEmpty(currentProcessName)) {
                    currentProcessName = getCurrentProcessNameByPid(context);
                } else {
                    return currentProcessName;
                }
            }
            if (TextUtils.isEmpty(currentProcessName)) {
                currentProcessName = getCurrentProcessNameByFile();
                return currentProcessName;
            }
            return currentProcessName;
        }
        return currentProcessName;
    }

    public static boolean isProcess(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5dddcffe0fd0245913a8b63dea7bc666", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5dddcffe0fd0245913a8b63dea7bc666")).booleanValue();
        }
        if (TextUtils.isEmpty(currentProcessName)) {
            currentProcessName = getCurrentProcessName(context);
        }
        if (TextUtils.isEmpty(currentProcessName)) {
            return false;
        }
        if (str.startsWith(CommonConstant.Symbol.COLON)) {
            return currentProcessName.toLowerCase().endsWith(str.toLowerCase());
        }
        return currentProcessName.equalsIgnoreCase(str);
    }

    public static boolean isMainProcess(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "befab4561f9cb3d36a8944158edacde1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "befab4561f9cb3d36a8944158edacde1")).booleanValue();
        }
        if (isMainProcess != -1) {
            return isMainProcess == 1;
        }
        if (TextUtils.isEmpty(currentProcessName)) {
            currentProcessName = getCurrentProcessName(context);
        }
        String packageName = context != null ? context.getPackageName() : null;
        if (currentProcessName == null || packageName == null) {
            return true;
        }
        boolean equalsIgnoreCase = currentProcessName.equalsIgnoreCase(packageName);
        isMainProcess = equalsIgnoreCase ? 1 : 0;
        return equalsIgnoreCase;
    }

    public static void killSelf() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1488cea429fb822f3e8317b211100ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1488cea429fb822f3e8317b211100ba");
        } else {
            k.b(Process.myPid());
        }
    }

    private static String getCurrentProcessNameByReflect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38f004461372377045afa14a220e3819", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38f004461372377045afa14a220e3819");
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                Method declaredMethod2 = cls.getDeclaredMethod("getProcessName", new Class[0]);
                declaredMethod2.setAccessible(true);
                return (String) declaredMethod2.invoke(invoke, new Object[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    private static String getCurrentProcessNameByPid(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae98a270f4ff52c483c39fe035ae0d85", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae98a270f4ff52c483c39fe035ae0d85");
        }
        try {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    private static String getCurrentProcessNameByFile() {
        BufferedReader bufferedReader;
        String readLine;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b5762c4e305a70bb4981c105e6491c35", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b5762c4e305a70bb4981c105e6491c35");
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            try {
                readLine = bufferedReader.readLine();
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    BufferedReader bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
        }
        if (readLine == null) {
            bufferedReader.close();
            return null;
        }
        String replace = readLine.replaceAll("[^0-9a-zA-Z.-_+:]+", "").replace("\n", "");
        try {
            bufferedReader.close();
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        return replace;
    }

    public static boolean is64Bit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "05ce56798d6e7f586a2ee9767510c427", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "05ce56798d6e7f586a2ee9767510c427")).booleanValue();
        }
        if (is64 >= 0) {
            return is64 == 1;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            is64 = Process.is64Bit() ? 1 : 0;
        } else if (Build.VERSION.SDK_INT >= 21) {
            is64 = Build.CPU_ABI.contains("64") ? 1 : 0;
        } else {
            is64 = containLib64() ? 1 : 0;
        }
        return is64 == 1;
    }

    private static boolean containLib64() {
        BufferedReader bufferedReader;
        String readLine;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader2 = null;
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9e203e5f591bbb8359922e85816582b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9e203e5f591bbb8359922e85816582b")).booleanValue();
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/maps")));
        } catch (Throwable th2) {
            th = th2;
        }
        do {
            try {
                readLine = bufferedReader.readLine();
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                try {
                    th.printStackTrace();
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return false;
                } catch (Throwable th4) {
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                    throw th4;
                }
            }
            if (readLine == null) {
                bufferedReader.close();
                return false;
            } else if (readLine.contains("/system/lib64/")) {
                try {
                    bufferedReader.close();
                } catch (Throwable th6) {
                    th6.printStackTrace();
                }
                return true;
            }
        } while (!readLine.contains("/system/lib/"));
        try {
            bufferedReader.close();
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        return false;
    }

    public static boolean isMainProcessAlive(@NonNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "403953c7f77d5fd7c08ea16f87c5c47f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "403953c7f77d5fd7c08ea16f87c5c47f")).booleanValue();
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            String packageName = context.getPackageName();
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName)) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }
}
