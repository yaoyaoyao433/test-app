package com.meituan.android.loader;

import android.content.Context;
import android.os.Build;
import android.support.annotation.AnyThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public static String b;
    public static String c;
    public static volatile int d;
    private static Set<String> e = Collections.synchronizedSet(new HashSet());
    private static volatile boolean f = false;
    private static final Object g = new Object();

    @AnyThread
    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f721867e84335173c73d62bf0470638", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f721867e84335173c73d62bf0470638");
        } else if (f) {
        } else {
            synchronized (g) {
                if (f) {
                    return;
                }
                String str2 = str + "dynlib" + File.separator;
                b(str2);
                b = str2 + com.meituan.android.soloader.utils.a.a();
                c = str2 + Build.CPU_ABI;
                b(b);
                b(c);
                DynLoader.b().a(">>>SoPathUtils initPath,动态获取路径 LOCAL_INSTALL_DIR=" + b + ",LOCAL_ABI_INSTALL_DIR=" + c);
                f = true;
            }
        }
    }

    @AnyThread
    public static void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a04da39819b6ec8cbdcb6d375601421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a04da39819b6ec8cbdcb6d375601421");
            return;
        }
        int i2 = i | d;
        d = i2;
        if (i2 == 3 && b != null) {
            if (b.equals(c)) {
                b(context, c);
                return;
            }
            b(context, b);
            b(context, c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00df A[ADDED_TO_REGION] */
    @android.support.annotation.AnyThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean b(android.content.Context r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.loader.g.b(android.content.Context, java.lang.String):boolean");
    }

    private static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0423f59830e780aa1a4d424209abf2b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0423f59830e780aa1a4d424209abf2b2");
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    public static String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fcbc29d08d49a98d1d9ba68d009d73c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fcbc29d08d49a98d1d9ba68d009d73c");
        }
        if (TextUtils.isEmpty(str)) {
            return "soDir should not be empty";
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdir();
            }
            if (context == null) {
                return "context should not be null";
            }
            ClassLoader classLoader = context.getClassLoader();
            if (classLoader == null) {
                return "classLoader should not be null";
            }
            File file2 = new File(str);
            Object[] objArr2 = {classLoader, file2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b5266ff0391d4e52bfa3300d335ea9ac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b5266ff0391d4e52bfa3300d335ea9ac");
            } else if (!file2.exists()) {
                new StringBuilder(">>>DynLoaderUtils installNativeLibraryPath,folder == null || !folder.exists() return... folder,").append(file2);
            } else if ((Build.VERSION.SDK_INT != 25 || Build.VERSION.PREVIEW_SDK_INT == 0) && Build.VERSION.SDK_INT <= 25) {
                if (Build.VERSION.SDK_INT >= 23) {
                    b.b(classLoader, file2);
                } else if (Build.VERSION.SDK_INT >= 14) {
                    a.b(classLoader, file2);
                } else {
                    d.a(classLoader, file2);
                }
            } else {
                c.a(classLoader, file2);
            }
            return null;
        } catch (Throwable th) {
            return th.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class d {
        public static ChangeQuickRedirect a;

        static void a(ClassLoader classLoader, File file) throws Throwable {
            Object[] objArr = {classLoader, file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efd32e23597ee9a97953a0fd06227b32", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efd32e23597ee9a97953a0fd06227b32");
                return;
            }
            String path = file.getPath();
            Field b = g.b(classLoader, "libPath");
            String[] split = ((String) b.get(classLoader)).split(CommonConstant.Symbol.COLON);
            StringBuilder sb = new StringBuilder(path);
            for (String str : split) {
                if (str != null && !path.equals(str)) {
                    sb.append(':');
                    sb.append(str);
                }
            }
            b.set(classLoader, sb.toString());
            Field b2 = g.b(classLoader, "libraryPathElements");
            List list = (List) b2.get(classLoader);
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (path.equals((String) it.next())) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            list.add(0, path);
            b2.set(classLoader, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) throws Throwable {
            Object[] objArr = {classLoader, file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "835b39ba1032fc864e7a80019c8fde53", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "835b39ba1032fc864e7a80019c8fde53");
                return;
            }
            Object obj = g.b(classLoader, "pathList").get(classLoader);
            Field b = g.b(obj, "nativeLibraryDirectories");
            File[] fileArr = (File[]) b.get(obj);
            ArrayList arrayList = new ArrayList(fileArr.length + 1);
            arrayList.add(file);
            for (File file2 : fileArr) {
                if (!file.equals(file2)) {
                    arrayList.add(file2);
                }
            }
            b.set(obj, arrayList.toArray(new File[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class b {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) throws Throwable {
            Object[] objArr = {classLoader, file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05e640ad1262cf7be58ae151c203cd40", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05e640ad1262cf7be58ae151c203cd40");
                return;
            }
            Object obj = g.b(classLoader, "pathList").get(classLoader);
            List list = (List) g.b(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (file.equals((File) it.next())) {
                    it.remove();
                    break;
                }
            }
            list.add(0, file);
            List list2 = (List) g.b(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            g.b(obj, "nativeLibraryPathElements").set(obj, (Object[]) g.b(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList, null, new ArrayList()));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class c {
        public static ChangeQuickRedirect a;

        static void a(ClassLoader classLoader, File file) throws Throwable {
            Object[] objArr = {classLoader, file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f1aaa07c27ea63e74bbef16035cd05c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f1aaa07c27ea63e74bbef16035cd05c");
                return;
            }
            Object obj = g.b(classLoader, "pathList").get(classLoader);
            List list = (List) g.b(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (file.equals((File) it.next())) {
                    it.remove();
                    break;
                }
            }
            list.add(0, file);
            List list2 = (List) g.b(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            g.b(obj, "nativeLibraryPathElements").set(obj, (Object[]) g.b(obj, "makePathElements", List.class).invoke(obj, arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field b(Object obj, String str) throws NoSuchFieldException {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "383edbd3c200f3534c4993cdfa31c4c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "383edbd3c200f3534c4993cdfa31c4c2");
        }
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method b(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Object[] objArr = {obj, str, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7573ed1da2a48bfe154ae0913b0368b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Method) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7573ed1da2a48bfe154ae0913b0368b8");
        }
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }
}
