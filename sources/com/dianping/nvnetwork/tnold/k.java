package com.dianping.nvnetwork.tnold;

import android.content.Context;
import com.dianping.nvnetwork.tnold.c;
import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    public static ChangeQuickRedirect a;
    static final String b = com.dianping.nvtunnelkit.logger.a.a("TNSecureManagerHelper");
    final SocketSecureManager c;
    final Map<a, SocketSecureCell> d;
    private final com.dianping.nvtunnelkit.kit.o e;
    private final c.a f;

    public k(com.dianping.nvtunnelkit.kit.o oVar, Context context, c.a aVar) {
        Object[] objArr = {oVar, context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d541f9a1a80f7d41744bbc3cc7b1af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d541f9a1a80f7d41744bbc3cc7b1af");
            return;
        }
        String str = oVar.t_().b;
        if (com.dianping.nvtunnelkit.utils.f.a(str)) {
            throw new IllegalArgumentException("tunnelName can not be null.");
        }
        this.d = new ConcurrentHashMap();
        this.c = SocketSecureManager.newInstance(str);
        this.c.enableSignB2key(true);
        if (oVar.t_().j) {
            this.c.setCacheSecureInfo(new com.dianping.nvnetwork.tnold.secure.b(context, str));
        }
        this.e = oVar;
        this.f = aVar;
        if (this.f != null) {
            this.f.a(this);
        }
    }

    public final void a(SocketSecureManager.OnSocketSecureManagerEventLisenter onSocketSecureManagerEventLisenter) {
        Object[] objArr = {onSocketSecureManagerEventLisenter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "840fa21ab271a346de36fedadb49660e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "840fa21ab271a346de36fedadb49660e");
        } else {
            this.c.addOnSocketSecureManagerEventLisenter(onSocketSecureManagerEventLisenter);
        }
    }

    public final ByteBuffer a(SecureProtocolData secureProtocolData) {
        Object[] objArr = {secureProtocolData};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35dfafc4520453168b77b0e459f4788", 6917529027641081856L) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35dfafc4520453168b77b0e459f4788") : l.a(secureProtocolData, this.c);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25d98e9fee068b379ff30471c164c2c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25d98e9fee068b379ff30471c164c2c")).booleanValue() : this.c.isEncrypted();
    }

    public final void a(SecureProtocolData secureProtocolData, a aVar) {
        SocketSecureCell socketSecureCell;
        Object[] objArr = {secureProtocolData, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ba996922c1366396f8316d6e793ce8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ba996922c1366396f8316d6e793ce8");
        } else if (secureProtocolData == null || (socketSecureCell = this.d.get(aVar)) == null) {
        } else {
            this.c.handlerSecureProtocol(socketSecureCell, secureProtocolData);
        }
    }
}
