package com.sankuai.waimai.store.widgets.smoothnestedscroll.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.d;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SmoothNestedScrollRecyclerView extends RecyclerView implements e {
    public static ChangeQuickRedirect d;
    private b a;
    protected boolean e;
    protected final d f;

    public SmoothNestedScrollRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a79a5604cec500c516fb451a1b557a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a79a5604cec500c516fb451a1b557a");
            return;
        }
        this.e = false;
        this.f = new d(this);
    }

    public SmoothNestedScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4337711bcb0631ae9fdda341a7be4874", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4337711bcb0631ae9fdda341a7be4874");
            return;
        }
        this.e = false;
        this.f = new d(this);
    }

    public SmoothNestedScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5440375bff55b64bf26c1811c4b78216", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5440375bff55b64bf26c1811c4b78216");
            return;
        }
        this.e = false;
        this.f = new d(this);
    }

    public void setScrollStopListener(b bVar) {
        this.a = bVar;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b32289cf0e37616fbefc1ad4c532676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b32289cf0e37616fbefc1ad4c532676");
            return;
        }
        this.f.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c824f12cc13cb597e27cc596fbdb90d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c824f12cc13cb597e27cc596fbdb90d8");
            return;
        }
        this.f.a();
        super.onStartTemporaryDetach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42b6729f6feb9c0f849252d10b830c1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42b6729f6feb9c0f849252d10b830c1e")).booleanValue();
        }
        if (this.e) {
            return true;
        }
        this.f.a();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad4895138bacadf87c17e50b215eba22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad4895138bacadf87c17e50b215eba22")).booleanValue();
        }
        b(this, 0, (int) f, 0, (int) f2, new c() { // from class: com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c
            public final void a(View view, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5843926777765a4c88a9f7084fd30654", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5843926777765a4c88a9f7084fd30654");
                } else {
                    SmoothNestedScrollRecyclerView.this.f.a(i, i2, i3, i4, new c() { // from class: com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollRecyclerView.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c
                        public final void a(View view2, int i5, int i6, int i7, int i8) {
                            Object[] objArr3 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2109e932a10e23cb08e880f95c9ec509", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2109e932a10e23cb08e880f95c9ec509");
                                return;
                            }
                            SmoothNestedScrollRecyclerView.this.b(view2, i5, i6, i7, i8);
                            if (SmoothNestedScrollRecyclerView.this.a != null) {
                                SmoothNestedScrollRecyclerView.this.a.a();
                            }
                        }
                    });
                }
            }
        });
        return true;
    }

    public void b(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccde686978ce1d95e596929b16cff247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccde686978ce1d95e596929b16cff247");
        } else {
            this.f.a(view, i, i2, i3, i4, cVar);
        }
    }

    public void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41334683730784ff90e139b75b32b046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41334683730784ff90e139b75b32b046");
        } else {
            this.f.a(view, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e
    public final void a(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53fe40a8bd7dd994c78414f7734debb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53fe40a8bd7dd994c78414f7734debb5");
        } else {
            b(view, i, i2, i3, i4, cVar);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e
    public final void a_(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa67d76299b8e364fa0c6b124a3e689d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa67d76299b8e364fa0c6b124a3e689d");
        } else {
            b(view, i, i2, i3, i4);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "699770e07eb1076313b7f2438f441b3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "699770e07eb1076313b7f2438f441b3b");
        } else {
            this.f.a();
        }
    }

    public void setForbidScroll(boolean z) {
        this.e = z;
    }
}
