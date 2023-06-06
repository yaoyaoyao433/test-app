package com.meituan.android.cipstorage;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ab {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public void a(File file) {
        }

        public void a(File file, long j, int i, String str) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    interface b {
        void a(File file, long j, int i, String str, String str2);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ca4f1376039a06fcae896f496fcc999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ca4f1376039a06fcae896f496fcc999");
        } else if (str != null) {
            a(new File(str));
        }
    }

    public static long a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9db7ca18aaeb3f82a6945adaba99c442", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9db7ca18aaeb3f82a6945adaba99c442")).longValue() : a(file, (List<String>) null);
    }

    public static long a(File file, List<String> list) {
        Object[] objArr = {file, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96b5224e2e2a0d2ab5d7ee9e546d92d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96b5224e2e2a0d2ab5d7ee9e546d92d4")).longValue();
        }
        long j = 0;
        if (file == null || !file.exists() || a(list, file)) {
            return 0L;
        }
        if (file.isFile()) {
            long length = file.length();
            if (file.delete()) {
                return length;
            }
            return 0L;
        }
        if (file.isDirectory()) {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(file.toPath());
                    for (Path path : newDirectoryStream) {
                        j += a(path.toFile(), list);
                    }
                    if (newDirectoryStream != null) {
                        newDirectoryStream.close();
                    }
                } catch (Throwable unused) {
                    return j;
                }
            } else {
                String[] list2 = file.list();
                if (list2 != null) {
                    for (String str : list2) {
                        j += a(new File(file, str), list);
                    }
                }
            }
            b(file);
        }
        return j;
    }

    public static boolean b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52f573038066b6ed02747b4e15d5aef4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52f573038066b6ed02747b4e15d5aef4")).booleanValue();
        }
        if (file.getAbsolutePath().endsWith("/cache/WebView")) {
            return false;
        }
        return file.delete();
    }

    public static boolean a(List<String> list, File file) {
        Object[] objArr = {list, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31cc857be08f6a39fca53d7a955db2f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31cc857be08f6a39fca53d7a955db2f9")).booleanValue();
        }
        if (list == null || file == null) {
            return false;
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            for (String str : list) {
                if (new File(str).getCanonicalPath().equals(canonicalPath)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void a(File file, final b bVar) {
        Object[] objArr = {file, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a00a96d318afb6c4cee9cb429888a1bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a00a96d318afb6c4cee9cb429888a1bc");
        } else {
            a(file, new a() { // from class: com.meituan.android.cipstorage.ab.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ab.a
                public final void a(File file2, long j, int i, String str) {
                    Object[] objArr2 = {file2, new Long(j), Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d80e0b4617e2cf63ad6dcd3eb6a6ed02", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d80e0b4617e2cf63ad6dcd3eb6a6ed02");
                    } else {
                        b.this.a(file2, j, i, str, ab.b(str));
                    }
                }
            });
        }
    }

    public static void a(File file, a aVar) {
        Object[] objArr = {file, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1eb9e17e705ad4a59880d146ecdface8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1eb9e17e705ad4a59880d146ecdface8");
        } else {
            a(file, aVar, 0, "");
        }
    }

    private static long a(File file, a aVar, int i, String str) {
        Object[] objArr = {file, aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "566c057f66ba741890c2a153690fa760", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "566c057f66ba741890c2a153690fa760")).longValue();
        }
        if (file == null || !file.exists() || aVar == null) {
            return 0L;
        }
        aVar.a(file);
        long length = file.isFile() ? file.length() : 0L;
        if (file.isDirectory()) {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(file.toPath());
                    for (Path path : newDirectoryStream) {
                        File file2 = path.toFile();
                        length += a(file2, aVar, i + 1, a(str, file2.getName()));
                    }
                    if (newDirectoryStream != null) {
                        newDirectoryStream.close();
                    }
                } catch (Throwable unused) {
                }
            } else {
                String[] list = file.list();
                if (list != null) {
                    for (String str2 : list) {
                        File file3 = new File(file, str2);
                        length += a(file3, aVar, i + 1, a(str, file3.getName()));
                    }
                }
            }
        }
        aVar.a(file, length, i, str);
        return length;
    }

    private static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8299974198d05ab16dd093a9d729f3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8299974198d05ab16dd093a9d729f3e");
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str + File.separator + str2;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac765ee95729345b4655dd59fabbfcdf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac765ee95729345b4655dd59fabbfcdf");
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        return lastIndexOf < 0 ? "" : str.substring(0, lastIndexOf);
    }
}
