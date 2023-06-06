package com.meituan.mmp.lib.utils;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class y {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aad76b440ae3f67acbdec672de6df29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aad76b440ae3f67acbdec672de6df29");
        } else if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getApplication().getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus instanceof EditText) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            } else {
                inputMethodManager.toggleSoftInput(1, 0);
            }
        }
    }

    public static void a(Context context, IBinder iBinder, int i) {
        Object[] objArr = {context, iBinder, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "900b8b07f551f27d1c089d13f50278e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "900b8b07f551f27d1c089d13f50278e3");
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(iBinder, i);
            }
        } catch (Exception unused) {
        }
    }
}
