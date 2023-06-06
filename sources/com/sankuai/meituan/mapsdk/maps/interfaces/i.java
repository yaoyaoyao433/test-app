package com.sankuai.meituan.mapsdk.maps.interfaces;

import com.sankuai.meituan.mapsdk.maps.model.HoneyCombOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombUnit;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface i extends l {
    HoneyCombUnit getUnit(LatLng latLng);

    void setAlpha(float f);

    void setLevel(int i);

    void updateHoneyCombOverlay(HoneyCombOverlayOptions honeyCombOverlayOptions);
}
