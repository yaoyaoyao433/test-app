package com.tencent.mapsdk.internal;

import android.net.Uri;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.http.HttpProxy;
import com.tencent.map.tools.net.http.HttpProxyRule;
import com.tencent.map.tools.net.processor.RequestProcessor;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class lq implements RequestProcessor {
    private final List<HttpProxyRule> a;
    private final boolean b = false;

    private lq(List<HttpProxyRule> list) {
        this.a = list;
    }

    private static lq b(List<HttpProxyRule> list) {
        return a(list);
    }

    public static lq a(List<HttpProxyRule> list) {
        return new lq(list);
    }

    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public final void onRequest(NetRequest netRequest) {
        HttpProxy httpProxy;
        String str = netRequest.url;
        boolean z = this.b;
        if (this.a != null && !this.a.isEmpty()) {
            String str2 = str;
            boolean z2 = false;
            for (int i = 0; i < this.a.size(); i++) {
                HttpProxyRule httpProxyRule = this.a.get(i);
                if (httpProxyRule.match(str)) {
                    str2 = httpProxyRule.replaceHost(str);
                    z2 = true;
                }
            }
            if (z2) {
                Uri parse = Uri.parse(str2);
                String host = parse.getHost();
                int port = parse.getPort();
                if (port < 0 || port > 65535) {
                    port = "https".equals(parse.getScheme()) ? 443 : 80;
                }
                httpProxy = new HttpProxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port)), str2, z);
                netRequest.proxy = httpProxy;
            }
        }
        httpProxy = null;
        netRequest.proxy = httpProxy;
    }

    private HttpProxy a(String str, boolean z) {
        if (this.a != null && !this.a.isEmpty()) {
            String str2 = str;
            boolean z2 = false;
            for (int i = 0; i < this.a.size(); i++) {
                HttpProxyRule httpProxyRule = this.a.get(i);
                if (httpProxyRule.match(str)) {
                    str2 = httpProxyRule.replaceHost(str);
                    z2 = true;
                }
            }
            if (z2) {
                Uri parse = Uri.parse(str2);
                String host = parse.getHost();
                int port = parse.getPort();
                if (port < 0 || port > 65535) {
                    port = "https".equals(parse.getScheme()) ? 443 : 80;
                }
                return new HttpProxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port)), str2, z);
            }
        }
        return null;
    }
}
