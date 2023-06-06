package com.swmansion.gesturehandler.react;

import android.support.annotation.Nullable;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ao;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = RNGestureHandlerRootViewManager.REACT_CLASS)
/* loaded from: classes6.dex */
public class RNGestureHandlerRootViewManager extends ViewGroupManager<h> {
    public static final String REACT_CLASS = "GestureHandlerRootView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(ao aoVar) {
        return new h(aoVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.c.a("onGestureHandlerEvent", com.facebook.react.common.c.a("registrationName", "onGestureHandlerEvent"), "onGestureHandlerStateChange", com.facebook.react.common.c.a("registrationName", "onGestureHandlerStateChange"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(h hVar) {
        if (hVar.a != null) {
            hVar.a.a();
        }
    }
}
