package com.squareup.okhttp.internal.http;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n {
    public static String a(com.squareup.okhttp.s sVar) {
        String f = sVar.f();
        String h = sVar.h();
        if (h != null) {
            return f + '?' + h;
        }
        return f;
    }
}
