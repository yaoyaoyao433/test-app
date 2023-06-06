package com.dianping.nvnetwork.tunnel2;

import android.text.TextUtils;
import com.dianping.nvnetwork.mol.RPCTask;
import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.dianping.nvnetwork.tunnel.tool.SecureTools;
import com.dianping.nvnetwork.tunnel2.a;
import com.dianping.nvnetwork.tunnel2.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h extends com.dianping.nvnetwork.tunnel2.a {
    public static ChangeQuickRedirect f;
    AtomicInteger g;
    public double h;
    a i;
    AtomicInteger j;
    private e k;
    private int l;
    private String m;
    private AtomicInteger n;
    private a.c o;
    private a.c p;
    private int q;
    private com.dianping.nvnetwork.debug.c r;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i);

        void a(Throwable th);
    }

    public h(e eVar, SocketAddress socketAddress) {
        super(socketAddress);
        Object[] objArr = {eVar, socketAddress};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ae514fe1fd1c429559223ea259a06fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ae514fe1fd1c429559223ea259a06fb");
            return;
        }
        this.l = -1;
        this.g = new AtomicInteger(0);
        this.i = null;
        this.j = new AtomicInteger(0);
        this.k = eVar;
        this.m = com.dianping.nvnetwork.tunnel.e.a();
        this.n = new AtomicInteger(0);
        this.o = new a.c(10);
        this.p = new a.c(10);
    }

    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee2ca9507a2c20a6d11a2d55fb83030f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee2ca9507a2c20a6d11a2d55fb83030f");
        } else {
            this.g.set(0);
        }
    }

    @Override // com.dianping.nvnetwork.tunnel2.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6bae4b0376b85ab1aa000d1591b6f32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6bae4b0376b85ab1aa000d1591b6f32");
            return;
        }
        super.b();
        if (this.l == -1) {
            this.l = -152;
        }
        this.k.a(this, this.l);
        if (n()) {
            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_REMOVED, r());
        }
    }

    @Override // com.dianping.nvnetwork.tunnel2.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c11505ab6b50d50841002581806e1d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c11505ab6b50d50841002581806e1d6");
            return;
        }
        super.h();
        this.n.set(0);
        this.o.a();
        this.p.a();
        com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_ADDED, r());
    }

    @Override // com.dianping.nvnetwork.tunnel2.a
    public final void a(SecureProtocolData secureProtocolData, long j) throws Exception {
        Object[] objArr = {secureProtocolData, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ac2e3bf8da57c330061cface6cc8032", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ac2e3bf8da57c330061cface6cc8032");
            return;
        }
        super.a(secureProtocolData, j);
        if (secureProtocolData.flag != 2) {
            if (secureProtocolData.flag == 3) {
                this.l = -160;
                throw new Exception("tunnel server register fail");
            } else if (secureProtocolData.flag == 6) {
                this.l = -167;
                throw new Exception("tunnel server has been full");
            } else if (secureProtocolData.flag != 83) {
                if (secureProtocolData.flag == 103) {
                    if (secureProtocolData.array != null) {
                        Object[] objArr2 = {secureProtocolData, new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect2 = f;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b09f132b36e8db1a232e5dfa982c43e", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b09f132b36e8db1a232e5dfa982c43e");
                            return;
                        }
                        com.dianping.nvnetwork.tunnel.d dVar = new com.dianping.nvnetwork.tunnel.d();
                        try {
                            SecureTools.ParseData parseData = SecureTools.parseData(secureProtocolData.zip, secureProtocolData.array);
                            JSONObject jSONObject = new JSONObject(parseData.secureLoad);
                            dVar.a = jSONObject.getString("i");
                            dVar.b = jSONObject.getInt(com.huawei.hms.opendevice.c.a);
                            dVar.c = jSONObject.optJSONObject("h");
                            dVar.d = parseData.rsp;
                            secureProtocolData.encryptFlag = jSONObject.optInt("s", -1);
                            a(dVar, j);
                            if (SecureProtocol.DataPacketType.isSecureException(secureProtocolData.encryptFlag)) {
                                this.b.handlerSecureProtocol(this, secureProtocolData);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            if (dVar.a != null) {
                                dVar.b = -148;
                                a(dVar, j);
                            }
                        }
                    }
                } else if (secureProtocolData.flag != 70) {
                    com.dianping.nvnetwork.util.g.a("unsupported tunnel type " + secureProtocolData.flag);
                } else if (com.dianping.nvnetwork.h.h().x) {
                    Object[] objArr3 = {secureProtocolData, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = f;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2438e31d44991a69f9ad2d15c888cfc5", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2438e31d44991a69f9ad2d15c888cfc5");
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(new String(secureProtocolData.array));
                        int optInt = jSONObject2.optInt("s", 0);
                        String optString = jSONObject2.optString("i", null);
                        this.k.a(this, optInt, optString);
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        if (optInt < 0) {
                            com.dianping.nvnetwork.tunnel.d dVar2 = new com.dianping.nvnetwork.tunnel.d();
                            dVar2.a = optString;
                            dVar2.b = -162;
                            a(dVar2, j);
                        }
                        e.b c = this.k.c(optString);
                        if (c != null) {
                            this.o.a((int) (this.k.d() - c.e));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // com.dianping.nvnetwork.tunnel2.a
    public final void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad3f4239a1f6be2c874bbcfd0baee98d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad3f4239a1f6be2c874bbcfd0baee98d");
        } else {
            this.k.a(runnable, j);
        }
    }

    @Override // com.dianping.nvnetwork.tunnel2.a
    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2617fc5a7a28d6c0ef2636e19e0a5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2617fc5a7a28d6c0ef2636e19e0a5f");
        } else {
            this.k.a(runnable);
        }
    }

    public final void a(com.dianping.nvnetwork.tunnel.c cVar) throws Exception {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "983dfe048be0b635e4ff685f9e6748f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "983dfe048be0b635e4ff685f9e6748f3");
        } else if (!n()) {
            throw new Exception("this connection have not yet start work.");
        } else {
            if (!this.b.isEncrypted() && g()) {
                this.b.init();
            }
            if (cVar.g && !this.b.isEncrypted()) {
                com.dianping.nvnetwork.tunnel.d dVar = new com.dianping.nvnetwork.tunnel.d();
                dVar.a = cVar.a;
                dVar.b = -146;
                a(dVar, System.nanoTime());
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("m", cVar.b);
            jSONObject.put("h", cVar.d == null ? new JSONObject() : cVar.d);
            jSONObject.put("u", cVar.c);
            jSONObject.put("i", cVar.a);
            if (cVar.e > 0) {
                jSONObject.put("t", cVar.e);
            }
            String jSONObject2 = jSONObject.toString();
            SecureProtocolData secureProtocolData = new SecureProtocolData();
            secureProtocolData.flag = SecureProtocol.DataPacketType.HTTP_REQUEST.getType();
            secureProtocolData.securePayload = jSONObject2.getBytes();
            secureProtocolData.isSecure = g();
            secureProtocolData.id = cVar.a;
            secureProtocolData.source = cVar.f;
            secureProtocolData.zip = cVar.i;
            secureProtocolData.macFlag = cVar.h;
            com.dianping.nvnetwork.c.a(cVar.a).b();
            RPCTask.startReq(cVar.j, com.dianping.nvnetwork.g.f().b());
            a(secureProtocolData);
            RPCTask.write(cVar.j);
            com.dianping.nvnetwork.c.a(cVar.a).d();
            this.n.incrementAndGet();
            e.b c = this.k.c(cVar.a);
            if (c != null) {
                c.g = jSONObject2.length() + (cVar.f != null ? cVar.f.length : 0);
            }
            this.q++;
            com.dianping.nvnetwork.c.a(cVar.a).a(m());
        }
    }

    private void a(com.dianping.nvnetwork.tunnel.d dVar, long j) {
        e.b c;
        Object[] objArr = {dVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfe21e726c38b857f19baf576a83b13a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfe21e726c38b857f19baf576a83b13a");
            return;
        }
        com.dianping.nvnetwork.c.a(dVar.a).a(j);
        this.n.decrementAndGet();
        if (!TextUtils.isEmpty(dVar.a) && (c = this.k.c(dVar.a)) != null && dVar.b > 0 && dVar.d != null) {
            this.p.a((int) ((c.g + (dVar.d.length + (dVar.c != null ? dVar.c.toString().length() : 0))) / (this.k.d() - c.e)));
        }
        this.k.a(dVar);
    }

    @Override // com.dianping.nvnetwork.tunnel2.a
    public final void a(JSONObject jSONObject, JSONObject jSONObject2, long j) throws Exception {
        Object[] objArr = {jSONObject, jSONObject2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca4665e0d9205e764fbf484ddafe66cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca4665e0d9205e764fbf484ddafe66cd");
            return;
        }
        com.dianping.nvnetwork.tunnel.d dVar = new com.dianping.nvnetwork.tunnel.d();
        if (jSONObject2 != null && jSONObject2.has("i")) {
            dVar.a = jSONObject2.getString("i");
        }
        if (jSONObject.has("s")) {
            int i = jSONObject.getInt("s");
            if (i == SecureProtocol.DataPacketType.KEY_EXPIRED_RESPONSE.getType()) {
                dVar.b = -140;
            } else if (i == SecureProtocol.DataPacketType.TID_NOEXIST_RESPONSE.getType()) {
                dVar.b = -141;
            } else if (i == SecureProtocol.DataPacketType.KEY_NOEXIST_RESPONSE.getType()) {
                dVar.b = -142;
            } else if (i == SecureProtocol.DataPacketType.KEY_TIMEOUT_RESPONSE.getType()) {
                dVar.b = -143;
            }
            if (TextUtils.isEmpty(dVar.a)) {
                return;
            }
            a(dVar, j);
            return;
        }
        dVar.b = -144;
        a(dVar, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e331df5e66c239babc05fdf0e063ba9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e331df5e66c239babc05fdf0e063ba9b");
        } else if (this.i == null) {
        } else {
            com.dianping.nvnetwork.util.g.a("SmartRouting", "ping with subject : " + this.c + ", " + this.j.get());
            if (this.j.get() == 0) {
                this.i.a(i());
                this.i = null;
                return;
            }
            try {
                d();
            } catch (IOException e) {
                e.printStackTrace();
                this.j.set(0);
                if (this.i != null) {
                    this.i.a(e);
                }
                this.i = null;
            }
        }
    }

    @Override // com.dianping.nvnetwork.tunnel2.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a662309934357680adfd3352b2214e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a662309934357680adfd3352b2214e6");
            return;
        }
        super.f();
        if (this.j.get() > 0) {
            this.j.decrementAndGet();
            p();
        }
        if (n()) {
            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_INFO_CHANGE, r());
        }
    }

    public final double q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ee33cd318898378deb5ab43316253b", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ee33cd318898378deb5ab43316253b")).doubleValue();
        }
        int[] iArr = com.dianping.nvnetwork.h.h().L;
        this.h = (((iArr[0] * Math.atan(u())) - (iArr[1] * Math.atan(j() < 0 ? 1.0d : j()))) - (iArr[2] * Math.atan(t()))) - (iArr[3] * Math.atan(s()));
        com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_INFO_CHANGE, r());
        return this.h;
    }

    private int s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb82a4ffe629e1b37041d6a61f8ade65", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb82a4ffe629e1b37041d6a61f8ade65")).intValue() : this.n.get();
    }

    private int t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9734a22c4b7f533a5389f1e1c4106d9d", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9734a22c4b7f533a5389f1e1c4106d9d")).intValue() : this.o.b();
    }

    private int u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed8e16be0e54b872c0389fe4a09022a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed8e16be0e54b872c0389fe4a09022a")).intValue() : this.p.b();
    }

    public final com.dianping.nvnetwork.debug.c r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a503ce7640ef6f86a9f4fec7aef968e2", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.debug.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a503ce7640ef6f86a9f4fec7aef968e2");
        }
        if (this.r == null) {
            this.r = new com.dianping.nvnetwork.debug.c();
            this.r.a = this.m;
            this.r.b = m();
        }
        this.r.e = i();
        this.r.d = t();
        this.r.c = s();
        this.r.f = u();
        this.r.g = this.h;
        this.r.h = this.q;
        return this.r;
    }
}
