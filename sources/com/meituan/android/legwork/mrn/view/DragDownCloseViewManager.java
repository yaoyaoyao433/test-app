package com.meituan.android.legwork.mrn.view;

import com.facebook.react.uimanager.ao;
import com.facebook.react.views.view.ReactViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DragDownCloseViewManager extends ReactViewManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "DragDownCloseView";
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @Nonnull
    public com.facebook.react.views.view.f createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1d96388dcc55effdb2d7880ba5d82ec", RobustBitConfig.DEFAULT_VALUE) ? (com.facebook.react.views.view.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1d96388dcc55effdb2d7880ba5d82ec") : new a(aoVar);
    }
}
