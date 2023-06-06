package com.dianping.nvnetwork.tunnel2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.dianping.nvnetwork.tunnel.tool.SecureTools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a implements SocketSecureCell {
    public static ChangeQuickRedirect a;
    private static final ConcurrentLinkedQueue<b> n = new ConcurrentLinkedQueue<>();
    private static volatile ExecutorService q = null;
    protected SocketSecureManager b;
    SocketAddress c;
    long d;
    protected AtomicBoolean e;
    private SocketChannel f;
    private long g;
    private long h;
    private long i;
    private volatile boolean j;
    private volatile boolean k;
    private Runnable l;
    private volatile b m;
    private InterfaceC0102a o;
    private long p;
    private c r;
    private String s;
    private ByteBuffer t;
    private ByteBuffer u;
    private ByteBuffer v;
    private SecureProtocolData w;
    private int x;
    private boolean y;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.nvnetwork.tunnel2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0102a<T extends a> {
        void a(T t, int i);

        void a(T t, int i, Object obj);
    }

    public void a(SecureProtocolData secureProtocolData, long j) throws Exception {
    }

    public abstract void a(Runnable runnable);

    public abstract void a(Runnable runnable, long j);

    public void a(JSONObject jSONObject, @Nullable JSONObject jSONObject2, long j) throws Exception {
    }

    public void b() {
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell
    public void notifyMessage(Message message) {
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell
    public void readSecure(SocketSecureCell socketSecureCell) {
    }

    public static /* synthetic */ void b(a aVar) {
        int i;
        int i2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        try {
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "8dcf70e42a8a4ac6e0a0d33f29c94d19", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "8dcf70e42a8a4ac6e0a0d33f29c94d19");
                return;
            }
            try {
            } catch (Exception unused) {
                com.dianping.nvnetwork.util.g.a("read data thrown exception and start close this connection.");
                aVar.a();
            }
            if (!aVar.j && aVar.isSocketConnected()) {
                if (aVar.u.position() == 0) {
                    aVar.t.clear();
                    i = 0;
                    while (true) {
                        i2 = aVar.f.read(aVar.t);
                        if (i2 <= 0) {
                            break;
                        }
                        aVar.t.flip();
                        int i3 = aVar.t.get() & 255;
                        i += i2;
                        if (i3 == 0) {
                            aVar.f();
                            aVar.t.clear();
                        } else if (i3 == 255) {
                            aVar.t.clear();
                            aVar.y = true;
                        } else {
                            aVar.a();
                            return;
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (aVar.x < 0 && aVar.y) {
                    i2 = aVar.f.read(aVar.u);
                    if (!aVar.u.hasRemaining()) {
                        aVar.u.flip();
                        aVar.w = new SecureProtocolData();
                        aVar.w.version = aVar.u.get();
                        aVar.w.deviceType = aVar.u.get();
                        aVar.w.flag = 255 & aVar.u.get();
                        aVar.w.isSecure = (aVar.u.get() & 1) == 1;
                        aVar.x = aVar.u.getInt();
                        if (aVar.x > 5242880) {
                            com.dianping.nvnetwork.g.d().pv4(0L, "tunnel_receive_data_size_overflow", 0, 2, 200, 0, aVar.x, 0, "", aVar.c.toString());
                            throw new IOException("buffer > 5M");
                        }
                        aVar.v = ByteBuffer.allocate(aVar.x);
                    }
                    i += Math.max(i2, 0);
                }
                int i4 = i;
                if (aVar.x > 0 && aVar.y) {
                    int read = aVar.f.read(aVar.v);
                    if (!aVar.v.hasRemaining()) {
                        aVar.v.flip();
                        int i5 = aVar.v.getShort();
                        if (i5 > 0) {
                            byte[] bArr = new byte[i5];
                            aVar.v.get(bArr, 0, i5);
                            aVar.w.noSecureLength = i5;
                            aVar.w.payload = new String(bArr);
                            if (aVar.w.noSecureLength > 0) {
                                try {
                                    JSONObject jSONObject = new JSONObject(aVar.w.payload);
                                    if (jSONObject.has("z")) {
                                        aVar.w.zip = jSONObject.getInt("z");
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        int i6 = (aVar.x - i5) - 2;
                        if (i6 > 0) {
                            byte[] bArr2 = new byte[i6];
                            aVar.v.get(bArr2, 0, i6);
                            aVar.w.array = bArr2;
                        }
                        SecureProtocolData secureProtocolData = aVar.w;
                        long nanoTime = System.nanoTime();
                        Object[] objArr2 = {secureProtocolData, new Long(nanoTime)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1208a36f8c0b99006119d9b7561be3aa", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1208a36f8c0b99006119d9b7561be3aa");
                        } else {
                            if (secureProtocolData.isSecure) {
                                JSONObject jSONObject2 = new JSONObject(secureProtocolData.payload);
                                if (jSONObject2.has("b") && jSONObject2.has("t")) {
                                    String string = jSONObject2.getString("b");
                                    String string2 = jSONObject2.getString("t");
                                    if (!SecureTools.isEmpty(string) && !SecureTools.isEmpty(string2)) {
                                        String b2keyByB2 = aVar.b.getB2keyByB2(string2, string);
                                        if (!SecureTools.isEmpty(b2keyByB2)) {
                                            secureProtocolData.array = aVar.b.decryptData(secureProtocolData.array, b2keyByB2);
                                        } else {
                                            throw new Exception("encrypt error");
                                        }
                                    }
                                }
                            }
                            if (SecureProtocol.DataPacketType.isSecureProtocol(secureProtocolData.flag)) {
                                secureProtocolData.encryptFlag = secureProtocolData.flag;
                                aVar.b.handlerSecureProtocol(aVar, secureProtocolData);
                            } else if (secureProtocolData.flag == 69) {
                                aVar.b(secureProtocolData, nanoTime);
                            } else {
                                aVar.a(secureProtocolData, nanoTime);
                            }
                        }
                        aVar.u.clear();
                        aVar.v.clear();
                        aVar.v = null;
                        aVar.y = false;
                        aVar.x = -1;
                    }
                    i4 += Math.max(read, 0);
                    i2 = read;
                }
                if (i2 < 0) {
                    com.dianping.nvnetwork.util.g.a("read data return -1 and start close this connection.");
                    aVar.a();
                } else {
                    d.a().a(aVar.f, 1, aVar);
                }
                com.dianping.nvtunnelkit.utils.e.b(i4);
            }
        } finally {
            aVar.d = aVar.l();
        }
    }

    public a(SocketAddress socketAddress) {
        Object[] objArr = {socketAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc7f05c895f5822e9f93c4b4e7b7600d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc7f05c895f5822e9f93c4b4e7b7600d");
            return;
        }
        this.j = false;
        this.k = false;
        this.l = null;
        this.m = null;
        this.p = 0L;
        this.e = new AtomicBoolean(false);
        this.t = ByteBuffer.allocate(1);
        this.u = ByteBuffer.allocate(8);
        this.v = null;
        this.x = -1;
        this.y = false;
        this.c = socketAddress;
        this.b = SocketSecureManager.newInstance();
        this.b.enableSignB2key(com.dianping.nvnetwork.h.h().N);
    }

    public final void a(int i, InterfaceC0102a interfaceC0102a) {
        Object[] objArr = {Integer.valueOf(i), interfaceC0102a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af6412ddb7276813c0f67ddce99750dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af6412ddb7276813c0f67ddce99750dc");
            return;
        }
        this.o = interfaceC0102a;
        this.p = l();
        if (q == null) {
            synchronized (a.class) {
                if (q == null) {
                    q = com.sankuai.android.jarvis.c.a("connect_handler_thread_jarvis", "connect-handler", 60L);
                    a(i);
                }
            }
            return;
        }
        a(i);
    }

    private void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bccb14ad03cccacb846ed6559bac970d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bccb14ad03cccacb846ed6559bac970d");
        } else {
            q.execute(new Runnable() { // from class: com.dianping.nvnetwork.tunnel2.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    SocketChannel socketChannel;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46eaeeb37045b8c6e9fb40365efd8bfd", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46eaeeb37045b8c6e9fb40365efd8bfd");
                        return;
                    }
                    try {
                        a.this.l = new Runnable() { // from class: com.dianping.nvnetwork.tunnel2.a.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d6ddc9b98baf398674640a532a071017", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d6ddc9b98baf398674640a532a071017");
                                } else {
                                    a.this.a("timeout");
                                }
                            }
                        };
                        a.this.a(a.this.l, i);
                        a aVar = a.this;
                        d a2 = d.a();
                        a aVar2 = a.this;
                        Object[] objArr3 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = d.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "48f86aa05f7d514f07ff356f77eed942", 6917529027641081856L)) {
                            socketChannel = (SocketChannel) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "48f86aa05f7d514f07ff356f77eed942");
                        } else {
                            a2.c();
                            if (a2.b()) {
                                SocketChannel open = SocketChannel.open();
                                open.configureBlocking(false);
                                open.connect(aVar2.c);
                                a2.a(open, 8, aVar2);
                                socketChannel = open;
                            } else {
                                throw new IOException("selector init failed.");
                            }
                        }
                        aVar.f = socketChannel;
                    } catch (Exception e) {
                        e.printStackTrace();
                        a.this.a(e);
                    }
                }
            });
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8be9287c7617e3b021800c3d167423ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8be9287c7617e3b021800c3d167423ee");
        } else if (this.j) {
        } else {
            this.j = true;
            if (this.l != null) {
                a(this.l);
                this.l = null;
            }
            try {
                this.b.removeSocketSecureHandler(this);
            } catch (Throwable unused) {
            }
            try {
                this.f.close();
                this.f.socket().close();
            } catch (Throwable unused2) {
            }
            if (this.m != null) {
                b bVar = this.m;
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f79872ff4a01cef6e24aac1ba312f7f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f79872ff4a01cef6e24aac1ba312f7f");
                } else if (bVar != null) {
                    synchronized (bVar.c) {
                        bVar.b = null;
                    }
                    if (n.size() < 3) {
                        n.add(bVar);
                    } else if (bVar.getLooper() != null) {
                        bVar.getLooper().quit();
                    }
                }
                this.m = null;
            }
            b();
        }
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d73fd6bf182031c11108cddb1613b1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d73fd6bf182031c11108cddb1613b1f");
            return;
        }
        a(this.l);
        this.l = null;
        if (this.o != null) {
            this.o.a(this, (int) (l() - this.p), obj);
        }
        if (this.f != null) {
            try {
                this.f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        a(-1L);
    }

    private Handler o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a292b2d37de3818f2844ed0e65c4713e", 6917529027641081856L)) {
            return (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a292b2d37de3818f2844ed0e65c4713e");
        }
        if (this.m == null) {
            synchronized (this) {
                if (this.m == null) {
                    this.m = n.poll();
                    if (this.m == null) {
                        HandlerThread handlerThread = new HandlerThread("process_read_thread");
                        handlerThread.start();
                        this.m = new b(handlerThread.getLooper());
                    }
                    synchronized (this.m.c) {
                        this.m.b = this;
                    }
                }
            }
        }
        return this.m;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f493f434b365b595dd18a7dc7c47b96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f493f434b365b595dd18a7dc7c47b96");
            return;
        }
        a(this.l);
        this.l = null;
        if (!this.k) {
            this.k = true;
        }
        if (this.o != null) {
            this.o.a(this, (int) (l() - this.p));
        }
    }

    public final void d() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8c5ab5c04d56eb500dd7b83dfa106b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8c5ab5c04d56eb500dd7b83dfa106b");
            return;
        }
        this.d = l();
        this.g = l();
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) 0);
        allocate.flip();
        this.f.write(allocate);
        d.a().a(this.f, 1, this);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d3e5ce5eaa9eeffc997247924fa46c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d3e5ce5eaa9eeffc997247924fa46c0");
        } else {
            o().sendEmptyMessage(1);
        }
    }

    public void f() {
        int min;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6090221ce3abe52fa45dcf1cdaae79c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6090221ce3abe52fa45dcf1cdaae79c");
            return;
        }
        this.h = l();
        this.i = this.h - this.g;
        if (this.e.get()) {
            c cVar = this.r;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8074bf561e3fd41f6a81241783e1b972", 6917529027641081856L)) {
                min = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8074bf561e3fd41f6a81241783e1b972")).intValue();
            } else if (this.g == 0) {
                min = Integer.MAX_VALUE;
            } else {
                long j = this.h - this.g;
                if (j < 0) {
                    min = (int) Math.min(2147483647L, Math.max(this.i, l() - this.g));
                } else {
                    min = (int) Math.min(2147483647L, j);
                }
            }
            cVar.a(min);
        }
    }

    private void b(SecureProtocolData secureProtocolData, long j) {
        Object[] objArr = {secureProtocolData, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93f7471a3d54322c6b1295e66cdbf30e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93f7471a3d54322c6b1295e66cdbf30e");
        } else if (SecureTools.isEmpty(secureProtocolData.payload)) {
        } else {
            SecureTools.ParseData parseData = SecureTools.parseData(secureProtocolData.zip, secureProtocolData.array);
            if (SecureTools.isEmpty(parseData.secureLoad)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(parseData.secureLoad);
                JSONObject jSONObject2 = SecureTools.isEmpty(secureProtocolData.payload) ? null : new JSONObject(secureProtocolData.payload);
                if (jSONObject.has("s")) {
                    secureProtocolData.encryptFlag = jSONObject.getInt("s");
                    this.b.handlerSecureProtocol(this, secureProtocolData);
                }
                a(jSONObject, jSONObject2, j);
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized void a(SecureProtocolData secureProtocolData) throws IOException {
        Object[] objArr = {secureProtocolData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e517575cae805941b845b63308a6d16f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e517575cae805941b845b63308a6d16f");
            return;
        }
        ByteBuffer protocolData = this.b.getProtocolData(secureProtocolData);
        this.f.write(protocolData);
        d.a().a(this.f, 1, this);
        this.d = l();
        com.dianping.nvtunnelkit.utils.e.a(protocolData != null ? protocolData.limit() : 0);
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "249e262c1dd75972c4fe5064b510695d", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "249e262c1dd75972c4fe5064b510695d")).booleanValue() : !com.dianping.nvnetwork.h.h().u;
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ee7e87fa33fd3e534398bd43d7bf63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ee7e87fa33fd3e534398bd43d7bf63");
            return;
        }
        this.e.set(true);
        this.r = new c(10);
        try {
            d();
            this.b.addSocketSecureHandler(this);
            if (!this.b.isEncrypted() && g()) {
                this.b.init();
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f33c88a2b988770fc1cba2f0b8ae144f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f33c88a2b988770fc1cba2f0b8ae144f");
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("i", com.dianping.nvnetwork.g.a());
                    jSONObject.put("v", com.dianping.nvnetwork.g.i());
                    jSONObject.put("p", 1);
                    jSONObject.put("u", com.dianping.nvnetwork.g.j());
                    SecureProtocolData secureProtocolData = new SecureProtocolData();
                    secureProtocolData.flag = SecureProtocol.DataPacketType.DISTRIBUTION_REQUEST.getType();
                    secureProtocolData.securePayload = jSONObject.toString().getBytes();
                    a(secureProtocolData);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            a(l() - this.p);
        } catch (IOException e2) {
            e2.printStackTrace();
            a();
        }
    }

    public final int i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92673663bb3eadcaef2b16de48d7c49d", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92673663bb3eadcaef2b16de48d7c49d")).intValue() : this.r.b();
    }

    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4133809fea445bdd1f3a878be36d68d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4133809fea445bdd1f3a878be36d68d")).intValue();
        }
        if ((this.c instanceof InetSocketAddress) && (((InetSocketAddress) this.c).getAddress() instanceof Inet6Address)) {
            if (i() != Integer.MAX_VALUE) {
                return i();
            }
            return i() - com.dianping.nvnetwork.h.h().ad;
        }
        return i();
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "614c4fe46122481a722f75ade8ca3037", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "614c4fe46122481a722f75ade8ca3037")).booleanValue() : this.g > this.h && p() > 0 && l() - this.g > ((long) p());
    }

    public final long l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09aecc7a9e5a006242b203c37cf246dc", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09aecc7a9e5a006242b203c37cf246dc")).longValue() : System.nanoTime() / 1000000;
    }

    private int p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44e9fae2a2905b2a6911ef467d8a2774", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44e9fae2a2905b2a6911ef467d8a2774")).intValue() : com.dianping.nvnetwork.h.h().c();
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell
    public boolean writeSecure(SecureProtocolData secureProtocolData) {
        Object[] objArr = {secureProtocolData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29f5b0cde67b1cfcd9cbc0d465ca33d4", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29f5b0cde67b1cfcd9cbc0d465ca33d4")).booleanValue();
        }
        try {
            a(secureProtocolData);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell
    public boolean isSocketConnected() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c88a6d6b4549cb67d7a8865cf2ee85e7", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c88a6d6b4549cb67d7a8865cf2ee85e7")).booleanValue() : this.f != null && this.f.isConnected();
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell
    public InetAddress getSecureSocketAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf7b551adad5ae913bec15aa53e9047b", 6917529027641081856L)) {
            return (InetAddress) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf7b551adad5ae913bec15aa53e9047b");
        }
        if (this.c instanceof InetSocketAddress) {
            return ((InetSocketAddress) this.c).getAddress();
        }
        return null;
    }

    public final String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcfc9d8929925392ec2c35de0e77527c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcfc9d8929925392ec2c35de0e77527c");
        }
        if (this.s == null) {
            this.s = ((InetSocketAddress) this.c).getAddress().getHostAddress();
        }
        return this.s;
    }

    private void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47a46edaf0aab24f1873740a0b3ca109", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47a46edaf0aab24f1873740a0b3ca109");
        } else if (this.c instanceof InetSocketAddress) {
            try {
                if (com.dianping.nvnetwork.g.d() != null && this.c != null && (this.c instanceof InetSocketAddress)) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) this.c;
                    String hostAddress = inetSocketAddress.getAddress().getHostAddress();
                    if (inetSocketAddress.getAddress() instanceof Inet6Address) {
                        int i = j > 0 ? 200 : -200;
                        com.dianping.monitor.e d = com.dianping.nvnetwork.g.d();
                        d.pv3(0L, "shark/tunnel/connect/ipv6/" + hostAddress, 0, 1, i, com.dianping.nvnetwork.h.h().ad, 0, (int) j, hostAddress, 1);
                    } else {
                        int a2 = com.dianping.nvnetwork.tunnel.e.a(hostAddress);
                        if (j <= 0) {
                            a2 *= -1;
                        }
                        com.dianping.nvnetwork.g.d().pv3(0L, "tunnel_connect", 0, 1, a2, 0, 0, (int) j, hostAddress, 1);
                    }
                }
                if (j > 0) {
                    com.dianping.nvnetwork.util.i.a("connect to:" + this.c.toString() + " success in " + j + "ms.network:" + com.dianping.nvnetwork.g.f().a() + "\n");
                    return;
                }
                com.dianping.nvnetwork.util.i.a("connect to:" + this.c.toString() + " failed.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends Handler {
        public static ChangeQuickRedirect a;
        public a b;
        public final Object c;

        public b(Looper looper) {
            super(looper);
            Object[] objArr = {looper};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b1fd05a01791c91386bc09b8a8960c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b1fd05a01791c91386bc09b8a8960c");
            } else {
                this.c = new Object();
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d8673529f4be2bcde119215137c6bc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d8673529f4be2bcde119215137c6bc");
                return;
            }
            super.handleMessage(message);
            synchronized (this.c) {
                if (message.what == 1 && this.b != null) {
                    a.b(this.b);
                }
            }
        }
    }

    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "453f79c638579c3c32defddbd547d348", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "453f79c638579c3c32defddbd547d348")).booleanValue() : this.e.get();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;
        public LinkedList<Integer> e;

        public c(int i) {
            Object[] objArr = {a.this, 10};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecb35f349ff5ff05b58ed33ae46687cb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecb35f349ff5ff05b58ed33ae46687cb");
                return;
            }
            this.c = 0;
            this.d = 0;
            this.b = 10;
            this.e = new LinkedList<>();
        }

        public final synchronized void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d0d8a7bcbb5bb02068540f1ba6e0bf4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d0d8a7bcbb5bb02068540f1ba6e0bf4");
                return;
            }
            this.d++;
            this.c += i;
            if (this.d > this.b) {
                this.d--;
                this.c -= this.e.removeLast().intValue();
            }
            this.e.addFirst(Integer.valueOf(i));
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f7907717cc2756a1fe561f370331ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f7907717cc2756a1fe561f370331ae");
                return;
            }
            if (this.e != null) {
                this.e.clear();
            }
            this.d = 0;
            this.c = 0;
        }

        public final int b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7511c4a8d27710766a2f9e3c9d48d152", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7511c4a8d27710766a2f9e3c9d48d152")).intValue();
            }
            if (this.d == 0) {
                return 0;
            }
            return this.c / this.d;
        }
    }
}
