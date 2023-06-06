package io.socket.engineio.client.transports;

import io.socket.emitter.a;
import io.socket.engineio.client.d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class b extends io.socket.engineio.client.transports.a {
    private static final Logger n = Logger.getLogger(b.class.getName());

    public b(d.a aVar) {
        super(aVar);
    }

    private a a(a.C1529a c1529a) {
        if (c1529a == null) {
            c1529a = new a.C1529a();
        }
        c1529a.a = h();
        c1529a.d = this.m;
        a aVar = new a(c1529a);
        aVar.a("requestHeaders", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.transports.b.2
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                this.a("requestHeaders", objArr[0]);
            }
        }).a("responseHeaders", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.transports.b.1
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(final Object... objArr) {
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.transports.b.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a("responseHeaders", objArr[0]);
                    }
                });
            }
        });
        return aVar;
    }

    @Override // io.socket.engineio.client.transports.a
    protected final void a(byte[] bArr, final Runnable runnable) {
        a.C1529a c1529a = new a.C1529a();
        c1529a.b = "POST";
        c1529a.c = bArr;
        a a2 = a(c1529a);
        a2.a("success", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.transports.b.3
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.transports.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        runnable.run();
                    }
                });
            }
        });
        a2.a("error", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.transports.b.4
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(final Object... objArr) {
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.transports.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a("xhr post error", (objArr.length <= 0 || !(objArr[0] instanceof Exception)) ? null : (Exception) objArr[0]);
                    }
                });
            }
        });
        a2.a();
    }

    @Override // io.socket.engineio.client.transports.a
    protected final void i() {
        n.fine("xhr poll");
        a a2 = a((a.C1529a) null);
        a2.a("data", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.transports.b.5
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(final Object... objArr) {
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.transports.b.5.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object[]] */
                    /* JADX WARN: Type inference failed for: r0v7 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str = objArr.length > 0 ? objArr[0] : null;
                        if (str instanceof String) {
                            this.b(str);
                        } else if (str instanceof byte[]) {
                            this.a((byte[]) str);
                        }
                    }
                });
            }
        });
        a2.a("error", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.transports.b.6
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(final Object... objArr) {
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.transports.b.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a("xhr poll error", (objArr.length <= 0 || !(objArr[0] instanceof Exception)) ? null : (Exception) objArr[0]);
                    }
                });
            }
        });
        a2.a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class a extends io.socket.emitter.a {
        Response a;
        private String b;
        private String c;
        private byte[] d;
        private Call.Factory e;
        private Call f;

        /* compiled from: ProGuard */
        /* renamed from: io.socket.engineio.client.transports.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static class C1529a {
            public String a;
            public String b;
            public byte[] c;
            public Call.Factory d;
        }

        public a(C1529a c1529a) {
            this.b = c1529a.b != null ? c1529a.b : "GET";
            this.c = c1529a.a;
            this.d = c1529a.c;
            this.e = c1529a.d != null ? c1529a.d : new OkHttpClient();
        }

        public final void a() {
            b.n.fine(String.format("xhr open %s: %s", this.b, this.c));
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            if ("POST".equals(this.b)) {
                treeMap.put("Content-type", new LinkedList(Collections.singletonList("application/octet-stream")));
            }
            treeMap.put("Accept", new LinkedList(Collections.singletonList("*/*")));
            a(treeMap);
            b.n.fine(String.format("sending xhr with url %s | data %s", this.c, Arrays.toString(this.d)));
            Request.Builder builder = new Request.Builder();
            for (Map.Entry<String, List<String>> entry : treeMap.entrySet()) {
                for (String str : entry.getValue()) {
                    builder.addHeader(entry.getKey(), str);
                }
            }
            this.f = this.e.newCall(builder.url(HttpUrl.parse(this.c)).method(this.b, this.d != null ? RequestBody.create(MediaType.parse("application/octet-stream"), this.d) : null).build());
            this.f.enqueue(new Callback() { // from class: io.socket.engineio.client.transports.b.a.1
                @Override // okhttp3.Callback
                public final void onFailure(Call call, IOException iOException) {
                    this.a(iOException);
                }

                @Override // okhttp3.Callback
                public final void onResponse(Call call, Response response) throws IOException {
                    this.a = response;
                    this.a("responseHeaders", response.headers().toMultimap());
                    try {
                        if (response.isSuccessful()) {
                            a aVar = this;
                            ResponseBody body = aVar.a.body();
                            try {
                                if ("application/octet-stream".equalsIgnoreCase(body.contentType().toString())) {
                                    aVar.a("data", body.bytes());
                                    aVar.b();
                                } else {
                                    aVar.a("data", body.string());
                                    aVar.b();
                                }
                            } catch (IOException e) {
                                aVar.a(e);
                            }
                        } else {
                            this.a(new IOException(Integer.toString(response.code())));
                        }
                    } finally {
                        response.close();
                    }
                }
            });
        }

        void b() {
            a("success", new Object[0]);
        }

        void a(Exception exc) {
            a("error", exc);
        }

        private void a(Map<String, List<String>> map) {
            a("requestHeaders", map);
        }
    }
}
