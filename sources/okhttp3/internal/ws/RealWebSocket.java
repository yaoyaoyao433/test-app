package okhttp3.internal.ws;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.ws.WebSocketReader;
import okio.d;
import okio.e;
import okio.f;
import okio.m;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    final WebSocketListener listener;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;
    private final ArrayDeque<f> pongQueue = new ArrayDeque<>();
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private int receivedCloseCode = -1;

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random, long j) {
        if (!"GET".equals(request.method())) {
            throw new IllegalArgumentException("Request must be GET: " + request.method());
        }
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.key = f.a(bArr).b();
        this.writerRunnable = new Runnable() { // from class: okhttp3.internal.ws.RealWebSocket.1
            @Override // java.lang.Runnable
            public void run() {
                do {
                    try {
                    } catch (IOException e) {
                        RealWebSocket.this.failWebSocket(e, null);
                        return;
                    }
                } while (RealWebSocket.this.writeOneFrame());
            }
        };
    }

    @Override // okhttp3.WebSocket
    public final Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public final synchronized long queueSize() {
        return this.queueSize;
    }

    @Override // okhttp3.WebSocket
    public final void cancel() {
        this.call.cancel();
    }

    public final void connect(OkHttpClient okHttpClient) {
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        this.call = Internal.instance.newWebSocketCall(build, build2);
        this.call.timeout().clearTimeout();
        this.call.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.2
            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                try {
                    RealWebSocket.this.checkResponse(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        RealWebSocket.this.listener.onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + build2.url().redact(), newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (ProtocolException e2) {
                    RealWebSocket.this.failWebSocket(e2, response);
                    Util.closeQuietly(response);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, null);
            }
        });
    }

    final void checkResponse(Response response) throws ProtocolException {
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + StringUtil.SPACE + response.message() + CommonConstant.Symbol.SINGLE_QUOTES);
        }
        String header = response.header("Connection");
        if (!"Upgrade".equalsIgnoreCase(header)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header + CommonConstant.Symbol.SINGLE_QUOTES);
        }
        String header2 = response.header("Upgrade");
        if (!"websocket".equalsIgnoreCase(header2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header2 + CommonConstant.Symbol.SINGLE_QUOTES);
        }
        String header3 = response.header("Sec-WebSocket-Accept");
        String b = f.a(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").d().b();
        if (b.equals(header3)) {
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + b + "' but was '" + header3 + CommonConstant.Symbol.SINGLE_QUOTES);
    }

    public final void initReaderAndWriter(String str, Streams streams) throws IOException {
        synchronized (this) {
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.client, streams.sink, this.random);
            this.executor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            if (this.pingIntervalMillis != 0) {
                this.executor.scheduleAtFixedRate(new PingRunnable(), this.pingIntervalMillis, this.pingIntervalMillis, TimeUnit.MILLISECONDS);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new WebSocketReader(streams.client, streams.source, this);
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    final boolean processNextFrame() throws IOException {
        try {
            this.reader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e) {
            failWebSocket(e, null);
            return false;
        }
    }

    final void awaitTermination(int i, TimeUnit timeUnit) throws InterruptedException {
        this.executor.awaitTermination(i, timeUnit);
    }

    final void tearDown() throws InterruptedException {
        if (this.cancelFuture != null) {
            this.cancelFuture.cancel(false);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10L, TimeUnit.SECONDS);
    }

    final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(String str) throws IOException {
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(f fVar) throws IOException {
        this.listener.onMessage(this, fVar);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void onReadPing(f fVar) {
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(fVar);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void onReadPong(f fVar) {
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadClose(int i, String str) {
        Streams streams;
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed");
            }
            this.receivedCloseCode = i;
            this.receivedCloseReason = str;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                streams = this.streams;
                this.streams = null;
                if (this.cancelFuture != null) {
                    this.cancelFuture.cancel(false);
                }
                this.executor.shutdown();
            } else {
                streams = null;
            }
        }
        try {
            this.listener.onClosing(this, i, str);
            if (streams != null) {
                this.listener.onClosed(this, i, str);
            }
        } finally {
            Util.closeQuietly(streams);
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean send(String str) {
        if (str == null) {
            throw new NullPointerException("text == null");
        }
        return send(f.a(str), 1);
    }

    @Override // okhttp3.WebSocket
    public final boolean send(f fVar) {
        if (fVar == null) {
            throw new NullPointerException("bytes == null");
        }
        return send(fVar, 2);
    }

    private synchronized boolean send(f fVar, int i) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + fVar.h() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += fVar.h();
            this.messageAndCloseQueue.add(new Message(i, fVar));
            runWriter();
            return true;
        }
        return false;
    }

    final synchronized boolean pong(f fVar) {
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(fVar);
            runWriter();
            return true;
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    public final boolean close(int i, String str) {
        return close(i, str, 60000L);
    }

    final synchronized boolean close(int i, String str, long j) {
        WebSocketProtocol.validateCloseCode(i);
        f fVar = null;
        if (str != null) {
            fVar = f.a(str);
            if (fVar.h() > 123) {
                throw new IllegalArgumentException("reason.size() > 123: " + str);
            }
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(i, fVar, j));
            runWriter();
            return true;
        }
        return false;
    }

    private void runWriter() {
        if (this.executor != null) {
            this.executor.execute(this.writerRunnable);
        }
    }

    /* JADX WARN: Finally extract failed */
    final boolean writeOneFrame() throws IOException {
        Object obj;
        String str;
        synchronized (this) {
            int i = 0;
            if (this.failed) {
                return false;
            }
            WebSocketWriter webSocketWriter = this.writer;
            f poll = this.pongQueue.poll();
            Streams streams = null;
            if (poll == null) {
                obj = this.messageAndCloseQueue.poll();
                if (obj instanceof Close) {
                    i = this.receivedCloseCode;
                    str = this.receivedCloseReason;
                    if (i != -1) {
                        Streams streams2 = this.streams;
                        this.streams = null;
                        this.executor.shutdown();
                        streams = streams2;
                    } else {
                        this.cancelFuture = this.executor.schedule(new CancelRunnable(), ((Close) obj).cancelAfterCloseMillis, TimeUnit.MILLISECONDS);
                    }
                } else if (obj == null) {
                    return false;
                } else {
                    str = null;
                }
            } else {
                obj = null;
                str = null;
            }
            try {
                if (poll != null) {
                    webSocketWriter.writePong(poll);
                } else if (obj instanceof Message) {
                    f fVar = ((Message) obj).data;
                    d a = m.a(webSocketWriter.newMessageSink(((Message) obj).formatOpcode, fVar.h()));
                    a.c(fVar);
                    a.close();
                    synchronized (this) {
                        this.queueSize -= fVar.h();
                    }
                } else if (obj instanceof Close) {
                    Close close = (Close) obj;
                    webSocketWriter.writeClose(close.code, close.reason);
                    if (streams != null) {
                        this.listener.onClosed(this, i, str);
                    }
                } else {
                    throw new AssertionError();
                }
                Util.closeQuietly(streams);
                return true;
            } catch (Throwable th) {
                Util.closeQuietly(streams);
                throw th;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public final class PingRunnable implements Runnable {
        PingRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RealWebSocket.this.writePingFrame();
        }
    }

    final void writePingFrame() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            int i = this.awaitingPong ? this.sentPingCount : -1;
            this.sentPingCount++;
            this.awaitingPong = true;
            if (i != -1) {
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                return;
            }
            try {
                webSocketWriter.writePing(f.b);
            } catch (IOException e) {
                failWebSocket(e, null);
            }
        }
    }

    public final void failWebSocket(Exception exc, @Nullable Response response) {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            if (this.cancelFuture != null) {
                this.cancelFuture.cancel(false);
            }
            if (this.executor != null) {
                this.executor.shutdown();
            }
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                Util.closeQuietly(streams);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class Message {
        final f data;
        final int formatOpcode;

        Message(int i, f fVar) {
            this.formatOpcode = i;
            this.data = fVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final f reason;

        Close(int i, f fVar, long j) {
            this.code = i;
            this.reason = fVar;
            this.cancelAfterCloseMillis = j;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final d sink;
        public final e source;

        public Streams(boolean z, e eVar, d dVar) {
            this.client = z;
            this.source = eVar;
            this.sink = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public final class CancelRunnable implements Runnable {
        CancelRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RealWebSocket.this.cancel();
        }
    }
}
