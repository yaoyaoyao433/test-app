package com.meituan.android.common.unionid.oneid.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogUtils {
    public static final boolean LOG_SWITCH = "1.20.7".endsWith("-SNAPSHOT");
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void i(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e744a1bc3ffa91e59c7b1b713f4396f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e744a1bc3ffa91e59c7b1b713f4396f8");
        }
    }
}
