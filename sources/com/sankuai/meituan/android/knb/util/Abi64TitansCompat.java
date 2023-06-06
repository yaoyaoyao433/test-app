package com.sankuai.meituan.android.knb.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.networklog.c;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Abi64TitansCompat {
    private static final String APP_WEB_VIEW_DIR_NAME = "app_webview";
    private static final String CHROMIUM_PREFS_NAME = "WebViewChromiumPrefs";
    private static final String GPU_CACHE_DIR_NAME = "GPUCache";
    private static final String MMP_DELETED_GPU_CACHE_APP_ABI = "deleted_gpu_cache_app_abi";
    private static final String SP_NAME = "delete_webview_gpu_cache";
    public static final String TAG = "Abi64WebViewCompat";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void obliterate(@Nullable Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45423d34d6ef3080d71c522576d5cbb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45423d34d6ef3080d71c522576d5cbb8");
        } else if (Build.VERSION.SDK_INT < 24 || context == null || isAbiNotChanged(context, z)) {
        } else {
            try {
                Context applicationContext = context.getApplicationContext();
                if (deleteRecursive(new File(applicationContext.getDataDir() + File.separator + APP_WEB_VIEW_DIR_NAME + File.separator + GPU_CACHE_DIR_NAME))) {
                    setFlag(context, z);
                }
            } catch (Exception unused) {
            }
        }
    }

    private static boolean isAbiNotChanged(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45a0a72bf981f0628a2c16ea6d3d0509", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45a0a72bf981f0628a2c16ea6d3d0509")).booleanValue();
        }
        String string = getPreferences(context).getString(MMP_DELETED_GPU_CACHE_APP_ABI, null);
        if (string != null || z) {
            if (TextUtils.equals("64", string) && z) {
                return true;
            }
            return TextUtils.equals("32", string) && !z;
        }
        return true;
    }

    private static SharedPreferences getPreferences(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1824515048c7a8d41a7643a92396987", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1824515048c7a8d41a7643a92396987") : q.a(context, SP_NAME).a();
    }

    private static void setFlag(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f486cb6b7c33f6ef3ef958bca2715875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f486cb6b7c33f6ef3ef958bca2715875");
        } else {
            getPreferences(context).edit().putString(MMP_DELETED_GPU_CACHE_APP_ABI, z ? "64" : "32").apply();
        }
    }

    private static boolean deleteRecursive(@NonNull File file) {
        boolean z = true;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6158c10ea0ac79c8e819d232ae5602a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6158c10ea0ac79c8e819d232ae5602a9")).booleanValue();
        }
        if (file.isDirectory() && file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                deleteRecursive(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            z = false;
        }
        printInfo("delete isSuccessDelete: " + z + " fileName: " + file);
        return z;
    }

    private static void printInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a285481897488f0bafaa05c9544934a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a285481897488f0bafaa05c9544934a4");
            return;
        }
        PrintStream printStream = System.out;
        printStream.println("Abi64WebViewCompat:" + str);
        c.a(str, 35, new String[]{TAG});
    }
}
