package com.dianping.nvnetwork.tnold;

import com.dianping.nvnetwork.tnold.a;
import com.dianping.nvnetwork.tnold.l;
import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.dianping.nvnetwork.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q<C extends a> extends d<C> {
    public static ChangeQuickRedirect c;
    private static final String d = com.dianping.nvtunnelkit.logger.a.a("TNTunnelUnpacker");
    private final Map<C, h> e;
    private final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvnetwork.tnold.d, com.dianping.nvtunnelkit.codec.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        b((q<C>) ((a) obj));
    }

    public q(m<C> mVar) {
        super(mVar);
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6713d16229fd9ce738ed17e778f13bf3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6713d16229fd9ce738ed17e778f13bf3");
            return;
        }
        this.e = new ConcurrentHashMap();
        this.f = ((c) mVar).c.c;
    }

    @Override // com.dianping.nvnetwork.tnold.d
    public final void b(C c2) {
        Object[] objArr = {c2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d94743a9dbae819af115954a9fa95d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d94743a9dbae819af115954a9fa95d");
            return;
        }
        super.b((q<C>) c2);
        this.e.put(c2, new h((m) this.b));
    }

    @Override // com.dianping.nvnetwork.tnold.d, com.dianping.nvtunnelkit.codec.b
    /* renamed from: c */
    public final void a(C c2) {
        Object[] objArr = {c2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff3aedd0b7998197c5b348106713931d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff3aedd0b7998197c5b348106713931d");
            return;
        }
        super.a(c2);
        this.e.remove(c2);
    }

    @Override // com.dianping.nvnetwork.tnold.d
    public final w a(SecureProtocolData secureProtocolData, C c2) {
        Object[] objArr = {secureProtocolData, c2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92a3d455b3bdbc4fa3d182a494302413", 6917529027641081856L)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92a3d455b3bdbc4fa3d182a494302413");
        }
        if (secureProtocolData.flag == 70) {
            return b(secureProtocolData, c2);
        }
        if (secureProtocolData.flag == SecureProtocol.DataPacketType.HTTP_RESPONSE.getType()) {
            return c(secureProtocolData, c2);
        }
        return null;
    }

    private w b(SecureProtocolData secureProtocolData, C c2) {
        Object[] objArr = {secureProtocolData, c2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "472f94c06bd62d6682bbd615fac6542d", 6917529027641081856L)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "472f94c06bd62d6682bbd615fac6542d");
        }
        w wVar = new w();
        try {
            wVar.i = true;
            JSONObject jSONObject = new JSONObject(new String(secureProtocolData.array));
            String optString = jSONObject.optString("i", null);
            int optInt = jSONObject.optInt("s", 0);
            wVar.j = optInt;
            wVar.a = optString;
            wVar.b = optInt > 0 ? 9999 : -162;
            if (optInt < 0) {
                new com.dianping.monitor.impl.m(287, NVLinker.getContext()).a("code", String.valueOf(optInt)).a("SHARK_ACK_REPORT", new ArrayList(Collections.nCopies(1, Float.valueOf(1.0f)))).a();
            }
        } catch (Throwable th) {
            com.dianping.nvtunnelkit.logger.b.a(d, "handler ack data err.", th);
        }
        return wVar;
    }

    @Override // com.dianping.nvnetwork.tnold.d
    public final void a(C c2) {
        Object[] objArr = {c2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "442cdb46d00507063b4c83e5048c6723", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "442cdb46d00507063b4c83e5048c6723");
            return;
        }
        h hVar = this.e.get(c2);
        if (hVar != null) {
            hVar.a(null);
        }
    }

    private w c(SecureProtocolData secureProtocolData, C c2) {
        w wVar;
        Object[] objArr = {secureProtocolData, c2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b9bdac75f6ce8ccaddd843f7bb3c1db", 6917529027641081856L)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b9bdac75f6ce8ccaddd843f7bb3c1db");
        }
        h hVar = this.e.get(c2);
        try {
            long j = -System.nanoTime();
            l.b a = l.a(secureProtocolData.zip, this.f, secureProtocolData.array, hVar);
            Object[] objArr2 = {a, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d11df9682c28b639043267929cdb2cbf", 6917529027641081856L)) {
                wVar = (w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d11df9682c28b639043267929cdb2cbf");
            } else if (a == null) {
                wVar = null;
            } else {
                w wVar2 = new w();
                wVar2.d = a.b;
                wVar2.k = a.a;
                JSONObject jSONObject = new JSONObject(a.a);
                wVar2.a = jSONObject.getString("i");
                wVar2.b = jSONObject.getInt(com.huawei.hms.opendevice.c.a);
                wVar2.c = jSONObject.optJSONObject("h");
                wVar = wVar2;
            }
            wVar.g = j + System.nanoTime();
            return wVar;
        } catch (Exception e) {
            if (e instanceof com.dianping.nvnetwork.tnold.zip.hpack.e) {
                Object[] objArr3 = {hVar, e};
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4c1508de0774fcd0b347549333424d05", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4c1508de0774fcd0b347549333424d05");
                } else if (hVar != null) {
                    hVar.a(e);
                }
            }
            com.dianping.nvtunnelkit.logger.b.a(d, "handler http data err.", e);
            w wVar3 = new w();
            wVar3.b = -148;
            return wVar3;
        }
    }
}
