package com.meituan.android.cashier.oneclick.recce.view.draglist;

import android.support.annotation.NonNull;
import android.view.View;
import com.facebook.react.uimanager.ao;
import com.meituan.android.cashier.oneclick.recce.view.draglist.model.PayModeListItemData;
import com.meituan.android.recce.views.view.RecceViewGroupManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RecceDragListViewManager extends RecceViewGroupManager<a<PayModeListItemData>> implements com.meituan.android.recce.mrn.uimanager.b {
    public static final String REACT_CLASS = "RCTDragListView";
    private static final String TAG = "RCTDragListView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NonNull ao aoVar, @NonNull a<PayModeListItemData> aVar) {
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RCTDragListView";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public a<PayModeListItemData> createViewInstance(@NonNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcd1e36e7a22e98f631569280ebba53d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcd1e36e7a22e98f631569280ebba53d") : new a<>(aoVar);
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public d getVisitor(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34b51f083d051bce6bed6e9cbc39fced", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34b51f083d051bce6bed6e9cbc39fced") : new d((a) view, this);
    }
}
