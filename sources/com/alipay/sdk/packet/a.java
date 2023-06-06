package com.alipay.sdk.packet;

import android.text.TextUtils;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("&");
        if (split.length == 0) {
            return "";
        }
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (String str6 : split) {
            if (TextUtils.isEmpty(str2)) {
                str2 = !str6.contains("biz_type") ? null : b(str6);
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = !str6.contains("biz_no") ? null : b(str6);
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = (!str6.contains(HybridSignPayJSHandler.ARG_TRADE_NO) || str6.startsWith("out_trade_no")) ? null : b(str6);
            }
            if (TextUtils.isEmpty(str5)) {
                str5 = !str6.contains("app_userid") ? null : b(str6);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb.append("biz_type=" + str2 + ";");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append("biz_no=" + str3 + ";");
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("trade_no=" + str4 + ";");
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append("app_userid=" + str5 + ";");
        }
        String sb2 = sb.toString();
        return sb2.endsWith(";") ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    private static String b(String str) {
        String[] split = str.split("=");
        if (split.length > 1) {
            String str2 = split[1];
            return str2.contains(CommonConstant.Symbol.DOUBLE_QUOTES) ? str2.replaceAll(CommonConstant.Symbol.DOUBLE_QUOTES, "") : str2;
        }
        return null;
    }
}
