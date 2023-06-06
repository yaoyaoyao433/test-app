package io.socket.engineio.client.transports;

import com.meituan.robust.common.CommonConstant;
import io.socket.engineio.client.d;
import io.socket.engineio.parser.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c extends d {
    private static final Logger n = Logger.getLogger(b.class.getName());
    private WebSocket o;

    public c(d.a aVar) {
        super(aVar);
        this.b = "websocket";
    }

    @Override // io.socket.engineio.client.d
    public final void f() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        a("requestHeaders", treeMap);
        WebSocket.Factory okHttpClient = this.l != null ? this.l : new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        Map map = this.c;
        if (map == null) {
            map = new HashMap();
        }
        String str = this.d ? "wss" : "ws";
        String str2 = "";
        if (this.f > 0 && (("wss".equals(str) && this.f != 443) || ("ws".equals(str) && this.f != 80))) {
            str2 = CommonConstant.Symbol.COLON + this.f;
        }
        if (this.e) {
            map.put(this.i, io.socket.yeast.a.a());
        }
        String a = io.socket.parseqs.a.a(map);
        if (a.length() > 0) {
            a = CommonConstant.Symbol.QUESTION_MARK + a;
        }
        boolean contains = this.h.contains(CommonConstant.Symbol.COLON);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("://");
        sb.append(contains ? "[" + this.h + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT : this.h);
        sb.append(str2);
        sb.append(this.g);
        sb.append(a);
        Request.Builder url = builder.url(sb.toString());
        for (Map.Entry entry : treeMap.entrySet()) {
            for (String str3 : (List) entry.getValue()) {
                url.addHeader((String) entry.getKey(), str3);
            }
        }
        this.o = okHttpClient.newWebSocket(url.build(), new WebSocketListener() { // from class: io.socket.engineio.client.transports.c.1
            @Override // okhttp3.WebSocketListener
            public final void onOpen(WebSocket webSocket, Response response) {
                final Map<String, List<String>> multimap = response.headers().toMultimap();
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.transports.c.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a("responseHeaders", multimap);
                        this.d();
                    }
                });
            }

            @Override // okhttp3.WebSocketListener
            public final void onMessage(WebSocket webSocket, final String str4) {
                if (str4 == null) {
                    return;
                }
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.transports.c.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.b(str4);
                    }
                });
            }

            @Override // okhttp3.WebSocketListener
            public final void onMessage(WebSocket webSocket, final f fVar) {
                if (fVar == null) {
                    return;
                }
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.transports.c.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a(fVar.i());
                    }
                });
            }

            @Override // okhttp3.WebSocketListener
            public final void onClosed(WebSocket webSocket, int i, String str4) {
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.transports.c.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e();
                    }
                });
            }

            @Override // okhttp3.WebSocketListener
            public final void onFailure(WebSocket webSocket, final Throwable th, Response response) {
                if (th instanceof Exception) {
                    io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.transports.c.1.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a("websocket error", (Exception) th);
                        }
                    });
                }
            }
        });
    }

    @Override // io.socket.engineio.client.d
    public final void b(io.socket.engineio.parser.b[] bVarArr) throws io.socket.utf8.b {
        this.a = false;
        final Runnable runnable = new Runnable() { // from class: io.socket.engineio.client.transports.c.2
            @Override // java.lang.Runnable
            public final void run() {
                io.socket.thread.a.b(new Runnable() { // from class: io.socket.engineio.client.transports.c.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a = true;
                        this.a("drain", new Object[0]);
                    }
                });
            }
        };
        final int[] iArr = {bVarArr.length};
        for (io.socket.engineio.parser.b bVar : bVarArr) {
            if (this.k != d.b.OPENING && this.k != d.b.OPEN) {
                return;
            }
            io.socket.engineio.parser.c.a(bVar, new c.b() { // from class: io.socket.engineio.client.transports.c.3
                @Override // io.socket.engineio.parser.c.b
                public final void a(Object obj) {
                    try {
                        if (obj instanceof String) {
                            this.o.send((String) obj);
                        } else if (obj instanceof byte[]) {
                            this.o.send(f.a((byte[]) obj));
                        }
                    } catch (IllegalStateException unused) {
                        c.n.fine("websocket closed before we could write");
                    }
                    int[] iArr2 = iArr;
                    int i = iArr2[0] - 1;
                    iArr2[0] = i;
                    if (i == 0) {
                        runnable.run();
                    }
                }
            });
        }
    }

    @Override // io.socket.engineio.client.d
    public final void g() {
        if (this.o != null) {
            this.o.close(1000, "");
            this.o = null;
        }
    }
}
