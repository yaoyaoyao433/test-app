package com.meituan.metrics.sys;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StorageStatus {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static long getInternalTotalStorageSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2bcff76165aa588a65053a18eb4e88d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2bcff76165aa588a65053a18eb4e88d6")).longValue();
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getTotalBytes();
        }
        return statFs.getBlockSize() * statFs.getBlockCount();
    }

    public static long getInternalAvailableStorageSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "07ddd76a741a0944f01e409584ba3f15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "07ddd76a741a0944f01e409584ba3f15")).longValue();
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getAvailableBytes();
        }
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }
}
