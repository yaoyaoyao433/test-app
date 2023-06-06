package com.meituan.mmp.lib.update;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.mmp.lib.utils.ay;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p {
    public static ChangeQuickRedirect a;

    public static File a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3efe5d2fbe47143ccde94cca332e0645", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3efe5d2fbe47143ccde94cca332e0645") : b(ay.a(context, str).getAbsolutePath(), PackageLoadReporter.LoadType.INNER);
    }

    public static File a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "433e556ea6328da945d6761cd7c53939", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "433e556ea6328da945d6761cd7c53939") : b(ay.a(context, str).getAbsolutePath(), str2);
    }

    public static File b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "584cff1f8e1a2b4d0242771a7ee63642", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "584cff1f8e1a2b4d0242771a7ee63642") : b(ay.b(context).getAbsolutePath(), str);
    }

    public static File c(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74b9065bbd874bb1601f63cd6598ff8c", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74b9065bbd874bb1601f63cd6598ff8c") : a(ay.a(context, str), "downloadpack");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87b5638f975910890c317d7efa6685e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87b5638f975910890c317d7efa6685e5");
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        sb.append(str2);
        sb.append(MRNBundleManager.MRN_BUNDLE_SUFFIX);
        return c(str, sb.toString()).getAbsolutePath();
    }

    private static File b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1630086d395a7ffa8579920c57fefc9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1630086d395a7ffa8579920c57fefc9c");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/pkgsource/");
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        sb.append(str2);
        File file = new File(sb.toString());
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    private static File c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e1e267e62918ad64ff1ea62bd5b4e6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e1e267e62918ad64ff1ea62bd5b4e6b");
        }
        File file = new File(str, str2);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    private static File a(File file, String str) {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2a8e8663c6e55072ec27f7a3703df14", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2a8e8663c6e55072ec27f7a3703df14");
        }
        File file2 = new File(file, str);
        if (!file2.exists() || !file2.isDirectory()) {
            file2.mkdirs();
        }
        return file2;
    }
}
