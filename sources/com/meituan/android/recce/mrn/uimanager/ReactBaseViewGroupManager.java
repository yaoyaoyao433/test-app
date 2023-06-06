package com.meituan.android.recce.mrn.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ReactBaseViewGroupManager<T extends ViewGroup> extends ViewGroupManager<T> implements b {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9988e93c6610136e2934844fea32d41", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9988e93c6610136e2934844fea32d41") : new RecceLayoutShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return RecceLayoutShadowNode.class;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public void recceOnAfterUpdateTransaction(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6d44b8baffd2fb3c7ad0528e365589a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6d44b8baffd2fb3c7ad0528e365589a");
        } else {
            onAfterUpdateTransaction((ViewGroup) view);
        }
    }
}
