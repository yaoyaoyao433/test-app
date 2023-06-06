package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class bt {
    int a;
    long b;
    long c;
    String d;
    long e;

    public bt() {
        this(0, 0L, 0L, null);
    }

    public bt(int i, long j, long j2, Exception exc) {
        this.a = i;
        this.b = j;
        this.e = j2;
        this.c = System.currentTimeMillis();
        if (exc != null) {
            this.d = exc.getClass().getSimpleName();
        }
    }
}
