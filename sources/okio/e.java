package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface e extends ReadableByteChannel, s {
    long a(byte b) throws IOException;

    String a(Charset charset) throws IOException;

    c a();

    void a(long j) throws IOException;

    void a(c cVar, long j) throws IOException;

    void a(byte[] bArr) throws IOException;

    boolean a(long j, f fVar) throws IOException;

    boolean b(long j) throws IOException;

    f d(long j) throws IOException;

    boolean d() throws IOException;

    InputStream e();

    String f(long j) throws IOException;

    byte g() throws IOException;

    short h() throws IOException;

    byte[] h(long j) throws IOException;

    int i() throws IOException;

    void i(long j) throws IOException;

    long j() throws IOException;

    short k() throws IOException;

    int l() throws IOException;

    long m() throws IOException;

    long n() throws IOException;

    String q() throws IOException;

    byte[] r() throws IOException;
}
