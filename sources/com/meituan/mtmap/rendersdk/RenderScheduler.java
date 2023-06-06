package com.meituan.mtmap.rendersdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class RenderScheduler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isRenderReady;
    private long nativePtr;

    public static native long nativeGetCurrent();

    public native void finalize() throws Throwable;

    public native void nativeInitialize(RenderScheduler renderScheduler);

    public native void nativeMakeCurrent();

    public native void nativeStop();

    public abstract void queueEvent(Runnable runnable);

    public RenderScheduler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "175e08655548414dd24d5825dd2562ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "175e08655548414dd24d5825dd2562ec");
            return;
        }
        this.isRenderReady = false;
        try {
            if (!InnerInitializer.canNativeBeUsed("RenderScheduler.RenderScheduler")) {
                this.isRenderReady = false;
                return;
            }
            nativeInitialize(this);
            this.isRenderReady = true;
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public boolean isRenderReady() {
        return this.isRenderReady && this.nativePtr != 0;
    }

    public void makeSchedulerCurrent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6796e538e6a09b6460f91daf0a1e91f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6796e538e6a09b6460f91daf0a1e91f3");
            return;
        }
        try {
            if (InnerInitializer.canNativeBeUsed("RenderScheduler.RenderScheduler") && this.nativePtr != 0) {
                nativeMakeCurrent();
            }
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01fffcfa2a6d806444737fc1400b919f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01fffcfa2a6d806444737fc1400b919f");
            return;
        }
        try {
            if (InnerInitializer.canNativeBeUsed("RenderScheduler.RenderScheduler") && this.nativePtr != 0) {
                nativeStop();
            }
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public boolean currentThreadInScheduler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbcf26430ffd3ae9f9a6d4bd8bbf503f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbcf26430ffd3ae9f9a6d4bd8bbf503f")).booleanValue();
        }
        try {
            if (InnerInitializer.canNativeBeUsed("RenderScheduler.RenderScheduler") && this.nativePtr != 0) {
                return this.nativePtr == nativeGetCurrent();
            }
            return false;
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return false;
        }
    }

    private void queueEvent(RenderRunnable renderRunnable) {
        Object[] objArr = {renderRunnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12af6c8f95873ba2263b85d239fc1483", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12af6c8f95873ba2263b85d239fc1483");
        } else {
            queueEvent((Runnable) renderRunnable);
        }
    }
}
