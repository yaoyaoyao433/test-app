package com.meizu.cloud.pushsdk.c.c;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
/* loaded from: classes3.dex */
public abstract class j {
    public static j a(final g gVar, final File file) {
        if (file != null) {
            return new j() { // from class: com.meizu.cloud.pushsdk.c.c.j.2
                @Override // com.meizu.cloud.pushsdk.c.c.j
                public final g a() {
                    return g.this;
                }

                @Override // com.meizu.cloud.pushsdk.c.c.j
                public final void a(com.meizu.cloud.pushsdk.c.g.c cVar) throws IOException {
                    com.meizu.cloud.pushsdk.c.g.m a;
                    com.meizu.cloud.pushsdk.c.g.m mVar = null;
                    try {
                        a = com.meizu.cloud.pushsdk.c.g.g.a(file);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        cVar.a(a);
                        m.a(a);
                    } catch (Throwable th2) {
                        th = th2;
                        mVar = a;
                        m.a(mVar);
                        throw th;
                    }
                }

                @Override // com.meizu.cloud.pushsdk.c.c.j
                public final long b() {
                    return file.length();
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static j a(g gVar, String str) {
        Charset charset = m.c;
        if (gVar != null && (charset = gVar.a()) == null) {
            charset = m.c;
            gVar = g.a(gVar + "; charset=utf-8");
        }
        return a(gVar, str.getBytes(charset));
    }

    public static j a(g gVar, byte[] bArr) {
        return a(gVar, bArr, 0, bArr.length);
    }

    private static j a(final g gVar, final byte[] bArr, int i, final int i2) {
        if (bArr != null) {
            m.a(bArr.length, 0L, i2);
            return new j() { // from class: com.meizu.cloud.pushsdk.c.c.j.1
                @Override // com.meizu.cloud.pushsdk.c.c.j
                public final g a() {
                    return g.this;
                }

                @Override // com.meizu.cloud.pushsdk.c.c.j
                public final void a(com.meizu.cloud.pushsdk.c.g.c cVar) throws IOException {
                    cVar.c(bArr, r4, i2);
                }

                @Override // com.meizu.cloud.pushsdk.c.c.j
                public final long b() {
                    return i2;
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public abstract g a();

    public abstract void a(com.meizu.cloud.pushsdk.c.g.c cVar) throws IOException;

    public long b() throws IOException {
        return -1L;
    }
}
