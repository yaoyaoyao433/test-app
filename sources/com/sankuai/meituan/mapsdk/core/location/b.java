package com.sankuai.meituan.mapsdk.core.location;

import android.animation.ValueAnimator;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatDelegate;
import com.dianping.picasso.view.scroller.CustomizedScrollView;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.c;
import com.sankuai.meituan.mapsdk.core.d;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.CustomMyLocation;
import com.sankuai.meituan.mapsdk.maps.interfaces.y;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import com.sankuai.meituan.mapsdk.maps.model.MyLocationStyle;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements com.sankuai.meituan.mapsdk.maps.business.b, y.b {
    public static ChangeQuickRedirect a;
    public y.a b;
    public MyLocationStyle c;
    public int d;
    public a e;
    public y f;
    public Location g;
    public MapLocation h;
    public boolean i;
    private final c j;
    private com.sankuai.meituan.mapsdk.maps.business.c k;
    private d l;
    private float m;
    private LatLng n;
    private ValueAnimator o;

    @Override // com.sankuai.meituan.mapsdk.maps.business.b
    public final void onCompassAccuracyChange(int i) {
    }

    public b(c cVar, @NonNull d dVar) {
        Object[] objArr = {cVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78a9a76873ef56e766f95184b9412c62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78a9a76873ef56e766f95184b9412c62");
            return;
        }
        this.d = 14;
        this.i = false;
        this.j = cVar;
        this.c = new MyLocationStyle();
        this.l = dVar;
        this.k = new com.sankuai.meituan.mapsdk.maps.business.c(this.l.c.getContext(), this.c.getBid(), this);
        AppCompatDelegate.a(true);
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a55cb27d384b0f333aefb065c316b155", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a55cb27d384b0f333aefb065c316b155");
            return;
        }
        if (this.e == null) {
            this.e = new a(this.j, this.l);
            this.e.a(true);
        }
        this.e.a(this.c);
        onLocationChanged(this.h);
        b(true);
        a(true);
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a619e6caadcde6ea1dd977487f242ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a619e6caadcde6ea1dd977487f242ce");
            return;
        }
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
        b(false);
        a(false);
        e();
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d81c4af039c26e11c35033a422fe1a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d81c4af039c26e11c35033a422fe1a8");
        } else if (z && (this.d & 32) == 32) {
            this.k.a();
        } else {
            this.k.b();
            this.m = 0.0f;
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "594e2a9f705d7105bfa228b9103c87e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "594e2a9f705d7105bfa228b9103c87e7");
        } else if (this.f != null) {
            if (z) {
                this.f.a(this);
            } else {
                this.f.a();
            }
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7c8346452d56dbd80e81f41a9ac590f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7c8346452d56dbd80e81f41a9ac590f");
        } else if (this.o != null) {
            this.o.cancel();
            this.o = null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.business.b
    public final void onCompassChanged(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b4c910b10b7a6832a4e88c7ef29d1ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b4c910b10b7a6832a4e88c7ef29d1ac");
        } else if (f()) {
            if ((this.d & 8) != 8) {
                if ((this.d & 16) == 16) {
                    a(f, (this.d & 4) == 4);
                    return;
                }
                return;
            }
            Object[] objArr2 = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2aeb410fa3ed5677e4973d61b6a6029b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2aeb410fa3ed5677e4973d61b6a6029b");
                return;
            }
            Object[] objArr3 = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "64917d2d3bfc555e24382c0834a548a2", RobustBitConfig.DEFAULT_VALUE)) {
                r7 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "64917d2d3bfc555e24382c0834a548a2")).booleanValue();
            } else if (Math.abs(Math.abs(f) - Math.abs(this.m)) <= 1.0d) {
                r7 = false;
            }
            if (r7) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.b("\r\nmagneticHeading:" + f);
                com.sankuai.meituan.mapsdk.mapcore.utils.c.b("mPreviousMagneticHeading:" + this.m + StringUtil.CRLF_STRING);
                if (this.e != null) {
                    this.e.c.a(MapConstant.LayerPropertyFlag_IconRotate, f);
                    this.e.c.a(MapConstant.LayerPropertyFlag_IconRotationAlignment, 0);
                }
                this.m = f;
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.y.a
    public final void onLocationChanged(Location location) {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c6448fc21e93232475cbe29b7816d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c6448fc21e93232475cbe29b7816d9");
        } else if (!this.i || location == null) {
        } else {
            this.g = location;
            onLocationChanged(new CustomMyLocation.LocationWrapper(this.g));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.y.b
    public final void onLocationChanged(MapLocation mapLocation) {
        Object[] objArr = {mapLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a16edc021403cd9bc2dc6dc53b34533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a16edc021403cd9bc2dc6dc53b34533");
        } else if (!this.i || mapLocation == null) {
        } else {
            this.h = mapLocation;
            if (f()) {
                LatLng latLng = new LatLng(mapLocation.getLatitude(), mapLocation.getLongitude());
                d dVar = this.l;
                Class<?> cls = getClass();
                dVar.checkLatLng(cls, "onLocationChanged", MapConstant.LayerPropertyFlag_MarkerSpacing, latLng, "LatLng=" + latLng);
                if ((this.d & 1) == 1) {
                    a(this.h);
                    b(false);
                } else if ((this.d & 2) == 2) {
                    a(this.h);
                }
                if ((this.d & 4) == 4) {
                    c();
                }
                if ((this.d & 32) != 32) {
                    onCompassChanged(this.h.getBearing());
                }
                MapLocation mapLocation2 = this.h;
                Object[] objArr2 = {mapLocation2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d2c6d2b5fa287db3d02f756a2571efd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d2c6d2b5fa287db3d02f756a2571efd");
                } else if (mapLocation2 != null) {
                    float accuracy = mapLocation2.getAccuracy();
                    if (this.c.getRadiusCeiling() > 1.0f) {
                        accuracy = Math.min(accuracy, this.c.getRadiusCeiling());
                    }
                    if (this.e != null) {
                        this.e.b.a(5000, accuracy);
                    }
                }
                if (this.b != null) {
                    if (this.b instanceof y.b) {
                        ((y.b) this.b).onLocationChanged(this.h);
                    } else {
                        this.b.onLocationChanged(this.g);
                    }
                }
            }
        }
    }

    private void a(MapLocation mapLocation) {
        Object[] objArr = {mapLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9ffd92cba59f5757be1d8790e43dcc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9ffd92cba59f5757be1d8790e43dcc7");
        } else if (!this.i || mapLocation == null || this.e == null) {
        } else {
            LatLng latLng = new LatLng(mapLocation.getLatitude(), mapLocation.getLongitude());
            if (this.n == null || this.e.d == null || Math.abs(latLng.latitude - this.e.d.latitude) > 1.0E-6d || Math.abs(latLng.longitude - this.e.d.longitude) > 1.0E-6d) {
                this.e.a(latLng);
                this.n = latLng;
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c2bbb815afa40e925490f7e614d4a55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c2bbb815afa40e925490f7e614d4a55");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.b("animationForLocation");
        CameraPosition h = this.l.d.h();
        if (h == null) {
            return;
        }
        LatLng latLng = h.target;
        if (this.n == null || latLng.equals(this.n)) {
            return;
        }
        this.l.animateCamera(CameraUpdateFactory.newLatLng(this.n), 250L, null);
    }

    public void a(float f, boolean z) {
        LatLng center;
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24480dbaf59848fc3cc4ecb62bb1a4dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24480dbaf59848fc3cc4ecb62bb1a4dc");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.b("\r\nmagneticHeading:" + f);
        com.sankuai.meituan.mapsdk.mapcore.utils.c.b("mPreviousMagneticHeading:" + this.m + StringUtil.CRLF_STRING);
        d();
        CameraPosition h = this.l.d.h();
        if (h == null || h.target == null) {
            return;
        }
        if (z && this.h != null) {
            center = new LatLng(this.h.getLatitude(), this.h.getLongitude());
        } else {
            center = this.l.d.getCenter();
        }
        if (!h.target.equals(center) || Math.abs(Math.abs(h.bearing) - Math.abs(f)) >= 1.0f) {
            this.l.d.a(new CameraPosition(center, h.zoom, h.tilt, f), CustomizedScrollView.ANIMATED_SCROLL_GAP);
            this.m = f;
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fc71db16eebd72c7839d904303c296d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fc71db16eebd72c7839d904303c296d");
        } else if (this.e != null) {
            this.e.c.a(MapConstant.LayerPropertyFlag_IconRotate, 0);
            this.e.c.a(MapConstant.LayerPropertyFlag_IconRotationAlignment, 1);
        }
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e874e3e130c14993034e6a7db9d7aa3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e874e3e130c14993034e6a7db9d7aa3")).booleanValue() : this.i && this.c != null;
    }
}
