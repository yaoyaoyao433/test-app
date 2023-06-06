package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hy extends hw {
    public LatLng i;

    public hy(LatLng latLng) {
        this.i = null;
        this.i = latLng;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.mapsdk.internal.hw
    public final void a(float f, Interpolator interpolator) {
        float interpolation = interpolator.getInterpolation(f);
        if (this.h != null) {
            this.h.b(interpolation);
        }
    }

    private LatLng c() {
        return this.i;
    }
}
