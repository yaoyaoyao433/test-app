package com.meituan.android.uptodate.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static String b = "FileSignatureUtils ";

    public static String a(Context context, File file) {
        Object[] objArr = {context, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b724b0f9bf324d3bc8b36a685bad699d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b724b0f9bf324d3bc8b36a685bad699d");
        }
        try {
            return a(b(context, file));
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private static String a(Signature[] signatureArr) {
        Object[] objArr = {signatureArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89e0569427749cd885875ebea1aca7cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89e0569427749cd885875ebea1aca7cb");
        }
        try {
            for (Signature signature : signatureArr) {
                byte[] byteArray = signature.toByteArray();
                if (byteArray != null) {
                    return a.a(byteArray);
                }
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    private static Signature[] b(Context context, File file) {
        Object[] objArr = {context, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "487021772734d2f0f372224d97566148", RobustBitConfig.DEFAULT_VALUE)) {
            return (Signature[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "487021772734d2f0f372224d97566148");
        }
        PackageManager packageManager = context.getPackageManager();
        if (file.exists()) {
            try {
                PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), 64);
                packageArchiveInfo.applicationInfo.sourceDir = file.getAbsolutePath();
                packageArchiveInfo.applicationInfo.publicSourceDir = file.getAbsolutePath();
                return packageArchiveInfo.signatures;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
