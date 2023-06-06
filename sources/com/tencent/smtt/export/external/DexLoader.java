package com.tencent.smtt.export.external;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import dalvik.system.DexClassLoader;
import dalvik.system.VMStack;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
/* loaded from: classes6.dex */
public class DexLoader {
    private static final String TAG = "DexLoader";
    private static final String TBS_FUSION_DEX = "tbs_jars_fusion_dex";
    private static final String TBS_WEBVIEW_DEX = "webview_dex";
    static boolean mCanUseDexLoaderProviderService = true;
    private static boolean mUseSpeedyClassLoader = false;
    private DexClassLoader mClassLoader;

    /* loaded from: classes6.dex */
    public static class TbsCorePrivateClassLoader extends DexClassLoader {
        public TbsCorePrivateClassLoader(String str, String str2, String str3, ClassLoader classLoader) {
            super(str, str2, str3, classLoader);
        }

        @Override // java.lang.ClassLoader
        protected Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            ClassLoader parent;
            if (str != null) {
                Class<?> findLoadedClass = findLoadedClass(str);
                if (findLoadedClass == null) {
                    try {
                        findLoadedClass = findClass(str);
                    } catch (ClassNotFoundException unused) {
                    }
                    return (findLoadedClass != null || (parent = getParent()) == null) ? findLoadedClass : parent.loadClass(str);
                }
                return findLoadedClass;
            }
            return super.loadClass(str, z);
        }
    }

    public DexLoader(Context context, String str, String str2) {
        this(context, new String[]{str}, str2);
    }

    public DexLoader(Context context, String[] strArr, String str) {
        this((String) null, context, strArr, str);
    }

    public DexLoader(Context context, String[] strArr, String str, DexLoader dexLoader) {
        DexClassLoader classLoader = dexLoader.getClassLoader();
        for (String str2 : strArr) {
            classLoader = createDexClassLoader(str2, str, context.getApplicationInfo().nativeLibraryDir, classLoader, context);
            this.mClassLoader = classLoader;
        }
    }

    public DexLoader(Context context, String[] strArr, String str, String str2) {
        ClassLoader classLoader = context.getClassLoader();
        String str3 = context.getApplicationInfo().nativeLibraryDir;
        str3 = TextUtils.isEmpty(str2) ? str3 : str3 + File.pathSeparator + str2;
        DexClassLoader dexClassLoader = classLoader;
        for (String str4 : strArr) {
            dexClassLoader = createDexClassLoader(str4, str, str3, dexClassLoader, context);
            this.mClassLoader = dexClassLoader;
        }
    }

    public DexLoader(String str, Context context, String[] strArr, String str2) {
        this(str, context, strArr, str2, null);
    }

    public DexLoader(String str, Context context, String[] strArr, String str2, Map<String, Object> map) {
        initTbsSettings(map);
        ClassLoader callingClassLoader = VMStack.getCallingClassLoader();
        callingClassLoader = callingClassLoader == null ? context.getClassLoader() : callingClassLoader;
        new StringBuilder("Set base classLoader for DexClassLoader: ").append(callingClassLoader);
        DexClassLoader dexClassLoader = callingClassLoader;
        for (String str3 : strArr) {
            dexClassLoader = createDexClassLoader(str3, str2, str, dexClassLoader, context);
            this.mClassLoader = dexClassLoader;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:3|(2:4|5)|(6:(2:12|(1:14))|(3:37|38|(2:40|(3:42|23|(0))))|21|22|23|(0))|15|16|17|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01c8, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01db, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01dc, code lost:
        r17 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private dalvik.system.DexClassLoader createDexClassLoader(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.ClassLoader r22, android.content.Context r23) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.DexLoader.createDexClassLoader(java.lang.String, java.lang.String, java.lang.String, java.lang.ClassLoader, android.content.Context):dalvik.system.DexClassLoader");
    }

    public static void delete(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            delete(file2);
        }
        file.delete();
    }

    public static String getFileNameNoEx(String str) {
        int lastIndexOf;
        return (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf >= str.length()) ? str : str.substring(0, lastIndexOf);
    }

    public static void initTbsSettings(Map<String, Object> map) {
        new StringBuilder("initTbsSettings - ").append(map);
        if (map != null) {
            try {
                map.get(TbsCoreSettings.TBS_SETTINGS_USE_PRIVATE_CLASSLOADER);
                Object obj = map.get(TbsCoreSettings.TBS_SETTINGS_USE_SPEEDY_CLASSLOADER);
                if (obj instanceof Boolean) {
                    mUseSpeedyClassLoader = ((Boolean) obj).booleanValue();
                }
                Object obj2 = map.get(TbsCoreSettings.TBS_SETTINGS_USE_DEXLOADER_SERVICE);
                if (obj2 instanceof Boolean) {
                    mCanUseDexLoaderProviderService = ((Boolean) obj2).booleanValue();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public DexClassLoader getClassLoader() {
        return this.mClassLoader;
    }

    public Object getStaticField(String str, String str2) {
        try {
            Field field = this.mClassLoader.loadClass(str).getField(str2);
            field.setAccessible(true);
            return field.get(null);
        } catch (Throwable th) {
            String simpleName = getClass().getSimpleName();
            Log.e(simpleName, CommonConstant.Symbol.SINGLE_QUOTES + str + "' get field '" + str2 + "' failed", th);
            return null;
        }
    }

    public Object invokeMethod(Object obj, String str, String str2, Class<?>[] clsArr, Object... objArr) {
        try {
            Method method = this.mClassLoader.loadClass(str).getMethod(str2, clsArr);
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            String simpleName = getClass().getSimpleName();
            Log.e(simpleName, CommonConstant.Symbol.SINGLE_QUOTES + str + "' invoke method '" + str2 + "' failed", th);
            return null;
        }
    }

    public Object invokeStaticMethod(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        try {
            Method method = this.mClassLoader.loadClass(str).getMethod(str2, clsArr);
            method.setAccessible(true);
            return method.invoke(null, objArr);
        } catch (Throwable th) {
            if (str2 == null || !str2.equalsIgnoreCase("initTesRuntimeEnvironment")) {
                String simpleName = getClass().getSimpleName();
                Log.i(simpleName, CommonConstant.Symbol.SINGLE_QUOTES + str + "' invoke static method '" + str2 + "' failed", th);
                return null;
            }
            String simpleName2 = getClass().getSimpleName();
            Log.e(simpleName2, CommonConstant.Symbol.SINGLE_QUOTES + str + "' invoke static method '" + str2 + "' failed", th);
            return th;
        }
    }

    public Class<?> loadClass(String str) {
        try {
            return this.mClassLoader.loadClass(str);
        } catch (Throwable th) {
            String simpleName = getClass().getSimpleName();
            Log.e(simpleName, "loadClass '" + str + "' failed", th);
            return null;
        }
    }

    public Object newInstance(String str) {
        try {
            return this.mClassLoader.loadClass(str).newInstance();
        } catch (Throwable th) {
            String simpleName = getClass().getSimpleName();
            Log.e(simpleName, "create " + str + " instance failed", th);
            return null;
        }
    }

    public Object newInstance(String str, Class<?>[] clsArr, Object... objArr) {
        try {
            return this.mClassLoader.loadClass(str).getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable th) {
            if ("com.tencent.smtt.webkit.adapter.X5WebViewAdapter".equalsIgnoreCase(str)) {
                String simpleName = getClass().getSimpleName();
                Log.e(simpleName, "'newInstance " + str + " failed", th);
                return th;
            }
            String simpleName2 = getClass().getSimpleName();
            Log.e(simpleName2, "create '" + str + "' instance failed", th);
            return null;
        }
    }

    public void setStaticField(String str, String str2, Object obj) {
        try {
            Field field = this.mClassLoader.loadClass(str).getField(str2);
            field.setAccessible(true);
            field.set(null, obj);
        } catch (Throwable th) {
            String simpleName = getClass().getSimpleName();
            Log.e(simpleName, CommonConstant.Symbol.SINGLE_QUOTES + str + "' set field '" + str2 + "' failed", th);
        }
    }
}
