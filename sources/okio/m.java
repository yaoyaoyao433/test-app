package okio;

import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class m {
    static final Logger a = Logger.getLogger(m.class.getName());

    private m() {
    }

    public static e a(s sVar) {
        return new o(sVar);
    }

    public static d a(r rVar) {
        return new n(rVar);
    }

    public static r a(OutputStream outputStream) {
        return a(outputStream, new t());
    }

    private static r a(final OutputStream outputStream, final t tVar) {
        if (outputStream != null) {
            if (tVar == null) {
                throw new IllegalArgumentException("timeout == null");
            }
            return new r() { // from class: okio.m.1
                @Override // okio.r
                public final void write(c cVar, long j) throws IOException {
                    u.a(cVar.b, 0L, j);
                    while (j > 0) {
                        t.this.throwIfReached();
                        Segment segment = cVar.a;
                        int min = (int) Math.min(j, segment.limit - segment.pos);
                        outputStream.write(segment.data, segment.pos, min);
                        segment.pos += min;
                        long j2 = min;
                        j -= j2;
                        cVar.b -= j2;
                        if (segment.pos == segment.limit) {
                            cVar.a = segment.pop();
                            p.a(segment);
                        }
                    }
                }

                @Override // okio.r, java.io.Flushable
                public final void flush() throws IOException {
                    outputStream.flush();
                }

                @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    outputStream.close();
                }

                @Override // okio.r
                public final t timeout() {
                    return t.this;
                }

                public final String toString() {
                    return "sink(" + outputStream + CommonConstant.Symbol.BRACKET_RIGHT;
                }
            };
        }
        throw new IllegalArgumentException("out == null");
    }

    public static r a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        a c = c(socket);
        return c.sink(a(socket.getOutputStream(), c));
    }

    public static s a(InputStream inputStream) {
        return a(inputStream, new t());
    }

    private static s a(final InputStream inputStream, final t tVar) {
        if (inputStream != null) {
            if (tVar == null) {
                throw new IllegalArgumentException("timeout == null");
            }
            return new s() { // from class: okio.m.2
                @Override // okio.s
                public final long read(c cVar, long j) throws IOException {
                    int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i < 0) {
                        throw new IllegalArgumentException("byteCount < 0: " + j);
                    } else if (i == 0) {
                        return 0L;
                    } else {
                        try {
                            t.this.throwIfReached();
                            Segment e = cVar.e(1);
                            int read = inputStream.read(e.data, e.limit, (int) Math.min(j, 8192 - e.limit));
                            if (read == -1) {
                                return -1L;
                            }
                            e.limit += read;
                            long j2 = read;
                            cVar.b += j2;
                            return j2;
                        } catch (AssertionError e2) {
                            if (m.a(e2)) {
                                throw new IOException(e2);
                            }
                            throw e2;
                        }
                    }
                }

                @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    inputStream.close();
                }

                @Override // okio.s
                public final t timeout() {
                    return t.this;
                }

                public final String toString() {
                    return "source(" + inputStream + CommonConstant.Symbol.BRACKET_RIGHT;
                }
            };
        }
        throw new IllegalArgumentException("in == null");
    }

    public static s a(File file) throws FileNotFoundException {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return a(new FileInputStream(file));
    }

    public static r b(File file) throws FileNotFoundException {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return a(new FileOutputStream(file));
    }

    public static r c(File file) throws FileNotFoundException {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return a(new FileOutputStream(file, true));
    }

    public static r a() {
        return new r() { // from class: okio.m.3
            @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
            }

            @Override // okio.r, java.io.Flushable
            public final void flush() throws IOException {
            }

            @Override // okio.r
            public final void write(c cVar, long j) throws IOException {
                cVar.i(j);
            }

            @Override // okio.r
            public final t timeout() {
                return t.NONE;
            }
        };
    }

    public static s b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        a c = c(socket);
        return c.source(a(socket.getInputStream(), c));
    }

    private static a c(final Socket socket) {
        return new a() { // from class: okio.m.4
            @Override // okio.a
            protected final IOException newTimeoutException(@Nullable IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // okio.a
            protected final void timedOut() {
                try {
                    socket.close();
                } catch (AssertionError e) {
                    if (m.a(e)) {
                        Logger logger = m.a;
                        Level level = Level.WARNING;
                        logger.log(level, "Failed to close timed out socket " + socket, (Throwable) e);
                        return;
                    }
                    throw e;
                } catch (Exception e2) {
                    Logger logger2 = m.a;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "Failed to close timed out socket " + socket, (Throwable) e2);
                }
            }
        };
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
