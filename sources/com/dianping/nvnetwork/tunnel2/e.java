package com.dianping.nvnetwork.tunnel2;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.nvnetwork.h;
import com.dianping.nvnetwork.mol.RPCTask;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager;
import com.dianping.nvnetwork.util.l;
import com.dianping.nvnetwork.util.m;
import com.dianping.nvnetwork.util.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class e implements h.a {
    public static ChangeQuickRedirect a;
    public final ConcurrentHashMap<String, b> b;
    protected final BlockingQueue<b> c;
    Thread d;
    Runnable e;
    protected SocketSecureManager f;
    protected c g;
    protected i h;
    Runnable i;
    final List<b> j;

    public abstract b a(com.dianping.nvnetwork.tunnel.c cVar, Object obj);

    public void a(b bVar) {
    }

    public abstract void a(Runnable runnable);

    public abstract void a(Runnable runnable, long j);

    public abstract void b(b bVar);

    public void b(String str) {
    }

    public boolean e() {
        return false;
    }

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c13a6592b35f8c377537f75d1af8de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c13a6592b35f8c377537f75d1af8de");
            return;
        }
        this.b = new ConcurrentHashMap<>();
        this.c = new LinkedBlockingQueue(30);
        this.i = null;
        this.j = new ArrayList();
        this.f = SocketSecureManager.newInstance();
        this.g = new c(context, this);
        if (!com.dianping.nvnetwork.h.h().R) {
            this.f.setCacheSecureInfo(new com.dianping.nvnetwork.tunnel.Encrypt.a(context.getApplicationContext()));
        }
        this.h = new i(this, this.g);
        com.dianping.nvnetwork.h.h().a(this);
        l.a().a(Message.class).e().a(rx.schedulers.a.d()).a(new rx.functions.b<Message>() { // from class: com.dianping.nvnetwork.tunnel2.e.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Message message) {
                Message message2 = message;
                Object[] objArr2 = {message2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8481bc58711b7ef1ede96d9bfa06b9a7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8481bc58711b7ef1ede96d9bfa06b9a7");
                } else if (message2.what == 30000) {
                    com.dianping.nvnetwork.util.g.c(">>>> notify disconnect.");
                    e.this.g.a(false);
                    e.this.a();
                } else if (message2.what == 30001) {
                    com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_TUNNEL_STATUS_CHANGE, Boolean.valueOf(true ^ e.this.g.b.isEmpty()));
                    synchronized (e.this.g.b) {
                        for (h hVar : e.this.g.b) {
                            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_ADDED, hVar.r());
                        }
                    }
                } else if (message2.what == 30002) {
                    e.this.g.a(false);
                } else if (message2.what == 30003) {
                    e.this.g.a();
                }
            }
        }, new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.tunnel2.e.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Throwable th) {
                Throwable th2 = th;
                Object[] objArr2 = {th2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "093c90227f0f0745793e4e8aca988f09", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "093c90227f0f0745793e4e8aca988f09");
                } else {
                    th2.printStackTrace();
                }
            }
        });
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ccf4a8cc654f344939c7d98dc056e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ccf4a8cc654f344939c7d98dc056e4");
        } else {
            this.g.a();
        }
    }

    public void a(com.dianping.nvnetwork.tunnel.c cVar, int i, Object obj) {
        Object[] objArr = {cVar, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17a8e81bb688abf0ac0adfdfdbfb22a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17a8e81bb688abf0ac0adfdfdbfb22a1");
            return;
        }
        if (cVar.a == null) {
            cVar.a = com.dianping.nvnetwork.tunnel.e.a();
        }
        if (cVar.j == null) {
            cVar.j = m.a().b();
        }
        b a2 = a(cVar, obj);
        a2.f = i;
        this.b.put(cVar.a, a2);
        a(a2, 0L);
    }

    public final void a(com.dianping.nvnetwork.tunnel.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f24adbb87794e705d7e56983e86e438", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f24adbb87794e705d7e56983e86e438");
            return;
        }
        com.dianping.nvnetwork.c.a(dVar.a).a(this.g.b);
        b bVar = this.b.get(dVar.a);
        if (bVar != null) {
            bVar.d = dVar;
            c(bVar);
        }
    }

    public final void a(h hVar, int i) {
        Object[] objArr = {hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53f41300abf73c02314e00646e06ae3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53f41300abf73c02314e00646e06ae3");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            arrayList.add(entry.getValue());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.c == hVar && bVar == this.b.get(bVar.b.a)) {
                if (bVar.d == null) {
                    com.dianping.nvnetwork.tunnel.d dVar = new com.dianping.nvnetwork.tunnel.d();
                    dVar.a = bVar.b.a;
                    dVar.b = i;
                    bVar.d = dVar;
                }
                c(bVar);
            }
        }
        this.g.a(hVar);
    }

    public final void a(h hVar, int i, String str) {
        Object[] objArr = {hVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c80bb9a708c17f74be63fd78ff889b16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c80bb9a708c17f74be63fd78ff889b16");
            return;
        }
        b bVar = null;
        if (!TextUtils.isEmpty(str) && (bVar = this.b.get(str)) != null) {
            if (bVar.i != null) {
                a(bVar.i);
            }
            hVar.o();
        }
        com.dianping.nvnetwork.c.a(str).c(i);
        if (bVar != null && bVar.b != null) {
            RPCTask.ackReq(bVar.b.j);
        }
        if (i == 1) {
            if (bVar != null) {
                a(bVar);
                com.dianping.nvnetwork.c.a(str).a(true);
            }
        } else if (i < 0) {
            int i2 = i - 190;
            com.dianping.nvnetwork.c.a(str).a(false);
            if (bVar != null) {
                com.dianping.nvnetwork.tunnel.c cVar = bVar.b;
                if (cVar != null) {
                    if (com.dianping.nvnetwork.g.d() != null) {
                        com.dianping.nvnetwork.g.d().pv4(0L, "tunnel_response_parse_failed", 1, 2, i2, 0, 0, 0, null, cVar.c);
                        com.dianping.nvnetwork.g.e().a("code", String.valueOf(i)).a("SHARK_ACK_REPORT", new ArrayList(Collections.nCopies(1, Float.valueOf(1.0f)))).a();
                    }
                    if (i == -5) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bytes = cVar.d.toString().getBytes();
                            byte[] bArr = cVar.f;
                            byteArrayOutputStream.write(bytes);
                            if (bArr != null) {
                                byteArrayOutputStream.write(bArr);
                            }
                            com.dianping.networklog.c.a(str + CommonConstant.Symbol.COLON + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0), 0, 4);
                        } catch (IOException unused) {
                        }
                    }
                }
                if (i > -200 && i <= -100 && this.g.b.contains(hVar)) {
                    this.h.a(hVar, this);
                    if (com.dianping.nvnetwork.g.d() != null) {
                        try {
                            String hostAddress = hVar.getSecureSocketAddress() != null ? hVar.getSecureSocketAddress().getHostAddress() : "";
                            com.dianping.nvnetwork.g.d().pv3(0L, "ack_unsent", com.dianping.nvnetwork.g.f().b(), 1, com.dianping.nvnetwork.tunnel.e.a(hostAddress), 0, 0, 200, hostAddress, 1);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else if (((i <= -300 || i > -200) && i != -1) || !this.g.b.contains(hVar)) {
                } else {
                    com.dianping.nvnetwork.h.h().b(true);
                }
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "487be94baeb7a3eabc6dcbfe8280a6da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "487be94baeb7a3eabc6dcbfe8280a6da");
            return;
        }
        synchronized (this.j) {
            if (this.i != null) {
                a(this.i);
                this.i = null;
            }
            com.dianping.nvnetwork.util.g.a("encrypt success and add session to send queue." + this.j.size());
            for (b bVar : this.j) {
                try {
                    this.c.add(bVar);
                } catch (Exception unused) {
                    b("encrypt > sendqueue beyond limit");
                    com.dianping.nvnetwork.tunnel.d dVar = new com.dianping.nvnetwork.tunnel.d();
                    dVar.a = bVar.b.a;
                    dVar.b = -155;
                    bVar.d = dVar;
                    c(bVar);
                }
            }
            this.j.clear();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa8ae12d648c3390857fb8c61ad539af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa8ae12d648c3390857fb8c61ad539af");
            return;
        }
        b remove = this.b.remove(str);
        if (remove != null) {
            this.c.remove(remove);
            a((Runnable) remove);
            if (remove.i != null) {
                a(remove.i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d8d237657842de2d805a0c23c62d77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d8d237657842de2d805a0c23c62d77");
            return;
        }
        this.b.remove(bVar.b.a);
        this.c.remove(bVar);
        a((Runnable) bVar);
        if (bVar.i != null) {
            a(bVar.i);
        }
        b(bVar);
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "002a8469287363f7a5dc55038c132bf7", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "002a8469287363f7a5dc55038c132bf7")).intValue() : com.dianping.nvnetwork.h.h().c();
    }

    public final long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69b79699d0bbbf37479d901234b8876", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69b79699d0bbbf37479d901234b8876")).longValue() : System.nanoTime() / 1000000;
    }

    public final b c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25cfc3c54f4f2e8d27cd149fa2bdf94e", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25cfc3c54f4f2e8d27cd149fa2bdf94e") : this.b.get(str);
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2f9b71df4fdf6abc038abd48676d21d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2f9b71df4fdf6abc038abd48676d21d")).intValue();
        }
        if (this.g.b.isEmpty()) {
            return XPlayerConstants.MEDIA_ERROR_IJK_PLAYER;
        }
        return 10000;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect a;
        public com.dianping.nvnetwork.tunnel.c b;
        public h c;
        public com.dianping.nvnetwork.tunnel.d d;
        public long e;
        public long f;
        public int g;
        public String h;
        public Runnable i;

        public b() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1286617b4835544e851ff4200da85264", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1286617b4835544e851ff4200da85264");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2413e06b4e3a8bd28620bf0b5f622dc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2413e06b4e3a8bd28620bf0b5f622dc");
            } else if (this.e == 0) {
                this.e = e.this.d();
                if (this.f > 0) {
                    e.this.a(this, this.f);
                }
                try {
                    RPCTask.startSession(this.b.j);
                    e.this.c.add(this);
                    synchronized (e.this) {
                        if (e.this.d == null) {
                            e.this.d = new a();
                            e.this.d.start();
                        }
                    }
                } catch (Exception unused) {
                    e.this.b("encrypt > sendqueue beyond limit");
                    com.dianping.nvnetwork.tunnel.d dVar = new com.dianping.nvnetwork.tunnel.d();
                    dVar.a = this.b.a;
                    dVar.b = -155;
                    this.d = dVar;
                    e.this.c(this);
                }
            } else if (this.f <= 0 || this.d != null || e.this.b.get(this.b.a) != this || (e.this.d() - this.e) + 1 < this.f) {
            } else {
                this.d = new com.dianping.nvnetwork.tunnel.d();
                this.d.a = this.b.a;
                this.d.b = -151;
                e.this.c(this);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a extends Thread {
        public static ChangeQuickRedirect a;
        private long c;

        public a() {
            super("tunnel_send");
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43212349991640dfffc1020bebb46498", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43212349991640dfffc1020bebb46498");
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            boolean z;
            boolean z2;
            boolean z3;
            h hVar;
            h hVar2;
            boolean z4;
            e eVar;
            Object[] objArr;
            ChangeQuickRedirect changeQuickRedirect;
            Runnable runnable;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97464d0cf12333bbe494df968f06a874", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97464d0cf12333bbe494df968f06a874");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eb9570a8f632ecb87f2eef3cc0319d43", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eb9570a8f632ecb87f2eef3cc0319d43");
                return;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                try {
                    final b take = e.this.c.take();
                    long j = com.dianping.nvnetwork.h.h().v <= 0 ? 1L : com.dianping.nvnetwork.h.h().v;
                    e.this.g.a();
                    synchronized (e.this.g.b) {
                        arrayList.clear();
                        if (!e.this.g.b.isEmpty() || this.c + 700 >= e.this.d()) {
                            z = false;
                        } else {
                            try {
                                e.this.g.b.wait(j);
                            } catch (InterruptedException unused) {
                            }
                            z = true;
                        }
                        this.c = e.this.d();
                    }
                    if (e.this.g.b.isEmpty()) {
                        z2 = false;
                        z3 = false;
                    } else if (n.a(take.b.c) && !e.this.f.isEncrypted()) {
                        synchronized (e.this.j) {
                            if (com.dianping.nvnetwork.h.h().u) {
                                com.dianping.nvnetwork.tunnel.d dVar = new com.dianping.nvnetwork.tunnel.d();
                                dVar.a = take.b.a;
                                dVar.b = -146;
                                e.this.a(dVar);
                            } else {
                                com.dianping.nvnetwork.util.g.a("add session to wait encrypt list.");
                                e.this.j.add(take);
                                if (e.this.i == null) {
                                    e.this.i = new Runnable() { // from class: com.dianping.nvnetwork.tunnel2.e.a.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr4 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "799659dab69b22da5236c82448f43b6e", 6917529027641081856L)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "799659dab69b22da5236c82448f43b6e");
                                                return;
                                            }
                                            com.dianping.nvnetwork.util.g.a("wait encrypt timeout.");
                                            synchronized (e.this.j) {
                                                for (b bVar : e.this.j) {
                                                    com.dianping.nvnetwork.tunnel.d dVar2 = new com.dianping.nvnetwork.tunnel.d();
                                                    dVar2.a = bVar.b.a;
                                                    dVar2.b = -157;
                                                    e.this.a(dVar2);
                                                }
                                                e.this.j.clear();
                                                e.this.i = null;
                                            }
                                        }
                                    };
                                    e.this.a(e.this.i, com.dianping.nvnetwork.h.h().w);
                                }
                            }
                        }
                    } else {
                        e.this.g.a(arrayList);
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        z2 = false;
                        z3 = false;
                        while (it.hasNext()) {
                            h hVar3 = (h) it.next();
                            if (z3) {
                                hVar = hVar3;
                            } else {
                                try {
                                } catch (Exception e) {
                                    e = e;
                                    hVar2 = hVar3;
                                    z4 = z3;
                                }
                                if (e.this.a(take, hVar3)) {
                                    hVar3.a(take.b);
                                    try {
                                        take.c = hVar3;
                                        eVar = e.this;
                                        objArr = new Object[0];
                                        changeQuickRedirect = b.a;
                                        hVar2 = hVar3;
                                    } catch (Exception e2) {
                                        e = e2;
                                        hVar2 = hVar3;
                                    }
                                    try {
                                        if (PatchProxy.isSupport(objArr, take, changeQuickRedirect, false, "e1266e346ec39b39c467ef7e518d4621", 6917529027641081856L)) {
                                            runnable = (Runnable) PatchProxy.accessDispatch(objArr, take, changeQuickRedirect, false, "e1266e346ec39b39c467ef7e518d4621");
                                        } else {
                                            if (take.i == null) {
                                                take.i = new Runnable() { // from class: com.dianping.nvnetwork.tunnel2.e.b.1
                                                    public static ChangeQuickRedirect a;

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Object[] objArr4 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1ba964dfc3baece1a87b6e233cfde252", 6917529027641081856L)) {
                                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1ba964dfc3baece1a87b6e233cfde252");
                                                        } else if (b.this.c != null) {
                                                            if (b.this.b != null) {
                                                                RPCTask.ackReqTimeout(b.this.b.j);
                                                            }
                                                            StringBuilder sb2 = new StringBuilder("ack timeout");
                                                            h hVar4 = b.this.c;
                                                            Object[] objArr5 = new Object[0];
                                                            ChangeQuickRedirect changeQuickRedirect5 = h.f;
                                                            sb2.append(PatchProxy.isSupport(objArr5, hVar4, changeQuickRedirect5, false, "f4485e4557e1b9c0a145e72566467d91", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr5, hVar4, changeQuickRedirect5, false, "f4485e4557e1b9c0a145e72566467d91")).intValue() : hVar4.g.incrementAndGet());
                                                            com.dianping.nvnetwork.util.g.a(sb2.toString());
                                                            h hVar5 = b.this.c;
                                                            Object[] objArr6 = new Object[0];
                                                            ChangeQuickRedirect changeQuickRedirect6 = h.f;
                                                            if ((PatchProxy.isSupport(objArr6, hVar5, changeQuickRedirect6, false, "d0e5ba8c9edb3e13cf368e451c4c4f98", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr6, hVar5, changeQuickRedirect6, false, "d0e5ba8c9edb3e13cf368e451c4c4f98")).intValue() : hVar5.g.get()) < com.dianping.nvnetwork.h.h().D || !e.this.g.b.contains(b.this.c)) {
                                                                return;
                                                            }
                                                            e.this.h.a(b.this.c, e.this);
                                                            if (com.dianping.nvnetwork.g.d() != null) {
                                                                try {
                                                                    String hostAddress = b.this.c.getSecureSocketAddress() != null ? b.this.c.getSecureSocketAddress().getHostAddress() : "";
                                                                    com.dianping.nvnetwork.g.d().pv3(0L, "ack_timeout", com.dianping.nvnetwork.g.f().b(), 1, com.dianping.nvnetwork.tunnel.e.a(hostAddress), 0, 0, 200, hostAddress, 1);
                                                                } catch (Exception e3) {
                                                                    e3.printStackTrace();
                                                                }
                                                            }
                                                            b.this.c.o();
                                                        }
                                                    }
                                                };
                                            }
                                            runnable = take.i;
                                        }
                                        eVar.a(runnable, com.dianping.nvnetwork.h.h().d());
                                        hVar = hVar2;
                                        z2 = false;
                                        z3 = true;
                                    } catch (Exception e3) {
                                        e = e3;
                                        z4 = true;
                                        if (e.this.e()) {
                                            e eVar2 = e.this;
                                            StringBuilder sb2 = new StringBuilder("send error in ");
                                            hVar = hVar2;
                                            sb2.append(hVar);
                                            sb2.append(StringUtil.SPACE);
                                            sb2.append(e.getClass());
                                            sb2.append(StringUtil.SPACE);
                                            sb2.append(e.getMessage());
                                            eVar2.b(sb2.toString());
                                        } else {
                                            hVar = hVar2;
                                        }
                                        hVar.a();
                                        e.this.a();
                                        z3 = z4;
                                        z2 = true;
                                        sb.append(hVar.c);
                                        sb.append(CommonConstant.Symbol.COLON);
                                        sb.append(hVar.h);
                                        sb.append(";");
                                    }
                                }
                            }
                            sb.append(hVar.c);
                            sb.append(CommonConstant.Symbol.COLON);
                            sb.append(hVar.h);
                            sb.append(";");
                        }
                        take.h = sb.toString();
                    }
                    int i = z ? -157 : -150;
                    if (!z3) {
                        com.dianping.nvnetwork.tunnel.d dVar2 = new com.dianping.nvnetwork.tunnel.d();
                        dVar2.a = take.b.a;
                        if (z2) {
                            i = -154;
                        }
                        dVar2.b = i;
                        e.this.a(dVar2);
                    }
                } catch (InterruptedException unused2) {
                    synchronized (e.this) {
                        if (e.this.d == this) {
                            e.this.d = null;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // com.dianping.nvnetwork.h.a
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de116e66308d99c24565eb325c0eccbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de116e66308d99c24565eb325c0eccbe");
        } else if (z) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20d567e3dfc4bdd54913650e9ca455d5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20d567e3dfc4bdd54913650e9ca455d5");
            } else if (this.e == null && !this.g.b.isEmpty()) {
                this.e = new Runnable() { // from class: com.dianping.nvnetwork.tunnel2.e.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ed3d4372aed4e9c4470a7d71003497a8", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ed3d4372aed4e9c4470a7d71003497a8");
                            return;
                        }
                        com.dianping.nvnetwork.util.g.c("start soft close shark connection.");
                        e.this.g.a(false);
                        e.this.e = null;
                    }
                };
                a(this.e, c());
            }
            if (this.h != null) {
                final i iVar = this.h;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = i.a;
                if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "bb0324600146d848c78a055ac719d691", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "bb0324600146d848c78a055ac719d691");
                    return;
                }
                if (iVar.i != null && !iVar.i.isUnsubscribed()) {
                    iVar.i.unsubscribe();
                }
                iVar.i = rx.d.a(new com.dianping.nvnetwork.l(), rx.d.b().b(com.dianping.nvnetwork.h.h().c(), TimeUnit.SECONDS, i.f).a(new rx.functions.a() { // from class: com.dianping.nvnetwork.tunnel2.i.2
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "65d979af870167475b064c8938cb7e83", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "65d979af870167475b064c8938cb7e83");
                        } else {
                            i.c(iVar);
                        }
                    }
                }).b(i.f).a(i.f));
            }
        } else {
            if (this.e != null) {
                a(this.e);
                this.e = null;
            }
            if (this.h != null) {
                i iVar2 = this.h;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = i.a;
                if (PatchProxy.isSupport(objArr4, iVar2, changeQuickRedirect4, false, "9583a53b94710f2cc62846d3edc11ffd", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, iVar2, changeQuickRedirect4, false, "9583a53b94710f2cc62846d3edc11ffd");
                } else if (iVar2.i != null) {
                    iVar2.i.unsubscribe();
                }
            }
            a();
        }
    }

    boolean a(b bVar, h hVar) {
        StringBuilder sb;
        Object[] objArr = {bVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1ec24dc5997cfc080d873c36d640eb9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1ec24dc5997cfc080d873c36d640eb9")).booleanValue();
        }
        if ((hVar.c instanceof InetSocketAddress) && (((InetSocketAddress) hVar.c).getAddress() instanceof Inet6Address)) {
            Set<String> set = com.dianping.nvnetwork.h.h().j;
            if (set == null || set.size() <= 0) {
                return false;
            }
            if (set.contains("*")) {
                return true;
            }
            try {
                URL url = new URL(bVar.b.c);
                sb = new StringBuilder();
                sb.append(url.getHost());
                sb.append(url.getPath());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return set.contains(sb.toString());
        }
        return true;
    }
}
