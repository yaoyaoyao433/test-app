package com.meituan.uuid;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
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
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String currentProcessName;
    private static String packageName;

    private static String getCurrentPackageName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3546076ead94edbab504099dbc1484da", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3546076ead94edbab504099dbc1484da");
        }
        if (TextUtils.isEmpty(packageName)) {
            packageName = context.getPackageName();
        }
        return packageName;
    }

    public static String getCurrentProcessName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d76e9615d2a77618e1a9e07389604918", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d76e9615d2a77618e1a9e07389604918");
        }
        if (TextUtils.isEmpty(currentProcessName)) {
            currentProcessName = getCurrentProcessNameReal(context);
        }
        return currentProcessName;
    }

    public static void killSelf() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b17889cb459b9f4137d0edc5e6ac8dc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b17889cb459b9f4137d0edc5e6ac8dc7");
        } else {
            k.b(Process.myPid());
        }
    }

    public static boolean isMainProcess(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f1134090312fdf393dc94ece7731f86", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f1134090312fdf393dc94ece7731f86")).booleanValue();
        }
        getCurrentProcessName(context);
        getCurrentPackageName(context);
        if (currentProcessName != null) {
            return currentProcessName.equalsIgnoreCase(packageName);
        }
        return true;
    }

    private static String getCurrentProcessNameReal(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20a4c7c6322598b3e8793419d68eaede", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20a4c7c6322598b3e8793419d68eaede");
        }
        String currentProcessNameByReflect = getCurrentProcessNameByReflect();
        if (TextUtils.isEmpty(currentProcessNameByReflect)) {
            currentProcessNameByReflect = getCurrentProcessNameByFile();
        }
        return TextUtils.isEmpty(currentProcessNameByReflect) ? getCurrentProcessNameByPid(context) : currentProcessNameByReflect;
    }

    private static String getCurrentProcessNameByReflect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17a314dd2cf3059ff9fe8a5c8a75ce2d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17a314dd2cf3059ff9fe8a5c8a75ce2d");
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
                return "";
            }
        }
        return "";
    }

    public static String getCurrentProcessNameByPid(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b77e856f05bee30dff896f756f34dc22", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b77e856f05bee30dff896f756f34dc22");
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
                return "";
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private static String getCurrentProcessNameByFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5afd6645302f25d719217f2fcd6fe7e6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5afd6645302f25d719217f2fcd6fe7e6");
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            try {
                String replace = bufferedReader2.readLine().replaceAll("[^0-9a-zA-Z.-_+:]+", "").replace("\n", "");
                try {
                    bufferedReader2.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return replace;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                try {
                    th.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            return "";
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                            return "";
                        }
                    }
                    return "";
                } catch (Throwable th4) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public static boolean isMainThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08f764bae08c825d38a0a1924d614533", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08f764bae08c825d38a0a1924d614533")).booleanValue() : Looper.getMainLooper() == Looper.myLooper();
    }
}
