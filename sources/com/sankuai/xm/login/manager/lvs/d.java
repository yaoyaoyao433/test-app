package com.sankuai.xm.login.manager.lvs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.sankuai.xm.base.i;
import com.sankuai.xm.base.proto.protosingal.n;
import com.sankuai.xm.base.proto.protosingal.o;
import com.sankuai.xm.base.proto.protosingal.p;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;
    i b;
    final c c;
    final int d;

    public d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57beb5030fe61cc96d0a41d278ca3000", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57beb5030fe61cc96d0a41d278ca3000");
            return;
        }
        this.c = cVar;
        this.d = cVar.b;
    }

    public final List<com.sankuai.xm.base.proto.protosingal.a> a(String str) {
        InetAddress[] inetAddressArr;
        boolean find;
        char c = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1509038096d073f67600f6dffb0c1608", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1509038096d073f67600f6dffb0c1608");
        }
        if (ac.a(str)) {
            return com.sankuai.xm.network.setting.f.a().b().a();
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inetAddressArr = InetAddress.getAllByName(str);
        } catch (UnknownHostException e) {
            com.sankuai.xm.login.d.a(e, "LVSController::getFallbackAddress => exception.", new Object[0]);
            inetAddressArr = null;
        }
        if (inetAddressArr == null || inetAddressArr.length == 0) {
            com.sankuai.xm.login.d.d("LVSController::getFallbackAddress => host error.", new Object[0]);
            i.a(System.currentTimeMillis() - currentTimeMillis, (short) 1);
            return com.sankuai.xm.network.setting.f.a().b().a();
        }
        ArrayList arrayList = new ArrayList();
        int length = inetAddressArr.length;
        int i = 0;
        while (i < length) {
            InetAddress inetAddress = inetAddressArr[i];
            if (inetAddress instanceof Inet6Address) {
                Object[] objArr2 = new Object[1];
                objArr2[c] = inetAddress.getHostAddress();
                com.sankuai.xm.login.d.b("LVSController::getFallbackAddress filter ipv6 address:%s", objArr2);
            } else {
                com.sankuai.xm.base.proto.protosingal.a aVar = new com.sankuai.xm.base.proto.protosingal.a();
                int c2 = c(inetAddress.getHostAddress());
                if (c2 != -1) {
                    String hostAddress = inetAddress.getHostAddress();
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = hostAddress;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "1a3c2db51e317d4812c2512095ae85b0", 6917529027641081856L)) {
                        find = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "1a3c2db51e317d4812c2512095ae85b0")).booleanValue();
                    } else {
                        find = com.sankuai.xm.network.setting.f.a().b().e() != com.sankuai.xm.network.setting.e.ENV_RELEASE ? false : Pattern.compile("((192\\.168|172\\.([1][6-9]|[2]\\d|3[01]))(\\.([2][0-4]\\d|[2][5][0-5]|[01]?\\d?\\d)){2}|^(\\D)*10(\\.([2][0-4]\\d|[2][5][0-5]|[01]?\\d?\\d)){3})").matcher(hostAddress).find();
                    }
                    if (!find) {
                        aVar.b = c2;
                        com.sankuai.xm.network.setting.f.a().b();
                        aVar.c = (short) 80;
                        arrayList.add(aVar);
                    }
                }
                com.sankuai.xm.login.d.d("LVSController::getFallbackAddress => invalid ip = " + inetAddress.getHostAddress(), new Object[0]);
            }
            i++;
            c = 0;
        }
        if (arrayList.isEmpty()) {
            com.sankuai.xm.login.d.d("LVSController::getFallbackAddress => no valid ip . list.size = " + inetAddressArr.length, new Object[0]);
            i.a(System.currentTimeMillis() - currentTimeMillis, (short) 2);
        } else {
            i.a(System.currentTimeMillis() - currentTimeMillis, (short) 0);
        }
        return arrayList.isEmpty() ? com.sankuai.xm.network.setting.f.a().b().a() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b(String str) {
        InetAddress[] inetAddressArr;
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f6d76335046576d5c97c9880a4d718a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f6d76335046576d5c97c9880a4d718a");
        }
        try {
            inetAddressArr = InetAddress.getAllByName(str);
        } catch (UnknownHostException e) {
            com.sankuai.xm.login.d.a(e, "LVSController::getLVSAddressSafe => exception.", new Object[0]);
            inetAddressArr = null;
        }
        if (inetAddressArr == null || inetAddressArr.length == 0) {
            return null;
        }
        int random = ((int) (Math.random() * 100.0d)) % inetAddressArr.length;
        if (random >= inetAddressArr.length) {
            random = 0;
        }
        if (inetAddressArr[random] instanceof Inet6Address) {
            while (true) {
                if (i >= inetAddressArr.length) {
                    break;
                } else if (inetAddressArr[i] instanceof Inet4Address) {
                    random = i;
                    break;
                } else {
                    i++;
                }
            }
        }
        return inetAddressArr[random].getHostAddress();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.sankuai.xm.base.proto.protosingal.a> a(String str, short s) {
        Object[] objArr = {str, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291379b8d56170eef96f94cd7b5c5018", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291379b8d56170eef96f94cd7b5c5018");
        }
        try {
        } catch (Exception e) {
            this.b.b = -1;
            this.b.c = -3;
            this.b.d = e.getMessage();
            com.sankuai.xm.login.d.a(e, "LVSController::doTCP:: exception.", new Object[0]);
        }
        if (ac.a(str)) {
            this.b.c = -4;
            this.b.b = -1;
            return null;
        }
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(str, s), 5000);
        socket.setSoTimeout(5000);
        o oVar = new o();
        oVar.c(com.sankuai.xm.login.a.a().d);
        oVar.b = 6;
        m.a();
        oVar.d = (short) 1;
        oVar.c = com.sankuai.xm.login.a.a().b;
        oVar.e = m.a().i();
        oVar.f = "";
        oVar.g = (short) 1;
        m.a();
        oVar.h = (short) 1;
        oVar.i = m.a().h();
        oVar.j = m.a().c();
        oVar.q = this.d == 1;
        byte[] bS_ = oVar.bS_();
        byte[] bArr = new byte[1024];
        com.sankuai.xm.login.d.b("LVSController::doTCP send lvs proto, ip=%s,port=%s", str, Short.valueOf(s));
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(bS_, 0, bS_.length);
        outputStream.flush();
        socket.getInputStream().read(bArr);
        com.sankuai.xm.login.d.b("LVSController::doTCP recv lvs proto, ip=%s,port=%s", str, Short.valueOf(s));
        p pVar = new p();
        pVar.a(bArr);
        socket.close();
        if (pVar.b == 0) {
            ArrayList<com.sankuai.xm.base.proto.protosingal.a> arrayList = oVar.q ? pVar.e : pVar.c;
            if (com.sankuai.xm.base.util.b.a((Collection<?>) arrayList)) {
                this.b.b = -1;
                this.b.c = -4;
                this.b.d = "server return empty list";
            } else {
                this.b.b = 0;
                this.b.c = 0;
            }
            return arrayList;
        }
        this.b.b = -1;
        this.b.c = -2;
        this.b.d = String.valueOf(pVar.b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;
        List<com.sankuai.xm.base.proto.protosingal.a> b;

        private a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82dac727253738da2f4a436cf9fa4067", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82dac727253738da2f4a436cf9fa4067");
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "700bcf7831523002f1bb0e594e62db78", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "700bcf7831523002f1bb0e594e62db78");
                return;
            }
            this.b = new ArrayList();
            JSONArray f = new com.sankuai.xm.base.util.net.c(jSONObject).a("data").f(APKStructure.Res_Type);
            if (f != null && f.length() > 0) {
                for (int i = 0; i < f.length(); i++) {
                    byte[] a2 = m.a().a(f.getString(i));
                    n nVar = new n();
                    nVar.a(a2);
                    com.sankuai.xm.base.proto.protosingal.a aVar = new com.sankuai.xm.base.proto.protosingal.a();
                    aVar.b = nVar.b;
                    aVar.c = nVar.c;
                    aVar.d = nVar.f;
                    aVar.e = nVar.g ? 1 : 0;
                    this.b.add(aVar);
                }
            }
            if (this.b.isEmpty()) {
                d.this.b.e = -7;
                d.this.b.b = -1;
                d.this.b.f = "server return empty list";
                return;
            }
            d.this.b.e = 0;
            d.this.b.b = 0;
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c93d1a52b95763b17ac0c5b8f0ac3bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c93d1a52b95763b17ac0c5b8f0ac3bd");
                return;
            }
            d.this.b.e = -5;
            i iVar = d.this.b;
            iVar.f = str + "---" + i;
            d.this.b.b = -1;
        }
    }

    private int c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b221f5bf01f531c0bb07747c60bb93", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b221f5bf01f531c0bb07747c60bb93")).intValue();
        }
        try {
            String[] split = str.split("\\.");
            int i = 0;
            for (int i2 = 0; i2 < split.length; i2++) {
                i += (Integer.parseInt(split[i2]) & 255) << (i2 * 8);
            }
            return i;
        } catch (Exception unused) {
            return -1;
        }
    }
}
