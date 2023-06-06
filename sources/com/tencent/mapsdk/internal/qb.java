package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qb {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 1;
    public static final int e = 16;
    public static final int f = 256;
    public static final int g = 4096;
    public static final int h = 65536;
    private Rect A;
    public GeoPoint i;
    public Bitmap[] j;
    public int o;
    boolean p;
    public int q;
    public int r;
    public int s;
    public boolean u;
    protected String w;
    public boolean x;
    public boolean y;
    public float k = 0.5f;
    public float l = 0.5f;
    public float m = 1.0f;
    public boolean n = false;
    public int t = 2;
    public boolean v = true;
    public boolean z = true;

    private qb a(GeoPoint geoPoint) {
        this.i = geoPoint;
        return this;
    }

    private GeoPoint b() {
        return this.i;
    }

    public final qb a(String str, Bitmap... bitmapArr) {
        this.w = str;
        this.j = bitmapArr;
        return this;
    }

    private qb a(int i, int i2) {
        this.q = i;
        this.r = i2;
        return this;
    }

    private qb a(boolean z) {
        this.v = z;
        return this;
    }

    private qb a(int i, int i2, int i3, int i4) {
        this.A = new Rect(i, i2, i3, i4);
        return this;
    }

    private Rect c() {
        return this.A;
    }

    private Bitmap[] d() {
        return this.j;
    }

    public final String a() {
        return this.w;
    }

    private qb b(boolean z) {
        this.n = z;
        return this;
    }

    private boolean e() {
        return this.n;
    }

    private qb a(float f2) {
        this.m = f2;
        return this;
    }

    private float f() {
        return this.m;
    }

    private qb a(int... iArr) {
        if (iArr == null) {
            this.k = 0.5f;
            this.l = 1.0f;
            return this;
        }
        this.k = 0.5f;
        this.l = 0.5f;
        if (iArr.length != 1) {
            return this;
        }
        if ((iArr[0] & 256) == 256) {
            this.l = 0.0f;
        } else if ((iArr[0] & 16) == 16) {
            this.l = 1.0f;
        }
        if ((iArr[0] & 4096) == 4096) {
            this.k = 0.0f;
        } else if ((iArr[0] & 65536) == 65536) {
            this.k = 1.0f;
        }
        return this;
    }

    private int[] g() {
        int i;
        int i2;
        if (this.k == 0.0f) {
            i = 4096;
        } else {
            i = this.k == 1.0f ? 65536 : 1;
        }
        if (this.l == 0.0f) {
            i2 = 256;
        } else {
            i2 = this.l == 1.0f ? 16 : 1;
        }
        return new int[]{i | i2};
    }

    public final qb a(float f2, float f3) {
        this.k = f2;
        this.l = f3;
        return this;
    }

    private float i() {
        return this.k;
    }

    private float j() {
        return this.l;
    }

    private qb a(int i) {
        this.o = i;
        return this;
    }

    private int k() {
        return this.o;
    }

    private qb c(boolean z) {
        this.p = z;
        return this;
    }

    private boolean l() {
        return this.p;
    }

    private qb d(boolean z) {
        this.x = z;
        return this;
    }

    private boolean m() {
        return this.x;
    }

    private boolean n() {
        return this.y;
    }

    private qb e(boolean z) {
        this.y = z;
        return this;
    }

    private int o() {
        return this.q;
    }

    private int p() {
        return this.r;
    }

    private qb b(int i) {
        this.s = i;
        return this;
    }

    private int q() {
        return this.s;
    }

    private qb c(int i) {
        this.t = i;
        return this;
    }

    private int r() {
        return this.t;
    }

    private qb f(boolean z) {
        this.u = z;
        return this;
    }

    private boolean s() {
        return this.u;
    }

    private boolean t() {
        return this.v;
    }

    private qb g(boolean z) {
        this.z = z;
        return this;
    }

    private boolean u() {
        return this.z;
    }

    private int h() {
        int i;
        int i2;
        if (this.k == 0.0f) {
            i = 4096;
        } else {
            i = this.k == 1.0f ? 65536 : 1;
        }
        if (this.l == 0.0f) {
            i2 = 256;
        } else {
            i2 = this.l == 1.0f ? 16 : 1;
        }
        return new int[]{i | i2}[0];
    }
}
