package okhttp3.internal.cache;

import java.io.IOException;
import okio.c;
import okio.h;
import okio.r;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class FaultHidingSink extends h {
    private boolean hasErrors;

    protected void onException(IOException iOException) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FaultHidingSink(r rVar) {
        super(rVar);
    }

    @Override // okio.h, okio.r
    public void write(c cVar, long j) throws IOException {
        if (this.hasErrors) {
            cVar.i(j);
            return;
        }
        try {
            super.write(cVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }

    @Override // okio.h, okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }

    @Override // okio.h, okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }
}
