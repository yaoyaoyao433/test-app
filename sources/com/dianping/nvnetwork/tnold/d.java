package com.dianping.nvnetwork.tnold;

import com.dianping.nvnetwork.tnold.a;
import com.dianping.nvnetwork.tnold.j;
import com.dianping.nvnetwork.tnold.l;
import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.dianping.nvnetwork.tunnel.tool.SecureTools;
import com.dianping.nvnetwork.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class d<C extends a> implements com.dianping.nvtunnelkit.codec.b<C, com.dianping.nvtunnelkit.kit.q, w> {
    public static ChangeQuickRedirect a;
    private static final String c = com.dianping.nvtunnelkit.logger.a.a("TNBaseUnpacker");
    protected final c<C> b;
    private final Map<C, j> d;

    public abstract w a(SecureProtocolData secureProtocolData, C c2);

    public void a(C c2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.codec.b
    public final /* synthetic */ void a(Object obj, int i, com.dianping.nvtunnelkit.kit.q qVar, List<w> list) throws Exception {
        int i2;
        j.a aVar;
        List<w> list2;
        boolean z;
        w a2;
        int i3 = i;
        List<w> list3 = list;
        a aVar2 = (a) obj;
        com.dianping.nvtunnelkit.kit.q qVar2 = qVar;
        char c2 = 0;
        Object[] objArr = {aVar2, Integer.valueOf(i), qVar2, list3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "336dbdedff9f3e31bc369fb01d2c9422", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "336dbdedff9f3e31bc369fb01d2c9422");
            return;
        }
        j jVar = this.d.get(aVar2);
        if (jVar == null) {
            return;
        }
        try {
            Object[] objArr2 = {qVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = j.a;
            if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "1a1eaf39626db4f4b115416b2d4d101e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "1a1eaf39626db4f4b115416b2d4d101e");
            } else {
                if (jVar.b.containsKey(Integer.valueOf(i))) {
                    aVar = jVar.b.get(Integer.valueOf(i));
                } else {
                    aVar = new j.a();
                    jVar.b.put(Integer.valueOf(i), aVar);
                }
                aVar.a(qVar2);
            }
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = j.a;
            List<i> list4 = PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "6039acbea8a38c76e0c553deb03989df", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "6039acbea8a38c76e0c553deb03989df") : jVar.b.get(Integer.valueOf(i)).b;
            if (!list4.isEmpty()) {
                for (i iVar : list4) {
                    try {
                        if (iVar.b == 0) {
                            aVar2.h();
                        } else {
                            if (iVar.b == 1) {
                                long nanoTime = System.nanoTime();
                                Object[] objArr4 = new Object[2];
                                objArr4[c2] = iVar;
                                objArr4[1] = aVar2;
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ce37b2af4860ca87aeb1c2058bbde1ef", 6917529027641081856L)) {
                                    a2 = (w) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ce37b2af4860ca87aeb1c2058bbde1ef");
                                } else {
                                    SecureProtocolData secureProtocolData = iVar.c;
                                    k kVar = this.b.d;
                                    long j = -System.nanoTime();
                                    Object[] objArr5 = {secureProtocolData};
                                    ChangeQuickRedirect changeQuickRedirect5 = k.a;
                                    if (PatchProxy.isSupport(objArr5, kVar, changeQuickRedirect5, false, "984c4eb54767fb6313184a3a00f764b1", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr5, kVar, changeQuickRedirect5, false, "984c4eb54767fb6313184a3a00f764b1");
                                    } else if (secureProtocolData != null && secureProtocolData.isSecure && secureProtocolData.payload != null) {
                                        JSONObject jSONObject = new JSONObject(secureProtocolData.payload);
                                        if (jSONObject.has("b") && jSONObject.has("t")) {
                                            String string = jSONObject.getString("b");
                                            String string2 = jSONObject.getString("t");
                                            if (!SecureTools.isEmpty(string) && !SecureTools.isEmpty(string2)) {
                                                String b2keyByB2 = kVar.c.getB2keyByB2(string2, string);
                                                if (!SecureTools.isEmpty(b2keyByB2)) {
                                                    secureProtocolData.array = kVar.c.decryptData(secureProtocolData.array, b2keyByB2);
                                                } else {
                                                    com.dianping.nvtunnelkit.logger.b.b(k.b, "process data packet, encrypt error.");
                                                    throw new com.dianping.nvtunnelkit.exception.a("b2key is empty.");
                                                }
                                            }
                                        }
                                    }
                                    long nanoTime2 = j + System.nanoTime();
                                    Object[] objArr6 = {secureProtocolData, aVar2};
                                    ChangeQuickRedirect changeQuickRedirect6 = k.a;
                                    if (PatchProxy.isSupport(objArr6, kVar, changeQuickRedirect6, false, "67c1b6befe6e2180553b406bdcee45b8", 6917529027641081856L)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(objArr6, kVar, changeQuickRedirect6, false, "67c1b6befe6e2180553b406bdcee45b8")).booleanValue();
                                    } else if (secureProtocolData == null || !SecureProtocol.DataPacketType.isSecureProtocol(secureProtocolData.flag)) {
                                        z = false;
                                    } else {
                                        String str = k.b;
                                        com.dianping.nvtunnelkit.logger.b.b(str, "handler key generate, flag: " + secureProtocolData.flag);
                                        secureProtocolData.encryptFlag = secureProtocolData.flag;
                                        kVar.a(secureProtocolData, aVar2);
                                        z = true;
                                    }
                                    if (z) {
                                        com.dianping.nvtunnelkit.logger.b.b(c, "Handle key generate");
                                        a2 = null;
                                    } else if (secureProtocolData.flag == 69) {
                                        a2 = b(secureProtocolData, aVar2);
                                    } else {
                                        a2 = a(secureProtocolData, aVar2);
                                        if (a2 != null) {
                                            a2.h = nanoTime2;
                                            a2.e = iVar.e;
                                        }
                                    }
                                }
                                if (a2 != null) {
                                    a2.f = nanoTime;
                                    list2 = list;
                                    list2.add(a2);
                                } else {
                                    list2 = list;
                                }
                            } else {
                                list2 = list3;
                            }
                            list3 = list2;
                            i3 = i;
                            c2 = 0;
                        }
                    } catch (Exception e) {
                        e = e;
                        i2 = i;
                        try {
                            if ((e instanceof com.dianping.nvtunnelkit.exception.b) || (e instanceof com.dianping.nvtunnelkit.exception.a)) {
                                this.b.d(aVar2);
                                if (e instanceof com.dianping.nvtunnelkit.exception.b) {
                                    String str2 = aVar2.q;
                                    com.dianping.nvtunnelkit.ext.d.a().pv4(0L, "tunnel_receive_data_size_overflow", 0, 2, 200, 0, (int) ((com.dianping.nvtunnelkit.exception.b) e).b, 0, str2, str2);
                                }
                            }
                            com.dianping.nvtunnelkit.logger.b.a(c, "unpack exception", e);
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            jVar.a(i2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = i;
                        jVar.a(i2);
                        throw th;
                    }
                }
                jVar.a(i3);
                return;
            }
            jVar.a(i3);
        } catch (Exception e2) {
            e = e2;
            i2 = i3;
        } catch (Throwable th3) {
            th = th3;
            i2 = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.codec.b
    public /* bridge */ /* synthetic */ void b(Object obj) {
        b((d<C>) ((a) obj));
    }

    public d(c<C> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd6936fd34f4184bc8824c747d88f61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd6936fd34f4184bc8824c747d88f61");
            return;
        }
        this.d = new ConcurrentHashMap();
        this.b = cVar;
    }

    private w b(SecureProtocolData secureProtocolData, C c2) {
        l.b a2;
        Object[] objArr = {secureProtocolData, c2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67ef0a9839c22915cf14c8c55de526f3", 6917529027641081856L)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67ef0a9839c22915cf14c8c55de526f3");
        }
        a((d<C>) c2);
        w wVar = new w();
        if (l.a(secureProtocolData.payload)) {
            com.dianping.nvtunnelkit.logger.b.b(c, "type 69 secureLoad is empty.");
            return null;
        }
        try {
            a2 = l.a(secureProtocolData.array);
        } catch (Exception e) {
            com.dianping.nvtunnelkit.logger.b.a(c, "type 69 handler error.", e);
        }
        if (l.a(a2.a)) {
            com.dianping.nvtunnelkit.logger.b.b(c, "type69 secureLoad is empty");
            return null;
        }
        JSONObject jSONObject = l.a(secureProtocolData.payload) ? null : new JSONObject(secureProtocolData.payload);
        if (jSONObject != null && jSONObject.has("i")) {
            wVar.a = jSONObject.getString("i");
        }
        JSONObject jSONObject2 = new JSONObject(a2.a);
        if (jSONObject2.has("s")) {
            int i = jSONObject2.getInt("s");
            secureProtocolData.encryptFlag = i;
            this.b.d.a(secureProtocolData, c2);
            if (i == SecureProtocol.DataPacketType.KEY_EXPIRED_RESPONSE.getType()) {
                wVar.b = -140;
            } else if (i == SecureProtocol.DataPacketType.TID_NOEXIST_RESPONSE.getType()) {
                wVar.b = -141;
            } else if (i == SecureProtocol.DataPacketType.KEY_NOEXIST_RESPONSE.getType()) {
                wVar.b = -142;
            } else if (i == SecureProtocol.DataPacketType.KEY_TIMEOUT_RESPONSE.getType()) {
                wVar.b = -143;
            }
        } else {
            wVar.b = -144;
        }
        return wVar;
    }

    public void b(C c2) {
        Object[] objArr = {c2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c88e0fc3ee0746dde6ebd90faedde79a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c88e0fc3ee0746dde6ebd90faedde79a");
        } else {
            this.d.put(c2, new j());
        }
    }

    @Override // com.dianping.nvtunnelkit.codec.b
    /* renamed from: c */
    public void a(C c2) {
        Object[] objArr = {c2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3240f31f4572883573804ab9d3aab280", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3240f31f4572883573804ab9d3aab280");
        } else {
            this.d.remove(c2);
        }
    }
}
