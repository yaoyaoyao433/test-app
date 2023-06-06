package com.meituan.android.cashier.utils;

import android.text.TextUtils;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.model.bean.MTPaymentURL;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.pay.utils.j;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static HashMap<String, Object> a(MTPaymentURL mTPaymentURL) {
        String str;
        String str2;
        IOException e;
        String str3;
        HashMap<String, String> a2;
        String str4;
        String str5;
        String str6;
        Object[] objArr = {mTPaymentURL};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3b81c8d87b43da700d607a353b2fe54", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3b81c8d87b43da700d607a353b2fe54");
        }
        String url = mTPaymentURL.getUrl();
        String str7 = "0";
        try {
            a2 = j.a(new String(c.a(url)));
            str = a2.get("pay_type");
            try {
                str2 = a2.get("launch_url");
                try {
                    str4 = a2.get("verify_type");
                    str5 = a2.get("real_name_auth_url");
                } catch (IOException e2) {
                    e = e2;
                    a.c a3 = new a.c().a("message", "直连url调起异常,base64解析错误");
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_5ijm6qk8_mv", a3.a(LogMonitor.EXCEPTION_TAG, "base64_" + url + "_exception_" + e.toString()).b);
                    str3 = "";
                    return new a.c().a("dispatch_scene", str7).a("launch_url", str2).a("pay_type", str).a("qdb_no", str3).b;
                }
            } catch (IOException e3) {
                str2 = "";
                e = e3;
            }
        } catch (IOException e4) {
            str = "";
            str2 = "";
            e = e4;
        }
        if (TextUtils.equals("/qdbsign/sign", str2)) {
            str6 = "5";
        } else if (TextUtils.equals("/qdbdisplay/cashdesk", str2)) {
            str6 = "1";
        } else {
            if (!com.meituan.android.pay.common.payment.utils.c.h(str) && (!com.meituan.android.pay.common.payment.utils.c.e(str) || TextUtils.isEmpty(str5))) {
                if (!TextUtils.equals("4", str4)) {
                    if (TextUtils.equals("/qdbdisplay/mtpaycashier", str2)) {
                        str6 = "4";
                    }
                    str3 = a2.get("trans_id");
                    return new a.c().a("dispatch_scene", str7).a("launch_url", str2).a("pay_type", str).a("qdb_no", str3).b;
                }
                str6 = "2";
            }
            str6 = "3";
        }
        str7 = str6;
        str3 = a2.get("trans_id");
        return new a.c().a("dispatch_scene", str7).a("launch_url", str2).a("pay_type", str).a("qdb_no", str3).b;
    }

    public static void a(MTPaymentURL mTPaymentURL, String str, String str2) {
        Object[] objArr = {mTPaymentURL, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90d67d3d3b22fcbc4c880e551d63fde0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90d67d3d3b22fcbc4c880e551d63fde0");
        } else if (mTPaymentURL == null || TextUtils.isEmpty(mTPaymentURL.getUrl())) {
        } else {
            HashMap<String, Object> a2 = a(mTPaymentURL);
            a2.put("nb_container", str);
            q.c("mt_pay_dispatch", a2, str2);
            q.b("b_pay_mt_pay_dispatch_sc", a2, str2);
            String valueOf = String.valueOf(a2.get("launch_url"));
            if (TextUtils.equals("/qdbsign/sign", valueOf) || TextUtils.equals("/qdbdisplay/mtpaycashier", valueOf)) {
                return;
            }
            q.a("standard_cashier_mt_pay_start", str2);
            a2.put("cashier_type", "wallet");
            q.a("standard_cashier_mt_pay", "b_pay_standard_cashier_mt_pay_start_sc", a2, str2);
        }
    }
}
