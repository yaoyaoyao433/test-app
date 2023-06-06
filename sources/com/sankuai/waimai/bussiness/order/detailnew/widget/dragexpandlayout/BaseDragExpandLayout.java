package com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.a;
import com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.b;
import com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.c;
import com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.d;
import com.sankuai.waimai.foundation.utils.g;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BaseDragExpandLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener, b {
    public static ChangeQuickRedirect b;
    private boolean A;
    private final String a;
    public View c;
    protected b.a d;
    protected int e;
    protected int f;
    public boolean g;
    public boolean h;
    public ValueAnimator i;
    private View j;
    private RecyclerView k;
    private ScrollView l;
    private VelocityTracker m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private d t;
    private List<c> u;
    private List<a> v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    public abstract View getHeaderView();

    public void setCanIntercepter(boolean z) {
        this.z = z;
    }

    public BaseDragExpandLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdc292ef5da048c19870925bf941443d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdc292ef5da048c19870925bf941443d");
            return;
        }
        this.a = BaseDragExpandLayout.class.getSimpleName();
        this.c = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.d = b.a.Normal;
        this.m = null;
        this.t = null;
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.g = false;
        this.z = true;
        this.h = true;
        this.A = false;
        this.i = null;
        a((AttributeSet) null);
    }

    public BaseDragExpandLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a3d78e76225e4c45def4e91c9d3620f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a3d78e76225e4c45def4e91c9d3620f");
            return;
        }
        this.a = BaseDragExpandLayout.class.getSimpleName();
        this.c = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.d = b.a.Normal;
        this.m = null;
        this.t = null;
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.g = false;
        this.z = true;
        this.h = true;
        this.A = false;
        this.i = null;
        a(attributeSet);
    }

    public BaseDragExpandLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d31e45b36b3b70f96c4451e0fa99819", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d31e45b36b3b70f96c4451e0fa99819");
            return;
        }
        this.a = BaseDragExpandLayout.class.getSimpleName();
        this.c = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.d = b.a.Normal;
        this.m = null;
        this.t = null;
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.g = false;
        this.z = true;
        this.h = true;
        this.A = false;
        this.i = null;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "470b6b653939f7643fbde3ef6e28d1f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "470b6b653939f7643fbde3ef6e28d1f5");
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.custom_threshold_top, R.attr.custom_expanded_top});
            this.p = (int) obtainStyledAttributes.getDimension(0, -1.0f);
            this.e = (int) obtainStyledAttributes.getDimension(1, -1.0f);
            obtainStyledAttributes.recycle();
        }
        this.c = this;
        setOrientation(1);
        this.n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.q = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.r = ViewConfiguration.get(getContext()).getScaledMaximumFlingVelocity();
        this.j = getHeaderView();
        if (this.j != null) {
            addView(this.j);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf8066af64c1e3dc180e0270f46c68c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf8066af64c1e3dc180e0270f46c68c6");
            return;
        }
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof RecyclerView) {
                int measuredHeight = childAt.getMeasuredHeight();
                if (this.f != 0 && measuredHeight != this.f - this.s) {
                    this.k = (RecyclerView) childAt;
                    ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
                    layoutParams.height = this.f - this.s;
                    this.k.setLayoutParams(layoutParams);
                }
            } else if (childAt instanceof ScrollView) {
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (this.f != 0 && measuredHeight2 != this.f - this.s) {
                    this.l = (ScrollView) childAt;
                    ViewGroup.LayoutParams layoutParams2 = this.l.getLayoutParams();
                    layoutParams2.height = this.f - this.s;
                    this.l.setLayoutParams(layoutParams2);
                }
            } else if (childAt instanceof NestedScrollView) {
                int measuredHeight3 = childAt.getMeasuredHeight();
                if (this.f != 0 && measuredHeight3 != this.f - this.s) {
                    int i4 = this.f - this.s;
                    NestedScrollView nestedScrollView = (NestedScrollView) childAt;
                    ViewGroup.LayoutParams layoutParams3 = nestedScrollView.getLayoutParams();
                    layoutParams3.height = i4;
                    nestedScrollView.setLayoutParams(layoutParams3);
                }
            } else if (childAt == this.j) {
                this.s = childAt.getMeasuredHeight();
            }
        }
        if (getMeasuredHeight() != this.f) {
            setMeasuredDimension(i, this.f);
        }
    }

    private void a(int i, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4970c20fd5eea6dbf0abf74049e445b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4970c20fd5eea6dbf0abf74049e445b3");
        } else if (this.c == null) {
        } else {
            int top = this.c.getTop();
            if (top == this.e) {
                c(true);
            } else if (z) {
                b(true);
            } else {
                int i2 = top + i;
                if (i2 < this.e) {
                    return;
                }
                a(this.c, i2);
            }
        }
    }

    private void b(int i, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a15f1a0a4948585eab8f006137987e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a15f1a0a4948585eab8f006137987e");
        } else if (this.c == null) {
        } else {
            int top = this.c.getTop();
            if (top == this.o) {
                this.d = b.a.Normal;
                c(false);
            } else if (z) {
                b(false);
            } else {
                int i2 = top + i;
                if (i2 > this.o) {
                    return;
                }
                a(this.c, i2);
            }
        }
    }

    public final void b(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "498b9a250ae574e1f14221e5f148a80d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "498b9a250ae574e1f14221e5f148a80d");
        } else if (this.c == null) {
        } else {
            final int top = this.c.getTop();
            this.g = true;
            clearAnimation();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.BaseDragExpandLayout.3
                public static ChangeQuickRedirect a;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3216037069c85a23111bab4e610e210", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3216037069c85a23111bab4e610e210");
                        return;
                    }
                    super.onAnimationEnd(animator);
                    BaseDragExpandLayout.this.g = false;
                    BaseDragExpandLayout.this.c(z);
                }
            });
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.BaseDragExpandLayout.4
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35fe4372c7459ae8f6bf8122bdf6c161", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35fe4372c7459ae8f6bf8122bdf6c161");
                    } else if (z) {
                        BaseDragExpandLayout.this.a(BaseDragExpandLayout.this.c, top + ((int) ((BaseDragExpandLayout.this.e - top) * ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                    } else {
                        BaseDragExpandLayout.this.a(BaseDragExpandLayout.this.c, top + ((int) ((BaseDragExpandLayout.this.o - top) * ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                    }
                }
            });
            duration.start();
        }
    }

    public final void b(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9880887efeef1efa5a1b74313bf905d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9880887efeef1efa5a1b74313bf905d2");
            return;
        }
        if (z) {
            b.a aVar = b.a.Normal;
            this.d = b.a.Expanded;
        } else {
            this.d = b.a.Normal;
        }
        if (this.u.size() > 0) {
            for (c cVar : this.u) {
                cVar.a(z, str);
            }
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "404fcebf03434ee6fb678e2dea1e7f7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "404fcebf03434ee6fb678e2dea1e7f7d");
            return;
        }
        if (z) {
            b.a aVar = b.a.Normal;
            this.d = b.a.Expanded;
        } else {
            this.d = b.a.Normal;
        }
        if (this.u.size() > 0) {
            for (c cVar : this.u) {
                cVar.a(z);
            }
        }
    }

    public void setExpandStatusChangeListener(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f0597a4f518395a8358eff3120557bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f0597a4f518395a8358eff3120557bb");
        } else if (cVar == null || this.u.contains(cVar)) {
        } else {
            this.u.add(cVar);
        }
    }

    public void setExpandRatioChangeListener(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d196bc2a74bef6dcc28529668ed6c80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d196bc2a74bef6dcc28529668ed6c80");
        } else if (aVar == null || this.v.contains(aVar)) {
        } else {
            this.v.add(aVar);
        }
    }

    public void setScrollViewManager(d dVar) {
        this.t = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4683ffff2f0da3a3384679b9ba39ae7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4683ffff2f0da3a3384679b9ba39ae7");
            return;
        }
        this.o = getTop();
        if (this.p < 0) {
            this.p = (this.e + this.o) / 2;
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    private int getExpandHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d97859ddf6b8e5543e9ccf6f9b2688", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d97859ddf6b8e5543e9ccf6f9b2688")).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return (displayMetrics.heightPixels * 3) / 20;
    }

    private boolean a(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc4198d5490030ebb96d3769661a275", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc4198d5490030ebb96d3769661a275")).booleanValue();
        }
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        return i2 >= i4 && i2 <= view.getMeasuredHeight() + i4 && i >= i3 && i <= view.getMeasuredWidth() + i3;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int rawY;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a327ad3adb3d34959e86ea0226c778", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a327ad3adb3d34959e86ea0226c778")).booleanValue();
        }
        if (!this.z) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int rawY2 = (int) motionEvent.getRawY();
        if (motionEvent.getAction() == 2) {
            if (this.g) {
                return true;
            }
            if (this.d == b.a.Expanded) {
                if (this.t == null || !a(this.t.b(), (int) motionEvent.getRawX(), rawY2)) {
                    return true;
                }
                if (this.t.a() && (rawY = (int) (motionEvent.getRawY() - this.w)) > 0 && rawY > this.n) {
                    return true;
                }
            } else if (Math.abs((int) (motionEvent.getRawY() - this.w)) >= 5) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7bdb1d2e384fe8d8f806e5aacd2a3cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7bdb1d2e384fe8d8f806e5aacd2a3cb")).booleanValue();
        }
        if (!this.z) {
            return super.onTouchEvent(motionEvent);
        }
        int rawY = (int) motionEvent.getRawY();
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
        this.m.addMovement(motionEvent);
        if (this.y) {
            return true;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.g = false;
                this.x = rawY;
                break;
            case 1:
                if (!this.g && Math.abs(rawY - this.w) < this.n && a(this.j, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    this.j.callOnClick();
                } else if (!this.g) {
                    this.m.computeCurrentVelocity(1000, this.r);
                    if (Math.abs(this.m.getYVelocity()) > this.q) {
                        b(rawY - this.w < 0);
                    } else {
                        int top = this.c.getTop();
                        if (top > this.p) {
                            b(this.o - top, true, false);
                        } else if (top <= this.p) {
                            a(this.e - top, true, false);
                        }
                    }
                }
                a();
                break;
            case 2:
                if (!this.g) {
                    int i = rawY - this.x;
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a3366b8c1c44f6e34f6fafd25f1919e", RobustBitConfig.DEFAULT_VALUE)) {
                        if (i <= 0) {
                            if (i < 0) {
                                a(i, false, false);
                                break;
                            }
                        } else {
                            b(i, false, false);
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a3366b8c1c44f6e34f6fafd25f1919e");
                        break;
                    }
                }
                break;
            case 3:
                a();
                break;
        }
        this.x = rawY;
        return true;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "643773ac4ffd45a6bf3fe59bce8d63d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "643773ac4ffd45a6bf3fe59bce8d63d5");
        } else if (this.m != null) {
            this.m.recycle();
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a98ebefa0a224d871922b61933ede79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a98ebefa0a224d871922b61933ede79");
        } else if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            float f = ((this.o - i) * 1.0f) / (this.o - this.e);
            for (a aVar : this.v) {
                aVar.a(f);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45c97c911c552dd8127f701b8252ff8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45c97c911c552dd8127f701b8252ff8b");
            return;
        }
        super.onDetachedFromWindow();
        clearAnimation();
        a();
    }

    public final void a(Activity activity, int i, int i2, boolean z) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5253e9391fd7b521b3ebcb0d99f8230f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5253e9391fd7b521b3ebcb0d99f8230f");
            return;
        }
        this.o = i;
        int a = g.a(activity);
        this.e = i2;
        this.f = a - this.e;
        if (z) {
            this.f += g.e(activity);
        }
        this.p = (this.o + this.e) / 2;
        setMargins(this.o);
    }

    public final void b(Activity activity, int i, int i2, boolean z) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3d053da06ad7140e98321edcc59be6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3d053da06ad7140e98321edcc59be6");
            return;
        }
        setMargins(i);
        this.o = i;
        int a = g.a(activity);
        this.e = i2;
        this.f = a - this.e;
        if (z) {
            this.f += g.e(activity);
        }
        this.p = (this.o + this.e) / 2;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f383c9e07cf055b16195257a8ecdc100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f383c9e07cf055b16195257a8ecdc100");
            return;
        }
        this.o = i;
        this.p = (this.o + this.e) / 2;
    }

    private void setMargins(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51ec924889eba21384551ae68b1e7cf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51ec924889eba21384551ae68b1e7cf5");
        } else if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            requestLayout();
        }
    }

    public void setScrollable(boolean z) {
        this.h = z;
    }

    public void setIgnoreScrollEvent(boolean z) {
        this.y = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb9533926aadec88a8b4f7371d7d73ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb9533926aadec88a8b4f7371d7d73ee")).booleanValue();
        }
        if (this.h) {
            if (motionEvent.getAction() == 0) {
                int rawY = (int) motionEvent.getRawY();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a88eb8bbca6d6508c858bc61361ccef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a88eb8bbca6d6508c858bc61361ccef");
                } else {
                    if (this.k != null && this.k.getScrollState() != 0) {
                        this.k.stopScroll();
                    }
                    if (this.i != null && this.A) {
                        this.i.cancel();
                    }
                }
                if (this.m == null) {
                    this.m = VelocityTracker.obtain();
                } else {
                    this.m.clear();
                }
                this.w = rawY;
                this.x = rawY;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}
