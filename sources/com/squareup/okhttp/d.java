package com.squareup.okhttp;

import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static final d a;
    public static final d b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final boolean k;
    String l;
    private final int m;
    private final boolean n;

    static {
        a aVar = new a();
        aVar.a = true;
        a = aVar.a();
        a aVar2 = new a();
        aVar2.f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        aVar2.d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        b = aVar2.a();
    }

    private d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.c = z;
        this.d = z2;
        this.e = i;
        this.m = i2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = i3;
        this.j = i4;
        this.k = z6;
        this.n = z7;
        this.l = str;
    }

    private d(a aVar) {
        this.c = aVar.a;
        this.d = aVar.b;
        this.e = aVar.c;
        this.m = -1;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = aVar.d;
        this.j = aVar.e;
        this.k = aVar.f;
        this.n = aVar.g;
    }

    public final String toString() {
        String sb;
        String str = this.l;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.c) {
            sb2.append("no-cache, ");
        }
        if (this.d) {
            sb2.append("no-store, ");
        }
        if (this.e != -1) {
            sb2.append("max-age=");
            sb2.append(this.e);
            sb2.append(", ");
        }
        if (this.m != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.m);
            sb2.append(", ");
        }
        if (this.f) {
            sb2.append("private, ");
        }
        if (this.g) {
            sb2.append("public, ");
        }
        if (this.h) {
            sb2.append("must-revalidate, ");
        }
        if (this.i != -1) {
            sb2.append("max-stale=");
            sb2.append(this.i);
            sb2.append(", ");
        }
        if (this.j != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.j);
            sb2.append(", ");
        }
        if (this.k) {
            sb2.append("only-if-cached, ");
        }
        if (this.n) {
            sb2.append("no-transform, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        this.l = sb;
        return sb;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        boolean a;
        public boolean b;
        int c = -1;
        int d = -1;
        int e = -1;
        boolean f;
        boolean g;

        public final d a() {
            return new d(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.squareup.okhttp.d a(com.squareup.okhttp.r r22) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.d.a(com.squareup.okhttp.r):com.squareup.okhttp.d");
    }
}
