package com.facebook.react.packagerconnection;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.f;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ReconnectingWebSocket extends WebSocketListener {
    private static final String a = "ReconnectingWebSocket";
    private final String b;
    private final Handler c;
    private boolean d;
    private boolean e;
    @Nullable
    private WebSocket f;
    @Nullable
    private a g;
    private OkHttpClient h;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str);

        void a(f fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        if (!this.d) {
            if (this.d) {
                throw new IllegalStateException("Can't connect closed client");
            }
            if (this.h == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                OkHttp3Wrapper.addInterceptorToBuilder(builder);
                this.h = builder.connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
            }
            this.h.newWebSocket(new Request.Builder().url(this.b).build(), this);
        }
    }

    private void b() {
        if (this.d) {
            throw new IllegalStateException("Can't reconnect closed client");
        }
        if (!this.e) {
            String str = a;
            com.facebook.common.logging.a.c(str, "Couldn't connect to \"" + this.b + "\", will silently retry");
            this.e = true;
        }
        this.c.postDelayed(new Runnable() { // from class: com.facebook.react.packagerconnection.ReconnectingWebSocket.1
            @Override // java.lang.Runnable
            public final void run() {
                ReconnectingWebSocket.this.a();
            }
        }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
    }

    @Override // okhttp3.WebSocketListener
    public final synchronized void onOpen(WebSocket webSocket, Response response) {
        this.f = webSocket;
        this.e = false;
    }

    @Override // okhttp3.WebSocketListener
    public final synchronized void onFailure(WebSocket webSocket, Throwable th, Response response) {
        if (this.f != null) {
            String str = a;
            com.facebook.common.logging.a.d(str, "Error occurred, shutting down websocket connection: Websocket exception", th);
            if (this.f != null) {
                try {
                    this.f.close(1000, "End of session");
                } catch (Exception unused) {
                }
                this.f = null;
            }
        }
        if (!this.d) {
            b();
        }
    }

    @Override // okhttp3.WebSocketListener
    public final synchronized void onMessage(WebSocket webSocket, String str) {
        if (this.g != null) {
            this.g.a(str);
        }
    }

    @Override // okhttp3.WebSocketListener
    public final synchronized void onMessage(WebSocket webSocket, f fVar) {
        if (this.g != null) {
            this.g.a(fVar);
        }
    }

    @Override // okhttp3.WebSocketListener
    public final synchronized void onClosed(WebSocket webSocket, int i, String str) {
        this.f = null;
        if (!this.d) {
            b();
        }
    }

    public final synchronized void a(String str) throws IOException {
        if (this.f != null) {
            this.f.send(str);
        } else {
            throw new ClosedChannelException();
        }
    }
}
