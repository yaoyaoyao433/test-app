package com.sankuai.waimai.platform.widget.pullrefresh;

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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2d8563338c2fff4688dc4562d17d4b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (AdapterView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2d8563338c2fff4688dc4562d17d4b5");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d434a343f5a96a4223583d572d240b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScrollView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d434a343f5a96a4223583d572d240b7");
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
}
