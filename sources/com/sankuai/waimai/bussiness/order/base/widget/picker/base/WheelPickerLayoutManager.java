package com.sankuai.waimai.bussiness.order.base.widget.picker.base;

import android.graphics.PointF;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WheelPickerLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public boolean d;
    private RecyclerWheelPicker e;
    private int f;
    private SparseArray<Rect> g;
    private final float h;

    public WheelPickerLayoutManager(RecyclerWheelPicker recyclerWheelPicker) {
        super(recyclerWheelPicker.getContext());
        Object[] objArr = {recyclerWheelPicker};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1120fc044a79c9c3f8cde405a535d3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1120fc044a79c9c3f8cde405a535d3a");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.f = 0;
        this.d = false;
        this.h = 50.0f;
        this.e = recyclerWheelPicker;
        setOrientation(1);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setOrientation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "112ea79f758d89b315cbf12ff67fd3a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "112ea79f758d89b315cbf12ff67fd3a0");
        } else {
            super.setOrientation(1);
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.g generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e7b475f428566f9536eeae928825c3b", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e7b475f428566f9536eeae928825c3b") : new RecyclerView.g(-1, -2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        int i = 0;
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2336b98db10d403e5107e52963c5e478", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2336b98db10d403e5107e52963c5e478");
            return;
        }
        super.onLayoutChildren(mVar, state);
        if (getItemCount() <= 0 || state.g) {
            return;
        }
        detachAndScrapAttachedViews(mVar);
        View b = mVar.b(0);
        measureChildWithMargins(b, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(b);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(b);
        this.c = decoratedMeasuredHeight;
        int i2 = decoratedMeasuredHeight / 2;
        this.f = (b() / 2) + i2;
        this.g = new SparseArray<>();
        int paddingTop = getPaddingTop() + ((b() / 2) - i2);
        while (i < getItemCount()) {
            int i3 = paddingTop + decoratedMeasuredHeight;
            this.g.put(i, new Rect(getPaddingLeft(), paddingTop, getPaddingLeft() + decoratedMeasuredWidth, i3));
            i++;
            paddingTop = i3;
        }
        a(mVar, state);
    }

    private void a(RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0c883a008ea5659fb6d8554e6bd78a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0c883a008ea5659fb6d8554e6bd78a7");
        } else if (getItemCount() > 0 && !state.g) {
            int i = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            Rect rect = new Rect(0, i, PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8828ddb39d5885391822388cb2b3242e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8828ddb39d5885391822388cb2b3242e")).intValue() : (getWidth() - getPaddingLeft()) - getPaddingRight(), b() + this.b);
            Rect rect2 = new Rect();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                rect2.set(getDecoratedLeft(childAt), getDecoratedTop(childAt), getDecoratedRight(childAt), getDecoratedBottom(childAt));
                if (!Rect.intersects(rect, rect2)) {
                    removeAndRecycleView(childAt, mVar);
                }
            }
            for (int i3 = 0; i3 < getItemCount(); i3++) {
                Rect rect3 = this.g.get(i3);
                if (Rect.intersects(rect, rect3)) {
                    View b = mVar.b(i3);
                    addView(b);
                    measureChildWithMargins(b, 0, 0);
                    calculateItemDecorationsForChild(b, new Rect());
                    layoutDecorated(b, rect3.left, rect3.top - this.b, rect3.right, rect3.bottom - this.b);
                }
            }
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3585a821399cab6854199e28504d2d7b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3585a821399cab6854199e28504d2d7b")).booleanValue() : this.e.b;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        int itemCount;
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ff9536ec73e7d6a55aab3ef9f14b403", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ff9536ec73e7d6a55aab3ef9f14b403")).intValue();
        }
        detachAndScrapAttachedViews(mVar);
        this.d = false;
        if (getItemCount() == 0) {
            this.b = 0;
            i = 0;
        }
        if (i < 0) {
            if (this.b + i <= (-this.c)) {
                this.d = true;
            }
            if (this.b + i <= (-this.f)) {
                i = getChildCount() == 0 ? (-(this.b + this.f)) + 5 : 5;
            }
        }
        if (i > 0) {
            int itemCount2 = (this.b - ((getItemCount() - 1) * this.c)) + i;
            if (itemCount2 >= 0) {
                this.d = true;
            }
            if (i > 0 && itemCount2 >= this.f) {
                i = getChildCount() == 0 ? (-(itemCount - this.f)) - 5 : -5;
            }
        }
        offsetChildrenVertical(-i);
        a(mVar, state);
        this.b += i;
        return i;
    }

    public final int a() {
        View view;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10aab9137fddd01bba85fd7d73c1b8ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10aab9137fddd01bba85fd7d73c1b8ce")).intValue();
        }
        if (getItemCount() == 0) {
            return 0;
        }
        if (this.e.getChildCount() == 0) {
            return -1;
        }
        int findFirstCompletelyVisibleItemPosition = findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = findLastCompletelyVisibleItemPosition();
        if (findFirstCompletelyVisibleItemPosition == findLastCompletelyVisibleItemPosition) {
            return findFirstCompletelyVisibleItemPosition;
        }
        while (findFirstCompletelyVisibleItemPosition <= findLastCompletelyVisibleItemPosition) {
            RecyclerView.s findViewHolderForAdapterPosition = this.e.findViewHolderForAdapterPosition(findFirstCompletelyVisibleItemPosition);
            if (findViewHolderForAdapterPosition != null && (view = findViewHolderForAdapterPosition.itemView) != null && Math.abs((b() / 2) - (view.getTop() + (view.getHeight() / 2))) <= 1) {
                return findFirstCompletelyVisibleItemPosition;
            }
            findFirstCompletelyVisibleItemPosition++;
        }
        return -1;
    }

    private int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9285caf3b3140b6c4f027e4027ce46a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9285caf3b3140b6c4f027e4027ce46a")).intValue() : (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20af9e1b046a807d65597d62b5ef04c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20af9e1b046a807d65597d62b5ef04c0");
        } else if (i < 0) {
        } else {
            this.e.scrollBy(0, i2 * i);
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a63bb09a80b6180f15c50ecc8affae55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a63bb09a80b6180f15c50ecc8affae55");
            return;
        }
        ad adVar = new ad(recyclerView.getContext()) { // from class: com.sankuai.waimai.bussiness.order.base.widget.picker.base.WheelPickerLayoutManager.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.ad
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 50.0f / displayMetrics.densityDpi;
            }

            @Override // android.support.v7.widget.ad
            public final PointF computeScrollVectorForPosition(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57a769f80ccd1a4d8c7f8ca237f83b21", RobustBitConfig.DEFAULT_VALUE) ? (PointF) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57a769f80ccd1a4d8c7f8ca237f83b21") : WheelPickerLayoutManager.this.computeScrollVectorForPosition(i2);
            }
        };
        adVar.setTargetPosition(i);
        startSmoothScroll(adVar);
    }
}
