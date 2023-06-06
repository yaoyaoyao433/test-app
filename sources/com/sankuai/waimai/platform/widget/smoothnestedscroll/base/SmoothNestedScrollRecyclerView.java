package com.sankuai.waimai.platform.widget.smoothnestedscroll.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.d;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SmoothNestedScrollRecyclerView extends RecyclerView implements e {
    public static ChangeQuickRedirect a;
    protected final d b;

    public SmoothNestedScrollRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e596621c78a82b02f602001bbedb2a51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e596621c78a82b02f602001bbedb2a51");
        } else {
            this.b = new d(this);
        }
    }

    public SmoothNestedScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13fd119b09b7bd00e7ab010ba21b82d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13fd119b09b7bd00e7ab010ba21b82d7");
        } else {
            this.b = new d(this);
        }
    }

    public SmoothNestedScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19d41d71533dee0af30602f3a84331b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19d41d71533dee0af30602f3a84331b6");
        } else {
            this.b = new d(this);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf770bf9d797c2c67d308de6180a8751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf770bf9d797c2c67d308de6180a8751");
            return;
        }
        this.b.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c1d19869c489c24088c77a5992eeb6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c1d19869c489c24088c77a5992eeb6f");
            return;
        }
        this.b.a();
        super.onStartTemporaryDetach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db3f7a3bace3ed8dccc5bd79a52ad87e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db3f7a3bace3ed8dccc5bd79a52ad87e")).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8c4ced580acffbf20ae700366f6244d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8c4ced580acffbf20ae700366f6244d")).booleanValue();
        }
        try {
            if (this.b.b()) {
                return true;
            }
            this.b.a();
            return super.onInterceptTouchEvent(motionEvent);
        } finally {
            this.b.a();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e6469d1f1398538106e8228078d64c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e6469d1f1398538106e8228078d64c3")).booleanValue();
        }
        b(this, 0, (int) f, 0, (int) f2, new c() { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.base.SmoothNestedScrollRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
            public final void a(View view, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c1330daa8acc95ff96b674bad3f05e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c1330daa8acc95ff96b674bad3f05e2");
                } else {
                    SmoothNestedScrollRecyclerView.this.b.a(i, i2, i3, i4, new c() { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.base.SmoothNestedScrollRecyclerView.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
                        public final void a(View view2, int i5, int i6, int i7, int i8) {
                            Object[] objArr3 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c1d7182a30a7fbef3296c9c7a42043d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c1d7182a30a7fbef3296c9c7a42043d");
                            } else {
                                SmoothNestedScrollRecyclerView.this.a(view2, i5, i6, i7, i8);
                            }
                        }
                    });
                }
            }
        });
        return true;
    }

    private void b(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62c69d8590478d54053ab4a0ea650f93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62c69d8590478d54053ab4a0ea650f93");
        } else {
            this.b.a(view, i, i2, i3, i4, cVar);
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "047fa7bd9ea85106f48a4f3e15c5d768", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "047fa7bd9ea85106f48a4f3e15c5d768");
        } else {
            this.b.a(view, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void a(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6698f492dbcc8eef94d696312610012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6698f492dbcc8eef94d696312610012");
        } else {
            b(view, i, i2, i3, i4, cVar);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa81edb45e9dfe779fd323e05c7fccde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa81edb45e9dfe779fd323e05c7fccde");
        } else {
            a(view, i, i2, i3, i4);
        }
    }
}
