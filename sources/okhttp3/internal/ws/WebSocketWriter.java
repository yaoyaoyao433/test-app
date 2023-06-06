package okhttp3.internal.ws;

import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import java.io.IOException;
import java.util.Random;
import okio.c;
import okio.d;
import okio.f;
import okio.r;
import okio.t;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class WebSocketWriter {
    boolean activeWriter;
    final c buffer = new c();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    private final c.a maskCursor;
    private final byte[] maskKey;
    final Random random;
    final d sink;
    final c sinkBuffer;
    boolean writerClosed;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketWriter(boolean z, d dVar, Random random) {
        if (dVar == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.isClient = z;
        this.sink = dVar;
        this.sinkBuffer = dVar.a();
        this.random = random;
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new c.a() : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writePing(f fVar) throws IOException {
        writeControlFrame(9, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writePong(f fVar) throws IOException {
        writeControlFrame(10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeClose(int i, f fVar) throws IOException {
        f fVar2 = f.b;
        if (i != 0 || fVar != null) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            c cVar = new c();
            cVar.g(i);
            if (fVar != null) {
                cVar.c(fVar);
            }
            fVar2 = cVar.o();
        }
        try {
            writeControlFrame(8, fVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    private void writeControlFrame(int i, f fVar) throws IOException {
        if (this.writerClosed) {
            throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        int h = fVar.h();
        if (h > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.h(i | 128);
        if (this.isClient) {
            this.sinkBuffer.h(h | 128);
            this.random.nextBytes(this.maskKey);
            this.sinkBuffer.c(this.maskKey);
            if (h > 0) {
                long j = this.sinkBuffer.b;
                this.sinkBuffer.c(fVar);
                this.sinkBuffer.a(this.maskCursor);
                this.maskCursor.a(j);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.h(h);
            this.sinkBuffer.c(fVar);
        }
        this.sink.flush();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r newMessageSink(int i, long j) {
        if (this.activeWriter) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.activeWriter = true;
        this.frameSink.formatOpcode = i;
        this.frameSink.contentLength = j;
        this.frameSink.isFirstFrame = true;
        this.frameSink.closed = false;
        return this.frameSink;
    }

    final void writeMessageFrame(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.writerClosed) {
            throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.sinkBuffer.h(i);
        int i2 = this.isClient ? 128 : 0;
        if (j <= 125) {
            this.sinkBuffer.h(((int) j) | i2);
        } else if (j <= 65535) {
            this.sinkBuffer.h(i2 | 126);
            this.sinkBuffer.g((int) j);
        } else {
            this.sinkBuffer.h(i2 | 127);
            this.sinkBuffer.j(j);
        }
        if (this.isClient) {
            this.random.nextBytes(this.maskKey);
            this.sinkBuffer.c(this.maskKey);
            if (j > 0) {
                long j2 = this.sinkBuffer.b;
                this.sinkBuffer.write(this.buffer, j);
                this.sinkBuffer.a(this.maskCursor);
                this.maskCursor.a(j2);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.write(this.buffer, j);
        }
        this.sink.c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public final class FrameSink implements r {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        FrameSink() {
        }

        @Override // okio.r
        public final void write(c cVar, long j) throws IOException {
            if (this.closed) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            WebSocketWriter.this.buffer.write(cVar, j);
            boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.b > this.contentLength - 8192;
            long f = WebSocketWriter.this.buffer.f();
            if (f <= 0 || z) {
                return;
            }
            WebSocketWriter.this.writeMessageFrame(this.formatOpcode, f, this.isFirstFrame, false);
            this.isFirstFrame = false;
        }

        @Override // okio.r, java.io.Flushable
        public final void flush() throws IOException {
            if (this.closed) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            WebSocketWriter.this.writeMessageFrame(this.formatOpcode, WebSocketWriter.this.buffer.b, this.isFirstFrame, false);
            this.isFirstFrame = false;
        }

        @Override // okio.r
        public final t timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.closed) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            WebSocketWriter.this.writeMessageFrame(this.formatOpcode, WebSocketWriter.this.buffer.b, this.isFirstFrame, true);
            this.closed = true;
            WebSocketWriter.this.activeWriter = false;
        }
    }
}
