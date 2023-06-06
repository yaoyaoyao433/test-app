package com.sankuai.model.utils;

import android.os.Environment;
import android.os.StatFs;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Utils {
    private static final long MIN_DATA_BLOCK_SIZE = 3145728;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean hasSdcard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fdfac8838da92ef4cca325748800e4f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fdfac8838da92ef4cca325748800e4f")).booleanValue() : Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isSdcardFull() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "abba9e431a0f57ce11744227396aad4b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "abba9e431a0f57ce11744227396aad4b")).booleanValue();
        }
        if (Environment.getExternalStorageState().equals("mounted")) {
            return checkFull(Environment.getExternalStorageDirectory().getAbsolutePath());
        }
        return true;
    }

    private static boolean checkFull(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19f8a06655874e16f884ab3dddaca6e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19f8a06655874e16f884ab3dddaca6e1")).booleanValue();
        }
        try {
            StatFs statFs = new StatFs(str);
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks()) < MIN_DATA_BLOCK_SIZE;
        } catch (Throwable unused) {
            return false;
        }
    }
}
