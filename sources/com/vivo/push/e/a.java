package com.vivo.push.e;

import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    private static String[] a = {"com.vivo.pushservice", "com.vivo.pushdemo.test", "com.vivo.sdk.test", "com.vivo.hybrid"};
    private ArrayList<String> b;

    /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return C1515a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.vivo.push.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C1515a {
        private static a a = new a((byte) 0);
    }

    private a() {
        this.b = null;
        this.b = new ArrayList<>();
    }

    public final ArrayList<String> b() {
        return new ArrayList<>(this.b);
    }

    public final boolean c() {
        return (this.b == null || this.b.size() == 0) ? false : true;
    }
}
