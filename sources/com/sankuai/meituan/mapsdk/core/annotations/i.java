package com.sankuai.meituan.mapsdk.core.annotations;

import android.graphics.PointF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.interfaces.OnMapChangedListener;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.MarkerSelectHelper;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i implements OnMapChangedListener {
    public static ChangeQuickRedirect a;
    public final g b;
    public final com.sankuai.meituan.mapsdk.core.d c;
    public l d;
    public u e;
    public MTMap.OnMarkerClickListener f;
    public MTMap.OnMarkerDragListener g;
    public MTMap.OnPolylineClickListener h;
    public MTMap.OnPolygonClickListener i;
    public MarkerSelectHelper j;
    public x k;
    public Set<com.sankuai.meituan.mapsdk.maps.interfaces.e> l;
    private CameraPosition m;

    public i(com.sankuai.meituan.mapsdk.core.c cVar, com.sankuai.meituan.mapsdk.core.d dVar) {
        Object[] objArr = {cVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7871bc2ca539151c577ffd8de3ed7a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7871bc2ca539151c577ffd8de3ed7a1");
            return;
        }
        this.l = new HashSet();
        this.m = null;
        this.c = dVar;
        this.j = new MarkerSelectHelper();
        this.d = new l(this.c);
        this.e = new u(dVar);
        this.b = new g(this.c, this.d, this.e, cVar);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cdebf04ca808523ba6f70ff60a68ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cdebf04ca808523ba6f70ff60a68ae5");
        } else if (!this.l.isEmpty()) {
            for (com.sankuai.meituan.mapsdk.maps.interfaces.e eVar : this.l) {
                if (eVar != null) {
                    eVar.setClickable(true);
                }
            }
            this.l.clear();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff49821ecdb6741932b0dc8f8c5bf8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff49821ecdb6741932b0dc8f8c5bf8e");
            return;
        }
        this.b.a();
        this.b.d.a();
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.OnMapChangedListener
    public final void a(int i, CameraPosition cameraPosition) {
        Object[] objArr = {Integer.valueOf(i), cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f743ab0100c7eebf6da06b97318c23c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f743ab0100c7eebf6da06b97318c23c6");
            return;
        }
        this.b.a(i, cameraPosition);
        if (i == 6 || i == 4 || i == 5) {
            this.m = cameraPosition;
            for (x xVar : this.b.l.values()) {
                LatLng latLngByScreenCoordinate = this.c.d.getLatLngByScreenCoordinate(new PointF(xVar.h, xVar.y));
                if (latLngByScreenCoordinate != null) {
                    xVar.a(latLngByScreenCoordinate);
                }
            }
            for (k kVar : this.b.b()) {
                kVar.setPoints(kVar.getPoints(), kVar.z);
            }
            c();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "836ba09ca0230825b03bb55dd2e5c082", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "836ba09ca0230825b03bb55dd2e5c082");
        } else {
            this.e.a();
        }
    }

    public final synchronized com.sankuai.meituan.mapsdk.maps.interfaces.n a(MarkerOptions markerOptions) {
        Object[] objArr = {markerOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76df6d4cfcfcea9dd49a439952e7b9ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.interfaces.n) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76df6d4cfcfcea9dd49a439952e7b9ac");
        } else if (this.c.i) {
            return null;
        } else {
            x xVar = new x(this.b, markerOptions);
            this.j.addMarker(xVar, markerOptions.isSelect());
            return xVar;
        }
    }

    public final synchronized Collection<com.sankuai.meituan.mapsdk.maps.interfaces.n> a(List<MarkerOptions> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "641ebd5fe95de3cd25c08c6921b7be40", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "641ebd5fe95de3cd25c08c6921b7be40");
        }
        ArrayList arrayList = new ArrayList();
        if (this.c.i) {
            return arrayList;
        }
        int i = 0;
        while (i < list.size()) {
            try {
                x.g = i != list.size() - 1;
                x xVar = new x(this.b, list.get(i));
                this.j.addMarker(xVar, list.get(i).isSelect());
                arrayList.add(xVar);
            } catch (Exception unused) {
                x.g = false;
            }
            i++;
        }
        return arrayList;
    }

    public final synchronized t b(MarkerOptions markerOptions) {
        Object[] objArr = {markerOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ba0ecc97d43948a221352637b1edc53", RobustBitConfig.DEFAULT_VALUE)) {
            return (t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ba0ecc97d43948a221352637b1edc53");
        }
        return new t(this.b, markerOptions);
    }
}
