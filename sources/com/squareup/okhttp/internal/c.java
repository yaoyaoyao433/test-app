package com.squareup.okhttp.internal;

import java.io.IOException;
import okio.r;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends okio.h {
    private boolean a;

    protected void a(IOException iOException) {
    }

    public c(r rVar) {
        super(rVar);
    }

    @Override // okio.h, okio.r
    public void write(okio.c cVar, long j) throws IOException {
        if (this.a) {
            cVar.i(j);
            return;
        }
        try {
            super.write(cVar, j);
        } catch (IOException e) {
            this.a = true;
            a(e);
        }
    }

    @Override // okio.h, okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.a) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.a = true;
            a(e);
        }
    }

    @Override // okio.h, okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.a) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.a = true;
            a(e);
        }
    }
}
