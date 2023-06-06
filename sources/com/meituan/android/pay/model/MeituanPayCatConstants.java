package com.meituan.android.pay.model;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.pay.common.payment.data.g;
import com.meituan.android.pay.common.payment.utils.b;
import com.meituan.android.paybase.common.analyse.cat.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class MeituanPayCatConstants {
    public static final String ACTION_BIND_CARD = "paybiz_bind_card";
    public static final String ACTION_DISPATCH_WALLETPAY = "paybiz_dispatch_walletpay";
    public static final String ACTION_FINGERPRINT_GUIDE = "paybiz_fingerprint_guide";
    public static final String ACTION_NO_PASSWORD_GUIDE = "paybiz_no_password_guide";
    public static final String ACTION_PAY_BALANCE_COMBINE = "balance_combine_pay";
    public static final String ACTION_PAY_VALUE_CARD_COMBINE = "valuecard_combine_pay";
    public static final String ACTION_PAY_WALLETPAY = "paybiz_pay_walletpay";
    public static final String ACTION_VERIFY_PASSWORD = "paybiz_verify_password";
    public static final int CODE_FOREIGN_CARD_PAY_FAIL = 1150015;
    public static final int CODE_LAUNCH_URL_NULL = 1190001;
    public static final int CODE_REAL_NAME_URL_NULL = 1190003;
    public static final int CODE_TRANS_ID_PAY_TOKEN_NULL = 1190005;
    public static final int CODE_URI_NULL = 1190004;
    public static final int CODE_URL_BASE64_ERROR = 1190002;
    public static ChangeQuickRedirect changeQuickRedirect;

    private static String getPayRateCommand(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "afaa769fd0aa285a57c2031105f6ecf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "afaa769fd0aa285a57c2031105f6ecf0");
        }
        String b = b.b(activity, "combine_type");
        if (!TextUtils.isEmpty(b)) {
            if (g.d.contains(b)) {
                return ACTION_PAY_BALANCE_COMBINE;
            }
            if (g.e.contains(b)) {
                return ACTION_PAY_VALUE_CARD_COMBINE;
            }
        } else {
            String b2 = b.b(activity, "pay_type");
            if (!TextUtils.isEmpty(b2)) {
                return b2;
            }
        }
        return null;
    }

    public static void logRateByPayType(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38e0b2bf1c28e725789c5b81af675def", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38e0b2bf1c28e725789c5b81af675def");
        } else if (TextUtils.isEmpty(getPayRateCommand(activity))) {
        } else {
            a.a(getPayRateCommand(activity), i);
        }
    }
}
