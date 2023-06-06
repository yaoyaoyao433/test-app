package com.meituan.android.legwork.common.util;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e99adfdefec52fd1bd8ab899da42830a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e99adfdefec52fd1bd8ab899da42830a");
        } else if (activity == null || activity.isFinishing()) {
            x.b("SchemeRouter.startActivityForResult()", "activity is finish");
        } else if (TextUtils.isEmpty(str)) {
            x.b("SchemeRouter.startActivityForResult()", "scheme is null");
        } else {
            com.sankuai.waimai.foundation.router.a.a(activity, str, (Bundle) null, i);
        }
    }

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e259f545e4b922a6027950a7cfe3722", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e259f545e4b922a6027950a7cfe3722");
        } else if (activity == null || activity.isFinishing()) {
            x.b("SchemeRouter.startKnbActivity()", "activity is finish");
        } else if (TextUtils.isEmpty(str)) {
            x.b("SchemeRouter.startKnbActivity()", "scheme is null");
        } else {
            com.sankuai.waimai.foundation.router.a.a(activity, str);
        }
    }
}
