package com.meituan.android.legwork.mrn.view;

import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BMLWGoodsListContentViewManager extends ViewGroupManager<com.facebook.react.views.view.f> {
    private static final String VIEW_CLASS = "BMLWGoodsListContentView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return VIEW_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public com.facebook.react.views.view.f createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b58dd60a270fdf0474cc1db8307f016", RobustBitConfig.DEFAULT_VALUE) ? (com.facebook.react.views.view.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b58dd60a270fdf0474cc1db8307f016") : new com.facebook.react.views.view.f(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cde454b1f305f667871a25ff047add9a", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cde454b1f305f667871a25ff047add9a") : new NativeMeasureShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return NativeMeasureShadowNode.class;
    }
}
