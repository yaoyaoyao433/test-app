package com.meituan.msc.jse.bridge;

import com.facebook.jni.HybridData;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public abstract class NativeMap {
    public static ChangeQuickRedirect changeQuickRedirect;
    @DoNotStrip
    private HybridData mHybridData;

    public native String toString();

    static {
        ReactBridge.staticInit();
    }

    public NativeMap(HybridData hybridData) {
        Object[] objArr = {hybridData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9039ea7844846f8a73e4e746b10b656c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9039ea7844846f8a73e4e746b10b656c");
        } else {
            this.mHybridData = hybridData;
        }
    }
}
