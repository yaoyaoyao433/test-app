package com.tencent.liteav.renderer;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.mapsdk.internal.jw;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e {
    private TextureView a;
    private Handler b;
    private int c;
    private int d;
    private int e = jw.h;
    private int f = jw.g;
    private int g = 0;
    private int h = 0;
    private int i = 1;
    private int j = 0;
    private float k = 1.0f;
    private int l = 0;

    public e(TextureView textureView) {
        this.c = 0;
        this.d = 0;
        this.a = textureView;
        this.c = textureView.getWidth();
        this.d = textureView.getHeight();
        this.b = new Handler(textureView.getContext().getMainLooper());
    }

    public void a(final int i) {
        try {
            this.b.post(new Runnable() { // from class: com.tencent.liteav.renderer.e.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.b(i);
                }
            });
        } catch (Exception e) {
            TXCLog.e("TXCTextureViewWrapper", "set render mode failed", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r6 > r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
        if (r6 < r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
        if (r6 < r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r6) {
        /*
            r5 = this;
            r5.i = r6
            android.view.TextureView r0 = r5.a
            if (r0 == 0) goto L9e
            r0 = 1
            r1 = 90
            r2 = 270(0x10e, float:3.78E-43)
            r3 = 180(0xb4, float:2.52E-43)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r6 != r0) goto L43
            int r6 = r5.j
            if (r6 == 0) goto L86
            int r6 = r5.j
            if (r6 != r3) goto L1b
            goto L86
        L1b:
            int r6 = r5.j
            if (r6 == r2) goto L23
            int r6 = r5.j
            if (r6 != r1) goto L86
        L23:
            int r6 = r5.g
            if (r6 == 0) goto L42
            int r6 = r5.h
            if (r6 != 0) goto L2c
            goto L42
        L2c:
            int r6 = r5.d
            float r6 = (float) r6
            int r0 = r5.g
            float r0 = (float) r0
            float r6 = r6 / r0
            int r0 = r5.c
            float r0 = (float) r0
            int r1 = r5.h
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 <= 0) goto L40
        L3e:
            r4 = r0
            goto L86
        L40:
            r4 = r6
            goto L86
        L42:
            return
        L43:
            if (r6 != 0) goto L86
            int r6 = r5.g
            if (r6 == 0) goto L85
            int r6 = r5.h
            if (r6 != 0) goto L4e
            goto L85
        L4e:
            int r6 = r5.j
            if (r6 == 0) goto L72
            int r6 = r5.j
            if (r6 != r3) goto L57
            goto L72
        L57:
            int r6 = r5.j
            if (r6 == r2) goto L5f
            int r6 = r5.j
            if (r6 != r1) goto L86
        L5f:
            int r6 = r5.d
            float r6 = (float) r6
            int r0 = r5.g
            float r0 = (float) r0
            float r6 = r6 / r0
            int r0 = r5.c
            float r0 = (float) r0
            int r1 = r5.h
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto L40
            goto L3e
        L72:
            int r6 = r5.d
            float r6 = (float) r6
            int r0 = r5.h
            float r0 = (float) r0
            float r6 = r6 / r0
            int r0 = r5.c
            float r0 = (float) r0
            int r1 = r5.g
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto L40
            goto L3e
        L85:
            return
        L86:
            float r6 = r5.k
            r0 = 0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L8e
            float r4 = -r4
        L8e:
            android.view.TextureView r6 = r5.a
            r6.setScaleX(r4)
            android.view.TextureView r6 = r5.a
            float r0 = java.lang.Math.abs(r4)
            r6.setScaleY(r0)
            r5.k = r4
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.renderer.e.b(int):void");
    }

    public void c(final int i) {
        try {
            this.b.post(new Runnable() { // from class: com.tencent.liteav.renderer.e.2
                @Override // java.lang.Runnable
                public void run() {
                    e.this.d(i);
                }
            });
        } catch (Exception e) {
            TXCLog.e("TXCTextureViewWrapper", "set render rotation failed.", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r5 > r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r5 < r2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r5) {
        /*
            r4 = this;
            int r5 = r5 % 360
            r4.j = r5
            android.view.TextureView r0 = r4.a
            if (r0 == 0) goto L96
            r0 = 1
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L4f
            r2 = 180(0xb4, float:2.52E-43)
            if (r5 != r2) goto L12
            goto L4f
        L12:
            r2 = 270(0x10e, float:3.78E-43)
            if (r5 == r2) goto L1a
            r2 = 90
            if (r5 != r2) goto L7e
        L1a:
            int r2 = r4.g
            if (r2 == 0) goto L4e
            int r2 = r4.h
            if (r2 != 0) goto L23
            goto L4e
        L23:
            android.view.TextureView r2 = r4.a
            int r5 = 360 - r5
            float r5 = (float) r5
            r2.setRotation(r5)
            int r5 = r4.d
            float r5 = (float) r5
            int r2 = r4.g
            float r2 = (float) r2
            float r5 = r5 / r2
            int r2 = r4.c
            float r2 = (float) r2
            int r3 = r4.h
            float r3 = (float) r3
            float r2 = r2 / r3
            int r3 = r4.i
            if (r3 != r0) goto L45
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L43
        L41:
            r1 = r2
            goto L7e
        L43:
            r1 = r5
            goto L7e
        L45:
            int r0 = r4.i
            if (r0 != 0) goto L7e
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L43
            goto L41
        L4e:
            return
        L4f:
            android.view.TextureView r2 = r4.a
            int r5 = 360 - r5
            float r5 = (float) r5
            r2.setRotation(r5)
            int r5 = r4.i
            if (r5 != r0) goto L5c
            goto L7e
        L5c:
            int r5 = r4.i
            if (r5 != 0) goto L7e
            int r5 = r4.g
            if (r5 == 0) goto L7d
            int r5 = r4.h
            if (r5 != 0) goto L69
            goto L7d
        L69:
            int r5 = r4.d
            float r5 = (float) r5
            int r0 = r4.h
            float r0 = (float) r0
            float r5 = r5 / r0
            int r0 = r4.c
            float r0 = (float) r0
            int r1 = r4.g
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto L43
            r1 = r0
            goto L7e
        L7d:
            return
        L7e:
            float r5 = r4.k
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L86
            float r1 = -r1
        L86:
            android.view.TextureView r5 = r4.a
            r5.setScaleX(r1)
            android.view.TextureView r5 = r4.a
            float r0 = java.lang.Math.abs(r1)
            r5.setScaleY(r0)
            r4.k = r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.renderer.e.d(int):void");
    }

    private void a() {
        try {
            a(new Runnable() { // from class: com.tencent.liteav.renderer.e.3
                @Override // java.lang.Runnable
                public void run() {
                    e.this.c(e.this.e, e.this.f);
                    e.this.b(e.this.i);
                    e.this.d(e.this.j);
                }
            });
        } catch (Exception e) {
            TXCLog.e("TXCTextureViewWrapper", "adjust video size failed.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        if (this.a == null || i == 0 || i2 == 0 || this.c == 0 || this.d == 0) {
            return;
        }
        double d = i2 / i;
        if (this.d > ((int) (this.c * d))) {
            this.g = this.c;
            this.h = (int) (this.c * d);
        } else {
            this.g = (int) (this.d / d);
            this.h = this.d;
        }
        float f = this.g / this.c;
        float f2 = this.h / this.d;
        Matrix matrix = new Matrix();
        this.a.getTransform(matrix);
        matrix.setScale(f, f2);
        matrix.postTranslate((this.c - this.g) / 2.0f, (this.d - this.h) / 2.0f);
        this.a.setTransform(matrix);
        this.a.requestLayout();
    }

    public void a(final boolean z) {
        try {
            this.b.post(new Runnable() { // from class: com.tencent.liteav.renderer.e.4
                @Override // java.lang.Runnable
                public void run() {
                    if (e.this.a != null) {
                        e.this.k = Math.abs(e.this.k);
                        if (z) {
                            e.this.k = -e.this.k;
                        }
                        e.this.a.setScaleX(e.this.k);
                        e.this.a.setScaleY(Math.abs(e.this.k));
                    }
                }
            });
        } catch (Exception e) {
            TXCLog.e("TXCTextureViewWrapper", "set mirror failed.", e);
        }
    }

    public void a(int i, int i2) {
        TXCLog.w("TXCTextureViewWrapper", "vrender: set view size:" + i + CommonConstant.Symbol.COMMA + i2);
        this.c = i;
        this.d = i2;
        a();
    }

    public void b(int i, int i2) {
        TXCLog.w("TXCTextureViewWrapper", "vrender: set video size:" + i + CommonConstant.Symbol.COMMA + i2);
        this.e = i;
        this.f = i2;
        a();
    }

    private void a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.b.post(runnable);
        }
    }
}
