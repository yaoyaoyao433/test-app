package com.facebook.react.bridge;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class JSIModuleHolder {
    private JSIModule mModule;
    private final JSIModuleSpec mSpec;

    public JSIModuleHolder(JSIModuleSpec jSIModuleSpec) {
        this.mSpec = jSIModuleSpec;
    }

    public JSIModule getJSIModule() {
        if (this.mModule == null) {
            synchronized (this) {
                if (this.mModule != null) {
                    return this.mModule;
                }
                this.mModule = this.mSpec.getJSIModuleProvider().get();
                this.mModule.initialize();
            }
        }
        return this.mModule;
    }

    public void notifyJSInstanceDestroy() {
        if (this.mModule != null) {
            this.mModule.onCatalystInstanceDestroy();
        }
    }
}
