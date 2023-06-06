package com.facebook.react.modules.network;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j extends RequestBody {
    private final RequestBody a;
    private final i b;
    private long c = 0;

    public j(RequestBody requestBody, i iVar) {
        this.a = requestBody;
        this.b = iVar;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.a.contentType();
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws IOException {
        if (this.c == 0) {
            this.c = this.a.contentLength();
        }
        return this.c;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(okio.d dVar) throws IOException {
        okio.d a = okio.m.a(okio.m.a(new b(dVar.b()) { // from class: com.facebook.react.modules.network.j.1
            @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) throws IOException {
                super.write(bArr, i, i2);
                b();
            }

            @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) throws IOException {
                super.write(i);
                b();
            }

            private void b() throws IOException {
                long j = this.a;
                long contentLength = j.this.contentLength();
                j.this.b.a(j, contentLength, j == contentLength);
            }
        }));
        contentLength();
        this.a.writeTo(a);
        a.flush();
    }
}
