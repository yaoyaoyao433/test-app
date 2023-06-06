package com.meituan.android.recce.views.view;

import android.view.View;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ao;
import com.meituan.android.recce.mrn.uimanager.RecceLayoutShadowNode;
import com.meituan.android.recce.mrn.uimanager.b;
import com.meituan.android.recce.props.gens.PropVisitor;
import com.meituan.android.recce.views.annotation.BaseView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@BaseView
/* loaded from: classes3.dex */
public class RecceViewManager extends RecceViewGroupManager<RecceViewGroup> implements b {
    @VisibleForTesting
    public static final String REACT_CLASS = "RecceView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public PropVisitor<Void> getVisitor(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd9aad56e107d3aff2a991d745c581ef", RobustBitConfig.DEFAULT_VALUE) ? (PropVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd9aad56e107d3aff2a991d745c581ef") : new RecceViewGroupManagerVisitor((RecceViewGroup) view, this);
    }

    @Override // com.meituan.android.recce.mrn.uimanager.ReactBaseViewGroupManager, com.meituan.android.recce.mrn.uimanager.b
    public void recceOnAfterUpdateTransaction(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64e4b4e7fc0cbdf04a6e8caf1f85f659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64e4b4e7fc0cbdf04a6e8caf1f85f659");
        } else {
            onAfterUpdateTransaction((RecceViewGroup) view);
        }
    }

    @Override // com.meituan.android.recce.mrn.uimanager.ReactBaseViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91ab1f111cb7f4af8c93c68450c97963", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91ab1f111cb7f4af8c93c68450c97963") : new RecceLayoutShadowNode();
    }

    @Override // com.meituan.android.recce.mrn.uimanager.ReactBaseViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return RecceLayoutShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public RecceViewGroup createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f614893ad7839b40a6161a6093d1ffd", RobustBitConfig.DEFAULT_VALUE) ? (RecceViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f614893ad7839b40a6161a6093d1ffd") : new RecceViewGroup(aoVar);
    }
}
