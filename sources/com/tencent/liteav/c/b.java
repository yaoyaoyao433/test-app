package com.tencent.liteav.c;

import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private static b l;
    public String a;
    public long b;
    public long c;
    public long d;
    public boolean e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;

    public static b a() {
        if (l == null) {
            l = new b();
        }
        return l;
    }

    private b() {
        b();
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            b();
        } else if (this.a == null || !this.a.equals(str)) {
            this.a = str;
        }
    }

    public void b() {
        c();
        this.f = 1.0f;
        this.i = false;
        this.j = 0L;
        this.k = 0L;
    }

    private void c() {
        this.a = null;
        this.b = -1L;
        this.c = -1L;
        this.h = false;
        this.e = false;
    }
}
