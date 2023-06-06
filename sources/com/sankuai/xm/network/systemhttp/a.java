package com.sankuai.xm.network.systemhttp;

import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.m;
import com.sankuai.xm.network.http.f;
import com.sankuai.xm.network.http.g;
import com.sankuai.xm.network.http.h;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends com.sankuai.xm.network.http.a implements com.sankuai.xm.network.http.b {
    public static ChangeQuickRedirect e;
    private HttpURLConnection f;

    @Override // com.sankuai.xm.network.http.b
    public final com.sankuai.xm.network.http.b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd9cf1ec05973ea9525a3b8cec2b119d", 6917529027641081856L)) {
            return (com.sankuai.xm.network.http.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd9cf1ec05973ea9525a3b8cec2b119d");
        }
        this.c.c = str;
        return this;
    }

    @Override // com.sankuai.xm.network.http.b
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dababc7e402e4e5cc33cc8e19205f333", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dababc7e402e4e5cc33cc8e19205f333");
        } else {
            this.c.e = str;
        }
    }

    @Override // com.sankuai.xm.network.http.b
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bc92a6ca0252c8486e3ec502ee165dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bc92a6ca0252c8486e3ec502ee165dd");
            return;
        }
        g gVar = this.c;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "02caf80ae4b58ee8c89cb496729eb4ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "02caf80ae4b58ee8c89cb496729eb4ca");
        } else {
            gVar.b.put(str, str2);
        }
    }

    @Override // com.sankuai.xm.network.http.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f6959f06654a6b2229437acd5ed3758", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f6959f06654a6b2229437acd5ed3758");
        } else {
            this.c.g = i;
        }
    }

    @Override // com.sankuai.xm.network.http.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a60b83ef2f174348cc4876aad38cd817", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a60b83ef2f174348cc4876aad38cd817");
        } else {
            this.c.f = i;
        }
    }

    @Override // com.sankuai.xm.network.http.b
    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c018b5bb2850c4b3e6089a05d7cbcf3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c018b5bb2850c4b3e6089a05d7cbcf3");
        } else {
            this.c.h = true;
        }
    }

    @Override // com.sankuai.xm.network.http.b
    public final void c(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d102bb3224b032a8c28b3a9218374f3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d102bb3224b032a8c28b3a9218374f3f");
        } else {
            this.c.j = 0;
        }
    }

    @Override // com.sankuai.xm.network.http.b
    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee224931ccb2ca249c83575dc14db2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee224931ccb2ca249c83575dc14db2a");
        } else {
            this.c.d = fVar;
        }
    }

    @Override // com.sankuai.xm.network.http.b
    public final URL a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cdc2258bf3dd1103ef6b3f7ee82b8c2", 6917529027641081856L)) {
            return (URL) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cdc2258bf3dd1103ef6b3f7ee82b8c2");
        }
        try {
            new URL(this.c.c);
            return null;
        } catch (Exception e2) {
            com.sankuai.xm.log.a.a(e2, "SysHttpConnection", new Object[0]);
            return null;
        }
    }

    @Override // com.sankuai.xm.network.http.b
    public final Map<String, List<String>> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f6dfc0ea4a157190fc6be8d7bed3f3", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f6dfc0ea4a157190fc6be8d7bed3f3");
        }
        HashMap hashMap = new HashMap();
        for (String str : this.c.b.keySet()) {
            hashMap.put(str, com.sankuai.xm.base.util.b.a(this.c.b.get(str)));
        }
        return hashMap;
    }

    @Override // com.sankuai.xm.network.http.b
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0d3d7e8fa5f8a800ea2af4db54f424", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0d3d7e8fa5f8a800ea2af4db54f424")).intValue();
        }
        try {
        } catch (Exception e2) {
            com.sankuai.xm.log.a.a(e2, "SysHttpConnection", new Object[0]);
        }
        if (this.d == null) {
            super.cc_();
            if (this.d != null) {
                if (this.d.b == -1 && (this.d.f instanceof Exception)) {
                    this.d.b = com.sankuai.xm.monitor.cat.a.a((Exception) this.d.f);
                }
                return this.d.b;
            }
            return -1;
        }
        return this.d.b;
    }

    @Override // com.sankuai.xm.network.http.b
    public final InputStream e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2378e29a2589bddd048fa9514b52ee8", 6917529027641081856L)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2378e29a2589bddd048fa9514b52ee8");
        }
        if (this.d == null) {
            com.sankuai.xm.log.a.b("SysHttpConnection::getInputStream param error!");
            return null;
        }
        return this.d.d;
    }

    @Override // com.sankuai.xm.network.http.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "651ccf5ada03dd44c24fa38631066f8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "651ccf5ada03dd44c24fa38631066f8c");
            return;
        }
        try {
            if (this.f == null) {
                com.sankuai.xm.log.a.b("SysHttpConnection::disconnect param error!");
            } else {
                this.f.disconnect();
            }
        } catch (Exception e2) {
            com.sankuai.xm.log.a.a(e2, "SysHttpConnection", new Object[0]);
        }
    }

    @Override // com.sankuai.xm.network.http.b
    public final Map<String, List<String>> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8abc015b8267195ddfe7a9debbe859", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8abc015b8267195ddfe7a9debbe859");
        }
        if (this.d == null || this.d.c == null) {
            com.sankuai.xm.log.a.b("SysHttpConnection::getHeaderFields param error!");
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : this.d.c.keySet()) {
            hashMap.put(str, com.sankuai.xm.base.util.b.a(this.d.c.get(str)));
        }
        return hashMap;
    }

    @Override // com.sankuai.xm.network.http.b
    public final String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d9ffe5a3e8f0be7259c05ad8da25159", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d9ffe5a3e8f0be7259c05ad8da25159");
        }
        if (this.d == null) {
            com.sankuai.xm.log.a.b("SysHttpConnection::getHeaderField param error!");
            return "";
        }
        h hVar = this.d;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        return PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "a509072e39e6be76aeb2a28f0f60a8ae", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "a509072e39e6be76aeb2a28f0f60a8ae") : hVar.c.get(str);
    }

    @Override // com.sankuai.xm.network.http.b
    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb0f70a801b08b5c7913885fab2a2fa", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb0f70a801b08b5c7913885fab2a2fa")).intValue();
        }
        if (this.d == null) {
            com.sankuai.xm.log.a.b("SysHttpConnection::getContentLength param error!");
            return -1;
        }
        return this.d.e;
    }

    @Override // com.sankuai.xm.network.http.b
    public final Throwable i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "179d4a009a88eb3ef730c66160b062e3", 6917529027641081856L)) {
            return (Throwable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "179d4a009a88eb3ef730c66160b062e3");
        }
        if (this.d == null) {
            return null;
        }
        return this.d.f;
    }

    @Override // com.sankuai.xm.network.http.a
    public final h b() {
        InputStream errorStream;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed6bc5eb6a5a39435c115839300bbe7", 6917529027641081856L)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed6bc5eb6a5a39435c115839300bbe7");
        }
        OutputStream outputStream = null;
        try {
            this.f = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(this.c.c).openConnection());
            this.f.setReadTimeout(this.c.f);
            this.f.setConnectTimeout(this.c.g);
            this.f.setRequestMethod(this.c.e);
            for (String str : this.c.b.keySet()) {
                this.f.setRequestProperty(str, this.c.b.get(str));
            }
            this.f.setChunkedStreamingMode(this.c.j);
            this.f.setDoInput(this.c.i);
            this.f.setDoOutput(this.c.h);
            if (!ac.a(this.c.e, "GET") && this.f.getOutputStream() != null && this.c.d != null) {
                OutputStream outputStream2 = this.f.getOutputStream();
                try {
                    this.c.d.a(outputStream2);
                    outputStream = outputStream2;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    try {
                        com.sankuai.xm.log.a.a(th, "SysHttpConnection", new Object[0]);
                        h hVar = new h();
                        hVar.f = th;
                        return hVar;
                    } finally {
                        m.a(outputStream);
                    }
                }
            }
            int responseCode = this.f.getResponseCode();
            h hVar2 = new h();
            hVar2.b = responseCode;
            if (responseCode < 200 || responseCode > 300) {
                com.sankuai.xm.log.a.d("SysHttpConnection::proceedInner request fail:%s code=%d", this.c, Integer.valueOf(responseCode));
            }
            if (this.f.getResponseCode() < 400) {
                errorStream = this.f.getInputStream();
            } else {
                errorStream = this.f.getErrorStream();
                if (errorStream == null) {
                    errorStream = this.f.getInputStream();
                }
            }
            hVar2.d = errorStream;
            hVar2.e = this.f.getContentLength();
            Map<String, List<String>> headerFields = this.f.getHeaderFields();
            HashMap hashMap = new HashMap();
            for (String str2 : headerFields.keySet()) {
                StringBuilder sb = new StringBuilder();
                for (String str3 : headerFields.get(str2)) {
                    sb.append(str3);
                }
                hashMap.put(str2, sb.toString());
            }
            hVar2.c = hashMap;
            return hVar2;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
