package com.sankuai.waimai.store.util;

import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.manipulator.annotation.SkipInstrumentation;
/* compiled from: ProGuard */
@SkipInstrumentation
/* loaded from: classes5.dex */
public final class ar {
    public static ChangeQuickRedirect a;

    @SkipInstrumentation
    private static void b(PopupWindow popupWindow) {
        Object[] objArr = {popupWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a7d0fac09916124f919c3ef68776891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a7d0fac09916124f919c3ef68776891");
        } else if (popupWindow == null || !popupWindow.isShowing()) {
        } else {
            try {
                popupWindow.dismiss();
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    @SkipInstrumentation
    public static void a(PopupWindow popupWindow) {
        Object[] objArr = {popupWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e1428f7d5cf4fd9deb0245a97a4372a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e1428f7d5cf4fd9deb0245a97a4372a");
        } else {
            b(popupWindow);
        }
    }

    @SkipInstrumentation
    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        Object[] objArr = {popupWindow, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb22a21be72201975d13cb5ad44faf1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb22a21be72201975d13cb5ad44faf1b");
        } else if (popupWindow != null) {
            try {
                popupWindow.showAtLocation(view, i, i2, i3);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }
}
