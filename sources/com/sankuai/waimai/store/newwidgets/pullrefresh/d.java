package com.sankuai.waimai.store.newwidgets.pullrefresh;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static AdapterView<?> a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a6fbbd44a57a12e91ff52f62451fdb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (AdapterView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a6fbbd44a57a12e91ff52f62451fdb2");
        }
        if (view instanceof AdapterView) {
            return (AdapterView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                AdapterView<?> a2 = a(viewGroup.getChildAt(i));
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public static ScrollView b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b31ce69107c09a874a1a36501b351001", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScrollView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b31ce69107c09a874a1a36501b351001");
        }
        if (view instanceof ScrollView) {
            return (ScrollView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ScrollView b = b(viewGroup.getChildAt(i));
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    public static RecyclerView c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41ae6e72ebcc41cbd70b0013a1b2c1a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41ae6e72ebcc41cbd70b0013a1b2c1a3");
        }
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if ((recyclerView.getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation() == 1) {
                return recyclerView;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView c = c(viewGroup.getChildAt(i));
                if (c != null) {
                    return c;
                }
            }
        }
        return null;
    }
}
