package com.meituan.mmp.lib.web;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.main.MMPEnvHelper;
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
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1722a1199ec9c0985f57713580f8fee1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1722a1199ec9c0985f57713580f8fee1");
        } else if (context == null) {
        } else {
            if (a()) {
                a("obliterate abi is not changed");
                return;
            }
            try {
                a("delete file start");
                context.getApplicationContext().getSharedPreferences("WebViewChromiumPrefs", 0).edit().clear().apply();
                File file = new File(ContextCompat.getDataDir(context) + File.separator + "app_webview" + File.separator + "GPUCache");
                File file2 = new File(ContextCompat.getDataDir(context) + File.separator + "app_webview" + File.separator + "Default" + File.separator + "GPUCache");
                if (a(file) && a(file2) && b(context) && c(context)) {
                    c();
                }
            } catch (Exception e) {
                a(e.getMessage());
            }
        }
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb604f45ab37b749c616505bddcaab78", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb604f45ab37b749c616505bddcaab78")).booleanValue();
        }
        String string = b().getString("deleted_gpu_cache_app_abi", null);
        if (string == null && !ProcessUtils.is64Bit()) {
            a("保持32位架构不变，不清除缓存");
            return true;
        } else if (TextUtils.equals("64", string) && ProcessUtils.is64Bit()) {
            a("32位升级到64位架构后，abi保持不变，不清除缓存");
            return true;
        } else {
            a("64位降级到32位架构后，abi保持不变，不清除缓存");
            return TextUtils.equals("32", string) && !ProcessUtils.is64Bit();
        }
    }

    @NonNull
    private static SharedPreferences b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3024b1d01065acfcef75da049fa6823", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3024b1d01065acfcef75da049fa6823") : MMPEnvHelper.getSharedPreferences("delete_webview_gpu_cache");
    }

    private static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccda6eef066641ad80d76edf8d332e28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccda6eef066641ad80d76edf8d332e28");
        } else {
            b().edit().putString("deleted_gpu_cache_app_abi", ProcessUtils.is64Bit() ? "64" : "32").apply();
        }
    }

    private static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52827e7718f8bdb8959d0f484d9abf91", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52827e7718f8bdb8959d0f484d9abf91")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2b1575efdd6f7c73cf01ab64621cec8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2b1575efdd6f7c73cf01ab64621cec8")).booleanValue();
        }
        for (int i = 0; i <= 3; i++) {
            if (!a(new File(ContextCompat.getDataDir(context) + File.separator + "app_webview_" + context.getPackageName() + ":miniApp" + i + File.separator + "Default" + File.separator + "GPUCache"))) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(@NonNull File file) {
        boolean z = true;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b16d5f3eddc9690a6ad60f236a75a3e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b16d5f3eddc9690a6ad60f236a75a3e2")).booleanValue();
        }
        if (file.isDirectory() && file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "393c4de27beaa26c5f9305905c0261b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "393c4de27beaa26c5f9305905c0261b9");
        } else {
            b.a.c(Abi64TitansCompat.TAG, str);
        }
    }
}
