package com.meituan.android.mrn.component.map.viewmanager.map;

import android.os.SystemClock;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.b;
import com.meituan.android.mrn.component.map.view.map.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.AbstractMapView;
import javax.annotation.Nonnull;
/* loaded from: classes2.dex */
public class MRNTencentMapViewManager extends MRNMapViewManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private b mrnMapExtraProvider;

    public MRNTencentMapViewManager(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3fa7231f09ac1aa202eee9cf212da7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3fa7231f09ac1aa202eee9cf212da7f");
        } else {
            this.mrnMapExtraProvider = bVar;
        }
    }

    @Override // com.meituan.android.mrn.component.map.viewmanager.map.MRNMapViewManager
    @Nonnull
    public AbstractMapView createMapView(ao aoVar, String str, String str2, d dVar, String str3) {
        Object[] objArr = {aoVar, str, str2, dVar, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ca5bec62635a2b725bdb7074191450a", RobustBitConfig.DEFAULT_VALUE) ? (AbstractMapView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ca5bec62635a2b725bdb7074191450a") : new com.meituan.android.mrn.component.map.view.map.b(aoVar, 1, this.mrnMapExtraProvider, SystemClock.elapsedRealtime(), str, str2, dVar, str3);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNTencentMapView";
    }
}
