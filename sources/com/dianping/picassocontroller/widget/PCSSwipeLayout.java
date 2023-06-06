package com.dianping.picassocontroller.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PCSSwipeLayout extends FrameLayout implements NestedScrollingParent2 {
    public static ChangeQuickRedirect a;
    PCSRefreshView b;
    ValueAnimator c;
    boolean d;
    public volatile boolean e;
    volatile boolean f;
    public int g;
    private NestedScrollingParentHelper h;
    private a i;
    private View j;
    private volatile float k;
    private volatile float l;
    private boolean m;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void onPullingDown(float f, int i, float f2);

        void onRefresh();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public static /* synthetic */ ValueAnimator a(PCSSwipeLayout pCSSwipeLayout, ValueAnimator valueAnimator) {
        pCSSwipeLayout.c = null;
        return null;
    }

    public PCSSwipeLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9956f8f6307766395572a9967a2cff8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9956f8f6307766395572a9967a2cff8");
            return;
        }
        this.d = false;
        this.e = false;
        this.f = false;
        this.k = 0.0f;
        this.l = 0.0f;
        this.g = -1;
        this.m = false;
        a();
    }

    public PCSSwipeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a8752f7272bfb5820a0e8c58e2cd2e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a8752f7272bfb5820a0e8c58e2cd2e4");
            return;
        }
        this.d = false;
        this.e = false;
        this.f = false;
        this.k = 0.0f;
        this.l = 0.0f;
        this.g = -1;
        this.m = false;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26fbafb39d967f674186d80eacd7f053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26fbafb39d967f674186d80eacd7f053");
        } else {
            this.h = new NestedScrollingParentHelper(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fbf33fcdb845fb94c8bed3a5d69210a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fbf33fcdb845fb94c8bed3a5d69210a");
            return;
        }
        super.onAttachedToWindow();
        this.j = getChildAt(0);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ead000783273da1db782469eee29499", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ead000783273da1db782469eee29499")).booleanValue() : this.d && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return this.d;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "420c5188f7d86bf79d07687adafde147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "420c5188f7d86bf79d07687adafde147");
        } else {
            this.h.onNestedScrollAccepted(view, view2, i, i2);
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "089f355acc91669ea80d21d6af9cc05f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "089f355acc91669ea80d21d6af9cc05f");
            return;
        }
        this.h.onStopNestedScroll(view, i);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a211487a73305ede30425e227855644b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a211487a73305ede30425e227855644b");
        } else if (this.e) {
        } else {
            this.m = false;
            if (this.d && this.g == 0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                if (layoutParams.height >= this.k) {
                    a(layoutParams.height);
                } else if (layoutParams.height > 0) {
                    b(layoutParams.height);
                } else {
                    b();
                }
            }
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int measuredHeight;
        double d;
        int i4;
        boolean canScrollVertically;
        LinearLayoutManager linearLayoutManager;
        boolean z = false;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3854599d1994ac421392894e36e3e12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3854599d1994ac421392894e36e3e12");
        } else if (i3 == 0 && this.d) {
            if (Math.abs(i) > Math.abs(i2) && (view instanceof RecyclerView)) {
                RecyclerView recyclerView = (RecyclerView) view;
                if ((recyclerView.getLayoutManager() instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) != null && linearLayoutManager.getOrientation() == 0) {
                    return;
                }
            }
            Object[] objArr2 = {view, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b695520eb11bbb85180df5753a9dc13b", RobustBitConfig.DEFAULT_VALUE)) {
                d = ((Double) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b695520eb11bbb85180df5753a9dc13b")).doubleValue();
            } else {
                double abs = (((measuredHeight - Math.abs(view.getY())) / 1.0d) / view.getMeasuredHeight()) * 0.4000000059604645d;
                if (abs <= 0.01d) {
                    abs = 0.01d;
                }
                d = abs * i2;
            }
            int i5 = (int) d;
            if (!this.m && i5 < 0) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b741ba3e0d2812c14ef9bf868179aa22", RobustBitConfig.DEFAULT_VALUE)) {
                    canScrollVertically = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b741ba3e0d2812c14ef9bf868179aa22")).booleanValue();
                } else {
                    canScrollVertically = this.j == null ? false : ViewCompat.canScrollVertically(this.j, -1);
                }
                if (!canScrollVertically) {
                    this.g = 0;
                    this.m = true;
                }
            }
            if (!this.e) {
                i4 = 1;
            } else if (i5 < 0 && getHeaderViewHeight() >= this.k) {
                iArr[1] = i2;
                return;
            } else {
                i4 = 1;
                i5 = i2;
            }
            float f = -i5;
            Object[] objArr4 = new Object[i4];
            objArr4[0] = Float.valueOf(f);
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a8c75b4beca1fac59d50535c54b70af7", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a8c75b4beca1fac59d50535c54b70af7")).booleanValue();
            } else if (this.d && this.g == 0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                layoutParams.height = (int) (layoutParams.height + f);
                if (layoutParams.height < 0) {
                    layoutParams.height = 0;
                }
                if (layoutParams.height == 0) {
                    this.m = false;
                    this.g = -1;
                }
                this.b.setLayoutParams(layoutParams);
                if (this.i != null) {
                    this.i.onPullingDown(f, layoutParams.height, this.l);
                }
                this.b.setProgressRotation(layoutParams.height / this.l);
                a(layoutParams.height);
                z = true;
            }
            if (z) {
                iArr[1] = i2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.support.v4.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b026f6359c669dcbbb659780b2f2c07", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b026f6359c669dcbbb659780b2f2c07")).intValue() : this.h.getNestedScrollAxes();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "473bbff457a654e9f60e67661da4ded2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "473bbff457a654e9f60e67661da4ded2")).booleanValue() : getHeaderViewHeight() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d759b73463a23bd78608ead07952762d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d759b73463a23bd78608ead07952762d");
        } else if (this.j != null) {
            this.j.setTranslationY(f);
        }
    }

    private int getHeaderViewHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5990fcf730aa8698ed06ea0cbd3b8d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5990fcf730aa8698ed06ea0cbd3b8d")).intValue();
        }
        if (this.b == null || this.b.getLayoutParams() == null) {
            return 0;
        }
        return this.b.getLayoutParams().height;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09b901028d2894c085c4213d76756025", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09b901028d2894c085c4213d76756025");
            return;
        }
        this.e = true;
        this.g = 0;
        if (this.c != null && this.c.isRunning()) {
            this.c.cancel();
        }
        this.c = ValueAnimator.ofFloat(i, this.k);
        this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.dianping.picassocontroller.widget.PCSSwipeLayout.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1a5fa188ab965b5503c51793b7d0c28", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1a5fa188ab965b5503c51793b7d0c28");
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PCSSwipeLayout.this.b.getLayoutParams();
                layoutParams.height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PCSSwipeLayout.this.b.setLayoutParams(layoutParams);
                if (PCSSwipeLayout.this.i != null) {
                    PCSSwipeLayout.this.i.onPullingDown(0.0f, layoutParams.height, PCSSwipeLayout.this.l);
                }
                PCSSwipeLayout.this.a(layoutParams.height);
            }
        });
        this.c.addListener(new b() { // from class: com.dianping.picassocontroller.widget.PCSSwipeLayout.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.picassocontroller.widget.PCSSwipeLayout.b, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6105ebf6dd01d06389106b0d91e17256", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6105ebf6dd01d06389106b0d91e17256");
                    return;
                }
                PCSSwipeLayout.this.b.a();
                if (PCSSwipeLayout.this.i != null) {
                    PCSSwipeLayout.this.i.onRefresh();
                }
                PCSSwipeLayout.a(PCSSwipeLayout.this, (ValueAnimator) null);
            }
        });
        this.c.setDuration(300L);
        this.c.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71db57220ade74e5c08eef2b7d140f5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71db57220ade74e5c08eef2b7d140f5d");
            return;
        }
        this.b.b();
        if (this.c != null && this.c.isRunning()) {
            this.c.cancel();
        }
        this.c = ValueAnimator.ofFloat(i, 0.0f);
        this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.dianping.picassocontroller.widget.PCSSwipeLayout.3
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "029e7b36913d7f59f124fe547a3695bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "029e7b36913d7f59f124fe547a3695bc");
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PCSSwipeLayout.this.b.getLayoutParams();
                layoutParams.height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PCSSwipeLayout.this.b.setLayoutParams(layoutParams);
                if (PCSSwipeLayout.this.i != null) {
                    PCSSwipeLayout.this.i.onPullingDown(0.0f, layoutParams.height, PCSSwipeLayout.this.l);
                }
                PCSSwipeLayout.this.b.setProgressRotation(layoutParams.height / PCSSwipeLayout.this.l);
                PCSSwipeLayout.this.a(layoutParams.height);
            }
        });
        this.c.addListener(new b() { // from class: com.dianping.picassocontroller.widget.PCSSwipeLayout.4
            public static ChangeQuickRedirect a;

            @Override // com.dianping.picassocontroller.widget.PCSSwipeLayout.b, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "610db72d77df9710ab9ef3a590715879", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "610db72d77df9710ab9ef3a590715879");
                    return;
                }
                PCSSwipeLayout.this.b();
                PCSSwipeLayout.a(PCSSwipeLayout.this, (ValueAnimator) null);
            }
        });
        this.c.setDuration(300L);
        this.c.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb7a99d052670cc4b0ae4d78213aa2e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb7a99d052670cc4b0ae4d78213aa2e9");
            return;
        }
        this.f = false;
        this.e = false;
        this.m = false;
        this.g = -1;
    }

    public void setOnRefreshListener(a aVar) {
        this.i = aVar;
    }

    public PCSRefreshView getHeaderView() {
        return this.b;
    }

    public void setPullRefreshEnable(boolean z) {
        this.d = z;
    }

    public void setRefreshHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e8c025f9a061d76432948a0b503f8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e8c025f9a061d76432948a0b503f8a");
            return;
        }
        this.k = i;
        this.l = this.k * 1.0f;
    }

    public void setRefreshBgColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d35aa416fbbdc049846a4785b5b073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d35aa416fbbdc049846a4785b5b073");
        } else {
            this.b.setBackgroundColor(i);
        }
    }
}
