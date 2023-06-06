package com.meituan.android.common.unionid.oneid.util;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ProcessUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String currentProcessName;
    private static String packageName;

    public static boolean isMainThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e70148130e86d0a3503392e63aff972b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e70148130e86d0a3503392e63aff972b")).booleanValue() : Looper.getMainLooper() == Looper.myLooper();
    }

    public static String getCurrentPackageName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0bb0a2c801bdedafb1ff9d1200a542a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0bb0a2c801bdedafb1ff9d1200a542a0");
        }
        if (TextUtils.isEmpty(packageName)) {
            packageName = context.getPackageName();
        }
        return packageName;
    }

    public static String getCurrentProcessName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da32b951877e7357154a7d04c6e73e04", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da32b951877e7357154a7d04c6e73e04");
        }
        if (TextUtils.isEmpty(currentProcessName)) {
            String currentProcessNameByApplication = getCurrentProcessNameByApplication();
            currentProcessName = currentProcessNameByApplication;
            if (TextUtils.isEmpty(currentProcessNameByApplication)) {
                String currentProcessNameByActivityThread = getCurrentProcessNameByActivityThread();
                currentProcessName = currentProcessNameByActivityThread;
                if (TextUtils.isEmpty(currentProcessNameByActivityThread)) {
                    currentProcessName = getCurrentProcessNameReal(context);
                }
            }
        }
        return currentProcessName;
    }

    public static String getCurrentProcessNameByApplication() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fcfdb6d54d881ed4731c9c77672c6b20", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fcfdb6d54d881ed4731c9c77672c6b20");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        return null;
    }

    public static String getCurrentProcessNameByActivityThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99082119635fa35f355ad31ba5403bc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99082119635fa35f355ad31ba5403bc0");
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean isMainProcess(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cff6ec07ab6a7334a4cd4b1c614f65dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cff6ec07ab6a7334a4cd4b1c614f65dd")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return context.getPackageName().equals(getCurrentProcessName(context));
    }

    private static String getCurrentProcessNameReal(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e340f8be13f3f23ae409393a21b8b50", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e340f8be13f3f23ae409393a21b8b50");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "94dc89c2d998a4b341e6011f91606eff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "94dc89c2d998a4b341e6011f91606eff");
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getCurrentProcessNameByPid(android.content.Context r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.common.unionid.oneid.util.ProcessUtils.changeQuickRedirect
            java.lang.String r10 = "3337ccc447c09d579f1bc802561c10e2"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r11
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r11, r0, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1e:
            int r11 = android.os.Process.myPid()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "/proc/"
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r11 = "/cmdline"
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r1.<init>(r11)
            boolean r11 = r1.exists()
            if (r11 != 0) goto L50
            java.lang.String r11 = "Error"
            java.lang.String r0 = "文件不存在"
            com.meituan.android.common.unionid.oneid.util.LogUtils.i(r11, r0)
            java.lang.String r11 = ""
            return r11
        L50:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L77
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L77
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
        L59:
            int r2 = r11.read(r1)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            if (r2 <= 0) goto L68
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r3.<init>(r1, r9, r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r0.append(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            goto L59
        L68:
            r11.close()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r11.close()     // Catch: java.lang.Exception -> L81
            goto L85
        L6f:
            r0 = move-exception
            goto L98
        L71:
            r1 = move-exception
            r2 = r11
            goto L78
        L74:
            r0 = move-exception
            r11 = r2
            goto L98
        L77:
            r1 = move-exception
        L78:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L85
            r2.close()     // Catch: java.lang.Exception -> L81
            goto L85
        L81:
            r11 = move-exception
            r11.printStackTrace()
        L85:
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "\u0000"
            java.lang.String[] r11 = r11.split(r0)
            int r0 = r11.length
            if (r0 <= 0) goto L95
            r11 = r11[r9]
            return r11
        L95:
            java.lang.String r11 = ""
            return r11
        L98:
            if (r11 == 0) goto La2
            r11.close()     // Catch: java.lang.Exception -> L9e
            goto La2
        L9e:
            r11 = move-exception
            r11.printStackTrace()
        La2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.util.ProcessUtils.getCurrentProcessNameByPid(android.content.Context):java.lang.String");
    }

    private static String getCurrentProcessNameByFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b932e35d5b434d82db7ff60dac1d0ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b932e35d5b434d82db7ff60dac1d0ae");
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
}
