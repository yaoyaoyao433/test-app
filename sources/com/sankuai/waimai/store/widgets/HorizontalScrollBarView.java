package com.sankuai.waimai.store.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HorizontalScrollBarView extends View {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public Paint d;
    private int e;
    private int f;
    private int g;
    private int h;
    private RecyclerView.k i;

    public static /* synthetic */ void a(HorizontalScrollBarView horizontalScrollBarView, SCRecyclerView sCRecyclerView, int i) {
        int i2 = 0;
        Object[] objArr = {sCRecyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, horizontalScrollBarView, changeQuickRedirect, false, "b2e06030204eaaa2e0ed1315bb0bf810", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, horizontalScrollBarView, changeQuickRedirect, false, "b2e06030204eaaa2e0ed1315bb0bf810");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.b("HorizontalScrollBarView,scrollX=%d", Integer.valueOf(i));
        int g = q.g(sCRecyclerView);
        float itemCount = g > 0 ? (sCRecyclerView.getAdapter().getItemCount() - sCRecyclerView.getFooterCount()) / g : 1.0f;
        if (horizontalScrollBarView.h <= 0) {
            Object[] objArr2 = {sCRecyclerView};
            ChangeQuickRedirect changeQuickRedirect2 = q.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "41e264ba73527a4baa7e33b0dfc917df", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "41e264ba73527a4baa7e33b0dfc917df")).intValue();
            } else {
                LinearLayoutManager h = q.h(sCRecyclerView);
                if (h != null) {
                    int g2 = q.g(sCRecyclerView);
                    View findViewByPosition = h.findViewByPosition(h.findFirstVisibleItemPosition());
                    if (findViewByPosition != null) {
                        i2 = findViewByPosition.getWidth() * g2;
                    }
                }
            }
            horizontalScrollBarView.h = i2;
        }
        horizontalScrollBarView.a(Math.min(1.0f, (i * 1.0f) / ((horizontalScrollBarView.h * itemCount) - horizontalScrollBarView.g)));
    }

    public HorizontalScrollBarView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04ff1dc395579460008671f747ced9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04ff1dc395579460008671f747ced9f");
            return;
        }
        this.i = new RecyclerView.k() { // from class: com.sankuai.waimai.store.widgets.HorizontalScrollBarView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int findFirstVisibleItemPosition;
                View findViewByPosition;
                int i3 = 0;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33bba1c84e71ff35bcceaa192536ce11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33bba1c84e71ff35bcceaa192536ce11");
                } else if (HorizontalScrollBarView.this.getVisibility() != 8 && (recyclerView instanceof SCRecyclerView)) {
                    HorizontalScrollBarView horizontalScrollBarView = HorizontalScrollBarView.this;
                    SCRecyclerView sCRecyclerView = (SCRecyclerView) recyclerView;
                    Object[] objArr3 = {recyclerView};
                    ChangeQuickRedirect changeQuickRedirect3 = q.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ed188033c0c8d62e25bd200bf6b630c2", RobustBitConfig.DEFAULT_VALUE)) {
                        i3 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ed188033c0c8d62e25bd200bf6b630c2")).intValue();
                    } else {
                        LinearLayoutManager h = q.h(recyclerView);
                        if (h != null && (findViewByPosition = h.findViewByPosition((findFirstVisibleItemPosition = h.findFirstVisibleItemPosition()))) != null) {
                            i3 = Math.max(0, (findFirstVisibleItemPosition * findViewByPosition.getWidth()) - findViewByPosition.getLeft());
                        }
                    }
                    HorizontalScrollBarView.a(horizontalScrollBarView, sCRecyclerView, i3);
                }
            }
        };
        a();
    }

    public HorizontalScrollBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900d4ccbc334bf8627407e84e7142828", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900d4ccbc334bf8627407e84e7142828");
            return;
        }
        this.i = new RecyclerView.k() { // from class: com.sankuai.waimai.store.widgets.HorizontalScrollBarView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int findFirstVisibleItemPosition;
                View findViewByPosition;
                int i3 = 0;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33bba1c84e71ff35bcceaa192536ce11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33bba1c84e71ff35bcceaa192536ce11");
                } else if (HorizontalScrollBarView.this.getVisibility() != 8 && (recyclerView instanceof SCRecyclerView)) {
                    HorizontalScrollBarView horizontalScrollBarView = HorizontalScrollBarView.this;
                    SCRecyclerView sCRecyclerView = (SCRecyclerView) recyclerView;
                    Object[] objArr3 = {recyclerView};
                    ChangeQuickRedirect changeQuickRedirect3 = q.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ed188033c0c8d62e25bd200bf6b630c2", RobustBitConfig.DEFAULT_VALUE)) {
                        i3 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ed188033c0c8d62e25bd200bf6b630c2")).intValue();
                    } else {
                        LinearLayoutManager h = q.h(recyclerView);
                        if (h != null && (findViewByPosition = h.findViewByPosition((findFirstVisibleItemPosition = h.findFirstVisibleItemPosition()))) != null) {
                            i3 = Math.max(0, (findFirstVisibleItemPosition * findViewByPosition.getWidth()) - findViewByPosition.getLeft());
                        }
                    }
                    HorizontalScrollBarView.a(horizontalScrollBarView, sCRecyclerView, i3);
                }
            }
        };
        a();
    }

    public HorizontalScrollBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "005c9805398fbb11512b9a4234537afa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "005c9805398fbb11512b9a4234537afa");
            return;
        }
        this.i = new RecyclerView.k() { // from class: com.sankuai.waimai.store.widgets.HorizontalScrollBarView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i2, int i22) {
                int findFirstVisibleItemPosition;
                View findViewByPosition;
                int i3 = 0;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i22)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33bba1c84e71ff35bcceaa192536ce11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33bba1c84e71ff35bcceaa192536ce11");
                } else if (HorizontalScrollBarView.this.getVisibility() != 8 && (recyclerView instanceof SCRecyclerView)) {
                    HorizontalScrollBarView horizontalScrollBarView = HorizontalScrollBarView.this;
                    SCRecyclerView sCRecyclerView = (SCRecyclerView) recyclerView;
                    Object[] objArr3 = {recyclerView};
                    ChangeQuickRedirect changeQuickRedirect3 = q.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ed188033c0c8d62e25bd200bf6b630c2", RobustBitConfig.DEFAULT_VALUE)) {
                        i3 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ed188033c0c8d62e25bd200bf6b630c2")).intValue();
                    } else {
                        LinearLayoutManager h = q.h(recyclerView);
                        if (h != null && (findViewByPosition = h.findViewByPosition((findFirstVisibleItemPosition = h.findFirstVisibleItemPosition()))) != null) {
                            i3 = Math.max(0, (findFirstVisibleItemPosition * findViewByPosition.getWidth()) - findViewByPosition.getLeft());
                        }
                    }
                    HorizontalScrollBarView.a(horizontalScrollBarView, sCRecyclerView, i3);
                }
            }
        };
        a();
    }

    public HorizontalScrollBarView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd0d88e65c7499af29ecab899afbdb77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd0d88e65c7499af29ecab899afbdb77");
            return;
        }
        this.i = new RecyclerView.k() { // from class: com.sankuai.waimai.store.widgets.HorizontalScrollBarView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i22, int i222) {
                int findFirstVisibleItemPosition;
                View findViewByPosition;
                int i3 = 0;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i22), Integer.valueOf(i222)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33bba1c84e71ff35bcceaa192536ce11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33bba1c84e71ff35bcceaa192536ce11");
                } else if (HorizontalScrollBarView.this.getVisibility() != 8 && (recyclerView instanceof SCRecyclerView)) {
                    HorizontalScrollBarView horizontalScrollBarView = HorizontalScrollBarView.this;
                    SCRecyclerView sCRecyclerView = (SCRecyclerView) recyclerView;
                    Object[] objArr3 = {recyclerView};
                    ChangeQuickRedirect changeQuickRedirect3 = q.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ed188033c0c8d62e25bd200bf6b630c2", RobustBitConfig.DEFAULT_VALUE)) {
                        i3 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ed188033c0c8d62e25bd200bf6b630c2")).intValue();
                    } else {
                        LinearLayoutManager h = q.h(recyclerView);
                        if (h != null && (findViewByPosition = h.findViewByPosition((findFirstVisibleItemPosition = h.findFirstVisibleItemPosition()))) != null) {
                            i3 = Math.max(0, (findFirstVisibleItemPosition * findViewByPosition.getWidth()) - findViewByPosition.getLeft());
                        }
                    }
                    HorizontalScrollBarView.a(horizontalScrollBarView, sCRecyclerView, i3);
                }
            }
        };
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc00bd66274fc4c798c7fa012ad0ac7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc00bd66274fc4c798c7fa012ad0ac7b");
            return;
        }
        setWillNotDraw(false);
        this.f = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_2);
        this.d = new Paint(1);
        this.g = h.a(getContext());
    }

    public void setRecyclerWidth(int i) {
        this.h = i;
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f545b6eceb02b237d04f00d3ca854a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f545b6eceb02b237d04f00d3ca854a4");
            return;
        }
        this.e = (int) (f * (getWidth() - this.b));
        a(this.e);
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1850a61a2f0e87664855f6ae8e5aca79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1850a61a2f0e87664855f6ae8e5aca79");
            return;
        }
        this.e = i;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f087865c94a00a6f169507951f71fc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f087865c94a00a6f169507951f71fc1");
        } else {
            canvas.drawRoundRect(this.e, 0.0f, this.e + this.b, getHeight(), this.f, this.f, this.d);
        }
    }
}
