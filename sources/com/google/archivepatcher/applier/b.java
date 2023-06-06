package com.google.archivepatcher.applier;

import com.google.archivepatcher.shared.h;
import com.google.archivepatcher.shared.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    final long a;
    private final h.b b;
    private final k<Void> c;
    private final k<Void> d;

    public b(h.b bVar, k<Void> kVar, k<Void> kVar2, long j) {
        this.b = bVar;
        this.c = kVar;
        this.d = kVar2;
        this.a = j;
    }

    public final int hashCode() {
        return (((((((this.d == null ? 0 : this.d.hashCode()) + 31) * 31) + (this.c == null ? 0 : this.c.hashCode())) * 31) + ((int) (this.a ^ (this.a >>> 32)))) * 31) + (this.b != null ? this.b.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.d == null) {
                if (bVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(bVar.d)) {
                return false;
            }
            if (this.c == null) {
                if (bVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(bVar.c)) {
                return false;
            }
            return this.a == bVar.a && this.b == bVar.b;
        }
        return false;
    }
}
