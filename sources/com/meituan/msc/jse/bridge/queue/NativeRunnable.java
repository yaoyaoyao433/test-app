package com.meituan.msc.jse.bridge.queue;

import com.facebook.jni.HybridData;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class NativeRunnable implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final HybridData mHybridData;

    @Override // java.lang.Runnable
    public native void run();

    @DoNotStrip
    public NativeRunnable(HybridData hybridData) {
        Object[] objArr = {hybridData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f51f41381fc908ce9f90894f05110b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f51f41381fc908ce9f90894f05110b6");
        } else {
            this.mHybridData = hybridData;
        }
    }
}
