package com.meituan.mtmap.rendersdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RenderRunnable implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final long nativePtr;

    private native void nativeInitialize();

    private native void nativeRun();

    public native void finalize() throws Throwable;

    public RenderRunnable(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "251d6c751cb366bdf0a05369a36c7e89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "251d6c751cb366bdf0a05369a36c7e89");
        } else {
            this.nativePtr = j;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "633024a8fd889b868f3ca46711d41f33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "633024a8fd889b868f3ca46711d41f33");
        } else if (!InnerInitializer.canNativeBeUsed("RenderRunnable.nativeRun") || this.nativePtr == 0) {
        } else {
            try {
                nativeRun();
            } catch (Throwable th) {
                SdkExceptionHandler.handleException(th);
            }
        }
    }
}
