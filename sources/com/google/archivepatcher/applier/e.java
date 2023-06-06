package com.google.archivepatcher.applier;

import com.google.archivepatcher.shared.k;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends FilterOutputStream {
    private final OutputStream a;
    private Deflater b;
    private DeflaterOutputStream c;
    private final byte[] d;
    private final int e;
    private long f;
    private final Iterator<k<com.google.archivepatcher.shared.f>> g;
    private k<com.google.archivepatcher.shared.f> h;
    private com.google.archivepatcher.shared.f i;

    public e(List<k<com.google.archivepatcher.shared.f>> list, OutputStream outputStream, int i) {
        super(outputStream);
        this.b = null;
        this.c = null;
        this.d = new byte[1];
        this.h = null;
        this.i = null;
        this.a = outputStream;
        this.e = 32768;
        this.g = list.iterator();
        if (this.g.hasNext()) {
            this.h = this.g.next();
        } else {
            this.h = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.d[0] = (byte) i;
        write(this.d, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    private boolean a() {
        return this.c != null;
    }

    private long b() {
        if (this.h == null) {
            return -1L;
        }
        return this.h.a - this.f;
    }

    private long c() {
        if (this.h == null) {
            return -1L;
        }
        return (this.h.a + this.h.b) - this.f;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        OutputStream outputStream;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i + i3;
            int i5 = i2 - i3;
            if (b() == 0 && !a()) {
                com.google.archivepatcher.shared.f fVar = this.h.c;
                if (this.b == null) {
                    this.b = new Deflater(fVar.ac, fVar.ae);
                } else if (this.i.ae != fVar.ae) {
                    this.b.end();
                    this.b = new Deflater(fVar.ac, fVar.ae);
                }
                this.b.setLevel(fVar.ac);
                this.b.setStrategy(fVar.ad);
                this.c = new DeflaterOutputStream(this.a, this.b, this.e);
            }
            if (a()) {
                i5 = (int) Math.min(i5, c());
                outputStream = this.c;
            } else {
                outputStream = this.a;
                if (this.h != null) {
                    i5 = (int) Math.min(i5, b());
                }
            }
            outputStream.write(bArr, i4, i5);
            this.f += i5;
            if (a() && c() == 0) {
                this.c.finish();
                this.c.flush();
                this.c = null;
                this.b.reset();
                this.i = this.h.c;
                if (this.g.hasNext()) {
                    this.h = this.g.next();
                } else {
                    this.h = null;
                    this.b.end();
                    this.b = null;
                }
            }
            i3 += i5;
        }
    }
}
