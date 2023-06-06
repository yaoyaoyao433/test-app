package com.sankuai.titans.widget;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.ui.widget.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SnackbarUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void showSnackbar(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c3c58242b522ec37b199fe8b9a1d284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c3c58242b522ec37b199fe8b9a1d284");
        } else if (activity == null || TextUtils.isEmpty(str)) {
        } else {
            a.a(activity, str, -1).a();
        }
    }

    public static void showSnackbar(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16c5fb72010f78e772a05547d2a97b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16c5fb72010f78e772a05547d2a97b6c");
        } else if (view == null || TextUtils.isEmpty(str)) {
        } else {
            a.a(view, str, -1).a();
        }
    }
}
