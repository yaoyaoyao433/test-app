package com.meituan.android.recce.views.scroll;

import android.view.View;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.d;
import com.meituan.android.recce.mrn.uimanager.RecceLayoutShadowNode;
import com.meituan.android.recce.mrn.uimanager.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceHorizonScrollViewManager extends ReactHorizontalScrollViewManager implements b {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.views.scroll.ReactHorizontalScrollViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AndroidHorizontalScrollView";
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public RecceHorizonScrollViewVisitor getVisitor(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8eee18b7fd7a37ddb0f7e2b666bef093", RobustBitConfig.DEFAULT_VALUE) ? (RecceHorizonScrollViewVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8eee18b7fd7a37ddb0f7e2b666bef093") : new RecceHorizonScrollViewVisitor((d) view, this);
    }

    @Override // com.facebook.react.views.scroll.ReactHorizontalScrollViewManager, com.facebook.react.uimanager.ViewManager
    public d createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "846fb38ab16db4679f5ef880c087afd3", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "846fb38ab16db4679f5ef880c087afd3") : super.createViewInstance(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bcb65cba0bc128d534a0e4492ec180d", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bcb65cba0bc128d534a0e4492ec180d") : new RecceLayoutShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return RecceLayoutShadowNode.class;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public void recceOnAfterUpdateTransaction(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "231a051dfb5f4a1e2b03e0711a67e0fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "231a051dfb5f4a1e2b03e0711a67e0fe");
        } else {
            onAfterUpdateTransaction((d) view);
        }
    }
}
