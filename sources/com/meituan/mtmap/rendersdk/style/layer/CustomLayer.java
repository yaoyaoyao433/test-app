package com.meituan.mtmap.rendersdk.style.layer;

import com.meituan.mtmap.rendersdk.InnerInitializer;
import com.meituan.mtmap.rendersdk.SdkExceptionHandler;
import com.meituan.mtmap.rendersdk.style.layer.Layer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CustomLayer {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long nativePtr;

    public native void finalize() throws Throwable;

    public native void nativeInitialize(CustomLayer customLayer, int i, String str, String str2);

    public native void nativeSetOrder(float f, int i);

    public void onClean() {
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5232edea31529f10b84bf47efe34615a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5232edea31529f10b84bf47efe34615a");
        }
    }

    public void onDraw(CustomDrawParameters customDrawParameters) {
    }

    public void onInit() {
    }

    public CustomLayer(Layer.LayerType layerType, String str, String str2) {
        Object[] objArr = {layerType, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eafaf27174f2c2fe28c6daabfbdab045", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eafaf27174f2c2fe28c6daabfbdab045");
            return;
        }
        try {
            if (InnerInitializer.canNativeBeUsed("CustomLayer.CustomLayer")) {
                nativeInitialize(this, layerType.ordinal(), str, str2);
            }
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public void setOrder(float f, Layer.LayerOrderType layerOrderType) {
        Object[] objArr = {Float.valueOf(f), layerOrderType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3601f167187c9ad32e4952e6e37763b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3601f167187c9ad32e4952e6e37763b4");
            return;
        }
        try {
            if (InnerInitializer.canNativeBeUsed("CustomLayer.setOrder") && this.nativePtr != 0) {
                nativeSetOrder(f, layerOrderType.value());
            }
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }
}
