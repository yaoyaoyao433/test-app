package com.squareup.okhttp;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class aa implements Closeable {
    public abstract u a();

    public abstract long b() throws IOException;

    public abstract okio.e c() throws IOException;

    public final InputStream d() throws IOException {
        return c().e();
    }

    public final byte[] e() throws IOException {
        long b = b();
        if (b > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + b);
        }
        okio.e c = c();
        try {
            byte[] r = c.r();
            com.squareup.okhttp.internal.j.a(c);
            if (b == -1 || b == r.length) {
                return r;
            }
            throw new IOException("Content-Length and stream length disagree");
        } catch (Throwable th) {
            com.squareup.okhttp.internal.j.a(c);
            throw th;
        }
    }

    public final String f() throws IOException {
        return new String(e(), g().name());
    }

    private Charset g() {
        u a = a();
        return a != null ? a.a(com.squareup.okhttp.internal.j.c) : com.squareup.okhttp.internal.j.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c().close();
    }

    public static aa a(u uVar, byte[] bArr) {
        return a(uVar, bArr.length, new okio.c().c(bArr));
    }

    public static aa a(final u uVar, final long j, final okio.e eVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        return new aa() { // from class: com.squareup.okhttp.aa.1
            @Override // com.squareup.okhttp.aa
            public final u a() {
                return u.this;
            }

            @Override // com.squareup.okhttp.aa
            public final long b() {
                return j;
            }

            @Override // com.squareup.okhttp.aa
            public final okio.e c() {
                return eVar;
            }
        };
    }
}
