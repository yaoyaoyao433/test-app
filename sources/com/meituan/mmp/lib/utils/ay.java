package com.meituan.mmp.lib.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ay {
    public static ChangeQuickRedirect a;

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b4801e0b7488744b72b189f6c4e7550", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b4801e0b7488744b72b189f6c4e7550");
        }
        return f.a(context, "hera") + "/";
    }

    public static File b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcfec90756584b8c62282ea1ba4f1bef", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcfec90756584b8c62282ea1ba4f1bef");
        }
        File file = new File(a(context), "framework");
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    private static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f3cfa62f579ed34ff15a98afb81582e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f3cfa62f579ed34ff15a98afb81582e");
        }
        return a(context) + "app/";
    }

    public static File a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb093460f3d0efa025b8dbe9ac9fdb22", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb093460f3d0efa025b8dbe9ac9fdb22");
        }
        File file = new File(c(context), str);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    public static File b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a39e9bbf49a7bf08b271ba5fc349fafd", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a39e9bbf49a7bf08b271ba5fc349fafd");
        }
        File file = new File(a(context, str), DefaultHeaderService.KEY_STORE);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    public static File c(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "860a2be6dc1320a4c7f8f8595f97af98", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "860a2be6dc1320a4c7f8f8595f97af98");
        }
        File file = new File(a(context, str), "temp");
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    public static File d(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf438538461ba7e3b091f1c37e97ad74", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf438538461ba7e3b091f1c37e97ad74");
        }
        File file = new File(a(context, str), "usr");
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }
}
