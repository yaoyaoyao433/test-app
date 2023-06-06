package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.on;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class om extends on implements on.a {
    public static final int a = 1;
    public static final int b = 16;
    public static final int c = 256;
    public static final int d = 4096;
    public static final int e = 65536;
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    private String S;
    private RectF T;
    private int U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    public int f;
    public String g;
    public Bitmap[] h;
    public double i;
    public double j;
    public int k;
    public int l;
    public float m;
    public float n;
    public boolean o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    @Override // com.tencent.mapsdk.internal.on.a
    public final boolean b() {
        return true;
    }

    public om(@NonNull qb qbVar) {
        this(qbVar.a(), qbVar.i, qbVar.k, qbVar.l, qbVar.q, qbVar.r, qbVar.j);
    }

    private om(String str, GeoPoint geoPoint, Bitmap... bitmapArr) {
        this(str, geoPoint, 0.5f, 0.5f, 0, 0, bitmapArr);
    }

    private om(String str, GeoPoint geoPoint, float f, float f2, Bitmap... bitmapArr) {
        this(str, geoPoint, f, f2, 0, 0, bitmapArr);
    }

    private om(String str, GeoPoint geoPoint, float f, float f2, int i, int i2, Bitmap... bitmapArr) {
        this.W = 0;
        this.m = 0.5f;
        this.n = 0.5f;
        this.o = false;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 1.0f;
        this.X = 0;
        this.u = 1.0f;
        this.v = 1.0f;
        this.w = false;
        this.x = true;
        this.y = false;
        this.z = true;
        this.A = false;
        this.B = false;
        this.Y = true;
        a(this);
        this.m = f;
        this.n = f2;
        this.k = i;
        this.l = i2;
        if (geoPoint != null) {
            this.i = geoPoint.getLongitudeE6() / 1000000.0d;
            this.j = geoPoint.getLatitudeE6() / 1000000.0d;
        }
        a(str, bitmapArr);
    }

    private void a(int i, int i2) {
        if (this.U == i && this.V == i2) {
            return;
        }
        this.U = i;
        this.V = i2;
        float f = this.k / i;
        float f2 = this.l / i2;
        this.T = new RectF(f, -f2, 0.0f, -0.0f);
        this.m -= f;
        this.n -= f2;
        this.p = (-this.U) * this.m;
        this.q = this.U + this.p;
        this.r = this.V * this.n;
        this.s = this.r - this.V;
    }

    private void b(int i, int i2) {
        this.k = i;
        this.l = i2;
        this.o = true;
    }

    private void a(GeoPoint geoPoint) {
        if (geoPoint != null) {
            double d2 = this.w ? 1.0d : 1000000.0d;
            this.i = geoPoint.getLongitudeE6() / d2;
            this.j = geoPoint.getLatitudeE6() / d2;
            this.o = true;
        }
    }

    private double e() {
        return this.i;
    }

    private double f() {
        return this.j;
    }

    private void d(boolean z) {
        this.o = z;
    }

    private boolean g() {
        return this.o;
    }

    public final void a(boolean z) {
        this.y = z;
        if (z) {
            return;
        }
        this.S = this.g;
    }

    private boolean h() {
        return this.y;
    }

    public final synchronized void a(String str, Bitmap... bitmapArr) {
        if (bitmapArr == null) {
            return;
        }
        this.o = true;
        a(true);
        this.g = str;
        this.h = bitmapArr;
        if (this.W < 0 || this.W >= bitmapArr.length) {
            this.W = 0;
        }
        if (bitmapArr[this.W] != null) {
            a(bitmapArr[this.W].getWidth(), bitmapArr[this.W].getHeight());
        }
    }

    private String i() {
        return this.S;
    }

    private int j() {
        return this.f;
    }

    public final void a(float f, float f2) {
        this.m = f;
        this.n = f2;
        a(this.U, this.V);
        this.o = true;
    }

    private float k() {
        return this.m;
    }

    private float l() {
        return this.n;
    }

    public final void a(float f) {
        this.t = f;
        this.o = true;
    }

    private float m() {
        return this.t;
    }

    private void b(float f, float f2) {
        this.u = f;
        this.v = f2;
        this.o = true;
    }

    private float n() {
        return this.u;
    }

    private float o() {
        return this.v;
    }

    public final void a(int i) {
        this.X = i;
        this.o = true;
    }

    public final float a() {
        return this.Y ? 360 - this.X : this.X;
    }

    private void e(boolean z) {
        this.w = z;
    }

    private boolean p() {
        return this.w;
    }

    private void f(boolean z) {
        this.z = z;
    }

    private boolean q() {
        return this.z;
    }

    private void g(boolean z) {
        this.x = z;
        this.o = true;
    }

    private boolean r() {
        return this.x;
    }

    public final void b(boolean z) {
        this.A = z;
        kj.b(ki.f, "setAvoidPoi = ".concat(String.valueOf(z)));
        this.o = true;
    }

    private boolean s() {
        return this.A;
    }

    private boolean t() {
        return this.B;
    }

    public final void c(boolean z) {
        this.B = z;
        kj.b(ki.f, "setAvoidMarker = ".concat(String.valueOf(z)));
        this.o = true;
    }

    @Override // com.tencent.mapsdk.internal.on
    public final synchronized void b(int i) {
        this.W = i;
        this.o = true;
        a(true);
        Bitmap c2 = c(i);
        if (c2 != null) {
            int width = c2.getWidth();
            int height = c2.getHeight();
            if (this.U != width || this.V != height) {
                a(width, height);
            }
        }
        super.b(i);
    }

    private RectF u() {
        return new RectF(this.T);
    }

    @Override // com.tencent.mapsdk.internal.on.a
    public final String c() {
        return this.g;
    }

    private Bitmap c(int i) {
        if (this.h == null) {
            return null;
        }
        if (i < 0 || i >= this.h.length) {
            return this.h[0];
        }
        return this.h[i];
    }

    private String v() {
        return this.g;
    }

    private float w() {
        return this.p;
    }

    private float x() {
        return this.q;
    }

    private float y() {
        return this.r;
    }

    private float z() {
        return this.s;
    }

    private boolean A() {
        return this.Y;
    }

    private void h(boolean z) {
        this.Y = z;
    }

    private int B() {
        return this.C;
    }

    private void d(int i) {
        this.C = i;
    }

    private int C() {
        return this.D;
    }

    private void e(int i) {
        this.D = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof om) && this.f == ((om) obj).f;
    }

    public final int hashCode() {
        return String.valueOf(this.f).hashCode() + 527;
    }

    @Override // com.tencent.mapsdk.internal.on.a
    public final synchronized Bitmap d() {
        return c(this.H);
    }

    public final void a(qb qbVar) {
        a(qbVar.m);
        a(qbVar.k, qbVar.l);
        a(qbVar.o);
        this.w = qbVar.u;
        this.z = qbVar.v;
        b(qbVar.x);
        c(qbVar.y);
        this.Y = qbVar.z;
        this.x = qbVar.n;
        this.o = true;
        this.C = qbVar.t;
        this.D = qbVar.s;
    }
}
