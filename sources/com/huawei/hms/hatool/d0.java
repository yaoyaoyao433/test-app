package com.huawei.hms.hatool;

import android.os.Build;
import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d0 {
    public static d0 c;
    public String a;
    public String b;

    public static d0 f() {
        if (c == null) {
            g();
        }
        return c;
    }

    public static synchronized void g() {
        synchronized (d0.class) {
            if (c == null) {
                c = new d0();
            }
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.a)) {
            this.a = c();
        }
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (e() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            boolean r1 = r2.e()
            if (r1 == 0) goto Le
            java.lang.String r0 = "analytics_keystore"
            java.lang.String r0 = com.huawei.secure.android.common.encrypt.keystore.aes.a.b(r0, r3)
        Le:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L4f
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "deCrypt work key first"
            com.huawei.hms.hatool.y.c(r0, r1)
            java.lang.String r0 = r2.d()
            java.lang.String r0 = com.huawei.hms.hatool.d.a(r3, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L41
            r3 = 16
            java.lang.String r0 = com.huawei.secure.android.common.encrypt.utils.b.b(r3)
            java.lang.String r3 = r2.b(r0)
            r2.c(r3)
            boolean r3 = r2.e()
            if (r3 == 0) goto L4f
        L3d:
            com.huawei.hms.hatool.c0.d()
            goto L4f
        L41:
            boolean r3 = r2.e()
            if (r3 == 0) goto L4f
            java.lang.String r3 = r2.b(r0)
            r2.c(r3)
            goto L3d
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.d0.a(java.lang.String):java.lang.String");
    }

    public final String b(String str) {
        return e() ? com.huawei.secure.android.common.encrypt.keystore.aes.a.a("analytics_keystore", str) : d.b(str, d());
    }

    public void b() {
        String b = com.huawei.secure.android.common.encrypt.utils.b.b(16);
        if (c(b(b))) {
            this.a = b;
        }
    }

    public final String c() {
        String a = g0.a(b.f(), "Privacy_MY", "PrivacyData", "");
        if (TextUtils.isEmpty(a)) {
            String b = com.huawei.secure.android.common.encrypt.utils.b.b(16);
            c(b(b));
            return b;
        }
        return a(a);
    }

    public final boolean c(String str) {
        y.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            y.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        g0.b(b.f(), "Privacy_MY", "PrivacyData", str);
        g0.b(b.f(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public final String d() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = new c0().a();
        }
        return this.b;
    }

    public final boolean e() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
