package com.sankuai.waimai.store.newwidgets.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.waimai.store.newwidgets.MarketNestedScrollRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCRecyclerView extends MarketNestedScrollRecyclerView implements j.a {
    public static ChangeQuickRedirect b;
    @NonNull
    public final i c;
    private final j g;
    private int h;
    private b i;
    private float j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements com.sankuai.waimai.store.newwidgets.list.b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        boolean a(View view, MotionEvent motionEvent);
    }

    public SCRecyclerView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbb625d812bb8d116bd6fbbeb98060d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbb625d812bb8d116bd6fbbeb98060d4");
        }
    }

    public SCRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78934974ec9b9d12aac263ab0c1a0e8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78934974ec9b9d12aac263ab0c1a0e8c");
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f94f506b2221ac7c0851ef388e55e0e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f94f506b2221ac7c0851ef388e55e0e4")).booleanValue();
        }
        float f = i2;
        if (!com.sankuai.waimai.store.util.g.a(f, 1.0f)) {
            i2 = (int) (f * this.j);
        }
        return super.fling(i, i2);
    }

    public void setFlingFactor(float f) {
        this.j = f;
    }

    public SCRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9676a9a27e60b50bcff9c526afaccd3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9676a9a27e60b50bcff9c526afaccd3");
            return;
        }
        this.j = 1.0f;
        this.c = new p(new a());
        this.g = new j(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.divider, R.attr.dividerHeight, R.attr.dividerPaddingLeft, R.attr.dividerPaddingRight, R.attr.maxHeightLimit}, i, 0);
        Object[] objArr2 = {obtainStyledAttributes};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c2bf0a9384f133e924e2e487af1b380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c2bf0a9384f133e924e2e487af1b380");
        } else {
            j jVar = this.g;
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            Object[] objArr3 = {drawable};
            ChangeQuickRedirect changeQuickRedirect3 = j.a;
            if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "46bcceb21e9c5c7d1d30fb65f889772c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "46bcceb21e9c5c7d1d30fb65f889772c");
            } else {
                if (drawable != null) {
                    jVar.d = drawable.getIntrinsicHeight();
                } else {
                    jVar.d = 0;
                }
                jVar.b = drawable;
            }
            this.g.a(obtainStyledAttributes.getDimensionPixelSize(1, -1));
            j jVar2 = this.g;
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
            if (dimensionPixelSize < 0) {
                jVar2.e = 0;
            } else {
                jVar2.e = dimensionPixelSize;
            }
            j jVar3 = this.g;
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, -1);
            if (dimensionPixelSize2 < 0) {
                jVar3.f = 0;
            } else {
                jVar3.f = dimensionPixelSize2;
            }
        }
        Object[] objArr4 = {obtainStyledAttributes};
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "848aa220b9edea626f5ea93d4e2ce84a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "848aa220b9edea626f5ea93d4e2ce84a");
        } else {
            this.h = obtainStyledAttributes.getLayoutDimension(4, -1);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void setAdapter(RecyclerView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2efc07a6d5dff1aed9b6b9ea5304c024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2efc07a6d5dff1aed9b6b9ea5304c024");
        } else {
            super.setAdapter(aVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        int orientation;
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dbcfa028e297ff7ed7da83e93477f25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dbcfa028e297ff7ed7da83e93477f25");
            return;
        }
        super.setLayoutManager(layoutManager);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe165494f80496af01e20b63213b3935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe165494f80496af01e20b63213b3935");
            return;
        }
        RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
        if (layoutManager2 instanceof LinearLayoutManager) {
            orientation = ((LinearLayoutManager) layoutManager2).getOrientation();
        } else {
            orientation = layoutManager2 instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager2).getOrientation() : -1;
        }
        if (-1 != orientation) {
            this.g.c = orientation;
            super.addItemDecoration(this.g);
        }
    }

    public void setAdapter(f<?, ?> fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86c45f48ea83511b8ec522df3531225b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86c45f48ea83511b8ec522df3531225b");
            return;
        }
        Object[] objArr2 = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4c43d3058b043cd019a970c8f4ed733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4c43d3058b043cd019a970c8f4ed733");
        } else {
            this.c.a(fVar);
            if (fVar == null) {
                this.c.a((i) new a());
            } else {
                this.c.a((i) fVar.f());
            }
        }
        super.setAdapter((RecyclerView.a) this.c);
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57bee59c319799b1947f081db77d7268", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57bee59c319799b1947f081db77d7268")).intValue() : this.c.b(i);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.j.a
    public int getFooterCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5520883940fc2e69fe0ec1fad50f1f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5520883940fc2e69fe0ec1fad50f1f")).intValue() : this.c.b();
    }

    public int getHeaderCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4674015d92c76d23ae5e04916ece2d19", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4674015d92c76d23ae5e04916ece2d19")).intValue() : this.c.a();
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "306e49536da589db8b1e12957c5bfe9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "306e49536da589db8b1e12957c5bfe9a");
        } else {
            this.c.a(view);
        }
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217668204171a8ad4985c67a412c719f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217668204171a8ad4985c67a412c719f");
        } else {
            this.c.b(view);
        }
    }

    public final void setOrientation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33a736644559acb6782ac5f7cb47c1bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33a736644559acb6782ac5f7cb47c1bb");
        } else {
            this.c.j = i;
        }
    }

    public final void a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fddfc3ef67601ef3de13cb810d15c970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fddfc3ef67601ef3de13cb810d15c970");
        } else {
            this.c.a(i, view);
        }
    }

    public void setBottomMargin(int i) {
        View view;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a636b49d3dae86475dd71c3acc40d48f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a636b49d3dae86475dd71c3acc40d48f");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f0e3c0fef2c9904d8c78292797b9c77", RobustBitConfig.DEFAULT_VALUE)) {
            view = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f0e3c0fef2c9904d8c78292797b9c77");
        } else {
            view = new View(getContext());
            view.setMinimumHeight(i);
        }
        b(view);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void scrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a470b91dcc266d0266d01dcf3bb418b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a470b91dcc266d0266d01dcf3bb418b5");
        } else {
            super.scrollToPosition(i + this.c.a());
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58c779926d4712b08f415b485bcd89bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58c779926d4712b08f415b485bcd89bd");
        } else if (this.h > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.h), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10f306e48935c73780bf86937dcc224f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10f306e48935c73780bf86937dcc224f");
        } else {
            super.scrollToPosition(0);
        }
    }

    public void setOnItemClickListener(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "461856a8ec38d212c169ccb848614077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "461856a8ec38d212c169ccb848614077");
        } else {
            this.c.a(kVar);
        }
    }

    public void setOnScrollToBottomOrTopListener(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "430f5d802706190f837deedeabaa0884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "430f5d802706190f837deedeabaa0884");
        } else {
            addOnScrollListener(new c(nVar));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c extends m {
        public static ChangeQuickRedirect a;
        private n b;

        public c(n nVar) {
            Object[] objArr = {nVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7fcd5177a9bfaba324a3ba95389013f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7fcd5177a9bfaba324a3ba95389013f");
            } else {
                this.b = nVar;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            RecyclerView.a adapter;
            Object[] objArr = {recyclerView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f14cc6fa30dd6b58f1e417f29adabbaa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f14cc6fa30dd6b58f1e417f29adabbaa");
            } else if (this.b != null && (adapter = recyclerView.getAdapter()) != null && adapter.getItemCount() > 0 && i == 0) {
                if (q.d(recyclerView)) {
                    this.b.e();
                }
                if (q.c(recyclerView)) {
                    this.b.bm_();
                }
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.m
        public final void a(int i, int i2, RecyclerView recyclerView, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), recyclerView, Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec9529b0524877686c6935eebb57e57f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec9529b0524877686c6935eebb57e57f");
                return;
            }
            RecyclerView.a adapter = recyclerView.getAdapter();
            if (adapter == null || adapter.getItemCount() <= 0) {
                return;
            }
            if (i < 10) {
                this.b.e();
            }
            int itemCount = adapter.getItemCount() - (i + i2);
            if (itemCount < 0 || itemCount > 10) {
                return;
            }
            this.b.bm_();
        }
    }

    public void setDispatchTouchEventListener(b bVar) {
        this.i = bVar;
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollRecyclerView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21eb0204e5fbe9d157c94a9e4ccb79c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21eb0204e5fbe9d157c94a9e4ccb79c7")).booleanValue();
        }
        if (this.i == null || !this.i.a(this, motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public void setDividerHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93cf6fc307f452dd0dfe88630a331508", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93cf6fc307f452dd0dfe88630a331508");
        } else {
            this.g.a(i);
        }
    }
}
