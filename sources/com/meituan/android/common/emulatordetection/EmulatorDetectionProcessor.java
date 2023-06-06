package com.meituan.android.common.emulatordetection;

import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
@Deprecated
/* loaded from: classes2.dex */
public class EmulatorDetectionProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public static String getEmulatorInfo() {
        return "";
    }

    @Deprecated
    public static int getIsEmulator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0fe50d8e2649e76cae533c5731aea4c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0fe50d8e2649e76cae533c5731aea4c")).intValue() : MTGuard.isEmu() ? 1 : 0;
    }

    @Deprecated
    public static void startDetection() {
    }
}
