package com.meituan.mmp.lib.utils;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q {
    public static ChangeQuickRedirect a;

    public static boolean a(File file, File file2) {
        Object[] objArr = {file, file2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "faf25efbb60b5b76a0f662601c9bd18b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "faf25efbb60b5b76a0f662601c9bd18b")).booleanValue();
        }
        if (file == null) {
            return false;
        }
        try {
            return b(file.getCanonicalFile(), file2.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(String str, File file) {
        Object[] objArr = {str, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eaae2a3d07d87050bc8f185e26169081", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eaae2a3d07d87050bc8f185e26169081")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return true;
        }
        try {
            return b(new File(str).getCanonicalFile(), file.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b35972a3d07b955ae02314e457051592", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b35972a3d07b955ae02314e457051592")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return true;
        }
        try {
            return b(new File(str).getCanonicalFile(), new File(str2).getCanonicalFile());
        } catch (IOException unused) {
            return false;
        }
    }

    private static boolean b(File file, File file2) {
        while (true) {
            Object[] objArr = {file, file2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29d0563884ea6c5f01933585834f64c2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29d0563884ea6c5f01933585834f64c2")).booleanValue();
            }
            if (file == null) {
                return false;
            }
            if (file2.equals(file.getParentFile())) {
                return true;
            }
            file = file.getParentFile();
        }
    }

    public static boolean a(DioFile dioFile, File file) {
        Object[] objArr = {dioFile, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2f8a9cdcf74629a9ac4daed25c921af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2f8a9cdcf74629a9ac4daed25c921af")).booleanValue();
        }
        if (dioFile == null) {
            return false;
        }
        return b(dioFile.i(), file);
    }

    private static boolean b(DioFile dioFile, File file) {
        Object[] objArr = {dioFile, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a36b77e918dd67683f8046dfdd761a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a36b77e918dd67683f8046dfdd761a0")).booleanValue();
        }
        com.meituan.mmp.main.ab.b("tryAccessFile");
        if (dioFile != null) {
            try {
                if (!TextUtils.equals(dioFile.g(), "")) {
                    File d = dioFile.d();
                    if (file.equals(d)) {
                        return true;
                    }
                    if (d == null) {
                        com.meituan.mmp.lib.trace.b.d("FileScope", "localFile of DioFile is null: " + dioFile.g());
                        return false;
                    }
                    return b(d.getParentFile(), file);
                }
            } finally {
                com.meituan.mmp.main.ab.b();
            }
        }
        return false;
    }

    public static void a(IApiCallback iApiCallback) {
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59c73ceebcdd139babcd44264ca28e1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59c73ceebcdd139babcd44264ca28e1b");
            return;
        }
        try {
            iApiCallback.onFail(new JSONObject("{\"errMsg\": \"file scope failed\"}"));
        } catch (JSONException unused) {
        }
    }
}
