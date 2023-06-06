package com.meituan.msi.util;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f19d79a7d902afc32a5f1cdec95b9353", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f19d79a7d902afc32a5f1cdec95b9353")).booleanValue();
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.meituan.msi.a.f().getSystemService("accessibility");
        return (accessibilityManager == null || accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty() || !accessibilityManager.isTouchExplorationEnabled()) ? false : true;
    }

    public static void a(final View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f3e188571ebebc1e625c4d790aeaac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f3e188571ebebc1e625c4d790aeaac7");
        } else if (z) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.postDelayed(new Runnable() { // from class: com.meituan.msi.util.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "992feee9873b43d95618f8e9bc4b017d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "992feee9873b43d95618f8e9bc4b017d");
                    } else {
                        view.sendAccessibilityEvent(128);
                    }
                }
            }, 1L);
        }
    }
}
