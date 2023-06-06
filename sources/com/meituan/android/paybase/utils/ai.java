package com.meituan.android.paybase.utils;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ai {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40c594c74614bf8812c258d48094cb8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40c594c74614bf8812c258d48094cb8f");
        } else if (activity.getCurrentFocus() == null || activity.getCurrentFocus().getWindowToken() == null) {
        } else {
            a(activity, activity.getCurrentFocus().getWindowToken());
        }
    }

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10db668920cfa14819162ad5f018d24d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10db668920cfa14819162ad5f018d24d");
            return;
        }
        Context context = view.getContext();
        IBinder windowToken = view.getWindowToken();
        if (context == null || windowToken == null) {
            return;
        }
        a(view.getContext(), windowToken);
    }

    private static void a(Context context, IBinder iBinder) {
        Object[] objArr = {context, iBinder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80ca2a5f55e310bab1a88f7bfbb6ca3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80ca2a5f55e310bab1a88f7bfbb6ca3c");
        } else {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(iBinder, 0);
        }
    }

    public static void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d69d23d3a9f3c0e349f71bf7dc2beb06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d69d23d3a9f3c0e349f71bf7dc2beb06");
        } else {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }
    }
}
