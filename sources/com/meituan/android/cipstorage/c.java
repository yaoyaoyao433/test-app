package com.meituan.android.cipstorage;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends RuntimeException {
    public final int a;

    public c(short s) {
        this(s, null, null);
    }

    public c(short s, String str) {
        this(s, str, null);
    }

    public c(short s, Throwable th) {
        this((short) -1, null, th);
    }

    private c(short s, String str, Throwable th) {
        super("errCode:" + ((int) s) + " errMsg: " + str, th);
        this.a = s;
    }
}
