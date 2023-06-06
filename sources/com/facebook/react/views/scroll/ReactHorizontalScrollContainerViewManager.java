package com.facebook.react.views.scroll;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.view.ReactClippingViewManager;
/* compiled from: ProGuard */
@ReactModule(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager<c> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(ao aoVar) {
        return new c(aoVar);
    }
}
