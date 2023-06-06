package com.hhmedic.android.sdk.okhttputils.okhttp.request;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.c;
import okio.d;
import okio.h;
import okio.m;
import okio.r;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CountingRequestBody extends RequestBody {
    protected CountingSink countingSink;
    protected RequestBody delegate;
    protected Listener listener;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface Listener {
        void onRequestProgress(long j, long j2);
    }

    public CountingRequestBody(RequestBody requestBody, Listener listener) {
        this.delegate = requestBody;
        this.listener = listener;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.delegate.contentType();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        try {
            return this.delegate.contentLength();
        } catch (IOException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    @Override // okhttp3.RequestBody
    public void writeTo(d dVar) throws IOException {
        this.countingSink = new CountingSink(dVar);
        d a = m.a(this.countingSink);
        this.delegate.writeTo(a);
        a.flush();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public final class CountingSink extends h {
        private long bytesWritten;

        public CountingSink(r rVar) {
            super(rVar);
            this.bytesWritten = 0L;
        }

        @Override // okio.h, okio.r
        public final void write(c cVar, long j) throws IOException {
            super.write(cVar, j);
            this.bytesWritten += j;
            CountingRequestBody.this.listener.onRequestProgress(this.bytesWritten, CountingRequestBody.this.contentLength());
        }
    }
}
