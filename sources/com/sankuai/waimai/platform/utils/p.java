package com.sankuai.waimai.platform.utils;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.manipulator.annotation.CallSiteReplacement;
import com.sankuai.waimai.manipulator.annotation.SkipInstrumentation;
/* compiled from: ProGuard */
@SkipInstrumentation
/* loaded from: classes5.dex */
public final class p {
    public static ChangeQuickRedirect a;

    public static void a(PopupWindow popupWindow) {
        Object[] objArr = {popupWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e132d8ae38cbbde7cb9300585180de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e132d8ae38cbbde7cb9300585180de7");
        } else if (popupWindow == null || !popupWindow.isShowing()) {
        } else {
            try {
                popupWindow.dismiss();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    @CallSiteReplacement(targetClass = "android.widget.PopupWindow+")
    public static void b(PopupWindow popupWindow) {
        Object[] objArr = {popupWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "237778f6e6c2d125c19073dad681a377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "237778f6e6c2d125c19073dad681a377");
        } else {
            a(popupWindow);
        }
    }

    @CallSiteReplacement(targetClass = "android.widget.PopupWindow+")
    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        Object[] objArr = {popupWindow, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb9cf63b2d9dca8fb309dfdf1eab5a7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb9cf63b2d9dca8fb309dfdf1eab5a7a");
        } else if (popupWindow != null) {
            try {
                popupWindow.showAtLocation(view, i, i2, i3);
            } catch (Exception e) {
                if (RouteSelector.ROM_VIVO.equalsIgnoreCase(Build.MANUFACTURER) || Build.VERSION.SDK_INT == 33) {
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    @CallSiteReplacement(targetClass = "android.widget.PopupWindow+")
    public static void a(PopupWindow popupWindow, View view, int i, int i2) {
        Object[] objArr = {popupWindow, view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7ebbb5f0f1cfc562ca9a46876700c78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7ebbb5f0f1cfc562ca9a46876700c78");
        } else if (popupWindow != null) {
            try {
                popupWindow.showAsDropDown(view, i, i2);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }
}
