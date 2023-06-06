package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.j;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements NestedScrollingParent, t {
    static final int[] f = {R.attr.actionBarSize, 16842841};
    private final Runnable A;
    private final Runnable B;
    private final NestedScrollingParentHelper C;
    ActionBarContainer a;
    public boolean b;
    boolean c;
    ViewPropertyAnimator d;
    final AnimatorListenerAdapter e;
    private int g;
    private int h;
    private ContentFrameLayout i;
    private u j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private a x;
    private final int y;
    private OverScroller z;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void d(int i);

        void g(boolean z);

        void k();

        void l();

        void m();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 0;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.y = 600;
        this.e = new AnimatorListenerAdapter() { // from class: android.support.v7.widget.ActionBarOverlayLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.d = null;
                ActionBarOverlayLayout.this.c = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.d = null;
                ActionBarOverlayLayout.this.c = false;
            }
        };
        this.A = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.2
            @Override // java.lang.Runnable
            public final void run() {
                ActionBarOverlayLayout.this.a();
                ActionBarOverlayLayout.this.d = ActionBarOverlayLayout.this.a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.e);
            }
        };
        this.B = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.3
            @Override // java.lang.Runnable
            public final void run() {
                ActionBarOverlayLayout.this.a();
                ActionBarOverlayLayout.this.d = ActionBarOverlayLayout.this.a.animate().translationY(-ActionBarOverlayLayout.this.a.getHeight()).setListener(ActionBarOverlayLayout.this.e);
            }
        };
        a(context);
        this.C = new NestedScrollingParentHelper(this);
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f);
        this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.k = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.k == null);
        obtainStyledAttributes.recycle();
        this.l = context.getApplicationInfo().targetSdkVersion < 19;
        this.z = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public void setActionBarVisibilityCallback(a aVar) {
        this.x = aVar;
        if (getWindowToken() != null) {
            this.x.d(this.h);
            if (this.p != 0) {
                onWindowSystemUiVisibilityChanged(this.p);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.b = z;
        this.l = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        i();
        int i2 = this.p ^ i;
        this.p = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        if (this.x != null) {
            this.x.g(!z2);
            if (z || !z2) {
                this.x.k();
            } else {
                this.x.l();
            }
        }
        if ((i2 & 256) == 0 || this.x == null) {
            return;
        }
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.h = i;
        if (this.x != null) {
            this.x.d(i);
        }
    }

    private static boolean a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        b bVar = (b) view.getLayoutParams();
        if (bVar.leftMargin != rect.left) {
            bVar.leftMargin = rect.left;
            z5 = true;
        } else {
            z5 = false;
        }
        if (bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z5 = true;
        }
        if (bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || bVar.bottomMargin == rect.bottom) {
            return z5;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        i();
        ViewCompat.getWindowSystemUiVisibility(this);
        boolean a2 = a(this.a, rect, true, true, false, true);
        this.t.set(rect);
        bd.a(this, this.t, this.q);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            a2 = true;
        }
        if (!this.r.equals(this.q)) {
            this.r.set(this.q);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        i();
        measureChildWithMargins(this.a, i, 0, i2, 0);
        b bVar = (b) this.a.getLayoutParams();
        int max = Math.max(0, this.a.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, this.a.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.a.getMeasuredState());
        boolean z = (ViewCompat.getWindowSystemUiVisibility(this) & 256) != 0;
        if (z) {
            measuredHeight = this.g;
            if (this.m && this.a.getTabContainer() != null) {
                measuredHeight += this.g;
            }
        } else {
            measuredHeight = this.a.getVisibility() != 8 ? this.a.getMeasuredHeight() : 0;
        }
        this.s.set(this.q);
        this.v.set(this.t);
        if (!this.b && !z) {
            this.s.top += measuredHeight;
            this.s.bottom += 0;
        } else {
            this.v.top += measuredHeight;
            this.v.bottom += 0;
        }
        a(this.i, this.s, true, true, true, true);
        if (!this.w.equals(this.v)) {
            this.w.set(this.v);
            this.i.a(this.v);
        }
        measureChildWithMargins(this.i, i, 0, i2, 0);
        b bVar2 = (b) this.i.getLayoutParams();
        int max3 = Math.max(max, this.i.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, this.i.getMeasuredHeight() + bVar2.topMargin + bVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = bVar.leftMargin + paddingLeft;
                int i7 = bVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.k == null || this.l) {
            return;
        }
        int bottom = this.a.getVisibility() == 0 ? (int) (this.a.getBottom() + this.a.getTranslationY() + 0.5f) : 0;
        this.k.setBounds(0, bottom, getWidth(), this.k.getIntrinsicHeight() + bottom);
        this.k.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.a.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.C.onNestedScrollAccepted(view, view2, i);
        this.o = getActionBarHideOffset();
        a();
        if (this.x != null) {
            this.x.m();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.o += i2;
        setActionBarHideOffset(this.o);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        if (!this.n || this.c) {
            return;
        }
        if (this.o <= this.a.getHeight()) {
            a();
            postDelayed(this.A, 600L);
            return;
        }
        a();
        postDelayed(this.B, 600L);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (this.n && z) {
            this.z.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.z.getFinalY() > this.a.getHeight()) {
                a();
                this.B.run();
            } else {
                a();
                this.A.run();
            }
            this.c = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.support.v4.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.C.getNestedScrollAxes();
    }

    private void i() {
        if (this.i == null) {
            this.i = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.a = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.j = a(findViewById(R.id.action_bar));
        }
    }

    private static u a(View view) {
        if (view instanceof u) {
            return (u) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (z) {
                return;
            }
            a();
            setActionBarHideOffset(0);
        }
    }

    public int getActionBarHideOffset() {
        if (this.a != null) {
            return -((int) this.a.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int i) {
        a();
        this.a.setTranslationY(-Math.max(0, Math.min(i, this.a.getHeight())));
    }

    final void a() {
        removeCallbacks(this.A);
        removeCallbacks(this.B);
        if (this.d != null) {
            this.d.cancel();
        }
    }

    @Override // android.support.v7.widget.t
    public void setWindowCallback(Window.Callback callback) {
        i();
        this.j.a(callback);
    }

    @Override // android.support.v7.widget.t
    public void setWindowTitle(CharSequence charSequence) {
        i();
        this.j.a(charSequence);
    }

    public CharSequence getTitle() {
        i();
        return this.j.e();
    }

    @Override // android.support.v7.widget.t
    public final void a(int i) {
        i();
        if (i == 2 || i == 5 || i != 109) {
            return;
        }
        setOverlayMode(true);
    }

    public void setIcon(int i) {
        i();
        this.j.a(i);
    }

    public void setIcon(Drawable drawable) {
        i();
        this.j.a(drawable);
    }

    public void setLogo(int i) {
        i();
        this.j.b(i);
    }

    @Override // android.support.v7.widget.t
    public final boolean b() {
        i();
        return this.j.f();
    }

    @Override // android.support.v7.widget.t
    public final boolean c() {
        i();
        return this.j.g();
    }

    @Override // android.support.v7.widget.t
    public final boolean d() {
        i();
        return this.j.h();
    }

    @Override // android.support.v7.widget.t
    public final boolean e() {
        i();
        return this.j.i();
    }

    @Override // android.support.v7.widget.t
    public final boolean f() {
        i();
        return this.j.j();
    }

    @Override // android.support.v7.widget.t
    public final void g() {
        i();
        this.j.k();
    }

    @Override // android.support.v7.widget.t
    public final void a(Menu menu, j.a aVar) {
        i();
        this.j.a(menu, aVar);
    }

    @Override // android.support.v7.widget.t
    public final void h() {
        i();
        this.j.l();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i, int i2) {
            super(-1, -1);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-1, -1);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }
}
