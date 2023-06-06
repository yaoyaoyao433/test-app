package com.tencent.liteav.k;

import android.opengl.GLES20;
import android.util.Log;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.beauty.b.o;
import com.tencent.liteav.k.n;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private static String j = "Diffuse";
    private com.tencent.liteav.beauty.d a = null;
    private o b = null;
    private m c = null;
    private m d = null;
    private com.tencent.liteav.beauty.b.n e = null;
    private com.tencent.liteav.basic.opengl.j f = null;
    private com.tencent.liteav.beauty.b.f g = null;
    private int h = 0;
    private int i = 0;
    private int k = 1;
    private n.c l = null;
    private n.c.a m = n.c.a.MODE_NONE;
    private n.c.a n = n.c.a.MODE_NONE;
    private int[] o = null;
    private TXCOpenGlUtils.a p = null;
    private TXCOpenGlUtils.a q = null;
    private float r = 0.0f;

    public boolean a(int i, int i2) {
        this.h = i;
        this.i = i2;
        if (this.p == null || i != this.p.c || i2 != this.p.d) {
            this.p = TXCOpenGlUtils.a(this.p);
            this.p = TXCOpenGlUtils.a(this.p, i, i2);
        }
        if (this.q == null || i != this.q.c || i2 != this.q.d) {
            this.q = TXCOpenGlUtils.a(this.q);
            this.q = TXCOpenGlUtils.a(this.q, i, i2);
        }
        return c(i, i2);
    }

    private boolean c(int i, int i2) {
        if (this.a == null) {
            this.a = new com.tencent.liteav.beauty.d();
            if (!this.a.a(i, i2)) {
                Log.e(j, "mDissolveBlendFilter init Failed!");
                return false;
            }
        }
        if (this.a != null) {
            this.a.b(this.k);
            this.a.b(i, i2);
        }
        if (this.b == null) {
            this.b = new o();
            if (!this.b.a(i, i2)) {
                Log.e(j, "mGridShapeFilter init Failed!");
                return false;
            }
        }
        if (this.b != null) {
            this.b.b(i, i2);
        }
        if (this.c == null) {
            this.c = new m();
            this.c.a(true);
            if (!this.c.c()) {
                Log.e(j, "mScaleFilter init Failed!");
                return false;
            }
        }
        if (this.c != null) {
            this.c.a(i, i2);
        }
        if (this.d == null) {
            this.d = new m();
            this.d.a(true);
            if (!this.d.c()) {
                Log.e(j, "mScaleFilter2 init Failed!");
                return false;
            }
        }
        if (this.d != null) {
            this.d.a(i, i2);
        }
        if (this.e == null) {
            this.e = new com.tencent.liteav.beauty.b.n();
            this.e.a(true);
            if (!this.e.c()) {
                Log.e(j, "mGridShapeFilter init Failed!");
                return false;
            }
        }
        if (this.e != null) {
            this.e.a(i, i2);
        }
        if (this.f == null) {
            this.f = new com.tencent.liteav.basic.opengl.j();
            if (!this.f.c()) {
                Log.e(j, "mDrawFilter init Failed!");
                return false;
            }
        }
        if (this.f != null) {
            this.f.a(i, i2);
        }
        if (this.g == null) {
            this.g = new com.tencent.liteav.beauty.b.f();
            if (!this.g.c()) {
                Log.e(j, "mColorBrushFilter init Failed!");
                return false;
            }
        }
        if (this.g != null) {
            this.g.a(i, i2);
        }
        return true;
    }

    public void b(int i, int i2) {
        if (i == this.h && i2 == this.i) {
            return;
        }
        a(i, i2);
    }

    private void b() {
        if (this.a != null) {
            this.a.b();
            this.a = null;
        }
        if (this.b != null) {
            this.b.a();
            this.b = null;
        }
        if (this.c != null) {
            this.c.e();
            this.c = null;
        }
        if (this.e != null) {
            this.e.e();
            this.e = null;
        }
        if (this.f != null) {
            this.f.e();
            this.f = null;
        }
        if (this.g != null) {
            this.g.e();
            this.g = null;
        }
    }

    private void c() {
        if (this.q != null) {
            TXCOpenGlUtils.a(this.q);
            this.q = null;
        }
        if (this.p != null) {
            TXCOpenGlUtils.a(this.p);
            this.p = null;
        }
        if (this.o != null) {
            GLES20.glDeleteTextures(1, this.o, 0);
            this.o = null;
        }
    }

    public void a(n.c cVar) {
        this.l = cVar;
        if (this.l == null) {
            return;
        }
        if (this.b != null) {
            this.b.a(this.l);
        }
        if (this.c != null) {
            this.c.a(this.l.j);
        }
        if (n.c.a.MODE_ZOOM_IN == cVar.g) {
            this.r = cVar.j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (com.tencent.liteav.k.n.c.a.b == r7.m) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
        if (com.tencent.liteav.k.n.c.a.c == r7.m) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        r7.m = r7.l.g;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(int r8) {
        /*
            r7 = this;
            com.tencent.liteav.k.n$c r0 = r7.l
            if (r0 != 0) goto L5
            return r8
        L5:
            int[] r0 = r7.o
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1f
            int[] r0 = new int[r1]
            r7.o = r0
            int[] r0 = r7.o
            int r3 = r7.h
            int r4 = r7.i
            int[] r5 = r7.o
            r6 = 6408(0x1908, float:8.98E-42)
            int r3 = com.tencent.liteav.basic.opengl.TXCOpenGlUtils.a(r3, r4, r6, r6, r5)
            r0[r2] = r3
        L1f:
            com.tencent.liteav.beauty.b.o r0 = r7.b
            if (r0 == 0) goto L2a
            com.tencent.liteav.beauty.b.o r0 = r7.b
            int r0 = r0.a(r8)
            goto L2b
        L2a:
            r0 = r8
        L2b:
            com.tencent.liteav.k.m r3 = r7.c
            if (r3 == 0) goto L36
            com.tencent.liteav.k.m r3 = r7.c
            int r3 = r3.a(r8)
            goto L37
        L36:
            r3 = r8
        L37:
            com.tencent.liteav.beauty.d r4 = r7.a
            if (r4 == 0) goto L78
            com.tencent.liteav.k.n$c$a r4 = com.tencent.liteav.k.n.c.a.MODE_ZOOM_OUT
            com.tencent.liteav.k.n$c r5 = r7.l
            com.tencent.liteav.k.n$c$a r5 = r5.g
            if (r4 != r5) goto L60
            com.tencent.liteav.k.m r4 = r7.d
            float r5 = r7.r
            r4.a(r5)
            com.tencent.liteav.k.m r4 = r7.d
            int r4 = r4.a(r8)
            com.tencent.liteav.beauty.d r5 = r7.a
            int r5 = r5.a(r4)
            if (r5 <= 0) goto L59
            r8 = r5
        L59:
            com.tencent.liteav.k.n$c$a r5 = com.tencent.liteav.k.n.c.a.MODE_ZOOM_IN
            com.tencent.liteav.k.n$c$a r6 = r7.m
            if (r5 != r6) goto L72
            goto L71
        L60:
            com.tencent.liteav.beauty.d r4 = r7.a
            int r4 = r4.a(r8)
            if (r4 <= 0) goto L69
            goto L6a
        L69:
            r4 = r8
        L6a:
            com.tencent.liteav.k.n$c$a r5 = com.tencent.liteav.k.n.c.a.MODE_ZOOM_OUT
            com.tencent.liteav.k.n$c$a r6 = r7.m
            if (r5 != r6) goto L71
            goto L72
        L71:
            r8 = r4
        L72:
            com.tencent.liteav.k.n$c r4 = r7.l
            com.tencent.liteav.k.n$c$a r4 = r4.g
            r7.m = r4
        L78:
            com.tencent.liteav.basic.opengl.TXCOpenGlUtils$a r4 = r7.q
            r5 = 36160(0x8d40, float:5.0671E-41)
            if (r4 == 0) goto La6
            com.tencent.liteav.basic.opengl.TXCOpenGlUtils$a r4 = r7.q
            int[] r4 = r4.a
            r4 = r4[r2]
            android.opengl.GLES20.glBindFramebuffer(r5, r4)
            com.tencent.liteav.k.n$c r4 = r7.l
            boolean r4 = r4.k
            if (r1 != r4) goto L98
            com.tencent.liteav.beauty.b.f r1 = r7.g
            int[] r4 = r7.o
            r4 = r4[r2]
            r1.d(r4, r0)
            goto La3
        L98:
            com.tencent.liteav.beauty.b.f r1 = r7.g
            com.tencent.liteav.basic.opengl.TXCOpenGlUtils$a r4 = r7.q
            int[] r4 = r4.b
            r4 = r4[r2]
            r1.d(r4, r0)
        La3:
            android.opengl.GLES20.glBindFramebuffer(r5, r2)
        La6:
            com.tencent.liteav.basic.opengl.TXCOpenGlUtils$a r0 = r7.p
            int[] r0 = r0.a
            r0 = r0[r2]
            android.opengl.GLES20.glBindFramebuffer(r5, r0)
            com.tencent.liteav.beauty.b.n r0 = r7.e
            if (r0 == 0) goto Lc2
            com.tencent.liteav.basic.opengl.TXCOpenGlUtils$a r0 = r7.q
            if (r0 == 0) goto Lc2
            com.tencent.liteav.beauty.b.n r0 = r7.e
            com.tencent.liteav.basic.opengl.TXCOpenGlUtils$a r1 = r7.q
            int[] r1 = r1.b
            r1 = r1[r2]
            r0.b(r1, r8, r3)
        Lc2:
            android.opengl.GLES20.glBindFramebuffer(r5, r2)
            com.tencent.liteav.basic.opengl.TXCOpenGlUtils$a r8 = r7.p
            int[] r8 = r8.b
            r8 = r8[r2]
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.k.b.a(int):int");
    }

    public void a() {
        b();
        c();
    }
}
