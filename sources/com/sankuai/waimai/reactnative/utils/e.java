package com.sankuai.waimai.reactnative.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static AdapterView<?> a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de6b5b2a04e604e18f1a12e73d9f5014", RobustBitConfig.DEFAULT_VALUE)) {
            return (AdapterView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de6b5b2a04e604e18f1a12e73d9f5014");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d3b94d178face0b84f8a233cd893f5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScrollView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d3b94d178face0b84f8a233cd893f5d");
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
