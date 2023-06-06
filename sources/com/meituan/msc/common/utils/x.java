package com.meituan.msc.common.utils;

import android.content.Context;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class x {
    public static ChangeQuickRedirect a;

    public static void a(Context context, IBinder iBinder, int i) {
        Object[] objArr = {context, iBinder, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9657427d2fbda914f2dd52ef5cd7240f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9657427d2fbda914f2dd52ef5cd7240f");
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
