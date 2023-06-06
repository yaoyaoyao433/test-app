package okhttp3.internal.http2;

import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.c;
import okio.e;
import okio.f;
import okio.s;
import okio.t;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class Http2Reader implements Closeable {
    static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation;
    final Hpack.Reader hpackReader;
    private final e source;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, f fVar, String str2, int i2, long j);

        void data(boolean z, int i, e eVar, int i2) throws IOException;

        void goAway(int i, ErrorCode errorCode, f fVar);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list) throws IOException;

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Http2Reader(e eVar, boolean z) {
        this.source = eVar;
        this.client = z;
        this.continuation = new ContinuationSource(this.source);
        this.hpackReader = new Hpack.Reader(4096, this.continuation);
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw Http2.ioException("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        f d = this.source.d(Http2.CONNECTION_PREFACE.h());
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.format("<< CONNECTION %s", d.f()));
        }
        if (!Http2.CONNECTION_PREFACE.equals(d)) {
            throw Http2.ioException("Expected a connection header but was %s", d.a());
        }
    }

    public final boolean nextFrame(boolean z, Handler handler) throws IOException {
        try {
            this.source.a(9L);
            int readMedium = readMedium(this.source);
            if (readMedium < 0 || readMedium > 16384) {
                throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(readMedium));
            }
            byte g = (byte) (this.source.g() & 255);
            if (!z || g == 4) {
                byte g2 = (byte) (this.source.g() & 255);
                int i = this.source.i() & Integer.MAX_VALUE;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Http2.frameLog(true, i, readMedium, g, g2));
                }
                switch (g) {
                    case 0:
                        readData(handler, readMedium, g2, i);
                        break;
                    case 1:
                        readHeaders(handler, readMedium, g2, i);
                        break;
                    case 2:
                        readPriority(handler, readMedium, g2, i);
                        break;
                    case 3:
                        readRstStream(handler, readMedium, g2, i);
                        break;
                    case 4:
                        readSettings(handler, readMedium, g2, i);
                        break;
                    case 5:
                        readPushPromise(handler, readMedium, g2, i);
                        break;
                    case 6:
                        readPing(handler, readMedium, g2, i);
                        break;
                    case 7:
                        readGoAway(handler, readMedium, g2, i);
                        break;
                    case 8:
                        readWindowUpdate(handler, readMedium, g2, i);
                        break;
                    default:
                        this.source.i(readMedium);
                        break;
                }
                return true;
            }
            throw Http2.ioException("Expected a SETTINGS frame but was %s", Byte.valueOf(g));
        } catch (IOException unused) {
            return false;
        }
    }

    private void readHeaders(Handler handler, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        short g = (b & 8) != 0 ? (short) (this.source.g() & 255) : (short) 0;
        if ((b & 32) != 0) {
            readPriority(handler, i2);
            i -= 5;
        }
        handler.headers(z, i2, -1, readHeaderBlock(lengthWithoutPadding(i, b, g), g, b, i2));
    }

    private List<Header> readHeaderBlock(int i, short s, byte b, int i2) throws IOException {
        ContinuationSource continuationSource = this.continuation;
        this.continuation.left = i;
        continuationSource.length = i;
        this.continuation.padding = s;
        this.continuation.flags = b;
        this.continuation.streamId = i2;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readData(Handler handler, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        if ((b & 32) != 0) {
            throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short g = (b & 8) != 0 ? (short) (this.source.g() & 255) : (short) 0;
        handler.data(z, i2, this.source, lengthWithoutPadding(i, b, g));
        this.source.i(g);
    }

    private void readPriority(Handler handler, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        readPriority(handler, i2);
    }

    private void readPriority(Handler handler, int i) throws IOException {
        int i2 = this.source.i();
        handler.priority(i, i2 & Integer.MAX_VALUE, (this.source.g() & 255) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    private void readRstStream(Handler handler, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int i3 = this.source.i();
        ErrorCode fromHttp2 = ErrorCode.fromHttp2(i3);
        if (fromHttp2 == null) {
            throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
        }
        handler.rstStream(i2, fromHttp2);
    }

    private void readSettings(Handler handler, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b & 1) != 0) {
            if (i != 0) {
                throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            handler.ackSettings();
        } else if (i % 6 != 0) {
            throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        } else {
            Settings settings = new Settings();
            for (int i3 = 0; i3 < i; i3 += 6) {
                int h = this.source.h() & ISelectionInterface.HELD_NOTHING;
                int i4 = this.source.i();
                switch (h) {
                    case 2:
                        if (i4 != 0 && i4 != 1) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        break;
                    case 3:
                        h = 4;
                        break;
                    case 4:
                        h = 7;
                        if (i4 < 0) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        break;
                    case 5:
                        if (i4 < 16384 || i4 > 16777215) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i4));
                        }
                        break;
                        break;
                }
                settings.set(h, i4);
            }
            handler.settings(false, settings);
        }
    }

    private void readPushPromise(Handler handler, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short g = (b & 8) != 0 ? (short) (this.source.g() & 255) : (short) 0;
        handler.pushPromise(i2, this.source.i() & Integer.MAX_VALUE, readHeaderBlock(lengthWithoutPadding(i - 4, b, g), g, b, i2));
    }

    private void readPing(Handler handler, int i, byte b, int i2) throws IOException {
        if (i != 8) {
            throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
        }
        handler.ping((b & 1) != 0, this.source.i(), this.source.i());
    }

    private void readGoAway(Handler handler, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int i3 = this.source.i();
        int i4 = this.source.i();
        int i5 = i - 8;
        ErrorCode fromHttp2 = ErrorCode.fromHttp2(i4);
        if (fromHttp2 == null) {
            throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
        }
        f fVar = f.b;
        if (i5 > 0) {
            fVar = this.source.d(i5);
        }
        handler.goAway(i3, fromHttp2, fVar);
    }

    private void readWindowUpdate(Handler handler, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long i3 = this.source.i() & 2147483647L;
        if (i3 == 0) {
            throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(i3));
        }
        handler.windowUpdate(i2, i3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.source.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class ContinuationSource implements s {
        byte flags;
        int left;
        int length;
        short padding;
        private final e source;
        int streamId;

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        ContinuationSource(e eVar) {
            this.source = eVar;
        }

        @Override // okio.s
        public final long read(c cVar, long j) throws IOException {
            while (this.left == 0) {
                this.source.i(this.padding);
                this.padding = (short) 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
            long read = this.source.read(cVar, Math.min(j, this.left));
            if (read == -1) {
                return -1L;
            }
            this.left = (int) (this.left - read);
            return read;
        }

        @Override // okio.s
        public final t timeout() {
            return this.source.timeout();
        }

        private void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int readMedium = Http2Reader.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte g = (byte) (this.source.g() & 255);
            this.flags = (byte) (this.source.g() & 255);
            if (Http2Reader.logger.isLoggable(Level.FINE)) {
                Http2Reader.logger.fine(Http2.frameLog(true, this.streamId, this.length, g, this.flags));
            }
            this.streamId = this.source.i() & Integer.MAX_VALUE;
            if (g != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(g));
            }
            if (this.streamId != i) {
                throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
    }

    static int readMedium(e eVar) throws IOException {
        return (eVar.g() & 255) | ((eVar.g() & 255) << 16) | ((eVar.g() & 255) << 8);
    }

    static int lengthWithoutPadding(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }
}
