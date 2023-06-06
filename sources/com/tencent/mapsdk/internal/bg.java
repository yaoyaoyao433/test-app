package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.location.Location;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.maps.LocationSource;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class bg implements ai {
    public aa a;
    BitmapDescriptor f;
    public mn g;
    int h;
    public TencentMap.OnMyLocationClickListener i;
    private LocationSource.OnLocationChangedListener j;
    private BitmapDescriptor n;
    private LocationSource k = null;
    private boolean l = false;
    Circle b = null;
    public TencentMap.OnMyLocationChangeListener c = null;
    MyLocationStyle d = new MyLocationStyle();
    private int m = Color.argb(102, 0, (int) TbsListener.ErrorCode.STARTDOWNLOAD_4, 255);
    public Location e = null;

    public bg(mn mnVar, aa aaVar) {
        this.a = null;
        this.j = null;
        this.g = mnVar;
        this.a = aaVar;
        this.j = h();
    }

    private void g() {
        c();
        this.a = null;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a() {
        if (this.b != null) {
            this.b.setVisible(false);
            this.b.remove();
            this.b = null;
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void b() {
        if (this.l) {
            return;
        }
        this.l = true;
        if (this.j == null) {
            this.j = h();
        }
        this.g.e(false);
        if (this.b != null) {
            this.b.setVisible(true);
        }
        if (this.k != null) {
            this.k.activate(this.j);
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void c() {
        if (this.b != null) {
            this.b.setVisible(false);
            this.b.remove();
            this.b = null;
        }
        if (this.l) {
            this.l = false;
            this.g.e(true);
            this.h = 0;
            this.j = null;
            if (this.k != null) {
                this.k.deactivate();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(LocationSource locationSource) {
        this.k = locationSource;
        if (!this.l || locationSource == null) {
            return;
        }
        this.k.activate(this.j);
    }

    private void b(Location location) {
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        if (this.b == null) {
            CircleOptions circleOptions = new CircleOptions();
            circleOptions.radius(location.getAccuracy()).center(latLng).fillColor(this.d.getFillColor()).strokeColor(this.d.getStrokeColor()).strokeWidth(this.d.getStrokeWidth());
            mn mnVar = this.g;
            this.b = mnVar.J == null ? null : mnVar.J.a(circleOptions);
        }
        if (this.h == 0) {
            BitmapDescriptor myLocationIcon = this.d.getMyLocationIcon();
            if (myLocationIcon == null) {
                myLocationIcon = f();
            }
            Bitmap bitmap = myLocationIcon.getBitmap(this.g.getContext());
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            this.f = myLocationIcon;
            this.h = this.g.a(myLocationIcon.getFormater().getBitmapId(), this.d.getAnchorU(), this.d.getAnchorV());
        }
    }

    final BitmapDescriptor f() {
        if (this.n == null) {
            this.n = BitmapDescriptorFactory.fromAsset(this.g, "navi_marker_location.png");
        }
        return this.n;
    }

    private void a(MyLocationStyle myLocationStyle, Location location) {
        if (location == null || myLocationStyle == null) {
            return;
        }
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        if (this.b != null) {
            this.b.setCenter(latLng);
            this.b.setRadius(location.getAccuracy());
        }
        this.g.a(GeoPoint.from(latLng), 0.0f, 0.0f, false);
        switch (myLocationStyle.getMyLocationType()) {
            case 1:
                this.g.a(location.getBearing());
                return;
            case 2:
                return;
            case 3:
                if (this.a != null) {
                    this.a.a(CameraUpdateFactory.rotateTo(location.getBearing(), this.a.a().tilt));
                    return;
                }
                return;
            default:
                this.g.a(location.getBearing());
                if (this.a != null) {
                    this.a.a(CameraUpdateFactory.newLatLng(latLng));
                    return;
                }
                return;
        }
    }

    private LocationSource.OnLocationChangedListener h() {
        return new LocationSource.OnLocationChangedListener() { // from class: com.tencent.mapsdk.internal.bg.1
            @Override // com.tencent.tencentmap.mapsdk.maps.LocationSource.OnLocationChangedListener
            public final void onLocationChanged(Location location) {
                if (location == null) {
                    return;
                }
                if (bg.this.e != null) {
                    bg.this.e.setLongitude(location.getLongitude());
                    bg.this.e.setLatitude(location.getLatitude());
                    bg.this.e.setAccuracy(location.getAccuracy());
                    bg.this.e.setProvider(location.getProvider());
                    bg.this.e.setTime(location.getTime());
                    bg.this.e.setSpeed(location.getSpeed());
                    bg.this.e.setAltitude(location.getAltitude());
                } else {
                    bg.this.e = new Location(location);
                }
                bg bgVar = bg.this;
                if (location != null) {
                    LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
                    if (bgVar.b == null) {
                        CircleOptions circleOptions = new CircleOptions();
                        circleOptions.radius(location.getAccuracy()).center(latLng).fillColor(bgVar.d.getFillColor()).strokeColor(bgVar.d.getStrokeColor()).strokeWidth(bgVar.d.getStrokeWidth());
                        mn mnVar = bgVar.g;
                        bgVar.b = mnVar.J == null ? null : mnVar.J.a(circleOptions);
                    }
                    if (bgVar.h == 0) {
                        BitmapDescriptor myLocationIcon = bgVar.d.getMyLocationIcon();
                        if (myLocationIcon == null) {
                            myLocationIcon = bgVar.f();
                        }
                        Bitmap bitmap = myLocationIcon.getBitmap(bgVar.g.getContext());
                        if (bitmap != null && !bitmap.isRecycled()) {
                            bgVar.f = myLocationIcon;
                            bgVar.h = bgVar.g.a(myLocationIcon.getFormater().getBitmapId(), bgVar.d.getAnchorU(), bgVar.d.getAnchorV());
                        }
                    }
                    MyLocationStyle myLocationStyle = bgVar.d;
                    if (location != null && myLocationStyle != null) {
                        LatLng latLng2 = new LatLng(location.getLatitude(), location.getLongitude());
                        if (bgVar.b != null) {
                            bgVar.b.setCenter(latLng2);
                            bgVar.b.setRadius(location.getAccuracy());
                        }
                        bgVar.g.a(GeoPoint.from(latLng2), 0.0f, 0.0f, false);
                        switch (myLocationStyle.getMyLocationType()) {
                            case 1:
                                bgVar.g.a(location.getBearing());
                                break;
                            case 2:
                                break;
                            case 3:
                                if (bgVar.a != null) {
                                    bgVar.a.a(CameraUpdateFactory.rotateTo(location.getBearing(), bgVar.a.a().tilt));
                                    break;
                                }
                                break;
                            default:
                                bgVar.g.a(location.getBearing());
                                if (bgVar.a != null) {
                                    bgVar.a.a(CameraUpdateFactory.newLatLng(latLng2));
                                    break;
                                }
                                break;
                        }
                    }
                }
                if (bg.this.c != null) {
                    bg.this.c.onMyLocationChange(location);
                }
            }
        };
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final Location e() {
        if (this.e == null) {
            return null;
        }
        return new Location(this.e);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(MyLocationStyle myLocationStyle) {
        if (myLocationStyle == null) {
            return;
        }
        this.d = myLocationStyle;
        if (this.b != null) {
            this.b.setFillColor(myLocationStyle.getFillColor());
            this.b.setStrokeColor(myLocationStyle.getStrokeColor());
            this.b.setStrokeWidth(myLocationStyle.getStrokeWidth());
        }
        if (this.h == 0 || this.f == null) {
            return;
        }
        BitmapDescriptor myLocationIcon = myLocationStyle.getMyLocationIcon();
        if (myLocationIcon == null) {
            myLocationIcon = f();
        }
        Bitmap bitmap = myLocationIcon.getBitmap(this.g.getContext());
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        String bitmapId = myLocationIcon.getFormater().getBitmapId();
        if (this.f.getFormater().getBitmapId().equals(bitmapId)) {
            return;
        }
        this.f = myLocationStyle.getMyLocationIcon();
        this.h = this.g.a(bitmapId, myLocationStyle.getAnchorU(), myLocationStyle.getAnchorV());
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final boolean d() {
        return this.l;
    }

    private void a(TencentMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        this.c = onMyLocationChangeListener;
    }

    private boolean a(float f, float f2) {
        TappedElement a = this.g.k.a.f().a(f, f2);
        boolean z = a != null && a.type == 6;
        if (!z || this.i == null) {
            return z;
        }
        LatLng latLng = new LatLng();
        if (this.e != null) {
            latLng.setAltitude(this.e.getAltitude());
            latLng.setLongitude(this.e.getLongitude());
            latLng.setLatitude(this.e.getLatitude());
        }
        return this.i.onMyLocationClicked(latLng);
    }

    private void a(TencentMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.i = onMyLocationClickListener;
    }

    private BitmapDescriptor i() {
        return this.f;
    }

    private void a(Location location) {
        if (location == null) {
            return;
        }
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        if (this.b == null) {
            CircleOptions circleOptions = new CircleOptions();
            circleOptions.radius(location.getAccuracy()).center(latLng).fillColor(this.d.getFillColor()).strokeColor(this.d.getStrokeColor()).strokeWidth(this.d.getStrokeWidth());
            mn mnVar = this.g;
            this.b = mnVar.J == null ? null : mnVar.J.a(circleOptions);
        }
        if (this.h == 0) {
            BitmapDescriptor myLocationIcon = this.d.getMyLocationIcon();
            if (myLocationIcon == null) {
                myLocationIcon = f();
            }
            Bitmap bitmap = myLocationIcon.getBitmap(this.g.getContext());
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f = myLocationIcon;
                this.h = this.g.a(myLocationIcon.getFormater().getBitmapId(), this.d.getAnchorU(), this.d.getAnchorV());
            }
        }
        MyLocationStyle myLocationStyle = this.d;
        if (location == null || myLocationStyle == null) {
            return;
        }
        LatLng latLng2 = new LatLng(location.getLatitude(), location.getLongitude());
        if (this.b != null) {
            this.b.setCenter(latLng2);
            this.b.setRadius(location.getAccuracy());
        }
        this.g.a(GeoPoint.from(latLng2), 0.0f, 0.0f, false);
        switch (myLocationStyle.getMyLocationType()) {
            case 1:
                this.g.a(location.getBearing());
                return;
            case 2:
                return;
            case 3:
                if (this.a != null) {
                    this.a.a(CameraUpdateFactory.rotateTo(location.getBearing(), this.a.a().tilt));
                    return;
                }
                return;
            default:
                this.g.a(location.getBearing());
                if (this.a != null) {
                    this.a.a(CameraUpdateFactory.newLatLng(latLng2));
                    return;
                }
                return;
        }
    }

    private static /* synthetic */ void b(bg bgVar, Location location) {
        if (location != null) {
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            if (bgVar.b == null) {
                CircleOptions circleOptions = new CircleOptions();
                circleOptions.radius(location.getAccuracy()).center(latLng).fillColor(bgVar.d.getFillColor()).strokeColor(bgVar.d.getStrokeColor()).strokeWidth(bgVar.d.getStrokeWidth());
                mn mnVar = bgVar.g;
                bgVar.b = mnVar.J == null ? null : mnVar.J.a(circleOptions);
            }
            if (bgVar.h == 0) {
                BitmapDescriptor myLocationIcon = bgVar.d.getMyLocationIcon();
                if (myLocationIcon == null) {
                    myLocationIcon = bgVar.f();
                }
                Bitmap bitmap = myLocationIcon.getBitmap(bgVar.g.getContext());
                if (bitmap != null && !bitmap.isRecycled()) {
                    bgVar.f = myLocationIcon;
                    bgVar.h = bgVar.g.a(myLocationIcon.getFormater().getBitmapId(), bgVar.d.getAnchorU(), bgVar.d.getAnchorV());
                }
            }
            MyLocationStyle myLocationStyle = bgVar.d;
            if (location == null || myLocationStyle == null) {
                return;
            }
            LatLng latLng2 = new LatLng(location.getLatitude(), location.getLongitude());
            if (bgVar.b != null) {
                bgVar.b.setCenter(latLng2);
                bgVar.b.setRadius(location.getAccuracy());
            }
            bgVar.g.a(GeoPoint.from(latLng2), 0.0f, 0.0f, false);
            switch (myLocationStyle.getMyLocationType()) {
                case 1:
                    bgVar.g.a(location.getBearing());
                    return;
                case 2:
                    return;
                case 3:
                    if (bgVar.a != null) {
                        bgVar.a.a(CameraUpdateFactory.rotateTo(location.getBearing(), bgVar.a.a().tilt));
                        return;
                    }
                    return;
                default:
                    bgVar.g.a(location.getBearing());
                    if (bgVar.a != null) {
                        bgVar.a.a(CameraUpdateFactory.newLatLng(latLng2));
                        return;
                    }
                    return;
            }
        }
    }
}
