package com.meituan.android.mrn.component.map.viewmanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.view.childview.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
/* loaded from: classes2.dex */
public class MRNGroundOverlayManager extends ViewGroupManager<j> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public j createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "530b8f58ff04f75ad55a30dfed03e7ef", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "530b8f58ff04f75ad55a30dfed03e7ef") : new j(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNGroundOverlay";
    }

    @ReactProp(name = "config")
    public void setConfig(j jVar, ReadableMap readableMap) {
        Object[] objArr = {jVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45964820fbda299f3a767393ce8c3579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45964820fbda299f3a767393ce8c3579");
        } else {
            jVar.setConfig(readableMap);
        }
    }
}
