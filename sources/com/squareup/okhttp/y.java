package com.squareup.okhttp;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class y {
    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract u contentType();

    public abstract void writeTo(okio.d dVar) throws IOException;

    public static y create(u uVar, String str) {
        Charset charset = com.squareup.okhttp.internal.j.c;
        if (uVar != null) {
            charset = uVar.b != null ? Charset.forName(uVar.b) : null;
            if (charset == null) {
                charset = com.squareup.okhttp.internal.j.c;
                uVar = u.a(uVar + "; charset=utf-8");
            }
        }
        return create(uVar, str.getBytes(charset));
    }

    public static y create(final u uVar, final okio.f fVar) {
        return new y() { // from class: com.squareup.okhttp.y.1
            @Override // com.squareup.okhttp.y
            public final u contentType() {
                return u.this;
            }

            @Override // com.squareup.okhttp.y
            public final long contentLength() throws IOException {
                return fVar.h();
            }

            @Override // com.squareup.okhttp.y
            public final void writeTo(okio.d dVar) throws IOException {
                dVar.c(fVar);
            }
        };
    }

    public static y create(u uVar, byte[] bArr) {
        return create(uVar, bArr, 0, bArr.length);
    }

    public static y create(final u uVar, final byte[] bArr, final int i, final int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.squareup.okhttp.internal.j.a(bArr.length, i, i2);
        return new y() { // from class: com.squareup.okhttp.y.2
            @Override // com.squareup.okhttp.y
            public final u contentType() {
                return u.this;
            }

            @Override // com.squareup.okhttp.y
            public final long contentLength() {
                return i2;
            }

            @Override // com.squareup.okhttp.y
            public final void writeTo(okio.d dVar) throws IOException {
                dVar.c(bArr, i, i2);
            }
        };
    }

    public static y create(final u uVar, final File file) {
        if (file == null) {
            throw new NullPointerException("content == null");
        }
        return new y() { // from class: com.squareup.okhttp.y.3
            @Override // com.squareup.okhttp.y
            public final u contentType() {
                return u.this;
            }

            @Override // com.squareup.okhttp.y
            public final long contentLength() {
                return file.length();
            }

            @Override // com.squareup.okhttp.y
            public final void writeTo(okio.d dVar) throws IOException {
                okio.s a;
                okio.s sVar = null;
                try {
                    a = okio.m.a(file);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    dVar.a(a);
                    com.squareup.okhttp.internal.j.a(a);
                } catch (Throwable th2) {
                    th = th2;
                    sVar = a;
                    com.squareup.okhttp.internal.j.a(sVar);
                    throw th;
                }
            }
        };
    }
}
