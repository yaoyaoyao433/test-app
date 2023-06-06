package com.sankuai.waimai.business.ugc.machpro.waterfall;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.ad;
import android.util.SparseIntArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public static ChangeQuickRedirect a;
    int b;
    private SparseIntArray c;
    private a d;
    private MPWaterfallComponent e;

    public MPStaggeredGridLayoutManager(int i, int i2, MPWaterfallComponent mPWaterfallComponent) {
        super(i, i2);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), mPWaterfallComponent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "298053114e2815630bfe0c7ff266c481", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "298053114e2815630bfe0c7ff266c481");
            return;
        }
        this.c = new SparseIntArray();
        this.e = mPWaterfallComponent;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        int i5 = 0;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b037c03de8adbf8705b7fa3c0345a892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b037c03de8adbf8705b7fa3c0345a892");
            return;
        }
        super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
        if ((view.getLayoutParams() instanceof StaggeredGridLayoutManager.b) && ((StaggeredGridLayoutManager.b) view.getLayoutParams()).b() == 0) {
            int i6 = this.b;
            int childAdapterPosition = this.e.b.getChildAdapterPosition(view);
            if (!this.e.c.b() || childAdapterPosition != 0) {
                i5 = i6;
            }
            this.c.put(getPosition(view), view.getHeight() + i5);
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ddba8ddc94dc4bf049ce03f73150b11", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ddba8ddc94dc4bf049ce03f73150b11")).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        try {
            int[] findFirstVisibleItemPositions = findFirstVisibleItemPositions(null);
            if (findFirstVisibleItemPositions.length == 2) {
                int i = -((int) findViewByPosition(findFirstVisibleItemPositions[0]).getY());
                for (int i2 = 0; i2 < findFirstVisibleItemPositions[0]; i2++) {
                    i += this.c.get(i2);
                }
                return i;
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7d1327b43f35a6c07f3b786643fece6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7d1327b43f35a6c07f3b786643fece6");
            return;
        }
        if (this.d == null) {
            this.d = new a(recyclerView.getContext());
        }
        this.d.setTargetPosition(i);
        startSmoothScroll(this.d);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7a05d88351a564929d2959c46bfe5e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7a05d88351a564929d2959c46bfe5e4");
        } else {
            super.scrollToPositionWithOffset(i, 0);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends ad {
        public static ChangeQuickRedirect a;

        @Override // android.support.v7.widget.ad
        public final int getVerticalSnapPreference() {
            return -1;
        }

        public a(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f5079e2266f307a57e41dee24a7d3c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f5079e2266f307a57e41dee24a7d3c");
            }
        }
    }
}
