package com.sankuai.meituan.mapsdk.maps;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum CameraMapGestureType {
    NONE,
    PAN,
    PINCH,
    DOUBLE_TAP,
    ROTATE,
    TILT;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    CameraMapGestureType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d9c31af1f3199a5c9ba0ea34d749698", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d9c31af1f3199a5c9ba0ea34d749698");
        }
    }

    public static CameraMapGestureType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be83ffeee452c3dd7a448100cffbec38", RobustBitConfig.DEFAULT_VALUE) ? (CameraMapGestureType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be83ffeee452c3dd7a448100cffbec38") : (CameraMapGestureType) Enum.valueOf(CameraMapGestureType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CameraMapGestureType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00b98c690497d56195c7b54a91248926", RobustBitConfig.DEFAULT_VALUE) ? (CameraMapGestureType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00b98c690497d56195c7b54a91248926") : (CameraMapGestureType[]) values().clone();
    }
}
