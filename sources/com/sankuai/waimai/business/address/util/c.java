package com.sankuai.waimai.business.address.util;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static String b = "KeyBoardUtil";

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d0a27353bec755242cda857b4573d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d0a27353bec755242cda857b4573d88");
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                return;
            }
            inputMethodManager.showSoftInput(currentFocus, 0);
        } catch (Exception unused) {
            com.sankuai.waimai.foundation.utils.log.a.e(b, "openKeyboardError", new Object[0]);
        }
    }

    public static void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f59c44ad2552514e3a56a2dc83d3034b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f59c44ad2552514e3a56a2dc83d3034b");
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        } catch (Exception unused) {
            com.sankuai.waimai.foundation.utils.log.a.e(b, "closeKeybordError", new Object[0]);
        }
    }
}
