package com.dianping.nvnetwork.shark;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.shark.e;
import com.dianping.nvnetwork.w;
import com.dianping.nvnetwork.x;
import com.dianping.nvnetwork.z;
import com.dianping.nvtunnelkit.conn.a;
import com.dianping.nvtunnelkit.exception.i;
import com.dianping.nvtunnelkit.exception.j;
import com.dianping.nvtunnelkit.exception.k;
import com.dianping.nvtunnelkit.exception.l;
import com.dianping.nvtunnelkit.exception.m;
import com.dianping.nvtunnelkit.kit.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public static final String b = com.dianping.nvtunnelkit.logger.a.a("SharkUtils");

    private static boolean a(String str) {
        StringBuilder sb;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72d95b0d88839fddfb6d1efedc1f15f7", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72d95b0d88839fddfb6d1efedc1f15f7")).booleanValue();
        }
        Set<String> set = com.dianping.nvnetwork.h.h().j;
        if (com.dianping.nvtunnelkit.utils.a.b(set)) {
            return false;
        }
        if (set.contains("*")) {
            return true;
        }
        try {
            URL url = new URL(str);
            sb = new StringBuilder();
            sb.append(url.getHost());
            sb.append(url.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return set.contains(sb.toString());
    }

    private static byte[] a(InputStream inputStream, String str) {
        Object[] objArr = {inputStream, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "669f2afe2a3804275cfc5979eb50fc6f", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "669f2afe2a3804275cfc5979eb50fc6f");
        }
        if (inputStream == null) {
            return null;
        }
        try {
            if (inputStream.markSupported()) {
                inputStream.mark(0);
            }
            int available = inputStream.available();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(available > 0 ? available : 4096);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            if (inputStream.markSupported()) {
                inputStream.reset();
            }
            if (byteArrayOutputStream.size() != available || available == 0) {
                com.dianping.networklog.c.a("TransferBody available = " + available + ", bSize = " + byteArrayOutputStream.size() + ", url=" + str, 4);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    public static q a(com.dianping.nvtunnelkit.exception.d dVar, Request request) {
        q a2;
        Object[] objArr = {dVar, request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5c6f3ce755cb1f16c1a98e88271ed7f", 6917529027641081856L)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5c6f3ce755cb1f16c1a98e88271ed7f");
        }
        if (dVar instanceof k) {
            a2 = a(-153, "wait secure timeout");
        } else if (dVar instanceof j) {
            a2 = a(-146, "tunnel no secure");
        } else if (dVar instanceof i) {
            a2 = a(-150, "send tunnel closed");
        } else if (dVar instanceof m) {
            a2 = a(-152, "sending tunnel closed");
        } else if (dVar instanceof l) {
            a2 = a(-157, "wait connection");
        } else if (dVar instanceof com.dianping.nvtunnelkit.exception.g) {
            a2 = a(-150, "send no connected");
        } else if (dVar instanceof com.dianping.nvtunnelkit.exception.e) {
            a2 = a(-154, "send fail");
        } else if (dVar instanceof com.dianping.nvtunnelkit.exception.f) {
            a2 = a(-155, "send queue full");
        } else if (dVar instanceof com.dianping.nvtunnelkit.exception.h) {
            a2 = a(-151, "send timeout");
        } else {
            a2 = a(-170, "inner err. msg:{ " + dVar.getMessage() + CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        }
        if (com.dianping.nvnetwork.h.h().af) {
            com.dianping.monitor.e d = com.dianping.nvnetwork.g.d();
            String str = request != null ? request.d : "";
            if (d != null) {
                d.pv4(0L, "shark_tunnel_kit_send_err", 0, 2, a2.statusCode(), 0, 0, 0, "", str);
            }
        }
        return a2;
    }

    public static q a(x xVar) {
        HashMap<String, String> hashMap;
        q build;
        int i = 1;
        Object[] objArr = {xVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3c45bf3038ff04e68879eeb7e090ce7", 6917529027641081856L)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3c45bf3038ff04e68879eeb7e090ce7");
        }
        if (xVar == null) {
            return a(-150, "session is null.");
        }
        if (xVar.f == null) {
            q.a aVar = new q.a();
            aVar.c = -150;
            aVar.j = StringUtil.NULL;
            build = aVar.build();
        } else {
            w wVar = xVar.f;
            Object[] objArr2 = {wVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "34350bc587dc08a97649cd5bfd37723d", 6917529027641081856L)) {
                build = (q) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "34350bc587dc08a97649cd5bfd37723d");
            } else {
                if (wVar.c != null) {
                    hashMap = new HashMap<>();
                    Iterator<String> keys = wVar.c.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, wVar.c.optString(next));
                    }
                } else {
                    hashMap = null;
                }
                q.a aVar2 = new q.a();
                aVar2.c = wVar.b;
                aVar2.b = wVar.d;
                aVar2.e = hashMap;
                aVar2.j = wVar.b <= 0 ? "error" : null;
                aVar2.i = wVar.b > 0;
                build = aVar2.build();
            }
        }
        if (xVar.f != null && xVar.f.b > 0 && xVar.f.d != null && xVar.f.d.length > com.dianping.nvnetwork.h.h().y && com.dianping.nvnetwork.g.d() != null) {
            com.dianping.nvnetwork.g.d().pv4(0L, "tunnel_big_response", 0, 2, 200, 0, xVar.f.d.length, (int) (com.dianping.nvtunnelkit.utils.g.a() - xVar.c), null, xVar.e.i);
            build = build;
            i = 1;
        }
        build.b = i;
        build.d = xVar.j;
        build.k = xVar.a();
        return build;
    }

    private static q a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2794b584d384ceb433a4332c807d82ef", 6917529027641081856L)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2794b584d384ceb433a4332c807d82ef");
        }
        q.a aVar = new q.a();
        aVar.c = i;
        aVar.j = str;
        return aVar.build();
    }

    public static v a(e.c cVar) {
        int i;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a5831b1fd93adb7c97bcb3f1cf7f032", 6917529027641081856L)) {
            return (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a5831b1fd93adb7c97bcb3f1cf7f032");
        }
        a.C0105a c0105a = new a.C0105a();
        long j = com.dianping.nvnetwork.h.h().aG;
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = a.C0105a.a;
        if (PatchProxy.isSupport(objArr2, c0105a, changeQuickRedirect2, false, "26bf4a5abcfb15b0592595b7358f02e9", RobustBitConfig.DEFAULT_VALUE)) {
            c0105a = (a.C0105a) PatchProxy.accessDispatch(objArr2, c0105a, changeQuickRedirect2, false, "26bf4a5abcfb15b0592595b7358f02e9");
        } else {
            c0105a.e = j;
        }
        c0105a.f = com.dianping.nvnetwork.h.h().aH;
        a.C0105a b2 = c0105a.b(com.dianping.nvnetwork.h.h().M);
        b2.i = com.dianping.nvnetwork.h.h().ad;
        b2.j = com.dianping.nvnetwork.h.h().D;
        long f = com.dianping.nvnetwork.h.h().f();
        Object[] objArr3 = {new Long(f)};
        ChangeQuickRedirect changeQuickRedirect3 = a.C0105a.a;
        if (PatchProxy.isSupport(objArr3, b2, changeQuickRedirect3, false, "e87ccffd97a64775b429193bc5d83f51", RobustBitConfig.DEFAULT_VALUE)) {
            b2 = (a.C0105a) PatchProxy.accessDispatch(objArr3, b2, changeQuickRedirect3, false, "e87ccffd97a64775b429193bc5d83f51");
        } else {
            b2.m = f;
        }
        a.C0105a d = b2.d(com.dianping.nvnetwork.h.h().e());
        d.n = com.dianping.nvnetwork.h.h().L;
        d.r = com.dianping.nvnetwork.h.h().as;
        d.s = com.dianping.nvnetwork.h.h().au;
        d.t = com.dianping.nvnetwork.h.h().av;
        d.u = com.dianping.nvnetwork.h.h().aw;
        d.v = com.dianping.nvnetwork.h.h().ax;
        com.dianping.nvtunnelkit.conn.a a2 = d.a();
        com.dianping.nvtunnelkit.ext.i iVar = new com.dianping.nvtunnelkit.ext.i();
        iVar.a = com.dianping.nvnetwork.h.h().V;
        iVar.b = com.dianping.nvnetwork.h.h().aa;
        iVar.c = com.dianping.nvnetwork.h.h().W;
        iVar.e = com.dianping.nvnetwork.h.h().Z;
        iVar.g = com.dianping.nvnetwork.h.h().X;
        iVar.h = com.dianping.nvnetwork.h.h().Y;
        iVar.i = com.dianping.nvnetwork.h.h().ab;
        iVar.k = com.dianping.nvnetwork.h.h().E;
        v vVar = new v();
        vVar.b = cVar.e;
        vVar.i = com.dianping.nvnetwork.h.h().u;
        vVar.j = !com.dianping.nvnetwork.h.h().R;
        if (cVar == e.c.QUIC) {
            i = com.dianping.nvnetwork.h.h().I;
        } else {
            i = com.dianping.nvnetwork.h.h().H;
        }
        vVar.e = i;
        vVar.l = com.dianping.nvnetwork.h.h().J;
        vVar.f = !com.dianping.nvnetwork.h.h().K;
        vVar.o = com.dianping.nvnetwork.h.h().x;
        vVar.w = a2;
        vVar.n = com.dianping.nvnetwork.h.h().U;
        vVar.m = com.dianping.nvnetwork.h.h().F;
        v b3 = vVar.a(com.dianping.nvnetwork.h.h().v).b(com.dianping.nvnetwork.h.h().w);
        b3.v = iVar;
        b3.q = com.dianping.nvnetwork.h.h().ar;
        b3.t = com.dianping.nvnetwork.h.h().aE;
        b3.u = com.dianping.nvnetwork.h.h().aF;
        b3.r = com.dianping.nvnetwork.h.h().at;
        return b3;
    }

    public static List<SocketAddress> a(List<com.dianping.nvlbservice.h> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db961a9a44bfc6cc024d71518a9a93d0", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db961a9a44bfc6cc024d71518a9a93d0");
        }
        if (h.b) {
            return h.b();
        }
        ArrayList arrayList = new ArrayList();
        if (com.dianping.nvnetwork.g.p() && com.dianping.nvtunnelkit.utils.f.b(com.dianping.nvnetwork.g.m()) && com.dianping.nvnetwork.g.n() > 0) {
            arrayList.add(new InetSocketAddress(com.dianping.nvnetwork.g.m(), com.dianping.nvnetwork.g.n()));
            return arrayList;
        }
        if (list != null) {
            for (com.dianping.nvlbservice.h hVar : list) {
                if (hVar != null) {
                    arrayList.add(hVar.b);
                }
            }
        }
        return arrayList;
    }

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e914d88f1ef993badaab0d74c23e782f", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e914d88f1ef993badaab0d74c23e782f")).longValue() : z.a();
    }

    public static com.dianping.nvnetwork.v a(Request request) {
        int c;
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ab91a87e307895f24b130c5604c4a04", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ab91a87e307895f24b130c5604c4a04");
        }
        InputStream inputStream = request.i;
        com.dianping.nvnetwork.v vVar = new com.dianping.nvnetwork.v();
        vVar.c = request.b();
        vVar.h = request.f;
        vVar.i = request.d;
        vVar.a = (byte) request.b;
        if (com.dianping.nvnetwork.g.p()) {
            request.a("MKTunnelType", "tcp");
        }
        vVar.d = request.g;
        vVar.e = a(inputStream, vVar.i);
        if (vVar.e != null && vVar.e.length > com.dianping.nvnetwork.h.h().y && com.dianping.nvnetwork.g.d() != null) {
            com.dianping.nvnetwork.g.d().pv4(0L, "tunnel_big_request", com.dianping.nvnetwork.g.f().b(), 2, 400, vVar.e.length, 0, 0, null, vVar.i);
        }
        vVar.j = a(vVar.i);
        vVar.l = true;
        vVar.m = com.dianping.nvnetwork.h.h().aq;
        vVar.g = true;
        Object[] objArr2 = {request};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "021c450a7edb1a0bffa4e0093f46f694", 6917529027641081856L)) {
            c = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "021c450a7edb1a0bffa4e0093f46f694")).intValue();
        } else if (request.h <= 0) {
            c = com.dianping.nvnetwork.h.h().c();
        } else {
            c = request.h;
        }
        vVar.k = c;
        return vVar;
    }
}
