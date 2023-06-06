package com.tencent.open.utils;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l implements Cloneable {
    private long a;

    public l(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof l) && this.a == ((l) obj).b();
    }

    public final byte[] a() {
        return new byte[]{(byte) (this.a & 255), (byte) ((this.a & 65280) >> 8), (byte) ((this.a & 16711680) >> 16), (byte) ((this.a & 4278190080L) >> 24)};
    }

    public final long b() {
        return this.a;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
