package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k {
    int a;
    final okio.e b;
    private final okio.l c;

    public k(okio.e eVar) {
        this.c = new okio.l(new okio.i(eVar) { // from class: com.squareup.okhttp.internal.framed.k.1
            @Override // okio.i, okio.s
            public final long read(okio.c cVar, long j) throws IOException {
                if (k.this.a == 0) {
                    return -1L;
                }
                long read = super.read(cVar, Math.min(j, k.this.a));
                if (read == -1) {
                    return -1L;
                }
                k kVar = k.this;
                kVar.a = (int) (kVar.a - read);
                return read;
            }
        }, new Inflater() { // from class: com.squareup.okhttp.internal.framed.k.2
            @Override // java.util.zip.Inflater
            public final int inflate(byte[] bArr, int i, int i2) throws DataFormatException {
                int inflate = super.inflate(bArr, i, i2);
                if (inflate == 0 && needsDictionary()) {
                    setDictionary(o.a);
                    return super.inflate(bArr, i, i2);
                }
                return inflate;
            }
        });
        this.b = okio.m.a(this.c);
    }

    public final List<f> a(int i) throws IOException {
        this.a += i;
        int i2 = this.b.i();
        if (i2 < 0) {
            throw new IOException("numberOfPairs < 0: " + i2);
        } else if (i2 > 1024) {
            throw new IOException("numberOfPairs > 1024: " + i2);
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                okio.f g = a().g();
                okio.f a = a();
                if (g.h() == 0) {
                    throw new IOException("name.size == 0");
                }
                arrayList.add(new f(g, a));
            }
            if (this.a > 0) {
                this.c.a();
                if (this.a != 0) {
                    throw new IOException("compressedLimit > 0: " + this.a);
                }
            }
            return arrayList;
        }
    }

    private okio.f a() throws IOException {
        return this.b.d(this.b.i());
    }
}
