package okhttp3.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.c;
import okio.d;
import okio.e;
import okio.j;
import okio.m;
import okio.r;
import okio.s;
import okio.t;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class Http1Codec implements HttpCodec {
    private static final int HEADER_LIMIT = 262144;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    final OkHttpClient client;
    final d sink;
    final e source;
    final StreamAllocation streamAllocation;
    int state = 0;
    private long headerLimit = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, e eVar, d dVar) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation;
        this.source = eVar;
        this.sink = dVar;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final r createRequestBody(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void writeRequestHeaders(Request request) throws IOException {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final ResponseBody openResponseBody(Response response) throws IOException {
        this.streamAllocation.eventListener.responseBodyStart(this.streamAllocation.call);
        String header = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0L, m.a(newFixedLengthSource(0L)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(header, -1L, m.a(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        if (contentLength != -1) {
            return new RealResponseBody(header, contentLength, m.a(newFixedLengthSource(contentLength)));
        }
        return new RealResponseBody(header, -1L, m.a(newUnknownLengthSource()));
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void flushRequest() throws IOException {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void finishRequest() throws IOException {
        this.sink.flush();
    }

    public final void writeRequest(Headers headers, String str) throws IOException {
        if (this.state != 0) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.sink.b(str).b(StringUtil.CRLF_STRING);
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            this.sink.b(headers.name(i)).b(": ").b(headers.value(i)).b(StringUtil.CRLF_STRING);
        }
        this.sink.b(StringUtil.CRLF_STRING);
        this.state = 1;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final Response.Builder readResponseHeaders(boolean z) throws IOException {
        if (this.state != 1 && this.state != 3) {
            throw new IllegalStateException("state: " + this.state);
        }
        try {
            StatusLine parse = StatusLine.parse(readHeaderLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
            if (z && parse.code == 100) {
                return null;
            }
            if (parse.code == 100) {
                this.state = 3;
                return headers;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.streamAllocation);
            iOException.initCause(e);
            throw iOException;
        }
    }

    private String readHeaderLine() throws IOException {
        String f = this.source.f(this.headerLimit);
        this.headerLimit -= f.length();
        return f;
    }

    public final Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() != 0) {
                Internal.instance.addLenient(builder, readHeaderLine);
            } else {
                return builder.build();
            }
        }
    }

    public final r newChunkedSink() {
        if (this.state != 1) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.state = 2;
        return new ChunkedSink();
    }

    public final r newFixedLengthSink(long j) {
        if (this.state != 1) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.state = 2;
        return new FixedLengthSink(j);
    }

    public final s newFixedLengthSource(long j) throws IOException {
        if (this.state != 4) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.state = 5;
        return new FixedLengthSource(j);
    }

    public final s newChunkedSource(HttpUrl httpUrl) throws IOException {
        if (this.state != 4) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.state = 5;
        return new ChunkedSource(httpUrl);
    }

    public final s newUnknownLengthSource() throws IOException {
        if (this.state != 4) {
            throw new IllegalStateException("state: " + this.state);
        } else if (this.streamAllocation == null) {
            throw new IllegalStateException("streamAllocation == null");
        } else {
            this.state = 5;
            this.streamAllocation.noNewStreams();
            return new UnknownLengthSource();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public final class FixedLengthSink implements r {
        private long bytesRemaining;
        private boolean closed;
        private final j timeout;

        FixedLengthSink(long j) {
            this.timeout = new j(Http1Codec.this.sink.timeout());
            this.bytesRemaining = j;
        }

        @Override // okio.r
        public final t timeout() {
            return this.timeout;
        }

        @Override // okio.r
        public final void write(c cVar, long j) throws IOException {
            if (this.closed) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            Util.checkOffsetAndCount(cVar.b, 0L, j);
            if (j > this.bytesRemaining) {
                throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + j);
            }
            Http1Codec.this.sink.write(cVar, j);
            this.bytesRemaining -= j;
        }

        @Override // okio.r, java.io.Flushable
        public final void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.bytesRemaining > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 3;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public final class ChunkedSink implements r {
        private boolean closed;
        private final j timeout;

        ChunkedSink() {
            this.timeout = new j(Http1Codec.this.sink.timeout());
        }

        @Override // okio.r
        public final t timeout() {
            return this.timeout;
        }

        @Override // okio.r
        public final void write(c cVar, long j) throws IOException {
            if (this.closed) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            if (j == 0) {
                return;
            }
            Http1Codec.this.sink.m(j);
            Http1Codec.this.sink.b(StringUtil.CRLF_STRING);
            Http1Codec.this.sink.write(cVar, j);
            Http1Codec.this.sink.b(StringUtil.CRLF_STRING);
        }

        @Override // okio.r, java.io.Flushable
        public final synchronized void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1Codec.this.sink.b("0\r\n\r\n");
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public abstract class AbstractSource implements s {
        protected long bytesRead;
        protected boolean closed;
        protected final j timeout;

        private AbstractSource() {
            this.timeout = new j(Http1Codec.this.source.timeout());
            this.bytesRead = 0L;
        }

        @Override // okio.s
        public t timeout() {
            return this.timeout;
        }

        @Override // okio.s
        public long read(c cVar, long j) throws IOException {
            try {
                long read = Http1Codec.this.source.read(cVar, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e) {
                endOfInput(false, e);
                throw e;
            }
        }

        protected final void endOfInput(boolean z, IOException iOException) throws IOException {
            if (Http1Codec.this.state == 6) {
                return;
            }
            if (Http1Codec.this.state != 5) {
                throw new IllegalStateException("state: " + Http1Codec.this.state);
            }
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 6;
            if (Http1Codec.this.streamAllocation != null) {
                Http1Codec.this.streamAllocation.streamFinished(!z, Http1Codec.this, this.bytesRead, iOException);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        FixedLengthSource(long j) throws IOException {
            super();
            this.bytesRemaining = j;
            if (this.bytesRemaining == 0) {
                endOfInput(true, null);
            }
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, okio.s
        public long read(c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            } else {
                if (this.bytesRemaining == 0) {
                    return -1L;
                }
                long read = super.read(cVar, Math.min(this.bytesRemaining, j));
                if (read == -1) {
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    endOfInput(false, protocolException);
                    throw protocolException;
                }
                this.bytesRemaining -= read;
                if (this.bytesRemaining == 0) {
                    endOfInput(true, null);
                }
                return read;
            }
        }

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false, null);
            }
            this.closed = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        private final HttpUrl url;

        ChunkedSource(HttpUrl httpUrl) {
            super();
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
            this.url = httpUrl;
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, okio.s
        public long read(c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            } else {
                if (this.hasMoreChunks) {
                    if (this.bytesRemainingInChunk == 0 || this.bytesRemainingInChunk == -1) {
                        readChunkSize();
                        if (!this.hasMoreChunks) {
                            return -1L;
                        }
                    }
                    long read = super.read(cVar, Math.min(j, this.bytesRemainingInChunk));
                    if (read == -1) {
                        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                        endOfInput(false, protocolException);
                        throw protocolException;
                    }
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                return -1L;
            }
        }

        private void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                Http1Codec.this.source.q();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.n();
                String trim = Http1Codec.this.source.q().trim();
                if (this.bytesRemainingInChunk < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + CommonConstant.Symbol.DOUBLE_QUOTES);
                } else if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false, null);
            }
            this.closed = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        UnknownLengthSource() {
            super();
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, okio.s
        public long read(c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            } else {
                if (this.inputExhausted) {
                    return -1L;
                }
                long read = super.read(cVar, j);
                if (read == -1) {
                    this.inputExhausted = true;
                    endOfInput(true, null);
                    return -1L;
                }
                return read;
            }
        }

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (!this.inputExhausted) {
                endOfInput(false, null);
            }
            this.closed = true;
        }
    }

    final void detachTimeout(j jVar) {
        t tVar = jVar.a;
        jVar.a(t.NONE);
        tVar.clearDeadline();
        tVar.clearTimeout();
    }
}
