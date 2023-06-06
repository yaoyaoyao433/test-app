package com.unionpay.mobile.android.data;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.unionpay.mobile.android.utils.i;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class a {
    public static final HashMap<String, Integer> a = new HashMap<>();

    public static SpannableString a(String str, String str2) {
        String[] split;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(-10066330), 0, str.length(), 33);
        if (str2 == null) {
            return spannableString;
        }
        int i = -10066330;
        for (String str3 : str2.split(";")) {
            if (a(str3)) {
                break;
            }
            try {
                i = Color.parseColor("#".concat(String.valueOf(str3)));
            } catch (Exception unused) {
            }
        }
        spannableString.setSpan(new ForegroundColorSpan(i), 0, str.length(), 33);
        return spannableString;
    }

    public static final boolean a(String str) {
        if (i.b(str)) {
            return false;
        }
        String[] strArr = {"black", "darkgray", "gray", "lightgray", "white", "red", "green", "blue", "yellow", "cyan", "magenta"};
        for (int i = 0; i < 11; i++) {
            if (strArr[i].equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
