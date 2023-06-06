package com.dianping.shield.component.utils;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ai;
import android.view.View;
import com.dianping.agentsdk.sectionrecycler.layoutmanager.LinearLayoutManagerWithSmoothOffset;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Rect getViewRect(View view) {
        while (true) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01ec707643eb08031bbc2fa5548f1c62", RobustBitConfig.DEFAULT_VALUE)) {
                return (Rect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01ec707643eb08031bbc2fa5548f1c62");
            }
            if (view == null) {
                return new Rect();
            }
            if (view.getParent() instanceof RecyclerView) {
                Rect rect = new Rect();
                rect.left = view.getLeft();
                rect.right = view.getRight();
                rect.bottom = view.getBottom();
                rect.top = view.getTop();
                return rect;
            } else if (view.getParent() instanceof View) {
                view = (View) view.getParent();
            } else {
                return new Rect();
            }
        }
    }

    public static int calAvgViewHeight(PageContainerRecyclerView pageContainerRecyclerView) {
        View findViewByPosition;
        Object[] objArr = {pageContainerRecyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7933bdd1a79e7825d1e58ea0db88e733", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7933bdd1a79e7825d1e58ea0db88e733")).intValue();
        }
        if (pageContainerRecyclerView.getLayoutManager() instanceof ShieldLayoutManagerInterface) {
            ShieldLayoutManagerInterface shieldLayoutManagerInterface = (ShieldLayoutManagerInterface) pageContainerRecyclerView.getLayoutManager();
            int findLastVisibleItemPosition = shieldLayoutManagerInterface.findLastVisibleItemPosition(false);
            int i = 0;
            int i2 = 0;
            for (int findFirstVisibleItemPosition = shieldLayoutManagerInterface.findFirstVisibleItemPosition(false); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                if (shieldLayoutManagerInterface instanceof LinearLayoutManagerWithSmoothOffset) {
                    findViewByPosition = ((LinearLayoutManagerWithSmoothOffset) shieldLayoutManagerInterface).findViewByPositionWithTop(findFirstVisibleItemPosition);
                } else {
                    findViewByPosition = pageContainerRecyclerView.getLayoutManager().findViewByPosition(findFirstVisibleItemPosition);
                }
                ai b = ai.b(pageContainerRecyclerView.getLayoutManager());
                if (findViewByPosition != null) {
                    i++;
                    i2 += b.e(findViewByPosition);
                }
            }
            if (i == 0) {
                return 0;
            }
            return i2 / i;
        }
        return 0;
    }
}
