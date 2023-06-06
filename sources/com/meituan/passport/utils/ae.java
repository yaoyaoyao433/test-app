package com.meituan.passport.utils;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.RestrictTo;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ae {
    public static ChangeQuickRedirect a;

    public static com.sankuai.meituan.android.ui.widget.a a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e0a6e4520d8dc3cca841e7168e3145a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.android.ui.widget.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e0a6e4520d8dc3cca841e7168e3145a");
        }
        Context context = view != null ? view.getContext() : null;
        if (context == null) {
            return null;
        }
        return new com.sankuai.meituan.android.ui.widget.a(view, str, 0).c(Utils.c(context, 17170443));
    }

    public static com.sankuai.meituan.android.ui.widget.a a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fea8d1c7cef0fac57233197c9fe886f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.android.ui.widget.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fea8d1c7cef0fac57233197c9fe886f") : new com.sankuai.meituan.android.ui.widget.a(activity, str, 0).c(Utils.c(activity, 17170443));
    }
}
