package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.constraint.R;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.math.MathUtils;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.a<V> {
    int a;
    int b;
    public boolean c;
    public boolean d;
    protected int e;
    ViewDragHelper f;
    int g;
    WeakReference<V> h;
    WeakReference<View> i;
    public a j;
    int k;
    boolean l;
    private float m;
    private int n;
    private boolean o;
    private int p;
    private boolean q;
    private int r;
    private boolean s;
    private VelocityTracker t;
    private int u;
    private final ViewDragHelper.Callback v;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface State {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract void a(@NonNull View view, float f);

        public abstract void a(@NonNull View view, int i);
    }

    public BottomSheetBehavior() {
        this.e = 4;
        this.v = new ViewDragHelper.Callback() { // from class: android.support.design.widget.BottomSheetBehavior.2
            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                View view2;
                if (BottomSheetBehavior.this.e == 1 || BottomSheetBehavior.this.l) {
                    return false;
                }
                return ((BottomSheetBehavior.this.e == 3 && BottomSheetBehavior.this.k == i && (view2 = BottomSheetBehavior.this.i.get()) != null && view2.canScrollVertically(-1)) || BottomSheetBehavior.this.h == null || BottomSheetBehavior.this.h.get() != view) ? false : true;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.d(i2);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1) {
                    BottomSheetBehavior.this.c(1);
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int i;
                int i2;
                int i3 = 3;
                if (f2 < 0.0f) {
                    i2 = BottomSheetBehavior.this.a;
                } else if (BottomSheetBehavior.this.c && BottomSheetBehavior.this.a(view, f2)) {
                    i2 = BottomSheetBehavior.this.g;
                    i3 = 5;
                } else {
                    if (f2 == 0.0f) {
                        int top = view.getTop();
                        if (Math.abs(top - BottomSheetBehavior.this.a) < Math.abs(top - BottomSheetBehavior.this.b)) {
                            i2 = BottomSheetBehavior.this.a;
                        } else {
                            i = BottomSheetBehavior.this.b;
                        }
                    } else {
                        i = BottomSheetBehavior.this.b;
                    }
                    i2 = i;
                    i3 = 4;
                }
                if (BottomSheetBehavior.this.f.settleCapturedViewAt(view.getLeft(), i2)) {
                    BottomSheetBehavior.this.c(2);
                    ViewCompat.postOnAnimation(view, new b(view, i3));
                    return;
                }
                BottomSheetBehavior.this.c(i3);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                return MathUtils.clamp(i, BottomSheetBehavior.this.a, BottomSheetBehavior.this.c ? BottomSheetBehavior.this.g : BottomSheetBehavior.this.b);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                if (BottomSheetBehavior.this.c) {
                    return BottomSheetBehavior.this.g - BottomSheetBehavior.this.a;
                }
                return BottomSheetBehavior.this.b - BottomSheetBehavior.this.a;
            }
        };
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 4;
        this.v = new ViewDragHelper.Callback() { // from class: android.support.design.widget.BottomSheetBehavior.2
            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                View view2;
                if (BottomSheetBehavior.this.e == 1 || BottomSheetBehavior.this.l) {
                    return false;
                }
                return ((BottomSheetBehavior.this.e == 3 && BottomSheetBehavior.this.k == i && (view2 = BottomSheetBehavior.this.i.get()) != null && view2.canScrollVertically(-1)) || BottomSheetBehavior.this.h == null || BottomSheetBehavior.this.h.get() != view) ? false : true;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.d(i2);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1) {
                    BottomSheetBehavior.this.c(1);
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int i;
                int i2;
                int i3 = 3;
                if (f2 < 0.0f) {
                    i2 = BottomSheetBehavior.this.a;
                } else if (BottomSheetBehavior.this.c && BottomSheetBehavior.this.a(view, f2)) {
                    i2 = BottomSheetBehavior.this.g;
                    i3 = 5;
                } else {
                    if (f2 == 0.0f) {
                        int top = view.getTop();
                        if (Math.abs(top - BottomSheetBehavior.this.a) < Math.abs(top - BottomSheetBehavior.this.b)) {
                            i2 = BottomSheetBehavior.this.a;
                        } else {
                            i = BottomSheetBehavior.this.b;
                        }
                    } else {
                        i = BottomSheetBehavior.this.b;
                    }
                    i2 = i;
                    i3 = 4;
                }
                if (BottomSheetBehavior.this.f.settleCapturedViewAt(view.getLeft(), i2)) {
                    BottomSheetBehavior.this.c(2);
                    ViewCompat.postOnAnimation(view, new b(view, i3));
                    return;
                }
                BottomSheetBehavior.this.c(i3);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                return MathUtils.clamp(i, BottomSheetBehavior.this.a, BottomSheetBehavior.this.c ? BottomSheetBehavior.this.g : BottomSheetBehavior.this.b);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                if (BottomSheetBehavior.this.c) {
                    return BottomSheetBehavior.this.g - BottomSheetBehavior.this.a;
                }
                return BottomSheetBehavior.this.b - BottomSheetBehavior.this.a;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.behavior_peekHeight, R.attr.behavior_hideable, R.attr.behavior_skipCollapsed});
        TypedValue peekValue = obtainStyledAttributes.peekValue(0);
        if (peekValue != null && peekValue.data == -1) {
            a(peekValue.data);
        } else {
            a(obtainStyledAttributes.getDimensionPixelSize(0, -1));
        }
        this.c = obtainStyledAttributes.getBoolean(1, false);
        this.d = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        this.m = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.e);
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        if (savedState.a == 1 || savedState.a == 2) {
            this.e = 4;
        } else {
            this.e = savedState.a;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            ViewCompat.setFitsSystemWindows(v, true);
        }
        int top = v.getTop();
        coordinatorLayout.a(v, i);
        this.g = coordinatorLayout.getHeight();
        if (this.o) {
            if (this.p == 0) {
                this.p = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            }
            i2 = Math.max(this.p, this.g - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.n;
        }
        this.a = Math.max(0, this.g - v.getHeight());
        this.b = Math.max(this.g - i2, this.a);
        if (this.e == 3) {
            ViewCompat.offsetTopAndBottom(v, this.a);
        } else if (this.c && this.e == 5) {
            ViewCompat.offsetTopAndBottom(v, this.g);
        } else if (this.e == 4) {
            ViewCompat.offsetTopAndBottom(v, this.b);
        } else if (this.e == 1 || this.e == 2) {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        if (this.f == null) {
            this.f = ViewDragHelper.create(coordinatorLayout, this.v);
        }
        this.h = new WeakReference<>(v);
        this.i = new WeakReference<>(b(v));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[ADDED_TO_REGION] */
    @Override // android.support.design.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.support.design.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            boolean r0 = r9.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Lb
            r7.q = r2
            return r1
        Lb:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto L14
            r7.a()
        L14:
            android.view.VelocityTracker r3 = r7.t
            if (r3 != 0) goto L1e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r7.t = r3
        L1e:
            android.view.VelocityTracker r3 = r7.t
            r3.addMovement(r10)
            r3 = 3
            r4 = -1
            if (r0 == r3) goto L6d
            switch(r0) {
                case 0: goto L2b;
                case 1: goto L6d;
                default: goto L2a;
            }
        L2a:
            goto L78
        L2b:
            float r3 = r10.getX()
            int r3 = (int) r3
            float r5 = r10.getY()
            int r5 = (int) r5
            r7.u = r5
            java.lang.ref.WeakReference<android.view.View> r5 = r7.i
            if (r5 == 0) goto L44
            java.lang.ref.WeakReference<android.view.View> r5 = r7.i
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            goto L45
        L44:
            r5 = 0
        L45:
            if (r5 == 0) goto L5b
            int r6 = r7.u
            boolean r5 = r8.a(r5, r3, r6)
            if (r5 == 0) goto L5b
            int r5 = r10.getActionIndex()
            int r5 = r10.getPointerId(r5)
            r7.k = r5
            r7.l = r2
        L5b:
            int r5 = r7.k
            if (r5 != r4) goto L69
            int r4 = r7.u
            boolean r9 = r8.a(r9, r3, r4)
            if (r9 != 0) goto L69
            r9 = 1
            goto L6a
        L69:
            r9 = 0
        L6a:
            r7.q = r9
            goto L78
        L6d:
            r7.l = r1
            r7.k = r4
            boolean r9 = r7.q
            if (r9 == 0) goto L78
            r7.q = r1
            return r1
        L78:
            boolean r9 = r7.q
            if (r9 != 0) goto L85
            android.support.v4.widget.ViewDragHelper r9 = r7.f
            boolean r9 = r9.shouldInterceptTouchEvent(r10)
            if (r9 == 0) goto L85
            return r2
        L85:
            java.lang.ref.WeakReference<android.view.View> r9 = r7.i
            java.lang.Object r9 = r9.get()
            android.view.View r9 = (android.view.View) r9
            r3 = 2
            if (r0 != r3) goto Lc2
            if (r9 == 0) goto Lc2
            boolean r0 = r7.q
            if (r0 != 0) goto Lc2
            int r0 = r7.e
            if (r0 == r2) goto Lc2
            float r0 = r10.getX()
            int r0 = (int) r0
            float r3 = r10.getY()
            int r3 = (int) r3
            boolean r8 = r8.a(r9, r0, r3)
            if (r8 != 0) goto Lc2
            int r8 = r7.u
            float r8 = (float) r8
            float r9 = r10.getY()
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            android.support.v4.widget.ViewDragHelper r9 = r7.f
            int r9 = r9.getTouchSlop()
            float r9 = (float) r9
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto Lc2
            return r2
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.onInterceptTouchEvent(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.e == 1 && actionMasked == 0) {
                return true;
            }
            this.f.processTouchEvent(motionEvent);
            if (actionMasked == 0) {
                a();
            }
            if (this.t == null) {
                this.t = VelocityTracker.obtain();
            }
            this.t.addMovement(motionEvent);
            if (actionMasked == 2 && !this.q && Math.abs(this.u - motionEvent.getY()) > this.f.getTouchSlop()) {
                this.f.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.q;
        }
        return false;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.r = 0;
        this.s = false;
        return (i & 2) != 0;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view != this.i.get()) {
            return;
        }
        int top = v.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            if (i3 < this.a) {
                iArr[1] = top - this.a;
                ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                c(3);
            } else {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                c(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            if (i3 <= this.b || this.c) {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                c(1);
            } else {
                iArr[1] = top - this.b;
                ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                c(4);
            }
        }
        d(v.getTop());
        this.r = i2;
        this.s = true;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.a) {
            c(3);
        } else if (this.i != null && view == this.i.get() && this.s) {
            if (this.r > 0) {
                i = this.a;
            } else {
                if (this.c) {
                    this.t.computeCurrentVelocity(1000, this.m);
                    if (a(v, this.t.getYVelocity(this.k))) {
                        i = this.g;
                        i2 = 5;
                    }
                }
                if (this.r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.a) < Math.abs(top - this.b)) {
                        i = this.a;
                    } else {
                        i = this.b;
                    }
                } else {
                    i = this.b;
                }
                i2 = 4;
            }
            if (this.f.smoothSlideViewTo(v, v.getLeft(), i)) {
                c(2);
                ViewCompat.postOnAnimation(v, new b(v, i2));
            } else {
                c(i2);
            }
            this.s = false;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view == this.i.get()) {
            return this.e != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    public final void a(int i) {
        V v;
        boolean z = true;
        if (i == -1) {
            if (!this.o) {
                this.o = true;
            }
            z = false;
        } else {
            if (this.o || this.n != i) {
                this.o = false;
                this.n = Math.max(0, i);
                this.b = this.g - i;
            }
            z = false;
        }
        if (!z || this.e != 4 || this.h == null || (v = this.h.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    public final void b(final int i) {
        if (i == this.e) {
            return;
        }
        if (this.h == null) {
            if (i == 4 || i == 3 || (this.c && i == 5)) {
                this.e = i;
                return;
            }
            return;
        }
        final V v = this.h.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v)) {
            v.post(new Runnable() { // from class: android.support.design.widget.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public final void run() {
                    BottomSheetBehavior.this.a(v, i);
                }
            });
        } else {
            a((View) v, i);
        }
    }

    final void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        V v = this.h.get();
        if (v == null || this.j == null) {
            return;
        }
        this.j.a((View) v, i);
    }

    private void a() {
        this.k = -1;
        if (this.t != null) {
            this.t.recycle();
            this.t = null;
        }
    }

    final boolean a(View view, float f) {
        if (this.d) {
            return true;
        }
        return view.getTop() >= this.b && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.b)) / ((float) this.n) > 0.5f;
    }

    @VisibleForTesting
    private View b(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View b2 = b(viewGroup.getChildAt(i));
                if (b2 != null) {
                    return b2;
                }
            }
            return null;
        }
        return null;
    }

    final void a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.b;
        } else if (i == 3) {
            i2 = this.a;
        } else if (this.c && i == 5) {
            i2 = this.g;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        }
        if (this.f.smoothSlideViewTo(view, view.getLeft(), i2)) {
            c(2);
            ViewCompat.postOnAnimation(view, new b(view, i));
            return;
        }
        c(i);
    }

    final void d(int i) {
        V v = this.h.get();
        if (v == null || this.j == null) {
            return;
        }
        if (i > this.b) {
            this.j.a(v, (this.b - i) / (this.g - this.b));
        } else {
            this.j.a(v, (this.b - i) / (this.b - this.a));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        private final View b;
        private final int c;

        b(View view, int i) {
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (BottomSheetBehavior.this.f != null && BottomSheetBehavior.this.f.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.b, this);
            } else {
                BottomSheetBehavior.this.c(this.c);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.design.widget.BottomSheetBehavior.SavedState.1
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
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        final int a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    public static <V extends View> BottomSheetBehavior<V> a(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.c)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.a aVar = ((CoordinatorLayout.c) layoutParams).a;
        if (!(aVar instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (BottomSheetBehavior) aVar;
    }
}
