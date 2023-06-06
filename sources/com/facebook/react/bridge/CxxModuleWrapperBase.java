package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class CxxModuleWrapperBase implements NativeModule {
    @DoNotStrip
    private HybridData mHybridData;

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public native String getName();

    @Override // com.facebook.react.bridge.NativeModule
    public void initialize() {
    }

    static {
        ReactBridge.staticInit();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mHybridData.resetNative();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CxxModuleWrapperBase(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    protected void resetModule(HybridData hybridData) {
        if (hybridData != this.mHybridData) {
            this.mHybridData.resetNative();
            this.mHybridData = hybridData;
        }
    }
}
