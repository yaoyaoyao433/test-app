package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.design.widget.AppBarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.math.MathUtils;
import android.support.v4.util.ObjectsCompat;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    final d a;
    Drawable b;
    int c;
    WindowInsetsCompat d;
    private boolean e;
    private int f;
    private Toolbar g;
    private View h;
    private View i;
    private int j;
    private int k;
    private int l;
    private int m;
    private final Rect n;
    private boolean o;
    private boolean p;
    private Drawable q;
    private int r;
    private boolean s;
    private ValueAnimator t;
    private long u;
    private int v;
    private AppBarLayout.a w;

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        this.n = new Rect();
        this.v = -1;
        n.a(context);
        this.a = new d(this);
        this.a.a(android.support.design.widget.a.e);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.title, R.attr.expandedTitleMargin, R.attr.expandedTitleMarginStart, R.attr.expandedTitleMarginTop, R.attr.expandedTitleMarginEnd, R.attr.expandedTitleMarginBottom, R.attr.expandedTitleTextAppearance, R.attr.collapsedTitleTextAppearance, R.attr.contentScrim, R.attr.statusBarScrim, R.attr.toolbarId, R.attr.scrimVisibleHeightTrigger, R.attr.scrimAnimationDuration, R.attr.collapsedTitleGravity, R.attr.expandedTitleGravity, R.attr.titleEnabled}, i, 2131559083);
        this.a.a(obtainStyledAttributes.getInt(14, 8388691));
        this.a.b(obtainStyledAttributes.getInt(13, 8388627));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(2)) {
            this.j = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.m = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        }
        this.o = obtainStyledAttributes.getBoolean(15, true);
        setTitle(obtainStyledAttributes.getText(0));
        this.a.d(2131558892);
        this.a.c(2131558873);
        if (obtainStyledAttributes.hasValue(6)) {
            this.a.d(obtainStyledAttributes.getResourceId(6, 0));
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.a.c(obtainStyledAttributes.getResourceId(7, 0));
        }
        this.v = obtainStyledAttributes.getDimensionPixelSize(11, -1);
        this.u = obtainStyledAttributes.getInt(12, 600);
        setContentScrim(obtainStyledAttributes.getDrawable(8));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(9));
        this.f = obtainStyledAttributes.getResourceId(10, -1);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: android.support.design.widget.CollapsingToolbarLayout.1
            @Override // android.support.v4.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
                WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(collapsingToolbarLayout) ? windowInsetsCompat : null;
                if (!ObjectsCompat.equals(collapsingToolbarLayout.d, windowInsetsCompat2)) {
                    collapsingToolbarLayout.d = windowInsetsCompat2;
                    collapsingToolbarLayout.requestLayout();
                }
                return windowInsetsCompat.consumeSystemWindowInsets();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            ViewCompat.setFitsSystemWindows(this, ViewCompat.getFitsSystemWindows((View) parent));
            if (this.w == null) {
                this.w = new a();
            }
            ((AppBarLayout) parent).a(this.w);
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        if (this.w != null && (parent instanceof AppBarLayout)) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            AppBarLayout.a aVar = this.w;
            if (appBarLayout.d != null && aVar != null) {
                appBarLayout.d.remove(aVar);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        b();
        if (this.g == null && this.q != null && this.r > 0) {
            this.q.mutate().setAlpha(this.r);
            this.q.draw(canvas);
        }
        if (this.o && this.p) {
            this.a.a(canvas);
        }
        if (this.b == null || this.r <= 0) {
            return;
        }
        int systemWindowInsetTop = this.d != null ? this.d.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.b.setBounds(0, -this.c, getWidth(), systemWindowInsetTop - this.c);
            this.b.mutate().setAlpha(this.r);
            this.b.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001c, code lost:
        r0 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.q
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L33
            int r0 = r4.r
            if (r0 <= 0) goto L33
            android.view.View r0 = r4.h
            if (r0 == 0) goto L18
            android.view.View r0 = r4.h
            if (r0 != r4) goto L13
            goto L18
        L13:
            android.view.View r0 = r4.h
            if (r6 != r0) goto L1e
            goto L1c
        L18:
            android.support.v7.widget.Toolbar r0 = r4.g
            if (r6 != r0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r4.q
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r4.r
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r4.q
            r0.draw(r5)
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            boolean r5 = super.drawChild(r5, r6, r7)
            if (r5 != 0) goto L3e
            if (r0 == 0) goto L3d
            goto L3e
        L3d:
            return r2
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.q != null) {
            this.q.setBounds(0, 0, i, i2);
        }
    }

    private void b() {
        if (this.e) {
            Toolbar toolbar = null;
            this.g = null;
            this.h = null;
            if (this.f != -1) {
                this.g = (Toolbar) findViewById(this.f);
                if (this.g != null) {
                    this.h = c(this.g);
                }
            }
            if (this.g == null) {
                int childCount = getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i++;
                }
                this.g = toolbar;
            }
            c();
            this.e = false;
        }
    }

    private View c(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    private void c() {
        if (!this.o && this.i != null) {
            ViewParent parent = this.i.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.i);
            }
        }
        if (!this.o || this.g == null) {
            return;
        }
        if (this.i == null) {
            this.i = new View(getContext());
        }
        if (this.i.getParent() == null) {
            this.g.addView(this.i, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        b();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int systemWindowInsetTop = this.d != null ? this.d.getSystemWindowInsetTop() : 0;
        if (mode != 0 || systemWindowInsetTop <= 0) {
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + systemWindowInsetTop, 1073741824));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int titleMarginStart;
        int titleMarginEnd;
        super.onLayout(z, i, i2, i3, i4);
        if (this.d != null) {
            int systemWindowInsetTop = this.d.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!ViewCompat.getFitsSystemWindows(childAt) && childAt.getTop() < systemWindowInsetTop) {
                    ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        if (this.o && this.i != null) {
            this.p = ViewCompat.isAttachedToWindow(this.i) && this.i.getVisibility() == 0;
            if (this.p) {
                boolean z2 = ViewCompat.getLayoutDirection(this) == 1;
                int b = b(this.h != null ? this.h : this.g);
                o.a(this, this.i, this.n);
                d dVar = this.a;
                int i6 = this.n.left;
                if (z2) {
                    titleMarginStart = this.g.getTitleMarginEnd();
                } else {
                    titleMarginStart = this.g.getTitleMarginStart();
                }
                int i7 = i6 + titleMarginStart;
                int titleMarginTop = this.n.top + b + this.g.getTitleMarginTop();
                int i8 = this.n.right;
                if (z2) {
                    titleMarginEnd = this.g.getTitleMarginStart();
                } else {
                    titleMarginEnd = this.g.getTitleMarginEnd();
                }
                dVar.b(i7, titleMarginTop, i8 + titleMarginEnd, (this.n.bottom + b) - this.g.getTitleMarginBottom());
                this.a.a(z2 ? this.l : this.j, this.n.top + this.k, (i3 - i) - (z2 ? this.j : this.l), (i4 - i2) - this.m);
                this.a.b();
            }
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            a(getChildAt(i9)).a();
        }
        if (this.g != null) {
            if (this.o && TextUtils.isEmpty(this.a.i)) {
                this.a.a(this.g.getTitle());
            }
            if (this.h == null || this.h == this) {
                setMinimumHeight(d(this.g));
            } else {
                setMinimumHeight(d(this.h));
            }
        }
        a();
    }

    private static int d(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getHeight();
    }

    static p a(View view) {
        p pVar = (p) view.getTag(R.id.view_offset_helper);
        if (pVar == null) {
            p pVar2 = new p(view);
            view.setTag(R.id.view_offset_helper, pVar2);
            return pVar2;
        }
        return pVar;
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.a.a(charSequence);
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.o) {
            return this.a.i;
        }
        return null;
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            c();
            requestLayout();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2 = ViewCompat.isLaidOut(this) && !isInEditMode();
        if (this.s != z) {
            if (!z2) {
                setScrimAlpha(z ? 255 : 0);
            } else {
                int i = z ? 255 : 0;
                b();
                if (this.t == null) {
                    this.t = new ValueAnimator();
                    this.t.setDuration(this.u);
                    this.t.setInterpolator(i > this.r ? android.support.design.widget.a.c : android.support.design.widget.a.d);
                    this.t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.CollapsingToolbarLayout.2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    });
                } else if (this.t.isRunning()) {
                    this.t.cancel();
                }
                this.t.setIntValues(this.r, i);
                this.t.start();
            }
            this.s = z;
        }
    }

    void setScrimAlpha(int i) {
        if (i != this.r) {
            if (this.q != null && this.g != null) {
                ViewCompat.postInvalidateOnAnimation(this.g);
            }
            this.r = i;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    int getScrimAlpha() {
        return this.r;
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        if (this.q != drawable) {
            if (this.q != null) {
                this.q.setCallback(null);
            }
            this.q = drawable != null ? drawable.mutate() : null;
            if (this.q != null) {
                this.q.setBounds(0, 0, getWidth(), getHeight());
                this.q.setCallback(this);
                this.q.setAlpha(this.r);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@DrawableRes int i) {
        setContentScrim(ContextCompat.getDrawable(getContext(), i));
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.q;
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        if (this.b != drawable) {
            if (this.b != null) {
                this.b.setCallback(null);
            }
            this.b = drawable != null ? drawable.mutate() : null;
            if (this.b != null) {
                if (this.b.isStateful()) {
                    this.b.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.b, ViewCompat.getLayoutDirection(this));
                this.b.setVisible(getVisibility() == 0, false);
                this.b.setCallback(this);
                this.b.setAlpha(this.r);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (this.a != null) {
            z |= this.a.a(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q || drawable == this.b;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.b != null && this.b.isVisible() != z) {
            this.b.setVisible(z, false);
        }
        if (this.q == null || this.q.isVisible() == z) {
            return;
        }
        this.q.setVisible(z, false);
    }

    public void setStatusBarScrimColor(@ColorInt int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@DrawableRes int i) {
        setStatusBarScrim(ContextCompat.getDrawable(getContext(), i));
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.b;
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        this.a.c(i);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.a.a(colorStateList);
    }

    public void setCollapsedTitleGravity(int i) {
        this.a.b(i);
    }

    public int getCollapsedTitleGravity() {
        return this.a.c;
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        this.a.d(i);
    }

    public void setExpandedTitleColor(@ColorInt int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.a.b(colorStateList);
    }

    public void setExpandedTitleGravity(int i) {
        this.a.a(i);
    }

    public int getExpandedTitleGravity() {
        return this.a.b;
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        d dVar = this.a;
        if (d.a(dVar.g, typeface)) {
            dVar.g = typeface;
            dVar.b();
        }
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.a.a();
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        d dVar = this.a;
        if (d.a(dVar.h, typeface)) {
            dVar.h = typeface;
            dVar.b();
        }
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        d dVar = this.a;
        return dVar.h != null ? dVar.h : Typeface.DEFAULT;
    }

    public int getExpandedTitleMarginStart() {
        return this.j;
    }

    public void setExpandedTitleMarginStart(int i) {
        this.j = i;
        requestLayout();
    }

    public int getExpandedTitleMarginTop() {
        return this.k;
    }

    public void setExpandedTitleMarginTop(int i) {
        this.k = i;
        requestLayout();
    }

    public int getExpandedTitleMarginEnd() {
        return this.l;
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.l = i;
        requestLayout();
    }

    public int getExpandedTitleMarginBottom() {
        return this.m;
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.m = i;
        requestLayout();
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i) {
        if (this.v != i) {
            this.v = i;
            a();
        }
    }

    public int getScrimVisibleHeightTrigger() {
        if (this.v >= 0) {
            return this.v;
        }
        int systemWindowInsetTop = this.d != null ? this.d.getSystemWindowInsetTop() : 0;
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight > 0) {
            return Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight());
        }
        return getHeight() / 3;
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j) {
        this.u = j;
    }

    public long getScrimAnimationDuration() {
        return this.u;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    private static LayoutParams d() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams {
        int a;
        float b;

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        @interface CollapseMode {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            this.b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_collapseMode, R.attr.layout_collapseParallaxMultiplier});
            this.a = obtainStyledAttributes.getInt(0, 0);
            this.b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(-1, -1);
            this.a = 0;
            this.b = 0.5f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
            this.b = 0.5f;
        }
    }

    final void a() {
        if (this.q == null && this.b == null) {
            return;
        }
        setScrimsShown(getHeight() + this.c < getScrimVisibleHeightTrigger());
    }

    final int b(View view) {
        return ((getHeight() - a(view).a) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a implements AppBarLayout.a {
        a() {
        }

        @Override // android.support.design.widget.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout.this.c = i;
            int systemWindowInsetTop = CollapsingToolbarLayout.this.d != null ? CollapsingToolbarLayout.this.d.getSystemWindowInsetTop() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                p a = CollapsingToolbarLayout.a(childAt);
                switch (layoutParams.a) {
                    case 1:
                        a.a(MathUtils.clamp(-i, 0, CollapsingToolbarLayout.this.b(childAt)));
                        break;
                    case 2:
                        a.a(Math.round((-i) * layoutParams.b));
                        break;
                }
            }
            CollapsingToolbarLayout.this.a();
            if (CollapsingToolbarLayout.this.b != null && systemWindowInsetTop > 0) {
                ViewCompat.postInvalidateOnAnimation(CollapsingToolbarLayout.this);
            }
            CollapsingToolbarLayout.this.a.a(Math.abs(i) / ((CollapsingToolbarLayout.this.getHeight() - ViewCompat.getMinimumHeight(CollapsingToolbarLayout.this)) - systemWindowInsetTop));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }
}
