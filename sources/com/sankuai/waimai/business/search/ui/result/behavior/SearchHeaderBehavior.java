package com.sankuai.waimai.business.search.ui.result.behavior;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SearchHeaderBehavior extends HeaderBehavior<LinearLayout> {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.business.search.ui.result.behavior.HeaderBehavior
    public final /* synthetic */ boolean a(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = linearLayout;
        Object[] objArr = {linearLayout2};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4125a719ee80cd457f3e2da304a8d388", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4125a719ee80cd457f3e2da304a8d388")).booleanValue() : linearLayout2.getY() <= 0.0f;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public /* synthetic */ void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i, int i2, @NonNull int[] iArr, int i3) {
        LinearLayout linearLayout = (LinearLayout) view;
        Object[] objArr = {coordinatorLayout, linearLayout, view2, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba2f81ea14ce6a1b48dd8941f38274e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba2f81ea14ce6a1b48dd8941f38274e");
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, linearLayout, view2, i, i2, iArr, i3);
        RecyclerView recyclerView = (RecyclerView) view2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Object[] objArr2 = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.search.ui.result.utils.a.a;
        int i4 = -1;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4841e59c0b3d6bc128bffe0d5dcb4bdc", RobustBitConfig.DEFAULT_VALUE)) {
            i4 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4841e59c0b3d6bc128bffe0d5dcb4bdc")).intValue();
        } else if (layoutManager != null) {
            if (layoutManager instanceof LinearLayoutManager) {
                i4 = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                i4 = com.sankuai.waimai.business.search.ui.result.utils.a.a(((StaggeredGridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPositions(null));
            }
        }
        if (i4 == 0) {
            int height = linearLayout.getHeight();
            LinearLayout b = b(view2);
            float y = b != null ? b.getY() : 0.0f;
            if (i2 > 0) {
                if (y <= 0.0f) {
                    linearLayout.setY(-height);
                    return;
                }
                float y2 = (-i2) + linearLayout.getY();
                if (y2 > 0.0f) {
                    y2 = 0.0f;
                }
                linearLayout.setY(y2);
            } else if (y >= height) {
                linearLayout.setY(0.0f);
                recyclerView.stopScroll();
                return;
            } else {
                float y3 = (-i2) + linearLayout.getY();
                if (y3 > 0.0f) {
                    y3 = 0.0f;
                }
                linearLayout.setY(y3);
            }
            iArr[1] = i2;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
        LinearLayout linearLayout = (LinearLayout) view;
        return i == 2;
    }

    public SearchHeaderBehavior() {
    }

    public SearchHeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "989649996b2bf07448c7e31eaf367bd5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "989649996b2bf07448c7e31eaf367bd5");
        }
    }

    private LinearLayout b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58b59cba5a617f40c138396941abcdc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58b59cba5a617f40c138396941abcdc0");
        }
        if (view == null || view.getParent() == null) {
            return null;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof LinearLayout) {
                return (LinearLayout) parent;
            }
        }
        return null;
    }
}
