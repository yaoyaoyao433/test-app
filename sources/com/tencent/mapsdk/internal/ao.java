package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationListener;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ao extends ap, Marker {
    int a();

    void a(Bitmap bitmap);

    void a(TencentMap.OnMarkerClickListener onMarkerClickListener);

    void a(AnimationListener animationListener);

    void a(BitmapDescriptor bitmapDescriptor, BitmapDescriptor bitmapDescriptor2);

    void a(LatLng latLng);

    @Deprecated
    void a(boolean z);

    void b(boolean z);

    boolean b();

    Point c();

    TencentMap.OnMarkerClickListener d();

    List<LatLng> e();

    List<Boundable<eq>> f();

    TencentMap.InfoWindowAdapter g();

    eo h();

    Rect i();
}
