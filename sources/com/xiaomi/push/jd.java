package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes6.dex */
public final class jd extends jh {
    protected InputStream a;
    protected OutputStream b;

    protected jd() {
        this.a = null;
        this.b = null;
    }

    public jd(OutputStream outputStream) {
        this.a = null;
        this.b = null;
        this.b = outputStream;
    }

    @Override // com.xiaomi.push.jh
    public final int a(byte[] bArr, int i, int i2) {
        if (this.a != null) {
            try {
                int read = this.a.read(bArr, i, i2);
                if (read >= 0) {
                    return read;
                }
                throw new ji(4);
            } catch (IOException e) {
                throw new ji(0, e);
            }
        }
        throw new ji(1, "Cannot read from null inputStream");
    }

    @Override // com.xiaomi.push.jh
    public final void b(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            throw new ji(1, "Cannot write to null outputStream");
        }
        try {
            this.b.write(bArr, i, i2);
        } catch (IOException e) {
            throw new ji(0, e);
        }
    }
}
