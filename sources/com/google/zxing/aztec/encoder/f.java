package com.google.zxing.aztec.encoder;

import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    static final f a = new f(g.a, 0, 0, 0);
    final int b;
    final int c;
    final int d;
    private final g e;

    private f(g gVar, int i, int i2, int i3) {
        this.e = gVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final f a(int i, int i2) {
        int i3 = this.d;
        g gVar = this.e;
        if (i != this.b) {
            int i4 = d.b[this.b][i];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            gVar = gVar.a(i5, i6);
            i3 += i6;
        }
        int i7 = i == 2 ? 4 : 5;
        return new f(gVar.a(i2, i7), i, 0, i3 + i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final f b(int i, int i2) {
        g gVar = this.e;
        int i3 = this.b == 2 ? 4 : 5;
        return new f(gVar.a(d.c[this.b][i], i3).a(i2, 5), this.b, 0, this.d + i3 + 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final f a(int i) {
        g gVar = this.e;
        int i2 = this.b;
        int i3 = this.d;
        if (this.b == 4 || this.b == 2) {
            int i4 = d.b[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            gVar = gVar.a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        f fVar = new f(gVar, i2, this.c + 1, i3 + ((this.c == 0 || this.c == 31) ? 18 : this.c == 62 ? 9 : 8));
        return fVar.c == 2078 ? fVar.b(i + 1) : fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final f b(int i) {
        return this.c == 0 ? this : new f(this.e.b(i - this.c, this.c), this.b, 0, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(f fVar) {
        int i = this.d + (d.b[this.b][fVar.b] >> 16);
        if (fVar.c > 0 && (this.c == 0 || this.c > fVar.c)) {
            i += 10;
        }
        return i <= fVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.zxing.common.a a(byte[] bArr) {
        LinkedList<g> linkedList = new LinkedList();
        for (g gVar = b(bArr.length).e; gVar != null; gVar = gVar.b) {
            linkedList.addFirst(gVar);
        }
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        for (g gVar2 : linkedList) {
            gVar2.a(aVar, bArr);
        }
        return aVar;
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", d.a[this.b], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
