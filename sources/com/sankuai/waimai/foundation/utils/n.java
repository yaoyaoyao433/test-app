package com.sankuai.waimai.foundation.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n {
    public static ChangeQuickRedirect a = null;
    private static String b = "KeyBoardUtil";

    public static void a(View view, Context context) {
        Object[] objArr = {view, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0464eadb8ee77829a29094676efd46b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0464eadb8ee77829a29094676efd46b");
            return;
        }
        try {
            ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(view, 0);
        } catch (Exception unused) {
            com.sankuai.waimai.foundation.utils.log.a.e(b, "openKeyboardError", new Object[0]);
        }
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d7da3d40be4b63ee63269704d6cfe2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d7da3d40be4b63ee63269704d6cfe2b");
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
