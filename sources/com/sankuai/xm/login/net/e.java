package com.sankuai.xm.login.net;

import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.login.net.d;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e extends d {
    public static ChangeQuickRedirect e = null;
    private static int m = 2097152;
    private static int n = 65536;
    protected SocketChannel f;
    protected String g;
    protected int h;
    protected c i;
    protected com.sankuai.xm.login.net.mempool.heap.b j;
    protected com.sankuai.xm.login.net.mempool.heap.b k;
    protected com.sankuai.xm.login.net.mempool.base.h<ByteBuffer> l;
    private int o;
    private int p;
    private long q;
    private ConcurrentLinkedQueue<d.a> r;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements com.sankuai.xm.login.net.mempool.base.h<ByteBuffer> {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7696c6a9dacef5e717803e9fab64b78", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7696c6a9dacef5e717803e9fab64b78");
            }
        }

        @Override // com.sankuai.xm.login.net.mempool.base.h
        public final /* synthetic */ int a(ByteBuffer byteBuffer) throws IOException {
            ByteBuffer byteBuffer2 = byteBuffer;
            Object[] objArr = {byteBuffer2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d873a4e30bf56d0be545679c60e1aea6", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d873a4e30bf56d0be545679c60e1aea6")).intValue();
            }
            if (e.this.f == null) {
                return 0;
            }
            return e.this.f.read(byteBuffer2);
        }

        @Override // com.sankuai.xm.login.net.mempool.base.h
        public final /* synthetic */ int b(ByteBuffer byteBuffer) throws IOException {
            ByteBuffer byteBuffer2 = byteBuffer;
            Object[] objArr = {byteBuffer2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82a45d3ac942cc4bbd52cd4b3de0f56f", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82a45d3ac942cc4bbd52cd4b3de0f56f")).intValue();
            }
            if (e.this.f == null) {
                return 0;
            }
            return e.this.f.write(byteBuffer2);
        }
    }

    public e(int i, Selector selector, com.sankuai.xm.login.net.a aVar) {
        super(i, selector, aVar);
        Object[] objArr = {Integer.valueOf(i), selector, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68eab3af6b0bf5685b2647e9bf5981c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68eab3af6b0bf5685b2647e9bf5981c0");
            return;
        }
        this.f = null;
        this.q = 0L;
        this.r = new ConcurrentLinkedQueue<>();
        this.j = null;
        this.k = null;
        this.l = null;
        try {
            this.f = SocketChannel.open();
            this.f.configureBlocking(false);
            this.f.socket().setTcpNoDelay(true);
            this.l = new a();
        } catch (Exception e2) {
            com.sankuai.xm.login.d.a(e2, "NetTcpLink::NetTcpLink:: exception: " + e2.getMessage(), new Object[0]);
        }
    }

    @Override // com.sankuai.xm.login.net.d
    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1396979f107d3eb63bc5adfdeff45c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1396979f107d3eb63bc5adfdeff45c");
        } else if (this.f == null) {
            a(true, 16);
        } else {
            if (this.i != null) {
                this.i.a();
            }
            this.q = System.currentTimeMillis();
            this.o = 0;
            this.p = 0;
            this.g = str;
            this.h = i;
            com.sankuai.xm.login.d.b("NetTcpLink::connect:: link id = " + this.b + " mIp=" + this.g);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
            try {
                this.f.register(this.c, 8, this);
                this.f.connect(inetSocketAddress);
            } catch (Exception e2) {
                this.p = (int) (System.currentTimeMillis() - this.q);
                com.sankuai.xm.login.d.a(e2, "NetTcpLink::connect:: exception: " + e2.getMessage() + " e time =" + this.p, new Object[0]);
                a(true, 9);
            }
        }
    }

    @Override // com.sankuai.xm.login.net.d
    public final void a(String str, byte[] bArr, int i, int i2) {
        int i3;
        Object[] objArr = {str, bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13427b14e74e1eca8a7ded21c5d93a31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13427b14e74e1eca8a7ded21c5d93a31");
        } else if (this.f == null || bArr == null || i2 == 0) {
            com.sankuai.xm.login.d.c("NetTcpLink::send:: mChannel == null || buff is empty", new Object[0]);
        } else {
            if (this.i != null) {
                c cVar = this.i;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "3c37f86f8afd928890cfaaaeb244c516", 6917529027641081856L)) {
                    i3 = ((Integer) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "3c37f86f8afd928890cfaaaeb244c516")).intValue();
                } else {
                    if (cVar.b) {
                        long currentTimeMillis = System.currentTimeMillis();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        long longValue = currentTimeMillis - (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "e5375b53ba832ce0040662224ef46e8c", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "e5375b53ba832ce0040662224ef46e8c")).longValue() : cVar.f.getAndSet(cVar.f.get()));
                        if (longValue > cVar.c || longValue < 0) {
                            cVar.a();
                        }
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if ((PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "1a9aea9b6f5fe848d677455307f1d7dd", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "1a9aea9b6f5fe848d677455307f1d7dd")).intValue() : cVar.e.incrementAndGet()) > cVar.d) {
                            i3 = 1;
                        }
                    }
                    i3 = 0;
                }
                if (i3 != 0) {
                    com.sankuai.xm.login.d.d("NetTcpLink::send:: request over limit", new Object[0]);
                    c cVar2 = this.i;
                    Object[] objArr5 = {str, bArr};
                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                    if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "0082c03ac8aa70dd10790443baff56f7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "0082c03ac8aa70dd10790443baff56f7");
                    } else if (cVar2.g.incrementAndGet() < 1000) {
                        com.sankuai.xm.base.proto.protobase.d g = com.sankuai.xm.base.proto.protobase.g.g(bArr);
                        if (g == null) {
                            com.sankuai.xm.login.d.b("LinkSpeedLimitHelper::reportRequestCountOverLimit parse packet fail");
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("type", Integer.valueOf(g.b));
                            hashMap.put("seqId", Integer.valueOf(g.g));
                            hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Integer.valueOf(g.a));
                            hashMap.put("totalsize", Integer.valueOf(cVar2.e.get()));
                            hashMap.put("limit", Integer.valueOf(cVar2.d));
                            hashMap.put("time", Long.valueOf(cVar2.c));
                            hashMap.put("msgcount", Integer.valueOf(cVar2.g.get()));
                            hashMap.put("message", ac.a(str) ? "" : str);
                            m.d().a("rate_limit", hashMap);
                        }
                    }
                    this.d.a(this.b, str, bArr, i, i2);
                    return;
                }
            }
            if (!this.f.isConnected()) {
                com.sankuai.xm.login.d.d("NetTcpLink::send not connected", new Object[0]);
            }
            com.sankuai.xm.login.d.b("NetTcpLink::send => link id = " + this.b + ", len = " + i2);
            try {
                if (this.j == null) {
                    this.j = com.sankuai.xm.login.net.mempool.heap.c.a().a(262144);
                    this.j.o();
                    this.j.b(0);
                    this.j.a(ByteOrder.LITTLE_ENDIAN);
                }
                this.r.add(new d.a(str, bArr, i, i2));
                this.f.register(this.c, 5, this);
            } catch (Exception e2) {
                com.sankuai.xm.login.d.a(e2, "NetTcpLink::send:: exception: " + e2.getMessage(), new Object[0]);
                a(true, 10);
            }
        }
    }

    @Override // com.sankuai.xm.login.net.d
    public final void a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3549e723a8eb23cd75638f76971f1b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3549e723a8eb23cd75638f76971f1b9");
            return;
        }
        com.sankuai.xm.login.d.b("NetTcpLink::close:: link id = " + this.b + ", callback = " + z);
        try {
            if (this.f != null && this.f.isOpen()) {
                this.f.register(this.c, 0, null);
                this.f.close();
            }
        } catch (Exception e2) {
            com.sankuai.xm.login.d.a(e2, "NetTcpLink::close:: exception: " + e2.getMessage(), new Object[0]);
        }
        if (z) {
            this.d.a(this.b, i, this.p);
        }
        if (this.j != null) {
            this.j.p();
        }
        if (this.k != null) {
            this.k.p();
        }
    }

    @Override // com.sankuai.xm.login.net.d
    public void cancel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe50fce86a729269682b0be0a1bab682", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe50fce86a729269682b0be0a1bab682");
            return;
        }
        super.cancel(str);
        com.sankuai.xm.login.d.b("NetTcpLink::cancel:: id = " + str);
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4fe339fed2dd28978b6e0774fe9e2cb", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4fe339fed2dd28978b6e0774fe9e2cb")).booleanValue();
        }
        if (this.f.isConnectionPending()) {
            try {
                if (!this.f.finishConnect()) {
                    com.sankuai.xm.login.d.b("NetTcpLink::finishConnect:: NOT connected. link id=" + this.b);
                }
                return this.f.isConnected();
            } catch (Exception e2) {
                this.p = (int) (System.currentTimeMillis() - this.q);
                com.sankuai.xm.login.d.a(e2, "NetTcpLink::finishConnect:: exception: " + e2.getMessage(), new Object[0]);
                a(true, 9);
            }
        } else {
            com.sankuai.xm.login.d.c("NetTcpLink::finishConnect:: 不在连接状态. link id=" + this.b, new Object[0]);
        }
        return false;
    }

    @Override // com.sankuai.xm.login.net.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980b58e7b6c27d9fd9b6cab2ea3a8917", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980b58e7b6c27d9fd9b6cab2ea3a8917");
        } else if (!this.f.isConnected()) {
            com.sankuai.xm.login.d.c("NetTcpLink::onRead:: mChannel is not connected.", new Object[0]);
        } else {
            try {
                if (this.k == null) {
                    this.k = com.sankuai.xm.login.net.mempool.heap.c.a().a(262144);
                    this.k.o();
                    this.k.a(ByteOrder.LITTLE_ENDIAN);
                }
                this.k.e();
                int b = this.k.b(this.l);
                com.sankuai.xm.login.d.b("NetTcpLink::onRead:: len: " + b + ",read: " + b);
                if (b == -1) {
                    com.sankuai.xm.login.d.c("NetTcpLink::onRead:: len == -1", new Object[0]);
                    a(true, 8);
                    return;
                }
                if (b > 0) {
                    this.k.f();
                    this.d.a(this.b, this.k);
                }
                if (b >= 262144) {
                    this.f.register(this.c, 1, this);
                }
            } catch (Exception e2) {
                com.sankuai.xm.login.d.a(e2, "NetTcpLink::onRead:: exception: " + e2.getMessage(), new Object[0]);
                a(true, 8);
            }
        }
    }

    @Override // com.sankuai.xm.login.net.d
    public final void b() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5be139523c7b25590189cb454dd613f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5be139523c7b25590189cb454dd613f");
        } else if (!this.f.isConnected()) {
            com.sankuai.xm.login.d.c("NetTcpLink::onWrite:: mChannel is not connected.", new Object[0]);
        } else if (this.j == null) {
            com.sankuai.xm.login.d.c("NetTcpLink::onWrite:: mWritePooledBuffer is null.", new Object[0]);
        } else {
            try {
                if (!this.r.isEmpty()) {
                    while (true) {
                        if (this.r.isEmpty()) {
                            break;
                        }
                        d.a peek = this.r.peek();
                        int i = peek.d;
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = e;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca470845077d1546ec74936a9a74174e", 6917529027641081856L)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca470845077d1546ec74936a9a74174e")).booleanValue();
                        } else {
                            int c = this.j.c();
                            int g = this.j.g();
                            int i2 = c + g + i;
                            if (i2 >= this.j.b()) {
                                int b = this.j.b();
                                do {
                                    b += n;
                                } while (i2 >= b);
                                if (b >= 0 && b <= m) {
                                    com.sankuai.xm.login.d.b("NetTcpLink::makeSureSpace 1 link id=" + this.b + " end time " + this.o);
                                    com.sankuai.xm.login.net.mempool.heap.b a2 = com.sankuai.xm.login.net.mempool.heap.c.a().a(b);
                                    a2.o();
                                    a2.a(ByteOrder.LITTLE_ENDIAN);
                                    a2.a(this.j);
                                    a2.a(0);
                                    a2.b(g);
                                    this.j.p();
                                    this.j = a2;
                                }
                                String str = "NetTcpLink::makeSureSpace 1 link id=" + this.b + " newsize = " + b;
                                com.sankuai.xm.login.d.c(str, new Object[0]);
                                com.sankuai.xm.login.manager.channel.e.a(2, str);
                                z = false;
                            }
                            z = true;
                        }
                        if (!z) {
                            com.sankuai.xm.login.d.b("NetTcpLink::onWrite:: mWritePooledBuffer is full.");
                            break;
                        }
                        int c2 = this.j.c();
                        int d = this.j.d();
                        this.j.a(d);
                        this.j.b(d + peek.d);
                        this.j.a(peek.b, peek.c, peek.d);
                        this.j.a(c2);
                        this.r.poll();
                        com.sankuai.xm.login.d.a("NetTcpLink::onWrite:: mSendingQueue poll id = %s, size = %d.", peek.a, Integer.valueOf(peek.d));
                    }
                }
                if (this.j.g() > 0) {
                    com.sankuai.xm.login.d.a("NetTcpLink::onWrite:: onWrite len: %s", Integer.valueOf(this.j.a(this.l)));
                    if (!this.j.h()) {
                        this.j.e();
                        this.j.b(0);
                    } else {
                        com.sankuai.xm.login.d.c("NetTcpLink::onWrite:: has data " + this.j.g(), new Object[0]);
                    }
                }
                if (this.r.isEmpty() && !this.j.h()) {
                    this.f.register(this.c, 1, this);
                    return;
                }
                this.f.register(this.c, 5, this);
            } catch (Exception e2) {
                com.sankuai.xm.login.d.a(e2, "NetTcpLink::onWrite:: exception: " + e2.getMessage(), new Object[0]);
                a(true, 7);
            }
        }
    }

    @Override // com.sankuai.xm.login.net.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56ed2516a4982e67bdde50f2d575f010", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56ed2516a4982e67bdde50f2d575f010");
            return;
        }
        try {
            this.f.register(this.c, 1, this);
        } catch (Exception e2) {
            com.sankuai.xm.login.d.a(e2, "NetTcpLink::onConnected:: exception: " + e2.getMessage(), new Object[0]);
        }
        this.o = (int) (System.currentTimeMillis() - this.q);
        com.sankuai.xm.login.d.b("NetTcpLink::onConnected => link id=" + this.b + " end time " + this.o);
        this.d.c(this.b, this.o);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c9180476e959a84797ac176215a9a96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c9180476e959a84797ac176215a9a96");
            return;
        }
        try {
            b.a().b();
            this.i = new c(b.a().c(), b.a().d(), b.a().e());
        } catch (Exception unused) {
            com.sankuai.xm.login.d.b("NetTcpLink::initLinkLimit => link id=" + this.b);
        }
    }
}
