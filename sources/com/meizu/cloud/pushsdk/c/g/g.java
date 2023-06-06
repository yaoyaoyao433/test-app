package com.meizu.cloud.pushsdk.c.g;

import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
/* loaded from: classes3.dex */
public final class g {
    private static final Logger a = Logger.getLogger(g.class.getName());

    private g() {
    }

    public static c a(l lVar) {
        if (lVar != null) {
            return new h(lVar);
        }
        throw new IllegalArgumentException("sink == null");
    }

    public static d a(m mVar) {
        if (mVar != null) {
            return new i(mVar);
        }
        throw new IllegalArgumentException("source == null");
    }

    public static m a(File file) throws FileNotFoundException {
        if (file != null) {
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static l a(final OutputStream outputStream) {
        final n nVar = new n();
        if (outputStream != null) {
            return new l() { // from class: com.meizu.cloud.pushsdk.c.g.g.1
                @Override // com.meizu.cloud.pushsdk.c.g.l
                public final void a(b bVar, long j) throws IOException {
                    o.a(bVar.b, 0L, j);
                    while (j > 0) {
                        n.this.a();
                        j jVar = bVar.a;
                        int min = (int) Math.min(j, jVar.c - jVar.b);
                        outputStream.write(jVar.a, jVar.b, min);
                        jVar.b += min;
                        long j2 = min;
                        j -= j2;
                        bVar.b -= j2;
                        if (jVar.b == jVar.c) {
                            bVar.a = jVar.a();
                            k.a(jVar);
                        }
                    }
                }

                @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.c.g.m
                public final void close() throws IOException {
                    outputStream.close();
                }

                @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Flushable
                public final void flush() throws IOException {
                    outputStream.flush();
                }

                public final String toString() {
                    return "sink(" + outputStream + CommonConstant.Symbol.BRACKET_RIGHT;
                }
            };
        }
        throw new IllegalArgumentException("out == null");
    }

    public static m a(final InputStream inputStream) {
        final n nVar = new n();
        if (inputStream != null) {
            return new m() { // from class: com.meizu.cloud.pushsdk.c.g.g.2
                @Override // com.meizu.cloud.pushsdk.c.g.m
                public final long b(b bVar, long j) throws IOException {
                    int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i < 0) {
                        throw new IllegalArgumentException("byteCount < 0: " + j);
                    } else if (i == 0) {
                        return 0L;
                    } else {
                        n.this.a();
                        j c = bVar.c(1);
                        int read = inputStream.read(c.a, c.c, (int) Math.min(j, 2048 - c.c));
                        if (read == -1) {
                            return -1L;
                        }
                        c.c += read;
                        long j2 = read;
                        bVar.b += j2;
                        return j2;
                    }
                }

                @Override // com.meizu.cloud.pushsdk.c.g.m, java.lang.AutoCloseable
                public final void close() throws IOException {
                    inputStream.close();
                }

                public final String toString() {
                    return "source(" + inputStream + CommonConstant.Symbol.BRACKET_RIGHT;
                }
            };
        }
        throw new IllegalArgumentException("in == null");
    }
}
