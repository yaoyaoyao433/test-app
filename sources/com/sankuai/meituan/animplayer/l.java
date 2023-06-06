package com.sankuai.meituan.animplayer;

import android.opengl.Matrix;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static final float[] s = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
    final g b;
    final float[] c;
    final h d;
    final h e;
    final h f;
    volatile boolean g;
    volatile int h;
    volatile int i;
    volatile int j;
    volatile int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    com.sankuai.meituan.animplayer.utils.a r;

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dd79cda1395a18f640161b10ac7e996", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dd79cda1395a18f640161b10ac7e996");
            return;
        }
        this.c = new float[16];
        this.d = new h(s);
        this.e = new h();
        this.f = new h();
        this.r = com.sankuai.meituan.animplayer.utils.a.ScaleAspectFill;
        this.b = new g();
        Matrix.setIdentityM(this.c, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e7b1a232a84c29903de3d94efc60f57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e7b1a232a84c29903de3d94efc60f57");
        } else {
            this.b.a();
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19d1b0fb2d64ceedf9c45a18bf0625c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19d1b0fb2d64ceedf9c45a18bf0625c6");
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.g = true;
            this.h = i;
            this.i = i2;
            new StringBuilder("updateViewPort: mSurfaceWidth = ").append(this.h);
            new StringBuilder("updateViewPort: mSurfaceHeight = ").append(this.i);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00e0f74fe9bb735f49017b4a1783869c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00e0f74fe9bb735f49017b4a1783869c");
            return;
        }
        switch (this.r) {
            case ScaleToFill:
                f();
                return;
            case ScaleAspectFitCenter:
                g();
                return;
            case ScaleAspectFill:
                e();
                return;
            case ScaleWidthFit:
                d();
                return;
            case ScaleHeightFit:
                c();
                return;
            default:
                return;
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b29de91e573e0faaba30ea588bb3f9bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b29de91e573e0faaba30ea588bb3f9bd");
        } else if (this.j <= 0 || this.k <= 0 || this.h <= 0 || this.i <= 0) {
        } else {
            float f = (this.j * 1.0f) / this.k;
            int i = this.h;
            int i2 = this.i;
            float f2 = ((this.i * f) - this.h) / this.h;
            float[] fArr = this.d.b;
            float f3 = (-1.0f) - f2;
            fArr[0] = f3;
            fArr[2] = f3;
            float f4 = f2 + 1.0f;
            fArr[4] = f4;
            fArr[6] = f4;
            fArr[1] = 1.0f;
            fArr[3] = -1.0f;
            fArr[5] = 1.0f;
            fArr[7] = -1.0f;
            this.d.a(fArr);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e271657bfb0885795608beb707357d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e271657bfb0885795608beb707357d0");
        } else if (this.j <= 0 || this.k <= 0 || this.h <= 0 || this.i <= 0) {
        } else {
            float f = (this.j * 1.0f) / this.k;
            int i = this.h;
            int i2 = this.i;
            float f2 = ((this.h / f) - this.i) / this.i;
            float[] fArr = this.d.b;
            fArr[0] = -1.0f;
            fArr[2] = -1.0f;
            fArr[4] = 1.0f;
            fArr[6] = 1.0f;
            float f3 = 1.0f + f2;
            fArr[1] = f3;
            float f4 = (-1.0f) - f2;
            fArr[3] = f4;
            fArr[5] = f3;
            fArr[7] = f4;
            this.d.a(fArr);
        }
    }

    private void e() {
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a55c70fb0a4da09dd65e602bdb7cb69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a55c70fb0a4da09dd65e602bdb7cb69");
        } else if (this.j <= 0 || this.k <= 0 || this.h <= 0 || this.i <= 0) {
        } else {
            float f2 = (this.j * 1.0f) / this.k;
            float f3 = 0.0f;
            if (f2 < (this.h * 1.0f) / this.i) {
                float f4 = ((this.h / f2) - this.i) / this.i;
                new StringBuilder("aspectFill: ").append(f4);
                f3 = f4;
                f = 0.0f;
            } else {
                float f5 = this.i * f2;
                new StringBuilder("aspectFill: width = ").append(f5);
                new StringBuilder("aspectFill: ").append(f5);
                f = (f5 - this.h) / this.h;
                new StringBuilder("aspectFill: ").append(f);
            }
            float[] fArr = this.d.b;
            float f6 = (-1.0f) - f;
            fArr[0] = f6;
            fArr[2] = f6;
            float f7 = f + 1.0f;
            fArr[4] = f7;
            fArr[6] = f7;
            float f8 = 1.0f + f3;
            fArr[1] = f8;
            float f9 = (-1.0f) - f3;
            fArr[3] = f9;
            fArr[5] = f8;
            fArr[7] = f9;
            this.d.a(fArr);
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "997946ce652ed05a9bb7e4a4bce2b18b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "997946ce652ed05a9bb7e4a4bce2b18b");
            return;
        }
        float[] fArr = this.d.b;
        fArr[0] = -1.0f;
        fArr[2] = -1.0f;
        fArr[4] = 1.0f;
        fArr[6] = 1.0f;
        fArr[1] = 1.0f;
        fArr[3] = -1.0f;
        fArr[5] = 1.0f;
        fArr[7] = -1.0f;
        this.d.a(fArr);
    }

    private void g() {
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa7daa4e77c28ff10301ddabae7609be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa7daa4e77c28ff10301ddabae7609be");
        } else if (this.j <= 0 || this.k <= 0 || this.h <= 0 || this.i <= 0) {
        } else {
            float f2 = (this.j * 1.0f) / this.k;
            float f3 = 0.0f;
            if (f2 < (this.h * 1.0f) / this.i) {
                f = ((((this.i * f2) - this.h) / 2.0f) / this.h) * 2.0f;
            } else {
                f3 = ((((this.h / f2) - this.i) / 2.0f) / this.i) * 2.0f;
                f = 0.0f;
            }
            new StringBuilder("fitCenter: offsetX = ").append(f);
            new StringBuilder("fitCenter: offsetY = ").append(f3);
            float[] fArr = this.d.b;
            float f4 = (-1.0f) - f;
            fArr[0] = f4;
            fArr[2] = f4;
            float f5 = f + 1.0f;
            fArr[4] = f5;
            fArr[6] = f5;
            float f6 = 1.0f + f3;
            fArr[1] = f6;
            float f7 = (-1.0f) - f3;
            fArr[3] = f7;
            fArr[5] = f6;
            fArr[7] = f7;
            this.d.a(fArr);
        }
    }
}
