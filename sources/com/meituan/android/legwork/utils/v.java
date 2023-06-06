package com.meituan.android.legwork.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class v {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, int i, String str, String str2) {
        Object[] objArr = {activity, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2053e418bb6ce12e157fe24ba991cdd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2053e418bb6ce12e157fe24ba991cdd1");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            Uri.Builder buildUpon = Uri.parse("meituanpayment://cashier/launch").buildUpon();
            buildUpon.appendQueryParameter("trade_number", str);
            buildUpon.appendQueryParameter("pay_token", str2);
            Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
            intent.setPackage(activity.getPackageName());
            activity.startActivityForResult(intent, i);
            HashMap hashMap = new HashMap(2);
            hashMap.put("status", "start");
            q.a("legwork_pay", 1, hashMap);
        }
    }
}
