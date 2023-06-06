package com.alipay.sdk.util;

import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    private static Map<String, String> a(String str) {
        String[] split = str.split(";");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String substring = str2.substring(0, str2.indexOf("={"));
            String str3 = substring + "={";
            hashMap.put(substring, str2.substring(str2.indexOf(str3) + str3.length(), str2.lastIndexOf(CommonConstant.Symbol.BIG_BRACKET_RIGHT)));
        }
        return hashMap;
    }

    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            if (matcher.find()) {
                return matcher.group(2);
            }
        } catch (Throwable th) {
            d.a(th);
        }
        return CommonConstant.Symbol.QUESTION_MARK;
    }

    public static Map<String, String> a(com.alipay.sdk.sys.a aVar, String str) {
        com.alipay.sdk.app.e a = com.alipay.sdk.app.e.a(com.alipay.sdk.app.e.CANCELED.i);
        HashMap hashMap = new HashMap();
        hashMap.put("resultStatus", Integer.toString(a.i));
        hashMap.put("memo", a.j);
        hashMap.put("result", "");
        try {
            return a(str);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "FormatResultEx", th);
            return hashMap;
        }
    }
}
