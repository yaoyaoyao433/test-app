package com.dianping.nvtunnelkit.nio;

import com.dianping.nvtunnelkit.conn.a;
import com.dianping.nvtunnelkit.kit.t;
import com.dianping.nvtunnelkit.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements t, a {
    public static ChangeQuickRedirect a;
    private volatile SocketChannel b;
    private volatile t.a c;
    private com.dianping.nvtunnelkit.conn.a d;

    @Override // com.dianping.nvtunnelkit.kit.t
    public final void a(t.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "877b05133863f30e947f2c51f2ee0d71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "877b05133863f30e947f2c51f2ee0d71");
            return;
        }
        this.c = aVar;
        if (this.c != null) {
            this.d = this.c.b();
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.t
    public final void a(long j, SocketAddress socketAddress) throws IOException {
        SocketChannel socketChannel;
        Object[] objArr = {new Long(j), socketAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2d6c0736fa8b886d119820d6e492c4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2d6c0736fa8b886d119820d6e492c4e");
            return;
        }
        b a2 = b.a(this.d);
        Object[] objArr2 = {socketAddress};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "062fc3784ab72fe6291f65d08ef03a66", RobustBitConfig.DEFAULT_VALUE)) {
            socketChannel = (SocketChannel) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "062fc3784ab72fe6291f65d08ef03a66");
        } else {
            a2.b();
            if (a2.a()) {
                SocketChannel open = SocketChannel.open();
                open.configureBlocking(false);
                open.connect(socketAddress);
                socketChannel = open;
            } else {
                throw new IOException("selector init failed.");
            }
        }
        this.b = socketChannel;
        b.a(this.d).a(this.b, 8, this);
    }

    @Override // com.dianping.nvtunnelkit.kit.t
    public final void a(ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b066d943c6ec08eed1b8c5d6f8fb1706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b066d943c6ec08eed1b8c5d6f8fb1706");
            return;
        }
        if (this.c != null && this.c.b().l && byteBuffer != null && byteBuffer.limit() - byteBuffer.position() > this.c.b().m) {
            do {
                this.b.write(byteBuffer);
            } while (byteBuffer.hasRemaining());
        } else {
            this.b.write(byteBuffer);
        }
        a(false);
        if (byteBuffer != null) {
            e.a(byteBuffer.limit());
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.t
    public final int a(ByteBuffer byteBuffer, int i) throws IOException {
        Object[] objArr = {byteBuffer, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727faa2e774c4db55346775a7a6901ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727faa2e774c4db55346775a7a6901ad")).intValue();
        }
        int read = this.b == null ? -1 : this.b.read(byteBuffer);
        e.b(read);
        return read;
    }

    @Override // com.dianping.nvtunnelkit.kit.t
    public final void a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "401839e30c65f9793cf5c9aee5977a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "401839e30c65f9793cf5c9aee5977a04");
        } else if (this.b != null) {
            this.b.close();
            this.b.socket().close();
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.t
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f347450ee9a92bc78b7d1b9c6b2ef4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f347450ee9a92bc78b7d1b9c6b2ef4")).booleanValue() : this.b != null && this.b.isConnected();
    }

    @Override // com.dianping.nvtunnelkit.kit.t
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6b90510e6ff7b016db9054934e93f26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6b90510e6ff7b016db9054934e93f26");
        } else {
            a(false);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b20415bfebd88c76acdfcec70f7399", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b20415bfebd88c76acdfcec70f7399");
        } else if (z || this.c.b().b != a.b.BLOCKING) {
            try {
                b.a(this.d).a(this.b, 1, this);
            } catch (Throwable th) {
                com.dianping.nvtunnelkit.logger.b.a("NIOSocketImpl", th);
            }
        }
    }

    @Override // com.dianping.nvtunnelkit.nio.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d8a4d96d444b41a0195cfccf953cf6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d8a4d96d444b41a0195cfccf953cf6e");
            return;
        }
        if (this.c.b().b == a.b.BLOCKING) {
            a(true);
        }
        this.c.a();
    }

    @Override // com.dianping.nvtunnelkit.nio.a
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccd30a98d2c5b8c09a79770457a229db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccd30a98d2c5b8c09a79770457a229db");
        } else {
            this.c.a(th);
        }
    }

    @Override // com.dianping.nvtunnelkit.nio.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ed0e93290918c7a27811151f05216f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ed0e93290918c7a27811151f05216f5");
        } else {
            this.c.a(0);
        }
    }

    @Override // com.dianping.nvtunnelkit.nio.a
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed3ccc796c1050d17edf2d70c107ef46", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed3ccc796c1050d17edf2d70c107ef46")).booleanValue() : this.c.b().b == a.b.BLOCKING;
    }
}
