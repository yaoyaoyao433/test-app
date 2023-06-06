package com.alipay.apmobilesecuritysdk.b;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static a b = new a();
    public int a = 0;

    public static a a() {
        return b;
    }

    public final void a(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        if (com.alipay.security.mobile.module.a.a.b(null)) {
            return null;
        }
        int i = this.a;
        return i != 1 ? i != 3 ? i != 4 ? "https://mobilegw.alipay.com/mgw.htm" : "http://mobilegw.aaa.alipay.net/mgw.htm" : "http://mobilegw-1-64.test.alipay.net/mgw.htm" : "http://mobilegw.stable.alipay.net/mgw.htm";
    }
}
