package com.meituan.msc.common.utils;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p {
    public static ChangeQuickRedirect a;

    public static boolean a(String str, File file) {
        Object[] objArr = {str, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "857f23ecf4496c5d3d89ff2e7107761a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "857f23ecf4496c5d3d89ff2e7107761a")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return true;
        }
        try {
            return a(new File(str).getCanonicalFile(), file.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean a(File file, File file2) {
        while (true) {
            Object[] objArr = {file, file2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ef94d1ba58535ae25b587caaefff94f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ef94d1ba58535ae25b587caaefff94f")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60f15b98c62ecef52c6bff4973f70027", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60f15b98c62ecef52c6bff4973f70027")).booleanValue();
        }
        DioFile i = dioFile.i();
        Object[] objArr2 = {i, file};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9cac63e58be99d003ab0fb7ebd05c386", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9cac63e58be99d003ab0fb7ebd05c386")).booleanValue();
        }
        if (i == null || TextUtils.equals(i.g(), "")) {
            return false;
        }
        File d = i.d();
        if (file.equals(d)) {
            return true;
        }
        if (d == null) {
            com.meituan.msc.modules.reporter.g.a("FileScope", "localFile of DioFile is null: " + i.g());
            return false;
        }
        return a(d.getParentFile(), file);
    }
}
