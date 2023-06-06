package com.squareup.picasso.progressive;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends InputStream {
    protected k a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(k kVar) {
        this.a = kVar;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        j jVar;
        byte[] bArr;
        if (this.a == null) {
            return 0;
        }
        k kVar = this.a;
        if (kVar.c.size() == 0 || kVar.b >= kVar.c.size() || (jVar = kVar.c.get(kVar.b)) == null || (bArr = jVar.a) == null) {
            return -1;
        }
        int i = kVar.a;
        kVar.a = i + 1;
        int i2 = bArr[i] & 255;
        if (kVar.a >= jVar.b) {
            kVar.b++;
            kVar.a = 0;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        j jVar;
        if (this.a == null) {
            return 0L;
        }
        k kVar = this.a;
        if (kVar.c.size() == 0) {
            return 0L;
        }
        long j2 = 0;
        while (j > 0 && kVar.b < kVar.c.size() && (jVar = kVar.c.get(kVar.b)) != null) {
            long j3 = jVar.b - kVar.a;
            if (j >= j3) {
                kVar.a = 0;
                kVar.b++;
                j -= j3;
                j2 += j3;
            } else {
                kVar.a = (int) (kVar.a + j);
                return j2 + j;
            }
        }
        return j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.a == null) {
            return 0;
        }
        k kVar = this.a;
        if (kVar.c.size() == 0) {
            return 0;
        }
        int i3 = 0;
        while (i2 > 0 && kVar.b < kVar.c.size()) {
            j jVar = kVar.c.get(kVar.b);
            if (jVar == null) {
                return i3;
            }
            int i4 = jVar.b - kVar.a;
            byte[] bArr2 = jVar.a;
            if (i2 >= i4) {
                System.arraycopy(bArr2, kVar.a, bArr, i, i4);
                i += i4;
                kVar.a = 0;
                kVar.b++;
                i2 -= i4;
                i3 += i4;
            } else {
                System.arraycopy(bArr2, kVar.a, bArr, i, i2);
                kVar.a += i2;
                return i3 + i2;
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.a == null) {
            return 0;
        }
        throw new RuntimeException("Stub!");
    }
}
