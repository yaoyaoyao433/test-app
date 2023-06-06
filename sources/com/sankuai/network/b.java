package com.sankuai.network;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.dataservice.mapi.e;
import com.dianping.dataservice.mapi.impl.DefaultMApiService;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.g;
import com.meituan.android.cipstorage.q;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetSocketAddress;
import java.net.Proxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b d;
    private static final String[] f = {"http://m.api.dianping.com/", "http://mapi.dianping.com/", "http://rs.api.dianping.com/", "http://app.t.dianping.com/", "http://mc.api.dianping.com/", "http://l.api.dianping.com/", "http://cf.api.dianping.com/", "http://api.p.dianping.com/", "http://waimai.api.dianping.com/", "http://hui.api.dianping.com/", "http://beauty.api.dianping.com/", "http://app.movie.dianping.com/", "http://mapi.meituan.com/"};
    public DefaultMApiService b;
    public a c;
    private Context e;
    private e g;

    public static b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aca8e0687a27267e52dcbaa52d1c1361", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aca8e0687a27267e52dcbaa52d1c1361");
        }
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b(context);
                }
            }
        }
        return d;
    }

    private b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "908dee020a4c89695edb4d0fcf8dbcb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "908dee020a4c89695edb4d0fcf8dbcb9");
            return;
        }
        this.g = null;
        this.c = new a();
        this.e = context.getApplicationContext();
    }

    public final DefaultMApiService a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5bd999ae5d1a7d7df436bb08c69f579", RobustBitConfig.DEFAULT_VALUE)) {
            return (DefaultMApiService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5bd999ae5d1a7d7df436bb08c69f579");
        }
        if (this.b == null) {
            this.b = new DefaultMApiService(this.e) { // from class: com.sankuai.network.b.1
                public static ChangeQuickRedirect a;

                private String a(String str, String str2, String str3) {
                    Object[] objArr2 = {str, str2, str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36eed5e334e4286a23f7f2477e5ab0e4", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36eed5e334e4286a23f7f2477e5ab0e4");
                    }
                    if (str.contains("appmock.dp")) {
                        return str3;
                    }
                    String str4 = (str.startsWith(AbsApiFactory.HTTP) ? "" : AbsApiFactory.HTTP) + str;
                    if (!str4.endsWith("/")) {
                        str4 = str4 + "/";
                    }
                    return str4 + str3.substring(str2.length());
                }

                @Override // com.dianping.dataservice.mapi.impl.DefaultMApiService
                public final Request transferRequest(Request request) {
                    Object[] objArr2 = {request};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c10c75a30f222a0d9b22c4593aaca20b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Request) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c10c75a30f222a0d9b22c4593aaca20b");
                    }
                    if (b.this.c != null) {
                        if (b.this.c.s) {
                            g.c(50);
                        } else {
                            g.c(0);
                        }
                        g.b((int) b.this.c.r);
                        q a2 = q.a(b.this.e, "dpplatform_mapidebugagent");
                        if (a2.b("tunnelDebug", false)) {
                            if (a2.b("tunnelEnabled", false)) {
                                g.a(2);
                            } else if (a2.b("wnsEnabled", false)) {
                                g.a(4);
                            } else if (!a2.b("httpDisabled", false)) {
                                g.a(3);
                            } else {
                                g.a(-1);
                            }
                        } else {
                            g.a(-1);
                        }
                        String str = request.d;
                        String a3 = (b.this.c.d == null || b.this.c.d.length() <= 0 || !str.startsWith(b.f[0])) ? str : a(b.this.c.d, b.f[0], str);
                        if (b.this.c.e != null && b.this.c.e.length() > 0 && str.startsWith(b.f[1])) {
                            a3 = a(b.this.c.e, b.f[1], str);
                        }
                        if (b.this.c.f != null && b.this.c.f.length() > 0 && str.startsWith(b.f[2])) {
                            a3 = a(b.this.c.f, b.f[2], str);
                        }
                        if (b.this.c.g != null && b.this.c.g.length() > 0 && str.startsWith(b.f[3])) {
                            a3 = a(b.this.c.g, b.f[3], str);
                        }
                        if (b.this.c.h != null && b.this.c.h.length() > 0 && str.startsWith(b.f[7])) {
                            a3 = a(b.this.c.h, b.f[7], str);
                        }
                        if (b.this.c.i != null && b.this.c.i.length() > 0 && str.startsWith(b.f[4])) {
                            a3 = a(b.this.c.i, b.f[4], str);
                        }
                        if (b.this.c.j != null && b.this.c.j.length() > 0 && str.startsWith(b.f[8])) {
                            a3 = a(b.this.c.j, b.f[8], str);
                        }
                        if (b.this.c.k != null && b.this.c.k.length() > 0 && str.startsWith(b.f[9])) {
                            a3 = a(b.this.c.k, b.f[9], str);
                        }
                        if (!TextUtils.isEmpty(b.this.c.l) && str.startsWith(b.f[10])) {
                            a3 = a(b.this.c.l, b.f[10], str);
                        }
                        if (b.this.c.m != null && b.this.c.m.length() > 0 && str.startsWith(b.f[5])) {
                            a3 = a(b.this.c.m, b.f[5], str);
                        }
                        if (b.this.c.n != null && b.this.c.n.length() > 0 && str.startsWith(b.f[6])) {
                            a3 = a(b.this.c.n, b.f[6], str);
                        }
                        if (b.this.c.o != null && b.this.c.o.length() > 0 && str.startsWith(b.f[11])) {
                            a3 = a(b.this.c.o, b.f[11], str);
                        }
                        if (b.this.c.q != null && b.this.c.q.length() > 0 && str.startsWith(b.f[12])) {
                            a3 = a(b.this.c.q, b.f[12], str);
                        }
                        String str2 = b.this.c.b;
                        int i = b.this.c.c;
                        return request.a().url(a3).proxy((TextUtils.isEmpty(str2) || i <= 0) ? null : new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str2, i))).build();
                    }
                    return super.transferRequest(request);
                }
            };
        }
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements com.sankuai.network.a {
        public static ChangeQuickRedirect a;
        public String b;
        public int c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;
        public long r;
        public boolean s;
        public int t;

        public a() {
        }

        @Override // com.sankuai.network.a
        public final String a() {
            return this.b;
        }

        @Override // com.sankuai.network.a
        public final int b() {
            return this.c;
        }

        @Override // com.sankuai.network.a
        public final String c() {
            return this.d;
        }

        @Override // com.sankuai.network.a
        public final void a(String str) {
            this.d = str;
        }

        @Override // com.sankuai.network.a
        public final String d() {
            return this.e;
        }

        @Override // com.sankuai.network.a
        public final void b(String str) {
            this.e = str;
        }

        @Override // com.sankuai.network.a
        public final long q() {
            return this.r;
        }

        @Override // com.sankuai.network.a
        public final void a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "192687aeedfb9454a895aa59280dadc1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "192687aeedfb9454a895aa59280dadc1");
            } else {
                this.r = j;
            }
        }

        @Override // com.sankuai.network.a
        public final boolean r() {
            return this.s;
        }

        @Override // com.sankuai.network.a
        public final void a(boolean z) {
            this.s = z;
        }

        @Override // com.sankuai.network.a
        public final void a(int i) {
            Object[] objArr = {10};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e079b4707939288af0b1705388277a13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e079b4707939288af0b1705388277a13");
            } else {
                this.t += 10;
            }
        }

        @Override // com.sankuai.network.a
        public final String e() {
            return this.f;
        }

        @Override // com.sankuai.network.a
        public final void c(String str) {
            this.f = str;
        }

        @Override // com.sankuai.network.a
        public final String f() {
            return this.g;
        }

        @Override // com.sankuai.network.a
        public final void d(String str) {
            this.g = str;
        }

        @Override // com.sankuai.network.a
        public final String g() {
            return this.h;
        }

        @Override // com.sankuai.network.a
        public final void e(String str) {
            this.h = str;
        }

        @Override // com.sankuai.network.a
        public final String h() {
            return this.o;
        }

        @Override // com.sankuai.network.a
        public final void f(String str) {
            this.o = str;
        }

        @Override // com.sankuai.network.a
        public final String i() {
            return this.i;
        }

        @Override // com.sankuai.network.a
        public final String o() {
            return this.p;
        }

        @Override // com.sankuai.network.a
        public final void m(String str) {
            this.p = str;
        }

        @Override // com.sankuai.network.a
        public final void g(String str) {
            this.i = str;
        }

        @Override // com.sankuai.network.a
        public final String j() {
            return this.j;
        }

        @Override // com.sankuai.network.a
        public final void h(String str) {
            this.j = str;
        }

        @Override // com.sankuai.network.a
        public final String k() {
            return this.k;
        }

        @Override // com.sankuai.network.a
        public final void i(String str) {
            this.k = str;
        }

        @Override // com.sankuai.network.a
        public final String l() {
            return this.l;
        }

        @Override // com.sankuai.network.a
        public final void j(String str) {
            this.l = str;
        }

        @Override // com.sankuai.network.a
        public final String m() {
            return this.m;
        }

        @Override // com.sankuai.network.a
        public final void k(String str) {
            this.m = str;
        }

        @Override // com.sankuai.network.a
        public final String n() {
            return this.n;
        }

        @Override // com.sankuai.network.a
        public final void l(String str) {
            this.n = str;
        }

        @Override // com.sankuai.network.a
        public final void n(String str) {
            this.q = str;
        }

        @Override // com.sankuai.network.a
        public final String p() {
            return this.q;
        }
    }
}
