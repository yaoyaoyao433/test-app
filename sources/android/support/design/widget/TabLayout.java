package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.util.Pools;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.ay;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
@ViewPager.DecorView
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    private static final Pools.Pool<d> n = new Pools.SynchronizedPool(16);
    private DataSetObserver A;
    private TabLayoutOnPageChangeListener B;
    private AdapterChangeListener C;
    private boolean D;
    private final Pools.Pool<e> E;
    int a;
    int b;
    int c;
    int d;
    int e;
    ColorStateList f;
    float g;
    float h;
    final int i;
    int j;
    int k;
    int l;
    ViewPager m;
    private final ArrayList<d> o;
    private d p;
    private final c q;
    private final int r;
    private final int s;
    private final int t;
    private int u;
    private a v;
    private final ArrayList<a> w;
    private a x;
    private ValueAnimator y;
    private PagerAdapter z;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface Mode {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface TabGravity {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(d dVar);

        void b(d dVar);

        void c(d dVar);
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new ArrayList<>();
        this.j = Integer.MAX_VALUE;
        this.w = new ArrayList<>();
        this.E = new Pools.SimplePool(12);
        n.a(context);
        setHorizontalScrollBarEnabled(false);
        this.q = new c(context);
        super.addView(this.q, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.tabTextColor, R.attr.tabSelectedTextColor, R.attr.tabIndicatorColor, R.attr.tabIndicatorHeight, R.attr.tabContentStart, R.attr.tabBackground, R.attr.tabMode, R.attr.tabGravity, R.attr.tabMinWidth, R.attr.tabMaxWidth, R.attr.tabTextAppearance, R.attr.tabPaddingStart, R.attr.tabPaddingTop, R.attr.tabPaddingEnd, R.attr.tabPaddingBottom, R.attr.tabPadding}, i, 2131558401);
        this.q.b(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        this.q.a(obtainStyledAttributes.getColor(2, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.b = dimensionPixelSize;
        this.a = dimensionPixelSize;
        this.a = obtainStyledAttributes.getDimensionPixelSize(11, this.a);
        this.b = obtainStyledAttributes.getDimensionPixelSize(12, this.b);
        this.c = obtainStyledAttributes.getDimensionPixelSize(13, this.c);
        this.d = obtainStyledAttributes.getDimensionPixelSize(14, this.d);
        this.e = obtainStyledAttributes.getResourceId(10, 2131558898);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.e, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.textAllCaps, R.attr.fontFamily});
        try {
            this.g = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(0)) {
                this.f = obtainStyledAttributes.getColorStateList(0);
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.f = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{obtainStyledAttributes.getColor(1, 0), this.f.getDefaultColor()});
            }
            this.r = obtainStyledAttributes.getDimensionPixelSize(8, -1);
            this.s = obtainStyledAttributes.getDimensionPixelSize(9, -1);
            this.i = obtainStyledAttributes.getResourceId(5, 0);
            this.u = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.l = obtainStyledAttributes.getInt(6, 1);
            this.k = obtainStyledAttributes.getInt(7, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.h = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.t = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            f();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.q.a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.q.b(i);
    }

    private void a(int i, float f2, boolean z) {
        a(i, 0.0f, true, true);
    }

    final void a(int i, float f2, boolean z, boolean z2) {
        int round = Math.round(i + f2);
        if (round < 0 || round >= this.q.getChildCount()) {
            return;
        }
        if (z2) {
            this.q.a(i, f2);
        }
        if (this.y != null && this.y.isRunning()) {
            this.y.cancel();
        }
        scrollTo(a(i, f2), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    private float getScrollPosition() {
        c cVar = this.q;
        return cVar.a + cVar.b;
    }

    public final void a(@NonNull d dVar, boolean z) {
        a(dVar, this.o.size(), z);
    }

    private void a(@NonNull d dVar, int i, boolean z) {
        if (dVar.g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        a(dVar, i);
        c(dVar);
        if (z) {
            dVar.c();
        }
    }

    private void a(@NonNull m mVar) {
        d a2 = a();
        if (mVar.a != null) {
            a2.a(mVar.a);
        }
        if (mVar.b != null) {
            a2.b = mVar.b;
            a2.e();
        }
        if (mVar.c != 0) {
            a2.a(mVar.c);
        }
        if (!TextUtils.isEmpty(mVar.getContentDescription())) {
            a2.d = mVar.getContentDescription();
            a2.e();
        }
        a(a2, this.o.isEmpty());
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable a aVar) {
        if (this.v != null) {
            b(this.v);
        }
        this.v = aVar;
        if (aVar != null) {
            a(aVar);
        }
    }

    public final void a(@NonNull a aVar) {
        if (this.w.contains(aVar)) {
            return;
        }
        this.w.add(aVar);
    }

    public final void b(@NonNull a aVar) {
        this.w.remove(aVar);
    }

    @NonNull
    public final d a() {
        d acquire = n.acquire();
        if (acquire == null) {
            acquire = new d();
        }
        acquire.g = this;
        acquire.h = b(acquire);
        return acquire;
    }

    public int getTabCount() {
        return this.o.size();
    }

    @Nullable
    public final d a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.o.get(i);
    }

    public int getSelectedTabPosition() {
        if (this.p != null) {
            return this.p.e;
        }
        return -1;
    }

    public final void b() {
        int childCount = this.q.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            e eVar = (e) this.q.getChildAt(childCount);
            this.q.removeViewAt(childCount);
            if (eVar != null) {
                eVar.setTab(null);
                eVar.setSelected(false);
                this.E.release(eVar);
            }
            requestLayout();
        }
        Iterator<d> it = this.o.iterator();
        while (it.hasNext()) {
            d next = it.next();
            it.remove();
            next.g = null;
            next.h = null;
            next.a = null;
            next.b = null;
            next.c = null;
            next.d = null;
            next.e = -1;
            next.f = null;
            n.release(next);
        }
        this.p = null;
    }

    public void setTabMode(int i) {
        if (i != this.l) {
            this.l = i;
            f();
        }
    }

    public int getTabMode() {
        return this.l;
    }

    public void setTabGravity(int i) {
        if (this.k != i) {
            this.k = i;
            f();
        }
    }

    public int getTabGravity() {
        return this.k;
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            int size = this.o.size();
            for (int i = 0; i < size; i++) {
                this.o.get(i).e();
            }
        }
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f;
    }

    private void a(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        if (this.m != null) {
            if (this.B != null) {
                this.m.removeOnPageChangeListener(this.B);
            }
            if (this.C != null) {
                this.m.removeOnAdapterChangeListener(this.C);
            }
        }
        if (this.x != null) {
            b(this.x);
            this.x = null;
        }
        if (viewPager != null) {
            this.m = viewPager;
            if (this.B == null) {
                this.B = new TabLayoutOnPageChangeListener(this);
            }
            this.B.a();
            viewPager.addOnPageChangeListener(this.B);
            this.x = new f(viewPager);
            a(this.x);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, z);
            }
            if (this.C == null) {
                this.C = new AdapterChangeListener();
            }
            this.C.a = z;
            viewPager.addOnAdapterChangeListener(this.C);
            a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.m = null;
            a((PagerAdapter) null, false);
        }
        this.D = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        a(pagerAdapter, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D) {
            setupWithViewPager(null);
            this.D = false;
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    final void a(@Nullable PagerAdapter pagerAdapter, boolean z) {
        if (this.z != null && this.A != null) {
            this.z.unregisterDataSetObserver(this.A);
        }
        this.z = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.A == null) {
                this.A = new b();
            }
            pagerAdapter.registerDataSetObserver(this.A);
        }
        c();
    }

    final void c() {
        int currentItem;
        b();
        if (this.z != null) {
            int count = this.z.getCount();
            for (int i = 0; i < count; i++) {
                a(a().a(this.z.getPageTitle(i)), false);
            }
            if (this.m == null || count <= 0 || (currentItem = this.m.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            b(a(currentItem), true);
        }
    }

    private e b(@NonNull d dVar) {
        e acquire = this.E != null ? this.E.acquire() : null;
        if (acquire == null) {
            acquire = new e(getContext());
        }
        acquire.setTab(dVar);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(getTabMinWidth());
        return acquire;
    }

    private void c(d dVar) {
        this.q.addView(dVar.h, dVar.e, d());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private void a(View view) {
        if (view instanceof m) {
            a((m) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private LinearLayout.LayoutParams d() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private void a(LinearLayout.LayoutParams layoutParams) {
        if (this.l == 1 && this.k == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    final int b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L18;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.getDefaultHeight()
            int r0 = r5.b(r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L24
            if (r1 == 0) goto L1f
            goto L30
        L1f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L30
        L24:
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.min(r0, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
        L30:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            if (r1 == 0) goto L4a
            int r1 = r5.s
            if (r1 <= 0) goto L41
            int r0 = r5.s
            goto L48
        L41:
            r1 = 56
            int r1 = r5.b(r1)
            int r0 = r0 - r1
        L48:
            r5.j = r0
        L4a:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L96
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.l
            switch(r2) {
                case 0: goto L6b;
                case 1: goto L5f;
                default: goto L5e;
            }
        L5e:
            goto L76
        L5f:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 == r4) goto L76
        L69:
            r6 = 1
            goto L76
        L6b:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 >= r4) goto L76
            goto L69
        L76:
            if (r6 == 0) goto L96
            int r6 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r0 = r0.height
            int r6 = getChildMeasureSpec(r7, r6, r0)
            int r7 = r5.getMeasuredWidth()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            r1.measure(r7, r6)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.onMeasure(int, int):void");
    }

    private void c(int i) {
        boolean z;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && ViewCompat.isLaidOut(this)) {
            c cVar = this.q;
            int childCount = cVar.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    z = false;
                    break;
                } else if (cVar.getChildAt(i2).getWidth() <= 0) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                int scrollX = getScrollX();
                int a2 = a(i, 0.0f);
                if (scrollX != a2) {
                    e();
                    this.y.setIntValues(scrollX, a2);
                    this.y.start();
                }
                this.q.b(i, 300);
                return;
            }
        }
        a(i, 0.0f, true);
    }

    private void e() {
        if (this.y == null) {
            this.y = new ValueAnimator();
            this.y.setInterpolator(android.support.design.widget.a.b);
            this.y.setDuration(300L);
            this.y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.y.addListener(animatorListener);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.q.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.q.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    final void a(d dVar) {
        b(dVar, true);
    }

    final void b(d dVar, boolean z) {
        d dVar2 = this.p;
        if (dVar2 == dVar) {
            if (dVar2 != null) {
                f(dVar);
                c(dVar.e);
                return;
            }
            return;
        }
        int i = dVar != null ? dVar.e : -1;
        if (z) {
            if ((dVar2 == null || dVar2.e == -1) && i != -1) {
                a(i, 0.0f, true);
            } else {
                c(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (dVar2 != null) {
            e(dVar2);
        }
        this.p = dVar;
        if (dVar != null) {
            d(dVar);
        }
    }

    private void d(@NonNull d dVar) {
        for (int size = this.w.size() - 1; size >= 0; size--) {
            this.w.get(size).a(dVar);
        }
    }

    private void e(@NonNull d dVar) {
        for (int size = this.w.size() - 1; size >= 0; size--) {
            this.w.get(size).b(dVar);
        }
    }

    private void f(@NonNull d dVar) {
        for (int size = this.w.size() - 1; size >= 0; size--) {
            this.w.get(size).c(dVar);
        }
    }

    private int a(int i, float f2) {
        if (this.l == 0) {
            View childAt = this.q.getChildAt(i);
            int i2 = i + 1;
            View childAt2 = i2 < this.q.getChildCount() ? this.q.getChildAt(i2) : null;
            int width = childAt != null ? childAt.getWidth() : 0;
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i3 = (int) ((width + width2) * 0.5f * f2);
            return ViewCompat.getLayoutDirection(this) == 0 ? left + i3 : left - i3;
        }
        return 0;
    }

    private void f() {
        ViewCompat.setPaddingRelative(this.q, this.l == 0 ? Math.max(0, this.u - this.a) : 0, 0, 0, 0);
        switch (this.l) {
            case 0:
                this.q.setGravity(GravityCompat.START);
                break;
            case 1:
                this.q.setGravity(1);
                break;
        }
        a(true);
    }

    final void a(boolean z) {
        for (int i = 0; i < this.q.getChildCount(); i++) {
            View childAt = this.q.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class d {
        public Object a;
        Drawable b;
        CharSequence c;
        CharSequence d;
        public int e = -1;
        public View f;
        TabLayout g;
        e h;

        d() {
        }

        @Nullable
        public final Object a() {
            return this.a;
        }

        @NonNull
        public final d a(@Nullable Object obj) {
            this.a = obj;
            return this;
        }

        @NonNull
        public final d a(@Nullable View view) {
            this.f = view;
            e();
            return this;
        }

        @NonNull
        public final d a(@LayoutRes int i) {
            return a(LayoutInflater.from(this.h.getContext()).inflate(i, (ViewGroup) this.h, false));
        }

        public final int b() {
            return this.e;
        }

        @NonNull
        public final d a(@Nullable CharSequence charSequence) {
            this.c = charSequence;
            e();
            return this;
        }

        public final void c() {
            if (this.g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            this.g.a(this);
        }

        public final boolean d() {
            if (this.g != null) {
                return this.g.getSelectedTabPosition() == this.e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        final void e() {
            if (this.h != null) {
                this.h.a();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class e extends LinearLayout {
        private d b;
        private TextView c;
        private ImageView d;
        private View e;
        private TextView f;
        private ImageView g;
        private int h;

        public e(Context context) {
            super(context);
            this.h = 2;
            if (TabLayout.this.i != 0) {
                ViewCompat.setBackground(this, android.support.v7.content.res.b.b(context, TabLayout.this.i));
            }
            ViewCompat.setPaddingRelative(this, TabLayout.this.a, TabLayout.this.b, TabLayout.this.c, TabLayout.this.d);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.b != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.b.c();
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.c != null) {
                this.c.setSelected(z);
            }
            if (this.d != null) {
                this.d.setSelected(z);
            }
            if (this.e != null) {
                this.e.setSelected(z);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.b.class.getName());
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.b.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.j, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.c != null) {
                getResources();
                float f = TabLayout.this.g;
                int i3 = this.h;
                boolean z = true;
                if (this.d != null && this.d.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.c != null && this.c.getLineCount() > 1) {
                    f = TabLayout.this.h;
                }
                float textSize = this.c.getTextSize();
                int lineCount = this.c.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.c);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.l == 1 && i4 > 0 && lineCount == 1 && ((layout = this.c.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.c.setTextSize(0, f);
                        this.c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        final void setTab(@Nullable d dVar) {
            if (dVar != this.b) {
                this.b = dVar;
                a();
            }
        }

        final void a() {
            d dVar = this.b;
            View view = dVar != null ? dVar.f : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.e = view;
                if (this.c != null) {
                    this.c.setVisibility(8);
                }
                if (this.d != null) {
                    this.d.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
                this.f = (TextView) view.findViewById(16908308);
                if (this.f != null) {
                    this.h = TextViewCompat.getMaxLines(this.f);
                }
                this.g = (ImageView) view.findViewById(16908294);
            } else {
                if (this.e != null) {
                    removeView(this.e);
                    this.e = null;
                }
                this.f = null;
                this.g = null;
            }
            boolean z = false;
            if (this.e == null) {
                if (this.d == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    addView(imageView, 0);
                    this.d = imageView;
                }
                if (this.c == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    addView(textView);
                    this.c = textView;
                    this.h = TextViewCompat.getMaxLines(this.c);
                }
                TextViewCompat.setTextAppearance(this.c, TabLayout.this.e);
                if (TabLayout.this.f != null) {
                    this.c.setTextColor(TabLayout.this.f);
                }
                a(this.c, this.d);
            } else if (this.f != null || this.g != null) {
                a(this.f, this.g);
            }
            if (dVar != null && dVar.d()) {
                z = true;
            }
            setSelected(z);
        }

        private void a(@Nullable TextView textView, @Nullable ImageView imageView) {
            Drawable drawable = this.b != null ? this.b.b : null;
            CharSequence charSequence = this.b != null ? this.b.c : null;
            CharSequence charSequence2 = this.b != null ? this.b.d : null;
            int i = 0;
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(charSequence2);
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(charSequence2);
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = TabLayout.this.b(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            ay.a(this, z ? null : charSequence2);
        }

        public final d getTab() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c extends LinearLayout {
        int a;
        float b;
        private int d;
        private final Paint e;
        private int f;
        private int g;
        private int h;
        private ValueAnimator i;

        c(Context context) {
            super(context);
            this.a = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            setWillNotDraw(false);
            this.e = new Paint();
        }

        final void a(int i) {
            if (this.e.getColor() != i) {
                this.e.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        final void b(int i) {
            if (this.d != i) {
                this.d = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        final void a(int i, float f) {
            if (this.i != null && this.i.isRunning()) {
                this.i.cancel();
            }
            this.a = i;
            this.b = f;
            a();
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.f == i) {
                return;
            }
            requestLayout();
            this.f = i;
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            boolean z = true;
            if (TabLayout.this.l == 1 && TabLayout.this.k == 1) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (TabLayout.this.b(16) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout.this.k = 0;
                    TabLayout.this.a(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.i != null && this.i.isRunning()) {
                this.i.cancel();
                b(this.a, Math.round((1.0f - this.i.getAnimatedFraction()) * ((float) this.i.getDuration())));
                return;
            }
            a();
        }

        private void a() {
            int i;
            int i2;
            View childAt = getChildAt(this.a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.b > 0.0f && this.a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.a + 1);
                    i = (int) ((this.b * childAt2.getLeft()) + ((1.0f - this.b) * i));
                    i2 = (int) ((this.b * childAt2.getRight()) + ((1.0f - this.b) * i2));
                }
            }
            a(i, i2);
        }

        final void a(int i, int i2) {
            if (i == this.g && i2 == this.h) {
                return;
            }
            this.g = i;
            this.h = i2;
            ViewCompat.postInvalidateOnAnimation(this);
        }

        final void b(final int i, int i2) {
            int i3;
            final int i4;
            final int i5;
            if (this.i != null && this.i.isRunning()) {
                this.i.cancel();
            }
            boolean z = ViewCompat.getLayoutDirection(this) == 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                a();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.a) <= 1) {
                i4 = this.g;
                i5 = this.h;
            } else {
                int b = TabLayout.this.b(24);
                if (i < this.a) {
                    if (!z) {
                        i3 = b + right;
                        i4 = i3;
                    }
                    i4 = left - b;
                } else {
                    if (z) {
                        i3 = b + right;
                        i4 = i3;
                    }
                    i4 = left - b;
                }
                i5 = i4;
            }
            if (i4 == left && i5 == right) {
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.i = valueAnimator;
            valueAnimator.setInterpolator(android.support.design.widget.a.b);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.TabLayout.c.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    c.this.a(android.support.design.widget.a.a(i4, left, animatedFraction), android.support.design.widget.a.a(i5, right, animatedFraction));
                }
            });
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.TabLayout.c.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    c.this.a = i;
                    c.this.b = 0.0f;
                }
            });
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.g < 0 || this.h <= this.g) {
                return;
            }
            canvas.drawRect(this.g, getHeight() - this.d, this.h, getHeight(), this.e);
        }
    }

    private int getDefaultHeight() {
        int size = this.o.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                d dVar = this.o.get(i);
                if (dVar != null && dVar.b != null && !TextUtils.isEmpty(dVar.c)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return z ? 72 : 48;
    }

    private int getTabMinWidth() {
        if (this.r != -1) {
            return this.r;
        }
        if (this.l == 0) {
            return this.t;
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    int getTabMaxWidth() {
        return this.j;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        private final WeakReference<TabLayout> a;
        private int b;
        private int c;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.b = this.c;
            this.c = i;
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                boolean z = false;
                tabLayout.a(i, f, this.c != 2 || this.b == 1, (this.c == 2 && this.b == 0) ? true : true);
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            tabLayout.b(tabLayout.a(i), this.c == 0 || (this.c == 2 && this.b == 0));
        }

        final void a() {
            this.c = 0;
            this.b = 0;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class f implements a {
        private final ViewPager a;

        @Override // android.support.design.widget.TabLayout.a
        public final void b(d dVar) {
        }

        @Override // android.support.design.widget.TabLayout.a
        public final void c(d dVar) {
        }

        public f(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // android.support.design.widget.TabLayout.a
        public final void a(d dVar) {
            this.a.setCurrentItem(dVar.e);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.c();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.c();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {
        boolean a;

        AdapterChangeListener() {
        }

        @Override // android.support.v4.view.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            if (TabLayout.this.m == viewPager) {
                TabLayout.this.a(pagerAdapter2, this.a);
            }
        }
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        a(viewPager, true, false);
    }

    private void a(d dVar, int i) {
        dVar.e = i;
        this.o.add(i, dVar);
        int size = this.o.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            }
            this.o.get(i).e = i;
        }
    }
}
