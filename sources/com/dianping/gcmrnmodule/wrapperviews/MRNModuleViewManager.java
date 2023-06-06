package com.dianping.gcmrnmodule.wrapperviews;

import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleShadowView;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.view.ReactViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class MRNModuleViewManager extends ReactViewManager {
    protected static final String REACT_CLASS = "MRNModuleView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public c createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26b50bf305f7e2cdc29b05c57c01c04d", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26b50bf305f7e2cdc29b05c57c01c04d") : new c(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ff0b225dd26cc7e3ba9140f4450d721", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ff0b225dd26cc7e3ba9140f4450d721") : new MRNModuleShadowView();
    }
}
