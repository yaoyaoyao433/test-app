package com.google.archivepatcher.shared;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    private boolean b = true;
    private int c = 32768;
    private int d = 32768;
    private Inflater e = null;
    boolean a = false;

    public final void a(boolean z) {
        if (z != this.b) {
            a();
            this.b = z;
        }
    }

    public final void a() {
        if (this.e != null) {
            this.e.end();
            this.e = null;
        }
    }

    public final void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Inflater inflater = this.e;
        if (inflater == null) {
            inflater = new Inflater(this.b);
            if (this.a) {
                this.e = inflater;
            }
        } else {
            inflater.reset();
        }
        InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream, inflater, this.c);
        byte[] bArr = new byte[this.d];
        while (true) {
            int read = inflaterInputStream.read(bArr);
            if (read < 0) {
                break;
            }
            outputStream.write(bArr, 0, read);
        }
        if (this.a) {
            return;
        }
        a();
    }
}
