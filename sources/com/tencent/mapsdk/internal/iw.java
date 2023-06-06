package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class iw {
    public static final iw F = new iw(1, null);
    public static final iw G = new iw(2, null, true);
    public static final iw H = new iw(104, null);
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    public static final int n = 6;
    public static final int o = 100;
    public static final int p = 101;
    public static final int q = 102;
    public static final int r = 103;
    public static final int s = 104;
    public static final int t = 105;
    public static final int u = 10000;
    public static final int v = 108;
    public static final int w = 109;
    public static final int x = 110;
    public static final int y = 120;
    public double[] A;
    public long B;
    public boolean C;
    public boolean D;
    public Runnable E;
    private Cif a;
    public int z;

    private static void d() {
    }

    protected boolean a() {
        return true;
    }

    public void b() {
    }

    public iw() {
        this.B = -1L;
        this.C = false;
    }

    public iw(int i2, double[] dArr) {
        this(i2, dArr, false);
    }

    public iw(int i2, double[] dArr, boolean z) {
        this.B = -1L;
        this.C = false;
        this.z = i2;
        this.A = dArr;
        this.D = z;
    }

    public iw(Runnable runnable) {
        this.B = -1L;
        this.C = false;
        this.z = 6;
        this.E = runnable;
    }

    private void a(Cif cif) {
        this.a = cif;
    }

    private long c() {
        if (this.B >= 0) {
            return this.B;
        }
        return this.z >= 100 ? 20L : 0L;
    }

    public boolean a(iz izVar) {
        boolean a = a();
        izVar.c(this);
        return a;
    }
}
