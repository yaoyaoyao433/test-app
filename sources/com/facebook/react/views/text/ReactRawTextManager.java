package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ao;
/* compiled from: ProGuard */
@ReactModule(name = "RCTRawText")
/* loaded from: classes.dex */
public class ReactRawTextManager extends ViewManager<View, ReactRawTextShadowNode> {
    @VisibleForTesting
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTRawText";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(ao aoVar) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends ReactRawTextShadowNode> getShadowNodeClass() {
        return ReactRawTextShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactRawTextShadowNode createShadowNodeInstance() {
        return new ReactRawTextShadowNode();
    }
}
