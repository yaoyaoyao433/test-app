package com.sankuai.meituan.mapsdk.maps.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CircleHoleOptions extends BaseHoleOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LatLng a;
    private double b;

    public LatLng getCenter() {
        return this.a;
    }

    public CircleHoleOptions center(@NonNull LatLng latLng) {
        this.a = latLng;
        return this;
    }

    public double getRadius() {
        return this.b;
    }

    public CircleHoleOptions radius(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "812cbd976633600149bca6ad912965b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (CircleHoleOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "812cbd976633600149bca6ad912965b1");
        }
        this.b = d;
        return this;
    }
}
