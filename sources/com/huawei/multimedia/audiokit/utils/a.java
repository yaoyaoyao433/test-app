package com.huawei.multimedia.audiokit.utils;

import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static <T> void a(String str, String str2, T... tArr) {
        Log.e(str, a(str2, tArr));
    }

    public static <T> String a(String str, T[] tArr) {
        try {
            return String.format(Locale.ENGLISH, str.replaceAll("\\{\\}", "%s"), tArr);
        } catch (IllegalFormatException | PatternSyntaxException e) {
            return "log message error : " + e.getMessage();
        }
    }
}
