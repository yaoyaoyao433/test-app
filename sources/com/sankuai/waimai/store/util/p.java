package com.sankuai.waimai.store.util;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class p {
    public static ChangeQuickRedirect a;

    public static int a(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8c2d92ba99af5ff1ed657496e0f47dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8c2d92ba99af5ff1ed657496e0f47dc")).intValue();
        }
        if (layoutManager == null) {
            return -1;
        }
        return layoutManager instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null)[1] : layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() : -1;
    }

    public static int a(RecyclerView.LayoutManager layoutManager, int i) {
        Object[] objArr = {layoutManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c9d6748995e170b5b8e62f8eee11bc7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c9d6748995e170b5b8e62f8eee11bc7")).intValue();
        }
        if (layoutManager == null) {
            return -1;
        }
        int findLastVisibleItemPosition = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() : -1;
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findLastVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null);
            for (int i2 = 0; i2 < findLastVisibleItemPositions.length; i2++) {
                if (findLastVisibleItemPosition < findLastVisibleItemPositions[i2]) {
                    findLastVisibleItemPosition = findLastVisibleItemPositions[i2];
                }
            }
        }
        return findLastVisibleItemPosition;
    }

    public static int b(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0b56ec65797c000034ba5ec45e65dab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0b56ec65797c000034ba5ec45e65dab")).intValue();
        }
        if (layoutManager == null) {
            return -1;
        }
        return layoutManager instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(null)[1] : layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() : -1;
    }
}
