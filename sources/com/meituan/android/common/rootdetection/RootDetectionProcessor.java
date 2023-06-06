package com.meituan.android.common.rootdetection;

import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
@Deprecated
/* loaded from: classes2.dex */
public class RootDetectionProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public static int getHasMalWare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0d95eb0abe83c831f7c5d8141ee4d11b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0d95eb0abe83c831f7c5d8141ee4d11b")).intValue() : MTGuard.hasMalware() ? 1 : 0;
    }

    @Deprecated
    public static int getIsRoot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c3741352f61b27574cf3e09cfa04ff8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c3741352f61b27574cf3e09cfa04ff8")).intValue() : MTGuard.isRoot() ? 1 : 0;
    }

    @Deprecated
    public static void startDetection() {
    }
}
