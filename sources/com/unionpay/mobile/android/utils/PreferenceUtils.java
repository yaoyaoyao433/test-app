package com.unionpay.mobile.android.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
/* loaded from: classes6.dex */
public class PreferenceUtils {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (com.unionpay.mobile.android.utils.c.a(r3) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (com.unionpay.mobile.android.utils.c.a(r3) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r7) {
        /*
            java.lang.String r0 = "uid"
            java.lang.String r1 = "tag1"
            java.lang.String r2 = "UnionPayPluginEx_v2.pref"
            r3 = 0
            android.content.SharedPreferences r2 = r7.getSharedPreferences(r2, r3)
            java.lang.String r3 = ""
            java.lang.String r3 = r2.getString(r0, r3)
            java.lang.String r4 = ""
            java.lang.String r4 = r2.getString(r1, r4)
            java.lang.String r5 = ""
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L57
            int r4 = r3.length()
            r5 = 32
            if (r4 != r5) goto L32
            boolean r4 = com.unionpay.mobile.android.utils.c.a(r3)
            if (r4 == 0) goto L2f
        L2d:
            r5 = r3
            goto L43
        L2f:
            java.lang.String r3 = ""
            goto L2d
        L32:
            java.lang.String r3 = a(r3)
            int r4 = r3.length()
            if (r4 != r5) goto L2f
            boolean r4 = com.unionpay.mobile.android.utils.c.a(r3)
            if (r4 != 0) goto L2d
            goto L2f
        L43:
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.remove(r0)
            r2.commit()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L61
            a(r7, r5, r1)
            goto L61
        L57:
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 != 0) goto L61
            java.lang.String r5 = a(r4)
        L61:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.utils.PreferenceUtils.a(android.content.Context):java.lang.String");
    }

    public static String a(Context context, String str) {
        return a(context.getSharedPreferences("UnionPayPluginEx_v2.pref", 0).getString(str, ""));
    }

    private static String a(String str) {
        String b = b(str, ("6972c2be8559884c23456789abcdef12123456786789abcd").substring(0, 32));
        return (b != null && b.endsWith("6972c2be8559884c")) ? b.substring(0, b.length() - "6972c2be8559884c".length()) : "";
    }

    private static String a(String str, String str2) {
        try {
            return b.a(e.a(b.a(str2), str.getBytes("utf-8")));
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(Context context, String str, String str2) {
        String substring = ("6972c2be8559884c23456789abcdef12123456786789abcd").substring(0, 32);
        String a = a(str + "6972c2be8559884c", substring);
        if (a == null) {
            a = "";
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("UnionPayPluginEx_v2.pref", 0).edit();
        edit.putString(str2, a);
        edit.commit();
    }

    public static String b(Context context) {
        return b(context, "last_pay_method", "tag2");
    }

    private static String b(Context context, String str, String str2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("UnionPayPluginEx_v2.pref", 0);
        String string = sharedPreferences.getString(str, "");
        String string2 = sharedPreferences.getString(str2, "");
        if (TextUtils.isEmpty(string)) {
            return !TextUtils.isEmpty(string2) ? a(string2) : "";
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.commit();
        return "";
    }

    private static String b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new String(e.b(b.a(str2), b.a(str)), "utf-8").trim();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void b(Context context, String str) {
        a(context, str, "tag1");
    }

    public static String c(Context context) {
        return b(context, "last_user", "tag3");
    }

    public static void c(Context context, String str) {
        a(context, str, "tag2");
    }

    public static void d(Context context, String str) {
        a(context, str, "tag3");
    }

    public static native String decPrefData(String str, String str2);

    public static native String forConfig(int i, String str);
}
