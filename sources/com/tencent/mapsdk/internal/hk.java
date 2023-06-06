package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.tencentmap.mapsdk.maps.model.ITranslateAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hk extends hf implements ITranslateAnimation {
    public hk(LatLng latLng) {
        GeoPoint from = GeoPoint.from(latLng);
        if (this.a == null) {
            this.a = new ib(from);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public final void setDuration(long j) {
        if (this.a == null) {
            return;
        }
        this.a.a(j);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public final void setInterpolator(Interpolator interpolator) {
        if (this.a == null || interpolator == null) {
            return;
        }
        this.a.f = interpolator;
    }
}
