package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public abstract class NativeMap {
    @DoNotStrip
    private HybridData mHybridData;

    public native String toString();

    static {
        ReactBridge.staticInit();
    }

    public NativeMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
