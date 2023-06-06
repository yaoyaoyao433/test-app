package io.socket.engineio.client;

import android.support.v4.app.NotificationCompat;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.xm.im.message.bean.Message;
import io.socket.emitter.a;
import io.socket.engineio.client.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class c extends io.socket.emitter.a {
    private static final Logger f = Logger.getLogger(c.class.getName());
    private static boolean g = false;
    private static WebSocket.Factory h;
    private static Call.Factory i;
    private static OkHttpClient j;
    private WebSocket.Factory A;
    private Call.Factory B;
    private b C;
    private ScheduledExecutorService D;
    private final a.InterfaceC1525a E;
    int a;
    public String b;
    String c;
    LinkedList<io.socket.engineio.parser.b> d;
    d e;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private long r;
    private long s;
    private String t;
    private String u;
    private List<String> v;
    private List<String> w;
    private Map<String, String> x;
    private Future y;
    private Future z;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class a extends d.a {
        public String[] i;
        public boolean j = true;
        public boolean k;
        public String l;
        public String m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum b {
        OPENING,
        OPEN,
        CLOSING,
        CLOSED;

        @Override // java.lang.Enum
        public final String toString() {
            return super.toString().toLowerCase();
        }
    }

    public c() {
        this(new a());
    }

    private c(a aVar) {
        this.d = new LinkedList<>();
        this.E = new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.1
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                c.a(c.this, objArr.length > 0 ? ((Long) objArr[0]).longValue() : 0L);
            }
        };
        if (aVar.l != null) {
            String str = aVar.l;
            if (str.split(CommonConstant.Symbol.COLON).length > 2) {
                int indexOf = str.indexOf(91);
                str = indexOf != -1 ? str.substring(indexOf + 1) : str;
                int lastIndexOf = str.lastIndexOf(93);
                if (lastIndexOf != -1) {
                    str = str.substring(0, lastIndexOf);
                }
            }
            aVar.n = str;
        }
        this.k = aVar.q;
        if (aVar.s == -1) {
            aVar.s = this.k ? 443 : 80;
        }
        this.c = aVar.n != null ? aVar.n : "localhost";
        this.a = aVar.s;
        this.x = aVar.m != null ? io.socket.parseqs.a.a(aVar.m) : new HashMap<>();
        this.l = aVar.j;
        StringBuilder sb = new StringBuilder();
        sb.append((aVar.o != null ? aVar.o : "/engine.io").replaceAll("/$", ""));
        sb.append("/");
        this.t = sb.toString();
        this.u = aVar.p != null ? aVar.p : "t";
        this.m = aVar.r;
        this.v = new ArrayList(Arrays.asList(aVar.i != null ? aVar.i : new String[]{"polling", "websocket"}));
        this.p = aVar.t != 0 ? aVar.t : 843;
        this.o = aVar.k;
        this.B = aVar.x != null ? aVar.x : i;
        this.A = aVar.w != null ? aVar.w : h;
        if (this.B == null) {
            if (j == null) {
                j = new OkHttpClient();
            }
            this.B = j;
        }
        if (this.A == null) {
            if (j == null) {
                j = new OkHttpClient();
            }
            this.A = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d b(String str) {
        d bVar;
        f.fine(String.format("creating transport '%s'", str));
        HashMap hashMap = new HashMap(this.x);
        hashMap.put("EIO", "3");
        hashMap.put(NotificationCompat.CATEGORY_TRANSPORT, str);
        if (this.b != null) {
            hashMap.put(Message.SID, this.b);
        }
        d.a aVar = new d.a();
        aVar.n = this.c;
        aVar.s = this.a;
        aVar.q = this.k;
        aVar.o = this.t;
        aVar.u = hashMap;
        aVar.r = this.m;
        aVar.p = this.u;
        aVar.t = this.p;
        aVar.v = this;
        aVar.x = this.B;
        aVar.w = this.A;
        if ("websocket".equals(str)) {
            bVar = new io.socket.engineio.client.transports.c(aVar);
        } else if ("polling".equals(str)) {
            bVar = new io.socket.engineio.client.transports.b(aVar);
        } else {
            throw new RuntimeException();
        }
        a(NotificationCompat.CATEGORY_TRANSPORT, bVar);
        return bVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: io.socket.engineio.client.c$18  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass18 implements a.InterfaceC1525a {
        final /* synthetic */ boolean[] a;
        final /* synthetic */ String b;
        final /* synthetic */ d[] c;
        final /* synthetic */ c d;
        final /* synthetic */ Runnable[] e;

        AnonymousClass18(boolean[] zArr, String str, d[] dVarArr, c cVar, Runnable[] runnableArr) {
            this.a = zArr;
            this.b = str;
            this.c = dVarArr;
            this.d = cVar;
            this.e = runnableArr;
        }

        @Override // io.socket.emitter.a.InterfaceC1525a
        public final void a(Object... objArr) {
            if (this.a[0]) {
                return;
            }
            c.f.fine(String.format("probe transport '%s' opened", this.b));
            this.c[0].a(new io.socket.engineio.parser.b[]{new io.socket.engineio.parser.b("ping", "probe")});
            this.c[0].b("packet", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.18.1
                @Override // io.socket.emitter.a.InterfaceC1525a
                public final void a(Object... objArr2) {
                    if (AnonymousClass18.this.a[0]) {
                        return;
                    }
                    io.socket.engineio.parser.b bVar = (io.socket.engineio.parser.b) objArr2[0];
                    if (!"pong".equals(bVar.a) || !"probe".equals(bVar.b)) {
                        c.f.fine(String.format("probe transport '%s' failed", AnonymousClass18.this.b));
                        io.socket.engineio.client.a aVar = new io.socket.engineio.client.a("probe error");
                        aVar.a = AnonymousClass18.this.c[0].b;
                        AnonymousClass18.this.d.a("upgradeError", aVar);
                        return;
                    }
                    c.f.fine(String.format("probe transport '%s' pong", AnonymousClass18.this.b));
                    AnonymousClass18.this.d.n = true;
                    AnonymousClass18.this.d.a("upgrading", AnonymousClass18.this.c[0]);
                    if (AnonymousClass18.this.c[0] == null) {
                        return;
                    }
                    boolean unused = c.g = "websocket".equals(AnonymousClass18.this.c[0].b);
                    c.f.fine(String.format("pausing current transport '%s'", AnonymousClass18.this.d.e.b));
                    final io.socket.engineio.client.transports.a aVar2 = (io.socket.engineio.client.transports.a) AnonymousClass18.this.d.e;
                    final Runnable runnable = new Runnable() { // from class: io.socket.engineio.client.c.18.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (AnonymousClass18.this.a[0] || b.CLOSED == AnonymousClass18.this.d.C) {
                                return;
                            }
                            c.f.fine("changing transport and sending upgrade packet");
                            AnonymousClass18.this.e[0].run();
                            c.a(AnonymousClass18.this.d, AnonymousClass18.this.c[0]);
                            AnonymousClass18.this.c[0].a(new io.socket.engineio.parser.b[]{new io.socket.engineio.parser.b("upgrade")});
                            AnonymousClass18.this.d.a("upgrade", AnonymousClass18.this.c[0]);
                            AnonymousClass18.this.c[0] = null;
                            AnonymousClass18.this.d.n = false;
                            AnonymousClass18.this.d.g();
                        }
                    };
                    io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.transports.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            final a aVar3 = aVar2;
                            aVar2.k = d.b.PAUSED;
                            final Runnable runnable2 = new Runnable() { // from class: io.socket.engineio.client.transports.a.1.1
                                {
                                    AnonymousClass1.this = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    a.n.fine("paused");
                                    aVar3.k = d.b.PAUSED;
                                    runnable.run();
                                }
                            };
                            if (aVar2.o || !aVar2.a) {
                                final int[] iArr = {0};
                                if (aVar2.o) {
                                    a.n.fine("we are currently polling - waiting to pause");
                                    iArr[0] = iArr[0] + 1;
                                    aVar2.b("pollComplete", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.transports.a.1.2
                                        {
                                            AnonymousClass1.this = this;
                                        }

                                        @Override // io.socket.emitter.a.InterfaceC1525a
                                        public final void a(Object... objArr3) {
                                            a.n.fine("pre-pause polling complete");
                                            int[] iArr2 = iArr;
                                            int i = iArr2[0] - 1;
                                            iArr2[0] = i;
                                            if (i == 0) {
                                                runnable2.run();
                                            }
                                        }
                                    });
                                }
                                if (aVar2.a) {
                                    return;
                                }
                                a.n.fine("we are currently writing - waiting to pause");
                                iArr[0] = iArr[0] + 1;
                                aVar2.b("drain", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.transports.a.1.3
                                    {
                                        AnonymousClass1.this = this;
                                    }

                                    @Override // io.socket.emitter.a.InterfaceC1525a
                                    public final void a(Object... objArr3) {
                                        a.n.fine("pre-pause writing complete");
                                        int[] iArr2 = iArr;
                                        int i = iArr2[0] - 1;
                                        iArr2[0] = i;
                                        if (i == 0) {
                                            runnable2.run();
                                        }
                                    }
                                });
                                return;
                            }
                            runnable2.run();
                        }
                    });
                }
            });
        }
    }

    private void e() {
        f.fine("socket open");
        this.C = b.OPEN;
        g = "websocket".equals(this.e.b);
        a(MarketingModel.TYPE_ENTER_DIALOG, new Object[0]);
        g();
        if (this.C == b.OPEN && this.l && (this.e instanceof io.socket.engineio.client.transports.a)) {
            f.fine("starting upgrade probes");
            for (final String str : this.w) {
                f.fine(String.format("probing transport '%s'", str));
                final d[] dVarArr = {b(str)};
                final boolean[] zArr = {false};
                g = false;
                final AnonymousClass18 anonymousClass18 = new AnonymousClass18(zArr, str, dVarArr, this, r13);
                final a.InterfaceC1525a interfaceC1525a = new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.19
                    @Override // io.socket.emitter.a.InterfaceC1525a
                    public final void a(Object... objArr) {
                        if (zArr[0]) {
                            return;
                        }
                        zArr[0] = true;
                        r3[0].run();
                        dVarArr[0].b();
                        dVarArr[0] = null;
                    }
                };
                final a.InterfaceC1525a interfaceC1525a2 = new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.20
                    @Override // io.socket.emitter.a.InterfaceC1525a
                    public final void a(Object... objArr) {
                        io.socket.engineio.client.a aVar;
                        Object obj = objArr[0];
                        if (obj instanceof Exception) {
                            aVar = new io.socket.engineio.client.a("probe error", (Exception) obj);
                        } else if (obj instanceof String) {
                            aVar = new io.socket.engineio.client.a("probe error: " + ((String) obj));
                        } else {
                            aVar = new io.socket.engineio.client.a("probe error");
                        }
                        aVar.a = dVarArr[0].b;
                        interfaceC1525a.a(new Object[0]);
                        c.f.fine(String.format("probe transport \"%s\" failed because of error: %s", str, obj));
                        this.a("upgradeError", aVar);
                    }
                };
                final a.InterfaceC1525a interfaceC1525a3 = new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.2
                    @Override // io.socket.emitter.a.InterfaceC1525a
                    public final void a(Object... objArr) {
                        interfaceC1525a2.a("transport closed");
                    }
                };
                final a.InterfaceC1525a interfaceC1525a4 = new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.3
                    @Override // io.socket.emitter.a.InterfaceC1525a
                    public final void a(Object... objArr) {
                        interfaceC1525a2.a("socket closed");
                    }
                };
                final a.InterfaceC1525a interfaceC1525a5 = new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.4
                    @Override // io.socket.emitter.a.InterfaceC1525a
                    public final void a(Object... objArr) {
                        d dVar = (d) objArr[0];
                        if (dVarArr[0] == null || dVar.b.equals(dVarArr[0].b)) {
                            return;
                        }
                        c.f.fine(String.format("'%s' works - aborting '%s'", dVar.b, dVarArr[0].b));
                        interfaceC1525a.a(new Object[0]);
                    }
                };
                final Runnable[] runnableArr = {new Runnable() { // from class: io.socket.engineio.client.c.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVarArr[0].c(MarketingModel.TYPE_ENTER_DIALOG, anonymousClass18);
                        dVarArr[0].c("error", interfaceC1525a2);
                        dVarArr[0].c("close", interfaceC1525a3);
                        this.c("close", interfaceC1525a4);
                        this.c("upgrading", interfaceC1525a5);
                    }
                }};
                dVarArr[0].b(MarketingModel.TYPE_ENTER_DIALOG, anonymousClass18);
                dVarArr[0].b("error", interfaceC1525a2);
                dVarArr[0].b("close", interfaceC1525a3);
                b("close", interfaceC1525a4);
                b("upgrading", interfaceC1525a5);
                dVarArr[0].a();
            }
        }
    }

    private void f() {
        if (this.z != null) {
            this.z.cancel(false);
        }
        this.z = h().schedule(new Runnable() { // from class: io.socket.engineio.client.c.7
            @Override // java.lang.Runnable
            public final void run() {
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.c.7.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.f.fine(String.format("writing ping packet - expecting pong within %sms", Long.valueOf(this.s)));
                        c.g(this);
                        c.a(this, this.s);
                    }
                });
            }
        }, this.r, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.C == b.CLOSED || !this.e.a || this.n || this.d.size() == 0) {
            return;
        }
        f.fine(String.format("flushing %d packets in socket", Integer.valueOf(this.d.size())));
        this.q = this.d.size();
        this.e.a((io.socket.engineio.parser.b[]) this.d.toArray(new io.socket.engineio.parser.b[this.d.size()]));
        a("flush", new Object[0]);
    }

    private void a(io.socket.engineio.parser.b bVar, final Runnable runnable) {
        if (b.CLOSING == this.C || b.CLOSED == this.C) {
            return;
        }
        a("packetCreate", bVar);
        this.d.offer(bVar);
        if (runnable != null) {
            b("flush", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.11
                @Override // io.socket.emitter.a.InterfaceC1525a
                public final void a(Object... objArr) {
                    runnable.run();
                }
            });
        }
        g();
    }

    public final c a() {
        io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.c.13
            @Override // java.lang.Runnable
            public final void run() {
                if (c.this.C == b.OPENING || c.this.C == b.OPEN) {
                    c.this.C = b.CLOSING;
                    final c cVar = c.this;
                    final Runnable runnable = new Runnable() { // from class: io.socket.engineio.client.c.13.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            cVar.a("forced close", (Exception) null);
                            c.f.fine("socket closing - telling transport to close");
                            cVar.e.b();
                        }
                    };
                    final a.InterfaceC1525a[] interfaceC1525aArr = {new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.13.2
                        @Override // io.socket.emitter.a.InterfaceC1525a
                        public final void a(Object... objArr) {
                            cVar.c("upgrade", interfaceC1525aArr[0]);
                            cVar.c("upgradeError", interfaceC1525aArr[0]);
                            runnable.run();
                        }
                    }};
                    final Runnable runnable2 = new Runnable() { // from class: io.socket.engineio.client.c.13.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            cVar.b("upgrade", interfaceC1525aArr[0]);
                            cVar.b("upgradeError", interfaceC1525aArr[0]);
                        }
                    };
                    if (c.this.d.size() <= 0) {
                        if (c.this.n) {
                            runnable2.run();
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    c.this.b("drain", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.13.4
                        @Override // io.socket.emitter.a.InterfaceC1525a
                        public final void a(Object... objArr) {
                            if (c.this.n) {
                                runnable2.run();
                            } else {
                                runnable.run();
                            }
                        }
                    });
                }
            }
        });
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Exception exc) {
        f.fine(String.format("socket error %s", exc));
        g = false;
        a("error", exc);
        a("transport error", exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Exception exc) {
        if (b.OPENING == this.C || b.OPEN == this.C || b.CLOSING == this.C) {
            f.fine(String.format("socket close with reason: %s", str));
            if (this.z != null) {
                this.z.cancel(false);
            }
            if (this.y != null) {
                this.y.cancel(false);
            }
            if (this.D != null) {
                this.D.shutdown();
            }
            this.e.a("close");
            this.e.b();
            this.e.c();
            this.C = b.CLOSED;
            this.b = null;
            a("close", str, exc);
            this.d.clear();
            this.q = 0;
        }
    }

    private ScheduledExecutorService h() {
        if (this.D == null || this.D.isShutdown()) {
            this.D = Executors.newSingleThreadScheduledExecutor();
        }
        return this.D;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.net.URI r3, io.socket.engineio.client.c.a r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            goto L3c
        L3:
            if (r4 != 0) goto La
            io.socket.engineio.client.c$a r4 = new io.socket.engineio.client.c$a
            r4.<init>()
        La:
            java.lang.String r0 = r3.getHost()
            r4.l = r0
            java.lang.String r0 = "https"
            java.lang.String r1 = r3.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "wss"
            java.lang.String r1 = r3.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L29
            goto L2b
        L29:
            r0 = 0
            goto L2c
        L2b:
            r0 = 1
        L2c:
            r4.q = r0
            int r0 = r3.getPort()
            r4.s = r0
            java.lang.String r3 = r3.getRawQuery()
            if (r3 == 0) goto L3c
            r4.m = r3
        L3c:
            r2.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.socket.engineio.client.c.<init>(java.net.URI, io.socket.engineio.client.c$a):void");
    }

    static /* synthetic */ void a(final c cVar, long j2) {
        if (cVar.y != null) {
            cVar.y.cancel(false);
        }
        if (j2 <= 0) {
            j2 = cVar.r + cVar.s;
        }
        cVar.y = cVar.h().schedule(new Runnable() { // from class: io.socket.engineio.client.c.6
            @Override // java.lang.Runnable
            public final void run() {
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.c.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (cVar.C == b.CLOSED) {
                            return;
                        }
                        cVar.a("ping timeout", (Exception) null);
                    }
                });
            }
        }, j2, TimeUnit.MILLISECONDS);
    }

    static /* synthetic */ void a(final c cVar, d dVar) {
        f.fine(String.format("setting transport %s", dVar.b));
        if (cVar.e != null) {
            f.fine(String.format("clearing existing transport %s", cVar.e.b));
            cVar.e.c();
        }
        cVar.e = dVar;
        dVar.a("drain", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.17
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                c.c(cVar);
            }
        }).a("packet", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.16
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                c.a(cVar, objArr.length > 0 ? (io.socket.engineio.parser.b) objArr[0] : null);
            }
        }).a("error", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.15
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                cVar.a(objArr.length > 0 ? (Exception) objArr[0] : null);
            }
        }).a("close", new a.InterfaceC1525a() { // from class: io.socket.engineio.client.c.14
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                cVar.a("transport close", (Exception) null);
            }
        });
    }

    static /* synthetic */ void a(c cVar, io.socket.engineio.parser.b bVar) {
        if (cVar.C == b.OPENING || cVar.C == b.OPEN || cVar.C == b.CLOSING) {
            f.fine(String.format("socket received: type '%s', data '%s'", bVar.a, bVar.b));
            cVar.a("packet", bVar);
            cVar.a("heartbeat", new Object[0]);
            if (MarketingModel.TYPE_ENTER_DIALOG.equals(bVar.a)) {
                try {
                    io.socket.engineio.client.b bVar2 = new io.socket.engineio.client.b((String) bVar.b);
                    cVar.a("handshake", bVar2);
                    cVar.b = bVar2.a;
                    cVar.e.c.put(Message.SID, bVar2.a);
                    List<String> asList = Arrays.asList(bVar2.b);
                    ArrayList arrayList = new ArrayList();
                    for (String str : asList) {
                        if (cVar.v.contains(str)) {
                            arrayList.add(str);
                        }
                    }
                    cVar.w = arrayList;
                    cVar.r = bVar2.c;
                    cVar.s = bVar2.d;
                    cVar.e();
                    if (b.CLOSED != cVar.C) {
                        cVar.f();
                        cVar.c("heartbeat", cVar.E);
                        cVar.a("heartbeat", cVar.E);
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    cVar.a("error", new io.socket.engineio.client.a(e));
                    return;
                }
            } else if ("pong".equals(bVar.a)) {
                cVar.f();
                cVar.a("pong", new Object[0]);
                return;
            } else if ("error".equals(bVar.a)) {
                io.socket.engineio.client.a aVar = new io.socket.engineio.client.a("server error");
                aVar.b = bVar.b;
                cVar.a(aVar);
                return;
            } else if ("message".equals(bVar.a)) {
                cVar.a("data", bVar.b);
                cVar.a("message", bVar.b);
                return;
            } else {
                return;
            }
        }
        f.fine(String.format("packet received with socket readyState '%s'", cVar.C));
    }

    static /* synthetic */ void c(c cVar) {
        for (int i2 = 0; i2 < cVar.q; i2++) {
            cVar.d.poll();
        }
        cVar.q = 0;
        if (cVar.d.size() == 0) {
            cVar.a("drain", new Object[0]);
        } else {
            cVar.g();
        }
    }

    static /* synthetic */ void g(c cVar) {
        io.socket.thread.a.a(new Runnable() { // from class: io.socket.engineio.client.c.8
            @Override // java.lang.Runnable
            public final void run() {
                c.a(c.this, "ping", new Runnable() { // from class: io.socket.engineio.client.c.8.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.a("ping", new Object[0]);
                    }
                });
            }
        });
    }

    static /* synthetic */ void a(c cVar, String str, Runnable runnable) {
        cVar.a(new io.socket.engineio.parser.b(str), runnable);
    }

    static /* synthetic */ void a(c cVar, String str, String str2, Runnable runnable) {
        cVar.a(new io.socket.engineio.parser.b(str, str2), runnable);
    }

    static /* synthetic */ void a(c cVar, String str, byte[] bArr, Runnable runnable) {
        cVar.a(new io.socket.engineio.parser.b(str, bArr), runnable);
    }
}
