package com.alipay.sdk.util;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static void a(com.alipay.sdk.sys.a aVar, Context context, String str) {
        try {
            String str2 = null;
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(";");
                String str3 = null;
                for (int i = 0; i < split.length; i++) {
                    if (split[i].startsWith("result={") && split[i].endsWith(CommonConstant.Symbol.BIG_BRACKET_RIGHT)) {
                        String[] split2 = split[i].substring(8, split[i].length() - 1).split("&");
                        int i2 = 0;
                        while (true) {
                            if (i2 >= split2.length) {
                                break;
                            } else if (split2[i2].startsWith("trade_token=\"") && split2[i2].endsWith(CommonConstant.Symbol.DOUBLE_QUOTES)) {
                                str3 = split2[i2].substring(13, split2[i2].length() - 1);
                                break;
                            } else if (split2[i2].startsWith("trade_token=")) {
                                str3 = split2[i2].substring(12);
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                str2 = str3;
            }
            d.a("mspl", "trade token: " + str2);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            h.a(aVar, context, "pref_trade_token", str2);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "SaveTradeTokenError", th);
            d.a(th);
        }
    }
}
