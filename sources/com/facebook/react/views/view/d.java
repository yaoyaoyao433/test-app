package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.am;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d extends Drawable {
    @Nullable
    private am b;
    @Nullable
    private am c;
    @Nullable
    private am d;
    @Nullable
    private b e;
    @Nullable
    private PathEffect f;
    @Nullable
    private Path g;
    @Nullable
    private Path h;
    @Nullable
    private Path i;
    @Nullable
    private Path j;
    @Nullable
    private Path k;
    @Nullable
    private RectF l;
    @Nullable
    private RectF m;
    @Nullable
    private RectF n;
    @Nullable
    private RectF o;
    @Nullable
    private PointF p;
    @Nullable
    private PointF q;
    @Nullable
    private PointF r;
    @Nullable
    private PointF s;
    @Nullable
    private float[] x;
    private final Context y;
    private int z;
    private boolean t = false;
    private float u = Float.NaN;
    private final Paint v = new Paint(1);
    int a = 0;
    private int w = 255;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    private static int a(float f, float f2) {
        return ((((int) f) << 24) & (-16777216)) | (((int) f2) & ViewCompat.MEASURED_SIZE_MASK);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum b {
        SOLID,
        DASHED,
        DOTTED;

        @Nullable
        public static PathEffect a(b bVar, float f) {
            switch (bVar) {
                case SOLID:
                    return null;
                case DASHED:
                    float f2 = f * 3.0f;
                    return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
                case DOTTED:
                    return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
                default:
                    return null;
            }
        }
    }

    public d(Context context) {
        this.y = context;
    }

    public final boolean a() {
        float[] fArr;
        if (com.facebook.yoga.b.a(this.u) || this.u <= 0.0f) {
            if (this.x != null) {
                for (float f : this.x) {
                    if (!com.facebook.yoga.b.a(f) && f > 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.t = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.w) {
            this.w = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int a2 = com.facebook.react.views.view.a.a(this.a, this.w) >>> 24;
        if (a2 == 255) {
            return -1;
        }
        return a2 == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
        } else if ((!com.facebook.yoga.b.a(this.u) && this.u > 0.0f) || this.x != null) {
            g();
            try {
                outline.setConvexPath(this.i);
            } catch (IllegalArgumentException e) {
                if ("path must be convex".equals(e.getMessage())) {
                    com.facebook.common.logging.a.d("ReactViewBackgroundDrawable", null, e);
                    return;
                }
                throw e;
            }
        } else {
            outline.setRect(getBounds());
        }
    }

    public final void a(int i, float f) {
        if (this.b == null) {
            this.b = new am();
        }
        if (com.facebook.react.uimanager.e.a(this.b.a[i], f)) {
            return;
        }
        this.b.a(i, f);
        if (i != 8) {
            switch (i) {
            }
            invalidateSelf();
        }
        this.t = true;
        invalidateSelf();
    }

    public final void a(@Nullable String str) {
        b valueOf = str == null ? null : b.valueOf(str.toUpperCase(Locale.US));
        if (this.e != valueOf) {
            this.e = valueOf;
            this.t = true;
            invalidateSelf();
        }
    }

    public final void a(float f) {
        if (com.facebook.react.uimanager.e.a(this.u, f)) {
            return;
        }
        this.u = f;
        this.t = true;
        invalidateSelf();
    }

    public final void a(float f, int i) {
        if (this.x == null) {
            this.x = new float[8];
            Arrays.fill(this.x, Float.NaN);
        }
        if (com.facebook.react.uimanager.e.a(this.x[i], f)) {
            return;
        }
        this.x[i] = f;
        this.t = true;
        invalidateSelf();
    }

    public final float b() {
        if (com.facebook.yoga.b.a(this.u)) {
            return 0.0f;
        }
        return this.u;
    }

    public final float a(a aVar) {
        return a(Float.NaN, aVar);
    }

    public final float a(float f, a aVar) {
        if (this.x == null) {
            return f;
        }
        float f2 = this.x[aVar.ordinal()];
        return com.facebook.yoga.b.a(f2) ? f : f2;
    }

    public final void a(int i) {
        this.a = i;
        invalidateSelf();
    }

    public final int c() {
        return this.z;
    }

    public final boolean b(int i) {
        if (this.z != i) {
            this.z = i;
            return false;
        }
        return false;
    }

    @VisibleForTesting
    public final int d() {
        return this.a;
    }

    private void g() {
        float max;
        float max2;
        float max3;
        float max4;
        float max5;
        float max6;
        float max7;
        float max8;
        int i;
        float f;
        if (this.t) {
            this.t = false;
            if (this.g == null) {
                this.g = new Path();
            }
            if (this.h == null) {
                this.h = new Path();
            }
            if (this.i == null) {
                this.i = new Path();
            }
            if (this.k == null) {
                this.k = new Path();
            }
            if (this.l == null) {
                this.l = new RectF();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (this.n == null) {
                this.n = new RectF();
            }
            if (this.o == null) {
                this.o = new RectF();
            }
            this.g.reset();
            this.h.reset();
            this.i.reset();
            this.k.reset();
            this.l.set(getBounds());
            this.m.set(getBounds());
            this.n.set(getBounds());
            this.o.set(getBounds());
            RectF f2 = f();
            this.l.top += f2.top;
            this.l.bottom -= f2.bottom;
            this.l.left += f2.left;
            this.l.right -= f2.right;
            this.o.top += f2.top * 0.5f;
            this.o.bottom -= f2.bottom * 0.5f;
            this.o.left += f2.left * 0.5f;
            this.o.right -= f2.right * 0.5f;
            float b2 = b();
            float a2 = a(b2, a.TOP_LEFT);
            float a3 = a(b2, a.TOP_RIGHT);
            float a4 = a(b2, a.BOTTOM_LEFT);
            float a5 = a(b2, a.BOTTOM_RIGHT);
            if (Build.VERSION.SDK_INT >= 17) {
                boolean z = this.z == 1;
                float a6 = a(Float.NaN, a.TOP_START);
                float a7 = a(Float.NaN, a.TOP_END);
                float a8 = a(Float.NaN, a.BOTTOM_START);
                float a9 = a(Float.NaN, a.BOTTOM_END);
                com.facebook.react.modules.i18nmanager.a.a();
                if (com.facebook.react.modules.i18nmanager.a.a(this.y, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)) {
                    if (!com.facebook.yoga.b.a(a6)) {
                        a2 = a6;
                    }
                    if (!com.facebook.yoga.b.a(a7)) {
                        a3 = a7;
                    }
                    if (!com.facebook.yoga.b.a(a8)) {
                        a4 = a8;
                    }
                    if (!com.facebook.yoga.b.a(a9)) {
                        a5 = a9;
                    }
                    float f3 = z ? a3 : a2;
                    if (z) {
                        a3 = a2;
                    }
                    float f4 = z ? a5 : a4;
                    if (z) {
                        a5 = a4;
                    }
                    a4 = f4;
                    a2 = f3;
                } else {
                    float f5 = z ? a7 : a6;
                    if (!z) {
                        a6 = a7;
                    }
                    float f6 = z ? a9 : a8;
                    if (z) {
                        a9 = a8;
                    }
                    if (!com.facebook.yoga.b.a(f5)) {
                        a2 = f5;
                    }
                    if (!com.facebook.yoga.b.a(a6)) {
                        a3 = a6;
                    }
                    if (!com.facebook.yoga.b.a(f6)) {
                        a4 = f6;
                    }
                    if (!com.facebook.yoga.b.a(a9)) {
                        a5 = a9;
                    }
                }
            }
            float f7 = a4;
            this.g.addRoundRect(this.l, new float[]{Math.max(a2 - f2.left, 0.0f), Math.max(a2 - f2.top, 0.0f), Math.max(a3 - f2.right, 0.0f), Math.max(a3 - f2.top, 0.0f), Math.max(a5 - f2.right, 0.0f), Math.max(a5 - f2.bottom, 0.0f), Math.max(a4 - f2.left, 0.0f), Math.max(a4 - f2.bottom, 0.0f)}, Path.Direction.CW);
            this.h.addRoundRect(this.m, new float[]{a2, a2, a3, a3, a5, a5, f7, f7}, Path.Direction.CW);
            if (this.b != null) {
                i = 8;
                f = this.b.a(8) / 2.0f;
            } else {
                i = 8;
                f = 0.0f;
            }
            Path path = this.i;
            RectF rectF = this.n;
            float[] fArr = new float[i];
            float f8 = a2 + f;
            fArr[0] = f8;
            fArr[1] = f8;
            float f9 = a3 + f;
            fArr[2] = f9;
            fArr[3] = f9;
            float f10 = a5 + f;
            fArr[4] = f10;
            fArr[5] = f10;
            float f11 = f7 + f;
            fArr[6] = f11;
            fArr[7] = f11;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            Path path2 = this.k;
            RectF rectF2 = this.o;
            float[] fArr2 = new float[8];
            fArr2[0] = Math.max(a2 - (f2.left * 0.5f), f2.left > 0.0f ? a2 / f2.left : 0.0f);
            fArr2[1] = Math.max(a2 - (f2.top * 0.5f), f2.top > 0.0f ? a2 / f2.top : 0.0f);
            fArr2[2] = Math.max(a3 - (f2.right * 0.5f), f2.right > 0.0f ? a3 / f2.right : 0.0f);
            fArr2[3] = Math.max(a3 - (f2.top * 0.5f), f2.top > 0.0f ? a3 / f2.top : 0.0f);
            fArr2[4] = Math.max(a5 - (f2.right * 0.5f), f2.right > 0.0f ? a5 / f2.right : 0.0f);
            fArr2[5] = Math.max(a5 - (f2.bottom * 0.5f), f2.bottom > 0.0f ? a5 / f2.bottom : 0.0f);
            fArr2[6] = Math.max(f7 - (f2.left * 0.5f), f2.left > 0.0f ? f7 / f2.left : 0.0f);
            fArr2[7] = Math.max(f7 - (f2.bottom * 0.5f), f2.bottom > 0.0f ? f7 / f2.bottom : 0.0f);
            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
            if (this.p == null) {
                this.p = new PointF();
            }
            this.p.x = this.l.left;
            this.p.y = this.l.top;
            a(this.l.left, this.l.top, this.l.left + (max * 2.0f), this.l.top + (max2 * 2.0f), this.m.left, this.m.top, this.l.left, this.l.top, this.p);
            if (this.s == null) {
                this.s = new PointF();
            }
            this.s.x = this.l.left;
            this.s.y = this.l.bottom;
            a(this.l.left, this.l.bottom - (max8 * 2.0f), this.l.left + (max7 * 2.0f), this.l.bottom, this.m.left, this.m.bottom, this.l.left, this.l.bottom, this.s);
            if (this.q == null) {
                this.q = new PointF();
            }
            this.q.x = this.l.right;
            this.q.y = this.l.top;
            a(this.l.right - (max3 * 2.0f), this.l.top, this.l.right, this.l.top + (max4 * 2.0f), this.m.right, this.m.top, this.l.right, this.l.top, this.q);
            if (this.r == null) {
                this.r = new PointF();
            }
            this.r.x = this.l.right;
            this.r.y = this.l.bottom;
            a(this.l.right - (max5 * 2.0f), this.l.bottom - (max6 * 2.0f), this.l.right, this.l.bottom, this.m.right, this.m.bottom, this.l.right, this.l.bottom, this.r);
        }
    }

    private static void a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = (d16 * d13 * d13) + d15;
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = sqrt + d9;
        double d22 = (d13 * sqrt) + d14 + d10;
        if (Double.isNaN(d21) || Double.isNaN(d22)) {
            return;
        }
        pointF.x = (float) d21;
        pointF.y = (float) d22;
    }

    public final float b(float f, int i) {
        if (this.b == null) {
            return f;
        }
        float f2 = this.b.a[i];
        return com.facebook.yoga.b.a(f2) ? f : f2;
    }

    public final float e() {
        if (this.b == null || com.facebook.yoga.b.a(this.b.a[8])) {
            return 0.0f;
        }
        return this.b.a[8];
    }

    private void a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i == 0) {
            return;
        }
        if (this.j == null) {
            this.j = new Path();
        }
        this.v.setColor(i);
        this.j.reset();
        this.j.moveTo(f, f2);
        this.j.lineTo(f3, f4);
        this.j.lineTo(f5, f6);
        this.j.lineTo(f7, f8);
        this.j.lineTo(f, f2);
        canvas.drawPath(this.j, this.v);
    }

    private boolean c(int i) {
        return (com.facebook.yoga.b.a(this.c != null ? this.c.a(i) : Float.NaN) || com.facebook.yoga.b.a(this.d != null ? this.d.a(i) : Float.NaN)) ? false : true;
    }

    private int d(int i) {
        return a(this.d != null ? this.d.a(i) : 255.0f, this.c != null ? this.c.a(i) : 0.0f);
    }

    public final RectF f() {
        float b2 = b(0.0f, 8);
        float b3 = b(b2, 1);
        float b4 = b(b2, 3);
        float b5 = b(b2, 0);
        float b6 = b(b2, 2);
        if (Build.VERSION.SDK_INT >= 17 && this.b != null) {
            boolean z = this.z == 1;
            float f = this.b.a[4];
            float f2 = this.b.a[5];
            com.facebook.react.modules.i18nmanager.a.a();
            if (com.facebook.react.modules.i18nmanager.a.a(this.y, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)) {
                if (!com.facebook.yoga.b.a(f)) {
                    b5 = f;
                }
                if (!com.facebook.yoga.b.a(f2)) {
                    b6 = f2;
                }
                float f3 = z ? b6 : b5;
                if (z) {
                    b6 = b5;
                }
                b5 = f3;
            } else {
                float f4 = z ? f2 : f;
                if (!z) {
                    f = f2;
                }
                if (!com.facebook.yoga.b.a(f4)) {
                    b5 = f4;
                }
                if (!com.facebook.yoga.b.a(f)) {
                    b6 = f;
                }
            }
        }
        return new RectF(b5, b3, b6, b4);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0123  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.d.draw(android.graphics.Canvas):void");
    }

    public final void a(int i, float f, float f2) {
        if (this.c == null) {
            this.c = new am(0.0f);
        }
        if (!com.facebook.react.uimanager.e.a(this.c.a[i], f)) {
            this.c.a(i, f);
            invalidateSelf();
        }
        if (this.d == null) {
            this.d = new am(255.0f);
        }
        if (com.facebook.react.uimanager.e.a(this.d.a[i], f2)) {
            return;
        }
        this.d.a(i, f2);
        invalidateSelf();
    }
}
