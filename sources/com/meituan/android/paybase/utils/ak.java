package com.meituan.android.paybase.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ak {
    public static ChangeQuickRedirect a;

    public static String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "596c7d043e99a1ac391dbcfb28c664ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "596c7d043e99a1ac391dbcfb28c664ba");
        }
        if (activity instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
            if (!TextUtils.isEmpty(payBaseActivity.p())) {
                return payBaseActivity.p();
            }
        }
        ae.a("uniqueidutils_getuniqueid_error", (Map<String, Object>) null, (List<Float>) null);
        com.meituan.android.paybase.common.analyse.a.d("uniqueidutils_getuniqueid_error", "uniqueidutils_getuniqueid_" + activity, x.b("com.meituan.android.paybase.utils.StatisticsUtils"));
        return "";
    }
}
