package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.support.design.widget.l;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.util.StateSet;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public class g {
    static final Interpolator a = android.support.design.widget.a.c;
    static final int[] k = {16842919, 16842910};
    static final int[] l = {16842908, 16842910};
    static final int[] m = {16842910};
    static final int[] n = new int[0];
    i c;
    float d;
    Drawable e;
    Drawable f;
    android.support.design.widget.b g;
    Drawable h;
    float i;
    float j;
    final VisibilityAwareImageButton o;
    final j p;
    ViewTreeObserver.OnPreDrawListener q;
    int b = 0;
    private final Rect s = new Rect();
    private final l r = new l();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
    }

    void b(Rect rect) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(VisibilityAwareImageButton visibilityAwareImageButton, j jVar) {
        this.o = visibilityAwareImageButton;
        this.p = jVar;
        this.r.a(k, a(new b()));
        this.r.a(l, a(new b()));
        this.r.a(m, a(new d()));
        this.r.a(n, a(new a()));
        this.d = this.o.getRotation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList, PorterDuff.Mode mode, int i, int i2) {
        Drawable[] drawableArr;
        this.e = DrawableCompat.wrap(g());
        DrawableCompat.setTintList(this.e, colorStateList);
        if (mode != null) {
            DrawableCompat.setTintMode(this.e, mode);
        }
        this.f = DrawableCompat.wrap(g());
        DrawableCompat.setTintList(this.f, b(i));
        if (i2 > 0) {
            this.g = a(i2, colorStateList);
            drawableArr = new Drawable[]{this.g, this.e, this.f};
        } else {
            this.g = null;
            drawableArr = new Drawable[]{this.e, this.f};
        }
        this.h = new LayerDrawable(drawableArr);
        this.c = new i(this.o.getContext(), this.h, this.p.a(), this.i, this.i + this.j);
        i iVar = this.c;
        iVar.k = false;
        iVar.invalidateSelf();
        this.p.a(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        if (this.f != null) {
            DrawableCompat.setTintList(this.f, b(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f) {
        if (this.i != f) {
            this.i = f;
            a(f, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2) {
        if (this.c != null) {
            this.c.a(f, this.j + f);
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr) {
        l.a aVar;
        l lVar = this.r;
        int size = lVar.a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = lVar.a.get(i);
            if (StateSet.stateSetMatches(aVar.a, iArr)) {
                break;
            }
            i++;
        }
        if (aVar != lVar.b) {
            if (lVar.b != null) {
                lVar.cancel();
            }
            lVar.b = aVar;
            if (aVar != null) {
                lVar.c = aVar.b;
                lVar.c.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        l lVar = this.r;
        if (lVar.c != null) {
            lVar.c.end();
            lVar.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        Rect rect = this.s;
        a(rect);
        b(rect);
        this.p.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void a(Rect rect) {
        this.c.getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final android.support.design.widget.b a(int i, ColorStateList colorStateList) {
        Context context = this.o.getContext();
        android.support.design.widget.b f = f();
        f.a(ContextCompat.getColor(context, R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_outer_color));
        f.a(i);
        f.a(colorStateList);
        return f;
    }

    android.support.design.widget.b f() {
        return new android.support.design.widget.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final GradientDrawable g() {
        GradientDrawable h = h();
        h.setShape(1);
        h.setColor(-1);
        return h;
    }

    GradientDrawable h() {
        return new GradientDrawable();
    }

    private static ValueAnimator a(@NonNull e eVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(eVar);
        valueAnimator.addUpdateListener(eVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    abstract class e extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean a;
        private float c;
        private float d;

        protected abstract float a();

        private e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                this.c = g.this.c.j;
                this.d = a();
                this.a = true;
            }
            g.this.c.a(this.c + ((this.d - this.c) * valueAnimator.getAnimatedFraction()));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.c.a(this.d);
            this.a = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class d extends e {
        d() {
            super();
        }

        @Override // android.support.design.widget.g.e
        protected final float a() {
            return g.this.i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends e {
        b() {
            super();
        }

        @Override // android.support.design.widget.g.e
        protected final float a() {
            return g.this.i + g.this.j;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a extends e {
        @Override // android.support.design.widget.g.e
        protected final float a() {
            return 0.0f;
        }

        a() {
            super();
        }
    }

    private static ColorStateList b(int i) {
        return new ColorStateList(new int[][]{l, k, new int[0]}, new int[]{i, i, 0});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return ViewCompat.isLaidOut(this.o) && !this.o.isInEditMode();
    }
}
