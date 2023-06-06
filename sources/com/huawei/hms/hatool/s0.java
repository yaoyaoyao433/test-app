package com.huawei.hms.hatool;

import android.util.Pair;
import com.meituan.robust.common.CommonConstant;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class s0 {
    public static long a(String str, long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            return simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j))).getTime();
        } catch (ParseException unused) {
            y.f("hmsSdk/stringUtil", "getMillisOfDate(): Time conversion Exception !");
            return 0L;
        }
    }

    public static Pair<String, String> a(String str) {
        String str2;
        String str3;
        if ("_default_config_tag".equals(str)) {
            return new Pair<>(str, "");
        }
        String[] split = str.split(CommonConstant.Symbol.MINUS);
        if (split.length > 2) {
            str3 = split[split.length - 1];
            str2 = str.substring(0, (str.length() - str3.length()) - 1);
        } else {
            str2 = split[0];
            str3 = split[1];
        }
        return new Pair<>(str2, str3);
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return "oper";
            case 1:
                return "maint";
            case 2:
                return "preins";
            case 3:
                return "diffprivacy";
            default:
                return "alltype";
        }
    }

    public static String a(String str, String str2) {
        if ("_default_config_tag".equals(str)) {
            return str;
        }
        return str + CommonConstant.Symbol.MINUS + str2;
    }

    public static String a(String str, String str2, String str3) {
        if ("_default_config_tag".equals(str)) {
            return "_default_config_tag#" + str3;
        }
        return str + CommonConstant.Symbol.MINUS + str2 + "#" + str3;
    }

    public static Set<String> a(Set<String> set) {
        String str;
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (String str2 : set) {
            if ("_default_config_tag".equals(str2)) {
                str = "_default_config_tag";
            } else {
                String str3 = str2 + "-oper";
                String str4 = str2 + "-maint";
                str = str2 + "-diffprivacy";
                hashSet.add(str3);
                hashSet.add(str4);
            }
            hashSet.add(str);
        }
        return hashSet;
    }
}
