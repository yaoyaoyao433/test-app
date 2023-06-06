package com.meituan.android.common.weaver.impl.natives;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.ArbiterHook;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FFPNative {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isInit = false;

    public static void init(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37738e647726e6008e333b24842670c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37738e647726e6008e333b24842670c6");
        } else if (isInit) {
        } else {
            isInit = true;
            PagePathHelper.NativePathHelper.init();
            try {
                ArbiterHook.addMTInstrumentation(new FFPInstrument());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
