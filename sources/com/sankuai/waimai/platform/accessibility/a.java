package com.sankuai.waimai.platform.accessibility;

import android.view.accessibility.AccessibilityManager;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public boolean b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30aa12966124d7dd426646bdcaad203a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30aa12966124d7dd426646bdcaad203a");
        } else {
            this.b = false;
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6552b825a4457b4ab3ed1c2202cacfbd", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6552b825a4457b4ab3ed1c2202cacfbd") : C1036a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.accessibility.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1036a {
        private static final a a = new a();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf203ccc868bb62ce1cd63ece39a336", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf203ccc868bb62ce1cd63ece39a336")).booleanValue();
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) b.a.getSystemService("accessibility");
            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                return false;
            }
            return accessibilityManager.isTouchExplorationEnabled();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            return false;
        }
    }
}
