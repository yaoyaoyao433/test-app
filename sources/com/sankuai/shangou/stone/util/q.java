package com.sankuai.shangou.stone.util;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class q {
    public static ChangeQuickRedirect a;

    public static int a(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e8619eb297745125ef7c36227f6ecc7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e8619eb297745125ef7c36227f6ecc7")).intValue();
        }
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
                return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            }
            if (layoutManager == null || layoutManager.getChildCount() <= 0) {
                return -1;
            }
            return a(layoutManager.getChildAt(0));
        }
        return -1;
    }

    public static int b(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        int childCount;
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18081f805d337316aaa875377f9ee362", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18081f805d337316aaa875377f9ee362")).intValue();
        }
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (childCount = layoutManager.getChildCount()) <= 0) {
            return -1;
        }
        return a(layoutManager.getChildAt(childCount - 1));
    }

    private static int a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec282aaeafcc0672cb77e463b3dc1005", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec282aaeafcc0672cb77e463b3dc1005")).intValue();
        }
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof RecyclerView.g) {
                return ((RecyclerView.g) layoutParams).c.getAdapterPosition();
            }
            return -1;
        }
        return -1;
    }

    public static boolean c(RecyclerView recyclerView) {
        RecyclerView.a adapter;
        int itemCount;
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3d82dde53d8e3e1ad0b40d1543c21b8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3d82dde53d8e3e1ad0b40d1543c21b8")).booleanValue() : recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (itemCount = adapter.getItemCount()) > 0 && b(recyclerView) >= itemCount - 1;
    }

    public static boolean d(RecyclerView recyclerView) {
        RecyclerView.a adapter;
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65d85fb9137c008729692fcada60cdcf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65d85fb9137c008729692fcada60cdcf")).booleanValue() : recyclerView != null && (adapter = recyclerView.getAdapter()) != null && adapter.getItemCount() > 0 && e(recyclerView) == 0;
    }

    public static int e(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b73eea7b5af48373f16b74e43189d6d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b73eea7b5af48373f16b74e43189d6d8")).intValue();
        }
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
                return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            }
            if (layoutManager == null || layoutManager.getChildCount() <= 0) {
                return -1;
            }
            return a(layoutManager.getChildAt(0));
        }
        return -1;
    }

    public static int f(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f8d5e846a192b6eb3299375484329b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f8d5e846a192b6eb3299375484329b4")).intValue();
        }
        LinearLayoutManager h = h(recyclerView);
        if (h != null) {
            return h.findFirstVisibleItemPosition();
        }
        return 0;
    }

    public static int g(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "103e1858d3e71d2aa8ea07bce448a1c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "103e1858d3e71d2aa8ea07bce448a1c5")).intValue();
        }
        LinearLayoutManager h = h(recyclerView);
        if (h != null) {
            return h.getItemCount();
        }
        return 0;
    }

    public static LinearLayoutManager h(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6ee33509a78a77010bcfda1060b53ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayoutManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6ee33509a78a77010bcfda1060b53ae");
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }
}
