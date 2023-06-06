package com.tencent.tencentmap.mapsdk.maps.internal;

import android.support.annotation.Keep;
import com.tencent.map.lib.mapstructure.MapRouteSectionWithName;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.af;
import com.tencent.mapsdk.internal.bh;
import com.tencent.mapsdk.internal.bj;
import com.tencent.mapsdk.internal.bu;
import com.tencent.mapsdk.internal.er;
import com.tencent.mapsdk.internal.mn;
import com.tencent.mapsdk.internal.nh;
import com.tencent.mapsdk.internal.se;
import com.tencent.mapsdk.internal.so;
import com.tencent.mapsdk.internal.ta;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.IOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public final class TencentMapPro {
    private so mVectorMapDelegate;
    private boolean mapDestroyed = false;
    private bh mapManager;
    private af viewControl;

    public TencentMapPro(bh bhVar, af afVar) {
        this.mapManager = bhVar;
        this.viewControl = afVar;
        this.mVectorMapDelegate = bhVar.b;
    }

    @Keep
    public final void animateToNaviPosition(LatLng latLng, float f, float f2) {
        if (this.mapDestroyed || this.mapManager == null) {
            return;
        }
        this.mapManager.a(latLng, f, f2, 0.0f, true);
    }

    @Keep
    public final void animateToNaviPosition(LatLng latLng, float f, float f2, float f3) {
        if (this.mapDestroyed || this.mapManager == null) {
            return;
        }
        this.mapManager.a(latLng, f, f2, f3, true);
    }

    @Keep
    public final void animateToNaviPosition(LatLng latLng, float f, float f2, float f3, boolean z) {
        if (this.mapDestroyed || this.mapManager == null) {
            return;
        }
        this.mapManager.a(latLng, f, f2, f3, z);
    }

    @Keep
    public final void animateToNaviPosition2(LatLng latLng, float f, float f2, float f3, boolean z) {
        if (this.mapDestroyed || this.mapManager == null) {
            return;
        }
        bh bhVar = this.mapManager;
        se seVar = new se();
        seVar.b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        seVar.a(f3);
        seVar.c(f);
        seVar.d(f2);
        seVar.a = bhVar.j;
        seVar.g = true;
        seVar.a(1000L);
        ((VectorMap) bhVar.b.e_).w();
        ((VectorMap) bhVar.b.e_).a(seVar);
    }

    @Keep
    public final float calNaviLevel(LatLngBounds latLngBounds, float f, int i, boolean z) {
        int i2;
        if (this.mapDestroyed || this.mapManager == null) {
            return 0.0f;
        }
        bh bhVar = this.mapManager;
        if (latLngBounds == null) {
            return 0.0f;
        }
        if (z) {
            i2 = bhVar.b.L;
        } else {
            i2 = bhVar.b.N;
        }
        float f2 = !z ? 0.0f : f;
        if (i2 < 0) {
            i2 = bhVar.b.ak / 2;
        }
        return bhVar.a(f2, 0, 0, i, bhVar.b.al - i2, latLngBounds.southwest, latLngBounds.northeast);
    }

    @Keep
    public final float calNaviLevel2(LatLng latLng, LatLng latLng2, float f, float f2, int i, boolean z) {
        if (this.mapDestroyed || this.mapManager == null) {
            return 0.0f;
        }
        bh bhVar = this.mapManager;
        if (latLng == null || latLng2 == null) {
            return 0.0f;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return bhVar.a(!z ? 0.0f : f, 0, 0, i, 0, builder.build().southwest, builder.build().northeast);
    }

    @Keep
    public final float calNaviLevel3(LatLng latLng, LatLng latLng2, float f, int i, int i2, int i3, int i4, boolean z) {
        if (this.mapDestroyed || this.mapManager == null) {
            return 0.0f;
        }
        bh bhVar = this.mapManager;
        if (latLng == null || latLng2 == null) {
            return 0.0f;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return bhVar.a(!z ? 0.0f : f, i, i2, i3, i4, builder.build().southwest, builder.build().northeast);
    }

    @Keep
    public final void setNaviFixingProportion(float f, float f2) {
        if (this.mapDestroyed || this.mapManager == null) {
            return;
        }
        bh bhVar = this.mapManager;
        if (bhVar.b != null) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            bhVar.b.c((int) (bhVar.b.ak * f), (int) (bhVar.b.al * f2));
            bhVar.b.O = f;
            bhVar.b.P = f2;
        }
    }

    @Keep
    public final void setNaviFixingProportion2D(float f, float f2) {
        if (this.mapDestroyed || this.mapManager == null) {
            return;
        }
        bh bhVar = this.mapManager;
        if (bhVar.b != null) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            bhVar.b.d((int) (bhVar.b.ak * f), (int) (bhVar.b.al * f2));
            bhVar.b.Q = f;
            bhVar.b.R = f2;
        }
    }

    @Keep
    public final void moveToNavPosition(CameraUpdate cameraUpdate, LatLng latLng) {
        if (this.mapDestroyed || this.mapManager == null) {
            return;
        }
        this.mapManager.a(cameraUpdate);
        if (latLng != null) {
            setNavCenter((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        }
    }

    @Keep
    public final CameraPosition calculateZoomToSpanLevelAsync(List<IOverlay> list, List<LatLng> list2, int i, int i2, int i3, int i4, TencentMap.AsyncOperateCallback<CameraPosition> asyncOperateCallback) {
        if (this.mapDestroyed || this.mapManager == null) {
            if (asyncOperateCallback != null) {
                asyncOperateCallback.onOperateFinished(null);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (IOverlay iOverlay : list) {
                if (iOverlay instanceof er) {
                    arrayList.add((er) iOverlay);
                }
            }
        }
        return this.mapManager.a(arrayList, list2, i, i2, i3, i4, asyncOperateCallback);
    }

    @Keep
    public final void addSegmentsWithRouteName(List<MapRouteSection> list, List<LatLng> list2) {
        VectorMap vectorMap;
        if (this.mapDestroyed || this.mapManager == null) {
            return;
        }
        bh bhVar = this.mapManager;
        if (bhVar.b == null || (vectorMap = (VectorMap) bhVar.b.e_) == null) {
            return;
        }
        List<GeoPoint> from = GeoPoint.from(list2);
        mn mnVar = vectorMap.o;
        if (mnVar.z == null) {
            mnVar.z = new mn.d();
        }
        mn.d dVar = mnVar.z;
        dVar.a = list;
        dVar.b = from;
        mn.this.g.a(list, from);
    }

    @Keep
    public final void addRouteNameSegments(List<MapRouteSectionWithName> list, List<LatLng> list2) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (MapRouteSectionWithName mapRouteSectionWithName : list) {
                if (mapRouteSectionWithName != null) {
                    MapRouteSection mapRouteSection = new MapRouteSection();
                    mapRouteSection.color = mapRouteSectionWithName.color;
                    mapRouteSection.endNum = mapRouteSectionWithName.endNum;
                    mapRouteSection.roadName = mapRouteSectionWithName.roadName;
                    mapRouteSection.startNum = mapRouteSectionWithName.startNum;
                    arrayList.add(mapRouteSection);
                }
            }
            addSegmentsWithRouteName(arrayList, list2);
        }
    }

    @Keep
    public final void clearRouteNameSegments() {
        VectorMap vectorMap;
        if (this.mapDestroyed || this.mapManager == null) {
            return;
        }
        bh bhVar = this.mapManager;
        if (bhVar.b == null || (vectorMap = (VectorMap) bhVar.b.e_) == null) {
            return;
        }
        vectorMap.clearRouteNameSegments();
    }

    @Keep
    public final void setNavCenter(int i, int i2) {
        if (this.viewControl == null) {
            return;
        }
        af afVar = this.viewControl;
        bu C = afVar.a == null ? null : afVar.a.C();
        if (C instanceof ta) {
            ((ta) C).getVectorMapDelegate().b(i, i2);
        }
    }

    @Keep
    public final void onDestroy() {
        this.mapDestroyed = true;
    }

    @Keep
    public final void setOnCameraChangeListener(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        if (this.mapDestroyed || this.mapManager == null) {
            return;
        }
        bh bhVar = this.mapManager;
        if (bhVar.b != null) {
            bhVar.b.G = onCameraChangeListener;
        }
    }

    @Keep
    public final void setNaviStateEnabled(boolean z) {
        if (this.mapDestroyed || this.mapManager == null) {
            return;
        }
        this.mapManager.h(z);
    }

    @Keep
    public final boolean isNaviStateEnabled() {
        if (this.mapDestroyed || this.mapManager == null) {
            return false;
        }
        return this.mapManager.x();
    }

    public final void setOptionalResourcePath(String str) {
        mn mnVar;
        if (this.mapDestroyed || this.mVectorMapDelegate == null || (mnVar = this.mVectorMapDelegate.aB) == null || mnVar.x == null) {
            return;
        }
        mnVar.x.a(str);
    }

    @Keep
    public final IntersectionOverlay addIntersectionEnlargeOverlay(IntersectionOverlayOptions intersectionOverlayOptions) {
        mn mnVar;
        if (this.mapDestroyed || this.mVectorMapDelegate == null || (mnVar = this.mVectorMapDelegate.aB) == null || mnVar.g == null) {
            return null;
        }
        return (IntersectionOverlay) mnVar.k.a((bj) new nh(intersectionOverlayOptions));
    }
}
