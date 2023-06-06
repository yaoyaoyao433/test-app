package com.meituan.msc.modules.page.render.webview;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.android.knb.util.Abi64TitansCompat;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(@Nullable Context context) {
        boolean z;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a83ea8c24f6958359eebea580cf23cf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a83ea8c24f6958359eebea580cf23cf0");
        } else if (context == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0844c297c1ee4dc57e7bc6cd84efe46c", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0844c297c1ee4dc57e7bc6cd84efe46c")).booleanValue();
            } else {
                String string = a().getString("deleted_gpu_cache_app_abi", null);
                if (string == null && !ProcessUtils.is64Bit()) {
                    a("保持32位架构不变，不清除缓存");
                } else if (TextUtils.equals("64", string) && ProcessUtils.is64Bit()) {
                    a("32位升级到64位架构后，abi保持不变，不清除缓存");
                } else {
                    a("64位降级到32位架构后，abi保持不变，不清除缓存");
                    if (!TextUtils.equals("32", string) || ProcessUtils.is64Bit()) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                a("obliterate abi is not changed");
                return;
            }
            try {
                a("delete file start");
                context.getApplicationContext().getSharedPreferences("WebViewChromiumPrefs", 0).edit().clear().apply();
                File file = new File(ContextCompat.getDataDir(context) + File.separator + "app_webview" + File.separator + "GPUCache");
                File file2 = new File(ContextCompat.getDataDir(context) + File.separator + "app_webview" + File.separator + "Default" + File.separator + "GPUCache");
                if (a(file) && a(file2) && b(context) && c(context)) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c5b8624f76488e5b4ee7eae97a2ae4f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c5b8624f76488e5b4ee7eae97a2ae4f2");
                    } else {
                        a().edit().putString("deleted_gpu_cache_app_abi", ProcessUtils.is64Bit() ? "64" : "32").apply();
                    }
                }
            } catch (Exception e) {
                a(e.getMessage());
            }
        }
    }

    private static SharedPreferences a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19cb76ec580e3a0cc70b74edb6ec907c", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19cb76ec580e3a0cc70b74edb6ec907c") : MSCEnvHelper.getSharedPreferences("delete_webview_gpu_cache");
    }

    private static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0213760b8e2a9b940570bc01e8c0133a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0213760b8e2a9b940570bc01e8c0133a")).booleanValue();
        }
        for (int i = 0; i <= 3; i++) {
            if (!a(new File(ContextCompat.getDataDir(context) + File.separator + "app_webview_" + context.getPackageName() + ":miniApp" + i + File.separator + "GPUCache"))) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f98b9ea523f021bcd4f5d23f730cf2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f98b9ea523f021bcd4f5d23f730cf2a")).booleanValue();
        }
        for (int i = 0; i <= 3; i++) {
            if (!a(new File(ContextCompat.getDataDir(context) + File.separator + "app_webview_" + context.getPackageName() + ":miniApp" + i + File.separator + "Default" + File.separator + "GPUCache"))) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(@NonNull File file) {
        File[] listFiles;
        boolean z = true;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e46cfe6eb11146cce0f0aebddc0b6b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e46cfe6eb11146cce0f0aebddc0b6b8")).booleanValue();
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            z = false;
        }
        a("delete isSuccessDelete: " + z + " fileName: " + file);
        return z;
    }

    private static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0d63bcc4f5ffb54cd442ad948cf9904", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0d63bcc4f5ffb54cd442ad948cf9904");
        } else {
            com.meituan.msc.modules.reporter.g.a(Abi64TitansCompat.TAG, str);
        }
    }
}
