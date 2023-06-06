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
public class MRNMTNativeMapViewManager extends MRNMapViewManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private b mrnMapExtraProvider;

    public MRNMTNativeMapViewManager(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e3a46c47cabf7d9380acbf4a18ae824", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e3a46c47cabf7d9380acbf4a18ae824");
        } else {
            this.mrnMapExtraProvider = bVar;
        }
    }

    @Override // com.meituan.android.mrn.component.map.viewmanager.map.MRNMapViewManager
    @Nonnull
    public AbstractMapView createMapView(ao aoVar, String str, String str2, d dVar, String str3) {
        Object[] objArr = {aoVar, str, str2, dVar, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cb0a78db5bf0789371eba78dcf64e38", RobustBitConfig.DEFAULT_VALUE) ? (AbstractMapView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cb0a78db5bf0789371eba78dcf64e38") : new com.meituan.android.mrn.component.map.view.map.b(aoVar, 3, this.mrnMapExtraProvider, SystemClock.elapsedRealtime(), str, str2, dVar, str3);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNMTNativeMapView";
    }
}
