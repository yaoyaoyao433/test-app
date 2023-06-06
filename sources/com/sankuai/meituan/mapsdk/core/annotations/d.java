package com.sankuai.meituan.mapsdk.core.annotations;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class d extends f implements com.sankuai.meituan.mapsdk.core.interfaces.g, com.sankuai.meituan.mapsdk.maps.interfaces.q {
    public static ChangeQuickRedirect a;
    protected List<LatLng> b;
    protected boolean c;
    protected float d;
    protected int e;
    protected int f;
    protected List<List<LatLng>> g;
    protected int[] h;
    private BitmapDescriptor y;

    public d(g gVar) {
        super(gVar);
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "317e0b696ac4ef3fcddb885358777282", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "317e0b696ac4ef3fcddb885358777282");
            return;
        }
        this.b = new ArrayList();
        this.g = new ArrayList();
        this.h = new int[]{0, 0};
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43413e397e1499b43ef4784d18014322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43413e397e1499b43ef4784d18014322");
            return;
        }
        com.sankuai.meituan.mapsdk.core.c cVar = this.j.d;
        this.t = new com.sankuai.meituan.mapsdk.core.render.model.d(this.j.c, null, true);
        this.s = cVar.a(null, this.t);
        this.u = this.t.c();
        this.u.a("id", this.s.d);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public List<LatLng> getPoints() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea9a2ff15434b52e173fc8343b3cfe0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea9a2ff15434b52e173fc8343b3cfe0a");
        }
        ArrayList arrayList = new ArrayList();
        if (this.b != null) {
            arrayList.addAll(this.b);
        }
        return arrayList;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public void setPoints(List<LatLng> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b13388ceb202ba04593c3445dbd38ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b13388ceb202ba04593c3445dbd38ae");
        } else if (f()) {
        } else {
            if (list == null || list.size() < 3) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.d("points == null or points.size < 3");
                return;
            }
            this.b.clear();
            this.b.addAll(list);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ceb01aa452a33f73886f4927110a7aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ceb01aa452a33f73886f4927110a7aa");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (this.b != null) {
                arrayList.add(this.b);
            }
            if (this.g != null && this.g.size() > 0) {
                arrayList.addAll(this.g);
            }
            com.sankuai.meituan.mapsdk.core.render.model.b bVar = this.u;
            com.sankuai.meituan.mapsdk.core.render.model.c cVar = com.sankuai.meituan.mapsdk.core.render.model.c.Polygon;
            Object[] objArr3 = {cVar, arrayList};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.core.render.model.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a518cdf72ed16133be6b564d4e49536a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a518cdf72ed16133be6b564d4e49536a");
            } else if (bVar.b == null || bVar.c == null) {
            } else {
                bVar.b.setFeatureMultiGeometry(bVar.c.e, bVar.d, cVar, arrayList);
            }
        }
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67a173c47cb9b4b9b48bd9d312a19f21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67a173c47cb9b4b9b48bd9d312a19f21");
        } else if (f()) {
        } else {
            if (z) {
                this.s.a(3009, h.b);
            } else {
                this.s.a(3009, h.c);
            }
            this.c = z;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public float getStrokeWidth() {
        return this.d;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0029162675f3e2b33db6de1d8a33051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0029162675f3e2b33db6de1d8a33051");
        } else if (f()) {
        } else {
            this.s.a(3006, com.sankuai.meituan.mapsdk.core.utils.d.a(f));
            this.d = f;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public int getStrokeColor() {
        return this.e;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "916c39908576df2c8b5195f21e5032b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "916c39908576df2c8b5195f21e5032b8");
        } else if (f()) {
        } else {
            this.s.a(3003, com.sankuai.meituan.mapsdk.core.render.b.f(i));
            this.e = i;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public int getFillColor() {
        return this.f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public void setFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f309dd81f1ba4a937808ae934d555b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f309dd81f1ba4a937808ae934d555b57");
        } else if (f()) {
        } else {
            this.s.a(1001, com.sankuai.meituan.mapsdk.core.render.b.f(i));
            this.f = i;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public boolean contains(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db836a754c62fd1086cbf3d5de4aa421", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db836a754c62fd1086cbf3d5de4aa421")).booleanValue();
        }
        for (List<LatLng> list : this.g) {
            if (a(latLng, list)) {
                return false;
            }
        }
        return a(latLng, this.b);
    }

    private boolean a(LatLng latLng, List<LatLng> list) {
        Object[] objArr = {latLng, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a873d3fadd87e47d922d500ae0114571", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a873d3fadd87e47d922d500ae0114571")).booleanValue() : com.sankuai.meituan.mapsdk.core.render.b.a(list, latLng);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f380d9cf7208166e013e0cfc096ae0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f380d9cf7208166e013e0cfc096ae0a");
            return;
        }
        if (this.y != null) {
            this.j.e.b(this.t, this.y);
            this.y = null;
        }
        super.remove();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public void setFillTexture(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f511ecff18b7f99a510d514ed4079220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f511ecff18b7f99a510d514ed4079220");
        } else if (f() || bitmapDescriptor == this.y) {
        } else {
            String str = "";
            l lVar = this.j.e;
            if (bitmapDescriptor != null) {
                str = bitmapDescriptor.getId();
                lVar.a(this.t, bitmapDescriptor, this.y);
            } else {
                lVar.b(this.t, this.y);
            }
            this.s.a(1002, str);
            this.y = bitmapDescriptor;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public BitmapDescriptor getFillTexture() {
        return this.y;
    }
}
