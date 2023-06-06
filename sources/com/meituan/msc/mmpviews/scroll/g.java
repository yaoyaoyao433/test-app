package com.meituan.msc.mmpviews.scroll;

import android.view.ViewGroup;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.uimanager.an;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static void a(int i, ViewGroup viewGroup, float f, float f2) {
        Object[] objArr = {Integer.valueOf(i), viewGroup, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae24a16aa45af65b98bff9f839cc266b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae24a16aa45af65b98bff9f839cc266b");
        } else {
            a(i, viewGroup, e.SCROLL, f, f2);
        }
    }

    public static void a(int i, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5751192bbd70fad54c350e9bee03cb4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5751192bbd70fad54c350e9bee03cb4b");
        } else {
            a(i, viewGroup, e.SCROLL_TO_UPPER);
        }
    }

    public static void b(int i, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e521a48889e541b230afabb80d09761e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e521a48889e541b230afabb80d09761e");
        } else {
            a(i, viewGroup, e.SCROLL_TO_LOWER);
        }
    }

    private static void a(int i, ViewGroup viewGroup, e eVar) {
        Object[] objArr = {Integer.valueOf(i), viewGroup, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "666c159eb7f0d04a415db3e38478570a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "666c159eb7f0d04a415db3e38478570a");
        } else {
            a(i, viewGroup, eVar, 0.0f, 0.0f);
        }
    }

    private static void a(int i, ViewGroup viewGroup, e eVar, float f, float f2) {
        Object[] objArr = {Integer.valueOf(i), viewGroup, eVar, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eea843caac6d3b1cf39759cbd9fb8224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eea843caac6d3b1cf39759cbd9fb8224");
        } else if (viewGroup.getChildAt(0) == null) {
        } else {
            an.a((ReactContext) viewGroup.getContext(), i).a(d.a(i, eVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, viewGroup.getChildAt(0) == null ? viewGroup.getWidth() : viewGroup.getChildAt(0).getWidth(), viewGroup.getChildAt(0) == null ? viewGroup.getHeight() : viewGroup.getChildAt(0).getHeight(), viewGroup));
        }
    }
}
