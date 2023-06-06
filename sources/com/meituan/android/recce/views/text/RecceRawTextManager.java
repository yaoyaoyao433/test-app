package com.meituan.android.recce.views.text;

import android.view.View;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.text.ReactTextView;
import com.meituan.android.recce.views.annotation.BaseView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@BaseView
/* loaded from: classes3.dex */
public class RecceRawTextManager extends ViewManager<View, RecceRawTextShadowNode> {
    @VisibleForTesting
    public static final String REACT_CLASS = "RCTRawText";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTRawText";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c356be1925f34ed3306fbbecfd8f08d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c356be1925f34ed3306fbbecfd8f08d");
        }
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends RecceRawTextShadowNode> getShadowNodeClass() {
        return RecceRawTextShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public RecceRawTextShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fceb6c55643286db7ec9306f41390f0", RobustBitConfig.DEFAULT_VALUE) ? (RecceRawTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fceb6c55643286db7ec9306f41390f0") : new RecceRawTextShadowNode();
    }
}
