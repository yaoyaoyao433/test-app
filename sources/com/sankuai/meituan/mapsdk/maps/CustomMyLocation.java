package com.sankuai.meituan.mapsdk.maps;

import android.animation.ValueAnimator;
import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.utils.g;
import com.sankuai.meituan.mapsdk.maps.business.b;
import com.sankuai.meituan.mapsdk.maps.business.c;
import com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.y;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.Circle;
import com.sankuai.meituan.mapsdk.maps.model.CircleOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.MyLocationStyle;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CustomMyLocation implements b {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MyLocationStyle a;
    private MarkerOptions b;
    private Marker c;
    private CircleOptions d;
    private Circle e;
    private ValueAnimator f;
    private long g;
    private int h;
    private volatile boolean i;
    private c j;
    private y k;
    private IMTMap l;
    private LatLng m;
    private float n;
    private float o;
    private Context p;
    private y.a q;
    private Location r;
    private MapLocation s;
    private boolean t;
    private long u;

    @Override // com.sankuai.meituan.mapsdk.maps.business.b
    public void onCompassAccuracyChange(int i) {
    }

    public static /* synthetic */ void access$100(CustomMyLocation customMyLocation, Location location) {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, customMyLocation, changeQuickRedirect2, false, "efbbe92d3a9324a9cd6563ce2eb0198c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, customMyLocation, changeQuickRedirect2, false, "efbbe92d3a9324a9cd6563ce2eb0198c");
            return;
        }
        customMyLocation.r = location;
        customMyLocation.a(new LocationWrapper(location));
        if (customMyLocation.q == null || (customMyLocation.q instanceof y.b)) {
            return;
        }
        customMyLocation.q.onLocationChanged(location);
    }

    public static /* synthetic */ void access$200(CustomMyLocation customMyLocation, MapLocation mapLocation) {
        Object[] objArr = {mapLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, customMyLocation, changeQuickRedirect2, false, "9703a1744570228336c49154ad09a5d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, customMyLocation, changeQuickRedirect2, false, "9703a1744570228336c49154ad09a5d1");
            return;
        }
        customMyLocation.s = mapLocation;
        customMyLocation.a(mapLocation);
        if (customMyLocation.q instanceof y.b) {
            ((y.b) customMyLocation.q).onLocationChanged(mapLocation);
        }
    }

    @Deprecated
    public CustomMyLocation(@NonNull IMTMap iMTMap) {
        Object[] objArr = {iMTMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70864b46885dac359c4d380138580b7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70864b46885dac359c4d380138580b7c");
            return;
        }
        this.t = false;
        this.l = iMTMap;
    }

    public void setStyle(MyLocationStyle myLocationStyle) {
        Object[] objArr = {myLocationStyle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f259ea4ee25f2812147c55bee0ffa0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f259ea4ee25f2812147c55bee0ffa0b");
            return;
        }
        this.a = myLocationStyle;
        if (myLocationStyle == null) {
            return;
        }
        a(myLocationStyle.getMyLocationType());
        Object[] objArr2 = {myLocationStyle};
        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b52136e53298ee0f25084672572a422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b52136e53298ee0f25084672572a422");
            return;
        }
        this.a = myLocationStyle;
        if (this.c != null) {
            this.c.setAnchor(myLocationStyle.getAnchorU(), myLocationStyle.getAnchorV());
            this.c.setIcon(myLocationStyle.getMyLocationIcon());
            this.c.setZIndex(myLocationStyle.getZIndex());
        } else {
            this.b = new MarkerOptions().visible(true).level(2).zIndex(myLocationStyle.getZIndex()).anchor(myLocationStyle.getAnchorU(), myLocationStyle.getAnchorV()).icon(myLocationStyle.getMyLocationIcon()).infoWindowEnable(false).allowOverlap(true);
        }
        if (this.e != null) {
            this.e.setFillColor(myLocationStyle.getRadiusFillColor());
            this.e.setStrokeColor(myLocationStyle.getStrokeColor());
            this.e.setStrokeWidth(myLocationStyle.getStrokeWidth());
            this.e.setZIndex((int) (myLocationStyle.getZIndex() - 1.0f));
            this.e.setVisible(myLocationStyle.isCircleShow());
            return;
        }
        this.d = new CircleOptions().visible(myLocationStyle.isCircleShow()).level(2).zIndex((int) (myLocationStyle.getZIndex() - 1.0f)).fillColor(myLocationStyle.getRadiusFillColor()).strokeColor(myLocationStyle.getStrokeColor()).strokeWidth(myLocationStyle.getStrokeWidth());
        this.g = myLocationStyle.getCircleAnimDuration();
    }

    public MyLocationStyle getStyle() {
        return this.a;
    }

    public void setLocationSource(y yVar) {
        Object[] objArr = {yVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d44ccbf07206da0177fa8950af4181bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d44ccbf07206da0177fa8950af4181bb");
            return;
        }
        if (this.k != null && this.i) {
            this.k.a();
        }
        this.k = yVar;
        if (this.i) {
            a(this.i);
        }
    }

    public void setEnable(boolean z, Context context) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d29dee7b122a29e0d524dcc0f884eba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d29dee7b122a29e0d524dcc0f884eba4");
        } else if (this.i == z) {
        } else {
            this.i = z;
            this.p = context;
            a(z);
        }
    }

    public Location getCurrentLocation() {
        return this.r;
    }

    public MapLocation getCurrentMapLocation() {
        return this.s;
    }

    public void setLocationChangedListener(y.a aVar) {
        this.q = aVar;
    }

    public Marker getLocationMarker() {
        return this.c;
    }

    public Circle getLocationCircle() {
        return this.e;
    }

    public void clearLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4721421cef33b30eea02991de6029eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4721421cef33b30eea02991de6029eb");
            return;
        }
        this.b = null;
        if (this.c != null) {
            this.c.remove();
            this.c = null;
        }
        this.d = null;
        if (this.e != null) {
            this.e.remove();
            this.e = null;
        }
        this.f = null;
        if (this.k != null) {
            this.k.a();
            this.k = null;
        }
        this.i = false;
        this.m = null;
        this.n = 0.0f;
        this.o = 0.0f;
        this.r = null;
        this.s = null;
        this.q = null;
        a();
        this.p = null;
    }

    public void resumeLocator() {
        this.e = null;
        this.c = null;
    }

    private void a(MapLocation mapLocation) {
        Object[] objArr = {mapLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "241c6781b1612153e462e14c62b400a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "241c6781b1612153e462e14c62b400a1");
        } else if (!this.i || mapLocation == null || this.l == null) {
        } else {
            if (this.b == null || this.d == null) {
                setStyle(new MyLocationStyle());
            }
            LatLng latLng = new LatLng(mapLocation.getLatitude(), mapLocation.getLongitude());
            IMTMap iMTMap = this.l;
            Class<?> cls = getClass();
            iMTMap.checkLatLng(cls, "updateLocation", MapConstant.LayerPropertyFlag_MarkerSpacing, latLng, "LatLng=" + latLng);
            float accuracy = mapLocation.getAccuracy();
            if (this.a.getRadiusCeiling() > 1.0f) {
                accuracy = Math.min(accuracy, this.a.getRadiusCeiling());
            }
            if (this.e == null || this.c == null) {
                if (this.e == null) {
                    this.d.radius(accuracy);
                    this.d.center(latLng);
                    this.e = this.l.addCircle(this.d);
                }
                if (this.c == null) {
                    this.b.rotateAngle(this.o);
                    this.b.position(latLng);
                    this.c = this.l.addMarker(this.b);
                    if (this.c != null) {
                        this.c.setClickable(false);
                        this.c.setAllowOverlap(true);
                        this.c.setIgnorePlacement(true);
                    }
                }
            } else {
                this.c.setPosition(latLng);
                this.e.setCenter(latLng);
                if (this.g > 0 && Math.abs(accuracy - this.n) > 1.0E-6d) {
                    if (this.f != null) {
                        this.f.cancel();
                    }
                    this.f = ValueAnimator.ofFloat((float) this.e.getRadius(), accuracy);
                    this.f.setDuration(this.g);
                    this.f.setInterpolator(new AccelerateDecelerateInterpolator());
                    this.f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.meituan.mapsdk.maps.CustomMyLocation.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Object[] objArr2 = {valueAnimator};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba18a54c2492d96f4051117b0faa422c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba18a54c2492d96f4051117b0faa422c");
                            } else if (CustomMyLocation.this.e != null) {
                                CustomMyLocation.this.e.setRadius(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        }
                    });
                    this.f.start();
                } else if (this.e != null) {
                    this.e.setRadius(accuracy);
                }
            }
            a(mapLocation, latLng);
            this.m = latLng;
            this.n = accuracy;
        }
    }

    private synchronized void a(MapLocation mapLocation, LatLng latLng) {
        Object[] objArr = {mapLocation, latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70589de4d3044965a721cceebeebef4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70589de4d3044965a721cceebeebef4b");
        } else if (mapLocation == null) {
        } else {
            switch (this.h) {
                case 0:
                    if (this.c != null) {
                        this.c.setRotateAngle(mapLocation.getBearing());
                    }
                    if (this.l != null) {
                        this.l.animateCamera(CameraUpdateFactory.newLatLng(latLng));
                        return;
                    }
                    break;
                case 1:
                    if (this.c != null) {
                        this.c.setRotateAngle(mapLocation.getBearing());
                        return;
                    }
                    break;
                case 2:
                case 5:
                    return;
                case 3:
                    if (this.l != null) {
                        this.l.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(latLng, this.l.getZoomLevel(), 0.0f, g.a(mapLocation.getBearing()))));
                        return;
                    }
                    break;
                case 4:
                    if (this.l != null) {
                        this.l.animateCamera(CameraUpdateFactory.newLatLng(latLng));
                        return;
                    }
                    break;
                case 6:
                    if (this.l != null) {
                        this.l.animateCamera(CameraUpdateFactory.newLatLng(latLng), 250L, null);
                        return;
                    }
                    break;
                default:
                    if (this.c != null) {
                        this.c.setRotateAngle(mapLocation.getBearing());
                        break;
                    }
                    break;
            }
        }
    }

    private synchronized void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b25deefba604140190bc0c741633f1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b25deefba604140190bc0c741633f1a");
        } else if (this.h == i) {
        } else {
            a();
            switch (i) {
                case 0:
                case 1:
                    if (this.c != null) {
                        this.c.setRotateAngle(0.0f);
                        break;
                    }
                    break;
                case 3:
                    if (this.c != null) {
                        this.c.setRotateAngle(0.0f);
                    }
                    if (this.l != null && this.m != null) {
                        this.l.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(this.m, this.l.getZoomLevel(), 0.0f, 0.0f)));
                        break;
                    }
                    break;
                case 4:
                    if (this.c != null) {
                        a(this.p);
                        this.c.setRotateAngle(this.o);
                        break;
                    }
                    break;
                case 5:
                    if (this.c != null) {
                        a(this.p);
                        this.c.setRotateAngle(this.o);
                        break;
                    }
                    break;
                case 6:
                    if (this.l != null && this.m != null) {
                        a(this.p);
                        this.l.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(this.m, this.l.getZoomLevel(), 0.0f, this.o)));
                    }
                    if (this.c != null) {
                        this.c.setRotateAngle(0.0f);
                        break;
                    }
                    break;
            }
            this.h = i;
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25df1fc4c92f83fa9701c393e73bb129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25df1fc4c92f83fa9701c393e73bb129");
        } else if (z) {
            if (this.k != null) {
                if (this.h == 4 || this.h == 5 || this.h == 6) {
                    a(this.p);
                }
                this.k.a(new CustomLocationChangedListener(this));
            }
        } else {
            if (this.c != null) {
                this.c.remove();
                this.c = null;
            }
            if (this.e != null) {
                this.e.remove();
                this.e = null;
            }
            if (this.k != null) {
                this.k.a();
            }
            a();
            this.m = null;
            this.n = 0.0f;
            this.o = 0.0f;
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f2c6ec2d3be9d9321d9a18770da4295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f2c6ec2d3be9d9321d9a18770da4295");
        } else if (context != null && this.j == null) {
            this.j = new c(context, this.a.getBid(), this);
            this.j.a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9c90ff673737d33a27cbde18f2b47b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9c90ff673737d33a27cbde18f2b47b6");
        } else if (this.j != null) {
            this.j.b();
            this.j = null;
        }
    }

    private static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f63ef8e97a300e80f48e48e618d50a1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f63ef8e97a300e80f48e48e618d50a1c")).intValue();
        }
        if (context != null) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    switch (windowManager.getDefaultDisplay().getRotation()) {
                        case 0:
                            return 0;
                        case 1:
                            return 90;
                        case 2:
                            return TXLiveConstants.RENDER_ROTATION_180;
                        case 3:
                            return -90;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.business.b
    public void onCompassChanged(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8460fb77154d37d800ef812ee61c0f71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8460fb77154d37d800ef812ee61c0f71");
            return;
        }
        try {
            if (System.currentTimeMillis() - this.u < 100) {
                return;
            }
            float b = (f + b(this.p)) % 360.0f;
            if (b > 180.0f) {
                b -= 360.0f;
            } else if (b < -180.0f) {
                b += 360.0f;
            }
            if (Math.abs(this.o - b) >= 3.0f) {
                if (Float.isNaN(b)) {
                    b = 0.0f;
                }
                this.o = b;
                if (this.h != 4 && this.h != 5) {
                    if (this.h == 6 && this.l != null && this.m != null) {
                        this.l.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(this.m, this.l.getZoomLevel(), 0.0f, this.o)), 100L, null);
                    }
                    this.u = System.currentTimeMillis();
                }
                if (this.c != null) {
                    this.c.setRotateAngle(this.o);
                }
                this.u = System.currentTimeMillis();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class CustomLocationChangedListener implements y.b {
        public static ChangeQuickRedirect changeQuickRedirect;
        private WeakReference<CustomMyLocation> a;

        public CustomLocationChangedListener(CustomMyLocation customMyLocation) {
            Object[] objArr = {customMyLocation};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4153f0a17e9ba3e08025c46e2c5098f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4153f0a17e9ba3e08025c46e2c5098f");
            } else {
                this.a = new WeakReference<>(customMyLocation);
            }
        }

        @Override // com.sankuai.meituan.mapsdk.maps.interfaces.y.a
        public void onLocationChanged(Location location) {
            Object[] objArr = {location};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d430f49c43b5c5bc5095a9131abfd312", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d430f49c43b5c5bc5095a9131abfd312");
                return;
            }
            CustomMyLocation customMyLocation = this.a.get();
            if (customMyLocation != null) {
                CustomMyLocation.access$100(customMyLocation, location);
            }
        }

        @Override // com.sankuai.meituan.mapsdk.maps.interfaces.y.b
        public void onLocationChanged(MapLocation mapLocation) {
            Object[] objArr = {mapLocation};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1725e3719327a8e1b7081b0a356ddb3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1725e3719327a8e1b7081b0a356ddb3");
                return;
            }
            CustomMyLocation customMyLocation = this.a.get();
            if (customMyLocation != null) {
                CustomMyLocation.access$200(customMyLocation, mapLocation);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class LocationWrapper implements MapLocation {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Location a;

        public LocationWrapper(@NonNull Location location) {
            Object[] objArr = {location};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b93bae88adef00ebf63526147c547d8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b93bae88adef00ebf63526147c547d8");
            } else {
                this.a = location;
            }
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
        public final double getLatitude() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec6f8672d59b1407e94c49718ac57cf0", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec6f8672d59b1407e94c49718ac57cf0")).doubleValue() : this.a.getLatitude();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
        public final double getLongitude() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a274528fb7204888ac300f21bd879ec", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a274528fb7204888ac300f21bd879ec")).doubleValue() : this.a.getLongitude();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
        public final double getAltitude() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f480fe54a13eccd299df7e6004052f1d", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f480fe54a13eccd299df7e6004052f1d")).doubleValue() : this.a.getAltitude();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
        public final float getSpeed() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c53f0398c915ba268e5bbedc170a2ebb", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c53f0398c915ba268e5bbedc170a2ebb")).floatValue() : this.a.getSpeed();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
        public final float getBearing() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccb887588dad51ff6ad08a7efc5e8549", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccb887588dad51ff6ad08a7efc5e8549")).floatValue() : this.a.getBearing();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
        public final float getAccuracy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7422e380ed2ee435a65a90069f8f3374", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7422e380ed2ee435a65a90069f8f3374")).floatValue() : this.a.getAccuracy();
        }
    }

    @Deprecated
    public CustomMyLocation(@NonNull MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa2020d47596b11df24d2d6d0d114945", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa2020d47596b11df24d2d6d0d114945");
            return;
        }
        this.t = false;
        this.l = mTMap;
    }
}
