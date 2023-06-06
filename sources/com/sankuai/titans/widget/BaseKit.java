package com.sankuai.titans.widget;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Formatter;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseKit {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String formatTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64f47fc72200bb9b6ebb4027e6d8dc96", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64f47fc72200bb9b6ebb4027e6d8dc96");
        }
        if (j <= 0 || j >= 86400000) {
            return "00:00";
        }
        long j2 = j / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
        return j5 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static boolean isFileExists(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e75e93ed98e86d88d0ad04e7305ec53f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e75e93ed98e86d88d0ad04e7305ec53f")).booleanValue();
        }
        if (str == null || str.trim().length() == 0) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int getSDKVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1f14ca4000cc3cf3d628115ec3a6af4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1f14ca4000cc3cf3d628115ec3a6af4")).intValue();
        }
        if (Build.VERSION.CODENAME.charAt(0) == 'Q') {
            return 29;
        }
        return Build.VERSION.SDK_INT;
    }
}
