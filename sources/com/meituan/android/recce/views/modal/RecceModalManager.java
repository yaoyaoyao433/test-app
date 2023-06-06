package com.meituan.android.recce.views.modal;

import android.content.DialogInterface;
import android.graphics.Point;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ag;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.ao;
import com.meituan.android.recce.events.f;
import com.meituan.android.recce.mrn.uimanager.ReactBaseViewGroupManager;
import com.meituan.android.recce.props.gens.PropVisitor;
import com.meituan.android.recce.props.gens.RequestClose;
import com.meituan.android.recce.views.base.RecceUIManagerUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceModalManager extends ReactBaseViewGroupManager<RecceModalView> {
    public static final String REACT_CLASS = "RecceModal";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NonNull ao aoVar, @NonNull RecceModalView recceModalView) {
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public RecceModalView createViewInstance(@NonNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ee40b8d84cab9e80ed7e3c095d9c9b4", RobustBitConfig.DEFAULT_VALUE) ? (RecceModalView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ee40b8d84cab9e80ed7e3c095d9c9b4") : new RecceModalView(aoVar);
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public PropVisitor<Void> getVisitor(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c79cb04bfe991686100799eacc8732e", RobustBitConfig.DEFAULT_VALUE) ? (PropVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c79cb04bfe991686100799eacc8732e") : new RecceModalVisitor((RecceModalView) view, this);
    }

    @Override // com.meituan.android.recce.mrn.uimanager.ReactBaseViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return RecceModalShadowNode.class;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.ReactBaseViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2159e11c3ff854f6252d6e1c6288aed", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2159e11c3ff854f6252d6e1c6288aed") : new RecceModalShadowNode();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull RecceModalView recceModalView) {
        Object[] objArr = {recceModalView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2141ebc44b0176c23c243d225f5a615", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2141ebc44b0176c23c243d225f5a615");
            return;
        }
        super.onAfterUpdateTransaction((RecceModalManager) recceModalView);
        recceModalView.showOrUpdate();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NonNull RecceModalView recceModalView, ag agVar, @Nullable an anVar) {
        Object[] objArr = {recceModalView, agVar, anVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d031adb090e375a1c0c40aefa7f17417", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d031adb090e375a1c0c40aefa7f17417");
        }
        Point modalHostSize = RecceModalHelper.getModalHostSize(recceModalView.getContext());
        recceModalView.updateState(anVar, modalHostSize.x, modalHostSize.y);
        return null;
    }

    public void show(RecceModalView recceModalView, boolean z) {
        Object[] objArr = {recceModalView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f945e6230caf7f1cc8e7fd572fb6907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f945e6230caf7f1cc8e7fd572fb6907");
        } else if (z) {
            recceModalView.showOrUpdate();
        } else {
            recceModalView.onDropInstance();
        }
    }

    public void handleBackKey(RecceModalView recceModalView) {
        Object[] objArr = {recceModalView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ceb0c1b65e154f65ae5e5dd0ac593b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ceb0c1b65e154f65ae5e5dd0ac593b2a");
        } else {
            recceModalView.setOnRequestCloseListener(RecceModalManager$$Lambda$1.lambdaFactory$(recceModalView));
        }
    }

    public static /* synthetic */ void lambda$handleBackKey$0(RecceModalView recceModalView, DialogInterface dialogInterface) {
        Object[] objArr = {recceModalView, dialogInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cced7e3a7187918995a255b2a92e6d35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cced7e3a7187918995a255b2a92e6d35");
        } else {
            RecceUIManagerUtils.getRecceEventDispatcher(recceModalView).a(f.a(recceModalView.getId(), 143, RequestClose.LOWER_CASE_NAME));
        }
    }

    public void handleShowEvent(RecceModalView recceModalView) {
        Object[] objArr = {recceModalView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48b4aa496adabd511e013df4b52e6e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48b4aa496adabd511e013df4b52e6e6a");
        } else {
            recceModalView.setOnShowListener(RecceModalManager$$Lambda$2.lambdaFactory$(recceModalView));
        }
    }

    public static /* synthetic */ void lambda$handleShowEvent$1(RecceModalView recceModalView, DialogInterface dialogInterface) {
        Object[] objArr = {recceModalView, dialogInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6ae9d2867e694adfba5067f31daf1575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6ae9d2867e694adfba5067f31daf1575");
        } else {
            RecceUIManagerUtils.getRecceEventDispatcher(recceModalView).a(f.a(recceModalView.getId(), 138, "show"));
        }
    }
}
