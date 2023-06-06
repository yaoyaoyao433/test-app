package com.tencent.mapsdk.internal;

import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class se extends iw {
    public static final long b = 500;
    public static final int c = 10000;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public double P;
    public boolean Q;
    public int R;
    public int S;
    public boolean T;
    int U;
    int V;
    int W;
    int X;
    int Y;
    int Z;
    public a a;
    public int aa;
    public int ab;
    public boolean ac;
    float ad;
    float ae;
    float af;
    public float ag;
    public boolean ah;
    float ai;
    float aj;
    float ak;
    public float al;
    private final Runnable am;
    private final Runnable an;
    private boolean ao;
    private Interpolator ap;
    private boolean aq;
    private int ar;
    private int as;
    private boolean at;
    private float au;
    private float av;
    private double aw;
    private double ax;
    private double ay;
    private double az;
    protected long d;
    protected long e;
    public TencentMap.CancelableCallback f;
    public boolean g;
    public boolean h;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        float a();

        void a(Runnable runnable);

        int b();

        GeoPoint c();

        float d();

        float e();

        float f();

        GeoPoint g();

        boolean h();
    }

    private static float e(float f) {
        return ((f % 360.0f) + 360.0f) % 360.0f;
    }

    private static float f(float f) {
        float f2 = ((f % 360.0f) + 360.0f) % 360.0f;
        if (f2 > 45.0f) {
            return 45.0f;
        }
        return f2;
    }

    public se() {
        super(10000, null);
        this.am = new Runnable() { // from class: com.tencent.mapsdk.internal.se.1
            @Override // java.lang.Runnable
            public final void run() {
                if (se.this.f == null) {
                    return;
                }
                se.this.f.onFinish();
            }
        };
        this.an = new Runnable() { // from class: com.tencent.mapsdk.internal.se.2
            @Override // java.lang.Runnable
            public final void run() {
                if (se.this.f == null) {
                    return;
                }
                se.this.f.onCancel();
            }
        };
        this.a = null;
        this.d = 500L;
        this.ao = false;
        this.e = 0L;
        this.ap = new LinearInterpolator();
        this.f = null;
        this.g = false;
        this.aq = false;
        this.h = false;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.ar = 0;
        this.L = 0;
        this.as = 0;
        this.M = false;
        this.N = false;
        this.O = false;
        this.at = false;
        this.au = 0.0f;
        this.av = 0.0f;
        this.aw = 0.0d;
        this.ax = 0.0d;
        this.P = 0.0d;
        this.ay = 0.0d;
        this.az = 1.0d;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ac = false;
        this.ad = 0.0f;
        this.ae = 0.0f;
        this.af = 0.0f;
        this.ag = 0.0f;
        this.ah = false;
        this.ai = 0.0f;
        this.aj = 0.0f;
        this.ak = 0.0f;
        this.al = 0.0f;
    }

    private void a(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0141, code lost:
        if (r0 > 1.0f) goto L111;
     */
    @Override // com.tencent.mapsdk.internal.iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.se.a():boolean");
    }

    private static long c() {
        return SystemClock.uptimeMillis();
    }

    private void c(int i, int i2) {
        if (i == 0 && i2 == 0) {
            this.h = false;
        }
        this.I = i;
        this.J = i2;
        this.h = true;
    }

    private boolean d() {
        return this.h;
    }

    private int e() {
        return this.K;
    }

    private int f() {
        return this.L;
    }

    public final void a(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.au = f;
        this.M = true;
    }

    public final void b(float f) {
        if (f == 0.0f) {
            return;
        }
        this.av = f;
        this.N = true;
    }

    private void a(double d) {
        this.aw = d;
        this.O = true;
    }

    private boolean g() {
        return this.N || this.M || this.O;
    }

    private float h() {
        return (float) this.P;
    }

    public final void a(int i, int i2) {
        this.R = i;
        this.S = i2;
        this.Q = true;
    }

    private boolean i() {
        return this.Q;
    }

    private int j() {
        return this.R;
    }

    private int k() {
        return this.S;
    }

    public final void b(int i, int i2) {
        this.U = i;
        this.V = i2;
        this.T = true;
    }

    private boolean l() {
        return this.T;
    }

    private int m() {
        return this.aa;
    }

    private int n() {
        return this.ab;
    }

    public final void c(float f) {
        this.ad = e(f);
        this.ac = true;
    }

    private float o() {
        return this.ag;
    }

    private boolean p() {
        return this.ac;
    }

    public final void d(float f) {
        this.ai = f(f);
        this.ah = true;
    }

    private boolean q() {
        return this.ah;
    }

    private float r() {
        return this.al;
    }

    private void a(TencentMap.CancelableCallback cancelableCallback) {
        this.f = cancelableCallback;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final void b() {
        super.b();
        this.aq = true;
        if (this.f == null || this.a == null) {
            return;
        }
        this.a.a(this.an);
    }

    public final void a(long j) {
        this.d = j;
    }

    private void s() {
        this.g = true;
    }

    private boolean t() {
        return this.g;
    }
}
