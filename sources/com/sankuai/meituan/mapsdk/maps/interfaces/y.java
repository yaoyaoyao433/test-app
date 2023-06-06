package com.sankuai.meituan.mapsdk.maps.interfaces;

import android.location.Location;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface y {

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes4.dex */
    public interface a {
        @Deprecated
        void onLocationChanged(Location location);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b extends a {
        void onLocationChanged(MapLocation mapLocation);
    }

    void a();

    void a(a aVar);
}
