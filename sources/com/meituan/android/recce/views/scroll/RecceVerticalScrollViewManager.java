package com.meituan.android.recce.views.scroll;

import android.view.View;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.scroll.e;
import com.meituan.android.recce.mrn.uimanager.RecceLayoutShadowNode;
import com.meituan.android.recce.mrn.uimanager.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceVerticalScrollViewManager extends ReactScrollViewManager implements b {
    public static final String REACT_CLASS = "RecceScrollView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.views.scroll.ReactScrollViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public RecceVerticalScrollViewVisitor getVisitor(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe9ad749e8684650a30f14717edd72ff", RobustBitConfig.DEFAULT_VALUE) ? (RecceVerticalScrollViewVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe9ad749e8684650a30f14717edd72ff") : new RecceVerticalScrollViewVisitor((e) view, this);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewManager, com.facebook.react.uimanager.ViewManager
    public e createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "938b669d163088467aabdf389ae8140a", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "938b669d163088467aabdf389ae8140a") : super.createViewInstance(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "200007d5d1b6cc6bfc838fc388e90be0", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "200007d5d1b6cc6bfc838fc388e90be0") : new RecceLayoutShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return RecceLayoutShadowNode.class;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public void recceOnAfterUpdateTransaction(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "745ed0ed364eff95ebb3c1709c11e77c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "745ed0ed364eff95ebb3c1709c11e77c");
        } else {
            onAfterUpdateTransaction((e) view);
        }
    }
}
