package com.meituan.metrics.utils;

import android.graphics.Rect;
import android.os.Looper;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ScrollView;
import com.meituan.metrics.fsp.FspScrollBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ViewUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Rect getRect(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "837cfe48f31eae1e21b5997138f3f937", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "837cfe48f31eae1e21b5997138f3f937");
        }
        if (view == null || Looper.getMainLooper() != Looper.myLooper()) {
            return new Rect();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public static int getScrollY(ListView listView) {
        Object[] objArr = {listView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89d93841fcff9658f8e154796be8d888", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89d93841fcff9658f8e154796be8d888")).intValue();
        }
        View childAt = listView.getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        return (-childAt.getTop()) + (listView.getFirstVisiblePosition() * childAt.getHeight());
    }

    public static int getScrollX(ListView listView) {
        Object[] objArr = {listView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c269ed8c0bea2fbb772d256774a67c9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c269ed8c0bea2fbb772d256774a67c9d")).intValue();
        }
        View childAt = listView.getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        return (-childAt.getLeft()) + (listView.getFirstVisiblePosition() * childAt.getWidth());
    }

    public static Pair<Integer, Integer> getScrollXY(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7feace9473e65c067372d330c1fd6a09", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7feace9473e65c067372d330c1fd6a09");
        }
        if (view instanceof ScrollingView) {
            ScrollingView scrollingView = (ScrollingView) view;
            return new Pair<>(Integer.valueOf(scrollingView.computeHorizontalScrollOffset()), Integer.valueOf(scrollingView.computeVerticalScrollOffset()));
        } else if (view instanceof ListView) {
            ListView listView = (ListView) view;
            return new Pair<>(Integer.valueOf(getScrollX(listView)), Integer.valueOf(getScrollY(listView)));
        } else {
            return new Pair<>(Integer.valueOf(view.getScrollX()), Integer.valueOf(view.getScrollY()));
        }
    }

    public static FspScrollBean getFspScrollBean(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b368985b97e2729be806f5f02a32681b", RobustBitConfig.DEFAULT_VALUE)) {
            return (FspScrollBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b368985b97e2729be806f5f02a32681b");
        }
        FspScrollBean fspScrollBean = new FspScrollBean(getScrollXY(view));
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                fspScrollBean.firstCompletelyVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                if (fspScrollBean.firstCompletelyVisibleItemPosition == -1) {
                    fspScrollBean.firstCompletelyVisibleItemPosition = 0;
                }
            }
        }
        return fspScrollBean;
    }

    public static boolean isViewScroll(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd8ee0d8c05c79f3dd7b8f9919b67925", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd8ee0d8c05c79f3dd7b8f9919b67925")).booleanValue();
        }
        if (view instanceof ViewGroup) {
            return (view instanceof ScrollingView) || (view instanceof ListView) || (view instanceof ScrollView) || (view instanceof ViewPager) || (view instanceof HorizontalScrollView);
        }
        return false;
    }

    public static int calculateViewArea(Rect rect, Rect rect2) {
        Object[] objArr = {rect, rect2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b3b940055234d2868721716f12f2c911", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b3b940055234d2868721716f12f2c911")).intValue();
        }
        if (rect2.contains(rect)) {
            return rect.width() * rect.height();
        }
        if (Rect.intersects(rect, rect2)) {
            Rect rect3 = new Rect();
            rect3.bottom = Math.min(rect.bottom, rect2.bottom);
            rect3.right = Math.min(rect.right, rect2.right);
            rect3.top = Math.max(rect.top, 0);
            rect3.left = Math.max(rect.left, 0);
            return (rect3.bottom - rect3.top) * (rect3.right - rect3.left);
        }
        return 0;
    }

    public static Rect calculateViewRect(Rect rect, Rect rect2) {
        Object[] objArr = {rect, rect2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0590c72e937489175d4268a1d623666e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0590c72e937489175d4268a1d623666e");
        }
        if (rect2.contains(rect)) {
            return rect;
        }
        if (Rect.intersects(rect, rect2)) {
            Rect rect3 = new Rect();
            rect3.bottom = Math.min(rect.bottom, rect2.bottom);
            rect3.right = Math.min(rect.right, rect2.right);
            rect3.top = Math.max(rect.top, 0);
            rect3.left = Math.max(rect.left, 0);
            return rect3;
        }
        return null;
    }
}
