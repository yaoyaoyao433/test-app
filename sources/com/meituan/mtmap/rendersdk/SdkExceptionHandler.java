package com.meituan.mtmap.rendersdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SdkExceptionHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void handleException(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd78a41a346a46d2932bd5212a25fe41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd78a41a346a46d2932bd5212a25fe41");
        } else {
            String.format("Unhandled throwable: %s", th.getMessage());
        }
    }
}
