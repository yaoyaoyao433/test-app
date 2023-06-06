package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface d extends WritableByteChannel, r {
    long a(s sVar) throws IOException;

    c a();

    OutputStream b();

    d b(String str) throws IOException;

    d c() throws IOException;

    d c(f fVar) throws IOException;

    d c(byte[] bArr) throws IOException;

    d c(byte[] bArr, int i, int i2) throws IOException;

    d f(int i) throws IOException;

    void flush() throws IOException;

    d g(int i) throws IOException;

    d h(int i) throws IOException;

    d m(long j) throws IOException;

    d n(long j) throws IOException;

    d v() throws IOException;
}
