package com.sankuai.waimai.restaurant.shopcart.utils;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static void a(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e806097cfa19dab3eacb935bdd2d32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e806097cfa19dab3eacb935bdd2d32d");
        } else if (view != null && a()) {
            if (z) {
                ViewCompat.setImportantForAccessibility(view, 1);
            } else {
                ViewCompat.setImportantForAccessibility(view, 4);
            }
        }
    }

    public static void a(AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener) {
        AccessibilityManager b;
        Object[] objArr = {accessibilityStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77c03b10542f388c89f75463d32c79a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77c03b10542f388c89f75463d32c79a3");
        } else if (accessibilityStateChangeListener == null || (b = b()) == null) {
        } else {
            b.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80c1ed4979b2c006658855d289bf4d0b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80c1ed4979b2c006658855d289bf4d0b")).booleanValue();
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) com.meituan.android.singleton.b.a.getSystemService("accessibility");
            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                return false;
            }
            return accessibilityManager.isTouchExplorationEnabled();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            return false;
        }
    }

    public static AccessibilityManager b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5547887e1542fbfe36297cfdd726f344", RobustBitConfig.DEFAULT_VALUE)) {
            return (AccessibilityManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5547887e1542fbfe36297cfdd726f344");
        }
        try {
            return (AccessibilityManager) com.meituan.android.singleton.b.a.getSystemService("accessibility");
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            return null;
        }
    }
}
