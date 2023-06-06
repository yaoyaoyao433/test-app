package com.sankuai.waimai.business.page.common.view.nested;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ai;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    public final int b;
    @Nullable
    private ai g;
    @Nullable
    private ai h;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2edd395a04bd5f7f640025d4b4d7e8bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2edd395a04bd5f7f640025d4b4d7e8bf");
        } else {
            this.b = a();
        }
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23ff39e5899acd1b29ff07e31fa775ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23ff39e5899acd1b29ff07e31fa775ee")).intValue();
        }
        ABStrategy d = com.sankuai.waimai.business.page.common.abtest.a.d();
        if (d != null) {
            try {
                return Integer.parseInt(d.configInfo);
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }

    @Override // com.sankuai.waimai.business.page.common.view.nested.b
    public final int a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        View a2;
        int position;
        int i3;
        PointF computeScrollVectorForPosition;
        int i4;
        int i5;
        Object[] objArr = {layoutManager, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b7ec337ec547daa0a22f8a2bbc90b6a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b7ec337ec547daa0a22f8a2bbc90b6a")).intValue();
        }
        if (!(layoutManager instanceof RecyclerView.p.b) || (itemCount = layoutManager.getItemCount()) == 0 || (a2 = a(layoutManager)) == null || (position = layoutManager.getPosition(a2)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.p.b) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (layoutManager.canScrollHorizontally()) {
            i4 = a(layoutManager, c(layoutManager), i, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i5 = a(layoutManager, b(layoutManager), 0, i2);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = position + i4;
        if (i6 < 0) {
            i6 = 0;
        }
        return i6 >= itemCount ? i3 : i6;
    }

    private int a(RecyclerView.LayoutManager layoutManager, ai aiVar, int i, int i2) {
        Object[] objArr = {layoutManager, aiVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1db5353880349b8e16d05b86d0aefb4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1db5353880349b8e16d05b86d0aefb4")).intValue();
        }
        int[] a2 = a(i, i2);
        float a3 = a(layoutManager, aiVar);
        if (a3 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(a2[0]) > Math.abs(a2[1]) ? a2[0] : a2[1]) / a3);
    }

    private float a(RecyclerView.LayoutManager layoutManager, ai aiVar) {
        int max;
        Object[] objArr = {layoutManager, aiVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971f9edb16821966f0a3a0f08eb4381c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971f9edb16821966f0a3a0f08eb4381c")).floatValue();
        }
        int i = Integer.MAX_VALUE;
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            int position = layoutManager.getPosition(childAt);
            if (position != -1) {
                if (position < i) {
                    view = childAt;
                    i = position;
                }
                if (position > i2) {
                    view2 = childAt;
                    i2 = position;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(aiVar.b(view), aiVar.b(view2)) - Math.min(aiVar.a(view), aiVar.a(view2))) == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i2 - i) + 1);
    }

    @NonNull
    private ai b(@NonNull RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b30b4d9849173665303e462d6cea2b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ai) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b30b4d9849173665303e462d6cea2b9");
        }
        if (this.g == null) {
            this.g = ai.b(layoutManager);
        }
        return this.g;
    }

    @NonNull
    private ai c(@NonNull RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f6ed08b8cef4f622c6eca0281f4c831", RobustBitConfig.DEFAULT_VALUE)) {
            return (ai) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f6ed08b8cef4f622c6eca0281f4c831");
        }
        if (this.h == null) {
            this.h = ai.a(layoutManager);
        }
        return this.h;
    }

    @Override // com.sankuai.waimai.business.page.common.view.nested.b
    public final int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        Object[] objArr = {layoutManager, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f03c25694516aec6ab1195d71e781b81", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f03c25694516aec6ab1195d71e781b81");
        }
        Object[] objArr2 = {layoutManager, view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a7347a6adfccb4fe80d520a3b69f1ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a7347a6adfccb4fe80d520a3b69f1ff");
        }
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(layoutManager, view, c(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(layoutManager, view, b(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // com.sankuai.waimai.business.page.common.view.nested.b
    public final View a(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22ab1f8cc9a8c00200ee9a3f87839c5b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22ab1f8cc9a8c00200ee9a3f87839c5b") : b(layoutManager, b(layoutManager));
    }

    private View b(RecyclerView.LayoutManager layoutManager, ai aiVar) {
        int childCount;
        Object[] objArr = {layoutManager, aiVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "646f8bac8697259a962283d946864212", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "646f8bac8697259a962283d946864212");
        }
        if ((layoutManager instanceof LinearLayoutManager) && (childCount = layoutManager.getChildCount()) != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == 0) {
                return null;
            }
            int c = aiVar.c();
            int i = Integer.MAX_VALUE;
            View view = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = layoutManager.getChildAt(i2);
                int abs = Math.abs(aiVar.b(childAt) - c);
                if (abs < i) {
                    view = childAt;
                    i = abs;
                }
            }
            if (layoutManager.getChildAt(childCount - 1) == view && layoutManager.getPosition(view) != linearLayoutManager.findLastCompletelyVisibleItemPosition()) {
                View childAt2 = layoutManager.getChildAt(0);
                return (!(linearLayoutManager.findFirstVisibleItemPosition() == 0) || aiVar.a(childAt2) >= 0 || aiVar.a(childAt2) + (aiVar.e(childAt2) / 2) <= aiVar.b()) ? view : childAt2;
            }
            return view;
        }
        return null;
    }

    private int a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, ai aiVar) {
        Object[] objArr = {layoutManager, view, aiVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32aeaaec08e63c57a875fd2b3e6803b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32aeaaec08e63c57a875fd2b3e6803b9")).intValue();
        }
        int a2 = g.a(com.meituan.android.singleton.b.a, 6.0f);
        if (this.b > 0 && this.b < view.getHeight()) {
            a2 += this.b;
        }
        return (aiVar.b(view) - aiVar.c()) + a2;
    }
}
