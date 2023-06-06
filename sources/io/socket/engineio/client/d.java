package io.socket.engineio.client;

import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import java.util.Map;
import okhttp3.Call;
import okhttp3.WebSocket;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class d extends io.socket.emitter.a {
    public boolean a;
    public String b;
    public Map<String, String> c;
    protected boolean d;
    protected boolean e;
    protected int f;
    protected String g;
    protected String h;
    protected String i;
    protected c j;
    public b k;
    protected WebSocket.Factory l;
    protected Call.Factory m;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class a {
        public String n;
        public String o;
        public String p;
        public boolean q;
        public boolean r;
        public int s = -1;
        public int t = -1;
        public Map<String, String> u;
        protected c v;
        public WebSocket.Factory w;
        public Call.Factory x;
    }

    protected abstract void b(io.socket.engineio.parser.b[] bVarArr) throws io.socket.utf8.b;

    protected abstract void f();

    protected abstract void g();

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum b {
        OPENING,
        OPEN,
        CLOSED,
        PAUSED;

        @Override // java.lang.Enum
        public final String toString() {
            return super.toString().toLowerCase();
        }
    }

    public d(a aVar) {
        this.g = aVar.o;
        this.h = aVar.n;
        this.f = aVar.s;
        this.d = aVar.q;
        this.c = aVar.u;
        this.i = aVar.p;
        this.e = aVar.r;
        this.j = aVar.v;
        this.l = aVar.w;
        this.m = aVar.x;
    }

    public final d a(String str, Exception exc) {
        a("error", new io.socket.engineio.client.a(str, exc));
        return this;
    }

    public final d a() {
        io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.d.1
            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.k == b.CLOSED || d.this.k == null) {
                    d.this.k = b.OPENING;
                    d.this.f();
                }
            }
        });
        return this;
    }

    public final d b() {
        io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.d.2
            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.k == b.OPENING || d.this.k == b.OPEN) {
                    d.this.g();
                    d.this.e();
                }
            }
        });
        return this;
    }

    public final void a(final io.socket.engineio.parser.b[] bVarArr) {
        io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.d.3
            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.k == b.OPEN) {
                    try {
                        d.this.b(bVarArr);
                        return;
                    } catch (io.socket.utf8.b e) {
                        throw new RuntimeException(e);
                    }
                }
                throw new RuntimeException("Transport not open");
            }
        });
    }

    public final void d() {
        this.k = b.OPEN;
        this.a = true;
        a(MarketingModel.TYPE_ENTER_DIALOG, new Object[0]);
    }

    public void b(String str) {
        a(io.socket.engineio.parser.c.a(str));
    }

    public void a(byte[] bArr) {
        a(io.socket.engineio.parser.c.a(bArr));
    }

    public final void a(io.socket.engineio.parser.b bVar) {
        a("packet", bVar);
    }

    public final void e() {
        this.k = b.CLOSED;
        a("close", new Object[0]);
    }
}
