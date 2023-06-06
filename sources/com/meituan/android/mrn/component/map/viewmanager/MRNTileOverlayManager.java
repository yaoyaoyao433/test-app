package com.meituan.android.mrn.component.map.viewmanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.view.childview.tile.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nonnull;
/* loaded from: classes2.dex */
public class MRNTileOverlayManager extends ViewGroupManager<b> {
    public static final String EVENT_ON_ON_TILE_LOAD = "onTileLoad";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public b createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "433580626d961190886e9e09b913a73b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "433580626d961190886e9e09b913a73b") : new b(aoVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d01a92d41373c1cb76cc2eda32cd30f3", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d01a92d41373c1cb76cc2eda32cd30f3") : c.b().a(EVENT_ON_ON_TILE_LOAD, c.a("registrationName", EVENT_ON_ON_TILE_LOAD)).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNTileOverlay";
    }

    @ReactProp(name = "config")
    public void setConfig(b bVar, ReadableMap readableMap) {
        Object[] objArr = {bVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3250e6f216bcd6e86edc6c72147a08c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3250e6f216bcd6e86edc6c72147a08c");
        } else {
            bVar.setConfig(readableMap);
        }
    }
}
