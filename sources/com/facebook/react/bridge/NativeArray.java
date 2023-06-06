package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public abstract class NativeArray implements NativeArrayInterface {
    @DoNotStrip
    private HybridData mHybridData;

    @Override // com.facebook.react.bridge.NativeArrayInterface
    public native String toString();

    static {
        ReactBridge.staticInit();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
