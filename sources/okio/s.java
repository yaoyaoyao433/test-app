package okio;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface s extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(c cVar, long j) throws IOException;

    t timeout();
}
