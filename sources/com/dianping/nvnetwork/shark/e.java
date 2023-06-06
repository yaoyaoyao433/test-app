package com.dianping.nvnetwork.shark;

import android.content.Context;
import android.util.Base64;
import com.dianping.nvlbservice.f;
import com.dianping.nvlbservice.m;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.h;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.tnold.c;
import com.dianping.nvnetwork.tnold.k;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager;
import com.dianping.nvnetwork.u;
import com.dianping.nvnetwork.v;
import com.dianping.nvnetwork.x;
import com.dianping.nvnetwork.y;
import com.dianping.nvtunnelkit.kit.o;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements f.a, h.a, com.dianping.nvnetwork.http.a, c.a, com.dianping.nvtunnelkit.kit.a {
    public static ChangeQuickRedirect a;
    public final o c;
    private final Map<v, b> e;
    private final com.dianping.nvlbservice.f f;
    private final AtomicBoolean g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;
    private final c j;
    private final Runnable k;
    private final Runnable l;
    private static final String d = com.dianping.nvtunnelkit.logger.a.a("SharkTunnelService");
    public static boolean b = false;

    @Override // com.dianping.nvnetwork.h.a
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0fdcc782438a859dc918a7a93b91f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0fdcc782438a859dc918a7a93b91f6");
        } else {
            a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum c {
        QUIC("quic"),
        TCP_OLD(TrafficRecord.Detail.TUNNEL_SHARK),
        TCP("shark_v2");
        
        public static ChangeQuickRedirect a;
        public final String e;

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cac63ea2485db46e004eb6699696b831", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cac63ea2485db46e004eb6699696b831") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5cee9a68c78d7ecae45324727976987", 6917529027641081856L) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5cee9a68c78d7ecae45324727976987") : (c[]) values().clone();
        }

        c(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de0e1dd57b65378c0523d11785a1af17", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de0e1dd57b65378c0523d11785a1af17");
            } else {
                this.e = str;
            }
        }
    }

    public e(final Context context, c cVar) {
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d919286f3c2e48182cb1e68a869dcfa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d919286f3c2e48182cb1e68a869dcfa0");
            return;
        }
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.k = new Runnable() { // from class: com.dianping.nvnetwork.shark.e.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75c149c768a8f9730647ec7451fdc815", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75c149c768a8f9730647ec7451fdc815");
                } else if (e.this.g.get()) {
                } else {
                    e.this.g.set(true);
                    e.this.f.a(0L);
                }
            }
        };
        this.l = new Runnable() { // from class: com.dianping.nvnetwork.shark.e.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa24f4cf2c7c71c77689516b6a83f6b2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa24f4cf2c7c71c77689516b6a83f6b2");
                } else if (e.this.h.get()) {
                    if (com.dianping.nvnetwork.g.p()) {
                        String unused = e.d;
                    }
                    e.this.c.k();
                }
            }
        };
        com.dianping.nvlbservice.b.a(new com.dianping.nvlbservice.g() { // from class: com.dianping.nvnetwork.shark.e.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvlbservice.g
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d57aa07c45ef540fadabf90cfb6afc23", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d57aa07c45ef540fadabf90cfb6afc23") : com.dianping.nvtunnelkit.utils.d.a(context);
            }
        });
        this.f = com.dianping.nvlbservice.b.a();
        this.e = new ConcurrentHashMap();
        this.j = cVar;
        com.dianping.nvtunnelkit.ext.d.a().b = com.dianping.nvnetwork.g.d();
        com.dianping.nvtunnelkit.kit.v a2 = g.a(cVar);
        if (this.j == c.QUIC) {
            a2.p = false;
        } else {
            a2.p = false;
        }
        y yVar = new y();
        yVar.b = com.dianping.nvnetwork.h.h().P;
        yVar.c = com.dianping.nvnetwork.h.h().Q;
        yVar.d = com.dianping.nvnetwork.h.h().m;
        yVar.a = true;
        yVar.e = this;
        if (AnonymousClass9.a[this.j.ordinal()] == 1) {
            this.c = new d(context.getApplicationContext(), yVar, a2, this);
            if (this.c instanceof com.dianping.nvnetwork.shark.a) {
                ((com.dianping.nvnetwork.shark.a) this.c).a(new u() { // from class: com.dianping.nvnetwork.shark.e.2
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.nvnetwork.u
                    public final void a(x xVar) {
                        Object[] objArr2 = {xVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56e5353f772c2c9a1c1afe8dd416862a", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56e5353f772c2c9a1c1afe8dd416862a");
                            return;
                        }
                        b bVar = (b) e.this.e.get(xVar.e);
                        if (bVar != null) {
                            bVar.a(xVar, null);
                        }
                    }

                    @Override // com.dianping.nvnetwork.u
                    public final void a(x xVar, com.dianping.nvtunnelkit.exception.d dVar) {
                        Object[] objArr2 = {xVar, dVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c328ccc5789aa71d487874a2ddf9e892", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c328ccc5789aa71d487874a2ddf9e892");
                            return;
                        }
                        b bVar = (b) e.this.e.get(xVar.e);
                        if (bVar != null) {
                            bVar.a(xVar, dVar);
                        }
                    }

                    @Override // com.dianping.nvnetwork.u
                    public final void a(Throwable th) {
                        Object[] objArr2 = {th};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a40ff4c1740303325668695fc8cc614a", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a40ff4c1740303325668695fc8cc614a");
                        } else {
                            com.dianping.nvtunnelkit.logger.b.a(e.d, "onError...", th);
                        }
                    }
                });
            }
            com.dianping.nvtunnelkit.kit.d l = this.c.l();
            if (l != null) {
                l.a(new com.dianping.nvtunnelkit.ext.e() { // from class: com.dianping.nvnetwork.shark.e.3
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.nvtunnelkit.ext.e
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0dff83bedd6d0bea4b915278496f68b0", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0dff83bedd6d0bea4b915278496f68b0");
                            return;
                        }
                        if (com.dianping.nvnetwork.g.p()) {
                            String unused = e.d;
                        }
                        e.this.a();
                    }
                });
            }
            this.g = new AtomicBoolean(false);
            NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(com.dianping.nvnetwork.g.b());
            SharkWrapper.addInterceptorToBuilder(aVar);
            aVar.e = true;
            final NVDefaultNetworkService a3 = aVar.a();
            this.f.a(new com.dianping.nvlbservice.e() { // from class: com.dianping.nvnetwork.shark.e.4
                public static ChangeQuickRedirect a;

                @Override // com.dianping.nvlbservice.e
                public final q a(Request request) {
                    Object[] objArr2 = {request};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15525a7bd0c47d8910b0398759288d21", 6917529027641081856L) ? (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15525a7bd0c47d8910b0398759288d21") : a3.execSync(request.a().samplingRate(33).build());
                }
            });
            this.f.a(this);
            com.dianping.nvnetwork.h.h().a(this);
            return;
        }
        throw new IllegalArgumentException("UseType invalid." + this.j);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.nvnetwork.shark.e$9  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass9 {
        public static final /* synthetic */ int[] a = new int[c.valuesCustom().length];

        static {
            try {
                a[c.TCP_OLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "981469c6ae603aa209313cb19eb6de85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "981469c6ae603aa209313cb19eb6de85");
        } else if (this.i.compareAndSet(false, true)) {
            boolean f = f();
            if (f && this.h.get()) {
                this.h.set(false);
                com.dianping.nvtunnelkit.core.c.a().b(this.l);
            }
            if (f && this.c.j()) {
                com.dianping.nvnetwork.g.p();
                this.c.f();
                com.dianping.nvtunnelkit.core.c.a().a(this.k);
            }
            if (!f && !this.c.j() && !this.h.get()) {
                this.h.set(true);
                long j = com.dianping.nvnetwork.h.h().ai;
                if (j <= 0) {
                    com.dianping.nvnetwork.g.p();
                    this.c.k();
                } else {
                    com.dianping.nvtunnelkit.core.c.a().a(this.l, j);
                }
            }
            this.i.set(false);
        }
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00c6f7fe6e57fb3f0c247a868d782227", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00c6f7fe6e57fb3f0c247a868d782227")).booleanValue() : !com.dianping.nvnetwork.h.h().g();
    }

    @Override // com.dianping.nvnetwork.http.a
    public final rx.d<q> exec(final Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d05a14fed54bba8dfa47cb829a6c09", 6917529027641081856L)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d05a14fed54bba8dfa47cb829a6c09");
        }
        final long a2 = g.a();
        return rx.d.a((d.a) new d.a<q>() { // from class: com.dianping.nvnetwork.shark.e.7
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d32466f6778d34d1f55d6bb9baa1ccd4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d32466f6778d34d1f55d6bb9baa1ccd4");
                    return;
                }
                v a3 = g.a(request);
                e.this.e.put(a3, new b(a3, request, jVar, a2));
                e.this.c.a_((o) a3);
            }
        });
    }

    public final void cancel(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d960b95797f63eb458ddd3e2f5d40336", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d960b95797f63eb458ddd3e2f5d40336");
            return;
        }
        for (b bVar : this.e.values()) {
            if (bVar.c == request) {
                String str = d;
                com.dianping.nvtunnelkit.logger.b.a(str, "Request cancel req ID:" + request.b());
                bVar.cancel();
                return;
            }
        }
    }

    public final void cancel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "516ade54d6b16eaea33918359ca17f94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "516ade54d6b16eaea33918359ca17f94");
            return;
        }
        for (b bVar : this.e.values()) {
            if (com.dianping.nvtunnelkit.utils.f.a(bVar.c.b(), str)) {
                String str2 = d;
                com.dianping.nvtunnelkit.logger.b.a(str2, "Request cancel ID:" + str);
                bVar.cancel();
                return;
            }
        }
    }

    @Override // com.dianping.nvnetwork.tnold.c.a
    public final com.dianping.nvnetwork.tnold.secure.d b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507cd831bdb5237966d314acbd9d55f6", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.tnold.secure.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507cd831bdb5237966d314acbd9d55f6");
        }
        com.dianping.nvnetwork.tnold.secure.d dVar = new com.dianping.nvnetwork.tnold.secure.d();
        dVar.a = com.dianping.nvnetwork.g.a();
        dVar.b = com.dianping.nvnetwork.g.i();
        dVar.c = com.dianping.nvnetwork.g.j();
        return dVar;
    }

    @Override // com.dianping.nvnetwork.tnold.c.a
    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2dede024a5f402807e1acdd6bc19a2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2dede024a5f402807e1acdd6bc19a2d");
        } else {
            kVar.a(new SocketSecureManager.OnSocketSecureManagerEventLisenter() { // from class: com.dianping.nvnetwork.shark.e.8
                public static ChangeQuickRedirect a;

                @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager.OnSocketSecureManagerEventLisenter
                public final void onCreateB2KeyInfoEvent(boolean z, String str, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44fbb8c0e6143618520c36f77ecfa7c4", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44fbb8c0e6143618520c36f77ecfa7c4");
                        return;
                    }
                    com.dianping.nvnetwork.g.d().pv3(0L, "tunnel_encrypt_kit", 0, 1, z ? 200 : -145, 0, 0, i, str);
                    if (z) {
                        com.dianping.nvtunnelkit.logger.b.a(e.d, "encrypt > callback : get encrypt success");
                    } else {
                        com.dianping.nvtunnelkit.logger.b.a(e.d, "encrypt > callback : get encrypt failure");
                    }
                }

                @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager.OnSocketSecureManagerEventLisenter
                public final void onSignB2KeyEvent(boolean z, String str, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84abfce7d126b883be57084da939a186", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84abfce7d126b883be57084da939a186");
                    } else {
                        com.dianping.nvnetwork.g.d().pv3(0L, "tunnel_encrypt_sign_kit", 0, 1, z ? 200 : -147, 0, 0, i, str);
                    }
                }
            });
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.a
    public final List<SocketAddress> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e474313b536374ff7e5cf85ce65364d", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e474313b536374ff7e5cf85ce65364d");
        }
        if (this.c == null || this.c.j()) {
            return null;
        }
        return g.a(this.f.a(g()));
    }

    @Override // com.dianping.nvtunnelkit.kit.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a7540f5902922867c1733558d98cec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a7540f5902922867c1733558d98cec");
        } else {
            this.f.a(0L);
        }
    }

    @Override // com.dianping.nvlbservice.f.a
    public final void a(boolean z) {
        com.dianping.nvtunnelkit.kit.d l;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdf26308947c6186216b53a54a80f9eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdf26308947c6186216b53a54a80f9eb");
        } else if (h.a() || (l = this.c.l()) == null) {
        } else {
            l.a(g.a(this.f.a(g())));
        }
    }

    private m g() {
        return this.j == c.QUIC ? m.QUIC : m.SHARK;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b {
        public static ChangeQuickRedirect a;
        public final long b;
        public final Request c;
        public final v d;
        public final j<? super q> e;

        public b(v vVar, Request request, j<? super q> jVar, long j) {
            Object[] objArr = {e.this, vVar, request, jVar, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b5be99c68cdcfdc8cc97ea225ac0b3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b5be99c68cdcfdc8cc97ea225ac0b3");
                return;
            }
            this.d = vVar;
            this.c = request;
            this.e = jVar;
            this.b = j;
        }

        public final void a(x xVar, com.dianping.nvtunnelkit.exception.d dVar) {
            Object[] objArr = {xVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b46df50041ea969fb8f9d262a097a15", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b46df50041ea969fb8f9d262a097a15");
            } else if (dVar != null) {
                e.this.e.remove(this.d);
                if (this.e == null || this.e.isUnsubscribed()) {
                    return;
                }
                q a2 = g.a(dVar, this.c);
                com.dianping.nvnetwork.c.a(xVar.e.c).b(System.nanoTime());
                this.e.onNext(a2);
                this.e.onCompleted();
            } else if (!xVar.f.i) {
                e.this.e.remove(this.d);
                if (this.e == null || this.e.isUnsubscribed()) {
                    return;
                }
                q a3 = g.a(xVar);
                com.dianping.nvnetwork.c.a(xVar.e.c).b(System.nanoTime());
                this.e.onNext(a3);
                this.e.onCompleted();
            } else {
                if (xVar.f.j == a.MINUS_5.c) {
                    try {
                        v vVar = xVar.e;
                        if (vVar != null) {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry<String, String> entry : vVar.d.entrySet()) {
                                jSONObject.put(entry.getKey(), entry.getValue());
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bytes = jSONObject.toString().getBytes();
                            byte[] bArr = vVar.e;
                            byteArrayOutputStream.write(bytes);
                            if (bArr != null) {
                                byteArrayOutputStream.write(bArr);
                            }
                            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                            com.dianping.networklog.c.a(vVar.c + CommonConstant.Symbol.COLON + encodeToString, 4);
                        }
                    } catch (IOException | JSONException unused) {
                    }
                }
                if (this.e == null || this.e.isUnsubscribed()) {
                    return;
                }
                this.e.onNext(g.a(xVar));
            }
        }

        public final void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c762961bdcc466a8044740fd1e3299e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c762961bdcc466a8044740fd1e3299e");
                return;
            }
            e.this.c.cancel(this.d);
            if (this.e != null) {
                this.e.unsubscribe();
            }
            e.this.e.remove(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        MINUS_5(-5);
        
        public static ChangeQuickRedirect a;
        final int c;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e12f6912fae3b56f9069b8a8b5e21ea3", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e12f6912fae3b56f9069b8a8b5e21ea3") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5adeff652b97f61037b3be5f36860265", 6917529027641081856L) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5adeff652b97f61037b3be5f36860265") : (a[]) values().clone();
        }

        a(int i) {
            Object[] objArr = {r10, 0, -5};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4d71d5f6073ea6ffa3bd9879467bc5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4d71d5f6073ea6ffa3bd9879467bc5");
            } else {
                this.c = -5;
            }
        }
    }
}
