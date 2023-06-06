package com.huawei.secure.android.common.util;

import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {
    private static final String a = "d";

    public static String a(String str, int i) {
        if (str == null || str.length() < i || i < 0) {
            return "";
        }
        try {
            return str.substring(i);
        } catch (Exception e) {
            String str2 = a;
            Log.e(str2, "substring exception: " + e.getMessage());
            return "";
        }
    }

    public static String a(String str, int i, int i2) {
        if (str == null || i < 0 || i2 > str.length() || i2 < i) {
            return "";
        }
        try {
            return str.substring(i, i2);
        } catch (Exception e) {
            String str2 = a;
            Log.e(str2, "substring: " + e.getMessage());
            return "";
        }
    }

    public static String a(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (str == null || charSequence == null || charSequence2 == null) {
            return str;
        }
        try {
            return str.replace(charSequence, charSequence2);
        } catch (Exception e) {
            String str2 = a;
            Log.e(str2, "replace: " + e.getMessage());
            return str;
        }
    }
}
