package com.unionpay.mobile.android.hce;
/* loaded from: classes6.dex */
public final class l {
    private String a;
    private String b = null;
    private com.unionpay.mobile.android.hce.service.a c = null;
    private boolean d = false;
    private boolean e = false;

    public l(String str) {
        this.a = str;
    }

    public final void a(com.unionpay.mobile.android.hce.service.a aVar) {
        this.c = aVar;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final boolean a() {
        return this.d;
    }

    public final com.unionpay.mobile.android.hce.service.a b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final void d() {
        this.d = true;
    }

    public final void e() {
        this.e = true;
    }
}
