package com.facebook.common.logging;

import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements c {
    public static final b a = new b();
    private String b = "unknown";
    private int c = 5;

    public static b a() {
        return a;
    }

    private b() {
    }

    @Override // com.facebook.common.logging.c
    public final void a(int i) {
        this.c = i;
    }

    @Override // com.facebook.common.logging.c
    public final boolean b(int i) {
        return this.c <= i;
    }

    @Override // com.facebook.common.logging.c
    public final void a(String str, String str2) {
        a(3, str, str2);
    }

    @Override // com.facebook.common.logging.c
    public final void a(String str, String str2, Throwable th) {
        a(3, str, str2, th);
    }

    @Override // com.facebook.common.logging.c
    public final void b(String str, String str2) {
        a(4, str, str2);
    }

    @Override // com.facebook.common.logging.c
    public final void b(String str, String str2, Throwable th) {
        a(4, str, str2, th);
    }

    @Override // com.facebook.common.logging.c
    public final void c(String str, String str2) {
        a(5, str, str2);
    }

    @Override // com.facebook.common.logging.c
    public final void c(String str, String str2, Throwable th) {
        a(5, str, str2, th);
    }

    @Override // com.facebook.common.logging.c
    public final void d(String str, String str2) {
        a(6, str, str2);
    }

    @Override // com.facebook.common.logging.c
    public final void d(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    private void a(int i, String str, String str2) {
        Log.println(i, a(str), str2);
    }

    private void a(int i, String str, String str2, Throwable th) {
        Log.println(i, a(str), a(str2, th));
    }

    private String a(String str) {
        if (this.b != null) {
            return this.b + CommonConstant.Symbol.COLON + str;
        }
        return str;
    }

    private static String a(String str, Throwable th) {
        return str + '\n' + a(th);
    }

    private static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
