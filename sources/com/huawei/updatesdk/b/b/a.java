package com.huawei.updatesdk.b.b;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    private static final Object d = new Object();
    private static a e;
    private b a;
    private String b;
    private boolean c = false;

    private a(Context context) {
        this.a = b.a("DeviceSessionUpdateSDK_V1", context);
    }

    public static a d() {
        a aVar;
        synchronized (d) {
            if (e == null) {
                e = new a(com.huawei.updatesdk.a.b.a.a.c().a());
            }
            aVar = e;
        }
        return aVar;
    }

    public final String a() {
        return this.b;
    }

    public final String a(String str) {
        b bVar = this.a;
        return bVar.a("updatesdk.lastAccountZone" + str, "");
    }

    public final void a(long j) {
        this.a.b("updatesdk.lastCheckDate", j);
    }

    public final void a(String str, long j) {
        b bVar = this.a;
        bVar.b("updatesdk.lastInitAccountTime" + str, j);
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.b(str, str2);
    }

    public final long b() {
        return this.a.a("updatesdk.lastCheckDate", 0L);
    }

    public final long b(String str) {
        b bVar = this.a;
        return bVar.a("updatesdk.lastInitAccountTime" + str, 0L);
    }

    public final void b(String str, String str2) {
        b bVar = this.a;
        bVar.b("updatesdk.lastAccountZone" + str, str2);
    }

    public final String c(String str) {
        return TextUtils.isEmpty(str) ? "" : this.a.a(str, "");
    }

    public final void c() {
        if (this.c) {
            return;
        }
        d("updatesdk.sign.param");
        d("updatesdk.signkey");
        d("updatesdk.signtime");
        this.c = true;
    }

    public final void d(String str) {
        this.a.a(str);
    }

    public final void e(String str) {
        this.b = str;
    }
}
