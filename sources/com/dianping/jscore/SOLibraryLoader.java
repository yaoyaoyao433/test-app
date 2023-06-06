package com.dianping.jscore;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Keep;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.lang.reflect.Method;
import java.util.List;
/* compiled from: ProGuard */
@Keep
@Deprecated
/* loaded from: classes.dex */
public class SOLibraryLoader {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Context sContext;
    public static Logger sLogger;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface Logger {
        void log(String str, String str2);
    }

    private static void log(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c73f823aa527b6c706645f457cb390a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c73f823aa527b6c706645f457cb390a");
        } else if (sLogger != null) {
            sLogger.log(str, str2);
        }
    }

    public static boolean loadLibraryWithClass(String str, Class cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0cee410dd48ab8f57e089db46e02b6ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0cee410dd48ab8f57e089db46e02b6ad")).booleanValue();
        }
        try {
            ClassLoader classLoader = cls.getClassLoader();
            Class<?> cls2 = Runtime.getRuntime().getClass();
            Class<?>[] clsArr = new Class[2];
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                Runtime.getRuntime().loadLibrary(str);
            } else if (i > 24 && i < 28) {
                clsArr[0] = ClassLoader.class;
                clsArr[1] = String.class;
                Method declaredMethod = cls2.getDeclaredMethod("loadLibrary0", clsArr);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(Runtime.getRuntime(), classLoader, str);
            } else {
                clsArr[0] = String.class;
                clsArr[1] = ClassLoader.class;
                Method declaredMethod2 = cls2.getDeclaredMethod("loadLibrary", clsArr);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(Runtime.getRuntime(), str, classLoader);
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean loadSOLibrary(String str, List<String> list, int i) {
        boolean loadLibraryWithClass;
        boolean z;
        Object[] objArr = {str, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1de0884b9cf8aefef01c2dc198e02759", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1de0884b9cf8aefef01c2dc198e02759")).booleanValue();
        }
        try {
            System.loadLibrary(str);
            loadLibraryWithClass = true;
        } catch (Error | Exception e) {
            log("ERR_LOAD_SO", "System load" + str + StringUtil.SPACE + e.getMessage());
            loadLibraryWithClass = loadLibraryWithClass(str, JSExecutor.class);
            if (loadLibraryWithClass) {
                log("SUC_LOAD_SO", "Reflect loadLibrary" + str + StringUtil.SPACE + e.getMessage());
            }
        }
        if (loadLibraryWithClass || sContext == null) {
            z = loadLibraryWithClass;
        } else {
            try {
                if (isExist(str, i)) {
                    if (_loadUnzipSo(str, i)) {
                        log("SUC_LOAD_SO", "Existed Dynamic load " + str + " success");
                        return true;
                    }
                    removeSoIfExit(str, i);
                }
                z = unZipSelectedFiles(str, i);
                if (z) {
                    log("SUC_LOAD_SO", "unZip Dynamic load " + str + " success");
                } else {
                    log("ERR_LOAD_SO", "Dynamic load " + str + " error because unzip fail");
                }
            } catch (Error | Exception e2) {
                log("ERR_LOAD_SO", "Dynamic load " + str + StringUtil.SPACE + e2.getMessage());
                z = false;
            }
        }
        if (!z) {
            log("ERR_DP_LOAD", "Try so loader " + str);
            try {
                k.a(str, list);
            } catch (UnsatisfiedLinkError unused) {
                log("ERR_LOAD_SO", "loadLibraryWithRelink error");
            }
        }
        return z;
    }

    public static String _targetSoFile(String str, int i) {
        Context context = sContext;
        if (context == null) {
            return "";
        }
        String str2 = "/data/data/" + context.getPackageName() + "/files";
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            str2 = filesDir.getPath();
        }
        return str2 + "/lib" + str + "bk" + i + ".so";
    }

    public static void removeSoIfExit(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "edfac71cec6029eb7b7fe99b3c92eae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "edfac71cec6029eb7b7fe99b3c92eae5");
            return;
        }
        File file = new File(_targetSoFile(str, i));
        if (file.exists()) {
            file.delete();
        }
    }

    public static boolean isExist(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ccc4ae3d1327dbc2864ee357ca46dbc9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ccc4ae3d1327dbc2864ee357ca46dbc9")).booleanValue() : new File(_targetSoFile(str, i)).exists();
    }

    public static boolean _loadUnzipSo(String str, int i) {
        try {
            if (isExist(str, i)) {
                System.load(_targetSoFile(str, i));
            }
            return true;
        } catch (Throwable th) {
            log("ERR_LOAD_SO", "_loadUnzipSo " + str + " error:" + th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean unZipSelectedFiles(java.lang.String r12, int r13) throws java.util.zip.ZipException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.jscore.SOLibraryLoader.unZipSelectedFiles(java.lang.String, int):boolean");
    }
}
