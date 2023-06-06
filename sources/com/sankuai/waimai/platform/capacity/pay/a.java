package com.sankuai.waimai.platform.capacity.pay;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, int i, String str, String str2) {
        Object[] objArr = {activity, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "437edc080d091a81434ae828aa2ccfb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "437edc080d091a81434ae828aa2ccfb0");
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Uri.Builder buildUpon = Uri.parse("meituanpayment://cashier/launch").buildUpon();
                buildUpon.appendQueryParameter("trade_number", str);
                buildUpon.appendQueryParameter("pay_token", str2);
                Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
                intent.setPackage(activity.getPackageName());
                activity.startActivityForResult(intent, i);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("PayUtils-startPay", e.getMessage(), new Object[0]);
        }
    }

    public static void a(Activity activity, int i, String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {activity, 3, str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8339a8360a1172305b8fbc0dd58ad147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8339a8360a1172305b8fbc0dd58ad147");
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Uri.Builder buildUpon = Uri.parse("meituanpayment://cashier/launch").buildUpon();
                buildUpon.appendQueryParameter("trade_number", str);
                buildUpon.appendQueryParameter("pay_token", str2);
                buildUpon.appendQueryParameter("cashier_type", str3);
                buildUpon.appendQueryParameter("extra_data", str4);
                if (!TextUtils.isEmpty(str5)) {
                    buildUpon.appendQueryParameter("preCashierInfo", str5);
                }
                Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
                intent.setPackage(activity.getPackageName());
                activity.startActivityForResult(intent, 3);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("PayUtils-startPay", e.getMessage(), new Object[0]);
        }
    }
}
