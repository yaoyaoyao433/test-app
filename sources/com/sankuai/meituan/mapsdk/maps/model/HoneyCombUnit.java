package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class HoneyCombUnit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final LatLng a;
    private final double b;
    private final WeightedLatLng[] c;

    public HoneyCombUnit(LatLng latLng, double d, WeightedLatLng[] weightedLatLngArr) {
        Object[] objArr = {latLng, Double.valueOf(d), weightedLatLngArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "555778d2cca4283d75bfb5f6c545471d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "555778d2cca4283d75bfb5f6c545471d");
            return;
        }
        this.a = latLng;
        this.b = d;
        this.c = weightedLatLngArr;
    }

    public final LatLng getCenter() {
        return this.a;
    }

    public final double getIntensity() {
        return this.b;
    }

    public final WeightedLatLng[] getNodes() {
        return this.c;
    }
}
