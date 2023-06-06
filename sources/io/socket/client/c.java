package io.socket.client;

import android.support.v4.app.NotificationCompat;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import io.socket.client.d;
import io.socket.emitter.a;
import io.socket.engineio.client.c;
import io.socket.parser.a;
import io.socket.parser.c;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.Call;
import okhttp3.WebSocket;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class c extends io.socket.emitter.a {
    static WebSocket.Factory a;
    static Call.Factory b;
    private static final Logger f = Logger.getLogger(c.class.getName());
    d c;
    io.socket.engineio.client.c d;
    ConcurrentHashMap<String, e> e;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private long l;
    private long m;
    private double n;
    private io.socket.backo.a o;
    private long p;
    private Set<e> q;
    private Date r;
    private URI s;
    private List<io.socket.parser.b> t;
    private Queue<d.a> u;
    private C1523c v;
    private c.C1532c w;
    private c.b x;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface b {
        void a(Exception exc);
    }

    /* compiled from: ProGuard */
    /* renamed from: io.socket.client.c$c  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C1523c extends c.a {
        public int d;
        public long e;
        public long f;
        public double g;
        public boolean c = true;
        public long h = 20000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum d {
        CLOSED,
        OPENING,
        OPEN
    }

    static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.h = false;
        return false;
    }

    static /* synthetic */ boolean b(c cVar, boolean z) {
        cVar.j = false;
        return false;
    }

    static /* synthetic */ boolean c(c cVar, boolean z) {
        cVar.i = false;
        return false;
    }

    public c() {
        this(null, null);
    }

    public c(URI uri, C1523c c1523c) {
        this.q = new HashSet();
        c1523c = c1523c == null ? new C1523c() : c1523c;
        if (c1523c.o == null) {
            c1523c.o = "/socket.io";
        }
        if (c1523c.w == null) {
            c1523c.w = a;
        }
        if (c1523c.x == null) {
            c1523c.x = b;
        }
        this.v = c1523c;
        this.e = new ConcurrentHashMap<>();
        this.u = new LinkedList();
        this.g = c1523c.c;
        this.k = c1523c.d != 0 ? c1523c.d : Integer.MAX_VALUE;
        long j = c1523c.e != 0 ? c1523c.e : 1000L;
        this.l = j;
        if (this.o != null) {
            this.o.a = j;
        }
        long j2 = c1523c.f != 0 ? c1523c.f : MetricsAnrManager.ANR_THRESHOLD;
        this.m = j2;
        if (this.o != null) {
            this.o.b = j2;
        }
        double d2 = c1523c.g != 0.0d ? c1523c.g : 0.5d;
        this.n = d2;
        if (this.o != null) {
            this.o.c = d2;
        }
        io.socket.backo.a aVar = new io.socket.backo.a();
        aVar.a = this.l;
        aVar.b = this.m;
        aVar.c = this.n;
        this.o = aVar;
        this.p = c1523c.h;
        this.c = d.CLOSED;
        this.s = uri;
        this.j = false;
        this.t = new ArrayList();
        this.w = new c.C1532c();
        this.x = new c.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Object... objArr) {
        a(str, objArr);
        for (e eVar : this.e.values()) {
            eVar.a(str, objArr);
        }
    }

    public final c a(final b bVar) {
        io.socket.thread.a.a(new Runnable() { // from class: io.socket.client.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c.f.fine(String.format("readyState %s", c.this.c));
                if (c.this.c == d.OPEN || c.this.c == d.OPENING) {
                    return;
                }
                c.f.fine(String.format("opening %s", c.this.s));
                c.this.d = new a(c.this.s, c.this.v);
                final io.socket.engineio.client.c cVar = c.this.d;
                final c cVar2 = c.this;
                c.this.c = d.OPENING;
                c.a(c.this, false);
                cVar.a(NotificationCompat.CATEGORY_TRANSPORT, new a.InterfaceC1525a() { // from class: io.socket.client.c.1.1
                    @Override // io.socket.emitter.a.InterfaceC1525a
                    public final void a(Object... objArr) {
                        cVar2.a(NotificationCompat.CATEGORY_TRANSPORT, objArr);
                    }
                });
                final d.a a2 = io.socket.client.d.a(cVar, MarketingModel.TYPE_ENTER_DIALOG, new a.InterfaceC1525a() { // from class: io.socket.client.c.1.2
                    @Override // io.socket.emitter.a.InterfaceC1525a
                    public final void a(Object... objArr) {
                        c.c(cVar2);
                        if (bVar != null) {
                            bVar.a(null);
                        }
                    }
                });
                d.a a3 = io.socket.client.d.a(cVar, "error", new a.InterfaceC1525a() { // from class: io.socket.client.c.1.3
                    @Override // io.socket.emitter.a.InterfaceC1525a
                    public final void a(Object... objArr) {
                        Exception exc = objArr.length > 0 ? objArr[0] : null;
                        c.f.fine("connect_error");
                        cVar2.b();
                        cVar2.c = d.CLOSED;
                        cVar2.b("connect_error", exc);
                        if (bVar != null) {
                            bVar.a(new f("Connection error", exc instanceof Exception ? exc : null));
                        } else {
                            c.e(cVar2);
                        }
                    }
                });
                if (c.this.p >= 0) {
                    final long j = c.this.p;
                    c.f.fine(String.format("connection attempt will timeout after %d", Long.valueOf(j)));
                    final Timer timer = new Timer();
                    timer.schedule(new TimerTask() { // from class: io.socket.client.c.1.4
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public final void run() {
                            io.socket.thread.a.a(new Runnable() { // from class: io.socket.client.c.1.4.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c.f.fine(String.format("connect attempt timed out after %d", Long.valueOf(j)));
                                    a2.a();
                                    cVar.a();
                                    cVar.a("error", new f("timeout"));
                                    cVar2.b("connect_timeout", Long.valueOf(j));
                                }
                            });
                        }
                    }, j);
                    c.this.u.add(new d.a() { // from class: io.socket.client.c.1.5
                        @Override // io.socket.client.d.a
                        public final void a() {
                            timer.cancel();
                        }
                    });
                }
                c.this.u.add(a2);
                c.this.u.add(a3);
                final io.socket.engineio.client.c cVar3 = c.this.d;
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.c.12
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        if (cVar3.o && c.g && cVar3.v.contains("websocket")) {
                            str = "websocket";
                        } else if (cVar3.v.size() != 0) {
                            str = (String) cVar3.v.get(0);
                        } else {
                            final c cVar4 = cVar3;
                            io.socket.thread.a.b(new Runnable() { // from class: io.socket.engineio.client.c.12.1
                                {
                                    AnonymousClass12.this = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    cVar4.a("error", new io.socket.engineio.client.a("No transports available"));
                                }
                            });
                            return;
                        }
                        cVar3.C = b.OPENING;
                        d b2 = cVar3.b(str);
                        c.a(cVar3, b2);
                        b2.a();
                    }
                });
            }
        });
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(e eVar) {
        this.q.remove(eVar);
        if (this.q.isEmpty()) {
            f.fine("disconnect");
            this.h = true;
            this.i = false;
            if (this.c != d.OPEN) {
                b();
            }
            this.o.d = 0;
            this.c = d.CLOSED;
            if (this.d != null) {
                this.d.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(io.socket.parser.b bVar) {
        f.fine(String.format("writing packet %s", bVar));
        if (bVar.f != null && !bVar.f.isEmpty() && bVar.a == 0) {
            bVar.c += CommonConstant.Symbol.QUESTION_MARK + bVar.f;
        }
        if (!this.j) {
            this.j = true;
            c.C1532c c1532c = this.w;
            c.C1532c.a aVar = new c.C1532c.a() { // from class: io.socket.client.c.2
                @Override // io.socket.parser.c.C1532c.a
                public final void a(Object[] objArr) {
                    for (Object obj : objArr) {
                        if (obj instanceof String) {
                            final io.socket.engineio.client.c cVar = this.d;
                            final String str = (String) obj;
                            io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.c.9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c.a(cVar, "message", str, r3);
                                }
                            });
                        } else if (obj instanceof byte[]) {
                            final io.socket.engineio.client.c cVar2 = this.d;
                            final byte[] bArr = (byte[]) obj;
                            io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.c.10
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c.a(cVar2, "message", bArr, r3);
                                }
                            });
                        }
                    }
                    c.b(this, false);
                    c.k(this);
                }
            };
            io.socket.parser.c.c.fine(String.format("encoding packet %s", bVar));
            if (5 != bVar.a && 6 != bVar.a) {
                aVar.a(new String[]{c.C1532c.a(bVar)});
                return;
            }
            a.C1531a a2 = io.socket.parser.a.a(bVar);
            String a3 = c.C1532c.a(a2.a);
            ArrayList arrayList = new ArrayList(Arrays.asList(a2.b));
            arrayList.add(0, a3);
            aVar.a(arrayList.toArray());
            return;
        }
        this.t.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        f.fine("cleanup");
        while (true) {
            d.a poll = this.u.poll();
            if (poll == null) {
                this.t.clear();
                this.j = false;
                this.r = null;
                this.x.a();
                return;
            }
            poll.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.i || this.h) {
            return;
        }
        if (this.o.d >= this.k) {
            f.fine("reconnect failed");
            this.o.d = 0;
            b("reconnect_failed", new Object[0]);
            this.i = false;
            return;
        }
        long a2 = this.o.a();
        f.fine(String.format("will wait %dms before reconnect attempt", Long.valueOf(a2)));
        this.i = true;
        final Timer timer = new Timer();
        timer.schedule(new AnonymousClass3(this), a2);
        this.u.add(new d.a() { // from class: io.socket.client.c.4
            @Override // io.socket.client.d.a
            public final void a() {
                timer.cancel();
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: io.socket.client.c$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass3 extends TimerTask {
        final /* synthetic */ c a;

        AnonymousClass3(c cVar) {
            this.a = cVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            io.socket.thread.a.a(new Runnable() { // from class: io.socket.client.c.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (AnonymousClass3.this.a.h) {
                        return;
                    }
                    c.f.fine("attempting reconnect");
                    int i = AnonymousClass3.this.a.o.d;
                    AnonymousClass3.this.a.b("reconnect_attempt", Integer.valueOf(i));
                    AnonymousClass3.this.a.b("reconnecting", Integer.valueOf(i));
                    if (AnonymousClass3.this.a.h) {
                        return;
                    }
                    AnonymousClass3.this.a.a(new b() { // from class: io.socket.client.c.3.1.1
                        @Override // io.socket.client.c.b
                        public final void a(Exception exc) {
                            if (exc != null) {
                                c.f.fine("reconnect attempt error");
                                c.c(AnonymousClass3.this.a, false);
                                AnonymousClass3.this.a.d();
                                AnonymousClass3.this.a.b("reconnect_error", exc);
                                return;
                            }
                            c.f.fine("reconnect success");
                            c.o(AnonymousClass3.this.a);
                        }
                    });
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static class a extends io.socket.engineio.client.c {
        a(URI uri, c.a aVar) {
            super(uri, aVar);
        }
    }

    static /* synthetic */ void c(c cVar) {
        f.fine(MarketingModel.TYPE_ENTER_DIALOG);
        cVar.b();
        cVar.c = d.OPEN;
        cVar.a(MarketingModel.TYPE_ENTER_DIALOG, new Object[0]);
        io.socket.engineio.client.c cVar2 = cVar.d;
        cVar.u.add(io.socket.client.d.a(cVar2, "data", new a.InterfaceC1525a() { // from class: io.socket.client.c.5
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                Object obj = objArr[0];
                if (obj instanceof String) {
                    c.a(c.this, (String) obj);
                } else if (obj instanceof byte[]) {
                    c.a(c.this, (byte[]) obj);
                }
            }
        }));
        cVar.u.add(io.socket.client.d.a(cVar2, "ping", new a.InterfaceC1525a() { // from class: io.socket.client.c.6
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                c.h(c.this);
            }
        }));
        cVar.u.add(io.socket.client.d.a(cVar2, "pong", new a.InterfaceC1525a() { // from class: io.socket.client.c.7
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                c.i(c.this);
            }
        }));
        cVar.u.add(io.socket.client.d.a(cVar2, "error", new a.InterfaceC1525a() { // from class: io.socket.client.c.8
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                c.a(c.this, (Exception) objArr[0]);
            }
        }));
        cVar.u.add(io.socket.client.d.a(cVar2, "close", new a.InterfaceC1525a() { // from class: io.socket.client.c.9
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                c.b(c.this, (String) objArr[0]);
            }
        }));
        cVar.u.add(io.socket.client.d.a(cVar.x, c.b.a, new a.InterfaceC1525a() { // from class: io.socket.client.c.10
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                c.a(c.this, (io.socket.parser.b) objArr[0]);
            }
        }));
    }

    static /* synthetic */ void e(c cVar) {
        if (!cVar.i && cVar.g && cVar.o.d == 0) {
            cVar.d();
        }
    }

    static /* synthetic */ void a(c cVar, String str) {
        c.b bVar = cVar.x;
        io.socket.parser.b b2 = c.b.b(str);
        if (5 == b2.a || 6 == b2.a) {
            bVar.b = new c.a(b2);
            if (bVar.b.a.e == 0) {
                bVar.a(c.b.a, b2);
                return;
            }
            return;
        }
        bVar.a(c.b.a, b2);
    }

    static /* synthetic */ void a(c cVar, byte[] bArr) {
        io.socket.parser.b bVar;
        c.b bVar2 = cVar.x;
        if (bVar2.b == null) {
            throw new RuntimeException("got binary data when not reconstructing a packet");
        }
        c.a aVar = bVar2.b;
        aVar.b.add(bArr);
        if (aVar.b.size() == aVar.a.e) {
            bVar = io.socket.parser.a.a(aVar.a, (byte[][]) aVar.b.toArray(new byte[aVar.b.size()]));
            aVar.a();
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar2.b = null;
            bVar2.a(c.b.a, bVar);
        }
    }

    static /* synthetic */ void h(c cVar) {
        cVar.r = new Date();
        cVar.b("ping", new Object[0]);
    }

    static /* synthetic */ void i(c cVar) {
        Object[] objArr = new Object[1];
        objArr[0] = Long.valueOf(cVar.r != null ? new Date().getTime() - cVar.r.getTime() : 0L);
        cVar.b("pong", objArr);
    }

    static /* synthetic */ void a(c cVar, Exception exc) {
        f.log(Level.FINE, "error", (Throwable) exc);
        cVar.b("error", exc);
    }

    static /* synthetic */ void b(c cVar, String str) {
        f.fine("onclose");
        cVar.b();
        cVar.o.d = 0;
        cVar.c = d.CLOSED;
        cVar.a("close", str);
        if (!cVar.g || cVar.h) {
            return;
        }
        cVar.d();
    }

    static /* synthetic */ void a(c cVar, io.socket.parser.b bVar) {
        cVar.a("packet", bVar);
    }

    static /* synthetic */ void k(c cVar) {
        if (cVar.t.isEmpty() || cVar.j) {
            return;
        }
        cVar.a(cVar.t.remove(0));
    }

    static /* synthetic */ void o(c cVar) {
        int i = cVar.o.d;
        cVar.i = false;
        cVar.o.d = 0;
        for (e eVar : cVar.e.values()) {
            eVar.b = cVar.d.b;
        }
        cVar.b("reconnect", Integer.valueOf(i));
    }
}
