package com.dianping.gcmrnmodule.components.touchbackground;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.view.ReactViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleTouchViewManager.REACT_TEXT_CLASS)
/* loaded from: classes.dex */
public class MRNModuleTouchViewManager extends ReactViewManager {
    protected static final String REACT_TEXT_CLASS = "GCMRNTouchBackground";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_TEXT_CLASS;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7578d7f8e149d1c5c0200078357ab5d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7578d7f8e149d1c5c0200078357ab5d") : new a(aoVar);
    }
}
