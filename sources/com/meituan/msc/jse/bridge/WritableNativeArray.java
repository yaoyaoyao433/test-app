package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static native HybridData initHybrid();

    private native void pushNativeArray(WritableNativeArray writableNativeArray);

    private native void pushNativeMap(WritableNativeMap writableNativeMap);

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public native void pushBoolean(boolean z);

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public native void pushDouble(double d);

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public native void pushInt(int i);

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public native void pushNull();

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public native void pushString(@Nullable String str);

    static {
        ReactBridge.staticInit();
    }

    public WritableNativeArray() {
        super(initHybrid());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a407445b1366535924a46aec1343845", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a407445b1366535924a46aec1343845");
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushArray(@Nullable ReadableArray readableArray) {
        boolean z = true;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b921a68285ca9f1ee1e1ea0030cf2fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b921a68285ca9f1ee1e1ea0030cf2fd");
            return;
        }
        if (readableArray != null && !(readableArray instanceof WritableNativeArray)) {
            z = false;
        }
        a.a(z, "Illegal type provided");
        pushNativeArray((WritableNativeArray) readableArray);
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushMap(@Nullable ReadableMap readableMap) {
        boolean z = true;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72b7c71acfe8c66c390a49101cf6d0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72b7c71acfe8c66c390a49101cf6d0ed");
            return;
        }
        if (readableMap != null && !(readableMap instanceof WritableNativeMap)) {
            z = false;
        }
        a.a(z, "Illegal type provided");
        pushNativeMap((WritableNativeMap) readableMap);
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushArray(@Nullable WritableArray writableArray) {
        Object[] objArr = {writableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "240198bbdbb20a21f26fd9629fe73e33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "240198bbdbb20a21f26fd9629fe73e33");
        } else {
            pushArray((ReadableArray) writableArray);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushMap(@Nullable WritableMap writableMap) {
        Object[] objArr = {writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "018f7d83130deda1b8bc511adb6ed068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "018f7d83130deda1b8bc511adb6ed068");
        } else {
            pushMap((ReadableMap) writableMap);
        }
    }
}
