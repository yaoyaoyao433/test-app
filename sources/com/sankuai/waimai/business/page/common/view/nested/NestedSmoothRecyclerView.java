package com.sankuai.waimai.business.page.common.view.nested;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.basal.HomePageNestedScrollRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NestedSmoothRecyclerView extends RecyclerView implements com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e {
    public static ChangeQuickRedirect a;
    protected int b;
    protected float c;
    protected boolean d;
    protected d e;
    public boolean f;
    protected final com.sankuai.waimai.platform.widget.smoothnestedscroll.core.d g;
    protected int h;
    protected int i;

    public void setNestedScrollListener(d dVar) {
        this.e = dVar;
    }

    public void setSmoothNestedScrollState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc3cab2a4f297bfc4ab50c8b34a9268f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc3cab2a4f297bfc4ab50c8b34a9268f");
            return;
        }
        boolean z = this.b != i;
        this.b = i;
        if (this.b == 3 || !z || this.e == null) {
            return;
        }
        this.e.a(this, this.b);
    }

    public int getSmoothNestedScrollState() {
        return this.b;
    }

    public NestedSmoothRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef95770f4c0608b9e9fca912faa88cdf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef95770f4c0608b9e9fca912faa88cdf");
            return;
        }
        this.b = 0;
        this.c = 1.0f;
        this.d = true;
        this.g = new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.d(this);
        this.h = 0;
        this.i = 0;
    }

    public NestedSmoothRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cbf4959f8ea259994358ff1f6db974d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cbf4959f8ea259994358ff1f6db974d");
            return;
        }
        this.b = 0;
        this.c = 1.0f;
        this.d = true;
        this.g = new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.d(this);
        this.h = 0;
        this.i = 0;
    }

    public NestedSmoothRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e58ee339ce6227db5f851de4ff1cfb6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e58ee339ce6227db5f851de4ff1cfb6e");
            return;
        }
        this.b = 0;
        this.c = 1.0f;
        this.d = true;
        this.g = new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.d(this);
        this.h = 0;
        this.i = 0;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcb3a247eb01e53990b10794e9cc4d79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcb3a247eb01e53990b10794e9cc4d79");
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2e577c92671701fc26eda3a66dfce75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2e577c92671701fc26eda3a66dfce75");
            return;
        }
        this.g.a();
        setSmoothNestedScrollState(0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c80491401647d3e8d18f68b3b3fee282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c80491401647d3e8d18f68b3b3fee282");
            return;
        }
        this.g.a();
        setSmoothNestedScrollState(0);
        super.onStartTemporaryDetach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d6a32be8c881b0a6e78eb4403bb764", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d6a32be8c881b0a6e78eb4403bb764")).booleanValue();
        }
        this.g.a();
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (getSmoothNestedScrollState() == 2) {
            setSmoothNestedScrollState(0);
        }
        return dispatchTouchEvent;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ed6b805602cd30d31aa49d6be032c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ed6b805602cd30d31aa49d6be032c7")).booleanValue();
        }
        if (getSmoothNestedScrollState() == 2) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private boolean a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f23694c60b2158e99ece3f6f7155c2b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f23694c60b2158e99ece3f6f7155c2b")).booleanValue();
        }
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e)) {
            parent = parent.getParent();
        }
        if (parent instanceof HomePageNestedScrollRecyclerView) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (!((HomePageNestedScrollRecyclerView) parent).canScrollVertically(i > 0 ? 1 : -1) && this.f && i > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63433ba3a255d4fc2ec4f48803828c0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63433ba3a255d4fc2ec4f48803828c0a")).booleanValue();
        }
        if (this.f && a(f2)) {
            return false;
        }
        setSmoothNestedScrollState(3);
        b(this, 0, (int) f, 0, (int) f2, new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c() { // from class: com.sankuai.waimai.business.page.common.view.nested.NestedSmoothRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
            public final void a(View view, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60057e3766f15eee1855114e7c5a121c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60057e3766f15eee1855114e7c5a121c");
                    return;
                }
                if (i3 == 0 && i4 == 0) {
                    NestedSmoothRecyclerView.this.setSmoothNestedScrollState(0);
                } else {
                    NestedSmoothRecyclerView.this.setSmoothNestedScrollState(2);
                }
                NestedSmoothRecyclerView.this.g.a(i, i2, i3, i4, new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c() { // from class: com.sankuai.waimai.business.page.common.view.nested.NestedSmoothRecyclerView.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
                    public final void a(View view2, int i5, int i6, int i7, int i8) {
                        Object[] objArr3 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b5bafd12a537f1e0f36ee27d4dfd29ed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b5bafd12a537f1e0f36ee27d4dfd29ed");
                            return;
                        }
                        NestedSmoothRecyclerView.this.a(view2, i5, i6, i7, i8);
                        NestedSmoothRecyclerView.this.setSmoothNestedScrollState(0);
                    }
                });
            }
        });
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e191e3e5bdf51593bc2b710047f5ad1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e191e3e5bdf51593bc2b710047f5ad1c")).booleanValue();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && this.b != 3 && this.b != 2) {
            setSmoothNestedScrollState(0);
        }
        return onTouchEvent;
    }

    private void b(View view, int i, int i2, int i3, int i4, com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac82fbc926b5959bd190da08fee5f51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac82fbc926b5959bd190da08fee5f51");
        } else {
            this.g.a(view, i, i2, i3, i4, cVar);
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8883a5658db188251d5d1e04834ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8883a5658db188251d5d1e04834ac7");
        } else {
            this.g.a(view, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void a(View view, int i, int i2, int i3, int i4, com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68327545901b28e3511af9e0961a4f40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68327545901b28e3511af9e0961a4f40");
        } else {
            b(view, i, i2, i3, i4, cVar);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d43b7529f3a11f0d44a9396fb5364cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d43b7529f3a11f0d44a9396fb5364cc7");
        } else {
            a(view, i, i2, i3, i4);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c1118f7656b7674254eb7b83976d0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c1118f7656b7674254eb7b83976d0a");
        } else if (this.d) {
            this.h += i2;
            if (this.h < 0) {
                this.h = 0;
                this.i = 0;
            }
            int i3 = this.h;
            int i4 = this.i;
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e1610eccfac95a97ef93b02eadb3e30", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e1610eccfac95a97ef93b02eadb3e30");
            } else {
                if (Math.abs(i3 - i4) >= 8 && this.b != 2) {
                    setSmoothNestedScrollState(1);
                }
                if (this.e != null) {
                    this.e.b(this, i3);
                }
            }
            this.i = this.h;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cc02829c0549138fbe82e07d7860fd0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cc02829c0549138fbe82e07d7860fd0")).booleanValue();
        }
        if (this.c != 1.0f) {
            i2 = (int) (i2 * this.c);
        }
        return super.fling(i, i2);
    }

    public void setFlingFactor(float f) {
        this.c = f;
    }

    public void setNotifyScrollChange(boolean z) {
        this.d = z;
    }
}
