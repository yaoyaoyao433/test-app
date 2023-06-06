package com.sankuai.titans.protocol.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CacheDirUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getCacheDirPath(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9cbaf00e0dc3b43c741660f7d4599388", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9cbaf00e0dc3b43c741660f7d4599388");
        }
        if (context == null) {
            return null;
        }
        return context.getCacheDir().getPath();
    }

    public static String getCacheDirAbsolutePath(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "190de629a3cd3aea7c03ef88bb133d89", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "190de629a3cd3aea7c03ef88bb133d89");
        }
        if (context == null) {
            return null;
        }
        return context.getCacheDir().getAbsolutePath();
    }

    public static File getExternalStorageDir() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5996fc383015c64f135f253175a5dcd0", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5996fc383015c64f135f253175a5dcd0") : Environment.getExternalStorageDirectory();
    }

    public static String getDataDir(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53e8ffc5b4769244935a8282b3bd8a86", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53e8ffc5b4769244935a8282b3bd8a86");
        }
        if (context == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return context.getDataDir().getAbsolutePath();
    }
}
