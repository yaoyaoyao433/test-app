package com.google.archivepatcher.shared;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends FilterOutputStream {
    long a;

    public a(OutputStream outputStream) {
        super(outputStream);
        this.a = 0L;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.a++;
        this.out.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.a += bArr.length;
        this.out.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a += i2;
        this.out.write(bArr, i, i2);
    }
}
