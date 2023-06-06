package com.sankuai.meituan.mtlive.pusher.library;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class f {
    public static ChangeQuickRedirect c;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public Bitmap J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public int W;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public Bitmap u;
    public float v;
    public float w;
    public float x;
    public int y;
    public boolean z;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d82f7554a561184e4aefac2c9ef38164", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d82f7554a561184e4aefac2c9ef38164");
            return;
        }
        this.d = 0;
        this.e = 48000;
        this.f = 1;
        this.g = 20;
        this.h = 1;
        this.i = 1200;
        this.j = 1500;
        this.k = 800;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 3;
        this.r = 3;
        this.s = 0;
        this.t = 0;
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = -1.0f;
        this.y = 3;
        this.z = false;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = false;
        this.E = 0;
        this.F = 2;
        this.G = true;
        this.H = false;
        this.I = 1;
        this.J = null;
        this.K = 300;
        this.L = 5;
        this.M = 1;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = true;
        this.U = 0;
        this.V = 0;
        this.W = 0;
    }

    public void a(int i) {
        this.I = i;
    }

    public void a(boolean z) {
        this.G = z;
    }

    public void b(boolean z) {
        this.H = z;
    }

    public void a(Bitmap bitmap, int i, int i2) {
        this.u = bitmap;
        this.s = i;
        this.t = i2;
    }

    public void a(Bitmap bitmap, float f, float f2, float f3) {
        Object[] objArr = {bitmap, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e6f45fc0ae5773d073901ec6823312c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e6f45fc0ae5773d073901ec6823312c");
            return;
        }
        this.u = bitmap;
        this.v = f;
        this.w = f2;
        this.x = f3;
    }

    public void b(int i) {
        this.V = i;
    }

    public void a(Bitmap bitmap) {
        this.J = bitmap;
    }

    public void a(int i, int i2) {
        this.K = i;
        this.L = i2;
    }

    public void c(int i) {
        this.M = i;
    }

    public void d(int i) {
        this.h = i;
    }

    public void e(int i) {
        this.g = i;
    }

    public void f(int i) {
        this.y = i;
    }

    public void g(int i) {
        this.i = i;
    }

    public void h(int i) {
        this.j = i;
    }

    public void i(int i) {
        this.k = i;
    }

    public void j(int i) {
        this.e = i;
    }

    public void k(int i) {
        this.f = i;
    }

    public void c(boolean z) {
        this.S = z;
    }

    public void d(boolean z) {
        this.z = z;
    }

    public void e(boolean z) {
        this.N = z;
    }

    public void f(boolean z) {
        this.O = z;
    }

    public void g(boolean z) {
        this.P = z;
    }

    public void l(int i) {
        this.U = i;
    }

    public void m(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e43a87c0b8e2b7b744c6bf792839759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e43a87c0b8e2b7b744c6bf792839759");
            return;
        }
        int i2 = 2;
        if (i >= 0 && i <= 2) {
            i2 = i;
        }
        this.F = i2;
    }

    @Deprecated
    public void h(boolean z) {
        this.C = z;
    }

    @Deprecated
    public void i(boolean z) {
        this.T = z;
    }
}
