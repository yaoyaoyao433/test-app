package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.constraint.R;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.math.MathUtils;
import android.support.v4.util.ObjectsCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@CoordinatorLayout.DefaultBehavior(Behavior.class)
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout {
    boolean a;
    int b;
    WindowInsetsCompat c;
    List<a> d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private int[] j;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(AppBarLayout appBarLayout, int i);
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return b();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return b();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.b = 0;
        setOrientation(1);
        n.a(context);
        if (Build.VERSION.SDK_INT >= 21) {
            r.a(this);
            r.a(this, attributeSet, 0, 2131559080);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842964, 16843919, 16844096, R.attr.elevation, R.attr.expanded}, 0, 2131559080);
        ViewCompat.setBackground(this, obtainStyledAttributes.getDrawable(0));
        if (obtainStyledAttributes.hasValue(4)) {
            a(obtainStyledAttributes.getBoolean(4, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && obtainStyledAttributes.hasValue(3)) {
            r.a(this, obtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (obtainStyledAttributes.hasValue(2)) {
                setKeyboardNavigationCluster(obtainStyledAttributes.getBoolean(2, false));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                setTouchscreenBlocksFocus(obtainStyledAttributes.getBoolean(1, false));
            }
        }
        obtainStyledAttributes.recycle();
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: android.support.design.widget.AppBarLayout.1
            @Override // android.support.v4.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                AppBarLayout appBarLayout = AppBarLayout.this;
                WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(appBarLayout) ? windowInsetsCompat : null;
                if (!ObjectsCompat.equals(appBarLayout.c, windowInsetsCompat2)) {
                    appBarLayout.c = windowInsetsCompat2;
                    appBarLayout.a();
                }
                return windowInsetsCompat;
            }
        });
    }

    public final void a(a aVar) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (aVar == null || this.d.contains(aVar)) {
            return;
        }
        this.d.add(aVar);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
        boolean z2 = false;
        this.a = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).b != null) {
                this.a = true;
                break;
            } else {
                i5++;
            }
        }
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
            if ((layoutParams.a & 1) == 1 && (layoutParams.a & 10) != 0) {
                z2 = true;
                break;
            }
            i6++;
        }
        if (this.h != z2) {
            this.h = z2;
            refreshDrawableState();
        }
    }

    void a() {
        this.e = -1;
        this.f = -1;
        this.g = -1;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setExpanded(boolean z) {
        a(z, ViewCompat.isLaidOut(this), true);
    }

    public void a(boolean z, boolean z2, boolean z3) {
        this.b = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    private static LayoutParams b() {
        return new LayoutParams(-1, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private static LayoutParams a(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public final int getTotalScrollRange() {
        if (this.e != -1) {
            return this.e;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = layoutParams.a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((i3 & 2) != 0) {
                i2 -= ViewCompat.getMinimumHeight(childAt);
                break;
            }
            i++;
        }
        int max = Math.max(0, i2 - getTopInset());
        this.e = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    int getDownNestedPreScrollRange() {
        if (this.f != -1) {
            return this.f;
        }
        int i = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = layoutParams.a;
            if ((i2 & 5) != 5) {
                if (i > 0) {
                    break;
                }
            } else {
                int i3 = i + layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i2 & 8) != 0) {
                    i = i3 + ViewCompat.getMinimumHeight(childAt);
                } else if ((i2 & 2) != 0) {
                    i = i3 + (measuredHeight - ViewCompat.getMinimumHeight(childAt));
                } else {
                    i = i3 + (measuredHeight - getTopInset());
                }
            }
        }
        int max = Math.max(0, i);
        this.f = max;
        return max;
    }

    int getDownNestedScrollRange() {
        if (this.g != -1) {
            return this.g;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i3 = layoutParams.a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i3 & 2) != 0) {
                i2 -= ViewCompat.getMinimumHeight(childAt) + getTopInset();
                break;
            }
            i++;
        }
        int max = Math.max(0, i2);
        this.g = max;
        return max;
    }

    final void a(int i) {
        if (this.d != null) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.d.get(i2);
                if (aVar != null) {
                    aVar.a(this, i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight != 0) {
            return (minimumHeight * 2) + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount > 0 ? ViewCompat.getMinimumHeight(getChildAt(childCount - 1)) : 0;
        return minimumHeight2 != 0 ? (minimumHeight2 * 2) + topInset : getHeight() / 3;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.j == null) {
            this.j = new int[2];
        }
        int[] iArr = this.j;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.h ? R.attr.state_collapsible : -2130772280;
        iArr[1] = (this.h && this.i) ? R.attr.state_collapsed : -2130772279;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    final boolean a(boolean z) {
        if (this.i != z) {
            this.i = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            r.a(this, f);
        }
    }

    int getPendingAction() {
        return this.b;
    }

    @VisibleForTesting
    final int getTopInset() {
        if (this.c != null) {
            return this.c.getSystemWindowInsetTop();
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        public int a;
        Interpolator b;

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator});
            this.a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(-1, -2);
            this.a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class Behavior extends HeaderBehavior<AppBarLayout> {
        private int b;
        private ValueAnimator c;
        private int d;
        private boolean e;
        private float f;
        private WeakReference<View> g;
        private a h;

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract boolean a(@NonNull AppBarLayout appBarLayout);
        }

        private static boolean a(int i, int i2) {
            return (i & i2) == i2;
        }

        @Override // android.support.design.widget.HeaderBehavior
        final /* synthetic */ int a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int i4;
            List b;
            int i5;
            AppBarLayout appBarLayout2 = appBarLayout;
            int a2 = a();
            if (i2 != 0 && a2 >= i2 && a2 <= i3) {
                int clamp = MathUtils.clamp(i, i2, i3);
                if (a2 != clamp) {
                    if (appBarLayout2.a) {
                        int abs = Math.abs(clamp);
                        int childCount = appBarLayout2.getChildCount();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout2.getChildAt(i6);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator interpolator = layoutParams.b;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i6++;
                            } else if (interpolator != null) {
                                int i7 = layoutParams.a;
                                if ((i7 & 1) != 0) {
                                    int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
                                    i5 = (i7 & 2) != 0 ? height - ViewCompat.getMinimumHeight(childAt) : height;
                                } else {
                                    i5 = 0;
                                }
                                if (ViewCompat.getFitsSystemWindows(childAt)) {
                                    i5 -= appBarLayout2.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = Integer.signum(clamp) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                }
                            }
                        }
                    }
                    i4 = clamp;
                    boolean a3 = super.a(i4);
                    int i8 = a2 - clamp;
                    this.b = clamp - i4;
                    if (!a3 && appBarLayout2.a && (b = coordinatorLayout.e.b(appBarLayout2)) != null && !b.isEmpty()) {
                        for (int i9 = 0; i9 < b.size(); i9++) {
                            View view = (View) b.get(i9);
                            CoordinatorLayout.a aVar = ((CoordinatorLayout.c) view.getLayoutParams()).a;
                            if (aVar != null) {
                                aVar.onDependentViewChanged(coordinatorLayout, view, appBarLayout2);
                            }
                        }
                    }
                    appBarLayout2.a(super.b());
                    a(coordinatorLayout, appBarLayout2, clamp, clamp < a2 ? -1 : 1, false);
                    return i8;
                }
            } else {
                this.b = 0;
            }
            return 0;
        }

        @Override // android.support.design.widget.HeaderBehavior
        final /* synthetic */ int a(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        @Override // android.support.design.widget.ViewOffsetBehavior
        public final /* bridge */ /* synthetic */ boolean a(int i) {
            return super.a(i);
        }

        @Override // android.support.design.widget.ViewOffsetBehavior
        public final /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        @Override // android.support.design.widget.HeaderBehavior
        final /* synthetic */ int b(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        @Override // android.support.design.widget.HeaderBehavior
        final /* synthetic */ boolean c(AppBarLayout appBarLayout) {
            AppBarLayout appBarLayout2 = appBarLayout;
            if (this.h != null) {
                return this.h.a(appBarLayout2);
            }
            if (this.g != null) {
                View view = this.g.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        @Override // android.support.design.widget.ViewOffsetBehavior, android.support.design.widget.CoordinatorLayout.a
        public /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            if (this.d >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(this.d);
                int i2 = -childAt.getBottom();
                if (this.e) {
                    round = i2 + ViewCompat.getMinimumHeight(childAt) + appBarLayout.getTopInset();
                } else {
                    round = i2 + Math.round(childAt.getHeight() * this.f);
                }
                a_(coordinatorLayout, appBarLayout, round);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        a(coordinatorLayout, appBarLayout, i3, 0.0f);
                    } else {
                        a_(coordinatorLayout, appBarLayout, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.b = 0;
            this.d = -1;
            super.a(MathUtils.clamp(super.b(), -appBarLayout.getTotalScrollRange(), 0));
            a(coordinatorLayout, appBarLayout, super.b(), 0, true);
            appBarLayout.a(super.b());
            return onLayoutChild;
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.c) appBarLayout.getLayoutParams()).height == -2) {
                coordinatorLayout.a(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, savedState.getSuperState());
                this.d = savedState.a;
                this.f = savedState.b;
                this.e = savedState.c;
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
            this.d = -1;
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            int b = super.b();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(onSaveInstanceState);
                    savedState.a = i;
                    savedState.c = bottom == ViewCompat.getMinimumHeight(childAt) + appBarLayout.getTopInset();
                    savedState.b = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return onSaveInstanceState;
        }

        public Behavior() {
            this.d = -1;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.d = -1;
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        /* renamed from: a */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -appBarLayout.getTotalScrollRange();
                    i4 = i6;
                    i5 = appBarLayout.getDownNestedPreScrollRange() + i6;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = b(coordinatorLayout, appBarLayout, i2, i4, i5);
                }
            }
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        /* renamed from: a */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                b(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        /* renamed from: a */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (i == 0) {
                a(coordinatorLayout, appBarLayout);
            }
            this.g = new WeakReference<>(view);
        }

        private void a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i, float f) {
            int height;
            int abs = Math.abs(a() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int a2 = a();
            if (a2 == i) {
                if (this.c == null || !this.c.isRunning()) {
                    return;
                }
                this.c.cancel();
                return;
            }
            if (this.c == null) {
                this.c = new ValueAnimator();
                this.c.setInterpolator(android.support.design.widget.a.e);
                this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.AppBarLayout.Behavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Behavior.this.a_(coordinatorLayout, appBarLayout, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                this.c.cancel();
            }
            this.c.setDuration(Math.min(height, 600));
            this.c.setIntValues(a2, i);
            this.c.start();
        }

        private static int a(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -i;
                if (childAt.getTop() <= i3 && childAt.getBottom() >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.support.design.widget.HeaderBehavior
        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int a2 = a();
            int a3 = a(appBarLayout, a2);
            if (a3 >= 0) {
                View childAt = appBarLayout.getChildAt(a3);
                int i = ((LayoutParams) childAt.getLayoutParams()).a;
                if ((i & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (a3 == appBarLayout.getChildCount() - 1) {
                        i3 += appBarLayout.getTopInset();
                    }
                    if (a(i, 2)) {
                        i3 += ViewCompat.getMinimumHeight(childAt);
                    } else if (a(i, 5)) {
                        int minimumHeight = ViewCompat.getMinimumHeight(childAt) + i3;
                        if (a2 < minimumHeight) {
                            i2 = minimumHeight;
                        } else {
                            i3 = minimumHeight;
                        }
                    }
                    if (a2 < (i3 + i2) / 2) {
                        i2 = i3;
                    }
                    a(coordinatorLayout, appBarLayout, MathUtils.clamp(i2, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View b = b(appBarLayout, i);
            if (b != null) {
                int i3 = ((LayoutParams) b.getLayoutParams()).a;
                boolean z2 = false;
                if ((i3 & 1) != 0) {
                    int minimumHeight = ViewCompat.getMinimumHeight(b);
                    if (i2 <= 0 || (i3 & 12) == 0 ? !((i3 & 2) == 0 || (-i) < (b.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i) >= (b.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
                boolean a2 = appBarLayout.a(z2);
                if (Build.VERSION.SDK_INT >= 11) {
                    if (z || (a2 && b(coordinatorLayout, appBarLayout))) {
                        appBarLayout.jumpDrawablesToCurrentState();
                    }
                }
            }
        }

        private static boolean b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List<View> b = coordinatorLayout.b(appBarLayout);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.a aVar = ((CoordinatorLayout.c) b.get(i).getLayoutParams()).a;
                if (aVar instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) aVar).d != 0;
                }
            }
            return false;
        }

        private static View b(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.design.widget.AppBarLayout.Behavior.SavedState.1
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new SavedState[i];
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            };
            int a;
            float b;
            boolean c;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.a = parcel.readInt();
                this.b = parcel.readFloat();
                this.c = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.a);
                parcel.writeFloat(this.b);
                parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
            if ((r1.getHeight() - r3.getHeight()) <= r2.getHeight()) goto L9;
         */
        @Override // android.support.design.widget.CoordinatorLayout.a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onStartNestedScroll(android.support.design.widget.CoordinatorLayout r1, android.support.design.widget.AppBarLayout r2, android.view.View r3, android.view.View r4, int r5, int r6) {
            /*
                r0 = this;
                r4 = r5 & 2
                r5 = 1
                r6 = 0
                if (r4 == 0) goto L21
                int r4 = r2.getTotalScrollRange()
                if (r4 == 0) goto Le
                r4 = 1
                goto Lf
            Le:
                r4 = 0
            Lf:
                if (r4 == 0) goto L21
                int r1 = r1.getHeight()
                int r3 = r3.getHeight()
                int r1 = r1 - r3
                int r2 = r2.getHeight()
                if (r1 > r2) goto L21
                goto L22
            L21:
                r5 = 0
            L22:
                if (r5 == 0) goto L2d
                android.animation.ValueAnimator r1 = r0.c
                if (r1 == 0) goto L2d
                android.animation.ValueAnimator r1 = r0.c
                r1.cancel()
            L2d:
                r1 = 0
                r0.g = r1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.Behavior.onStartNestedScroll(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }

        @Override // android.support.design.widget.HeaderBehavior
        final int a() {
            return super.b() + this.b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        @Override // android.support.design.widget.HeaderScrollingViewBehavior
        final /* synthetic */ View a(List list) {
            return b(list);
        }

        @Override // android.support.design.widget.ViewOffsetBehavior
        public final /* bridge */ /* synthetic */ boolean a(int i) {
            return super.a(i);
        }

        @Override // android.support.design.widget.ViewOffsetBehavior
        public final /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        @Override // android.support.design.widget.ViewOffsetBehavior, android.support.design.widget.CoordinatorLayout.a
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        @Override // android.support.design.widget.HeaderScrollingViewBehavior, android.support.design.widget.CoordinatorLayout.a
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.behavior_overlapTop});
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = b(coordinatorLayout.a(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b.a(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // android.support.design.widget.HeaderScrollingViewBehavior
        final float a(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.a aVar = ((CoordinatorLayout.c) appBarLayout.getLayoutParams()).a;
                int a = aVar instanceof Behavior ? ((Behavior) aVar).a() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (a / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static AppBarLayout b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // android.support.design.widget.HeaderScrollingViewBehavior
        public final int b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.b(view);
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.a aVar = ((CoordinatorLayout.c) view2.getLayoutParams()).a;
            if (aVar instanceof Behavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((Behavior) aVar).b) + ((HeaderScrollingViewBehavior) this).c) - c(view2));
                return false;
            }
            return false;
        }
    }
}
