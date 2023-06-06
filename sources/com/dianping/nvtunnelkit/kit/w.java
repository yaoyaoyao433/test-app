package com.dianping.nvtunnelkit.kit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class w extends com.dianping.nvtunnelkit.conn.b<r, q> {
    public static ChangeQuickRedirect x;
    boolean A;
    private final String a;
    private ByteBuffer b;
    private final t c;
    a y;
    s z;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a<C extends w> {
        void a(q qVar, C c, int i);
    }

    public double g() {
        return 1.0d;
    }

    public w(com.dianping.nvtunnelkit.conn.a aVar, SocketAddress socketAddress, t tVar) {
        super(aVar, socketAddress);
        Object[] objArr = {aVar, socketAddress, tVar};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab7cb6e935f008bb236ee5dd566add8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab7cb6e935f008bb236ee5dd566add8");
            return;
        }
        this.b = ByteBuffer.allocate(1024);
        this.A = false;
        if (aVar == null) {
            throw new IllegalArgumentException("connectionConfig cannot be null.");
        }
        this.a = com.dianping.nvtunnelkit.logger.a.a(aVar.n, "TunnelKitConnection");
        this.c = tVar;
    }

    @Override // com.dianping.nvtunnelkit.conn.b
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f501b162731f275cc4b38617bb26bee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f501b162731f275cc4b38617bb26bee");
            return;
        }
        super.a(j);
        try {
            this.c.a(j, this.m);
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.dianping.nvtunnelkit.conn.b, com.dianping.nvtunnelkit.conn.c
    public final void p() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4b1b77e09b4f9e5ab5675187a957c89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4b1b77e09b4f9e5ab5675187a957c89");
            return;
        }
        super.p();
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) 0);
        allocate.flip();
        r b = r.b(allocate);
        b.c = true;
        if (this.z != null && this.A) {
            this.z.a(b, (r) this);
            if (x()) {
                String str = this.a;
                com.dianping.nvtunnelkit.logger.b.b(str, "send ping use data thread, ip: " + this.q);
                return;
            }
            return;
        }
        a(b);
        if (x()) {
            String str2 = this.a;
            com.dianping.nvtunnelkit.logger.b.b(str2, "send ping, ip: " + this.q + " ,this: " + hashCode());
        }
    }

    @Override // com.dianping.nvtunnelkit.conn.c
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36a351df8664141e5fdc294fc3988ece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36a351df8664141e5fdc294fc3988ece");
        } else if (!b()) {
            t();
        } else {
            try {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = x;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ca19de00f87bf0f2c0aec87fc1dc040", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ca19de00f87bf0f2c0aec87fc1dc040");
                } else {
                    this.b.clear();
                    int a2 = this.c.a(this.b, i);
                    String str = this.a;
                    com.dianping.nvtunnelkit.logger.b.a(str, "read => count: " + a2 + ", streamId: " + i);
                    this.b.flip();
                    if (a2 == -1) {
                        t();
                    } else if (a2 > 0) {
                        q qVar = new q();
                        qVar.b = this.b.asReadOnlyBuffer();
                        Object[] objArr3 = {qVar, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = x;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e3c7aac149a7eddd8ec733a56ec04806", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e3c7aac149a7eddd8ec733a56ec04806");
                        } else if (this.y != null) {
                            this.y.a(qVar, this, i);
                        }
                        if (a2 == this.b.capacity() && a2 < 16384) {
                            this.b = ByteBuffer.allocate(a2 << 1);
                            String str2 = this.a;
                            com.dianping.nvtunnelkit.logger.b.a(str2, "read => capacity: " + this.b.capacity());
                        }
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.dianping.nvtunnelkit.conn.b
    public final void a(r rVar) throws IOException {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "609de0eaaff739f30aadd8ad620f37d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "609de0eaaff739f30aadd8ad620f37d6");
        } else if (!b()) {
            String str = this.a;
            com.dianping.nvtunnelkit.logger.b.b(str, "write data socket channel is null do close, connected: " + k());
            t();
        } else {
            String str2 = this.a;
            com.dianping.nvtunnelkit.logger.b.a(str2, "ip:" + this.q + ",write.");
            this.c.a(rVar.a());
            super.a((w) rVar);
        }
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f3093660183eda08b933a016c597d99", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f3093660183eda08b933a016c597d99")).booleanValue() : c() && k() && !l();
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242b1622a3fb89e561ff48463b3f895f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242b1622a3fb89e561ff48463b3f895f")).booleanValue() : this.c.b();
    }

    @Override // com.dianping.nvtunnelkit.conn.b
    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c751b59b60aba14fbe8a79a62393932a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c751b59b60aba14fbe8a79a62393932a");
            return;
        }
        try {
            this.c.a();
        } catch (Throwable th) {
            com.dianping.nvtunnelkit.logger.b.a(this.a, "close -> err. ", th);
        }
        super.u();
    }
}
