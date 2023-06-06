package com.sankuai.waimai.platform.widget.smoothnestedscroll.base;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.foundation.utils.o;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.d;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SmoothNestedScrollView extends NestedScrollView implements e {
    public static ChangeQuickRedirect b;
    private VelocityTracker a;
    public final d c;
    private boolean d;
    private int e;
    private int f;
    private int g;

    public SmoothNestedScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff2519cd3526e7492225d1e41da7098e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff2519cd3526e7492225d1e41da7098e");
            return;
        }
        this.c = new d(this);
        this.a = VelocityTracker.obtain();
        this.d = false;
        a(context);
    }

    public SmoothNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd3517e4c5be0da311d357d3ca1c3de5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd3517e4c5be0da311d357d3ca1c3de5");
            return;
        }
        this.c = new d(this);
        this.a = VelocityTracker.obtain();
        this.d = false;
        a(context);
    }

    public SmoothNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc584537ca242ef467e39d40c0b828e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc584537ca242ef467e39d40c0b828e");
            return;
        }
        this.c = new d(this);
        this.a = VelocityTracker.obtain();
        this.d = false;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b01c3c91f38ecd07fb3e5f89644a5119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b01c3c91f38ecd07fb3e5f89644a5119");
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3d77ae626be488be2d22a525a96be3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3d77ae626be488be2d22a525a96be3c");
            return;
        }
        this.c.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d091dbf1b308eb6f0226a73a2bf807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d091dbf1b308eb6f0226a73a2bf807");
            return;
        }
        this.c.a();
        super.onStartTemporaryDetach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab9bc1d988cb0b19fe045daa61d9729d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab9bc1d988cb0b19fe045daa61d9729d")).booleanValue();
        }
        this.c.a();
        if (motionEvent.getAction() == 0) {
            this.a.clear();
            this.g = (int) motionEvent.getRawY();
        }
        this.a.addMovement(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70478eef130e17787ed087fe572a0093", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70478eef130e17787ed087fe572a0093")).booleanValue();
        }
        this.d = false;
        switch (motionEvent.getAction()) {
            case 1:
                this.a.computeCurrentVelocity(1000, this.f);
                i = -((int) this.a.getYVelocity());
                if (Math.abs(i) > this.e) {
                    if (o.a(this.g - ((int) motionEvent.getRawY())) == o.a(i)) {
                        this.d = true;
                    } else {
                        a.e("LinkedFlingScroll", "error vy ignored", new Object[0]);
                    }
                }
                a.b("LinkedFlingScroll", "vy = %d", Integer.valueOf(i));
                this.a.clear();
                break;
            case 2:
            default:
                i = 0;
                break;
            case 3:
                i = 0;
                this.a.clear();
                break;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.d) {
            this.d = false;
            float f = i;
            if (!dispatchNestedPreFling(0.0f, f)) {
                dispatchNestedFling(0.0f, f, false);
            }
        }
        return onTouchEvent;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3221101d29db98bc7e9ddd139620ae6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3221101d29db98bc7e9ddd139620ae6")).booleanValue();
        }
        this.d = false;
        b(this, 0, (int) f, 0, (int) f2, new c() { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.base.SmoothNestedScrollView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
            public final void a(View view, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6aba276f12636f7ea59b43cb2fe266b1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6aba276f12636f7ea59b43cb2fe266b1");
                } else {
                    SmoothNestedScrollView.this.c.a(i, i2, i3, i4, new c() { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.base.SmoothNestedScrollView.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
                        public final void a(View view2, int i5, int i6, int i7, int i8) {
                            Object[] objArr3 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eaa104dea7e16beeebd7598a2823cca0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eaa104dea7e16beeebd7598a2823cca0");
                            } else {
                                SmoothNestedScrollView.this.a(view2, i5, i6, i7, i8);
                            }
                        }
                    });
                }
            }
        });
        return true;
    }

    public final void b(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "969b28f5db429f675589f769d9fc8fe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "969b28f5db429f675589f769d9fc8fe0");
        } else {
            this.c.a(view, i, i2, i3, i4, cVar);
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f8aff85635c2ef6a49e5d54c8de0994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f8aff85635c2ef6a49e5d54c8de0994");
        } else {
            this.c.a(view, i, i2, i3, i4);
        }
    }

    public void a(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa151b68619c853d5e0a422a50952e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa151b68619c853d5e0a422a50952e9f");
        } else {
            b(view, i, i2, i3, i4, cVar);
        }
    }

    public void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8e81fb66078c8b45607c274d7c4117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8e81fb66078c8b45607c274d7c4117");
        } else {
            a(view, i, i2, i3, i4);
        }
    }

    public void setShouldCallFling(boolean z) {
        this.d = z;
    }
}
