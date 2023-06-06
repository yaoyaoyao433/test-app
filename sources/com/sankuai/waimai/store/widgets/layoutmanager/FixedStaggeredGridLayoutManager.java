package com.sankuai.waimai.store.widgets.layoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.ad;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FixedStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public static ChangeQuickRedirect a;
    public RecyclerView b;
    public int c;
    private Map<Integer, Integer> d;

    public FixedStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8077234a1ded97bcc1d912adb3b194e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8077234a1ded97bcc1d912adb3b194e8");
            return;
        }
        this.d = new HashMap();
        this.c = 0;
    }

    public FixedStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7067a0705b53000d7b573ee57c1cfc6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7067a0705b53000d7b573ee57c1cfc6b");
            return;
        }
        this.d = new HashMap();
        this.c = 0;
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44064ab4315f6eca4e570d95bad63a5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44064ab4315f6eca4e570d95bad63a5e");
            return;
        }
        try {
            super.onLayoutChildren(mVar, state);
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11cef4bf815cd80cf244b3de7f7402a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11cef4bf815cd80cf244b3de7f7402a3");
            return;
        }
        try {
            super.onScrollStateChanged(i);
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebe2441b8cc0419762fd476743124a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebe2441b8cc0419762fd476743124a0f");
            return;
        }
        try {
            super.onItemsAdded(recyclerView, i, i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c0e16f39a888cc88aa4ecbb3b6a3bd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c0e16f39a888cc88aa4ecbb3b6a3bd9");
            return;
        }
        try {
            super.onItemsMoved(recyclerView, i, i2, i3);
        } catch (ArrayIndexOutOfBoundsException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8fcb1710fc0eafec618bacdb03c78e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8fcb1710fc0eafec618bacdb03c78e2");
            return;
        }
        try {
            super.onItemsUpdated(recyclerView, i, i2, obj);
        } catch (ArrayIndexOutOfBoundsException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c70737c682a84fada55fc25db460d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c70737c682a84fada55fc25db460d2");
            return;
        }
        try {
            super.onItemsRemoved(recyclerView, i, i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94bafe7ac7de48ad17f19f90bd8e304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94bafe7ac7de48ad17f19f90bd8e304");
            return;
        }
        super.onAttachedToWindow(recyclerView);
        this.b = recyclerView;
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da415cd856cf18514095aac6336e5b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da415cd856cf18514095aac6336e5b0");
            return;
        }
        super.onLayoutCompleted(state);
        int childCount = getChildCount();
        this.c = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            this.d.put(Integer.valueOf(i), Integer.valueOf(childAt.getHeight()));
            this.c += childAt.getHeight();
        }
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "550607dcdce2c61320930a5b91ac7586", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "550607dcdce2c61320930a5b91ac7586")).intValue();
        }
        int childCount = getChildCount();
        if (i > childCount) {
            i = childCount;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += getChildAt(i3).getHeight();
        }
        return i2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends ad {
        public static ChangeQuickRedirect a;
        private final FixedStaggeredGridLayoutManager b;
        private final int c;
        private final int d;
        private final boolean e;

        public a(Context context, FixedStaggeredGridLayoutManager fixedStaggeredGridLayoutManager, int i, int i2, boolean z) {
            super(context);
            Object[] objArr = {context, fixedStaggeredGridLayoutManager, -1, Integer.valueOf(i2), (byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e9bbcdd49e95f4f82162e150000369", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e9bbcdd49e95f4f82162e150000369");
                return;
            }
            this.b = fixedStaggeredGridLayoutManager;
            this.c = -1;
            this.d = i2;
            this.e = false;
        }

        @Override // android.support.v7.widget.ad
        public final PointF computeScrollVectorForPosition(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e26184023cf21ea7150eddb90cf3c96", RobustBitConfig.DEFAULT_VALUE) ? (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e26184023cf21ea7150eddb90cf3c96") : this.b.computeScrollVectorForPosition(i);
        }

        @Override // android.support.v7.widget.ad
        public final int calculateTimeForScrolling(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ce405e293656aa7522de3545522ed43", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ce405e293656aa7522de3545522ed43")).intValue() : Math.min(super.calculateTimeForScrolling(i) * 2, 200);
        }

        @Override // android.support.v7.widget.ad
        public final int getVerticalSnapPreference() {
            return this.c;
        }

        @Override // android.support.v7.widget.ad
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea815ae79d41ee48e6d8bcfd439bb7d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea815ae79d41ee48e6d8bcfd439bb7d")).intValue();
            }
            if (this.e) {
                return ((i3 + i4) / 2) - ((i + i2) / 2);
            }
            return super.calculateDtToFit(i, i2, i3, i4, i5) + this.d;
        }
    }
}
