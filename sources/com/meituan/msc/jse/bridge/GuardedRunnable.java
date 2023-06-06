package com.meituan.msc.jse.bridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class GuardedRunnable implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final NativeModuleCallExceptionHandler mExceptionHandler;

    public abstract void runGuarded();

    @Deprecated
    public GuardedRunnable(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aeefd08b702b1fc7757b70ed1d5a0ca8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aeefd08b702b1fc7757b70ed1d5a0ca8");
        }
    }

    public GuardedRunnable(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        Object[] objArr = {nativeModuleCallExceptionHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "960993cdee6f51126a68f1132b47e2e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "960993cdee6f51126a68f1132b47e2e2");
        } else {
            this.mExceptionHandler = nativeModuleCallExceptionHandler;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cd61895ce2364f8f001180ad4c9332c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cd61895ce2364f8f001180ad4c9332c");
            return;
        }
        try {
            runGuarded();
        } catch (RuntimeException e) {
            this.mExceptionHandler.handleException(e);
        }
    }
}
