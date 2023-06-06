package com.sankuai.meituan.mapsdk.maps;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes4.dex */
public abstract class OnCameraChangeExtraListener implements MTMap.OnCameraChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void onCameraChange(CameraPosition cameraPosition, boolean z);

    public abstract void onCameraChangeFinish(CameraPosition cameraPosition, boolean z);

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
    public final void onCameraChange(CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c24df1d4fdbbe14e9ede87270b155f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c24df1d4fdbbe14e9ede87270b155f4");
        } else {
            onCameraChange(cameraPosition, false);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
    public final void onCameraChangeFinish(CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "128113962d802d4bb851762be6ba2024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "128113962d802d4bb851762be6ba2024");
        } else {
            onCameraChangeFinish(cameraPosition, false);
        }
    }
}
