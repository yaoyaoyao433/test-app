package com.sankuai.meituan.kernel.net.httpDns;

import android.content.Context;
import com.meituan.android.httpdns.b;
import com.meituan.android.httpdns.d;
import com.meituan.android.httpdns.i;
import com.meituan.android.httpdns.j;
import com.meituan.android.httpdns.r;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.util.RequestContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.base.c;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"HttpDns"};

    public static OkHttpClient.Builder a(OkHttpClient.Builder builder, Context context) {
        Object[] objArr = {builder, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58547af8f5513406a07e4a49523f428a", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient.Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58547af8f5513406a07e4a49523f428a");
        }
        i.a(c.a().h());
        b bVar = new b(null) { // from class: com.sankuai.meituan.kernel.net.httpDns.a.1
            public static ChangeQuickRedirect b;

            {
                super(null);
            }

            @Override // com.meituan.android.httpdns.b, com.meituan.android.httpdns.c
            public final synchronized boolean a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2d628364337c26661b0b18f39380a8c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2d628364337c26661b0b18f39380a8c")).booleanValue();
                }
                return super.a(str);
            }
        };
        j.a aVar = new j.a();
        aVar.d = bVar;
        aVar.b = new r() { // from class: com.sankuai.meituan.kernel.net.httpDns.a.2
            public static ChangeQuickRedirect b;

            @Override // com.meituan.android.httpdns.r
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6081d6e4186c6922ba7a2d0c4e3bdde", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6081d6e4186c6922ba7a2d0c4e3bdde");
                } else {
                    com.dianping.networklog.c.a(str, 2, a.b);
                }
            }
        };
        final j a2 = aVar.a(context);
        builder.dns(new Dns() { // from class: com.sankuai.meituan.kernel.net.httpDns.a.3
            public static ChangeQuickRedirect a;

            @Override // okhttp3.Dns
            public final List<InetAddress> lookup(String str) throws UnknownHostException {
                Map<String, Object> data;
                Map<String, Object> data2;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5dc1c8868785c2a24698053802bfd57a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5dc1c8868785c2a24698053802bfd57a");
                }
                try {
                    List<InetAddress> b2 = j.this.b(str);
                    RequestContext requestContext = RequestContext.get();
                    d a3 = d.a();
                    if (requestContext != null && a3 != null && (data2 = requestContext.getData()) != null) {
                        data2.put(NetLogConstants.Details.DNS_EVENT, a3.e());
                    }
                    return b2;
                } catch (Throwable th) {
                    RequestContext requestContext2 = RequestContext.get();
                    d a4 = d.a();
                    if (requestContext2 != null && a4 != null && (data = requestContext2.getData()) != null) {
                        data.put(NetLogConstants.Details.DNS_EVENT, a4.e());
                    }
                    throw th;
                }
            }
        });
        return builder;
    }
}
