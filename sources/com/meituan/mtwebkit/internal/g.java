package com.meituan.mtwebkit.internal;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final String b;

    static {
        b = a.b() ? "64bit/" : "32bit/";
    }

    public static com.meituan.android.cipstorage.q a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17af86a391d2df5bb84b586a01660fc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17af86a391d2df5bb84b586a01660fc3");
        }
        return com.meituan.android.cipstorage.q.a(a.a(), z ? "mtplatform_mtwebview_64" : "mtplatform", 2);
    }

    public static File a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef552e2ac2dacfac4e14cdf5ef529e31", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef552e2ac2dacfac4e14cdf5ef529e31");
        }
        File a2 = com.meituan.android.cipstorage.q.a(a.a(), "mtplatform", "mtwebview");
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2;
    }

    public static File b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3f0193dcaa1a516bcc16f262c8abdab", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3f0193dcaa1a516bcc16f262c8abdab");
        }
        File file = new File(a(), "download");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db4f433ff53c3e1e3dc3286d9980d31d", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db4f433ff53c3e1e3dc3286d9980d31d");
        }
        File a2 = a();
        File file = new File(a2, b + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static Set<String> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8086903bf3e18a088fbe9f235b1caf0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8086903bf3e18a088fbe9f235b1caf0e");
        }
        String[] list = new File(a(), b).list();
        if (list == null) {
            return null;
        }
        return new HashSet(Arrays.asList(list));
    }

    public static File a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bcb5a2e15c05cea220958209857c408", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bcb5a2e15c05cea220958209857c408") : a(Integer.toString(i));
    }

    public static File b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "128021a9d048f95d59f0a52c5681becc", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "128021a9d048f95d59f0a52c5681becc") : new File(a(i), "base.zip");
    }

    public static File c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a129d6f888ef6f5f192e4b0c87a70631", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a129d6f888ef6f5f192e4b0c87a70631");
        }
        File file = new File(a(i), "libs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04cc1b94797d02deb8849c70d07e2328", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04cc1b94797d02deb8849c70d07e2328");
        }
        File file = new File(a(i), "lib_links");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File e(int i) {
        File file;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95749e88427a6cabd2f50767395444af", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95749e88427a6cabd2f50767395444af");
        }
        File a2 = a(i);
        if (e()) {
            String str = "arm";
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                str = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0d2fccb6bce61f70963959a2996f434f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0d2fccb6bce61f70963959a2996f434f") : (String) d.a("dalvik.system.VMRuntime").a("getCurrentInstructionSet", new Object[0]).b;
            } catch (Throwable th) {
                i.a(th);
            }
            file = new File(a2, "oat/" + str);
        } else {
            file = new File(a2, "opt");
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d80d5bdc2270c73bb6579f3c55a49eca", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d80d5bdc2270c73bb6579f3c55a49eca");
        }
        File file = new File(a(str), "file_locks");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a078c1ace39ebde0912a0d8f1fc70251", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a078c1ace39ebde0912a0d8f1fc70251");
        }
        File e = e(i);
        if (e()) {
            return new File(e, "base.odex");
        }
        return new File(e, "base.dex");
    }

    public static File d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a358d2a8b2128053106e2ade40c8639", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a358d2a8b2128053106e2ade40c8639");
        }
        return new File(a(), a.b() ? "32bit" : "64bit");
    }

    private static boolean e() {
        return Build.VERSION.SDK_INT > 25;
    }
}
