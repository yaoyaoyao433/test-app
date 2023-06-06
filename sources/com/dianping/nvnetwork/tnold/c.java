package com.dianping.nvnetwork.tnold;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.dianping.nvnetwork.tnold.a;
import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.dianping.nvnetwork.v;
import com.dianping.nvnetwork.w;
import com.dianping.nvnetwork.y;
import com.dianping.nvtunnelkit.kit.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class c<C extends com.dianping.nvnetwork.tnold.a> extends com.dianping.nvtunnelkit.kit.o<C, v, w, com.dianping.nvbinarytunnel.b, com.dianping.nvtunnelkit.kit.q> {
    public static ChangeQuickRedirect b;
    final y c;
    public final k d;
    public final List<p> e;
    private final com.dianping.nvtunnelkit.kit.e<C> k;
    private final AtomicBoolean l;
    private final AtomicBoolean m;
    private final List<v> n;
    private volatile Runnable o;
    private static final String a = com.dianping.nvtunnelkit.logger.a.a("TNBaseTunnel");
    private static final com.dianping.nvtunnelkit.exception.k f = new com.dianping.nvtunnelkit.exception.k();
    private static final com.dianping.nvtunnelkit.exception.j g = new com.dianping.nvtunnelkit.exception.j();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(k kVar);

        com.dianping.nvnetwork.tnold.secure.d b();
    }

    public static /* synthetic */ Runnable a(c cVar, Runnable runnable) {
        cVar.o = null;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.h
    public /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar) {
        b((c<C>) ((com.dianping.nvnetwork.tnold.a) cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.o
    public /* synthetic */ void a(com.dianping.nvtunnelkit.kit.w wVar) {
        b((c<C>) ((com.dianping.nvnetwork.tnold.a) wVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.h
    public /* synthetic */ void b(com.dianping.nvtunnelkit.conn.c cVar) {
        a((c<C>) ((com.dianping.nvnetwork.tnold.a) cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.o
    public /* synthetic */ void b(com.dianping.nvtunnelkit.kit.w wVar) {
        a((c<C>) ((com.dianping.nvnetwork.tnold.a) wVar));
    }

    public c(Context context, y yVar, com.dianping.nvtunnelkit.kit.v vVar, com.dianping.nvtunnelkit.kit.a aVar) {
        DisplayMetrics displayMetrics;
        Object[] objArr = {context, yVar, vVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0842d7a386ad34815d9647cc942a144f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0842d7a386ad34815d9647cc942a144f");
            return;
        }
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.e = new ArrayList();
        this.n = new LinkedList();
        this.c = yVar;
        this.k = new com.dianping.nvtunnelkit.kit.e<>(context, vVar, aVar);
        com.dianping.nvtunnelkit.kit.e<C> eVar = this.k;
        final o.a<com.dianping.nvbinarytunnel.b, v> aVar2 = new o.a<com.dianping.nvbinarytunnel.b, v>() { // from class: com.dianping.nvnetwork.tnold.c.1
            public static ChangeQuickRedirect a;
            public final ByteBuffer b = ByteBuffer.allocate(1);

            @Override // com.dianping.nvtunnelkit.kit.o.a
            public final /* synthetic */ com.dianping.nvbinarytunnel.b a(v vVar2) {
                Object[] objArr2 = {vVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70dbf41d5b53de67484e68fb8a7101d9", 6917529027641081856L) ? (com.dianping.nvbinarytunnel.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70dbf41d5b53de67484e68fb8a7101d9") : com.dianping.nvbinarytunnel.b.a(this.b);
            }
        };
        Object[] objArr2 = {eVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.nvtunnelkit.kit.o.h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1fae0a33f867812d23e4798c2edcc60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1fae0a33f867812d23e4798c2edcc60");
        } else {
            this.i = eVar;
            this.i.a(this);
            this.i.a(this);
            this.i.a(this);
            this.j = new com.dianping.nvtunnelkit.kit.c<C, S, R, S2, R2>(eVar, this, this) { // from class: com.dianping.nvtunnelkit.kit.o.1
                public static ChangeQuickRedirect h;

                @Override // com.dianping.nvtunnelkit.kit.c
                public final S2 c(S s) {
                    Object[] objArr3 = {s};
                    ChangeQuickRedirect changeQuickRedirect3 = h;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0dce9ec0e3e98239fb00be04dd125b33", RobustBitConfig.DEFAULT_VALUE) ? (S2) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0dce9ec0e3e98239fb00be04dd125b33") : (S2) aVar2.a(s);
                }
            };
            this.j.e = this;
            this.j.d = this;
            this.j.f = this;
        }
        this.d = new k(this, context, yVar.e);
        this.d.a(new SocketSecureManager.OnSocketSecureManagerEventLisenter() { // from class: com.dianping.nvnetwork.tnold.c.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager.OnSocketSecureManagerEventLisenter
            public final void onSignB2KeyEvent(boolean z, String str, int i) {
            }

            @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager.OnSocketSecureManagerEventLisenter
            public final void onCreateB2KeyInfoEvent(boolean z, String str, int i) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "87f882ecebefee42674d6e6dc368e9e9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "87f882ecebefee42674d6e6dc368e9e9");
                    return;
                }
                String str2 = c.a;
                com.dianping.nvtunnelkit.logger.b.b(str2, "onCreateB2KeyInfoEvent > callback, item : " + z);
                c.this.e();
                if (c.this.j() || !z) {
                    return;
                }
                c.this.s_();
            }
        });
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "de58b20b2481e1bd7224b3b71f4879cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "de58b20b2481e1bd7224b3b71f4879cb");
            return;
        }
        String str = Build.MODEL;
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        String str2 = "";
        if (context != null && context.getResources() != null) {
            if (context.getResources().getDisplayMetrics() == null) {
                str2 = "";
            } else {
                str2 = displayMetrics.heightPixels + "*" + displayMetrics.widthPixels;
            }
        }
        k kVar = this.d;
        Object[] objArr4 = {str, valueOf, "android", str2};
        ChangeQuickRedirect changeQuickRedirect4 = k.a;
        if (PatchProxy.isSupport(objArr4, kVar, changeQuickRedirect4, false, "5f01e79e359f695f1d068b178141487d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr4, kVar, changeQuickRedirect4, false, "5f01e79e359f695f1d068b178141487d");
        } else {
            kVar.c.setDeviceInfo(str, valueOf, "android", str2);
        }
    }

    public final void a(v vVar, com.dianping.nvtunnelkit.exception.d dVar) {
        Object[] objArr = {vVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6c554636a90e35c7ab50702c9541683", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6c554636a90e35c7ab50702c9541683");
            return;
        }
        b((c<C>) vVar);
        a((c<C>) vVar, dVar);
    }

    public final void s_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29d69e3845e103da249584c33ae68a76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29d69e3845e103da249584c33ae68a76");
            return;
        }
        synchronized (this.n) {
            if (this.o != null) {
                com.dianping.nvtunnelkit.core.c.a().b(this.o);
                this.o = null;
            }
            String str = a;
            com.dianping.nvtunnelkit.logger.b.a(str, "encrypt success and add session to send queue. size: " + this.n.size());
            for (v vVar : this.n) {
                a_(vVar);
            }
            this.n.clear();
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1047e498313a570a9af733f610498634", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1047e498313a570a9af733f610498634")).booleanValue() : this.l.get();
    }

    public final void a(p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3763112b54d49ac8edcf701f947e2fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3763112b54d49ac8edcf701f947e2fb");
            return;
        }
        synchronized (this.e) {
            this.e.add(pVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.k
    public void cancel(v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad196a7ef9493baf98bba4ba912747cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad196a7ef9493baf98bba4ba912747cc");
            return;
        }
        synchronized (this.n) {
            for (v vVar2 : this.n) {
                if (vVar2.c.equals(vVar.c)) {
                    this.n.remove(vVar2);
                }
            }
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.o
    /* renamed from: a */
    public void a_(v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6df560dd1407f6e9e1ebb45de5269944", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6df560dd1407f6e9e1ebb45de5269944");
            return;
        }
        if (vVar.l) {
            if (t_().i) {
                a(vVar, (com.dianping.nvtunnelkit.exception.d) g);
                return;
            } else if (!this.d.a()) {
                synchronized (this.n) {
                    this.n.add(vVar);
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a21635647c0dc652e68a3c09b0ce1d14", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a21635647c0dc652e68a3c09b0ce1d14");
                    } else {
                        synchronized (this.n) {
                            if (this.o == null) {
                                this.o = new Runnable() { // from class: com.dianping.nvnetwork.tnold.c.3
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80b540b62d12f94146fafbcc245516d4", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80b540b62d12f94146fafbcc245516d4");
                                            return;
                                        }
                                        com.dianping.nvtunnelkit.logger.b.a(c.a, "wait encrypt timeout.");
                                        synchronized (c.this.n) {
                                            for (v vVar2 : c.this.n) {
                                                c.this.a(vVar2, (com.dianping.nvtunnelkit.exception.d) c.f);
                                            }
                                            c.this.n.clear();
                                            c.a(c.this, (Runnable) null);
                                        }
                                    }
                                };
                                com.dianping.nvtunnelkit.core.c.a().a(this.o, t_().d);
                            }
                        }
                    }
                }
                return;
            }
        }
        super.a_((c<C>) vVar);
    }

    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.m
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d627c487fd000fd338cd043e12205369", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d627c487fd000fd338cd043e12205369");
            return;
        }
        this.m.set(z);
        e();
    }

    public void a(final C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3123c058953f5311439139f3cca8b62d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3123c058953f5311439139f3cca8b62d");
            return;
        }
        super.b((c<C>) c);
        final k kVar = this.d;
        Object[] objArr2 = {c};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "0938a56dd2033906bfa8527c036d7d04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "0938a56dd2033906bfa8527c036d7d04");
            return;
        }
        final r rVar = new r(c, kVar);
        kVar.c.addSocketSecureHandler(rVar);
        kVar.d.put(c, rVar);
        com.dianping.nvtunnelkit.core.c.a().a(new Runnable() { // from class: com.dianping.nvnetwork.tnold.k.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                SecureProtocolData secureProtocolData;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d3a5cbf8c3fdcb6f094e3e3b2227644b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d3a5cbf8c3fdcb6f094e3e3b2227644b");
                    return;
                }
                try {
                    c.p();
                    if (k.this.e.t_().i) {
                        com.dianping.nvtunnelkit.logger.b.b(k.b, "tunnel close encrypt.");
                        return;
                    }
                    if (!k.this.c.isEncrypted()) {
                        com.dianping.nvtunnelkit.logger.b.b(k.b, "init secure tunnel.");
                        k.this.c.init();
                    } else {
                        com.dianping.nvtunnelkit.logger.b.b(k.b, "has init the secure tunnel.");
                    }
                    com.dianping.nvnetwork.tnold.secure.d b2 = k.this.f != null ? k.this.f.b() : null;
                    Object[] objArr4 = {b2};
                    ChangeQuickRedirect changeQuickRedirect4 = com.dianping.nvnetwork.tnold.secure.c.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "79b9b63b56ad5364b5141cef3d181a9e", 6917529027641081856L)) {
                        secureProtocolData = (SecureProtocolData) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "79b9b63b56ad5364b5141cef3d181a9e");
                    } else {
                        secureProtocolData = new SecureProtocolData();
                        secureProtocolData.flag = SecureProtocol.DataPacketType.DISTRIBUTION_REQUEST.getType();
                        JSONObject jSONObject = new JSONObject();
                        if (b2 != null) {
                            jSONObject.put("i", b2.a);
                            jSONObject.put("v", b2.b);
                            jSONObject.put("p", 1);
                            jSONObject.put("u", b2.c);
                            secureProtocolData.securePayload = jSONObject.toString().getBytes();
                        }
                    }
                    rVar.writeSecure(secureProtocolData);
                } catch (Throwable th) {
                    com.dianping.nvtunnelkit.logger.b.a(k.b, th);
                    k.this.e.d(c);
                }
            }
        });
    }

    public void b(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "913d003413f0563c724fd2d1393c9575", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "913d003413f0563c724fd2d1393c9575");
            return;
        }
        super.a((c<C>) c);
        k kVar = this.d;
        Object[] objArr2 = {c};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "ca3502ffb8cebc8f79406712330148af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "ca3502ffb8cebc8f79406712330148af");
            return;
        }
        SocketSecureCell remove = kVar.d.remove(c);
        if (remove != null) {
            kVar.c.removeSocketSecureHandler(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd85955f30ac71e9f52a4c9c29845c6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd85955f30ac71e9f52a4c9c29845c6d");
        } else if (this.d.a() && this.m.get()) {
            if (this.l.compareAndSet(false, true)) {
                synchronized (this.e) {
                    if (this.e.size() > 0) {
                        for (p pVar : this.e) {
                            pVar.a();
                        }
                    }
                }
            }
        } else if (this.l.compareAndSet(true, false)) {
            synchronized (this.e) {
                if (this.e.size() > 0) {
                    for (p pVar2 : this.e) {
                        pVar2.b();
                    }
                }
            }
        }
    }
}
