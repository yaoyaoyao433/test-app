package com.alipay.sdk.util;

import com.alipay.sdk.interior.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static a.InterfaceC0027a a;

    public static void a(String str, String str2) {
        a(c(str, str2));
    }

    public static void b(String str, String str2) {
        a(c(str, str2));
    }

    public static void a(String str) {
        try {
            if (a != null) {
                String.format("[AlipaySDK] %s %s", new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault()).format(new Date()), str);
            }
        } catch (Throwable unused) {
        }
    }

    public static String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void a(Throwable th) {
        try {
            a(b(th));
        } catch (Throwable unused) {
        }
    }

    public static String c(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return String.format("[%s][%s]", str, str2);
    }
}
