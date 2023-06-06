package com.sankuai.meituan.retrofit2.callfactory.okhttp3;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aa;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.raw.c;
import com.sankuai.meituan.retrofit2.raw.d;
import com.sankuai.meituan.retrofit2.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.e;
import okio.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements a.InterfaceC0637a, c.a {
    public static ChangeQuickRedirect a;
    private OkHttpClient b;

    public static a a(OkHttpClient okHttpClient) {
        Object[] objArr = {okHttpClient};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "caa924c6604086df9966832f36136734", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "caa924c6604086df9966832f36136734") : new a(okHttpClient);
    }

    public a() {
    }

    private a(OkHttpClient okHttpClient) {
        Object[] objArr = {okHttpClient};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ce5c8dcda5848f3c8224d36c5f5ed34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ce5c8dcda5848f3c8224d36c5f5ed34");
        } else if (okHttpClient == null) {
            throw new NullPointerException("client == null");
        } else {
            this.b = okHttpClient;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "739b0b637bd7f608e9f51a706beb19f7", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "739b0b637bd7f608e9f51a706beb19f7") : new C0631a(this.b, ajVar);
    }

    @Override // com.sankuai.meituan.retrofit2.raw.c.a
    public final c a(aj ajVar, d dVar) {
        Object[] objArr = {ajVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12dfc71e1c15410859b33828fd909c5d", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12dfc71e1c15410859b33828fd909c5d") : new b(this.b, ajVar, dVar);
    }

    static int a(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11401f6749267056ac03f0021d13db57", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11401f6749267056ac03f0021d13db57")).intValue();
        }
        String a2 = ajVar.a("retrofit-mt-request-timeout");
        if (TextUtils.isEmpty(a2)) {
            return -1;
        }
        try {
            return Integer.parseInt(a2);
        } catch (NumberFormatException unused) {
            throw new NumberFormatException("retrofit-mt-request-timeout set failed and its value should be int");
        }
    }

    public static Request b(final aj ajVar) {
        RequestBody requestBody;
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d72b1eaf4b00a20866c64ac2acb9bd9c", 6917529027641081856L)) {
            return (Request) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d72b1eaf4b00a20866c64ac2acb9bd9c");
        }
        if (ajVar == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        if (ajVar.d() != null && ajVar.d().size() > 0) {
            for (q qVar : ajVar.d()) {
                builder.add(qVar.a(), qVar.b());
            }
        }
        if (ajVar.i() != null) {
            String contentType = ajVar.i().contentType();
            final MediaType parse = contentType != null ? MediaType.parse(contentType) : null;
            requestBody = new RequestBody() { // from class: com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.1
                public static ChangeQuickRedirect a;

                @Override // okhttp3.RequestBody
                public final MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(okio.d dVar) throws IOException {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c9f99c7c57dd8b76bce06e360f211d6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c9f99c7c57dd8b76bce06e360f211d6");
                    } else {
                        ajVar.i().writeTo(dVar.b());
                    }
                }

                @Override // okhttp3.RequestBody
                public final long contentLength() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8fc5229b38bae1ba72d1c8991b2c912", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8fc5229b38bae1ba72d1c8991b2c912")).longValue() : ajVar.i().contentLength();
                }
            };
        } else {
            requestBody = null;
        }
        Request.Builder builder2 = new Request.Builder();
        builder2.url(ajVar.b()).headers(builder.build()).method(ajVar.c(), requestBody);
        return builder2.build();
    }

    public static com.sankuai.meituan.retrofit2.raw.b a(final String str, Response response) {
        e cVar;
        final ArrayList emptyList;
        Object[] objArr = {str, response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f263c4c29279cae4c187358b75906a21", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f263c4c29279cae4c187358b75906a21");
        }
        if (response != null) {
            final ResponseBody body = response.body();
            final String message = response.message();
            final int code = response.code();
            try {
                cVar = body.source();
            } catch (Throwable unused) {
                cVar = new okio.c();
            }
            final InputStream e = cVar.e();
            final ap apVar = new ap() { // from class: com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.ap
                public final String contentType() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3e70481c4d49e7a49436129ca5bef16", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3e70481c4d49e7a49436129ca5bef16");
                    }
                    MediaType contentType = ResponseBody.this.contentType();
                    if (contentType != null) {
                        return contentType.toString();
                    }
                    return null;
                }

                @Override // com.sankuai.meituan.retrofit2.ap
                public final long contentLength() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "862109003e55cb74a24bba4e433de156", 6917529027641081856L)) {
                        return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "862109003e55cb74a24bba4e433de156")).longValue();
                    }
                    try {
                        return ResponseBody.this.contentLength();
                    } catch (Throwable unused2) {
                        return -1L;
                    }
                }

                @Override // com.sankuai.meituan.retrofit2.ap
                public final InputStream source() {
                    return e;
                }

                @Override // com.sankuai.meituan.retrofit2.ap, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65b71589f031af09ed15874964cfbc9f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65b71589f031af09ed15874964cfbc9f");
                        return;
                    }
                    try {
                        ResponseBody.this.close();
                    } catch (Throwable unused2) {
                    }
                }
            };
            Headers headers = response.headers();
            if (headers != null) {
                int size = headers.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new q(headers.name(i), headers.value(i)));
                }
                emptyList = arrayList;
            } else {
                emptyList = Collections.emptyList();
            }
            return new com.sankuai.meituan.retrofit2.raw.b() { // from class: com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.3
                @Override // com.sankuai.meituan.retrofit2.raw.b
                public final String url() {
                    return str;
                }

                @Override // com.sankuai.meituan.retrofit2.raw.b
                public final int code() {
                    return code;
                }

                @Override // com.sankuai.meituan.retrofit2.raw.b
                public final String reason() {
                    return message;
                }

                @Override // com.sankuai.meituan.retrofit2.raw.b
                public final List<q> headers() {
                    return emptyList;
                }

                @Override // com.sankuai.meituan.retrofit2.raw.b
                public final ap body() {
                    return apVar;
                }
            };
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.retrofit2.callfactory.okhttp3.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0631a implements Interceptor.a, com.sankuai.meituan.retrofit2.raw.a {
        public static ChangeQuickRedirect a;
        private OkHttpClient b;
        private aj c;
        private Call d;
        private int e;
        private volatile boolean f;
        private boolean g;
        private boolean h;

        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a8c7710731556696852bdd9828e65f", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a8c7710731556696852bdd9828e65f") : new C0631a(this.b, this.c);
        }

        public C0631a(OkHttpClient okHttpClient, aj ajVar) {
            Object[] objArr = {okHttpClient, ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbad9341f79a84c0b8971dc7ad28a306", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbad9341f79a84c0b8971dc7ad28a306");
                return;
            }
            this.e = -1;
            this.h = !aa.b();
            this.b = okHttpClient;
            this.c = ajVar;
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final aj request() {
            return this.c;
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final com.sankuai.meituan.retrofit2.raw.b a(aj ajVar) throws IOException {
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "439c9f36367b3eda93eaa9d67f563027", 6917529027641081856L)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "439c9f36367b3eda93eaa9d67f563027");
            }
            if (!this.h) {
                this.h = true;
                try {
                    return new y(getClass().getSimpleName(), false).intercept(this);
                } finally {
                }
            } else {
                return execute();
            }
        }

        @Override // com.sankuai.meituan.retrofit2.raw.a
        public final com.sankuai.meituan.retrofit2.raw.b execute() throws IOException {
            Call newCall;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeddfcde23be6ef92337ec8c8cd1a1bd", 6917529027641081856L)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeddfcde23be6ef92337ec8c8cd1a1bd");
            }
            if (!this.h) {
                return a(null);
            }
            synchronized (this) {
                if (this.g) {
                    throw new IllegalStateException("Already executed.");
                }
                this.g = true;
                int j = this.c.j();
                if (j >= 0) {
                    this.e = j;
                } else {
                    this.e = a.a(this.c);
                }
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f22a9fc297177875f451514e53dcb2e7", 6917529027641081856L)) {
                    newCall = (Call) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f22a9fc297177875f451514e53dcb2e7");
                } else {
                    if (this.e >= 0) {
                        newCall = this.b.newBuilder().connectTimeout(this.e, TimeUnit.MILLISECONDS).readTimeout(this.e, TimeUnit.MILLISECONDS).writeTimeout(this.e, TimeUnit.MILLISECONDS).build().newCall(a.b(this.c));
                    } else {
                        newCall = this.b.newCall(a.b(this.c));
                    }
                    if (newCall == null) {
                        throw new NullPointerException("OkHttpClient returned null.");
                    }
                }
                this.d = newCall;
            }
            if (this.f) {
                throw new IOException("Already canceled");
            }
            return a.a(this.c.b(), this.d.execute());
        }

        @Override // com.sankuai.meituan.retrofit2.raw.a
        public final void cancel() {
            Call call;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b41829d65e1bea2bbe6dae2b91b857fa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b41829d65e1bea2bbe6dae2b91b857fa");
                return;
            }
            this.f = true;
            synchronized (this) {
                call = this.d;
            }
            if (call != null) {
                call.cancel();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b implements c {
        public static ChangeQuickRedirect a;
        aj b;
        d c;
        private OkHttpClient d;
        private WebSocket e;
        private int f;

        public b(OkHttpClient okHttpClient, aj ajVar, d dVar) {
            WebSocket newWebSocket;
            Object[] objArr = {okHttpClient, ajVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa0e6dbf0af3f35f2bb8a1b7e8551f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa0e6dbf0af3f35f2bb8a1b7e8551f7");
                return;
            }
            this.f = -1;
            this.d = okHttpClient;
            this.b = ajVar;
            this.c = dVar;
            this.f = ajVar.j();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6aa66c01151d704a472a35a105ea3da", 6917529027641081856L)) {
                newWebSocket = (WebSocket) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6aa66c01151d704a472a35a105ea3da");
            } else if (this.f >= 0) {
                newWebSocket = this.d.newBuilder().connectTimeout(this.f, TimeUnit.MILLISECONDS).readTimeout(this.f, TimeUnit.MILLISECONDS).writeTimeout(this.f, TimeUnit.MILLISECONDS).build().newWebSocket(a.b(this.b), new C0632a(this));
            } else {
                newWebSocket = this.d.newWebSocket(a.b(this.b), new C0632a(this));
            }
            this.e = newWebSocket;
        }

        @Override // com.sankuai.meituan.retrofit2.raw.c
        public final boolean a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8839db2ca53b61c5ae28de2b51a51477", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8839db2ca53b61c5ae28de2b51a51477")).booleanValue() : this.e.send(str);
        }

        @Override // com.sankuai.meituan.retrofit2.raw.c
        public final boolean a(byte[] bArr) {
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dcdfc9e5ce629ee1b4e17965e677fac", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dcdfc9e5ce629ee1b4e17965e677fac")).booleanValue() : this.e.send(f.a(bArr));
        }

        @Override // com.sankuai.meituan.retrofit2.raw.c
        public final boolean a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8242f6bfa5507cac71ff124ab1fc1d6", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8242f6bfa5507cac71ff124ab1fc1d6")).booleanValue() : this.e.close(i, str);
        }

        @Override // com.sankuai.meituan.retrofit2.raw.c
        public final void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e2ab18da2fa8092e77578bf77be9a7f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e2ab18da2fa8092e77578bf77be9a7f");
            } else {
                this.e.cancel();
            }
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.meituan.retrofit2.callfactory.okhttp3.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0632a extends WebSocketListener {
            public static ChangeQuickRedirect a;
            private final c c;
            private final StringBuilder d;
            private long e;

            public C0632a(c cVar) {
                Object[] objArr = {b.this, cVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "535011b710cb0b9a5c45dc1453eeb104", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "535011b710cb0b9a5c45dc1453eeb104");
                    return;
                }
                this.c = cVar;
                this.d = new StringBuilder(1024);
                a(b.this.b);
            }

            @Override // okhttp3.WebSocketListener
            public final void onOpen(WebSocket webSocket, Response response) {
                com.sankuai.meituan.retrofit2.raw.b bVar;
                Throwable th;
                Object[] objArr = {webSocket, response};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04fcc907926a01c54bce1e774558cc60", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04fcc907926a01c54bce1e774558cc60");
                    return;
                }
                try {
                    bVar = a.a(b.this.b.b(), response);
                    try {
                        if (b.this.c != null) {
                            b.this.c.a(this.c, bVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } finally {
                            if (bVar != null) {
                                a(bVar);
                                aa.b(this.d.toString());
                                this.d.setLength(0);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    bVar = null;
                    th = th3;
                }
            }

            @Override // okhttp3.WebSocketListener
            public final void onMessage(WebSocket webSocket, String str) {
                Object[] objArr = {webSocket, str};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667c41f54fd555239ef4b568c11e1a40", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667c41f54fd555239ef4b568c11e1a40");
                } else if (b.this.c != null) {
                    b.this.c.a(this.c, str);
                }
            }

            @Override // okhttp3.WebSocketListener
            public final void onMessage(WebSocket webSocket, f fVar) {
                Object[] objArr = {webSocket, fVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbc4b50d080f6cb9a3c1b78ff74a8961", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbc4b50d080f6cb9a3c1b78ff74a8961");
                } else if (b.this.c != null) {
                    b.this.c.a(this.c, fVar.i());
                }
            }

            @Override // okhttp3.WebSocketListener
            public final void onClosing(WebSocket webSocket, int i, String str) {
                Object[] objArr = {webSocket, Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbb271097755279c3488cb2b24d0f89b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbb271097755279c3488cb2b24d0f89b");
                } else if (b.this.c != null) {
                    b.this.c.b(this.c, i, str);
                }
            }

            @Override // okhttp3.WebSocketListener
            public final void onClosed(WebSocket webSocket, int i, String str) {
                Object[] objArr = {webSocket, Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f423c745e161fc236e09a69e5a10859", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f423c745e161fc236e09a69e5a10859");
                } else if (b.this.c != null) {
                    b.this.c.a(this.c, i, str);
                }
            }

            @Override // okhttp3.WebSocketListener
            public final void onFailure(WebSocket webSocket, Throwable th, Response response) {
                StringWriter stringWriter;
                StringBuilder sb;
                Object[] objArr = {webSocket, th, response};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66450246318634f0645a7709921231e7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66450246318634f0645a7709921231e7");
                    return;
                }
                com.sankuai.meituan.retrofit2.raw.b bVar = null;
                if (response != null) {
                    try {
                        bVar = a.a(b.this.b.b(), response);
                    } catch (Throwable th2) {
                        try {
                            a("onFailure, catch throwable, message:" + th2.getMessage());
                            long currentTimeMillis = System.currentTimeMillis();
                            a(", onFailure, cost:" + (currentTimeMillis - this.e) + "ms");
                            if (th != null) {
                                stringWriter = new StringWriter();
                                th.printStackTrace(new PrintWriter(stringWriter));
                                sb = new StringBuilder("error: ");
                            }
                        } catch (Throwable th3) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            a(", onFailure, cost:" + (currentTimeMillis2 - this.e) + "ms");
                            if (th != null) {
                                StringWriter stringWriter2 = new StringWriter();
                                th.printStackTrace(new PrintWriter(stringWriter2));
                                a("error: " + stringWriter2.toString());
                            }
                            aa.b(this.d.toString());
                            this.d.setLength(0);
                            throw th3;
                        }
                    }
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                a(", onFailure, cost:" + (currentTimeMillis3 - this.e) + "ms");
                if (th != null) {
                    stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    sb = new StringBuilder("error: ");
                    sb.append(stringWriter.toString());
                    a(sb.toString());
                }
                aa.b(this.d.toString());
                this.d.setLength(0);
                if (b.this.c != null) {
                    b.this.c.a(this.c, th, bVar);
                }
            }

            private void a(aj ajVar) {
                String str;
                Object[] objArr = {ajVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb1806df17f53315f6b17f55ad29a68", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb1806df17f53315f6b17f55ad29a68");
                    return;
                }
                this.e = System.currentTimeMillis();
                a("tunnel: OkHttp3WebSocket");
                a(ajVar.b());
                StringBuilder sb = new StringBuilder("reqBody:");
                if (ajVar.i() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ajVar.i().contentLength());
                    str = sb2.toString();
                } else {
                    str = StringUtil.NULL;
                }
                sb.append(str);
                a(sb.toString());
                List<q> d = ajVar.d();
                if (d == null || d.isEmpty()) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder("reqHeaders:{");
                for (int i = 0; i < d.size(); i++) {
                    q qVar = d.get(i);
                    if (i > 0) {
                        sb3.append(CommonConstant.Symbol.COMMA);
                    }
                    sb3.append(CommonConstant.Symbol.DOUBLE_QUOTES);
                    sb3.append(qVar.a());
                    sb3.append("\":\"");
                    sb3.append(qVar.b());
                    sb3.append(CommonConstant.Symbol.DOUBLE_QUOTES);
                }
                sb3.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
                a(sb3.toString());
            }

            private void a(com.sankuai.meituan.retrofit2.raw.b bVar) {
                Object[] objArr = {bVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe7774a0b605283307ae1573d1ce0a53", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe7774a0b605283307ae1573d1ce0a53");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                a("cost:" + (currentTimeMillis - this.e) + "ms");
                List<q> headers = bVar.headers();
                if (headers != null && !headers.isEmpty()) {
                    StringBuilder sb = new StringBuilder("respHeaders:{");
                    for (int i = 0; i < headers.size(); i++) {
                        q qVar = headers.get(i);
                        if (i > 0) {
                            sb.append(CommonConstant.Symbol.COMMA);
                        }
                        sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
                        sb.append(qVar.a());
                        sb.append("\":\"");
                        sb.append(qVar.b());
                        sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
                    }
                    sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
                    a(sb.toString());
                }
                a("respCode:" + bVar.code());
                a("respContentLength:" + bVar.body().contentLength());
            }

            private void a(String str) {
                int length;
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d8e30e9ea872e28ece204e874fac66a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d8e30e9ea872e28ece204e874fac66a");
                } else if (!TextUtils.isEmpty(str) && (length = this.d.length()) <= 4096 && str.length() + length <= 4096) {
                    if (length > 0) {
                        this.d.append(',');
                    }
                    this.d.append(str);
                }
            }
        }
    }
}
