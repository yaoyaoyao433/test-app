package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.sh;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qa extends or {
    protected qb a;
    protected om n;
    protected Selectable.OnSelectedListener o;
    protected fm p;
    public hl q;
    private mm r;
    private be s;
    private hl t;
    private final ap u;

    private static boolean H() {
        return false;
    }

    public qa(ap apVar, ba baVar, qb qbVar) {
        super(baVar);
        this.p = new fm();
        this.t = null;
        this.u = apVar;
        this.r = baVar.c();
        this.s = baVar.getMapContext();
        this.a = qbVar;
        this.n = new om(this.a);
        this.h = true;
        a(qbVar);
    }

    private void a(hl hlVar) {
        this.q = hlVar;
    }

    public final void a(qb qbVar) {
        if (qbVar == null) {
            return;
        }
        this.a = qbVar;
        if (this.n == null) {
            this.n = new om(this.a);
        } else {
            this.n.a(qbVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void j_() {
        if (this.r == null) {
            return;
        }
        if (!isVisible()) {
            if (this.n != null) {
                this.n.f = -1;
                return;
            }
            return;
        }
        if (this.t != null) {
            if (!this.t.d) {
                this.t.b();
            } else {
                this.t = null;
            }
        }
        if (this.q != null && !this.q.d) {
            this.q.b();
        }
        if (this.n != null) {
            mm mmVar = this.r;
            om omVar = this.n;
            if (omVar.f <= 0 || !mmVar.c.containsKey(Integer.valueOf(omVar.f))) {
                sh shVar = mmVar.b;
                omVar.f = ((Integer) shVar.a((CallbackRunnable<sh.AnonymousClass122>) new sh.AnonymousClass122(omVar), (sh.AnonymousClass122) 0)).intValue();
                if (omVar.f > 0) {
                    gx.b.a(omVar.g, omVar.d());
                    omVar.a(false);
                    omVar.o = false;
                    mmVar.d.put(Integer.valueOf(omVar.f), omVar);
                }
            } else {
                if (omVar.o) {
                    sh shVar2 = mmVar.b;
                    if (0 != shVar2.e) {
                        shVar2.a(new sh.AnonymousClass123(omVar));
                    }
                    if (omVar.y) {
                        gx.b.a(omVar.g, omVar.d());
                        omVar.a(false);
                    }
                }
                omVar.o = false;
                mmVar.d.put(Integer.valueOf(omVar.f), omVar);
            }
            if (this.n.f != 0) {
                this.k = this.n.f;
            }
        }
    }

    private void b(hl hlVar) {
        if (hlVar == null) {
            return;
        }
        this.t = hlVar;
        this.t.a();
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f, float f2) {
        if (!isVisible() || this.a.i == null || this.s == null) {
            return false;
        }
        TappedElement a = this.s.f().a(f, f2);
        boolean z = a != null && a.itemId == ((long) f());
        if (z) {
            this.n.b(1);
        } else {
            this.n.b(0);
        }
        if (z && this.o != null) {
            this.o.onSelected(this);
        }
        return z;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final void setSelected(boolean z) {
        if (z) {
            this.n.b(1);
        } else {
            this.n.b(0);
        }
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final boolean isSelected() {
        return this.n.H == 1;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final void setSelectedListener(Selectable.OnSelectedListener onSelectedListener) {
        this.o = onSelectedListener;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av
    public final Rect b(eq eqVar) {
        if (this.n == null || this.a == null || this.a.i == null) {
            return null;
        }
        if (!B()) {
            this.p = eqVar.a(this.a.i);
        } else {
            GeoPoint geoPoint = this.a.i;
            fm fmVar = new fm(0.0d, 0.0d);
            if (geoPoint != null) {
                fmVar.a = geoPoint.getLongitudeE6();
                fmVar.b = geoPoint.getLatitudeE6();
            }
            this.p = fmVar;
        }
        fm fmVar2 = new fm();
        fm fmVar3 = new fm();
        Bitmap d = this.n.d();
        if (d == null) {
            return null;
        }
        int width = d.getWidth();
        int height = d.getHeight();
        fmVar2.a = this.p.a;
        fmVar3.a = this.p.a + width;
        fmVar2.b = this.p.b;
        fmVar3.b = this.p.b + height;
        int i = (int) (this.a.k * width);
        int i2 = (int) (this.a.l * height);
        double d2 = i;
        fmVar2.a -= d2;
        fmVar3.a -= d2;
        double d3 = i2;
        fmVar2.b -= d3;
        fmVar3.b -= d3;
        int i3 = this.a.q;
        int i4 = this.a.r;
        double d4 = i3;
        fmVar2.a += d4;
        fmVar3.a += d4;
        double d5 = i4;
        fmVar2.b += d5;
        fmVar3.b += d5;
        GeoPoint a = eqVar.a(fmVar2);
        GeoPoint a2 = eqVar.a(fmVar3);
        return new Rect(a.getLongitudeE6(), a.getLatitudeE6(), a2.getLongitudeE6(), a2.getLatitudeE6());
    }

    @Override // com.tencent.mapsdk.internal.av
    public final ap f_() {
        return this.u;
    }

    @Override // com.tencent.mapsdk.internal.av
    public final Rect a(eq eqVar) {
        int i;
        if (this.n == null || this.a == null || this.a.i == null) {
            return null;
        }
        if (!B()) {
            this.p = eqVar.a(this.a.i);
        } else {
            GeoPoint geoPoint = this.a.i;
            fm fmVar = new fm(0.0d, 0.0d);
            if (geoPoint != null) {
                fmVar.a = geoPoint.getLongitudeE6();
                fmVar.b = geoPoint.getLatitudeE6();
            }
            this.p = fmVar;
        }
        fm fmVar2 = new fm();
        fm fmVar3 = new fm();
        Bitmap d = this.n.d();
        int i2 = 0;
        if (d != null) {
            i2 = d.getWidth();
            i = d.getHeight();
        } else {
            i = 0;
        }
        fmVar2.a = this.p.a;
        fmVar3.a = this.p.a + i2;
        fmVar2.b = this.p.b;
        fmVar3.b = this.p.b + i;
        int i3 = (int) (this.a.k * i2);
        int i4 = (int) (this.a.l * i);
        double d2 = i3;
        fmVar2.a -= d2;
        fmVar3.a -= d2;
        double d3 = i4;
        fmVar2.b -= d3;
        fmVar3.b -= d3;
        int i5 = this.a.q;
        int i6 = this.a.r;
        double d4 = i5;
        fmVar2.a += d4;
        fmVar3.a += d4;
        double d5 = i6;
        fmVar2.b += d5;
        fmVar3.b += d5;
        return new Rect((int) fmVar2.a, (int) fmVar2.b, (int) fmVar3.a, (int) fmVar3.b);
    }

    private void b(String str, Bitmap... bitmapArr) {
        a(str, bitmapArr);
    }

    private void a(int i, int i2) {
        qb qbVar = this.a;
        qbVar.q = i;
        qbVar.r = i2;
        if (this.n != null) {
            om omVar = this.n;
            omVar.k = i;
            omVar.l = i2;
            omVar.o = true;
            this.n.o = true;
        }
    }

    public final void a(String str, Bitmap... bitmapArr) {
        this.a = this.a.a(str, bitmapArr);
        if (this.n != null) {
            this.n.a(str, bitmapArr);
            this.n.o = true;
        }
    }

    private void t() {
        if (this.n != null) {
            this.n.o = true;
        }
    }

    public final void a(GeoPoint geoPoint) {
        qb qbVar = this.a;
        qbVar.i = geoPoint;
        this.a = qbVar;
        if (this.n != null) {
            om omVar = this.n;
            if (geoPoint != null) {
                double d = omVar.w ? 1.0d : 1000000.0d;
                omVar.i = geoPoint.getLongitudeE6() / d;
                omVar.j = geoPoint.getLatitudeE6() / d;
                omVar.o = true;
            }
            this.n.o = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setLevel(int i) {
        qb qbVar = this.a;
        qbVar.t = i;
        this.a = qbVar;
        if (this.n != null) {
            this.n.C = i;
            this.n.o = true;
        }
    }

    private GeoPoint u() {
        return this.a.i;
    }

    public final void a(int i) {
        qb qbVar = this.a;
        qbVar.o = i;
        this.a = qbVar;
        if (this.n != null) {
            this.n.a(i);
            this.n.o = true;
        }
    }

    private int v() {
        return this.a.o;
    }

    public final void a(float f) {
        qb qbVar = this.a;
        qbVar.m = f;
        this.a = qbVar;
        if (this.n != null) {
            this.n.a(f);
            this.n.o = true;
        }
    }

    private float w() {
        return this.a.m;
    }

    public final void a(float f, float f2) {
        this.a = this.a.a(f, f2);
        if (this.n != null) {
            this.n.a(f, f2);
            this.n.o = true;
        }
    }

    public final float d() {
        return this.a.k;
    }

    public final float e() {
        return this.a.l;
    }

    public final void b(float f, float f2) {
        if (this.n != null) {
            om omVar = this.n;
            omVar.u = f;
            omVar.v = f2;
            omVar.o = true;
            this.n.o = true;
        }
    }

    private float x() {
        if (this.n != null) {
            return this.n.u;
        }
        return 1.0f;
    }

    private float y() {
        if (this.n != null) {
            return this.n.v;
        }
        return 1.0f;
    }

    private void d(boolean z) {
        this.a.p = z;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setZIndex(int i) {
        qb qbVar = this.a;
        qbVar.s = i;
        this.a = qbVar;
        if (this.n != null) {
            this.n.D = i;
            this.n.o = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final int getZIndex() {
        return this.a.s;
    }

    private qb z() {
        return this.a;
    }

    private om A() {
        return this.n;
    }

    public final void a(boolean z) {
        if (this.n != null) {
            this.n.w = z;
            this.n.o = true;
        }
    }

    private boolean B() {
        if (this.n != null) {
            return this.n.w;
        }
        return false;
    }

    public final int f() {
        if (this.n != null) {
            return this.n.f;
        }
        return -1;
    }

    private float C() {
        if (this.n != null) {
            return this.n.p;
        }
        return 0.0f;
    }

    private float D() {
        if (this.n != null) {
            return this.n.q;
        }
        return 0.0f;
    }

    private float E() {
        if (this.n != null) {
            return this.n.r;
        }
        return 0.0f;
    }

    private float F() {
        if (this.n != null) {
            return this.n.s;
        }
        return 0.0f;
    }

    private boolean G() {
        if (this.a != null) {
            return this.a.n;
        }
        return false;
    }

    public final void b(boolean z) {
        if (this.a != null) {
            this.a.x = z;
        }
        if (this.n != null) {
            this.n.b(z);
            this.n.o = true;
        }
    }

    public final void g() {
        if (this.a != null) {
            this.a.y = false;
        }
        if (this.n != null) {
            this.n.c(false);
            this.n.o = true;
        }
    }

    private boolean I() {
        if (this.a != null) {
            return this.a.z;
        }
        return true;
    }

    public final void h() {
        if (this.n != null) {
            this.n.f = 0;
        }
        if (this.q != null) {
            this.q.b = false;
        }
    }

    public final void c(boolean z) {
        if (this.n == null) {
            return;
        }
        this.n.z = z;
        this.n.o = true;
    }

    public final boolean i() {
        if (this.n == null) {
            return false;
        }
        return this.n.z;
    }
}
