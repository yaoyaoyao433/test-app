package com.meituan.android.mrn.component.map.viewmanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.view.childview.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
/* loaded from: classes2.dex */
public class MRNHeatMapOverlayManager extends ViewGroupManager<k> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public k createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13fadb619604e7a62d09339750e5e67d", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13fadb619604e7a62d09339750e5e67d") : new k(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNHeatMapOverlay";
    }

    @ReactProp(name = "config")
    public void setConfig(k kVar, ReadableMap readableMap) {
        Object[] objArr = {kVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec75bd0ae2a419e42cc02436a5643e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec75bd0ae2a419e42cc02436a5643e74");
        } else {
            kVar.setConfig(readableMap);
        }
    }
}
