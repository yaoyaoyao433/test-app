package com.meituan.msc.jse.bridge;

import com.facebook.jni.HybridData;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public abstract class NativeArray implements NativeArrayInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    @DoNotStrip
    private HybridData mHybridData;

    @Override // com.meituan.msc.jse.bridge.NativeArrayInterface
    public native String toString();

    static {
        ReactBridge.staticInit();
    }

    public NativeArray(HybridData hybridData) {
        Object[] objArr = {hybridData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "076a2757345cf74a189cd6d962cef248", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "076a2757345cf74a189cd6d962cef248");
        } else {
            this.mHybridData = hybridData;
        }
    }
}
