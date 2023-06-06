package com.meituan.android.ptcommonim.base.util;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0695415a583e346cc0900b45a2442625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0695415a583e346cc0900b45a2442625");
        } else if (context instanceof Activity) {
            a((Activity) context, str);
        }
    }

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b460e3d6a115a9f4ab054d33ee4e740f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b460e3d6a115a9f4ab054d33ee4e740f");
        } else if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
        } else {
            new com.sankuai.meituan.android.ui.widget.a(activity.findViewById(16908290), str, 0).b("#CC000000").a(a.a(9)).d(14).a(40, 40).a(a.a(2), 1.0f).a();
        }
    }
}
