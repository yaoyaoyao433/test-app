package com.sankuai.waimai.platform.widget.smoothnestedscroll;

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
public class NovaSmoothRecyclerView extends RecyclerView implements e {
    public static ChangeQuickRedirect a;
    protected final d b;

    public NovaSmoothRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480ec4066789a1a29da23b8182ba1824", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480ec4066789a1a29da23b8182ba1824");
        } else {
            this.b = new d(this);
        }
    }

    public NovaSmoothRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f39f5eeffa2f43e6bcc7b6bcb98a3f59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f39f5eeffa2f43e6bcc7b6bcb98a3f59");
        } else {
            this.b = new d(this);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93338c54881e3e7f6af48fe237cbcbe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93338c54881e3e7f6af48fe237cbcbe0");
            return;
        }
        this.b.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54b3348299c567b43ba6999e37060b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54b3348299c567b43ba6999e37060b67");
            return;
        }
        this.b.a();
        super.onStartTemporaryDetach();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2332c1d7f8a37ebb1864e132276b7048", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2332c1d7f8a37ebb1864e132276b7048")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8991e57400cde3702d33cbddb39c03", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8991e57400cde3702d33cbddb39c03")).booleanValue();
        }
        b(this, 0, (int) f, 0, (int) f2, new c() { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.NovaSmoothRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
            public final void a(View view, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99222072a51c7651892fdea44c59e09d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99222072a51c7651892fdea44c59e09d");
                } else {
                    NovaSmoothRecyclerView.this.b.a(i, i2, i3, i4, new c() { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.NovaSmoothRecyclerView.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
                        public final void a(View view2, int i5, int i6, int i7, int i8) {
                            Object[] objArr3 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "749fc90e219b0f6defca15dfcbc2e73b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "749fc90e219b0f6defca15dfcbc2e73b");
                            } else {
                                NovaSmoothRecyclerView.this.a(view2, i5, i6, i7, i8);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f5420ac20457331da8458e6d249151", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f5420ac20457331da8458e6d249151");
        } else {
            this.b.a(view, i, i2, i3, i4, cVar);
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e4091f6687818d073984d52c5e4bf45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e4091f6687818d073984d52c5e4bf45");
        } else {
            this.b.a(view, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void a(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3480e615c1a947ee93e1d62ee7cf7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3480e615c1a947ee93e1d62ee7cf7a");
        } else {
            b(view, i, i2, i3, i4, cVar);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d5cb3c3de1817ee25798cf9110632b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d5cb3c3de1817ee25798cf9110632b3");
        } else {
            a(view, i, i2, i3, i4);
        }
    }
}
