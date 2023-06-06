package com.sankuai.meituan.kernel.net.okhttp3;

import android.text.TextUtils;
import com.meituan.android.cipstorage.ah;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g implements ah, Interceptor {
    public static ChangeQuickRedirect a;
    private boolean b;
    private int c;
    private String d;
    private String e;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d2ec8b1676ef4988c5150823f70b22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d2ec8b1676ef4988c5150823f70b22");
            return;
        }
        this.c = -1;
        com.meituan.android.cipstorage.q a2 = com.sankuai.meituan.kernel.net.utils.d.a(com.sankuai.meituan.kernel.net.base.c.b);
        a2.a(this);
        b(x.a(a2), null, com.sankuai.meituan.kernel.net.base.c.b.getPackageName() + "_preferences");
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09b72c604c7034eb03cb1639eda5578b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09b72c604c7034eb03cb1639eda5578b");
        }
        Request request = chain.request();
        if (this.b) {
            HttpUrl url = request.url();
            HttpUrl.Builder host = url.newBuilder().host(this.d);
            if (this.c != -1) {
                host.port(this.c);
            }
            Request.Builder addHeader = request.newBuilder().url(host.build()).addHeader("MKOriginHost", url.host()).addHeader("MKScheme", url.scheme()).addHeader("MKTunnelType", "http").addHeader("MKAppID", "10");
            if (url.port() != HttpUrl.defaultPort(url.scheme())) {
                StringBuilder sb = new StringBuilder();
                sb.append(url.port());
                addHeader.addHeader("MKOriginPort", sb.toString());
            }
            String url2 = url.url().toString();
            if (url2.contains("report.meituan.com") || url2.contains("hreport.meituan.com") || url2.contains("lx0.meituan.com") || url2.contains("hlx.meituan.com")) {
                com.sankuai.meituan.kernel.net.base.b a2 = com.sankuai.meituan.kernel.net.base.c.a();
                String g = a2 == null ? "" : a2.g();
                if (!TextUtils.isEmpty(g)) {
                    addHeader.addHeader("mkunionid", g);
                }
            }
            request = addHeader.build();
        }
        return chain.proceed(request);
    }

    private void a(x xVar, com.meituan.android.cipstorage.q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7548448b2165f307a81244ed4165794d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7548448b2165f307a81244ed4165794d");
            return;
        }
        if (xVar != null) {
            this.d = xVar.b("dianping_mock_url", (String) null, str);
        } else if (qVar != null) {
            this.d = qVar.b("dianping_mock_url", (String) null);
        }
        this.c = -1;
        if (TextUtils.isEmpty(this.d)) {
            this.d = "appmock.sankuai.com";
            this.e = "https";
        } else {
            String[] split = this.d.split(CommonConstant.Symbol.COLON);
            if (split.length > 1) {
                try {
                    this.c = Integer.parseInt(split[split.length - 1]);
                } catch (Exception unused) {
                    this.c = -1;
                }
            }
            HttpUrl parse = HttpUrl.parse(this.d);
            this.e = "https";
            this.d = parse.host();
        }
        com.dianping.nvnetwork.d a2 = com.dianping.nvnetwork.d.a();
        a2.a(this.e + "://" + this.d);
    }

    private void b(x xVar, com.meituan.android.cipstorage.q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc9f5dada4ab89f009b347f16e20e800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc9f5dada4ab89f009b347f16e20e800");
            return;
        }
        if (xVar != null) {
            this.b = xVar.b("dianping_mock_enable", false, str);
        } else if (qVar != null) {
            this.b = qVar.b("dianping_mock_enable", false);
        }
        if (this.b) {
            a(xVar, qVar, str);
            com.dianping.nvnetwork.g.a(true);
        } else if (!com.sankuai.meituan.kernel.net.base.c.b()) {
            com.dianping.nvnetwork.g.a(false);
        }
        com.dianping.nvnetwork.d.a().a(this.b, false);
        if (this.b) {
            com.sankuai.meituan.kernel.net.utils.a.a(com.sankuai.meituan.kernel.net.base.c.b);
        } else {
            com.sankuai.meituan.kernel.net.utils.a.a();
        }
    }

    @Override // com.meituan.android.cipstorage.ah
    public final void a(String str, com.meituan.android.cipstorage.u uVar, String str2) {
        Object[] objArr = {str, uVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f39e719c44e1aa870cd7b6f78cc32cb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f39e719c44e1aa870cd7b6f78cc32cb2");
            return;
        }
        com.meituan.android.cipstorage.q a2 = com.meituan.android.cipstorage.q.a(com.sankuai.meituan.kernel.net.base.c.b, str);
        if ("dianping_mock_enable".equals(str2)) {
            b(null, a2, null);
        } else if ("dianping_mock_url".equals(str2)) {
            a((x) null, a2, (String) null);
        }
    }
}
