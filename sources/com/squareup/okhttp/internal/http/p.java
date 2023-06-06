package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class p extends Exception {
    public static final Method a;
    public IOException b;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        a = method;
    }

    public p(IOException iOException) {
        super(iOException);
        this.b = iOException;
    }
}
