package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.math.MathUtils;
import android.support.v4.util.ObjectsCompat;
import android.support.v4.util.Pools;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.robust.common.CommonConstant;
import com.tencent.mapsdk.internal.bw;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2 {
    static final String a;
    static final Class<?>[] b;
    static final ThreadLocal<Map<String, Constructor<a>>> c;
    static final Comparator<View> d;
    private static final Pools.Pool<Rect> i;
    final android.support.design.widget.e<View> e;
    WindowInsetsCompat f;
    boolean g;
    ViewGroup.OnHierarchyChangeListener h;
    private final List<View> j;
    private final List<View> k;
    private final List<View> l;
    private final int[] m;
    private Paint n;
    private boolean o;
    private boolean p;
    private int[] q;
    private View r;
    private View s;
    private d t;
    private boolean u;
    private Drawable v;
    private OnApplyWindowInsetsListener w;
    private final NestedScrollingParentHelper x;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface DefaultBehavior {
        Class<? extends a> value();
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface DispatchChangeEvent {
    }

    private static int c(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= GravityCompat.START;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int d(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            d = new e();
        } else {
            d = null;
        }
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal<>();
        i = new Pools.SynchronizedPool(12);
    }

    @NonNull
    private static Rect a() {
        Rect acquire = i.acquire();
        return acquire == null ? new Rect() : acquire;
    }

    private static void a(@NonNull Rect rect) {
        rect.setEmpty();
        i.release(rect);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.j = new ArrayList();
        this.e = new android.support.design.widget.e<>();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new int[2];
        this.x = new NestedScrollingParentHelper(this);
        n.a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.keylines, R.attr.statusBarBackground}, i2, 2131559084);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.q = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.q.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.q;
                iArr[i3] = (int) (iArr[i3] * f);
            }
        }
        this.v = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        d();
        super.setOnHierarchyChangeListener(new b());
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.h = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        if (this.u) {
            if (this.t == null) {
                this.t = new d();
            }
            getViewTreeObserver().addOnPreDrawListener(this.t);
        }
        if (this.f == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.p = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        if (this.u && this.t != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.t);
        }
        if (this.s != null) {
            onStopNestedScroll(this.s);
        }
        this.p = false;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        if (this.v != drawable) {
            if (this.v != null) {
                this.v.setCallback(null);
            }
            this.v = drawable != null ? drawable.mutate() : null;
            if (this.v != null) {
                if (this.v.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.v, ViewCompat.getLayoutDirection(this));
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        if (this.v == null || this.v.isVisible() == z) {
            return;
        }
        this.v.setVisible(z, false);
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i2) {
        setStatusBarBackground(i2 != 0 ? ContextCompat.getDrawable(getContext(), i2) : null);
    }

    public void setStatusBarBackgroundColor(@ColorInt int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f;
    }

    private void b() {
        if (this.r != null) {
            a aVar = ((c) this.r.getLayoutParams()).a;
            if (aVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                aVar.onTouchEvent(this, this.r, obtain);
                obtain.recycle();
            }
            this.r = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((c) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.o = false;
    }

    private boolean a(MotionEvent motionEvent, int i2) {
        boolean blocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        if (d != null) {
            Collections.sort(list, d);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            c cVar = (c) view.getLayoutParams();
            a aVar = cVar.a;
            if (!(z || z2) || actionMasked == 0) {
                if (!z && aVar != null) {
                    switch (i2) {
                        case 0:
                            z = aVar.onInterceptTouchEvent(this, view, motionEvent);
                            break;
                        case 1:
                            z = aVar.onTouchEvent(this, view, motionEvent);
                            break;
                    }
                    if (z) {
                        this.r = view;
                    }
                }
                if (cVar.a == null) {
                    cVar.m = false;
                }
                boolean z3 = cVar.m;
                boolean z4 = true;
                if (cVar.m) {
                    blocksInteractionBelow = true;
                } else {
                    blocksInteractionBelow = (cVar.a != null ? cVar.a.blocksInteractionBelow(this, view) : false) | cVar.m;
                    cVar.m = blocksInteractionBelow;
                }
                z4 = (!blocksInteractionBelow || z3) ? false : false;
                if (blocksInteractionBelow && !z4) {
                    list.clear();
                    return z;
                }
                z2 = z4;
            } else if (aVar != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                switch (i2) {
                    case 0:
                        aVar.onInterceptTouchEvent(this, view, motionEvent2);
                        continue;
                    case 1:
                        aVar.onTouchEvent(this, view, motionEvent2);
                        continue;
                }
            }
        }
        list.clear();
        return z;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            b();
        }
        boolean a2 = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            b();
        }
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r1 != false) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            int r0 = r15.getActionMasked()
            android.view.View r1 = r14.r
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L11
            boolean r1 = r14.a(r15, r2)
            if (r1 == 0) goto L24
            goto L12
        L11:
            r1 = 0
        L12:
            android.view.View r4 = r14.r
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$c r4 = (android.support.design.widget.CoordinatorLayout.c) r4
            android.support.design.widget.CoordinatorLayout$a r4 = r4.a
            if (r4 == 0) goto L24
            android.view.View r3 = r14.r
            boolean r3 = r4.onTouchEvent(r14, r3, r15)
        L24:
            android.view.View r4 = r14.r
            r5 = 0
            if (r4 != 0) goto L2f
            boolean r15 = super.onTouchEvent(r15)
            r3 = r3 | r15
            goto L41
        L2f:
            if (r1 == 0) goto L41
            long r8 = android.os.SystemClock.uptimeMillis()
            r10 = 3
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r8
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r6, r8, r10, r11, r12, r13)
            super.onTouchEvent(r5)
        L41:
            if (r5 == 0) goto L46
            r5.recycle()
        L46:
            if (r0 == r2) goto L4b
            r15 = 3
            if (r0 != r15) goto L4e
        L4b:
            r14.b()
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.o) {
            return;
        }
        b();
        this.o = true;
    }

    private int b(int i2) {
        if (this.q == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 < 0 || i2 >= this.q.length) {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        } else {
            return this.q[i2];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static a a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(CommonConstant.Symbol.DOT)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(a)) {
            str = a + CommonConstant.Symbol.DOT_CHAR + str;
        }
        try {
            Map<String, Constructor<a>> map = c.get();
            if (map == null) {
                map = new HashMap<>();
                c.set(map);
            }
            Constructor<a> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, true, context.getClassLoader()).getConstructor(b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private static c c(View view) {
        c cVar = (c) view.getLayoutParams();
        if (!cVar.b) {
            DefaultBehavior defaultBehavior = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior != null) {
                    break;
                }
            }
            if (defaultBehavior != null) {
                try {
                    cVar.a(defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            cVar.b = true;
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r5 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.c():void");
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void a(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0178, code lost:
        if (r0.onMeasureChild(r30, r20, r8, r21, r23, 0) == false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final void a(View view, int i2) {
        c cVar = (c) view.getLayoutParams();
        if (cVar.b()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (cVar.k != null) {
            a(view, cVar.k, i2);
        } else if (cVar.e >= 0) {
            b(view, cVar.e, i2);
        } else {
            b(view, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        a aVar;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.j.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.j.get(i6);
            if (view.getVisibility() != 8 && ((aVar = ((c) view.getLayoutParams()).a) == null || !aVar.onLayoutChild(this, view, layoutDirection))) {
                a(view, layoutDirection);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.g || this.v == null) {
            return;
        }
        int systemWindowInsetTop = this.f != null ? this.f.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.v.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.v.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        d();
    }

    private void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (!z) {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            o.a(this, view, rect);
        }
    }

    private static void a(View view, int i2, Rect rect, Rect rect2, c cVar, int i3, int i4) {
        int width;
        int height;
        int i5 = cVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i5, i2);
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(c(cVar.d), i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i9 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i6 == 1) {
            width -= i3 / 2;
        } else if (i6 != 5) {
            width -= i3;
        }
        if (i7 == 16) {
            height -= i4 / 2;
        } else if (i7 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    private void a(c cVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + cVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - cVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + cVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - cVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private void a(View view, int i2, Rect rect, Rect rect2) {
        c cVar = (c) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        a(view, i2, rect, rect2, cVar, measuredWidth, measuredHeight);
        a(cVar, rect2, measuredWidth, measuredHeight);
    }

    private void a(View view, View view2, int i2) {
        view.getLayoutParams();
        Rect a2 = a();
        Rect a3 = a();
        try {
            o.a(this, view2, a2);
            a(view, i2, a2, a3);
            view.layout(a3.left, a3.top, a3.right, a3.bottom);
        } finally {
            a(a2);
            a(a3);
        }
    }

    private void b(View view, int i2, int i3) {
        c cVar = (c) view.getLayoutParams();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(d(cVar.c), i3);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int b2 = b(i2) - measuredWidth;
        if (i4 == 1) {
            b2 += measuredWidth / 2;
        } else if (i4 == 5) {
            b2 += measuredWidth;
        }
        int i6 = 0;
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + cVar.leftMargin, Math.min(b2, ((width - getPaddingRight()) - measuredWidth) - cVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + cVar.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - cVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void b(View view, int i2) {
        c cVar = (c) view.getLayoutParams();
        Rect a2 = a();
        a2.set(getPaddingLeft() + cVar.leftMargin, getPaddingTop() + cVar.topMargin, (getWidth() - getPaddingRight()) - cVar.rightMargin, (getHeight() - getPaddingBottom()) - cVar.bottomMargin);
        if (this.f != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view)) {
            a2.left += this.f.getSystemWindowInsetLeft();
            a2.top += this.f.getSystemWindowInsetTop();
            a2.right -= this.f.getSystemWindowInsetRight();
            a2.bottom -= this.f.getSystemWindowInsetBottom();
        }
        Rect a3 = a();
        GravityCompat.apply(c(cVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), a2, a3, i2);
        view.layout(a3.left, a3.top, a3.right, a3.bottom);
        a(a2);
        a(a3);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        c cVar = (c) view.getLayoutParams();
        if (cVar.a != null) {
            float scrimOpacity = cVar.a.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.n == null) {
                    this.n = new Paint();
                }
                this.n.setColor(cVar.a.getScrimColor(this, view));
                this.n.setAlpha(MathUtils.clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.n);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    final void a(int i2) {
        int i3;
        Rect rect;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i5;
        int height;
        int i6;
        int i7;
        c cVar;
        int i8;
        Rect rect2;
        int i9;
        View view;
        c cVar2;
        int i10;
        boolean z4;
        a aVar;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.j.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        int i11 = 0;
        while (i11 < size) {
            View view2 = this.j.get(i11);
            c cVar3 = (c) view2.getLayoutParams();
            if (i2 == 0 && view2.getVisibility() == 8) {
                i4 = size;
                rect = a4;
                i3 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (cVar3.l == this.j.get(i12)) {
                        c cVar4 = (c) view2.getLayoutParams();
                        if (cVar4.k != null) {
                            Rect a5 = a();
                            Rect a6 = a();
                            Rect a7 = a();
                            o.a(this, cVar4.k, a5);
                            a(view2, false, a6);
                            int measuredWidth = view2.getMeasuredWidth();
                            i8 = size;
                            int measuredHeight = view2.getMeasuredHeight();
                            i9 = i11;
                            rect2 = a4;
                            i7 = i12;
                            cVar = cVar3;
                            view = view2;
                            a(view2, layoutDirection, a5, a7, cVar4, measuredWidth, measuredHeight);
                            if (a7.left == a6.left && a7.top == a6.top) {
                                cVar2 = cVar4;
                                i10 = measuredWidth;
                                z4 = false;
                            } else {
                                cVar2 = cVar4;
                                i10 = measuredWidth;
                                z4 = true;
                            }
                            a(cVar2, a7, i10, measuredHeight);
                            int i13 = a7.left - a6.left;
                            int i14 = a7.top - a6.top;
                            if (i13 != 0) {
                                ViewCompat.offsetLeftAndRight(view, i13);
                            }
                            if (i14 != 0) {
                                ViewCompat.offsetTopAndBottom(view, i14);
                            }
                            if (z4 && (aVar = cVar2.a) != null) {
                                aVar.onDependentViewChanged(this, view, cVar2.k);
                            }
                            a(a5);
                            a(a6);
                            a(a7);
                            i12 = i7 + 1;
                            view2 = view;
                            size = i8;
                            i11 = i9;
                            a4 = rect2;
                            cVar3 = cVar;
                        }
                    }
                    i7 = i12;
                    cVar = cVar3;
                    i8 = size;
                    rect2 = a4;
                    i9 = i11;
                    view = view2;
                    i12 = i7 + 1;
                    view2 = view;
                    size = i8;
                    i11 = i9;
                    a4 = rect2;
                    cVar3 = cVar;
                }
                c cVar5 = cVar3;
                int i15 = size;
                Rect rect3 = a4;
                i3 = i11;
                View view3 = view2;
                a(view3, true, a3);
                if (cVar5.g != 0 && !a3.isEmpty()) {
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(cVar5.g, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        a2.top = Math.max(a2.top, a3.bottom);
                    } else if (i16 == 80) {
                        a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        a2.left = Math.max(a2.left, a3.right);
                    } else if (i17 == 5) {
                        a2.right = Math.max(a2.right, getWidth() - a3.left);
                    }
                }
                if (cVar5.h != 0 && view3.getVisibility() == 0 && ViewCompat.isLaidOut(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                    c cVar6 = (c) view3.getLayoutParams();
                    a aVar2 = cVar6.a;
                    Rect a8 = a();
                    Rect a9 = a();
                    a9.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                    if (aVar2 != null && aVar2.getInsetDodgeRect(this, view3, a8)) {
                        if (!a9.contains(a8)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a8.toShortString() + " | Bounds:" + a9.toShortString());
                        }
                    } else {
                        a8.set(a9);
                    }
                    a(a9);
                    if (!a8.isEmpty()) {
                        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(cVar6.h, layoutDirection);
                        if ((absoluteGravity2 & 48) != 48 || (i6 = (a8.top - cVar6.topMargin) - cVar6.j) >= a2.top) {
                            z2 = false;
                        } else {
                            d(view3, a2.top - i6);
                            z2 = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a8.bottom) - cVar6.bottomMargin) + cVar6.j) < a2.bottom) {
                            d(view3, height - a2.bottom);
                            z2 = true;
                        }
                        if (!z2) {
                            d(view3, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i5 = (a8.left - cVar6.leftMargin) - cVar6.i) >= a2.left) {
                            z3 = false;
                        } else {
                            c(view3, a2.left - i5);
                            z3 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a8.right) - cVar6.rightMargin) + cVar6.i) < a2.right) {
                            c(view3, width - a2.right);
                            z3 = true;
                        }
                        if (!z3) {
                            c(view3, 0);
                        }
                    }
                    a(a8);
                }
                if (i2 != 2) {
                    rect = rect3;
                    rect.set(((c) view3.getLayoutParams()).o);
                    if (rect.equals(a3)) {
                        i4 = i15;
                    } else {
                        ((c) view3.getLayoutParams()).o.set(a3);
                    }
                } else {
                    rect = rect3;
                }
                i4 = i15;
                for (int i18 = i3 + 1; i18 < i4; i18++) {
                    View view4 = this.j.get(i18);
                    c cVar7 = (c) view4.getLayoutParams();
                    a aVar3 = cVar7.a;
                    if (aVar3 != null && aVar3.layoutDependsOn(this, view4, view3)) {
                        if (i2 == 0 && cVar7.n) {
                            cVar7.n = false;
                        } else {
                            if (i2 == 2) {
                                aVar3.onDependentViewRemoved(this, view4, view3);
                                z = true;
                            } else {
                                z = aVar3.onDependentViewChanged(this, view4, view3);
                            }
                            if (i2 == 1) {
                                cVar7.n = z;
                            }
                        }
                    }
                }
            }
            i11 = i3 + 1;
            size = i4;
            a4 = rect;
        }
        a(a2);
        a(a3);
        a(a4);
    }

    private static void c(View view, int i2) {
        c cVar = (c) view.getLayoutParams();
        if (cVar.i != i2) {
            ViewCompat.offsetLeftAndRight(view, i2 - cVar.i);
            cVar.i = i2;
        }
    }

    private static void d(View view, int i2) {
        c cVar = (c) view.getLayoutParams();
        if (cVar.j != i2) {
            ViewCompat.offsetTopAndBottom(view, i2 - cVar.j);
            cVar.j = i2;
        }
    }

    @NonNull
    public final List<View> a(@NonNull View view) {
        List<View> c2 = this.e.c(view);
        this.l.clear();
        if (c2 != null) {
            this.l.addAll(c2);
        }
        return this.l;
    }

    @NonNull
    public final List<View> b(@NonNull View view) {
        List b2 = this.e.b(view);
        this.l.clear();
        if (b2 != null) {
            this.l.addAll(b2);
        }
        return this.l;
    }

    @VisibleForTesting
    final List<View> getDependencySortedChildren() {
        c();
        return Collections.unmodifiableList(this.j);
    }

    public final boolean a(View view, int i2, int i3) {
        Rect a2 = a();
        o.a(this, view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a(a2);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return onStartNestedScroll(view, view2, i2, 0);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                a aVar = cVar.a;
                if (aVar != null) {
                    boolean onStartNestedScroll = aVar.onStartNestedScroll(this, childAt, view, view2, i2, i3);
                    cVar.a(i3, onStartNestedScroll);
                    z |= onStartNestedScroll;
                } else {
                    cVar.a(i3, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        onNestedScrollAccepted(view, view2, i2, 0);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        a aVar;
        this.x.onNestedScrollAccepted(view, view2, i2, i3);
        this.s = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.a(i3) && (aVar = cVar.a) != null) {
                aVar.onNestedScrollAccepted(this, childAt, view, view2, i2, i3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i2) {
        this.x.onStopNestedScroll(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.a(i2)) {
                a aVar = cVar.a;
                if (aVar != null) {
                    aVar.onStopNestedScroll(this, childAt, view, i2);
                }
                cVar.a(i2, false);
                cVar.n = false;
            }
        }
        this.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i2, i3, i4, i5, 0);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        a aVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a(i6) && (aVar = cVar.a) != null) {
                    aVar.onNestedScroll(this, childAt, view, i2, i3, i4, i5, i6);
                    z = true;
                }
            }
        }
        if (z) {
            a(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        onNestedPreScroll(view, i2, i3, iArr, 0);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        a aVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a(i4) && (aVar = cVar.a) != null) {
                    int[] iArr2 = this.m;
                    this.m[1] = 0;
                    iArr2[0] = 0;
                    aVar.onNestedPreScroll(this, childAt, view, i2, i3, this.m, i4);
                    if (i2 > 0) {
                        min = Math.max(i5, this.m[0]);
                    } else {
                        min = Math.min(i5, this.m[0]);
                    }
                    if (i3 > 0) {
                        min2 = Math.max(i6, this.m[1]);
                    } else {
                        min2 = Math.min(i6, this.m[1]);
                    }
                    i5 = min;
                    i6 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            a(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        a aVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a(0) && (aVar = cVar.a) != null) {
                    z2 |= aVar.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            a(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        a aVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a(0) && (aVar = cVar.a) != null) {
                    z |= aVar.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.support.v4.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.x.getNestedScrollAxes();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class d implements ViewTreeObserver.OnPreDrawListener {
        d() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.a(0);
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class e implements Comparator<View> {
        e() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            float z = ViewCompat.getZ(view);
            float z2 = ViewCompat.getZ(view2);
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class a<V extends View> {
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect) {
            return false;
        }

        @ColorInt
        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        @FloatRange(from = 0.0d, to = bw.a)
        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onAttachedToLayoutParams(@NonNull c cVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public a() {
        }

        public a(Context context, AttributeSet attributeSet) {
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public static void setTag(View view, Object obj) {
            ((c) view.getLayoutParams()).p = obj;
        }

        public static Object getTag(View view) {
            return ((c) view.getLayoutParams()).p;
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public a a;
        boolean b;
        public int c;
        public int d;
        public int e;
        int f;
        public int g;
        public int h;
        int i;
        int j;
        View k;
        View l;
        boolean m;
        boolean n;
        final Rect o;
        Object p;
        private boolean q;
        private boolean r;

        public c(int i, int i2) {
            super(i, i2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.o = new Rect();
        }

        c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.o = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, R.attr.layout_behavior, R.attr.layout_anchor, R.attr.layout_keyline, R.attr.layout_anchorGravity, R.attr.layout_insetEdge, R.attr.layout_dodgeInsetEdges});
            this.c = obtainStyledAttributes.getInteger(0, 0);
            this.f = obtainStyledAttributes.getResourceId(2, -1);
            this.d = obtainStyledAttributes.getInteger(4, 0);
            this.e = obtainStyledAttributes.getInteger(3, -1);
            this.g = obtainStyledAttributes.getInt(5, 0);
            this.h = obtainStyledAttributes.getInt(6, 0);
            this.b = obtainStyledAttributes.hasValue(1);
            if (this.b) {
                this.a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(1));
            }
            obtainStyledAttributes.recycle();
            if (this.a != null) {
                this.a.onAttachedToLayoutParams(this);
            }
        }

        public c(c cVar) {
            super((ViewGroup.MarginLayoutParams) cVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.o = new Rect();
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.o = new Rect();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.o = new Rect();
        }

        @Nullable
        public final a a() {
            return this.a;
        }

        public final void a(@Nullable a aVar) {
            if (this.a != aVar) {
                if (this.a != null) {
                    this.a.onDetachedFromLayoutParams();
                }
                this.a = aVar;
                this.p = null;
                this.b = true;
                if (aVar != null) {
                    aVar.onAttachedToLayoutParams(this);
                }
            }
        }

        final boolean b() {
            return this.k == null && this.f != -1;
        }

        final void a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.q = z;
                    return;
                case 1:
                    this.r = z;
                    return;
                default:
                    return;
            }
        }

        final boolean a(int i) {
            switch (i) {
                case 0:
                    return this.q;
                case 1:
                    return this.r;
                default:
                    return false;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b implements ViewGroup.OnHierarchyChangeListener {
        b() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.h != null) {
                CoordinatorLayout.this.h.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.a(2);
            if (CoordinatorLayout.this.h != null) {
                CoordinatorLayout.this.h.onChildViewRemoved(view, view2);
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            a aVar = c(childAt).a;
            if (id != -1 && aVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                aVar.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            a aVar = ((c) childAt.getLayoutParams()).a;
            if (id != -1 && aVar != null && (onSaveInstanceState = aVar.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        savedState.a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        a aVar = ((c) view.getLayoutParams()).a;
        if (aVar == null || !aVar.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void d() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (ViewCompat.getFitsSystemWindows(this)) {
            if (this.w == null) {
                this.w = new OnApplyWindowInsetsListener() { // from class: android.support.design.widget.CoordinatorLayout.1
                    @Override // android.support.v4.view.OnApplyWindowInsetsListener
                    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        a aVar;
                        CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                        if (!ObjectsCompat.equals(coordinatorLayout.f, windowInsetsCompat)) {
                            coordinatorLayout.f = windowInsetsCompat;
                            boolean z = true;
                            coordinatorLayout.g = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
                            coordinatorLayout.setWillNotDraw((coordinatorLayout.g || coordinatorLayout.getBackground() != null) ? false : false);
                            if (!windowInsetsCompat.isConsumed()) {
                                int childCount = coordinatorLayout.getChildCount();
                                for (int i2 = 0; i2 < childCount; i2++) {
                                    View childAt = coordinatorLayout.getChildAt(i2);
                                    if (ViewCompat.getFitsSystemWindows(childAt) && (aVar = ((c) childAt.getLayoutParams()).a) != null) {
                                        windowInsetsCompat = aVar.onApplyWindowInsets(coordinatorLayout, childAt, windowInsetsCompat);
                                        if (windowInsetsCompat.isConsumed()) {
                                            break;
                                        }
                                    }
                                }
                            }
                            coordinatorLayout.requestLayout();
                        }
                        return windowInsetsCompat;
                    }
                };
            }
            ViewCompat.setOnApplyWindowInsetsListener(this, this.w);
            setSystemUiVisibility(1280);
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, null);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.design.widget.CoordinatorLayout.SavedState.1
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
        SparseArray<Parcelable> a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int size = this.a != null ? this.a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.a.keyAt(i2);
                parcelableArr[i2] = this.a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof c) {
            return new c((c) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
