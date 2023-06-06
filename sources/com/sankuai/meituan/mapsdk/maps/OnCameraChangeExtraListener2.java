package com.sankuai.meituan.mapsdk.maps;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class OnCameraChangeExtraListener2 implements MTMap.OnCameraChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void onCameraChange(CameraPosition cameraPosition, boolean z, CameraMapGestureType cameraMapGestureType);

    public abstract void onCameraChangeFinish(CameraPosition cameraPosition, boolean z, CameraMapGestureType cameraMapGestureType);

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
    public final void onCameraChange(CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aae5dedf0b2ac1dd91b2a47948a8d8c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aae5dedf0b2ac1dd91b2a47948a8d8c5");
        } else {
            onCameraChange(cameraPosition, false, CameraMapGestureType.NONE);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
    public final void onCameraChangeFinish(CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f9ce3e43d76f27dd70628888081d4ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f9ce3e43d76f27dd70628888081d4ef");
        } else {
            onCameraChangeFinish(cameraPosition, false, CameraMapGestureType.NONE);
        }
    }
}
