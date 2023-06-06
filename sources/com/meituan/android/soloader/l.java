package com.meituan.android.soloader;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;

    public static synchronized boolean a(String str, List<String> list) {
        String substring;
        synchronized (l.class) {
            Object[] objArr = {str, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5d722877961451cbe69ed026bbed5bf", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5d722877961451cbe69ed026bbed5bf")).booleanValue();
            }
            com.meituan.android.loader.f a2 = k.a();
            a2.a(">>>SoLoader repairSoFile: " + str);
            Context a3 = a();
            if (a3 != null && !TextUtils.isEmpty(str)) {
                File a4 = a(a3);
                if (a4 == null) {
                    return false;
                }
                if (!b) {
                    try {
                        k.a(new e(a4, 1));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    b = true;
                }
                List<String> arrayList = list == null ? new ArrayList<>() : list;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
                a(a4, a3, (String[]) arrayList.toArray(new String[0]));
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2f73d55ed2c598cb917d505c8bbe9163", RobustBitConfig.DEFAULT_VALUE)) {
                    substring = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2f73d55ed2c598cb917d505c8bbe9163");
                } else {
                    substring = (str.startsWith(APKStructure.Lib_Type) && str.endsWith(".so")) ? str.substring(3, str.indexOf(".so")) : str;
                }
                k.a(substring);
                return true;
            }
            return false;
        }
    }

    private static void a(File file, Context context, String[] strArr) {
        String[] strArr2;
        Object[] objArr = {file, context, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c94fb5678f6ca704ebf6ed01cbf23605", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c94fb5678f6ca704ebf6ed01cbf23605");
        } else if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                File file2 = new File(file, a(str));
                if (!file2.exists()) {
                    a(context, str);
                    try {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ac88d5f3fdf19ffc8e2ed2223b85d18b", RobustBitConfig.DEFAULT_VALUE)) {
                            strArr2 = (String[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ac88d5f3fdf19ffc8e2ed2223b85d18b");
                        } else if (Build.VERSION.SDK_INT >= 21 && Build.SUPPORTED_ABIS.length > 0) {
                            strArr2 = Build.SUPPORTED_ABIS;
                        } else {
                            strArr2 = !TextUtils.isEmpty(Build.CPU_ABI2) ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : new String[]{Build.CPU_ABI};
                        }
                        b.a(context, strArr2, a(str), file2);
                        a(file, context, e.a(new File(file, a(str))));
                    } catch (FileNotFoundException unused) {
                    } catch (IOException e) {
                        k.a().a(">>>SoLoader copyAllFromApk error! soName: " + str + ", errorMsg: " + e.getMessage());
                    }
                }
            }
        }
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f12e4a8bf89b605c1f5e865653c823a9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f12e4a8bf89b605c1f5e865653c823a9") : (str.startsWith(APKStructure.Lib_Type) && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    private static File a(Context context) {
        PackageInfo packageInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27e37b5ed3efaa12d2301d779bbcfedb", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27e37b5ed3efaa12d2301d779bbcfedb");
        }
        File dir = context.getDir("so_lib", 0);
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            k.a().a(">>>SoLoader getPackageInfo error! errorMsg: " + e.getMessage());
            packageInfo = null;
        }
        String valueOf = packageInfo == null ? "unknown-versionCode" : String.valueOf(packageInfo.versionCode);
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf);
        sb.append(ProcessUtils.is64Bit() ? "_64" : "_32");
        final String sb2 = sb.toString();
        File[] listFiles = dir.listFiles(new FilenameFilter() { // from class: com.meituan.android.soloader.l.1
            public static ChangeQuickRedirect a;

            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                Object[] objArr2 = {file, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdb8b3900963c4fba7605a71046754c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdb8b3900963c4fba7605a71046754c9")).booleanValue() : !str.equals(sb2);
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    file.delete();
                } else if (file.isDirectory()) {
                    com.meituan.android.soloader.utils.b.a(file.getAbsolutePath());
                }
            }
        }
        File file2 = new File(dir, sb2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (file2.isDirectory()) {
            return file2;
        }
        return null;
    }

    private static void a(Context context, final String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37106360f65c2ba455be8c12b6fdad82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37106360f65c2ba455be8c12b6fdad82");
            return;
        }
        File a2 = a(context);
        if (a2 == null) {
            return;
        }
        File file = new File(a2, str);
        File[] listFiles = a2.listFiles(new FilenameFilter() { // from class: com.meituan.android.soloader.l.2
            public static ChangeQuickRedirect a;

            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                Object[] objArr2 = {file2, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22c5e9052c9e7f8eab91cdafde978aa0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22c5e9052c9e7f8eab91cdafde978aa0")).booleanValue() : str2.startsWith(str);
            }
        });
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (!file2.getAbsolutePath().equals(file.getAbsolutePath())) {
                file2.delete();
            }
        }
    }

    private static Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24c0f25cff00aa2453088d5b95172971", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24c0f25cff00aa2453088d5b95172971");
        }
        try {
            return ((Application) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
