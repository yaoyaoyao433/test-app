package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable;
import com.tencent.tencentmap.mapsdk.maps.model.Arc;
import com.tencent.tencentmap.mapsdk.maps.model.ArcOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Polygon;
import com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class bi {
    public final ba f;
    public final bf h;
    private IndoorBuilding i;
    public final Map<String, er> a = new ConcurrentHashMap();
    public final List<er> b = new CopyOnWriteArrayList();
    public final List<er> c = new CopyOnWriteArrayList();
    public final List<er> d = new CopyOnWriteArrayList();
    public final List<en> e = new CopyOnWriteArrayList();
    private final Comparator<Levelable> j = new Comparator<Levelable>() { // from class: com.tencent.mapsdk.internal.bi.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Levelable levelable, Levelable levelable2) {
            return Float.compare(levelable.getZIndex(), levelable2.getZIndex());
        }

        private static int a(Levelable levelable, Levelable levelable2) {
            return Float.compare(levelable.getZIndex(), levelable2.getZIndex());
        }
    };
    public final Comparator<Levelable> g = new Comparator<Levelable>() { // from class: com.tencent.mapsdk.internal.bi.2
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Levelable levelable, Levelable levelable2) {
            Levelable levelable3 = levelable;
            Levelable levelable4 = levelable2;
            return levelable3.getLevel() == levelable4.getLevel() ? Float.compare(levelable3.getZIndex(), levelable4.getZIndex()) : levelable3.getLevel() - levelable4.getLevel();
        }

        private static int a(Levelable levelable, Levelable levelable2) {
            return levelable.getLevel() == levelable2.getLevel() ? Float.compare(levelable.getZIndex(), levelable2.getZIndex()) : levelable.getLevel() - levelable2.getLevel();
        }
    };

    public bi(ba baVar, be beVar) {
        this.f = baVar;
        this.h = new bf(beVar);
    }

    private Arc a(ArcOptions arcOptions) {
        op opVar = new op(arcOptions, this.f);
        as asVar = new as(opVar);
        this.a.put(opVar.getId(), asVar);
        this.c.add(asVar);
        a((en) opVar);
        return asVar;
    }

    public final Circle a(CircleOptions circleOptions) {
        oq oqVar = new oq(this.f);
        oqVar.a(circleOptions);
        at atVar = new at(oqVar);
        this.a.put(oqVar.getId(), atVar);
        this.d.add(atVar);
        a((en) oqVar);
        return atVar;
    }

    private Polygon a(PolygonOptions polygonOptions) {
        ou ouVar = new ou(this.f, polygonOptions);
        ax axVar = new ax(ouVar);
        this.a.put(ouVar.getId(), axVar);
        this.d.add(axVar);
        a((en) ouVar);
        return axVar;
    }

    public final Polyline a(PolylineOptions polylineOptions) {
        ov ovVar = new ov(this.f);
        ovVar.setPolylineOptions(polylineOptions);
        ay ayVar = new ay(ovVar);
        this.a.put(ovVar.getId(), ayVar);
        this.c.add(ayVar);
        a((en) ovVar);
        return ayVar;
    }

    public final Marker a(MarkerOptions markerOptions) {
        so soVar = (so) this.f;
        ot otVar = new ot(soVar);
        otVar.setMarkerOptions(markerOptions);
        aw awVar = new aw(otVar);
        this.a.put(otVar.getId(), awVar);
        this.b.add(awVar);
        if (soVar.ap != null) {
            soVar.ap.a(otVar);
        }
        a((en) otVar);
        return awVar;
    }

    public final void a(en enVar) {
        if (enVar == null || enVar.m() == null) {
            return;
        }
        if (this.i != null) {
            enVar.a(this.i);
        } else {
            enVar.o();
        }
        this.e.add(enVar);
    }

    public final er a(String str) {
        return this.a.get(str);
    }

    public final <T extends er> T a(String str, Class<T> cls) {
        T t = (T) this.a.get(str);
        if (t == null || t.getClass() != cls) {
            return null;
        }
        return t;
    }

    private boolean b(String str) {
        ap f_;
        er remove = this.a.remove(str);
        if (remove != null) {
            this.b.remove(remove);
            this.c.remove(remove);
            this.d.remove(remove);
            if ((remove instanceof av) && (f_ = ((av) remove).f_()) != null) {
                this.e.remove(f_);
            }
        }
        return remove != null;
    }

    public final void a() {
        synchronized (this) {
            Iterator<er> it = this.a.values().iterator();
            while (it.hasNext()) {
                er next = it.next();
                if (next != null) {
                    next.remove();
                    it.remove();
                }
            }
        }
        this.b.clear();
        this.c.clear();
        this.d.clear();
    }

    private List<er> c() {
        return this.b;
    }

    private List<er> d() {
        return this.c;
    }

    private List<er> e() {
        return this.d;
    }

    private List<Arc> f() {
        ArrayList arrayList = new ArrayList();
        for (er erVar : this.a.values()) {
            if (erVar instanceof as) {
                arrayList.add((as) erVar);
            }
        }
        Collections.sort(arrayList, this.j);
        return arrayList;
    }

    private List<Marker> g() {
        ArrayList arrayList = new ArrayList();
        for (er erVar : this.a.values()) {
            if (erVar instanceof aw) {
                arrayList.add((aw) erVar);
            }
        }
        Collections.sort(arrayList, this.j);
        return arrayList;
    }

    private List<Polyline> h() {
        ArrayList arrayList = new ArrayList();
        for (er erVar : this.a.values()) {
            if (erVar instanceof ay) {
                arrayList.add((ay) erVar);
            }
        }
        Collections.sort(arrayList, this.j);
        return arrayList;
    }

    private List<Polygon> i() {
        ArrayList arrayList = new ArrayList();
        for (er erVar : this.a.values()) {
            if (erVar instanceof ax) {
                arrayList.add((ax) erVar);
            }
        }
        Collections.sort(arrayList, this.g);
        return arrayList;
    }

    private List<Circle> j() {
        ArrayList arrayList = new ArrayList();
        for (er erVar : this.a.values()) {
            if (erVar instanceof at) {
                arrayList.add((at) erVar);
            }
        }
        Collections.sort(arrayList, this.j);
        return arrayList;
    }

    private void k() {
        Iterator<er> it = this.a.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final boolean a(IndoorBuilding indoorBuilding) {
        this.i = indoorBuilding;
        boolean z = false;
        for (en enVar : this.e) {
            if (enVar.m() != null) {
                z = true;
                if (indoorBuilding != null) {
                    enVar.a(indoorBuilding);
                } else {
                    enVar.o();
                }
            }
        }
        return z;
    }

    public final Iterable<er> b() {
        return this.a.values();
    }

    private void a(er erVar) {
        bf bfVar = this.h;
        synchronized (bfVar.a) {
            if (!bfVar.a.contains(erVar)) {
                bfVar.a.add(erVar);
            }
        }
        if (erVar instanceof en) {
            a((en) erVar);
        }
    }

    private void b(er erVar) {
        bf bfVar = this.h;
        if (erVar != null) {
            synchronized (bfVar.a) {
                bfVar.a.remove(erVar);
                bfVar.b.add(erVar);
            }
        }
    }

    private void a(GL10 gl10) {
        this.h.a(gl10);
    }

    private boolean a(float f, float f2) {
        return this.h.a(f, f2);
    }
}
