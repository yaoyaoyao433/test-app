package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.lib.models.PolygonInfo;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ou extends or<aq> implements aq, fe {
    private static final double K = 1.0E-10d;
    private static final int n = 180;
    private static final int o = 1;
    private Rect A;
    private GeoPoint[] B;
    private boolean C;
    private boolean D;
    private ArrayList<qa> E;
    private ArrayList<qa> F;
    private PolygonOptions G;
    private mn H;
    private String I;
    private BitmapDescriptor J;
    final PolygonInfo a;
    private List<GeoPoint> p;
    private List<LatLng> q;
    private fu[] r;
    private GeoPoint s;
    private Rect t;
    private Rect u;
    private qa v;
    private final byte[] w;
    private b x;
    private String y;
    private GeoPoint z;

    private static double a(double d, double d2, double d3, double d4, double d5, double d6) {
        return ((d3 - d) * (d6 - d2)) - ((d5 - d) * (d4 - d2));
    }

    private static boolean a(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d3 - d;
        double d9 = d7 - d6;
        double d10 = d4 - d2;
        double d11 = 180.0d - d5;
        double d12 = (d8 * d9) - (d10 * d11);
        if (d12 != 0.0d) {
            double d13 = d2 - d6;
            double d14 = d - d5;
            double d15 = ((d11 * d13) - (d9 * d14)) / d12;
            double d16 = ((d13 * d8) - (d14 * d10)) / d12;
            if (d15 >= 0.0d && d15 <= 1.0d && d16 >= 0.0d && d16 <= 1.0d) {
                return true;
            }
        }
        return false;
    }

    private aq h() {
        return this;
    }

    private static int t() {
        return 1;
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ ap f_() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean handleOnTap() {
        return true;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final boolean isSelected() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final void setSelected(boolean z) {
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final void setSelectedListener(Selectable.OnSelectedListener onSelectedListener) {
    }

    public ou(ba baVar, PolygonOptions polygonOptions) {
        super(baVar);
        this.p = new ArrayList();
        this.w = new byte[0];
        this.x = new b((byte) 0);
        this.z = new GeoPoint();
        this.A = new Rect();
        this.C = false;
        this.D = false;
        this.a = new PolygonInfo();
        this.a.polygonId = -1;
        this.G = polygonOptions;
        this.H = baVar.b();
        if (polygonOptions != null && !hb.a(this.I)) {
            this.H.i.a(this);
        }
        a(polygonOptions);
    }

    private void a(List<GeoPoint> list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.p == null) {
            this.p = new ArrayList();
        } else {
            this.p.clear();
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            GeoPoint geoPoint = list.get(i);
            if (geoPoint != null) {
                q();
                this.p.add(geoPoint);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.aq
    public final void a(PolygonOptions polygonOptions) {
        if (polygonOptions == null) {
            return;
        }
        setFillColor(polygonOptions.getFillColor());
        setStrokeColor(polygonOptions.getStrokeColor());
        setStrokeWidth(polygonOptions.getStrokeWidth());
        setZIndex(polygonOptions.getZIndex());
        setVisible(polygonOptions.isVisible());
        setLevel(polygonOptions.getLevel());
        setClickable(polygonOptions.isClickable());
        setPoints(polygonOptions.getPoints());
        List<Integer> pattern = polygonOptions.getPattern();
        if (pattern != null && !pattern.isEmpty()) {
            int[] iArr = new int[pattern.size()];
            for (int i = 0; i < pattern.size(); i++) {
                iArr[i] = pattern.get(i).intValue();
            }
            this.a.pattern = iArr;
        }
        BitmapDescriptor texture = polygonOptions.getTexture();
        if (this.J != texture) {
            this.J = texture;
            this.J.getBitmap(this.H.getContext());
            this.a.textureName = this.J.getFormater().getBitmapId();
        }
        this.a.textureSpacing = polygonOptions.getTextureSpacing();
        q();
    }

    @Override // com.tencent.mapsdk.internal.aq
    public final int k_() {
        if (this.a == null) {
            return -1;
        }
        return this.a.polygonId;
    }

    @Override // com.tencent.mapsdk.internal.aq
    public final PolygonInfo b() {
        return this.a;
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void j_() {
        Rect f;
        mn mnVar = this.H;
        if (mnVar == null) {
            return;
        }
        eq eqVar = mnVar.n;
        if (!isVisible()) {
            mnVar.a(this.a.polygonId);
            this.a.polygonId = -1;
            return;
        }
        boolean z = false;
        if (this.a != null && this.G != null && this.G.isValid() && (f = f()) != null) {
            fm[] a2 = a(new fm[]{eqVar.a(new GeoPoint(f.top, f.left)), eqVar.a(new GeoPoint(f.top, f.right)), eqVar.a(new GeoPoint(f.bottom, f.right)), eqVar.a(new GeoPoint(f.bottom, f.left))});
            Rect rect = new Rect((int) a2[0].a, (int) a2[0].b, (int) a2[1].a, (int) a2[1].b);
            if (Math.abs(rect.width()) > 5 && Math.abs(rect.height()) > 5) {
                z = true;
            }
        }
        if (z) {
            if (hb.a(this.I)) {
                j();
            }
            if (-1 == this.a.polygonId) {
                this.a.polygonId = this.H.a(this.a);
            } else if (p()) {
                this.H.b(this.a);
            }
            if (this.v != null) {
                this.v.j_();
                StringBuilder sb = new StringBuilder();
                sb.append(this.v.f());
                this.y = sb.toString();
                if (this.D) {
                    return;
                }
                mnVar.a(this.v.f(), this.a != null ? this.a.polygonId : -1);
                this.D = true;
            }
        }
    }

    private void e() {
        if (-1 == this.a.polygonId) {
            this.a.polygonId = this.H.a(this.a);
        } else if (p()) {
            this.H.b(this.a);
        }
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f, float f2) {
        Rect rect;
        if (this.H == null || !isVisible()) {
            return false;
        }
        boolean z = true;
        if (this.u == null && this.p != null && !this.p.isEmpty() && this.p.size() >= 3) {
            fu b2 = this.H.n.b(this.p.get(0).toLatLng());
            int x = (int) b2.x();
            int x2 = (int) b2.x();
            int y = (int) b2.y();
            int y2 = (int) b2.y();
            int size = this.p.size();
            int i = y2;
            for (int i2 = 1; i2 < size; i2++) {
                fu b3 = this.H.n.b(this.p.get(i2).toLatLng());
                x = (int) Math.min(x, b3.x());
                x2 = (int) Math.max(x2, b3.x());
                y = (int) Math.min(y, b3.y());
                i = (int) Math.max(i, b3.y());
            }
            this.u = new Rect(x, y, x2, i);
        }
        if (this.H != null) {
            fu b4 = this.H.n.b(this.H.n.a(new fm(0.0d, 0.0d)).toLatLng());
            fu b5 = this.H.n.b(this.H.n.a(new fm(this.H.o.width(), this.H.o.height())).toLatLng());
            rect = new Rect((int) b4.x(), (int) b4.y(), (int) b5.x(), (int) b5.y());
        } else {
            rect = null;
        }
        if ((this.u == null || rect == null || this.u.right < rect.left || this.u.left > rect.right || this.u.bottom > rect.top || this.u.top < rect.bottom) ? false : false) {
            return a(this.H.n.b(this.H.n.a(new fm(f, f2)).toLatLng()));
        }
        return false;
    }

    private boolean a(fu fuVar) {
        if (this.q == null || this.q.size() <= 2) {
            return false;
        }
        this.r = new fu[this.q.size() + 1];
        for (int i = 0; i < this.q.size(); i++) {
            this.r[i] = this.H.n.b(this.q.get(i));
            this.r[i].setX(this.r[i].c - fuVar.c);
            this.r[i].setY(this.r[i].b - fuVar.b);
        }
        this.r[this.q.size()] = this.H.n.b(this.q.get(0));
        this.r[this.q.size()].setX(this.r[this.q.size()].c - fuVar.c);
        this.r[this.q.size()].setY(this.r[this.q.size()].b - fuVar.b);
        int i2 = this.r[0].c >= 0.0d ? this.r[0].b >= 0.0d ? 0 : 3 : this.r[0].b >= 0.0d ? 1 : 2;
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 1; i3 <= this.r.length - i5 && (this.r[i3].c != 0.0d || this.r[i3].b != 0.0d); i5 = 1) {
            int i6 = i3 - 1;
            int i7 = (((this.r[i3].b * this.r[i6].c) - (this.r[i3].c * this.r[i6].b)) > 0.0d ? 1 : (((this.r[i3].b * this.r[i6].c) - (this.r[i3].c * this.r[i6].b)) == 0.0d ? 0 : -1));
            if (i7 == 0 && this.r[i6].c * this.r[i3].c <= 0.0d && this.r[i6].b * this.r[i3].b <= 0.0d) {
                break;
            }
            int i8 = this.r[i3].c >= 0.0d ? this.r[i3].b >= 0.0d ? 0 : 3 : this.r[i3].b >= 0.0d ? 1 : 2;
            if (i8 == (i2 + 1) % 4) {
                i4++;
            } else if (i8 == (i2 + 3) % 4) {
                i4--;
            } else if (i8 == (i2 + 2) % 4) {
                i4 = i7 > 0 ? i4 + 2 : i4 - 2;
            }
            i3++;
            i2 = i8;
        }
        return i3 <= this.q.size() || i4 != 0;
    }

    private boolean a(Rect rect) {
        return this.u != null && rect != null && this.u.right >= rect.left && this.u.left <= rect.right && this.u.bottom <= rect.top && this.u.top >= rect.bottom;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.en
    public final void j() {
        if (this.H == null) {
            return;
        }
        if ((this.a.polygonId < 0 || p()) && this.p != null && this.p.size() > 2) {
            this.a.color = this.e;
            this.a.borderColor = this.f;
            this.a.borderWidth = this.d;
            this.a.zIndex = getZIndex();
            this.a.level = getLevel();
            int size = this.p.size();
            this.a.points = new LatLng[size];
            for (int i = 0; i < size; i++) {
                this.a.points[i] = this.p.get(i).toLatLng();
            }
            this.H.v = true;
            q();
        }
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void h_() {
        if (this.H == null) {
            return;
        }
        this.H.i.b(this);
        if (this.a != null) {
            this.H.a(this.a.polygonId);
        }
        if (this.p != null) {
            this.p.clear();
            this.p = null;
        }
        synchronized (this.w) {
            if (this.x != null) {
                b bVar = this.x;
                if (bVar.a != null && !bVar.a.isRecycled()) {
                    bVar.a.recycle();
                    bVar.a = null;
                }
                this.x = null;
            }
        }
        if (this.v != null) {
            this.H.k.b(this.v);
            this.H.v = true;
            this.v = null;
        }
        this.C = false;
    }

    private Rect f() {
        if (this.t != null) {
            return this.t;
        }
        if (this.p == null || this.p.isEmpty() || this.p.size() < 3) {
            return null;
        }
        GeoPoint geoPoint = this.p.get(0);
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        int size = this.p.size();
        int i = latitudeE6;
        int i2 = i;
        int i3 = longitudeE6;
        for (int i4 = 1; i4 < size; i4++) {
            GeoPoint geoPoint2 = this.p.get(i4);
            int latitudeE62 = geoPoint2.getLatitudeE6();
            int longitudeE62 = geoPoint2.getLongitudeE6();
            longitudeE6 = Math.min(longitudeE6, longitudeE62);
            i3 = Math.max(i3, longitudeE62);
            i = Math.max(i, latitudeE62);
            i2 = Math.min(i2, latitudeE62);
        }
        this.t = new Rect(longitudeE6, i, i3, i2);
        return this.t;
    }

    private Rect g() {
        if (this.u != null) {
            return this.u;
        }
        if (this.p == null || this.p.isEmpty() || this.p.size() < 3) {
            return null;
        }
        fu b2 = this.H.n.b(this.p.get(0).toLatLng());
        int x = (int) b2.x();
        int x2 = (int) b2.x();
        int y = (int) b2.y();
        int y2 = (int) b2.y();
        int size = this.p.size();
        for (int i = 1; i < size; i++) {
            fu b3 = this.H.n.b(this.p.get(i).toLatLng());
            x = (int) Math.min(x, b3.x());
            x2 = (int) Math.max(x2, b3.x());
            y = (int) Math.min(y, b3.y());
            y2 = (int) Math.max(y2, b3.y());
        }
        this.u = new Rect(x, y, x2, y2);
        return this.u;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final void setPoints(List<LatLng> list) {
        int size;
        GeoPoint from;
        this.q = list;
        if (list != null && (size = list.size()) > 0) {
            if (this.G != null) {
                this.G.setPoints(new ArrayList(list));
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                LatLng latLng = list.get(i);
                if (latLng != null && (from = GeoPoint.from(latLng)) != null) {
                    arrayList.add(from);
                }
            }
            a(arrayList);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final List<LatLng> getPoints() {
        if (this.q != null) {
            return this.q;
        }
        return kb.a(this.p);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final void setOptions(PolygonOptions polygonOptions) {
        a(polygonOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final boolean contains(LatLng latLng) {
        List<LatLng> points = getPoints();
        if (points == null || points.size() < 3 || latLng == null) {
            return false;
        }
        int size = points.size() - 1;
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i).equals(latLng)) {
                return true;
            }
        }
        int i2 = size;
        boolean z = false;
        for (int i3 = 0; i3 < points.size(); i3++) {
            if (((points.get(i3).latitude < latLng.latitude && points.get(i2).latitude >= latLng.latitude) || (points.get(i2).latitude < latLng.latitude && points.get(i3).latitude >= latLng.latitude)) && (points.get(i3).longitude <= latLng.longitude || points.get(i2).longitude <= latLng.longitude)) {
                z ^= points.get(i3).longitude + (((latLng.latitude - points.get(i3).latitude) / (points.get(i2).latitude - points.get(i3).latitude)) * (points.get(i2).longitude - points.get(i3).longitude)) <= latLng.longitude;
            }
            i2 = i3;
        }
        return z;
    }

    @Override // com.tencent.mapsdk.internal.aq
    public final List<GeoPoint> c() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(49);
        Rect f = f();
        int i = f.left;
        int i2 = f.right;
        int i3 = f.top;
        int i4 = f.bottom;
        double d = i;
        double abs = Math.abs(f.width());
        double d2 = d - (abs * 0.125d);
        double d3 = i3;
        double abs2 = Math.abs(f.height());
        double d4 = d3 - (0.125d * abs2);
        double d5 = d - (abs * 0.25d);
        double d6 = d3 - (0.25d * abs2);
        double d7 = d - (abs * 0.375d);
        double d8 = d3 - (0.375d * abs2);
        double d9 = d - (abs * 0.5d);
        double d10 = d3 - (0.5d * abs2);
        double d11 = d - (abs * 0.625d);
        double d12 = d3 - (0.625d * abs2);
        double d13 = d - (abs * 0.75d);
        double d14 = d3 - (0.75d * abs2);
        double d15 = d - (abs * 0.825d);
        double d16 = d3 - (abs2 * 0.825d);
        int i5 = (int) d4;
        int i6 = (int) d2;
        GeoPoint geoPoint = new GeoPoint(new GeoPoint(i5, i6));
        if (a(geoPoint)) {
            arrayList = arrayList2;
            arrayList.add(geoPoint);
        } else {
            arrayList = arrayList2;
        }
        int i7 = (int) d6;
        GeoPoint geoPoint2 = new GeoPoint(new GeoPoint(i7, i6));
        if (a(geoPoint2)) {
            arrayList.add(geoPoint2);
        }
        int i8 = (int) d8;
        GeoPoint geoPoint3 = new GeoPoint(new GeoPoint(i8, i6));
        if (a(geoPoint3)) {
            arrayList.add(geoPoint3);
        }
        int i9 = (int) d10;
        GeoPoint geoPoint4 = new GeoPoint(new GeoPoint(i9, i6));
        if (a(geoPoint4)) {
            arrayList.add(geoPoint4);
        }
        int i10 = (int) d12;
        GeoPoint geoPoint5 = new GeoPoint(new GeoPoint(i10, i6));
        if (a(geoPoint5)) {
            arrayList.add(geoPoint5);
        }
        int i11 = (int) d14;
        GeoPoint geoPoint6 = new GeoPoint(new GeoPoint(i11, i6));
        if (a(geoPoint6)) {
            arrayList.add(geoPoint6);
        }
        int i12 = (int) d16;
        GeoPoint geoPoint7 = new GeoPoint(new GeoPoint(i12, i6));
        if (a(geoPoint7)) {
            arrayList.add(geoPoint7);
        }
        int i13 = (int) d5;
        GeoPoint geoPoint8 = new GeoPoint(new GeoPoint(i5, i13));
        if (a(geoPoint8)) {
            arrayList.add(geoPoint8);
        }
        GeoPoint geoPoint9 = new GeoPoint(new GeoPoint(i7, i13));
        if (a(geoPoint9)) {
            arrayList.add(geoPoint9);
        }
        GeoPoint geoPoint10 = new GeoPoint(new GeoPoint(i8, i13));
        if (a(geoPoint10)) {
            arrayList.add(geoPoint10);
        }
        GeoPoint geoPoint11 = new GeoPoint(new GeoPoint(i9, i13));
        if (a(geoPoint11)) {
            arrayList.add(geoPoint11);
        }
        GeoPoint geoPoint12 = new GeoPoint(new GeoPoint(i10, i13));
        if (a(geoPoint12)) {
            arrayList.add(geoPoint12);
        }
        GeoPoint geoPoint13 = new GeoPoint(new GeoPoint(i11, i13));
        if (a(geoPoint13)) {
            arrayList.add(geoPoint13);
        }
        GeoPoint geoPoint14 = new GeoPoint(new GeoPoint(i12, i13));
        if (a(geoPoint14)) {
            arrayList.add(geoPoint14);
        }
        int i14 = (int) d7;
        GeoPoint geoPoint15 = new GeoPoint(new GeoPoint(i5, i14));
        if (a(geoPoint15)) {
            arrayList.add(geoPoint15);
        }
        GeoPoint geoPoint16 = new GeoPoint(new GeoPoint(i7, i14));
        if (a(geoPoint16)) {
            arrayList.add(geoPoint16);
        }
        GeoPoint geoPoint17 = new GeoPoint(new GeoPoint(i8, i14));
        if (a(geoPoint17)) {
            arrayList.add(geoPoint17);
        }
        GeoPoint geoPoint18 = new GeoPoint(new GeoPoint(i9, i14));
        if (a(geoPoint18)) {
            arrayList.add(geoPoint18);
        }
        GeoPoint geoPoint19 = new GeoPoint(new GeoPoint(i10, i14));
        if (a(geoPoint19)) {
            arrayList.add(geoPoint19);
        }
        GeoPoint geoPoint20 = new GeoPoint(new GeoPoint(i11, i14));
        if (a(geoPoint20)) {
            arrayList.add(geoPoint20);
        }
        GeoPoint geoPoint21 = new GeoPoint(new GeoPoint(i12, i14));
        if (a(geoPoint21)) {
            arrayList.add(geoPoint21);
        }
        int i15 = (int) d9;
        GeoPoint geoPoint22 = new GeoPoint(new GeoPoint(i5, i15));
        if (a(geoPoint22)) {
            arrayList.add(geoPoint22);
        }
        GeoPoint geoPoint23 = new GeoPoint(new GeoPoint(i7, i15));
        if (a(geoPoint23)) {
            arrayList.add(geoPoint23);
        }
        GeoPoint geoPoint24 = new GeoPoint(new GeoPoint(i8, i15));
        if (a(geoPoint24)) {
            arrayList.add(geoPoint24);
        }
        GeoPoint geoPoint25 = new GeoPoint(new GeoPoint(i9, i15));
        if (a(geoPoint25)) {
            arrayList.add(geoPoint25);
        }
        GeoPoint geoPoint26 = new GeoPoint(new GeoPoint(i10, i15));
        if (a(geoPoint26)) {
            arrayList.add(geoPoint26);
        }
        GeoPoint geoPoint27 = new GeoPoint(new GeoPoint(i11, i15));
        if (a(geoPoint27)) {
            arrayList.add(geoPoint27);
        }
        GeoPoint geoPoint28 = new GeoPoint(new GeoPoint(i12, i15));
        if (a(geoPoint28)) {
            arrayList.add(geoPoint28);
        }
        int i16 = (int) d11;
        GeoPoint geoPoint29 = new GeoPoint(new GeoPoint(i5, i16));
        if (a(geoPoint29)) {
            arrayList.add(geoPoint29);
        }
        GeoPoint geoPoint30 = new GeoPoint(new GeoPoint(i7, i16));
        if (a(geoPoint30)) {
            arrayList.add(geoPoint30);
        }
        GeoPoint geoPoint31 = new GeoPoint(new GeoPoint(i8, i16));
        if (a(geoPoint31)) {
            arrayList.add(geoPoint31);
        }
        GeoPoint geoPoint32 = new GeoPoint(new GeoPoint(i9, i16));
        if (a(geoPoint32)) {
            arrayList.add(geoPoint32);
        }
        GeoPoint geoPoint33 = new GeoPoint(new GeoPoint(i10, i16));
        if (a(geoPoint33)) {
            arrayList.add(geoPoint33);
        }
        GeoPoint geoPoint34 = new GeoPoint(new GeoPoint(i11, i16));
        if (a(geoPoint34)) {
            arrayList.add(geoPoint34);
        }
        GeoPoint geoPoint35 = new GeoPoint(new GeoPoint(i12, i16));
        if (a(geoPoint35)) {
            arrayList.add(geoPoint35);
        }
        int i17 = (int) d13;
        GeoPoint geoPoint36 = new GeoPoint(new GeoPoint(i5, i17));
        if (a(geoPoint36)) {
            arrayList.add(geoPoint36);
        }
        GeoPoint geoPoint37 = new GeoPoint(new GeoPoint(i7, i17));
        if (a(geoPoint37)) {
            arrayList.add(geoPoint37);
        }
        GeoPoint geoPoint38 = new GeoPoint(new GeoPoint(i8, i17));
        if (a(geoPoint38)) {
            arrayList.add(geoPoint38);
        }
        GeoPoint geoPoint39 = new GeoPoint(new GeoPoint(i9, i17));
        if (a(geoPoint39)) {
            arrayList.add(geoPoint39);
        }
        GeoPoint geoPoint40 = new GeoPoint(new GeoPoint(i10, i17));
        if (a(geoPoint40)) {
            arrayList.add(geoPoint40);
        }
        GeoPoint geoPoint41 = new GeoPoint(new GeoPoint(i11, i17));
        if (a(geoPoint41)) {
            arrayList.add(geoPoint41);
        }
        GeoPoint geoPoint42 = new GeoPoint(new GeoPoint(i12, i17));
        if (a(geoPoint42)) {
            arrayList.add(geoPoint42);
        }
        int i18 = (int) d15;
        GeoPoint geoPoint43 = new GeoPoint(new GeoPoint(i5, i18));
        if (a(geoPoint43)) {
            arrayList.add(geoPoint43);
        }
        GeoPoint geoPoint44 = new GeoPoint(new GeoPoint(i7, i18));
        if (a(geoPoint44)) {
            arrayList.add(geoPoint44);
        }
        GeoPoint geoPoint45 = new GeoPoint(new GeoPoint(i8, i18));
        if (a(geoPoint45)) {
            arrayList.add(geoPoint45);
        }
        GeoPoint geoPoint46 = new GeoPoint(new GeoPoint(i9, i18));
        if (a(geoPoint46)) {
            arrayList.add(geoPoint46);
        }
        GeoPoint geoPoint47 = new GeoPoint(new GeoPoint(i10, i18));
        if (a(geoPoint47)) {
            arrayList.add(geoPoint47);
        }
        GeoPoint geoPoint48 = new GeoPoint(new GeoPoint(i11, i18));
        if (a(geoPoint48)) {
            arrayList.add(geoPoint48);
        }
        GeoPoint geoPoint49 = new GeoPoint(new GeoPoint(i12, i18));
        if (a(geoPoint49)) {
            arrayList.add(geoPoint49);
        }
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.aq
    public final GeoPoint d() {
        Rect f = f();
        return new GeoPoint(f.centerY(), f.centerX());
    }

    private boolean a(GeoPoint geoPoint) {
        if (this.p == null || this.p.size() <= 1) {
            return false;
        }
        double longitudeE6 = geoPoint.getLongitudeE6();
        double latitudeE6 = geoPoint.getLatitudeE6();
        int size = this.p.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = size - 1;
            if (i < i3) {
                GeoPoint geoPoint2 = this.p.get(i);
                int i4 = i + 1;
                GeoPoint geoPoint3 = this.p.get(i4);
                double longitudeE62 = geoPoint2.getLongitudeE6();
                double latitudeE62 = geoPoint2.getLatitudeE6();
                double longitudeE63 = geoPoint3.getLongitudeE6();
                double latitudeE63 = geoPoint3.getLatitudeE6();
                double d = latitudeE6;
                double d2 = longitudeE6;
                if (b(longitudeE6, latitudeE6, longitudeE62, latitudeE62, longitudeE63, latitudeE63)) {
                    return true;
                }
                if (Math.abs(latitudeE63 - latitudeE62) >= 1.0E-9d) {
                    if (b(longitudeE62, latitudeE62, d2, d, 180.0d, d)) {
                        if (latitudeE62 > latitudeE63) {
                            i2++;
                        }
                    } else if (b(longitudeE63, latitudeE63, d2, d, 180.0d, d)) {
                        if (latitudeE63 > latitudeE62) {
                            i2++;
                        }
                    } else if (a(longitudeE62, latitudeE62, longitudeE63, latitudeE63, d2, d, d)) {
                        i2++;
                    }
                }
                i = i4;
                latitudeE6 = d;
                longitudeE6 = d2;
            } else {
                double d3 = latitudeE6;
                double d4 = longitudeE6;
                GeoPoint geoPoint4 = this.p.get(i3);
                GeoPoint geoPoint5 = this.p.get(0);
                double longitudeE64 = geoPoint4.getLongitudeE6();
                double latitudeE64 = geoPoint4.getLatitudeE6();
                double longitudeE65 = geoPoint5.getLongitudeE6();
                double latitudeE65 = geoPoint5.getLatitudeE6();
                if (b(d4, d3, longitudeE64, latitudeE64, longitudeE65, latitudeE65)) {
                    return true;
                }
                if (Math.abs(latitudeE65 - latitudeE64) >= 1.0E-9d) {
                    if (b(longitudeE64, latitudeE64, d4, d3, 180.0d, d3)) {
                        if (latitudeE64 > latitudeE65) {
                            i2++;
                        }
                    } else if (b(longitudeE65, latitudeE65, d4, d3, 180.0d, d3)) {
                        if (latitudeE65 > latitudeE64) {
                            i2++;
                        }
                    } else if (a(longitudeE64, latitudeE64, longitudeE65, latitudeE65, d4, d3, d3)) {
                        i2++;
                    }
                }
                return i2 % 2 == 1;
            }
        }
    }

    private static boolean b(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.abs(a(d, d2, d3, d4, d5, d6)) < 1.0E-9d && (d - d3) * (d - d5) <= 0.0d && (d2 - d4) * (d2 - d6) <= 0.0d;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a */
    public final Rect getScreenBound(eq eqVar) {
        Rect bound = getBound(eqVar);
        int i = bound.left;
        int i2 = bound.right;
        int i3 = bound.top;
        int i4 = bound.bottom;
        GeoPoint geoPoint = new GeoPoint(i3, i);
        GeoPoint geoPoint2 = new GeoPoint(i4, i);
        GeoPoint geoPoint3 = new GeoPoint(i4, i2);
        GeoPoint geoPoint4 = new GeoPoint(i3, i2);
        fm a2 = eqVar.a(geoPoint);
        fm a3 = eqVar.a(geoPoint2);
        fm a4 = eqVar.a(geoPoint3);
        fm a5 = eqVar.a(geoPoint4);
        return new Rect((int) Math.min(Math.min(a2.a, a3.a), Math.min(a4.a, a5.a)), (int) Math.min(Math.min(a2.b, a3.b), Math.min(a4.b, a5.b)), (int) Math.max(Math.max(a2.a, a3.a), Math.max(a4.a, a5.a)), (int) Math.max(Math.max(a2.b, a3.b), Math.max(a4.b, a5.b)));
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public final Rect getBound(eq eqVar) {
        Rect rect = new Rect();
        new Rect();
        if (this.a != null) {
            rect = f();
        }
        if (this.v != null) {
            Rect b2 = this.v.b(eqVar);
            rect.left = Math.min(rect.left, b2.left);
            rect.top = Math.min(rect.top, b2.top);
            rect.right = Math.max(rect.right, b2.right);
            rect.bottom = Math.max(rect.bottom, b2.bottom);
        }
        return rect;
    }

    private Rect i() {
        if (this.H != null) {
            fu b2 = this.H.n.b(this.H.n.a(new fm(0.0d, 0.0d)).toLatLng());
            fu b3 = this.H.n.b(this.H.n.a(new fm(this.H.o.width(), this.H.o.height())).toLatLng());
            return new Rect((int) b2.x(), (int) b2.y(), (int) b3.x(), (int) b3.y());
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.fe
    public final void b(int i) {
        if (i == fw.a || this.H == null) {
            return;
        }
        eq eqVar = this.H.n;
        if (this.H == null || hb.a(this.I)) {
            return;
        }
        synchronized (this.w) {
            if (this.x == null) {
                this.x = new b((byte) 0);
            }
        }
        fm[] a2 = a(new fm[]{eqVar.a(new GeoPoint(this.A.top, this.A.left)), eqVar.a(new GeoPoint(this.A.top, this.A.right)), eqVar.a(new GeoPoint(this.A.bottom, this.A.right)), eqVar.a(new GeoPoint(this.A.bottom, this.A.left))});
        new Rect((int) a2[0].a, (int) a2[0].b, (int) a2[1].a, (int) a2[1].b);
    }

    private boolean c(eq eqVar) {
        Rect f;
        if (this.a == null || this.G == null || !this.G.isValid() || (f = f()) == null) {
            return false;
        }
        fm[] a2 = a(new fm[]{eqVar.a(new GeoPoint(f.top, f.left)), eqVar.a(new GeoPoint(f.top, f.right)), eqVar.a(new GeoPoint(f.bottom, f.right)), eqVar.a(new GeoPoint(f.bottom, f.left))});
        Rect rect = new Rect((int) a2[0].a, (int) a2[0].b, (int) a2[1].a, (int) a2[1].b);
        return Math.abs(rect.width()) > 5 && Math.abs(rect.height()) > 5;
    }

    private void d(eq eqVar) {
        if (this.H == null || hb.a(this.I)) {
            return;
        }
        synchronized (this.w) {
            if (this.x == null) {
                this.x = new b((byte) 0);
            }
        }
        fm[] a2 = a(new fm[]{eqVar.a(new GeoPoint(this.A.top, this.A.left)), eqVar.a(new GeoPoint(this.A.top, this.A.right)), eqVar.a(new GeoPoint(this.A.bottom, this.A.right)), eqVar.a(new GeoPoint(this.A.bottom, this.A.left))});
        new Rect((int) a2[0].a, (int) a2[0].b, (int) a2[1].a, (int) a2[1].b);
    }

    private static fm[] a(fm[] fmVarArr) {
        double d = fmVarArr[0].a;
        double d2 = fmVarArr[0].b;
        double d3 = fmVarArr[0].a;
        double d4 = fmVarArr[0].b;
        double d5 = d3;
        double d6 = d2;
        double d7 = d;
        int i = 1;
        while (i < 4) {
            double d8 = fmVarArr[i].a;
            int i2 = i;
            double d9 = fmVarArr[i].b;
            if (d8 < d7) {
                d7 = d8;
            }
            if (d8 > d5) {
                d5 = d8;
            }
            if (d9 < d6) {
                d6 = d9;
            }
            if (d9 > d4) {
                d4 = d9;
            }
            i = i2 + 1;
        }
        return new fm[]{new fm(d7, d6), new fm(d5, d4)};
    }

    private int e(eq eqVar) {
        fm[] a2 = a(new fm[]{eqVar.a(new GeoPoint(this.A.top, this.A.left)), eqVar.a(new GeoPoint(this.A.top, this.A.right)), eqVar.a(new GeoPoint(this.A.bottom, this.A.right)), eqVar.a(new GeoPoint(this.A.bottom, this.A.left))});
        new Rect((int) a2[0].a, (int) a2[0].b, (int) a2[1].a, (int) a2[1].b);
        return 1;
    }

    private a[] u() {
        List<GeoPoint> list = this.p;
        List<LatLng> a2 = kb.a(list);
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (i < i2) {
                i++;
                arrayList.add(new a(a2.get(i), a2.get(i)));
            } else {
                arrayList.add(new a(a2.get(i2), a2.get(0)));
                return (a[]) arrayList.toArray(new a[arrayList.size()]);
            }
        }
    }

    private Rect a(a[] aVarArr) {
        LatLng latLng = new LatLng(0.0d, 0.0d);
        double a2 = a(aVarArr, latLng);
        double d = latLng.longitude;
        double d2 = latLng.latitude;
        return new Rect((int) ((d + a2) * 1000000.0d), (int) ((d2 + a2) * 1000000.0d), (int) ((d - a2) * 1000000.0d), (int) ((d2 - a2) * 1000000.0d));
    }

    private double a(a[] aVarArr, LatLng latLng) {
        List<LatLng> a2;
        List<GeoPoint> c = c();
        if (c.isEmpty() || (a2 = kb.a(c)) == null || a2.isEmpty()) {
            return 0.0d;
        }
        int size = a2.size();
        LatLng[] latLngArr = new LatLng[size];
        double[] dArr = new double[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            latLngArr[i2] = new LatLng(0.0d, 0.0d);
            dArr[i2] = a(a2.get(i2), aVarArr, latLngArr[i2]);
            if (Double.isNaN(dArr[i2])) {
                dArr[i2] = 0.0d;
            }
        }
        double d = dArr[0];
        for (int i3 = 1; i3 < size; i3++) {
            if (dArr[i3] > d) {
                d = dArr[i3];
                i = i3;
            }
        }
        latLng.latitude = latLngArr[i].latitude;
        latLng.longitude = latLngArr[i].longitude;
        return dArr[i];
    }

    private static double a(LatLng latLng, a[] aVarArr, LatLng latLng2) {
        LatLng latLng3 = latLng;
        a[] aVarArr2 = aVarArr;
        int length = aVarArr2.length;
        LatLng latLng4 = new LatLng(0.0d, 0.0d);
        LatLng latLng5 = new LatLng(0.0d, 0.0d);
        a aVar = aVarArr2[0];
        LatLng latLng6 = aVar.a[0];
        LatLng latLng7 = aVar.a[1];
        double a2 = kt.a((Coordinate) latLng3, (Coordinate) latLng6, (Coordinate) latLng7);
        latLng4.latitude = latLng6.latitude;
        latLng4.longitude = latLng6.longitude;
        latLng5.latitude = latLng7.latitude;
        latLng5.longitude = latLng7.longitude;
        for (int i = 1; i < length; i++) {
            a aVar2 = aVarArr2[i];
            LatLng latLng8 = aVar2.a[0];
            LatLng latLng9 = aVar2.a[1];
            double a3 = kt.a((Coordinate) latLng3, (Coordinate) latLng8, (Coordinate) latLng9);
            if (a3 < a2) {
                latLng4.latitude = latLng8.latitude;
                latLng4.longitude = latLng8.longitude;
                latLng5.latitude = latLng9.latitude;
                latLng5.longitude = latLng9.longitude;
                a2 = a3;
            }
        }
        LatLng a4 = kt.a(latLng3, latLng4, latLng5);
        LatLng latLng10 = new LatLng(0.0d, 0.0d);
        double d = 0.0d;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (!z) {
            LatLng a5 = kt.a(latLng3, a4, i2);
            double a6 = kt.a((Coordinate) a5, (Coordinate) a4);
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                a aVar3 = aVarArr2[i4];
                if (kt.a(a5, a6, aVar3.a[0], aVar3.a[1])) {
                    z = true;
                    break;
                }
                i4++;
                aVarArr2 = aVarArr;
            }
            if (!z) {
                latLng10.latitude = a5.latitude;
                latLng10.longitude = a5.longitude;
                i2 += 5;
            } else if (i3 == 0) {
                latLng10.latitude = a5.latitude;
                latLng10.longitude = a5.longitude;
            } else {
                i3++;
                latLng3 = latLng;
                aVarArr2 = aVarArr;
            }
            d = a6;
            i3++;
            latLng3 = latLng;
            aVarArr2 = aVarArr;
        }
        latLng2.latitude = latLng10.latitude;
        latLng2.longitude = latLng10.longitude;
        return d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a {
        LatLng[] a = new LatLng[2];

        a(LatLng latLng, LatLng latLng2) {
            this.a[0] = latLng;
            this.a[1] = latLng2;
        }

        public final String toString() {
            return this.a[0].toString() + "    " + this.a[1].toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b {
        private static final int b = 900;
        private static final int c = 180;
        Bitmap a;
        private TextPaint d;
        private int e;
        private int f;
        private int g;
        private HashMap<String, Integer> h;

        private b() {
            this.a = null;
            this.d = null;
            this.e = 900;
            this.f = 180;
            this.g = -1;
            this.h = new HashMap<>();
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        private int a(Rect rect, String str, int i, Typeface typeface, int i2, int i3) {
            if (rect == null) {
                return i3;
            }
            int abs = Math.abs(rect.height());
            int abs2 = Math.abs(rect.width());
            Rect rect2 = new Rect(0, 0, 0, 0);
            a(i2, i, typeface);
            int ceil = (int) Math.ceil(1.0f / gy.n());
            int i4 = i2 / 2;
            int[] a = a(str, i4, rect2);
            int i5 = a[0];
            int i6 = a[1];
            if (i5 <= abs2 && i6 <= abs) {
                int i7 = i4 + ceil;
                while (i7 < i2) {
                    int[] a2 = a(str, i7, rect2);
                    int i8 = a2[0];
                    int i9 = a2[1];
                    if (i8 > abs2 || i9 > abs) {
                        break;
                    }
                    int i10 = i7;
                    i7 += ceil;
                    i4 = i10;
                }
            } else {
                while (true) {
                    i4 -= ceil;
                    if (i4 < i3) {
                        i4 = i3;
                        break;
                    }
                    int[] a3 = a(str, i4, rect2);
                    int i11 = a3[0];
                    int i12 = a3[1];
                    if (i11 <= abs2 && i12 <= abs) {
                        break;
                    }
                }
            }
            if (i4 < i3) {
                i4 = i3;
            }
            return i4 > i2 ? i2 : i4;
        }

        private int[] a(String str, int i, Rect rect) {
            a(i);
            this.d.getTextBounds(str, 0, str.length(), rect);
            return new int[]{Math.abs(rect.width()), Math.abs(rect.height())};
        }

        private void a() {
            if (this.a == null || this.a.isRecycled()) {
                return;
            }
            this.a.recycle();
            this.a = null;
        }

        private void a(String str, int i, int i2, Typeface typeface) {
            if (this.a == null) {
                try {
                    this.a = Bitmap.createBitmap(this.e, this.f, Bitmap.Config.ARGB_8888);
                } catch (OutOfMemoryError e) {
                    e.printStackTrace();
                    return;
                }
            }
            a(i, i2, typeface);
            Rect rect = new Rect();
            this.d.getTextBounds(str, 0, str.length(), rect);
            int abs = Math.abs(rect.width());
            int abs2 = Math.abs(rect.height());
            if (abs > this.e || abs2 > this.f) {
                this.e = Math.max(abs, this.e);
                this.f = Math.max(abs2, this.f);
                this.a = Bitmap.createBitmap(this.e, this.f, Bitmap.Config.ARGB_8888);
            }
            this.a.eraseColor(0);
            new Canvas(this.a).drawText(str, this.e / 2.0f, (this.f / 2.0f) - ((this.d.descent() + this.d.ascent()) / 2.0f), this.d);
        }

        private void a(int i, int i2, Typeface typeface) {
            if (this.d == null) {
                this.d = new TextPaint(65);
                this.d.setStyle(Paint.Style.FILL);
                this.d.setTextAlign(Paint.Align.CENTER);
            }
            this.d.setColor(i2);
            this.d.setTextSize(i);
            this.d.setTypeface(typeface);
        }

        private void a(int i) {
            if (this.d != null) {
                this.d.setTextSize(i);
            }
        }

        private static String a(String str, String str2, int i) {
            return str + CommonConstant.Symbol.UNDERLINE + str2 + CommonConstant.Symbol.UNDERLINE + i;
        }

        private Object[] a(String str, String str2, int i, int i2, Typeface typeface) {
            String str3 = str + CommonConstant.Symbol.UNDERLINE + str2 + CommonConstant.Symbol.UNDERLINE + i;
            if (i > 180) {
                i = 180;
            }
            if (i != this.g) {
                if (this.a == null) {
                    try {
                        this.a = Bitmap.createBitmap(this.e, this.f, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError e) {
                        e.printStackTrace();
                    }
                }
                a(i, i2, typeface);
                Rect rect = new Rect();
                this.d.getTextBounds(str2, 0, str2.length(), rect);
                int abs = Math.abs(rect.width());
                int abs2 = Math.abs(rect.height());
                if (abs > this.e || abs2 > this.f) {
                    this.e = Math.max(abs, this.e);
                    this.f = Math.max(abs2, this.f);
                    this.a = Bitmap.createBitmap(this.e, this.f, Bitmap.Config.ARGB_8888);
                }
                this.a.eraseColor(0);
                new Canvas(this.a).drawText(str2, this.e / 2.0f, (this.f / 2.0f) - ((this.d.descent() + this.d.ascent()) / 2.0f), this.d);
                this.g = i;
            }
            return new Object[]{str3, this.a};
        }
    }

    private int a(GeoPoint geoPoint, eq eqVar) {
        List<GeoPoint> list = this.p;
        List<LatLng> a2 = kb.a(list);
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (i < i2) {
                i++;
                arrayList.add(new a(a2.get(i), a2.get(i)));
            } else {
                arrayList.add(new a(a2.get(i2), a2.get(0)));
                LatLng latLng = new LatLng(0.0d, 0.0d);
                double a3 = a((a[]) arrayList.toArray(new a[arrayList.size()]), latLng);
                double d = latLng.longitude;
                double d2 = latLng.latitude;
                this.A = new Rect((int) ((d + a3) * 1000000.0d), (int) ((d2 + a3) * 1000000.0d), (int) ((d - a3) * 1000000.0d), (int) ((d2 - a3) * 1000000.0d));
                geoPoint.setLatitudeE6(this.A.centerY());
                geoPoint.setLongitudeE6(this.A.centerX());
                fm[] a4 = a(new fm[]{eqVar.a(new GeoPoint(this.A.top, this.A.left)), eqVar.a(new GeoPoint(this.A.top, this.A.right)), eqVar.a(new GeoPoint(this.A.bottom, this.A.right)), eqVar.a(new GeoPoint(this.A.bottom, this.A.left))});
                new Rect((int) a4[0].a, (int) a4[0].b, (int) a4[1].a, (int) a4[1].b);
                return 1;
            }
        }
    }
}
