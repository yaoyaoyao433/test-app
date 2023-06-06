package com.meituan.android.legwork.mrn.view.mapAnchor;

import android.support.annotation.NonNull;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.legwork.ui.util.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = BMLWOnceAnimViewManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class BMLWOnceAnimViewManager extends SimpleViewManager<OnceAnimImageView> {
    @VisibleForTesting
    public static final String REACT_CLASS = "BMLWOnceAnimView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public OnceAnimImageView createViewInstance(@NonNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58b85891893ce0fabc5cd1b418d4556a", RobustBitConfig.DEFAULT_VALUE) ? (OnceAnimImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58b85891893ce0fabc5cd1b418d4556a") : new OnceAnimImageView(aoVar);
    }

    @ReactProp(name = "url")
    public void setImageUrl(OnceAnimImageView onceAnimImageView, String str) {
        Object[] objArr = {onceAnimImageView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4196bbedb45f300137deb76bfd76806c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4196bbedb45f300137deb76bfd76806c");
        } else {
            d.a(onceAnimImageView, str);
        }
    }
}
