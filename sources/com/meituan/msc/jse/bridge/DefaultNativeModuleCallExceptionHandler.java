package com.meituan.msc.jse.bridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DefaultNativeModuleCallExceptionHandler implements NativeModuleCallExceptionHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.msc.jse.bridge.NativeModuleCallExceptionHandler
    public void handleException(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb1c70d8cdcc1328e7fda3e8ec5d49c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb1c70d8cdcc1328e7fda3e8ec5d49c7");
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }
}
