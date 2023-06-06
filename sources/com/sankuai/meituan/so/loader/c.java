package com.sankuai.meituan.so.loader;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08f7d2508e0389c06bc64e20be246e22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08f7d2508e0389c06bc64e20be246e22")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            e.a("so-loader", "soDir is null.", new Object[0]);
            return false;
        } else if (!new File(str).exists()) {
            e.a("so-loader", str + " is not exists.", new Object[0]);
            return false;
        } else {
            ClassLoader classLoader = context.getClassLoader();
            if (classLoader == null) {
                e.a("so-loader", "classloader is null", new Object[0]);
                return false;
            }
            e.b("so-loader", "before hack classloader:" + classLoader.toString(), new Object[0]);
            try {
                File file = new File(str);
                Object[] objArr2 = {classLoader, file};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c4961973e1aaedb14310ad1e575dd6dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c4961973e1aaedb14310ad1e575dd6dc");
                } else if (!file.exists()) {
                    e.a("so-loader", "installNativeLibraryPath, folder %s is illegal", file);
                } else if ((Build.VERSION.SDK_INT != 25 || Build.VERSION.PREVIEW_SDK_INT == 0) && Build.VERSION.SDK_INT <= 25) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        b.a(classLoader, file);
                    } else if (Build.VERSION.SDK_INT >= 14) {
                        a.a(classLoader, file);
                    } else {
                        d.a(classLoader, file);
                    }
                } else {
                    C0647c.a(classLoader, file);
                }
                e.b("so-loader", "after hack classloader:" + classLoader.toString(), new Object[0]);
                return true;
            } catch (Throwable th) {
                try {
                    e.a("so-loader", "installNativeLibraryPath fail:" + th, new Object[0]);
                    e.b("so-loader", "after hack classloader:" + classLoader.toString(), new Object[0]);
                    return false;
                } catch (Throwable th2) {
                    e.b("so-loader", "after hack classloader:" + classLoader.toString(), new Object[0]);
                    throw th2;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class d {
        public static ChangeQuickRedirect a;

        static void a(ClassLoader classLoader, File file) throws Throwable {
            Object[] objArr = {classLoader, file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c2292021554320ec4b8e8c6a5ef2316", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c2292021554320ec4b8e8c6a5ef2316");
                return;
            }
            String path = file.getPath();
            Field a2 = h.a(classLoader, "libPath");
            String[] split = ((String) a2.get(classLoader)).split(CommonConstant.Symbol.COLON);
            StringBuilder sb = new StringBuilder(path);
            for (String str : split) {
                if (str != null && !path.equals(str)) {
                    sb.append(':');
                    sb.append(str);
                }
            }
            a2.set(classLoader, sb.toString());
            Field a3 = h.a(classLoader, "libraryPathElements");
            List list = (List) a3.get(classLoader);
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
            a3.set(classLoader, list);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(ClassLoader classLoader, File file) throws Throwable {
            Object[] objArr = {classLoader, file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcaafc79964da32a0e867c260d59ada5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcaafc79964da32a0e867c260d59ada5");
                return;
            }
            Object obj = h.a(classLoader, "pathList").get(classLoader);
            Field a2 = h.a(obj, "nativeLibraryDirectories");
            File[] fileArr = (File[]) a2.get(obj);
            ArrayList arrayList = new ArrayList(fileArr.length + 1);
            arrayList.add(file);
            for (File file2 : fileArr) {
                if (!file.equals(file2)) {
                    arrayList.add(file2);
                }
            }
            a2.set(obj, arrayList.toArray(new File[0]));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class b {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(ClassLoader classLoader, File file) throws Throwable {
            Object[] objArr = {classLoader, file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5ab1ebeb868ae60bc7ed9f8689c0777", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5ab1ebeb868ae60bc7ed9f8689c0777");
                return;
            }
            Object obj = h.a(classLoader, "pathList").get(classLoader);
            List list = (List) h.a(obj, "nativeLibraryDirectories").get(obj);
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
            List list2 = (List) h.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            h.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) h.a(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList, null, new ArrayList()));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.so.loader.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0647c {
        public static ChangeQuickRedirect a;

        static void a(ClassLoader classLoader, File file) throws Throwable {
            Object[] objArr = {classLoader, file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e92d6f2203dad9f1baa19ea1c9566f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e92d6f2203dad9f1baa19ea1c9566f2");
                return;
            }
            Object obj = h.a(classLoader, "pathList").get(classLoader);
            List list = (List) h.a(obj, "nativeLibraryDirectories").get(obj);
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
            List list2 = (List) h.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            h.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) h.a(obj, "makePathElements", List.class).invoke(obj, arrayList));
        }
    }
}
