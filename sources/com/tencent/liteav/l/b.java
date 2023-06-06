package com.tencent.liteav.l;

import android.opengl.GLES20;
import android.util.Log;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.basic.opengl.m;
import com.tencent.liteav.beauty.b.ai;
import com.tencent.liteav.beauty.b.v;
import com.tencent.liteav.beauty.e;
import com.tencent.liteav.beauty.f;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private ai f = null;
    j a = null;
    j b = null;
    private v g = null;
    private final int h = 2;
    private final int i = 3;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private com.tencent.liteav.basic.opengl.a n = null;
    private float[] o = {0.0f, 0.0f, 0.0f, 0.0f};
    protected TXCOpenGlUtils.a[] c = null;
    protected TXCOpenGlUtils.a d = null;
    protected int[] e = null;
    private f p = null;
    private String q = "CombineVideoFilter";

    public void a(int i, int i2) {
        if (i > 0 && i2 > 0 && (i != this.j || i2 != this.k)) {
            TXCOpenGlUtils.a(this.c);
            this.c = null;
        }
        this.j = i;
        this.k = i2;
    }

    public void b(int i, int i2) {
        if (i > 0 && i2 > 0 && (i != this.l || i2 != this.m)) {
            b();
        }
        this.l = i;
        this.m = i2;
    }

    public void a(com.tencent.liteav.basic.opengl.a aVar) {
        this.n = aVar;
    }

    public int a(com.tencent.liteav.basic.e.a[] aVarArr, int i) {
        int i2;
        if (aVarArr == null || this.j <= 0 || this.k <= 0) {
            Log.e(this.q, "frames or canvaceSize if null!");
            return -1;
        }
        a(aVarArr);
        if (this.f != null) {
            i2 = 0;
            for (int i3 = 0; i3 < aVarArr.length; i3++) {
                GLES20.glBindFramebuffer(36160, this.c[i3].a[0]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
                e.f[] fVarArr = {new e.f()};
                fVarArr[0].e = aVarArr[i3].a;
                fVarArr[0].f = aVarArr[i3].g.c;
                fVarArr[0].g = aVarArr[i3].g.d;
                fVarArr[0].b = (aVarArr[i3].g.a * 1.0f) / this.j;
                fVarArr[0].c = (aVarArr[i3].g.b * 1.0f) / this.k;
                fVarArr[0].d = (aVarArr[i3].g.c * 1.0f) / this.j;
                if (aVarArr[i3].e != null) {
                    this.f.a(aVarArr[i3].e.c);
                    this.f.c(aVarArr[i3].e.d);
                }
                this.f.a(fVarArr);
                GLES20.glViewport(0, 0, this.j, this.k);
                if (i3 == 0) {
                    this.f.b(this.d.b[0]);
                } else {
                    this.f.b(this.c[i3 - 1].b[0]);
                }
                GLES20.glBindFramebuffer(36160, 0);
                i2 = i3;
            }
        } else {
            i2 = 0;
        }
        int i4 = this.c[i2].b[0];
        int i5 = this.j;
        int i6 = this.k;
        if (this.b != null && this.n != null) {
            GLES20.glViewport(0, 0, this.n.c, this.n.d);
            i4 = this.b.a(i4);
        }
        if (this.a != null) {
            GLES20.glViewport(0, 0, this.l, this.m);
            i4 = this.a.a(i4);
            i5 = this.l;
            i6 = this.m;
        }
        int i7 = i5;
        int i8 = i6;
        if (this.p != null) {
            this.p.didProcessFrame(i4, i7, i8, i);
        }
        return i4;
    }

    public void a() {
        TXCOpenGlUtils.a(this.c);
        this.c = null;
        d();
        if (this.d != null) {
            TXCOpenGlUtils.a(this.d);
            this.d = null;
        }
    }

    private void a(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (this.c == null || i3 != this.c.length) {
            TXCOpenGlUtils.a(this.c);
            this.c = null;
            this.c = TXCOpenGlUtils.a(this.c, i3, i, i2);
            if (this.e == null) {
                this.e = new int[1];
                this.e[0] = TXCOpenGlUtils.a(i, i2, 6408, 6408, this.e);
            }
            if (this.d != null) {
                TXCOpenGlUtils.a(this.d);
                this.d = null;
            }
            if (this.d == null) {
                this.d = TXCOpenGlUtils.a(this.d, i, i2);
            }
            if (this.g != null) {
                GLES20.glBindFramebuffer(36160, this.d.a[0]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
                this.g.b(this.o);
                this.g.b(-1);
                GLES20.glBindFramebuffer(36160, 0);
            }
        }
    }

    private void c(int i, int i2) {
        if (this.a == null) {
            this.a = new j();
            this.a.a(true);
            if (!this.a.c()) {
                TXCLog.e(this.q, "mOutputFilter.init failed!");
                return;
            }
        }
        if (this.a != null) {
            this.a.a(i, i2);
        }
    }

    private void d(int i, int i2) {
        if (this.f == null) {
            this.f = new ai();
            this.f.a(true);
            if (!this.f.c()) {
                TXCLog.e(this.q, "TXCGPUWatermarkTextureFilter.init failed!");
                return;
            }
        }
        if (this.f != null) {
            this.f.a(i, i2);
        }
    }

    private boolean e(int i, int i2) {
        if (this.b == null) {
            this.b = new j();
            this.b.a(true);
            if (!this.b.c()) {
                TXCLog.e(this.q, "mCropFilter.init failed!");
                return false;
            }
        }
        if (this.b != null) {
            this.b.a(i, i2);
        }
        return true;
    }

    private void b() {
        if (this.a != null) {
            this.a.e();
            this.a = null;
        }
    }

    private void c() {
        if (this.b != null) {
            this.b.e();
            this.b = null;
        }
    }

    private void a(com.tencent.liteav.basic.e.a[] aVarArr) {
        d(this.j, this.k);
        if (this.g == null) {
            this.g = new v();
            if (!this.g.c()) {
                TXCLog.e(this.q, "mCropFilter.init failed!");
                return;
            }
        }
        if (this.g != null) {
            this.g.a(this.j, this.k);
        }
        a(this.j, this.k, aVarArr.length);
        if (this.n != null) {
            e(this.n.c, this.n.d);
            if (this.b != null) {
                this.b.a(m.e, this.b.a(this.j, this.k, null, this.n, 0));
            }
        } else {
            c();
        }
        if (this.l <= 0 || this.m <= 0) {
            return;
        }
        c(this.l, this.m);
    }

    private void d() {
        if (this.f != null) {
            this.f.e();
            this.f = null;
        }
        b();
        if (this.b != null) {
            this.b.e();
            this.b = null;
        }
    }
}
