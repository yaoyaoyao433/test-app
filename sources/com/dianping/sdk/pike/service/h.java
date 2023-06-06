package com.dianping.sdk.pike.service;

import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.dianping.nvnetwork.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h extends com.dianping.nvnetwork.tnold.b<d> {
    public static ChangeQuickRedirect b;

    @Override // com.dianping.nvtunnelkit.codec.a
    public final /* synthetic */ com.dianping.nvbinarytunnel.b a(Object obj, v vVar) throws Exception {
        v vVar2 = vVar;
        Object[] objArr = {(d) obj, vVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e6988d215c1930c5c671b54373a086", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.nvbinarytunnel.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e6988d215c1930c5c671b54373a086");
        }
        SecureProtocolData secureProtocolData = new SecureProtocolData();
        secureProtocolData.flag = (vVar2.n ? SecureProtocol.DataPacketType.PIKE_BINARY_UP : SecureProtocol.DataPacketType.PIKE_UP).getType();
        secureProtocolData.isSecure = true;
        secureProtocolData.zip = -1;
        secureProtocolData.source = vVar2.e;
        return com.dianping.nvbinarytunnel.b.a(this.a.d.a(secureProtocolData));
    }

    @Override // com.dianping.nvtunnelkit.codec.a
    public final /* synthetic */ void a(Object obj) {
        Object[] objArr = {(d) obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd273b1d978737ea3688e24411149f66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd273b1d978737ea3688e24411149f66");
        }
    }

    @Override // com.dianping.nvtunnelkit.codec.a
    public final /* synthetic */ void b(Object obj) {
        Object[] objArr = {(d) obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db2f1a7e1cfb0768d2a25f86f2b21df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db2f1a7e1cfb0768d2a25f86f2b21df");
        }
    }

    public h(n nVar) {
        super(nVar);
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13401f90dacedca4d85c0aba362a071f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13401f90dacedca4d85c0aba362a071f");
        }
    }
}
