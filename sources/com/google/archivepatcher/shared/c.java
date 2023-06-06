package com.google.archivepatcher.shared;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    int a = -1;
    int b = 0;
    boolean c = true;
    private int f = 32768;
    private int g = 32768;
    Deflater d = null;
    boolean e = false;

    public final void a() {
        if (this.d != null) {
            this.d.end();
            this.d = null;
        }
    }

    public final void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[this.f];
        Deflater deflater = this.d;
        if (deflater == null) {
            deflater = new Deflater(this.a, this.c);
            deflater.setStrategy(this.b);
            if (this.e) {
                this.d = deflater;
            }
        } else {
            deflater.reset();
        }
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream, deflater, this.g);
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                deflaterOutputStream.write(bArr, 0, read);
            } else {
                deflaterOutputStream.finish();
                deflaterOutputStream.flush();
                return;
            }
        }
    }
}
