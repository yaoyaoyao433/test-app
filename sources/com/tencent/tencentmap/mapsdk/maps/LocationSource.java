package com.tencent.tencentmap.mapsdk.maps;

import android.location.Location;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface LocationSource {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnLocationChangedListener {
        void onLocationChanged(Location location);
    }

    void activate(OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
