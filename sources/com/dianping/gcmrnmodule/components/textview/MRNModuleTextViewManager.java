package com.dianping.gcmrnmodule.components.textview;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleTextViewManager.REACT_TEXT_CLASS)
/* loaded from: classes.dex */
public class MRNModuleTextViewManager extends ReactViewManager {
    protected static final String REACT_TEXT_CLASS = "GCMRNTextView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_TEXT_CLASS;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public b createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82c59f729a7e28688371629c2d8f13f4", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82c59f729a7e28688371629c2d8f13f4") : new b(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public MRNModuleTextViewShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3f5193fd3a8903ef207e5e3c25884e0", RobustBitConfig.DEFAULT_VALUE) ? (MRNModuleTextViewShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3f5193fd3a8903ef207e5e3c25884e0") : new MRNModuleTextViewShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<MRNModuleTextViewShadowNode> getShadowNodeClass() {
        return MRNModuleTextViewShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(f fVar, Object obj) {
        Object[] objArr = {fVar, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b74cea53b4cc569b7578b7ca5f81e03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b74cea53b4cc569b7578b7ca5f81e03");
            return;
        }
        super.updateExtraData((MRNModuleTextViewManager) fVar, obj);
        if ((fVar instanceof b) && (obj instanceof a)) {
            ((b) fVar).a((a) obj);
        }
    }
}
