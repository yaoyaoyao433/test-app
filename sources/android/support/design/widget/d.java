package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.constraint.R;
import android.support.v4.math.MathUtils;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.aw;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    private static final boolean k;
    private static final Paint l;
    private boolean A;
    private boolean B;
    private Bitmap C;
    private Paint D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int[] I;
    private boolean J;
    private Interpolator L;
    private float M;
    private float N;
    private float O;
    private int P;
    private float Q;
    private float R;
    private float S;
    private int T;
    float a;
    ColorStateList f;
    Typeface g;
    Typeface h;
    CharSequence i;
    Interpolator j;
    private final View m;
    private boolean n;
    private ColorStateList r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private Typeface y;
    private CharSequence z;
    int b = 16;
    int c = 16;
    float d = 15.0f;
    float e = 15.0f;
    private final TextPaint K = new TextPaint(129);
    private final Rect p = new Rect();
    private final Rect o = new Rect();
    private final RectF q = new RectF();

    static {
        k = Build.VERSION.SDK_INT < 18;
        l = null;
    }

    public d(View view) {
        this.m = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Interpolator interpolator) {
        this.L = interpolator;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2, int i3, int i4) {
        if (a(this.o, i, i2, i3, i4)) {
            return;
        }
        this.o.set(i, i2, i3, i4);
        this.J = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, int i2, int i3, int i4) {
        if (a(this.p, i, i2, i3, i4)) {
            return;
        }
        this.p.set(i, i2, i3, i4);
        this.J = true;
        c();
    }

    private void c() {
        this.n = this.p.width() > 0 && this.p.height() > 0 && this.o.width() > 0 && this.o.height() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        if (this.b != i) {
            this.b = i;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        if (this.c != i) {
            this.c = i;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        aw a = aw.a(this.m.getContext(), i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.textAllCaps, R.attr.fontFamily});
        if (a.f(3)) {
            this.f = a.e(3);
        }
        if (a.f(0)) {
            this.e = a.e(0, (int) this.e);
        }
        this.P = a.a(6, 0);
        this.N = a.a(7, 0.0f);
        this.O = a.a(8, 0.0f);
        this.M = a.a(9, 0.0f);
        a.a.recycle();
        if (Build.VERSION.SDK_INT >= 16) {
            this.g = e(i);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i) {
        aw a = aw.a(this.m.getContext(), i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.textAllCaps, R.attr.fontFamily});
        if (a.f(3)) {
            this.r = a.e(3);
        }
        if (a.f(0)) {
            this.d = a.e(0, (int) this.d);
        }
        this.T = a.a(6, 0);
        this.R = a.a(7, 0.0f);
        this.S = a.a(8, 0.0f);
        this.Q = a.a(9, 0.0f);
        a.a.recycle();
        if (Build.VERSION.SDK_INT >= 16) {
            this.h = e(i);
        }
        b();
    }

    private Typeface e(int i) {
        TypedArray obtainStyledAttributes = this.m.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Typeface typeface) {
        this.h = typeface;
        this.g = typeface;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Typeface a() {
        return this.g != null ? this.g : Typeface.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (clamp != this.a) {
            this.a = clamp;
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int[] iArr) {
        this.I = iArr;
        if ((this.f != null && this.f.isStateful()) || (this.r != null && this.r.isStateful())) {
            b();
            return true;
        }
        return false;
    }

    private void d() {
        b(this.a);
    }

    private void b(float f) {
        c(f);
        this.w = a(this.u, this.v, f, this.j);
        this.x = a(this.s, this.t, f, this.j);
        d(a(this.d, this.e, f, this.L));
        if (this.f != this.r) {
            this.K.setColor(a(e(), f(), f));
        } else {
            this.K.setColor(f());
        }
        this.K.setShadowLayer(a(this.Q, this.M, f, (Interpolator) null), a(this.R, this.N, f, (Interpolator) null), a(this.S, this.O, f, (Interpolator) null), a(this.T, this.P, f));
        ViewCompat.postInvalidateOnAnimation(this.m);
    }

    @ColorInt
    private int e() {
        if (this.I != null) {
            return this.r.getColorForState(this.I, 0);
        }
        return this.r.getDefaultColor();
    }

    @ColorInt
    private int f() {
        if (this.I != null) {
            return this.f.getColorForState(this.I, 0);
        }
        return this.f.getDefaultColor();
    }

    private void g() {
        float f = this.H;
        e(this.e);
        float measureText = this.z != null ? this.K.measureText(this.z, 0, this.z.length()) : 0.0f;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.c, this.A ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.t = this.p.top - this.K.ascent();
        } else if (i == 80) {
            this.t = this.p.bottom;
        } else {
            this.t = this.p.centerY() + (((this.K.descent() - this.K.ascent()) / 2.0f) - this.K.descent());
        }
        int i2 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i2 == 1) {
            this.v = this.p.centerX() - (measureText / 2.0f);
        } else if (i2 == 5) {
            this.v = this.p.right - measureText;
        } else {
            this.v = this.p.left;
        }
        e(this.d);
        float measureText2 = this.z != null ? this.K.measureText(this.z, 0, this.z.length()) : 0.0f;
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.b, this.A ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.s = this.o.top - this.K.ascent();
        } else if (i3 == 80) {
            this.s = this.o.bottom;
        } else {
            this.s = this.o.centerY() + (((this.K.descent() - this.K.ascent()) / 2.0f) - this.K.descent());
        }
        int i4 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i4 == 1) {
            this.u = this.o.centerX() - (measureText2 / 2.0f);
        } else if (i4 == 5) {
            this.u = this.o.right - measureText2;
        } else {
            this.u = this.o.left;
        }
        i();
        d(f);
    }

    private void c(float f) {
        this.q.left = a(this.o.left, this.p.left, f, this.j);
        this.q.top = a(this.s, this.t, f, this.j);
        this.q.right = a(this.o.right, this.p.right, f, this.j);
        this.q.bottom = a(this.o.bottom, this.p.bottom, f, this.j);
    }

    public final void a(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.z != null && this.n) {
            float f2 = this.w;
            float f3 = this.x;
            boolean z = this.B && this.C != null;
            if (z) {
                f = this.E * this.G;
            } else {
                this.K.ascent();
                f = 0.0f;
                this.K.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            if (this.G != 1.0f) {
                canvas.scale(this.G, this.G, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.C, f2, f4, this.D);
            } else {
                canvas.drawText(this.z, 0, this.z.length(), f2, f4, this.K);
            }
        }
        canvas.restoreToCount(save);
    }

    private boolean b(CharSequence charSequence) {
        return (ViewCompat.getLayoutDirection(this.m) == 1 ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    private void d(float f) {
        e(f);
        this.B = k && this.G != 1.0f;
        if (this.B) {
            h();
        }
        ViewCompat.postInvalidateOnAnimation(this.m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Typeface typeface, Typeface typeface2) {
        if (typeface == null || typeface.equals(typeface2)) {
            return typeface == null && typeface2 != null;
        }
        return true;
    }

    private void e(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.i == null) {
            return;
        }
        float width = this.p.width();
        float width2 = this.o.width();
        if (a(f, this.e)) {
            float f3 = this.e;
            this.G = 1.0f;
            if (a(this.y, this.g)) {
                this.y = this.g;
                z2 = true;
            } else {
                z2 = false;
            }
            f2 = f3;
            z = z2;
        } else {
            f2 = this.d;
            if (a(this.y, this.h)) {
                this.y = this.h;
                z = true;
            } else {
                z = false;
            }
            if (a(f, this.d)) {
                this.G = 1.0f;
            } else {
                this.G = f / this.d;
            }
            float f4 = this.e / this.d;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
        }
        if (width > 0.0f) {
            z = this.H != f2 || this.J || z;
            this.H = f2;
            this.J = false;
        }
        if (this.z == null || z) {
            this.K.setTextSize(this.H);
            this.K.setTypeface(this.y);
            this.K.setLinearText(this.G != 1.0f);
            CharSequence ellipsize = TextUtils.ellipsize(this.i, this.K, width, TextUtils.TruncateAt.END);
            if (TextUtils.equals(ellipsize, this.z)) {
                return;
            }
            this.z = ellipsize;
            this.A = b(this.z);
        }
    }

    private void h() {
        if (this.C != null || this.o.isEmpty() || TextUtils.isEmpty(this.z)) {
            return;
        }
        b(0.0f);
        this.E = this.K.ascent();
        this.F = this.K.descent();
        int round = Math.round(this.K.measureText(this.z, 0, this.z.length()));
        int round2 = Math.round(this.F - this.E);
        if (round <= 0 || round2 <= 0) {
            return;
        }
        this.C = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        new Canvas(this.C).drawText(this.z, 0, this.z.length(), 0.0f, round2 - this.K.descent(), this.K);
        if (this.D == null) {
            this.D = new Paint(3);
        }
    }

    public final void b() {
        if (this.m.getHeight() <= 0 || this.m.getWidth() <= 0) {
            return;
        }
        g();
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.i)) {
            this.i = charSequence;
            this.z = null;
            i();
            b();
        }
    }

    private void i() {
        if (this.C != null) {
            this.C.recycle();
            this.C = null;
        }
    }

    private static boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private static float a(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return a.a(f, f2, f3);
    }

    private static boolean a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
