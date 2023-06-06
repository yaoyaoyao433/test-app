package com.xiaomi.push;

import java.util.Map;
/* loaded from: classes6.dex */
public class fo implements Cloneable {
    public static String a = "wcc-ml-test10.bj";
    public static final String b = h.b;
    public static String c = null;
    public String d;
    int e;
    public String g;
    private String h;
    private fr j;
    public boolean f = fn.a;
    private boolean i = true;

    public static final String a() {
        return c != null ? c : e.a() ? "sandbox.xmpush.xiaomi.com" : e.b() ? b : "app.chat.xiaomi.net";
    }

    public static final void a(String str) {
        if (jj.a(jr.a()) && e.b()) {
            return;
        }
        c = str;
    }

    public byte[] b() {
        return null;
    }

    public final String c() {
        if (this.d == null) {
            this.d = a();
        }
        return this.d;
    }

    public fo(Map<String, Integer> map, int i, String str, fr frVar) {
        this.e = i;
        this.h = str;
        this.j = frVar;
    }
}
