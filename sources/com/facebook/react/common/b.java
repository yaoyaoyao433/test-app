package com.facebook.react.common;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public int a = 0;
    private long[] b;

    public static b a(int i) {
        return new b(20);
    }

    private b(int i) {
        this.b = new long[i];
    }

    public final long b(int i) {
        if (i >= this.a) {
            throw new IndexOutOfBoundsException(i + " >= " + this.a);
        }
        return this.b[i];
    }

    public final void a(int i, long j) {
        if (i >= this.a) {
            throw new IndexOutOfBoundsException(i + " >= " + this.a);
        }
        this.b[i] = j;
    }

    public final int a() {
        return this.a;
    }

    public final void c(int i) {
        if (i > this.a) {
            throw new IndexOutOfBoundsException("Trying to drop " + i + " items from array of length " + this.a);
        }
        this.a -= i;
    }

    public final void a(long j) {
        if (this.a == this.b.length) {
            long[] jArr = new long[Math.max(this.a + 1, (int) (this.a * 1.8d))];
            System.arraycopy(this.b, 0, jArr, 0, this.a);
            this.b = jArr;
        }
        long[] jArr2 = this.b;
        int i = this.a;
        this.a = i + 1;
        jArr2[i] = j;
    }
}
