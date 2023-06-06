package com.sankuai.meituan.mapsdk.maps.interfaces;

import android.support.annotation.Nullable;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface h extends l {
    @Nullable
    List<LatLng> getPoints();

    int getRadius();

    void updateHeatOverlay(HeatOverlayOptions heatOverlayOptions);
}
