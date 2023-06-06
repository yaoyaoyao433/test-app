package com.dianping.nvnetwork.tnold;

import android.os.Message;
import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r implements SocketSecureCell {
    public static ChangeQuickRedirect a;
    private static final String b = com.dianping.nvtunnelkit.logger.a.a("TNV1SocketSecureCell");
    private final a c;
    private final k d;

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell
    public final void notifyMessage(Message message) {
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell
    public final void readSecure(SocketSecureCell socketSecureCell) {
    }

    public r(a aVar, k kVar) {
        Object[] objArr = {aVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef4780ce3fdb72d95d71fd51999050e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef4780ce3fdb72d95d71fd51999050e8");
            return;
        }
        this.c = aVar;
        this.d = kVar;
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell
    public final boolean writeSecure(SecureProtocolData secureProtocolData) {
        Object[] objArr = {secureProtocolData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49d6785b311c31e499e12263f082eb56", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49d6785b311c31e499e12263f082eb56")).booleanValue();
        }
        com.dianping.nvtunnelkit.logger.b.b(b, "writeSecure...");
        try {
            this.c.a(com.dianping.nvtunnelkit.kit.r.b(this.d.a(secureProtocolData)));
            return true;
        } catch (Throwable th) {
            com.dianping.nvtunnelkit.logger.b.a(b, "writeSecure err.", th);
            return false;
        }
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell
    public final boolean isSocketConnected() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3826c42157d9d902e098f99b054c680", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3826c42157d9d902e098f99b054c680")).booleanValue() : this.c.k() && !this.c.l();
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell
    public final InetAddress getSecureSocketAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "050cda7f8afe1be00b60857c147affe5", 6917529027641081856L)) {
            return (InetAddress) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "050cda7f8afe1be00b60857c147affe5");
        }
        SocketAddress socketAddress = this.c.m;
        if (socketAddress instanceof InetSocketAddress) {
            return ((InetSocketAddress) socketAddress).getAddress();
        }
        return null;
    }
}
