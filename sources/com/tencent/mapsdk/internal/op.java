package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import android.util.Pair;
import com.tencent.map.tools.IndexCallback;
import com.tencent.tencentmap.mapsdk.maps.model.ArcOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class op extends or<ag> implements ag {
    ar a;
    private final mn n;
    private LatLng o;
    private LatLng p;
    private LatLng q;
    private float r;
    private LatLng s;
    private double t;
    private double u;
    private int v;
    private float w;
    private boolean x;

    private ag d() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ ap f_() {
        return this;
    }

    public op(ArcOptions arcOptions, ba baVar) {
        super(baVar);
        this.v = -16776961;
        this.w = 10.0f;
        this.n = baVar.b();
        if (this.n == null || arcOptions == null) {
            return;
        }
        LatLng startLatLng = arcOptions.getStartLatLng();
        LatLng passLatLng = arcOptions.getPassLatLng();
        LatLng endLatLng = arcOptions.getEndLatLng();
        float angle = arcOptions.getAngle() >= 0.0f ? arcOptions.getAngle() % 360.0f : (arcOptions.getAngle() % 360.0f) + 360.0f;
        if (startLatLng == null || endLatLng == null || startLatLng.equals(endLatLng)) {
            return;
        }
        if (passLatLng == null && (angle == 0.0f || angle == 180.0f)) {
            return;
        }
        if (passLatLng == null || !(passLatLng.equals(startLatLng) || passLatLng.equals(endLatLng))) {
            if (this.o != startLatLng) {
                this.o = startLatLng;
                q();
            }
            if (this.p != endLatLng) {
                this.p = endLatLng;
                q();
            }
            if (this.q != passLatLng) {
                this.q = passLatLng;
                q();
            }
            if (this.r != angle) {
                this.r = angle;
                q();
            }
            setColor(arcOptions.getColor());
            setWidth(arcOptions.getWidth());
            setStrokeWidth(arcOptions.getStrokeWidth());
            setStrokeColor(arcOptions.getStrokeColor());
            this.x = arcOptions.isShowArrow();
            if (p()) {
                e();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void j_() {
        if (this.n == null || this.a == null) {
            return;
        }
        if (!isVisible()) {
            this.a.remove();
        } else if (p()) {
            e();
            if (this.a instanceof en) {
                en enVar = (en) this.a;
                if (a() != -1) {
                    enVar.j();
                } else {
                    this.k = enVar.a();
                }
            }
        }
    }

    private void a(LatLng latLng) {
        if (this.o != latLng) {
            this.o = latLng;
            q();
        }
    }

    private void b(LatLng latLng) {
        if (this.p != latLng) {
            this.p = latLng;
            q();
        }
    }

    private void c(LatLng latLng) {
        if (this.q != latLng) {
            this.q = latLng;
            q();
        }
    }

    private void a(float f) {
        if (this.r != f) {
            this.r = f;
            q();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final LatLng getCenter() {
        return this.s;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final double getRadius() {
        return this.u;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final double getLength() {
        return this.t;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Colorable
    public final void setColor(int i) {
        if (this.v != i) {
            this.v = i;
            q();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Colorable
    public final int getColor() {
        return this.v;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Widthable
    public final void setWidth(float f) {
        if (this.w != f) {
            this.w = f;
            q();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Widthable
    public final float getWidth() {
        return this.w;
    }

    @Override // com.tencent.mapsdk.internal.ag
    public final void a(ArcOptions arcOptions) {
        if (this.n == null || arcOptions == null) {
            return;
        }
        LatLng startLatLng = arcOptions.getStartLatLng();
        LatLng passLatLng = arcOptions.getPassLatLng();
        LatLng endLatLng = arcOptions.getEndLatLng();
        float angle = arcOptions.getAngle() >= 0.0f ? arcOptions.getAngle() % 360.0f : (arcOptions.getAngle() % 360.0f) + 360.0f;
        if (startLatLng == null || endLatLng == null || startLatLng.equals(endLatLng)) {
            return;
        }
        if (passLatLng == null && (angle == 0.0f || angle == 180.0f)) {
            return;
        }
        if (passLatLng == null || !(passLatLng.equals(startLatLng) || passLatLng.equals(endLatLng))) {
            if (this.o != startLatLng) {
                this.o = startLatLng;
                q();
            }
            if (this.p != endLatLng) {
                this.p = endLatLng;
                q();
            }
            if (this.q != passLatLng) {
                this.q = passLatLng;
                q();
            }
            if (this.r != angle) {
                this.r = angle;
                q();
            }
            setColor(arcOptions.getColor());
            setWidth(arcOptions.getWidth());
            setStrokeWidth(arcOptions.getStrokeWidth());
            setStrokeColor(arcOptions.getStrokeColor());
            this.x = arcOptions.isShowArrow();
            if (p()) {
                e();
            }
        }
    }

    private void a(boolean z) {
        this.x = z;
    }

    private void e() {
        double a;
        boolean z;
        LatLng latLng = this.o;
        LatLng latLng2 = this.q;
        LatLng latLng3 = this.p;
        float f = this.r;
        fu b = this.n.n.b(latLng);
        fu b2 = this.n.n.b(latLng3);
        fu fuVar = new fu(0.0d, 0.0d);
        if (f == 0.0f) {
            fu b3 = this.n.n.b(latLng2);
            double a2 = kt.a(b, b3, b2, fuVar);
            z = kt.a(b.x(), b.y(), b2.x(), b2.y(), b3.x(), b3.y()) > 0.0d;
            a = a2;
        } else {
            boolean z2 = f < 180.0f;
            if (f > 180.0f) {
                f = 360.0f - f;
            }
            a = kt.a(b, b2, f * 2.0f, z2, fuVar);
            z = z2;
        }
        this.s = this.n.n.a(fuVar);
        this.t = kt.b(b, b2, fuVar);
        this.u = kt.a(b, fuVar);
        final LatLng[] latLngArr = new LatLng[360];
        kt.a(fuVar, a, b, b2, z, new IndexCallback<Pair<Double, Double>>() { // from class: com.tencent.mapsdk.internal.op.1
            @Override // com.tencent.map.tools.IndexCallback
            public final /* synthetic */ void callback(int i, Pair<Double, Double> pair) {
                Pair<Double, Double> pair2 = pair;
                latLngArr[i] = op.this.n.n.a(new fu(((Double) pair2.first).doubleValue(), ((Double) pair2.second).doubleValue()));
            }

            private void a(int i, Pair<Double, Double> pair) {
                latLngArr[i] = op.this.n.n.a(new fu(((Double) pair.first).doubleValue(), ((Double) pair.second).doubleValue()));
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.o);
        for (int i = 0; i < 360; i++) {
            LatLng latLng4 = latLngArr[i];
            if (latLng4 != null) {
                arrayList.add(latLng4);
            }
        }
        arrayList.add(this.p);
        if (this.a != null) {
            this.a.remove();
        }
        Polyline a3 = this.n.a(new PolylineOptions().addAll(arrayList).color(this.v).width(this.w).borderWidth(getStrokeWidth()).borderColor(getStrokeColor()).zIndex(getZIndex()).level(getLevel()).arrow(this.x).lineCap(true));
        if (a3 instanceof ay) {
            this.a = ((ay) a3).i;
        }
        this.n.v = true;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public final Rect getBound(eq eqVar) {
        if (this.s != null) {
            fu b = eqVar.b(this.s);
            fu fuVar = new fu(b.c - this.u, b.b - this.u);
            fu fuVar2 = new fu(b.c + this.u, b.b + this.u);
            LatLng a = eqVar.a(fuVar);
            LatLng a2 = eqVar.a(fuVar2);
            Rect rect = new Rect();
            rect.left = (int) (a.longitude * 1000000.0d);
            rect.top = (int) (a.latitude * 1000000.0d);
            rect.right = (int) (a2.longitude * 1000000.0d);
            rect.bottom = (int) (a2.latitude * 1000000.0d);
            return rect;
        }
        return super.getBound(eqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.mapsdk.internal.or
    public final void h_() {
        super.h_();
        if (this.a != null) {
            this.a.remove();
            this.a = null;
        }
    }
}
