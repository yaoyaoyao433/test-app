package com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer;

import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleBaseWrapperShadowView;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleViewsContainerManager.REACT_CLASS)
/* loaded from: classes.dex */
public class MRNModuleViewsContainerManager extends MRNModuleBaseViewGroupManager<l> {
    protected static final String REACT_CLASS = "MRNModuleViewsContainerWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public l createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b40f32377f154563f47cf366520b39e6", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b40f32377f154563f47cf366520b39e6") : new l(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a19140f367a6b79b853c1e43458d6a0", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a19140f367a6b79b853c1e43458d6a0") : new MRNModuleBaseWrapperShadowView();
    }
}
