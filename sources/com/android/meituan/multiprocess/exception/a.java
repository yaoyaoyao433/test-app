package com.android.meituan.multiprocess.exception;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends Exception {
    public a() {
    }

    public a(String str) {
        super(str);
    }

    public static a a(String str) {
        return new a(b(str));
    }

    public static String b(String str) {
        return String.format("the %s can not transfer!!!, please implement it's TypeTransfer", str);
    }

    public static boolean c(String str) {
        return str != null && str.endsWith("can not transfer!!!, please implement it's TypeTransfer");
    }
}
