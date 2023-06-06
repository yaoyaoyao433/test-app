package com.sankuai.meituan.mapsdk.core;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import com.meituan.mtmap.rendersdk.QueryObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.interfaces.OnMapChangedListener;
import com.sankuai.meituan.mapsdk.maps.CameraUpdate;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateMessage;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.aa;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.Projection;
import com.sankuai.meituan.mapsdk.maps.model.RestrictBoundsFitMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h implements com.sankuai.meituan.mapsdk.core.gesture.c, OnMapChangedListener {
    public static ChangeQuickRedirect a;
    final com.sankuai.meituan.mapsdk.core.gesture.d b;
    final d c;
    j d;
    final b e;
    MTMap.OnMapClickListener f;
    MTMap.OnMapLongClickListener g;
    aa h;
    volatile CopyOnWriteArrayList<MTMap.OnCameraChangeListener> i;
    volatile boolean j;
    volatile MTMap.CancelableCallback k;
    protected volatile CameraPosition l;
    MTMap.OnMapPoiClickListener m;
    MTMap.OnMapAoiClickListener n;
    volatile CameraPosition o;
    volatile boolean p;
    volatile long q;
    final Map<Long, c> r;
    private CameraPosition s;
    private boolean t;
    private final float u;
    private volatile boolean v;
    private volatile boolean w;
    private final Runnable x;

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final void a() {
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final void b(float f, float f2) {
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final void d(float f, float f2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.meituan.mapsdk.core.h r40, com.sankuai.meituan.mapsdk.core.h.c r41) {
        /*
            Method dump skipped, instructions count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mapsdk.core.h.a(com.sankuai.meituan.mapsdk.core.h, com.sankuai.meituan.mapsdk.core.h$c):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        OnClick,
        OnDrag;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67c560b8dcedc633f72ed2ad474d9326", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67c560b8dcedc633f72ed2ad474d9326");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a4d85f31b2454fcd12f2cbc608d3e15", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a4d85f31b2454fcd12f2cbc608d3e15") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d61045d8092df3f00118f8e0a693ec5b", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d61045d8092df3f00118f8e0a693ec5b") : (a[]) values().clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c {
        public long a;
        public long b;
        public a c;
        public LatLng d;
        public long e;

        public c(a aVar, LatLng latLng, long j) {
            this.c = aVar;
            this.d = latLng;
            this.e = j;
        }
    }

    public h(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90f487efa70fcc36d42c6b0fd2d0d1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90f487efa70fcc36d42c6b0fd2d0d1a");
            return;
        }
        this.s = new CameraPosition.Builder().target(com.sankuai.meituan.mapsdk.core.b.a).zoom(10.0f).bearing(0.0f).build();
        this.t = true;
        this.i = new CopyOnWriteArrayList<>();
        this.j = false;
        this.v = true;
        this.w = false;
        this.p = false;
        this.q = 0L;
        this.x = new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.h.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8dc4c148fe534622a8f42fa2272bad8b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8dc4c148fe534622a8f42fa2272bad8b");
                } else if (!h.this.p || System.currentTimeMillis() - h.this.q < 50 || h.this.i == null || h.this.i.size() <= 0) {
                } else {
                    MTMap.CancelableCallback cancelableCallback = h.this.k;
                    CameraPosition cameraPosition = h.this.o;
                    h.this.k = null;
                    h.this.o = null;
                    if (cancelableCallback != null && cameraPosition != null && !h.this.j) {
                        h.this.j = true;
                        cancelableCallback.onFinish();
                    }
                    Iterator<MTMap.OnCameraChangeListener> it = h.this.i.iterator();
                    while (it.hasNext()) {
                        MTMap.OnCameraChangeListener next = it.next();
                        if (next != null) {
                            h.this.l = h.this.c.getCameraPosition();
                            next.onCameraChangeFinish(h.this.l);
                        }
                    }
                    h.this.p = false;
                }
            }
        };
        this.r = new HashMap();
        this.b = new com.sankuai.meituan.mapsdk.core.gesture.d(com.sankuai.meituan.mapsdk.mapcore.a.a());
        this.b.a((com.sankuai.meituan.mapsdk.core.gesture.c) this, false);
        this.c = dVar;
        this.u = com.sankuai.meituan.mapsdk.core.utils.d.a();
        this.e = new b(this.c, this);
        this.c.d.a(new QueryObserver() { // from class: com.sankuai.meituan.mapsdk.core.h.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtmap.rendersdk.QueryObserver
            public final void onQuery(long j, long j2) {
                Object[] objArr2 = {new Long(j), new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e8643c6ba7e17c2bd1b11cc6bde89f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e8643c6ba7e17c2bd1b11cc6bde89f3");
                    return;
                }
                c remove = h.this.r.remove(Long.valueOf(j));
                remove.b = j2;
                h.a(h.this, remove);
            }
        });
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.OnMapChangedListener
    public final void a(int i, CameraPosition cameraPosition) {
        Object[] objArr = {Integer.valueOf(i), cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c14dc7e9ffb6b45c77dbf2d6351f2ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c14dc7e9ffb6b45c77dbf2d6351f2ad");
            return;
        }
        this.l = cameraPosition;
        if (i == 6 || i == 4) {
            this.q = System.currentTimeMillis();
            this.w = true;
            this.p = false;
        }
        if (i == 4 || i == 5) {
            if (this.i != null && this.i.size() > 0) {
                Iterator<MTMap.OnCameraChangeListener> it = this.i.iterator();
                while (it.hasNext()) {
                    MTMap.OnCameraChangeListener next = it.next();
                    if (next != null) {
                        next.onCameraChange(cameraPosition);
                    }
                }
            }
            if (this.e != null && this.e.e) {
                this.e.a(this.e.c);
            }
        }
        if (i == 5 && this.w && !this.p) {
            this.w = false;
            this.p = true;
            this.q = System.currentTimeMillis();
            c();
        }
        if (i == 2) {
            com.sankuai.meituan.mapsdk.mapcore.utils.f.b(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.h.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "684837dc663490ad8e2c35dc8b1d9a8a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "684837dc663490ad8e2c35dc8b1d9a8a");
                        return;
                    }
                    for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : h.this.b.c) {
                        cVar.a();
                    }
                }
            });
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5acd6903b34a5d97ce34c71303a8147c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5acd6903b34a5d97ce34c71303a8147c");
        } else if (!this.p || !this.v || this.i == null || this.i.size() <= 0) {
        } else {
            this.c.q.postDelayed(this.x, 60L);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a739a9e79cc7f357291d1946b05dc33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a739a9e79cc7f357291d1946b05dc33");
        } else if (this.o != null) {
            d();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final boolean b(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b3f3684f71003b5ec1ae5f259a6e75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b3f3684f71003b5ec1ae5f259a6e75")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                if (!this.v) {
                    this.v = true;
                    c();
                    break;
                }
                break;
            case 2:
                this.v = false;
                break;
        }
        if (this.h != null && !this.c.i) {
            this.h.a(motionEvent);
        }
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final boolean c(MotionEvent motionEvent) {
        boolean z = false;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a655b1b29ba057c5cc79bdfae8fa4feb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a655b1b29ba057c5cc79bdfae8fa4feb")).booleanValue();
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.a("mtmapsdk_delegate_ontapclick", (Map<String, Object>) null);
        if (this.c.i) {
            return true;
        }
        int queryScreenUi = this.c.d.queryScreenUi(motionEvent.getX(), motionEvent.getY());
        if (queryScreenUi != 0) {
            com.sankuai.meituan.mapsdk.core.widgets.d dVar = this.c.h;
            Object[] objArr2 = {Integer.valueOf(queryScreenUi)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.widgets.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "d1b5e1f5f36ba847726c6a7903afecda", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "d1b5e1f5f36ba847726c6a7903afecda")).booleanValue();
            } else {
                com.sankuai.meituan.mapsdk.core.widgets.c cVar = dVar.i.get(queryScreenUi);
                if (cVar != null) {
                    com.sankuai.meituan.mapsdk.core.widgets.b bVar = cVar.m;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.core.widgets.b.b;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "2cdcd5a43aaf979aa6e48c9ecd994a8b", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "2cdcd5a43aaf979aa6e48c9ecd994a8b")).booleanValue();
                    } else if (bVar.e != null) {
                        z = bVar.e.a(bVar);
                    }
                }
            }
            if (z) {
                return true;
            }
        }
        a((int) motionEvent.getX(), (int) motionEvent.getY(), a.OnClick);
        return true;
    }

    private void a(int i, int i2, a aVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11eac8512da4a4965c21e95c76551045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11eac8512da4a4965c21e95c76551045");
        } else if (this.c.i) {
        } else {
            c cVar = new c(aVar, this.c.getProjection().fromScreenLocation(new Point(i, i2)), SystemClock.elapsedRealtime());
            cVar.a = this.c.d.queryRenderedFeaturesByOrder(i - 5, i2 + 5, i + 5, i2 - 5);
            this.r.put(Long.valueOf(cVar.a), cVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final boolean a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b3b3b70b27ffd726872815b9f1543fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b3b3b70b27ffd726872815b9f1543fc")).booleanValue();
        }
        if (this.d.e.e && !this.c.i) {
            e(f, f2);
        }
        return true;
    }

    public final void e(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "385564f6864ed770b914d9b64136ca78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "385564f6864ed770b914d9b64136ca78");
            return;
        }
        double zoom = this.c.d.getZoom() + 1.0d;
        if (this.e.e) {
            zoom = this.e.a(zoom);
        }
        double a2 = com.sankuai.meituan.mapsdk.core.utils.a.a((float) zoom, this.c.getMinZoomLevel(), this.c.getMaxZoomLevel());
        if (this.d != null && this.d.isScaleByMapCenter()) {
            this.c.d.a(new CameraPosition(null, (float) a2, (float) this.c.d.getPitch(), (float) this.c.d.getBearing()), 300);
            return;
        }
        PointF pointF = new PointF(f, f2);
        PointF a3 = this.c.d.a();
        this.c.d.a(pointF, false);
        this.c.d.a(new CameraPosition(null, (float) a2, (float) this.c.d.getPitch(), (float) this.c.d.getBearing()), 300);
        this.c.d.a(a3, false);
    }

    public final void f(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b987f190489b25810600add4ac2f3b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b987f190489b25810600add4ac2f3b5");
            return;
        }
        double zoom = this.c.d.getZoom() - 1.0d;
        if (this.e.e) {
            zoom = this.e.a(zoom);
        }
        double a2 = com.sankuai.meituan.mapsdk.core.utils.a.a((float) zoom, this.c.getMinZoomLevel(), this.c.getMaxZoomLevel());
        if (this.d != null && this.d.isScaleByMapCenter()) {
            this.c.d.a(new CameraPosition(null, (float) a2, (float) this.c.d.getPitch(), (float) this.c.d.getBearing()), 300);
            return;
        }
        PointF pointF = new PointF(f, f2);
        PointF a3 = this.c.d.a();
        this.c.d.a(pointF, false);
        this.c.d.a(new CameraPosition(null, (float) a2, (float) this.c.d.getPitch(), (float) this.c.d.getBearing()), 300);
        this.c.d.a(a3, false);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final void a(MotionEvent motionEvent) {
        LatLng fromScreenLocation;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8217c756ab97c972a88023a31fe4e2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8217c756ab97c972a88023a31fe4e2d");
        } else if (this.g == null || this.c.i || (fromScreenLocation = this.c.getProjection().fromScreenLocation(new Point((int) motionEvent.getX(), (int) motionEvent.getY()))) == null) {
        } else {
            this.g.onMapLongClick(fromScreenLocation);
            this.c.f.j.onMapLongClick();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final boolean a(double d, double d2, double d3, double d4) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e80d8cb679db29c14a345bdb07bb2b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e80d8cb679db29c14a345bdb07bb2b")).booleanValue();
        }
        if (this.c.i || this.d == null || !this.d.isScrollGesturesEnabled() || this.e.e) {
            return true;
        }
        double pitch = this.c.d.getPitch();
        double d5 = (pitch != 0.0d ? pitch / 10.0d : 0.0d) + 1.5d;
        this.c.d.moveBy(new PointF((float) ((d3 / d5) / this.u), (float) ((d4 / d5) / this.u)), (int) (((Math.hypot(d3 / this.u, d4 / this.u) / 7.0d) / d5) + 150.0d));
        return true;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final boolean a(double d, double d2) {
        char c2;
        float[] fArr;
        RectF rectF;
        int i;
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1404b99b50bddab2fb37e1c4879f9f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1404b99b50bddab2fb37e1c4879f9f3")).booleanValue();
        }
        if (this.c.i || this.d == null || !this.d.isScrollGesturesEnabled()) {
            return true;
        }
        if (this.e.e) {
            b bVar = this.e;
            float f = (float) d;
            float f2 = (float) d2;
            Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (!PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "96f2b6b701b9644fc53fd4ea81ec055d", RobustBitConfig.DEFAULT_VALUE)) {
                com.sankuai.meituan.mapsdk.core.render.a aVar = bVar.b.d;
                if (aVar == null || bVar.b.i) {
                    c2 = 1;
                    fArr = new float[]{0.0f, 0.0f};
                } else {
                    LatLngBounds latLngBounds = bVar.c;
                    Object[] objArr3 = {latLngBounds};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "e975720462cdad84d44ed7b6fcd39502", RobustBitConfig.DEFAULT_VALUE)) {
                        rectF = (RectF) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "e975720462cdad84d44ed7b6fcd39502");
                    } else {
                        PointF pointF = new PointF(bVar.b.getProjection().toScreenLocation(latLngBounds.northeast));
                        PointF pointF2 = new PointF(bVar.b.getProjection().toScreenLocation(latLngBounds.southwest));
                        rectF = new RectF(pointF2.x, pointF.y, pointF.x, pointF2.y);
                    }
                    RectF rectF2 = new RectF(f, f2, aVar.b() + f, aVar.c() + f2);
                    if (!rectF.contains(rectF2)) {
                        if (rectF2.contains(rectF)) {
                            com.sankuai.meituan.mapsdk.mapcore.utils.c.d("aptMoveDistance with wrong target rect, targetRectF contains limitRectF");
                            fArr = new float[]{0.0f, 0.0f};
                        } else {
                            if (rectF2.left < rectF.left) {
                                f += rectF.left - rectF2.left;
                            } else if (rectF2.right > rectF.right) {
                                f -= rectF2.right - rectF.right;
                            }
                            if (rectF2.top < rectF.top) {
                                f2 += rectF.top - rectF2.top;
                            } else if (rectF2.bottom > rectF.bottom) {
                                f2 -= rectF2.bottom - rectF.bottom;
                            }
                            if (rectF.width() < rectF2.width()) {
                                f = 0.0f;
                            }
                            if (rectF.height() < rectF2.height()) {
                                i = 2;
                                f2 = 0.0f;
                                fArr = new float[i];
                                fArr[0] = f;
                                c2 = 1;
                                fArr[1] = f2;
                            }
                        }
                    }
                    i = 2;
                    fArr = new float[i];
                    fArr[0] = f;
                    c2 = 1;
                    fArr[1] = f2;
                }
                this.c.d.moveBy(new PointF(-fArr[0], -fArr[c2]), 0);
                return true;
            }
            fArr = (float[]) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "96f2b6b701b9644fc53fd4ea81ec055d");
            c2 = 1;
            this.c.d.moveBy(new PointF(-fArr[0], -fArr[c2]), 0);
            return true;
        }
        this.c.d.moveBy(new PointF((float) (-d), (float) (-d2)), 0);
        return true;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final boolean a(double d, double d2, double d3, int i, boolean z) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "631898bda3653f6a6b0152de36558b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "631898bda3653f6a6b0152de36558b2c")).booleanValue();
        }
        if (!this.c.i && this.d != null && this.d.isZoomGesturesEnabled()) {
            double zoom = this.c.d.getZoom() + d;
            if (this.e.e) {
                zoom = this.e.a(zoom);
            }
            double a2 = com.sankuai.meituan.mapsdk.core.utils.a.a((float) zoom, this.c.getMinZoomLevel(), this.c.getMaxZoomLevel());
            CameraPosition h = this.c.d.h();
            if (h != null) {
                CameraPosition build = new CameraPosition.Builder().target(h.target).zoom((float) a2).tilt(h.tilt).bearing(h.bearing).build();
                if ((this.d != null && this.d.isScaleByMapCenter()) || z) {
                    this.c.d.a(build, i);
                } else {
                    PointF pointF = new PointF((float) d2, (float) d3);
                    PointF a3 = this.c.d.a();
                    this.c.d.a(pointF, false);
                    this.c.d.a(build, i);
                    this.c.d.a(a3, false);
                }
            }
        }
        return true;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final boolean a(double d, float f, float f2) {
        Object[] objArr = {Double.valueOf(d), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3a014898b8d6bf655706a1a1ba18809", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3a014898b8d6bf655706a1a1ba18809")).booleanValue();
        }
        if (!this.c.i && this.d != null && this.d.isRotateGesturesEnabled() && !this.e.e) {
            this.c.d.a(new CameraPosition(null, (float) this.c.d.getZoom(), (float) this.c.d.getPitch(), (float) (this.c.d.getBearing() + d)), 0);
        }
        return true;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final boolean a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5091fa5aeb602cb7b43774b99b65f5a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5091fa5aeb602cb7b43774b99b65f5a8")).booleanValue();
        }
        if (!this.c.i && this.d != null && this.d.isTiltGesturesEnabled() && !this.e.e) {
            b(this.c.d.getPitch() + (d * 0.3d));
        }
        return true;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final boolean c(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af1b5e7bb23a08e8fa04ec8cc23b900f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af1b5e7bb23a08e8fa04ec8cc23b900f")).booleanValue();
        }
        if (!this.c.i && this.d != null && this.d.e.g) {
            f(f, f2);
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.meituan.mapsdk.core.gesture.c
    public final boolean a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f8afea3fbfb018200895178ecaae02", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f8afea3fbfb018200895178ecaae02")).booleanValue();
        }
        switch (i3) {
            case 0:
                a(i, i2, a.OnDrag);
                break;
            case 1:
                break;
            case 2:
                com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.c.f;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
                if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "499cb2f241c7c749b5d5efa37b85b1e3", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "499cb2f241c7c749b5d5efa37b85b1e3")).booleanValue();
                }
                if (iVar.k != null) {
                    if (iVar.g != null) {
                        iVar.g.onMarkerDragEnd(new Marker(iVar.k));
                    }
                    iVar.k = null;
                    return true;
                }
                return false;
            default:
                return false;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar2 = this.c.f;
        Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        if (PatchProxy.isSupport(objArr3, iVar2, changeQuickRedirect3, false, "4bee2c3912423f8b030ae8e836822d1a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr3, iVar2, changeQuickRedirect3, false, "4bee2c3912423f8b030ae8e836822d1a")).booleanValue();
        }
        if (iVar2.k != null) {
            LatLng latLngByScreenCoordinate = iVar2.c.d.getLatLngByScreenCoordinate(new PointF(i, i2));
            if (latLngByScreenCoordinate != null) {
                iVar2.k.setPosition(latLngByScreenCoordinate);
                if (iVar2.g != null) {
                    iVar2.g.onMarkerDrag(new Marker(iVar2.k));
                }
            }
            return true;
        }
        return false;
    }

    public final void a(MapViewOptions mapViewOptions) {
        Object[] objArr = {mapViewOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6090d9f4670c5b33e21030c949add6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6090d9f4670c5b33e21030c949add6");
        } else if (mapViewOptions != null && mapViewOptions.getCameraPosition() != null) {
            CameraPosition cameraPosition = mapViewOptions.getCameraPosition();
            if (this.c.d != null) {
                this.c.d.a(cameraPosition, 0);
            }
            this.l = cameraPosition;
        } else {
            if (this.c.d != null) {
                this.c.d.a(this.s, 0);
            }
            this.l = this.s;
        }
    }

    public final void b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d0bca662c641626ce86ebe4134eadb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d0bca662c641626ce86ebe4134eadb6");
        } else {
            this.c.d.a(new CameraPosition(null, (float) this.c.d.getZoom(), (float) d, (float) this.c.d.getBearing()), 0);
        }
    }

    public final void a(CameraUpdate cameraUpdate, MTMap.CancelableCallback cancelableCallback) {
        Object[] objArr = {cameraUpdate, cancelableCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad9ff15ad51cedadf53a97d50a81604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad9ff15ad51cedadf53a97d50a81604");
        } else {
            a(cameraUpdate, 0L, cancelableCallback);
        }
    }

    public final synchronized void a(CameraUpdate cameraUpdate, long j, MTMap.CancelableCallback cancelableCallback) {
        float f;
        float f2;
        float f3;
        Object[] objArr = {cameraUpdate, new Long(j), cancelableCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32a780769155317cc49fed6cf592c60f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32a780769155317cc49fed6cf592c60f");
            return;
        }
        com.sankuai.meituan.mapsdk.core.render.a aVar = this.c.d;
        if (!this.c.i && aVar != null && cameraUpdate != null && aVar.b() >= 0 && aVar.c() >= 0) {
            CameraUpdateMessage cameraUpdateMessage = cameraUpdate.getCameraUpdateMessage();
            PointF a2 = aVar.a();
            float f4 = 0.0f;
            if (a2 != null && this.t && cameraUpdateMessage.type != CameraUpdateMessage.CameraUpdateType.NEW_LATLNG_BOUNDS_RECT && cameraUpdateMessage.type != CameraUpdateMessage.CameraUpdateType.NEW_CAMERA_POSITION_WITH_PADDING) {
                f4 = a2.x;
                f2 = a2.y;
                f = aVar.c() - a2.y;
                f3 = aVar.b() - a2.x;
            } else if (cameraUpdateMessage.type == CameraUpdateMessage.CameraUpdateType.NEW_CAMERA_POSITION_WITH_PADDING) {
                float f5 = cameraUpdateMessage.paddingTop;
                f3 = cameraUpdateMessage.paddingRight;
                f4 = cameraUpdateMessage.paddingLeft;
                f = cameraUpdateMessage.paddingBottom;
                f2 = f5;
            } else {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
            }
            CameraPosition a3 = a(this.c.d, cameraUpdate);
            if (!this.j) {
                d();
            }
            if (a3 != null) {
                this.o = a3;
                if (cancelableCallback != null) {
                    this.j = false;
                    this.k = cancelableCallback;
                }
                CameraPosition cameraPosition = new CameraPosition(a3.target, (!this.e.e || Float.isNaN(a3.zoom)) ? a3.zoom : (float) this.e.a(a3.zoom), a3.tilt, a3.bearing);
                PointF a4 = this.c.d.a();
                this.c.d.a((PointF) null, false);
                this.c.d.setCameraPosition(cameraPosition, new float[]{f4, f2, f3, f}, (int) j);
                this.c.d.a(a4, false);
            }
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b92901aaa43f9a4b8a8d7ac3a48251fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b92901aaa43f9a4b8a8d7ac3a48251fa");
            return;
        }
        if (this.k != null && !this.j) {
            this.j = true;
            this.k.onCancel();
            this.k = null;
        }
        this.o = null;
        if (this.c.d != null) {
            this.c.d.cancelAnimation();
        }
    }

    public static CameraPosition a(com.sankuai.meituan.mapsdk.core.render.a aVar, CameraUpdate cameraUpdate) {
        Object[] objArr = {aVar, cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "539404746c56ba6027ddbb8118863177", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "539404746c56ba6027ddbb8118863177");
        }
        CameraUpdateMessage cameraUpdateMessage = cameraUpdate.getCameraUpdateMessage();
        switch (cameraUpdateMessage.type) {
            case NEW_CAMERA_POSITION:
            case NEW_CAMERA_POSITION_WITH_PADDING:
            case NEW_LATLNG:
            case NEW_LATLNG_ZOOM:
                return new com.sankuai.meituan.mapsdk.core.camera.c(cameraUpdateMessage).a(aVar);
            case NEW_LATLNG_BOUNDS:
            case NEW_LATLNG_BOUNDS_RECT:
            case NEW_LATLNG_BOUNDS_WITH_PIXEL:
                return new com.sankuai.meituan.mapsdk.core.camera.a(cameraUpdateMessage).a(aVar);
            case SCROLL_BY:
                return new com.sankuai.meituan.mapsdk.core.camera.b(cameraUpdateMessage).a(aVar);
            case ZOOM_BY:
            case ZOOM_IN:
            case ZOOM_OUT:
            case ZOOM_TO:
                return new com.sankuai.meituan.mapsdk.core.camera.e(cameraUpdateMessage).a(aVar);
            case CHANGE_TILT:
                return new com.sankuai.meituan.mapsdk.core.camera.d(cameraUpdateMessage).a(aVar);
            default:
                return null;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mapsdk.core.h$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] a;

        static {
            try {
                c[CameraUpdateMessage.CameraUpdateType.NEW_CAMERA_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.NEW_CAMERA_POSITION_WITH_PADDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.NEW_LATLNG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.NEW_LATLNG_ZOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.NEW_LATLNG_BOUNDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.NEW_LATLNG_BOUNDS_RECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.NEW_LATLNG_BOUNDS_WITH_PIXEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.SCROLL_BY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.ZOOM_BY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.ZOOM_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.ZOOM_OUT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.ZOOM_TO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                c[CameraUpdateMessage.CameraUpdateType.CHANGE_TILT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            b = new int[com.sankuai.meituan.mapsdk.core.render.model.c.valuesCustom().length];
            try {
                b[com.sankuai.meituan.mapsdk.core.render.model.c.Point.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[com.sankuai.meituan.mapsdk.core.render.model.c.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[com.sankuai.meituan.mapsdk.core.render.model.c.Polygon.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[com.sankuai.meituan.mapsdk.core.render.model.c.MultiPolygon.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            a = new int[a.valuesCustom().length];
            try {
                a[a.OnDrag.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[a.OnClick.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        final d b;
        LatLngBounds c;
        RestrictBoundsFitMode d;
        boolean e;
        private final h f;
        private CameraPosition g;

        public b(d dVar, h hVar) {
            Object[] objArr = {dVar, hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbcaa93f5e976a617c6ce19d766b2fcd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbcaa93f5e976a617c6ce19d766b2fcd");
                return;
            }
            this.b = dVar;
            this.f = hVar;
        }

        public final void a(LatLngBounds latLngBounds) {
            LatLngBounds b;
            Object[] objArr = {latLngBounds};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e6a424d7ad6ffeb7d8624a89b585e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e6a424d7ad6ffeb7d8624a89b585e0");
            } else if (this.b.d == null || this.c == null || this.b.d.b() == 0 || this.b.d.c() == 0 || (b = b(latLngBounds)) == null) {
            } else {
                this.b.d.a(b);
            }
        }

        private LatLngBounds b(LatLngBounds latLngBounds) {
            Object[] objArr = {latLngBounds};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a489d33af98d3730b59a3e251b098a1", RobustBitConfig.DEFAULT_VALUE)) {
                return (LatLngBounds) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a489d33af98d3730b59a3e251b098a1");
            }
            Projection projection = this.b.getProjection();
            com.sankuai.meituan.mapsdk.core.render.a aVar = this.b.d;
            if (projection == null && aVar == null) {
                return null;
            }
            Point screenLocation = projection.toScreenLocation(latLngBounds.northeast);
            Point screenLocation2 = projection.toScreenLocation(latLngBounds.southwest);
            return new LatLngBounds(projection.fromScreenLocation(new Point((int) (screenLocation.x - (aVar.b() / 2.0f)), (int) (screenLocation.y + (aVar.c() / 2.0f)))), projection.fromScreenLocation(new Point((int) (screenLocation2.x + (aVar.b() / 2.0f)), (int) (screenLocation2.y - (aVar.c() / 2.0f)))));
        }

        public final double a(double d) {
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aff23f908df31649d4969cc861efd411", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aff23f908df31649d4969cc861efd411")).doubleValue() : d <= ((double) this.g.zoom) ? this.g.zoom : d;
        }

        private boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee1948ef98a354c5657902bc0434f686", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee1948ef98a354c5657902bc0434f686")).booleanValue();
            }
            Projection projection = this.b.getProjection();
            com.sankuai.meituan.mapsdk.core.render.a aVar = this.b.d;
            if (projection == null || aVar == null || this.b.i) {
                return false;
            }
            LatLngBounds b = b(this.c);
            LatLng fromScreenLocation = projection.fromScreenLocation(new Point(aVar.b() / 2, aVar.c() / 2));
            if (b == null || fromScreenLocation == null) {
                return false;
            }
            return b.contains(fromScreenLocation);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(LatLngBounds latLngBounds, boolean z) {
            Object[] objArr = {latLngBounds, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48c191b5462d116c62e3941197ba3a11", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48c191b5462d116c62e3941197ba3a11");
            } else if (latLngBounds != null) {
                CameraPosition a2 = this.b.a(latLngBounds, (int[]) null);
                if (a2 == null) {
                    return;
                }
                if ((z || this.b.d.getZoom() < ((double) a2.zoom) || !a()) && !a2.equals(this.f.l)) {
                    this.b.d.a(new CameraPosition(a2.target, a2.zoom, 0.0f, 0.0f), 0);
                }
                a(this.c);
                this.g = a2;
                this.e = true;
            } else {
                this.e = false;
                this.b.d.a((LatLngBounds) null);
            }
        }
    }
}
