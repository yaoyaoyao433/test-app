package com.meituan.android.legwork.utils;

import android.app.Activity;
import android.support.annotation.StringRes;
import android.view.View;
import com.meituan.android.legwork.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ab {
    public static ChangeQuickRedirect a = null;
    private static final String b = "ab";

    public static void a(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63a308b1251e84aef2b7890e3c20410d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63a308b1251e84aef2b7890e3c20410d");
        } else {
            a(com.meituan.android.legwork.a.a().getString(i));
        }
    }

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80602cf8514b8288a94e8d6b0a90623a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80602cf8514b8288a94e8d6b0a90623a");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            a(activity.findViewById(16908290), str);
        }
    }

    public static void a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fadc9042819d9c1003ce82d5a014d444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fadc9042819d9c1003ce82d5a014d444");
            return;
        }
        try {
            com.sankuai.meituan.android.ui.widget.a.a(view, str, -1).a();
        } catch (Exception e) {
            x.e("ToastUtil.show()", "Show snackbar fail,exception msg:", e);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b5d06b38dcf35659db67534d425d08f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b5d06b38dcf35659db67534d425d08f");
        } else {
            a(m.a.a.a(), str);
        }
    }
}
