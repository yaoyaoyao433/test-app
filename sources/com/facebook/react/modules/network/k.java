package com.facebook.react.modules.network;

import android.support.annotation.Nullable;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k extends ResponseBody {
    long a = 0;
    private final ResponseBody b;
    private final i c;
    @Nullable
    private okio.e d;

    public k(ResponseBody responseBody, i iVar) {
        this.b = responseBody;
        this.c = iVar;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.b.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.b.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public final okio.e source() {
        if (this.d == null) {
            this.d = okio.m.a(new okio.i(this.b.source()) { // from class: com.facebook.react.modules.network.k.1
                @Override // okio.i, okio.s
                public final long read(okio.c cVar, long j) throws IOException {
                    long read = super.read(cVar, j);
                    int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
                    k.this.a += i != 0 ? read : 0L;
                    k.this.c.a(k.this.a, k.this.b.contentLength(), i == 0);
                    return read;
                }
            });
        }
        return this.d;
    }
}
