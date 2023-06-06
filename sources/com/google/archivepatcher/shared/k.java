package com.google.archivepatcher.shared;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k<T> implements Comparable<k<T>> {
    public final long a;
    public final long b;
    public final T c;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        k kVar = (k) obj;
        if (this.a < kVar.a) {
            return -1;
        }
        return this.a > kVar.a ? 1 : 0;
    }

    public k(long j, long j2, T t) {
        this.a = j;
        this.b = j2;
        this.c = t;
    }

    public final String toString() {
        return "offset " + this.a + ", length " + this.b + ", metadata " + this.c;
    }

    public final int hashCode() {
        return ((((((int) (this.b ^ (this.b >>> 32))) + 31) * 31) + (this.c == null ? 0 : this.c.hashCode())) * 31) + ((int) (this.a ^ (this.a >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            k kVar = (k) obj;
            if (this.b != kVar.b) {
                return false;
            }
            if (this.c == null) {
                if (kVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(kVar.c)) {
                return false;
            }
            return this.a == kVar.a;
        }
        return false;
    }
}
