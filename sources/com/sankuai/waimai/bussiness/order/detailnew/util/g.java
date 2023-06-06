package com.sankuai.waimai.bussiness.order.detailnew.util;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97203faae5b3e111428b6abdd1b120a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97203faae5b3e111428b6abdd1b120a1");
        } else {
            a(view, i, -1, -2);
        }
    }

    private static void a(View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object[] objArr = {view, Integer.valueOf(i), -1, -2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04fe0969693c91f515c6f707238accfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04fe0969693c91f515c6f707238accfd");
        } else if (view == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            }
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -2;
            marginLayoutParams.setMargins(0, i, 0, 0);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0420227057da804f2e53caf6d81fc193", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0420227057da804f2e53caf6d81fc193");
        } else {
            a(view, -1, -2);
        }
    }

    private static void a(View view, int i, int i2) {
        Object[] objArr = {view, -1, -2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "045862eb7bf448062801c49b351ba3a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "045862eb7bf448062801c49b351ba3a3");
        } else if (view == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            layoutParams.width = -1;
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
        }
    }
}
