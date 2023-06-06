package com.meituan.robust.resource.util;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.takeoutnew.util.aop.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ProcessUtil {
    private static final String ROBUST_PROCESS_NAME = ":robust";
    private static String currentProcessName;
    private static Boolean isMainProcess;
    private static String packageName;

    private static String getCurrentPackageName(Context context) {
        if (TextUtils.isEmpty(packageName)) {
            packageName = context.getPackageName();
        }
        return packageName;
    }

    public static String getCurrentProcessName(Context context) {
        if (TextUtils.isEmpty(currentProcessName)) {
            currentProcessName = getCurrentProcessNameReal(context);
        }
        return currentProcessName;
    }

    public static String getCurrentProcessName() {
        Context applicationContext;
        if (TextUtils.isEmpty(currentProcessName) && (applicationContext = getApplicationContext()) != null) {
            currentProcessName = getCurrentProcessNameReal(applicationContext);
        }
        return currentProcessName;
    }

    private static Context getApplicationContext() {
        try {
            return ((Application) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean isRobustProcess(Context context) {
        getCurrentProcessName(context);
        getCurrentPackageName(context);
        return currentProcessName.startsWith(packageName) && currentProcessName.endsWith(ROBUST_PROCESS_NAME);
    }

    public static void killSelf() {
        k.b(Process.myPid());
    }

    public static boolean isMainProcess(Context context) {
        if (isMainProcess == null) {
            getCurrentProcessName(context);
            getCurrentPackageName(context);
            isMainProcess = Boolean.valueOf(currentProcessName != null ? currentProcessName.equalsIgnoreCase(packageName) : true);
        }
        return isMainProcess.booleanValue();
    }

    private static String getCurrentProcessNameReal(Context context) {
        String currentProcessNameByReflect = getCurrentProcessNameByReflect();
        if (TextUtils.isEmpty(currentProcessNameByReflect)) {
            currentProcessNameByReflect = getCurrentProcessNameByFile();
        }
        return TextUtils.isEmpty(currentProcessNameByReflect) ? getCurrentProcessNameByPid(context) : currentProcessNameByReflect;
    }

    private static String getCurrentProcessNameByReflect() {
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

    public static String getCurrentProcessNameByPid(Context context) {
        try {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static String getCurrentProcessNameByFile() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
        } catch (Throwable th) {
            th = th;
        }
        try {
            String replace = bufferedReader.readLine().replaceAll("[^0-9a-zA-Z.-_+:]+", "").replace("\n", "");
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            return replace;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            try {
                th.printStackTrace();
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                        return "";
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                        return "";
                    }
                }
                return "";
            } catch (Throwable th5) {
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Throwable th6) {
                        th6.printStackTrace();
                    }
                }
                throw th5;
            }
        }
    }
}
