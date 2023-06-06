package com.meituan.android.paybase.common.utils.anim;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class f {
    public static ChangeQuickRedirect a;
    protected int b;
    protected g c;
    protected g d;
    protected g e;
    protected g f;
    protected g g;
    protected g h;
    protected g i;
    protected g j;
    public int k;
    private Path l;
    private float[] m;
    private Paint n;
    private long o;
    private int p;

    public abstract int b();

    public abstract void c();

    public f(Path path) {
        Object[] objArr = {path};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03d4b513b5ee28c66ad12f7090afd8a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03d4b513b5ee28c66ad12f7090afd8a9");
            return;
        }
        this.k = 0;
        c();
        Object[] objArr2 = {path};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ba27edbaeac2d00e9da532357abb40f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ba27edbaeac2d00e9da532357abb40f");
        } else {
            this.l = path;
            Object[] objArr3 = {1000};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "48dc4c90e528de57cc5b71576a6f9ead", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "48dc4c90e528de57cc5b71576a6f9ead");
            } else if (this.l != null) {
                this.m = a.a(this.l, 1000);
            }
        }
        this.p = 0;
        this.b = 1;
    }

    public final void a(Canvas canvas) {
        int i;
        boolean z;
        int i2 = 0;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a07a9728ec1a9b2286946652259b5400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a07a9728ec1a9b2286946652259b5400");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "deb2cdc48522f3914b5766c39e41ee67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "deb2cdc48522f3914b5766c39e41ee67");
        } else {
            this.p++;
        }
        if (this.p == 1) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d4e56cbfb28c67f216d8fdafc22eca6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d4e56cbfb28c67f216d8fdafc22eca6");
            }
            g();
        }
        if (h() < 0) {
            return;
        }
        if (b() != -1 && b() < h()) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "83067df066abfdf4cec6d3a32d5a559d", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "83067df066abfdf4cec6d3a32d5a559d")).booleanValue();
            } else {
                if (this.b != -1) {
                    if (this.b > 1) {
                        this.b--;
                    } else {
                        z = false;
                    }
                }
                z = true;
            }
            if (!z) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5d598e3531a3cd2876298a00d9d46f4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5d598e3531a3cd2876298a00d9d46f4c");
                    return;
                }
                return;
            }
            this.p = 0;
            g();
            this.k = 0;
        }
        Object[] objArr6 = {canvas};
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "fa7b096e9272ca7f55b762b7a5a5c6db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "fa7b096e9272ca7f55b762b7a5a5c6db");
        } else if (this.m != null) {
            int h = h();
            float a2 = this.c != null ? this.c.a(h) : 0.0f;
            float a3 = this.d != null ? this.d.a(h) : 0.0f;
            float a4 = this.e != null ? this.e.a(h) : 0.0f;
            if (this.f != null) {
                Paint a5 = a();
                g gVar = this.f;
                Object[] objArr7 = {Integer.valueOf(h)};
                ChangeQuickRedirect changeQuickRedirect7 = g.a;
                if (PatchProxy.isSupport(objArr7, gVar, changeQuickRedirect7, false, "64311e8b073613eaf39f6a46f4a8b680", RobustBitConfig.DEFAULT_VALUE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(objArr7, gVar, changeQuickRedirect7, false, "64311e8b073613eaf39f6a46f4a8b680")).intValue();
                } else {
                    int[] b = gVar.b();
                    int[] a6 = gVar.a();
                    if (b != null && a6 != null && b.length != 0 && a6.length != 0) {
                        int i3 = 0;
                        while (i3 < b.length && b[i3] < h) {
                            i3++;
                        }
                        if (i3 == 0) {
                            i2 = a6[0];
                        } else if (i3 >= a6.length) {
                            i2 = a6[a6.length - 1];
                        } else {
                            i2 = a.a(a6[i3 - 1], a6[i3], (h - b[i]) / (b[i3] - b[i]));
                        }
                    }
                }
                a5.setColor(i2);
            }
            float a7 = this.g != null ? this.g.a(h) : 0.0f;
            float a8 = this.h != null ? this.h.a(h) : 0.0f;
            if (this.i != null) {
                a().setAlpha((int) (this.i.a(h) * 255.0f));
            }
            canvas.save();
            canvas.translate(a7, a8);
            if (this.j != null) {
                canvas.rotate(this.j.a(h), canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
            }
            canvas.drawPoints(a.a(this.m, a2, a3, a4), a());
            canvas.restore();
        }
    }

    public final f a(int i) {
        this.b = i;
        return this;
    }

    public final Paint a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55f1fa8ea724fdb81bbb49e5b1638bf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Paint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55f1fa8ea724fdb81bbb49e5b1638bf7");
        }
        if (this.n == null) {
            this.n = new Paint();
            this.n.setAntiAlias(true);
            this.n.setDither(true);
            this.n.setStyle(Paint.Style.STROKE);
        }
        return this.n;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd60b7974b148f890244c9aa213cadb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd60b7974b148f890244c9aa213cadb");
        } else {
            this.o = System.currentTimeMillis();
        }
    }

    private int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17974cb42a5dac73d1470f138de959df", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17974cb42a5dac73d1470f138de959df")).intValue() : (int) ((System.currentTimeMillis() - this.o) - this.k);
    }

    public final f d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ac4940f67baa906ee8f7fe79877dcc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ac4940f67baa906ee8f7fe79877dcc0");
        }
        g();
        this.p = 0;
        return this;
    }

    public final g e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e624c13f2c0ff6fa0cab9f2eb69e6a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e624c13f2c0ff6fa0cab9f2eb69e6a3");
        }
        if (this.d == null) {
            this.d = new g();
        }
        return this.d;
    }

    public final g f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e81797efdf0672be6a68153b213c8561", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e81797efdf0672be6a68153b213c8561");
        }
        if (this.j == null) {
            this.j = new g();
        }
        return this.j;
    }
}
