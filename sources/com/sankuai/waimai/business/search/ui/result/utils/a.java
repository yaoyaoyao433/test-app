package com.sankuai.waimai.business.search.ui.result.utils;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac3e9dc146a19867bca3367f572ab351", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac3e9dc146a19867bca3367f572ab351")).intValue();
        }
        if (layoutManager == null) {
            return -1;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return b(((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null));
        }
        return -1;
    }

    public static int a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbbde5dc5eff6dd0e5e175149724eb7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbbde5dc5eff6dd0e5e175149724eb7e")).intValue();
        }
        int i = iArr.length > 0 ? iArr[0] : -1;
        for (int i2 : iArr) {
            if (i2 < i && i2 >= 0) {
                i = i2;
            }
        }
        return i;
    }

    private static int b(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82d5e3ec469469f798e353034f9fdbbd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82d5e3ec469469f798e353034f9fdbbd")).intValue();
        }
        int i = -1;
        for (int i2 : iArr) {
            if (i2 > i && i2 >= 0) {
                i = i2;
            }
        }
        return i;
    }
}
