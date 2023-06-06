package okhttp3.internal.ws;

import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.c;
import okio.e;
import okio.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class WebSocketReader {
    boolean closed;
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final c.a maskCursor;
    private final byte[] maskKey;
    int opcode;
    final e source;
    private final c controlFrameBuffer = new c();
    private final c messageFrameBuffer = new c();

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(f fVar) throws IOException;

        void onReadPing(f fVar);

        void onReadPong(f fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketReader(boolean z, e eVar, FrameCallback frameCallback) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        if (frameCallback == null) {
            throw new NullPointerException("frameCallback == null");
        }
        this.isClient = z;
        this.source = eVar;
        this.frameCallback = frameCallback;
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = z ? null : new c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }

    /* JADX WARN: Finally extract failed */
    private void readHeader() throws IOException {
        if (this.closed) {
            throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        long timeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int g = this.source.g() & 255;
            this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            this.opcode = g & 15;
            this.isFinalFrame = (g & 128) != 0;
            this.isControlFrame = (g & 8) != 0;
            if (this.isControlFrame && !this.isFinalFrame) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z = (g & 64) != 0;
            boolean z2 = (g & 32) != 0;
            boolean z3 = (g & 16) != 0;
            if (z || z2 || z3) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            int g2 = this.source.g() & 255;
            boolean z4 = (g2 & 128) != 0;
            if (z4 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            this.frameLength = g2 & 127;
            if (this.frameLength == 126) {
                this.frameLength = this.source.h() & 65535;
            } else if (this.frameLength == 127) {
                this.frameLength = this.source.j();
                if (this.frameLength < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z4) {
                this.source.a(this.maskKey);
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private void readControlFrame() throws IOException {
        if (this.frameLength > 0) {
            this.source.a(this.controlFrameBuffer, this.frameLength);
            if (!this.isClient) {
                this.controlFrameBuffer.a(this.maskCursor);
                this.maskCursor.a(0L);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                String str = "";
                long j = this.controlFrameBuffer.b;
                if (j == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j != 0) {
                    s = this.controlFrameBuffer.h();
                    str = this.controlFrameBuffer.p();
                    String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s);
                    if (closeCodeExceptionMessage != null) {
                        throw new ProtocolException(closeCodeExceptionMessage);
                    }
                }
                this.frameCallback.onReadClose(s, str);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.o());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.o());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.opcode));
        }
    }

    private void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        readMessage();
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.p());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.o());
        }
    }

    private void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            }
            readControlFrame();
        }
    }

    private void readMessage() throws IOException {
        while (!this.closed) {
            if (this.frameLength > 0) {
                this.source.a(this.messageFrameBuffer, this.frameLength);
                if (!this.isClient) {
                    this.messageFrameBuffer.a(this.maskCursor);
                    this.maskCursor.a(this.messageFrameBuffer.b - this.frameLength);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.opcode));
            }
        }
        throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
    }
}
