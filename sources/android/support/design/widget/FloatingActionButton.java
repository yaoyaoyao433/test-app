package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.g;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
/* compiled from: ProGuard */
@CoordinatorLayout.DefaultBehavior(Behavior.class)
/* loaded from: classes.dex */
public class FloatingActionButton extends VisibilityAwareImageButton {
    int a;
    boolean b;
    final Rect c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final Rect j;
    private android.support.v7.widget.h k;
    private g l;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface Size {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class a {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.support.design.widget.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.j = new Rect();
        n.a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.borderWidth, R.attr.elevation, R.attr.rippleColor, R.attr.fabSize, R.attr.pressedTranslationZ, R.attr.useCompatPadding, R.attr.backgroundTint, R.attr.backgroundTintMode}, i, 2131559085);
        this.d = obtainStyledAttributes.getColorStateList(6);
        this.e = q.a(obtainStyledAttributes.getInt(7, -1), null);
        this.g = obtainStyledAttributes.getColor(2, 0);
        this.h = obtainStyledAttributes.getInt(3, -1);
        this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        this.b = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        this.k = new android.support.v7.widget.h(this);
        this.k.a(attributeSet, i);
        this.i = (int) getResources().getDimension(R.dimen.design_fab_image_size);
        getImpl().a(this.d, this.e, this.g, this.f);
        getImpl().a(dimension);
        g impl = getImpl();
        if (impl.j != dimension2) {
            impl.j = dimension2;
            impl.a(impl.i, dimension2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.a = (sizeDimension - this.i) / 2;
        getImpl().d();
        int min = Math.min(a(sizeDimension, i), a(sizeDimension, i2));
        setMeasuredDimension(this.c.left + min + this.c.right, min + this.c.top + this.c.bottom);
    }

    @ColorInt
    public int getRippleColor() {
        return this.g;
    }

    public void setRippleColor(@ColorInt int i) {
        if (this.g != i) {
            this.g = i;
            getImpl().a(i);
        }
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.d;
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            g impl = getImpl();
            if (impl.e != null) {
                DrawableCompat.setTintList(impl.e, colorStateList);
            }
            if (impl.g != null) {
                impl.g.a(colorStateList);
            }
        }
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.e;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            g impl = getImpl();
            if (impl.e != null) {
                DrawableCompat.setTintMode(impl.e, mode);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        this.k.a(i);
    }

    final void a(a aVar, boolean z) {
        final g impl = getImpl();
        final g.c a2 = a(aVar);
        boolean z2 = true;
        if (impl.o.getVisibility() == 0 ? impl.b == 1 : impl.b != 2) {
            z2 = false;
        }
        if (z2) {
            return;
        }
        impl.o.animate().cancel();
        if (impl.i()) {
            impl.b = 2;
            if (impl.o.getVisibility() != 0) {
                impl.o.setAlpha(0.0f);
                impl.o.setScaleY(0.0f);
                impl.o.setScaleX(0.0f);
            }
            impl.o.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200L).setInterpolator(android.support.design.widget.a.d).setListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.g.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    impl.o.a(0, r2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    impl.b = 0;
                }
            });
            return;
        }
        impl.o.a(0, false);
        impl.o.setAlpha(1.0f);
        impl.o.setScaleY(1.0f);
        impl.o.setScaleX(1.0f);
    }

    final void b(@Nullable a aVar, boolean z) {
        final g impl = getImpl();
        final g.c a2 = a(aVar);
        if (impl.o.getVisibility() != 0 ? impl.b != 2 : impl.b == 1) {
            return;
        }
        impl.o.animate().cancel();
        if (impl.i()) {
            impl.b = 1;
            impl.o.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200L).setInterpolator(android.support.design.widget.a.c).setListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.g.1
                private boolean d;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    impl.o.a(0, r2);
                    this.d = false;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.d = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    impl.b = 0;
                    if (this.d) {
                        return;
                    }
                    impl.o.a(r2 ? 8 : 4, r2);
                }
            });
            return;
        }
        impl.o.a(4, false);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.b != z) {
            this.b = z;
            getImpl().c();
        }
    }

    public boolean getUseCompatPadding() {
        return this.b;
    }

    public void setSize(int i) {
        if (i != this.h) {
            this.h = i;
            requestLayout();
        }
    }

    public int getSize() {
        return this.h;
    }

    @Nullable
    private g.c a(@Nullable final a aVar) {
        if (aVar == null) {
            return null;
        }
        return new g.c() { // from class: android.support.design.widget.FloatingActionButton.1
        };
    }

    int getSizeDimension() {
        return a(this.h);
    }

    private int a(int i) {
        while (true) {
            Resources resources = getResources();
            if (i != -1) {
                if (i == 1) {
                    return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
                }
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                return a(1);
            } else {
                i = 0;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final g impl = getImpl();
        if (impl.e()) {
            if (impl.q == null) {
                impl.q = new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.design.widget.g.3
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        g gVar = impl;
                        float rotation = gVar.o.getRotation();
                        if (gVar.d != rotation) {
                            gVar.d = rotation;
                            if (Build.VERSION.SDK_INT == 19) {
                                if (gVar.d % 90.0f != 0.0f) {
                                    if (gVar.o.getLayerType() != 1) {
                                        gVar.o.setLayerType(1, null);
                                    }
                                } else if (gVar.o.getLayerType() != 0) {
                                    gVar.o.setLayerType(0, null);
                                }
                            }
                            if (gVar.c != null) {
                                i iVar = gVar.c;
                                float f = -gVar.d;
                                if (iVar.l != f) {
                                    iVar.l = f;
                                    iVar.invalidateSelf();
                                }
                            }
                            if (gVar.g != null) {
                                android.support.design.widget.b bVar = gVar.g;
                                float f2 = -gVar.d;
                                if (f2 != bVar.e) {
                                    bVar.e = f2;
                                    bVar.invalidateSelf();
                                }
                            }
                        }
                        return true;
                    }
                };
            }
            impl.o.getViewTreeObserver().addOnPreDrawListener(impl.q);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g impl = getImpl();
        if (impl.q != null) {
            impl.o.getViewTreeObserver().removeOnPreDrawListener(impl.q);
            impl.q = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().a(getDrawableState());
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().b();
    }

    @NonNull
    public Drawable getContentBackground() {
        return getImpl().h;
    }

    private static int a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return (mode == 0 || mode != 1073741824) ? i : size;
        }
        return Math.min(i, size);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.j;
            if (ViewCompat.isLaidOut(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                rect.left += this.c.left;
                rect.top += this.c.top;
                rect.right -= this.c.right;
                rect.bottom -= this.c.bottom;
                z = true;
            } else {
                z = false;
            }
            if (z && !this.j.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class Behavior extends CoordinatorLayout.a<FloatingActionButton> {
        private Rect a;
        private a b;
        private boolean c;

        @Override // android.support.design.widget.CoordinatorLayout.a
        public /* synthetic */ boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            FloatingActionButton floatingActionButton2 = floatingActionButton;
            Rect rect2 = floatingActionButton2.c;
            rect.set(floatingActionButton2.getLeft() + rect2.left, floatingActionButton2.getTop() + rect2.top, floatingActionButton2.getRight() - rect2.right, floatingActionButton2.getBottom() - rect2.bottom);
            return true;
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            FloatingActionButton floatingActionButton2 = floatingActionButton;
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton2);
                return false;
            } else if (a(view)) {
                b(view, floatingActionButton2);
                return false;
            } else {
                return false;
            }
        }

        public Behavior() {
            this.c = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.behavior_autoHide});
            this.c = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.c cVar) {
            if (cVar.h == 0) {
                cVar.h = 80;
            }
        }

        private static boolean a(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.c) {
                return ((CoordinatorLayout.c) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            return this.c && ((CoordinatorLayout.c) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (a(appBarLayout, floatingActionButton)) {
                if (this.a == null) {
                    this.a = new Rect();
                }
                Rect rect = this.a;
                o.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.b(this.b, false);
                    return true;
                }
                floatingActionButton.a(this.b, false);
                return true;
            }
            return false;
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            if (a(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.c) floatingActionButton.getLayoutParams()).topMargin) {
                    floatingActionButton.b(this.b, false);
                    return true;
                }
                floatingActionButton.a(this.b, false);
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.support.design.widget.CoordinatorLayout.a
        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            List<View> a = coordinatorLayout.a(floatingActionButton);
            int size = a.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view = a.get(i4);
                if (view instanceof AppBarLayout) {
                    if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (a(view) && b(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.a(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.c cVar = (CoordinatorLayout.c) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - cVar.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= cVar.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - cVar.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= cVar.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                ViewCompat.offsetTopAndBottom(floatingActionButton, i3);
            }
            if (i2 != 0) {
                ViewCompat.offsetLeftAndRight(floatingActionButton, i2);
                return true;
            }
            return true;
        }
    }

    public float getCompatElevation() {
        return getImpl().a();
    }

    public void setCompatElevation(float f) {
        getImpl().a(f);
    }

    private g getImpl() {
        g gVar;
        if (this.l == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                gVar = new h(this, new b());
            } else {
                gVar = new g(this, new b());
            }
            this.l = gVar;
        }
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements j {
        b() {
        }

        @Override // android.support.design.widget.j
        public final float a() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }

        @Override // android.support.design.widget.j
        public final void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.c.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.a, i2 + FloatingActionButton.this.a, i3 + FloatingActionButton.this.a, i4 + FloatingActionButton.this.a);
        }

        @Override // android.support.design.widget.j
        public final void a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        @Override // android.support.design.widget.j
        public final boolean b() {
            return FloatingActionButton.this.b;
        }
    }
}
