package com.dianping.sdk.pike.service;

import com.dianping.nvnetwork.tnold.l;
import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.dianping.nvnetwork.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p extends com.dianping.nvnetwork.tnold.d<d> {
    public static ChangeQuickRedirect c;

    public p(n nVar) {
        super(nVar);
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e8376bb1e7e1781fb54c6cf4215c92e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e8376bb1e7e1781fb54c6cf4215c92e");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.dianping.nvnetwork.tnold.d
    public w a(SecureProtocolData secureProtocolData, d dVar) {
        Object[] objArr = {secureProtocolData, dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75da821751d95fa2c6bb0ac43ef98789", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75da821751d95fa2c6bb0ac43ef98789");
        }
        com.dianping.sdk.pike.i.a("PikeUnpacker", "Decoder: pike data, flag: ", String.valueOf(secureProtocolData.flag));
        try {
        } catch (Exception e) {
            com.dianping.sdk.pike.i.a("PikeUnpacker", "Handle protocol error, flag = " + secureProtocolData.flag, e);
        }
        if (secureProtocolData.flag != 70) {
            if (secureProtocolData.flag == SecureProtocol.DataPacketType.PIKE_DOWN.getType()) {
                return a(com.dianping.nvnetwork.tnold.l.a(secureProtocolData.array), false);
            }
            if (secureProtocolData.flag == SecureProtocol.DataPacketType.PIKE_BINARY_DOWN.getType()) {
                return a(com.dianping.nvnetwork.tnold.l.a(secureProtocolData.array), true);
            }
            return null;
        }
        Object[] objArr2 = {secureProtocolData, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0a5a828653c420f9970966514cf2d89", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0a5a828653c420f9970966514cf2d89");
        }
        int optInt = new JSONObject(new String(secureProtocolData.array)).optInt("s", 0);
        if (optInt < 0) {
            com.dianping.nvtunnelkit.logger.b.b("PikeUnpacker", "Pike server error status:" + optInt);
            dVar.t();
        }
        return null;
    }

    private w a(l.b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5426f4783d7bc1051d3f16b9b48bd532", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5426f4783d7bc1051d3f16b9b48bd532");
        }
        if (bVar != null) {
            w wVar = new w();
            if (z) {
                wVar.d = bVar.b;
            } else {
                wVar.k = bVar.a;
            }
            return wVar;
        }
        return null;
    }
}
