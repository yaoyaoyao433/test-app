package com.sankuai.waimai.store.widgets.recycler;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ExtendedGridLayoutManager extends GridLayoutManager {
    public static ChangeQuickRedirect i;
    private RecyclerView j;

    public ExtendedGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fa5281aa1a0827aa0ba943d701ed6af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fa5281aa1a0827aa0ba943d701ed6af");
        }
    }

    public ExtendedGridLayoutManager(Context context, int i2) {
        super(context, i2);
        Object[] objArr = {context, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097e48b973aee64fd838b1ccef419428", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097e48b973aee64fd838b1ccef419428");
        }
    }

    public ExtendedGridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(context, i2, i3, z);
        Object[] objArr = {context, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d04294099f95177ec213e7ec75a1fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d04294099f95177ec213e7ec75a1fc");
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a03d397d23e245dee25e231695fea4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a03d397d23e245dee25e231695fea4");
            return;
        }
        super.onAttachedToWindow(recyclerView);
        this.j = recyclerView;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.m mVar) {
        Object[] objArr = {recyclerView, mVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfd3f1861d2188bb0a300302115c2d91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfd3f1861d2188bb0a300302115c2d91");
            return;
        }
        super.onDetachedFromWindow(recyclerView, mVar);
        this.j = null;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfac24048489dc6f5e882167bcaad07d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfac24048489dc6f5e882167bcaad07d");
        } else if (recyclerView == null) {
        } else {
            Context context = recyclerView.getContext();
            Object[] objArr2 = {context, this};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            a aVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "30b541b10aeeb8aa09d23257243edb9a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "30b541b10aeeb8aa09d23257243edb9a") : new a(context, this, 0, 0, false);
            aVar.setTargetPosition(i2);
            startSmoothScroll(aVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends ad {
        public static ChangeQuickRedirect a;
        private final ExtendedGridLayoutManager b;
        private final int c;
        private final int d;
        private final boolean e;

        public a(Context context, ExtendedGridLayoutManager extendedGridLayoutManager, int i, int i2, boolean z) {
            super(context);
            Object[] objArr = {context, extendedGridLayoutManager, 0, 0, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b5e9af341129b06b09e7119db6a0492", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b5e9af341129b06b09e7119db6a0492");
                return;
            }
            this.b = extendedGridLayoutManager;
            this.c = 0;
            this.d = 0;
            this.e = false;
        }

        @Override // android.support.v7.widget.ad
        public final PointF computeScrollVectorForPosition(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "756cc485fb9ffe95dad6b210532496ce", RobustBitConfig.DEFAULT_VALUE) ? (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "756cc485fb9ffe95dad6b210532496ce") : this.b.computeScrollVectorForPosition(i);
        }

        @Override // android.support.v7.widget.ad
        public final int calculateTimeForScrolling(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a9006e0909d533798e46009ed67ad16", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a9006e0909d533798e46009ed67ad16")).intValue() : Math.min(super.calculateTimeForScrolling(i) * 2, 200);
        }

        @Override // android.support.v7.widget.ad
        public final int getVerticalSnapPreference() {
            return this.c;
        }

        @Override // android.support.v7.widget.ad
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e673fa091099b0941ce8a4ef9b8a91", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e673fa091099b0941ce8a4ef9b8a91")).intValue();
            }
            if (this.e) {
                return ((i3 + i4) / 2) - ((i + i2) / 2);
            }
            return super.calculateDtToFit(i, i2, i3, i4, i5) + this.d;
        }
    }
}
