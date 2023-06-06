package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.MarkerInfo;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class nk extends MarkerInfo implements mr {
    public nk(LatLng latLng, String str) {
        super(latLng.getLatitude(), latLng.getLongitude(), str);
    }

    public nk(double d, double d2, String str) {
        super(d, d2, str);
    }
}
